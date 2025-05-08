package com.tnl.vop.sales.service.api.service;

import com.tnl.vop.sales.service.generated.model.v1.CreditBandRequest;
import com.tnl.vop.sales.service.generated.model.v1.InterestRateResponse;

public interface InterestRateService {
  com.tnl.vop.sales.service.generated.model.v1.InterestRateResponse getRate(com.tnl.vop.sales.service.generated.model.v1.CreditBandRequest request);
}