package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedRevenueReport.Builder.class
)
public final class SharedRevenueReport {
  private final Optional<String> buyerId;

  private final Optional<String> entitlementId;

  private final Optional<String> organizationId;

  private final Optional<String> partner;

  private final Optional<String> productId;

  private final Optional<String> reportDate;

  private final Optional<SharedRevenueReportType> reportType;

  private final Optional<List<SharedRevenueRecord>> revenueRecords;

  private final Optional<String> service;

  private int _cachedHashCode;

  SharedRevenueReport(Optional<String> buyerId, Optional<String> entitlementId,
      Optional<String> organizationId, Optional<String> partner, Optional<String> productId,
      Optional<String> reportDate, Optional<SharedRevenueReportType> reportType,
      Optional<List<SharedRevenueRecord>> revenueRecords, Optional<String> service) {
    this.buyerId = buyerId;
    this.entitlementId = entitlementId;
    this.organizationId = organizationId;
    this.partner = partner;
    this.productId = productId;
    this.reportDate = reportDate;
    this.reportType = reportType;
    this.revenueRecords = revenueRecords;
    this.service = service;
  }

  @JsonProperty("buyerID")
  public Optional<String> getBuyerId() {
    return buyerId;
  }

  @JsonProperty("entitlementID")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("partner")
  public Optional<String> getPartner() {
    return partner;
  }

  @JsonProperty("productID")
  public Optional<String> getProductId() {
    return productId;
  }

  @JsonProperty("reportDate")
  public Optional<String> getReportDate() {
    return reportDate;
  }

  @JsonProperty("reportType")
  public Optional<SharedRevenueReportType> getReportType() {
    return reportType;
  }

  @JsonProperty("revenueRecords")
  public Optional<List<SharedRevenueRecord>> getRevenueRecords() {
    return revenueRecords;
  }

  @JsonProperty("service")
  public Optional<String> getService() {
    return service;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedRevenueReport && equalTo((SharedRevenueReport) other);
  }

  private boolean equalTo(SharedRevenueReport other) {
    return buyerId.equals(other.buyerId) && entitlementId.equals(other.entitlementId) && organizationId.equals(other.organizationId) && partner.equals(other.partner) && productId.equals(other.productId) && reportDate.equals(other.reportDate) && reportType.equals(other.reportType) && revenueRecords.equals(other.revenueRecords) && service.equals(other.service);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.buyerId, this.entitlementId, this.organizationId, this.partner, this.productId, this.reportDate, this.reportType, this.revenueRecords, this.service);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedRevenueReport{" + "buyerId: " + buyerId + ", entitlementId: " + entitlementId + ", organizationId: " + organizationId + ", partner: " + partner + ", productId: " + productId + ", reportDate: " + reportDate + ", reportType: " + reportType + ", revenueRecords: " + revenueRecords + ", service: " + service + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> buyerId = Optional.empty();

    private Optional<String> entitlementId = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<String> partner = Optional.empty();

    private Optional<String> productId = Optional.empty();

    private Optional<String> reportDate = Optional.empty();

    private Optional<SharedRevenueReportType> reportType = Optional.empty();

    private Optional<List<SharedRevenueRecord>> revenueRecords = Optional.empty();

    private Optional<String> service = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedRevenueReport other) {
      buyerId(other.getBuyerId());
      entitlementId(other.getEntitlementId());
      organizationId(other.getOrganizationId());
      partner(other.getPartner());
      productId(other.getProductId());
      reportDate(other.getReportDate());
      reportType(other.getReportType());
      revenueRecords(other.getRevenueRecords());
      service(other.getService());
      return this;
    }

    @JsonSetter(
        value = "buyerID",
        nulls = Nulls.SKIP
    )
    public Builder buyerId(Optional<String> buyerId) {
      this.buyerId = buyerId;
      return this;
    }

    public Builder buyerId(String buyerId) {
      this.buyerId = Optional.of(buyerId);
      return this;
    }

    @JsonSetter(
        value = "entitlementID",
        nulls = Nulls.SKIP
    )
    public Builder entitlementId(Optional<String> entitlementId) {
      this.entitlementId = entitlementId;
      return this;
    }

    public Builder entitlementId(String entitlementId) {
      this.entitlementId = Optional.of(entitlementId);
      return this;
    }

    @JsonSetter(
        value = "organizationID",
        nulls = Nulls.SKIP
    )
    public Builder organizationId(Optional<String> organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    public Builder organizationId(String organizationId) {
      this.organizationId = Optional.of(organizationId);
      return this;
    }

    @JsonSetter(
        value = "partner",
        nulls = Nulls.SKIP
    )
    public Builder partner(Optional<String> partner) {
      this.partner = partner;
      return this;
    }

    public Builder partner(String partner) {
      this.partner = Optional.of(partner);
      return this;
    }

    @JsonSetter(
        value = "productID",
        nulls = Nulls.SKIP
    )
    public Builder productId(Optional<String> productId) {
      this.productId = productId;
      return this;
    }

    public Builder productId(String productId) {
      this.productId = Optional.of(productId);
      return this;
    }

    @JsonSetter(
        value = "reportDate",
        nulls = Nulls.SKIP
    )
    public Builder reportDate(Optional<String> reportDate) {
      this.reportDate = reportDate;
      return this;
    }

    public Builder reportDate(String reportDate) {
      this.reportDate = Optional.of(reportDate);
      return this;
    }

    @JsonSetter(
        value = "reportType",
        nulls = Nulls.SKIP
    )
    public Builder reportType(Optional<SharedRevenueReportType> reportType) {
      this.reportType = reportType;
      return this;
    }

    public Builder reportType(SharedRevenueReportType reportType) {
      this.reportType = Optional.of(reportType);
      return this;
    }

    @JsonSetter(
        value = "revenueRecords",
        nulls = Nulls.SKIP
    )
    public Builder revenueRecords(Optional<List<SharedRevenueRecord>> revenueRecords) {
      this.revenueRecords = revenueRecords;
      return this;
    }

    public Builder revenueRecords(List<SharedRevenueRecord> revenueRecords) {
      this.revenueRecords = Optional.of(revenueRecords);
      return this;
    }

    @JsonSetter(
        value = "service",
        nulls = Nulls.SKIP
    )
    public Builder service(Optional<String> service) {
      this.service = service;
      return this;
    }

    public Builder service(String service) {
      this.service = Optional.of(service);
      return this;
    }

    public SharedRevenueReport build() {
      return new SharedRevenueReport(buyerId, entitlementId, organizationId, partner, productId, reportDate, reportType, revenueRecords, service);
    }
  }
}
