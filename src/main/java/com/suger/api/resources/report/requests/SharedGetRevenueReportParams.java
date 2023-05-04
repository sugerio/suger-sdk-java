package com.suger.api.resources.report.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.suger.api.types.SharedGetRevenueReportParamsPartner;
import com.suger.api.types.SharedGetRevenueReportParamsService;
import com.suger.api.types.SharedRevenueReportType;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedGetRevenueReportParams.Builder.class
)
public final class SharedGetRevenueReportParams {
  private final Optional<String> buyerId;

  private final Optional<String> entitlementId;

  private final String organizationId;

  private final SharedGetRevenueReportParamsPartner partner;

  private final Optional<String> productId;

  private final SharedRevenueReportType reportType;

  private final SharedGetRevenueReportParamsService service;

  private int _cachedHashCode;

  SharedGetRevenueReportParams(Optional<String> buyerId, Optional<String> entitlementId,
      String organizationId, SharedGetRevenueReportParamsPartner partner,
      Optional<String> productId, SharedRevenueReportType reportType,
      SharedGetRevenueReportParamsService service) {
    this.buyerId = buyerId;
    this.entitlementId = entitlementId;
    this.organizationId = organizationId;
    this.partner = partner;
    this.productId = productId;
    this.reportType = reportType;
    this.service = service;
  }

  /**
   * @return Optional, if available, return the report for the Buyer.
   */
  @JsonProperty("buyerID")
  public Optional<String> getBuyerId() {
    return buyerId;
  }

  /**
   * @return Optional, if available, return the report for the Entitlement.
   */
  @JsonProperty("entitlementID")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  /**
   * @return Required. If the productID &amp; entitlementID are emtpy, return the report for the entire Organization.
   */
  @JsonProperty("organizationID")
  public String getOrganizationId() {
    return organizationId;
  }

  /**
   * @return Required.
   */
  @JsonProperty("partner")
  public SharedGetRevenueReportParamsPartner getPartner() {
    return partner;
  }

  /**
   * @return Optional, if available, return the report for the Product.
   */
  @JsonProperty("productID")
  public Optional<String> getProductId() {
    return productId;
  }

  @JsonProperty("reportType")
  public SharedRevenueReportType getReportType() {
    return reportType;
  }

  /**
   * @return Required.
   */
  @JsonProperty("service")
  public SharedGetRevenueReportParamsService getService() {
    return service;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGetRevenueReportParams && equalTo((SharedGetRevenueReportParams) other);
  }

  private boolean equalTo(SharedGetRevenueReportParams other) {
    return buyerId.equals(other.buyerId) && entitlementId.equals(other.entitlementId) && organizationId.equals(other.organizationId) && partner.equals(other.partner) && productId.equals(other.productId) && reportType.equals(other.reportType) && service.equals(other.service);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.buyerId, this.entitlementId, this.organizationId, this.partner, this.productId, this.reportType, this.service);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGetRevenueReportParams{" + "buyerId: " + buyerId + ", entitlementId: " + entitlementId + ", organizationId: " + organizationId + ", partner: " + partner + ", productId: " + productId + ", reportType: " + reportType + ", service: " + service + "}";
  }

  public static OrganizationIdStage builder() {
    return new Builder();
  }

  public interface OrganizationIdStage {
    PartnerStage organizationId(String organizationId);

    Builder from(SharedGetRevenueReportParams other);
  }

  public interface PartnerStage {
    ReportTypeStage partner(SharedGetRevenueReportParamsPartner partner);
  }

  public interface ReportTypeStage {
    ServiceStage reportType(SharedRevenueReportType reportType);
  }

  public interface ServiceStage {
    _FinalStage service(SharedGetRevenueReportParamsService service);
  }

  public interface _FinalStage {
    SharedGetRevenueReportParams build();

    _FinalStage buyerId(Optional<String> buyerId);

    _FinalStage buyerId(String buyerId);

    _FinalStage entitlementId(Optional<String> entitlementId);

    _FinalStage entitlementId(String entitlementId);

    _FinalStage productId(Optional<String> productId);

    _FinalStage productId(String productId);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements OrganizationIdStage, PartnerStage, ReportTypeStage, ServiceStage, _FinalStage {
    private String organizationId;

    private SharedGetRevenueReportParamsPartner partner;

    private SharedRevenueReportType reportType;

    private SharedGetRevenueReportParamsService service;

    private Optional<String> productId = Optional.empty();

    private Optional<String> entitlementId = Optional.empty();

    private Optional<String> buyerId = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(SharedGetRevenueReportParams other) {
      buyerId(other.getBuyerId());
      entitlementId(other.getEntitlementId());
      organizationId(other.getOrganizationId());
      partner(other.getPartner());
      productId(other.getProductId());
      reportType(other.getReportType());
      service(other.getService());
      return this;
    }

    /**
     * <p>Required. If the productID &amp; entitlementID are emtpy, return the report for the entire Organization.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("organizationID")
    public PartnerStage organizationId(String organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    /**
     * <p>Required.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("partner")
    public ReportTypeStage partner(SharedGetRevenueReportParamsPartner partner) {
      this.partner = partner;
      return this;
    }

    @Override
    @JsonSetter("reportType")
    public ServiceStage reportType(SharedRevenueReportType reportType) {
      this.reportType = reportType;
      return this;
    }

    /**
     * <p>Required.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("service")
    public _FinalStage service(SharedGetRevenueReportParamsService service) {
      this.service = service;
      return this;
    }

    /**
     * <p>Optional, if available, return the report for the Product.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage productId(String productId) {
      this.productId = Optional.of(productId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "productID",
        nulls = Nulls.SKIP
    )
    public _FinalStage productId(Optional<String> productId) {
      this.productId = productId;
      return this;
    }

    /**
     * <p>Optional, if available, return the report for the Entitlement.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage entitlementId(String entitlementId) {
      this.entitlementId = Optional.of(entitlementId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "entitlementID",
        nulls = Nulls.SKIP
    )
    public _FinalStage entitlementId(Optional<String> entitlementId) {
      this.entitlementId = entitlementId;
      return this;
    }

    /**
     * <p>Optional, if available, return the report for the Buyer.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage buyerId(String buyerId) {
      this.buyerId = Optional.of(buyerId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "buyerID",
        nulls = Nulls.SKIP
    )
    public _FinalStage buyerId(Optional<String> buyerId) {
      this.buyerId = buyerId;
      return this;
    }

    @Override
    public SharedGetRevenueReportParams build() {
      return new SharedGetRevenueReportParams(buyerId, entitlementId, organizationId, partner, productId, reportType, service);
    }
  }
}
