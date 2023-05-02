package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage.Builder.class
)
public final class GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage {
  private final Optional<Double> abandoned;

  private final Optional<String> accountId;

  private final Optional<String> buyerId;

  private final Optional<Double> charges;

  private final Optional<String> currency;

  private final Optional<Double> dueVendor;

  private final Optional<String> entitlementId;

  private final Optional<String> googleEntity;

  private final Optional<String> insightAccountId;

  private final Optional<String> offerId;

  private final Optional<String> organizationId;

  private final Optional<String> paymentSchedule;

  private final Optional<String> paymentType;

  private final Optional<Double> prepayCredits;

  private final Optional<String> productId;

  private final Optional<Double> refundBalanceDeductedThisMonth;

  private final Optional<Double> refundBalanceOutstanding;

  private final Optional<String> refundReason;

  private final Optional<Double> released;

  private final Optional<String> reportDate;

  private final Optional<String> resource;

  private final Optional<String> sku;

  private final Optional<Double> trialUse;

  private final Optional<String> unit;

  private final Optional<Double> usage;

  private final Optional<String> usedBy;

  private final Optional<Double> withheld;

  private int _cachedHashCode;

  GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage(Optional<Double> abandoned,
      Optional<String> accountId, Optional<String> buyerId, Optional<Double> charges,
      Optional<String> currency, Optional<Double> dueVendor, Optional<String> entitlementId,
      Optional<String> googleEntity, Optional<String> insightAccountId, Optional<String> offerId,
      Optional<String> organizationId, Optional<String> paymentSchedule,
      Optional<String> paymentType, Optional<Double> prepayCredits, Optional<String> productId,
      Optional<Double> refundBalanceDeductedThisMonth, Optional<Double> refundBalanceOutstanding,
      Optional<String> refundReason, Optional<Double> released, Optional<String> reportDate,
      Optional<String> resource, Optional<String> sku, Optional<Double> trialUse,
      Optional<String> unit, Optional<Double> usage, Optional<String> usedBy,
      Optional<Double> withheld) {
    this.abandoned = abandoned;
    this.accountId = accountId;
    this.buyerId = buyerId;
    this.charges = charges;
    this.currency = currency;
    this.dueVendor = dueVendor;
    this.entitlementId = entitlementId;
    this.googleEntity = googleEntity;
    this.insightAccountId = insightAccountId;
    this.offerId = offerId;
    this.organizationId = organizationId;
    this.paymentSchedule = paymentSchedule;
    this.paymentType = paymentType;
    this.prepayCredits = prepayCredits;
    this.productId = productId;
    this.refundBalanceDeductedThisMonth = refundBalanceDeductedThisMonth;
    this.refundBalanceOutstanding = refundBalanceOutstanding;
    this.refundReason = refundReason;
    this.released = released;
    this.reportDate = reportDate;
    this.resource = resource;
    this.sku = sku;
    this.trialUse = trialUse;
    this.unit = unit;
    this.usage = usage;
    this.usedBy = usedBy;
    this.withheld = withheld;
  }

  @JsonProperty("abandoned")
  public Optional<Double> getAbandoned() {
    return abandoned;
  }

  @JsonProperty("accountID")
  public Optional<String> getAccountId() {
    return accountId;
  }

  @JsonProperty("buyerID")
  public Optional<String> getBuyerId() {
    return buyerId;
  }

  @JsonProperty("charges")
  public Optional<Double> getCharges() {
    return charges;
  }

  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  @JsonProperty("dueVendor")
  public Optional<Double> getDueVendor() {
    return dueVendor;
  }

  @JsonProperty("entitlementID")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("googleEntity")
  public Optional<String> getGoogleEntity() {
    return googleEntity;
  }

  @JsonProperty("insightAccountID")
  public Optional<String> getInsightAccountId() {
    return insightAccountId;
  }

  @JsonProperty("offerID")
  public Optional<String> getOfferId() {
    return offerId;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("paymentSchedule")
  public Optional<String> getPaymentSchedule() {
    return paymentSchedule;
  }

  @JsonProperty("paymentType")
  public Optional<String> getPaymentType() {
    return paymentType;
  }

  @JsonProperty("prepayCredits")
  public Optional<Double> getPrepayCredits() {
    return prepayCredits;
  }

  @JsonProperty("productID")
  public Optional<String> getProductId() {
    return productId;
  }

  @JsonProperty("refundBalanceDeductedThisMonth")
  public Optional<Double> getRefundBalanceDeductedThisMonth() {
    return refundBalanceDeductedThisMonth;
  }

  @JsonProperty("refundBalanceOutstanding")
  public Optional<Double> getRefundBalanceOutstanding() {
    return refundBalanceOutstanding;
  }

  @JsonProperty("refundReason")
  public Optional<String> getRefundReason() {
    return refundReason;
  }

  @JsonProperty("released")
  public Optional<Double> getReleased() {
    return released;
  }

  @JsonProperty("reportDate")
  public Optional<String> getReportDate() {
    return reportDate;
  }

  @JsonProperty("resource")
  public Optional<String> getResource() {
    return resource;
  }

  @JsonProperty("sku")
  public Optional<String> getSku() {
    return sku;
  }

  @JsonProperty("trialUse")
  public Optional<Double> getTrialUse() {
    return trialUse;
  }

  @JsonProperty("unit")
  public Optional<String> getUnit() {
    return unit;
  }

  @JsonProperty("usage")
  public Optional<Double> getUsage() {
    return usage;
  }

  @JsonProperty("usedBy")
  public Optional<String> getUsedBy() {
    return usedBy;
  }

  @JsonProperty("withheld")
  public Optional<Double> getWithheld() {
    return withheld;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage && equalTo((GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage) other);
  }

  private boolean equalTo(GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage other) {
    return abandoned.equals(other.abandoned) && accountId.equals(other.accountId) && buyerId.equals(other.buyerId) && charges.equals(other.charges) && currency.equals(other.currency) && dueVendor.equals(other.dueVendor) && entitlementId.equals(other.entitlementId) && googleEntity.equals(other.googleEntity) && insightAccountId.equals(other.insightAccountId) && offerId.equals(other.offerId) && organizationId.equals(other.organizationId) && paymentSchedule.equals(other.paymentSchedule) && paymentType.equals(other.paymentType) && prepayCredits.equals(other.prepayCredits) && productId.equals(other.productId) && refundBalanceDeductedThisMonth.equals(other.refundBalanceDeductedThisMonth) && refundBalanceOutstanding.equals(other.refundBalanceOutstanding) && refundReason.equals(other.refundReason) && released.equals(other.released) && reportDate.equals(other.reportDate) && resource.equals(other.resource) && sku.equals(other.sku) && trialUse.equals(other.trialUse) && unit.equals(other.unit) && usage.equals(other.usage) && usedBy.equals(other.usedBy) && withheld.equals(other.withheld);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.abandoned, this.accountId, this.buyerId, this.charges, this.currency, this.dueVendor, this.entitlementId, this.googleEntity, this.insightAccountId, this.offerId, this.organizationId, this.paymentSchedule, this.paymentType, this.prepayCredits, this.productId, this.refundBalanceDeductedThisMonth, this.refundBalanceOutstanding, this.refundReason, this.released, this.reportDate, this.resource, this.sku, this.trialUse, this.unit, this.usage, this.usedBy, this.withheld);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage{" + "abandoned: " + abandoned + ", accountId: " + accountId + ", buyerId: " + buyerId + ", charges: " + charges + ", currency: " + currency + ", dueVendor: " + dueVendor + ", entitlementId: " + entitlementId + ", googleEntity: " + googleEntity + ", insightAccountId: " + insightAccountId + ", offerId: " + offerId + ", organizationId: " + organizationId + ", paymentSchedule: " + paymentSchedule + ", paymentType: " + paymentType + ", prepayCredits: " + prepayCredits + ", productId: " + productId + ", refundBalanceDeductedThisMonth: " + refundBalanceDeductedThisMonth + ", refundBalanceOutstanding: " + refundBalanceOutstanding + ", refundReason: " + refundReason + ", released: " + released + ", reportDate: " + reportDate + ", resource: " + resource + ", sku: " + sku + ", trialUse: " + trialUse + ", unit: " + unit + ", usage: " + usage + ", usedBy: " + usedBy + ", withheld: " + withheld + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Double> abandoned = Optional.empty();

    private Optional<String> accountId = Optional.empty();

    private Optional<String> buyerId = Optional.empty();

    private Optional<Double> charges = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<Double> dueVendor = Optional.empty();

    private Optional<String> entitlementId = Optional.empty();

    private Optional<String> googleEntity = Optional.empty();

    private Optional<String> insightAccountId = Optional.empty();

    private Optional<String> offerId = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<String> paymentSchedule = Optional.empty();

    private Optional<String> paymentType = Optional.empty();

    private Optional<Double> prepayCredits = Optional.empty();

    private Optional<String> productId = Optional.empty();

    private Optional<Double> refundBalanceDeductedThisMonth = Optional.empty();

    private Optional<Double> refundBalanceOutstanding = Optional.empty();

    private Optional<String> refundReason = Optional.empty();

    private Optional<Double> released = Optional.empty();

    private Optional<String> reportDate = Optional.empty();

    private Optional<String> resource = Optional.empty();

    private Optional<String> sku = Optional.empty();

    private Optional<Double> trialUse = Optional.empty();

    private Optional<String> unit = Optional.empty();

    private Optional<Double> usage = Optional.empty();

    private Optional<String> usedBy = Optional.empty();

    private Optional<Double> withheld = Optional.empty();

    private Builder() {
    }

    public Builder from(GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage other) {
      abandoned(other.getAbandoned());
      accountId(other.getAccountId());
      buyerId(other.getBuyerId());
      charges(other.getCharges());
      currency(other.getCurrency());
      dueVendor(other.getDueVendor());
      entitlementId(other.getEntitlementId());
      googleEntity(other.getGoogleEntity());
      insightAccountId(other.getInsightAccountId());
      offerId(other.getOfferId());
      organizationId(other.getOrganizationId());
      paymentSchedule(other.getPaymentSchedule());
      paymentType(other.getPaymentType());
      prepayCredits(other.getPrepayCredits());
      productId(other.getProductId());
      refundBalanceDeductedThisMonth(other.getRefundBalanceDeductedThisMonth());
      refundBalanceOutstanding(other.getRefundBalanceOutstanding());
      refundReason(other.getRefundReason());
      released(other.getReleased());
      reportDate(other.getReportDate());
      resource(other.getResource());
      sku(other.getSku());
      trialUse(other.getTrialUse());
      unit(other.getUnit());
      usage(other.getUsage());
      usedBy(other.getUsedBy());
      withheld(other.getWithheld());
      return this;
    }

    @JsonSetter(
        value = "abandoned",
        nulls = Nulls.SKIP
    )
    public Builder abandoned(Optional<Double> abandoned) {
      this.abandoned = abandoned;
      return this;
    }

    public Builder abandoned(Double abandoned) {
      this.abandoned = Optional.of(abandoned);
      return this;
    }

    @JsonSetter(
        value = "accountID",
        nulls = Nulls.SKIP
    )
    public Builder accountId(Optional<String> accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder accountId(String accountId) {
      this.accountId = Optional.of(accountId);
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
        value = "charges",
        nulls = Nulls.SKIP
    )
    public Builder charges(Optional<Double> charges) {
      this.charges = charges;
      return this;
    }

    public Builder charges(Double charges) {
      this.charges = Optional.of(charges);
      return this;
    }

    @JsonSetter(
        value = "currency",
        nulls = Nulls.SKIP
    )
    public Builder currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    public Builder currency(String currency) {
      this.currency = Optional.of(currency);
      return this;
    }

    @JsonSetter(
        value = "dueVendor",
        nulls = Nulls.SKIP
    )
    public Builder dueVendor(Optional<Double> dueVendor) {
      this.dueVendor = dueVendor;
      return this;
    }

    public Builder dueVendor(Double dueVendor) {
      this.dueVendor = Optional.of(dueVendor);
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
        value = "googleEntity",
        nulls = Nulls.SKIP
    )
    public Builder googleEntity(Optional<String> googleEntity) {
      this.googleEntity = googleEntity;
      return this;
    }

    public Builder googleEntity(String googleEntity) {
      this.googleEntity = Optional.of(googleEntity);
      return this;
    }

    @JsonSetter(
        value = "insightAccountID",
        nulls = Nulls.SKIP
    )
    public Builder insightAccountId(Optional<String> insightAccountId) {
      this.insightAccountId = insightAccountId;
      return this;
    }

    public Builder insightAccountId(String insightAccountId) {
      this.insightAccountId = Optional.of(insightAccountId);
      return this;
    }

    @JsonSetter(
        value = "offerID",
        nulls = Nulls.SKIP
    )
    public Builder offerId(Optional<String> offerId) {
      this.offerId = offerId;
      return this;
    }

    public Builder offerId(String offerId) {
      this.offerId = Optional.of(offerId);
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
        value = "paymentSchedule",
        nulls = Nulls.SKIP
    )
    public Builder paymentSchedule(Optional<String> paymentSchedule) {
      this.paymentSchedule = paymentSchedule;
      return this;
    }

    public Builder paymentSchedule(String paymentSchedule) {
      this.paymentSchedule = Optional.of(paymentSchedule);
      return this;
    }

    @JsonSetter(
        value = "paymentType",
        nulls = Nulls.SKIP
    )
    public Builder paymentType(Optional<String> paymentType) {
      this.paymentType = paymentType;
      return this;
    }

    public Builder paymentType(String paymentType) {
      this.paymentType = Optional.of(paymentType);
      return this;
    }

    @JsonSetter(
        value = "prepayCredits",
        nulls = Nulls.SKIP
    )
    public Builder prepayCredits(Optional<Double> prepayCredits) {
      this.prepayCredits = prepayCredits;
      return this;
    }

    public Builder prepayCredits(Double prepayCredits) {
      this.prepayCredits = Optional.of(prepayCredits);
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
        value = "refundBalanceDeductedThisMonth",
        nulls = Nulls.SKIP
    )
    public Builder refundBalanceDeductedThisMonth(Optional<Double> refundBalanceDeductedThisMonth) {
      this.refundBalanceDeductedThisMonth = refundBalanceDeductedThisMonth;
      return this;
    }

    public Builder refundBalanceDeductedThisMonth(Double refundBalanceDeductedThisMonth) {
      this.refundBalanceDeductedThisMonth = Optional.of(refundBalanceDeductedThisMonth);
      return this;
    }

    @JsonSetter(
        value = "refundBalanceOutstanding",
        nulls = Nulls.SKIP
    )
    public Builder refundBalanceOutstanding(Optional<Double> refundBalanceOutstanding) {
      this.refundBalanceOutstanding = refundBalanceOutstanding;
      return this;
    }

    public Builder refundBalanceOutstanding(Double refundBalanceOutstanding) {
      this.refundBalanceOutstanding = Optional.of(refundBalanceOutstanding);
      return this;
    }

    @JsonSetter(
        value = "refundReason",
        nulls = Nulls.SKIP
    )
    public Builder refundReason(Optional<String> refundReason) {
      this.refundReason = refundReason;
      return this;
    }

    public Builder refundReason(String refundReason) {
      this.refundReason = Optional.of(refundReason);
      return this;
    }

    @JsonSetter(
        value = "released",
        nulls = Nulls.SKIP
    )
    public Builder released(Optional<Double> released) {
      this.released = released;
      return this;
    }

    public Builder released(Double released) {
      this.released = Optional.of(released);
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
        value = "resource",
        nulls = Nulls.SKIP
    )
    public Builder resource(Optional<String> resource) {
      this.resource = resource;
      return this;
    }

    public Builder resource(String resource) {
      this.resource = Optional.of(resource);
      return this;
    }

    @JsonSetter(
        value = "sku",
        nulls = Nulls.SKIP
    )
    public Builder sku(Optional<String> sku) {
      this.sku = sku;
      return this;
    }

    public Builder sku(String sku) {
      this.sku = Optional.of(sku);
      return this;
    }

    @JsonSetter(
        value = "trialUse",
        nulls = Nulls.SKIP
    )
    public Builder trialUse(Optional<Double> trialUse) {
      this.trialUse = trialUse;
      return this;
    }

    public Builder trialUse(Double trialUse) {
      this.trialUse = Optional.of(trialUse);
      return this;
    }

    @JsonSetter(
        value = "unit",
        nulls = Nulls.SKIP
    )
    public Builder unit(Optional<String> unit) {
      this.unit = unit;
      return this;
    }

    public Builder unit(String unit) {
      this.unit = Optional.of(unit);
      return this;
    }

    @JsonSetter(
        value = "usage",
        nulls = Nulls.SKIP
    )
    public Builder usage(Optional<Double> usage) {
      this.usage = usage;
      return this;
    }

    public Builder usage(Double usage) {
      this.usage = Optional.of(usage);
      return this;
    }

    @JsonSetter(
        value = "usedBy",
        nulls = Nulls.SKIP
    )
    public Builder usedBy(Optional<String> usedBy) {
      this.usedBy = usedBy;
      return this;
    }

    public Builder usedBy(String usedBy) {
      this.usedBy = Optional.of(usedBy);
      return this;
    }

    @JsonSetter(
        value = "withheld",
        nulls = Nulls.SKIP
    )
    public Builder withheld(Optional<Double> withheld) {
      this.withheld = withheld;
      return this;
    }

    public Builder withheld(Double withheld) {
      this.withheld = Optional.of(withheld);
      return this;
    }

    public GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage build() {
      return new GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage(abandoned, accountId, buyerId, charges, currency, dueVendor, entitlementId, googleEntity, insightAccountId, offerId, organizationId, paymentSchedule, paymentType, prepayCredits, productId, refundBalanceDeductedThisMonth, refundBalanceOutstanding, refundReason, released, reportDate, resource, sku, trialUse, unit, usage, usedBy, withheld);
    }
  }
}
