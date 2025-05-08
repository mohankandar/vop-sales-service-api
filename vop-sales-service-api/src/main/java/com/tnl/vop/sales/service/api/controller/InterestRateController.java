package com.tnl.vop.sales.service.api.controller;

import com.tnl.vop.framework.swagger.SwaggerResponseMessages;
import com.tnl.vop.sales.service.api.service.InterestRateService;
import com.tnl.vop.sales.service.generated.api.DefaultApi;
import com.tnl.vop.sales.service.generated.model.v1.CreditBandRequest;
import com.tnl.vop.sales.service.generated.model.v1.InterestRateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class InterestRateController implements DefaultApi, SwaggerResponseMessages {

  private final InterestRateService interestRateService;

  @Autowired
  public InterestRateController(InterestRateService interestRateService) {
    this.interestRateService = interestRateService;
  }

  @Override
  public ResponseEntity<InterestRateResponse> getRate(@Valid CreditBandRequest request) {
    return ResponseEntity.ok(interestRateService.getRate(request));
  }
}