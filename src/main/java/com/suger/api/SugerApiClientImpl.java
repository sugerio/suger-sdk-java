package com.suger.api;

import com.suger.api.core.ClientOptions;
import com.suger.api.core.Environment;
import com.suger.api.core.Suppliers;
import com.suger.api.resources.api.ApiClient;
import com.suger.api.resources.api.ApiClientImpl;
import com.suger.api.resources.buyer.BuyerClient;
import com.suger.api.resources.buyer.BuyerClientImpl;
import com.suger.api.resources.entitlement.EntitlementClient;
import com.suger.api.resources.entitlement.EntitlementClientImpl;
import com.suger.api.resources.entitlementterm.EntitlementTermClient;
import com.suger.api.resources.entitlementterm.EntitlementTermClientImpl;
import com.suger.api.resources.integration.IntegrationClient;
import com.suger.api.resources.integration.IntegrationClientImpl;
import com.suger.api.resources.metering.MeteringClient;
import com.suger.api.resources.metering.MeteringClientImpl;
import com.suger.api.resources.offer.OfferClient;
import com.suger.api.resources.offer.OfferClientImpl;
import com.suger.api.resources.operation.OperationClient;
import com.suger.api.resources.operation.OperationClientImpl;
import com.suger.api.resources.product.ProductClient;
import com.suger.api.resources.product.ProductClientImpl;
import com.suger.api.resources.report.ReportClient;
import com.suger.api.resources.report.ReportClientImpl;
import java.lang.Override;
import java.lang.String;
import java.util.function.Supplier;

public final class SugerApiClientImpl implements SugerApiClient {
  private final ClientOptions clientOptions;

  private final Supplier<BuyerClient> buyerClient;

  private final Supplier<EntitlementClient> entitlementClient;

  private final Supplier<OfferClient> offerClient;

  private final Supplier<EntitlementTermClient> entitlementTermClient;

  private final Supplier<MeteringClient> meteringClient;

  private final Supplier<IntegrationClient> integrationClient;

  private final Supplier<OperationClient> operationClient;

  private final Supplier<ProductClient> productClient;

  private final Supplier<ReportClient> reportClient;

  private final Supplier<ApiClient> apiClient;

  public SugerApiClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
    this.buyerClient = Suppliers.memoize(() -> new BuyerClientImpl(clientOptions));
    this.entitlementClient = Suppliers.memoize(() -> new EntitlementClientImpl(clientOptions));
    this.offerClient = Suppliers.memoize(() -> new OfferClientImpl(clientOptions));
    this.entitlementTermClient = Suppliers.memoize(() -> new EntitlementTermClientImpl(clientOptions));
    this.meteringClient = Suppliers.memoize(() -> new MeteringClientImpl(clientOptions));
    this.integrationClient = Suppliers.memoize(() -> new IntegrationClientImpl(clientOptions));
    this.operationClient = Suppliers.memoize(() -> new OperationClientImpl(clientOptions));
    this.productClient = Suppliers.memoize(() -> new ProductClientImpl(clientOptions));
    this.reportClient = Suppliers.memoize(() -> new ReportClientImpl(clientOptions));
    this.apiClient = Suppliers.memoize(() -> new ApiClientImpl(clientOptions));
  }

  @Override
  public BuyerClient buyer() {
    return this.buyerClient.get();
  }

  @Override
  public EntitlementClient entitlement() {
    return this.entitlementClient.get();
  }

  @Override
  public OfferClient offer() {
    return this.offerClient.get();
  }

  @Override
  public EntitlementTermClient entitlementTerm() {
    return this.entitlementTermClient.get();
  }

  @Override
  public MeteringClient metering() {
    return this.meteringClient.get();
  }

  @Override
  public IntegrationClient integration() {
    return this.integrationClient.get();
  }

  @Override
  public OperationClient operation() {
    return this.operationClient.get();
  }

  @Override
  public ProductClient product() {
    return this.productClient.get();
  }

  @Override
  public ReportClient report() {
    return this.reportClient.get();
  }

  @Override
  public ApiClient api() {
    return this.apiClient.get();
  }

  public static final class Builder implements SugerApiClient.Builder {
    ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

    Environment environment = Environment.DEFAULT;

    @Override
    public SugerApiClient.Builder apiKey(String apiKey) {
      this.clientOptionsBuilder.addHeader("Authorization", apiKey);
      return this;
    }

    @Override
    public SugerApiClient.Builder environment(Environment environment) {
      this.environment = environment;
      return this;
    }

    @Override
    public SugerApiClient.Builder url(String url) {
      this.environment = Environment.custom(url);
      return this;
    }

    @Override
    public SugerApiClient build() {
      clientOptionsBuilder.environment(this.environment);
      return new SugerApiClientImpl(clientOptionsBuilder.build());
    }
  }
}
