package com.suger.api;

import com.suger.api.core.Environment;
import com.suger.api.resources.api.ApiClient;
import com.suger.api.resources.buyer.BuyerClient;
import com.suger.api.resources.entitlement.EntitlementClient;
import com.suger.api.resources.entitlementterm.EntitlementTermClient;
import com.suger.api.resources.integration.IntegrationClient;
import com.suger.api.resources.metering.MeteringClient;
import com.suger.api.resources.offer.OfferClient;
import com.suger.api.resources.operation.OperationClient;
import com.suger.api.resources.product.ProductClient;
import com.suger.api.resources.report.ReportClient;
import java.lang.String;

public interface SugerApiClient {
  BuyerClient buyer();

  EntitlementClient entitlement();

  OfferClient offer();

  EntitlementTermClient entitlementTerm();

  MeteringClient metering();

  IntegrationClient integration();

  OperationClient operation();

  ProductClient product();

  ReportClient report();

  ApiClient api();

  static Builder builder() {
    return new SugerApiClientImpl.Builder();
  }

  interface Builder {
    Builder apiKey(String apiKey);

    Builder environment(Environment environment);

    Builder url(String url);

    SugerApiClient build();
  }
}
