package com.tnl.vop.sales.service.api.service.impl;


import com.tnl.vop.sales.service.api.service.InterestRateService;
import com.tnl.vop.sales.service.generated.model.v1.CreditBandRequest;
import com.tnl.vop.sales.service.generated.model.v1.InterestRateResponse;
import org.springframework.stereotype.Service;

@Service
public class InterestRateServiceImpl implements InterestRateService {

  @Override
  public InterestRateResponse getRate(CreditBandRequest request) {
    // TODO: Replace with real business logic or DB lookup
    InterestRateResponse response = new InterestRateResponse();
    response.setCreditBand(request.getCreditBand());
    response.setRate(calculateRateForBand(request.getCreditBand()));
    return response;
  }

  private double calculateRateForBand(String creditBand) {
    return switch (creditBand.toUpperCase()) {
      case "A" -> 5.5;
      case "B" -> 6.5;
      case "C" -> 7.5;
      default -> 8.0;
    };
  }
}