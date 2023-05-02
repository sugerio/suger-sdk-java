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
    builder = GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue.Builder.class
)
public final class GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue {
  private final Optional<String> azureAssetId;

  private final Optional<String> azureBillingAccountId;

  private final Optional<String> azureCustomerId;

  private final Optional<String> azureOfferId;

  private final Optional<String> azurePlanId;

  private final Optional<String> billingModel;

  private final Optional<String> buyerId;

  private final Optional<Double> earningUsd;

  private final Optional<String> entitlementId;

  private final Optional<String> offerId;

  private final Optional<String> organizationId;

  private final Optional<String> payoutStatus;

  private final Optional<String> productId;

  private final Optional<String> purchaseRecordId;

  private final Optional<Double> revenueUsd;

  private final Optional<String> termEndDate;

  private final Optional<String> termStartDate;

  private int _cachedHashCode;

  GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue(Optional<String> azureAssetId,
      Optional<String> azureBillingAccountId, Optional<String> azureCustomerId,
      Optional<String> azureOfferId, Optional<String> azurePlanId, Optional<String> billingModel,
      Optional<String> buyerId, Optional<Double> earningUsd, Optional<String> entitlementId,
      Optional<String> offerId, Optional<String> organizationId, Optional<String> payoutStatus,
      Optional<String> productId, Optional<String> purchaseRecordId, Optional<Double> revenueUsd,
      Optional<String> termEndDate, Optional<String> termStartDate) {
    this.azureAssetId = azureAssetId;
    this.azureBillingAccountId = azureBillingAccountId;
    this.azureCustomerId = azureCustomerId;
    this.azureOfferId = azureOfferId;
    this.azurePlanId = azurePlanId;
    this.billingModel = billingModel;
    this.buyerId = buyerId;
    this.earningUsd = earningUsd;
    this.entitlementId = entitlementId;
    this.offerId = offerId;
    this.organizationId = organizationId;
    this.payoutStatus = payoutStatus;
    this.productId = productId;
    this.purchaseRecordId = purchaseRecordId;
    this.revenueUsd = revenueUsd;
    this.termEndDate = termEndDate;
    this.termStartDate = termStartDate;
  }

  @JsonProperty("azureAssetID")
  public Optional<String> getAzureAssetId() {
    return azureAssetId;
  }

  @JsonProperty("azureBillingAccountID")
  public Optional<String> getAzureBillingAccountId() {
    return azureBillingAccountId;
  }

  @JsonProperty("azureCustomerID")
  public Optional<String> getAzureCustomerId() {
    return azureCustomerId;
  }

  @JsonProperty("azureOfferID")
  public Optional<String> getAzureOfferId() {
    return azureOfferId;
  }

  @JsonProperty("azurePlanID")
  public Optional<String> getAzurePlanId() {
    return azurePlanId;
  }

  @JsonProperty("billingModel")
  public Optional<String> getBillingModel() {
    return billingModel;
  }

  @JsonProperty("buyerID")
  public Optional<String> getBuyerId() {
    return buyerId;
  }

  @JsonProperty("earningUsd")
  public Optional<Double> getEarningUsd() {
    return earningUsd;
  }

  @JsonProperty("entitlementID")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("offerID")
  public Optional<String> getOfferId() {
    return offerId;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("payoutStatus")
  public Optional<String> getPayoutStatus() {
    return payoutStatus;
  }

  @JsonProperty("productID")
  public Optional<String> getProductId() {
    return productId;
  }

  @JsonProperty("purchaseRecordID")
  public Optional<String> getPurchaseRecordId() {
    return purchaseRecordId;
  }

  @JsonProperty("revenueUsd")
  public Optional<Double> getRevenueUsd() {
    return revenueUsd;
  }

  @JsonProperty("termEndDate")
  public Optional<String> getTermEndDate() {
    return termEndDate;
  }

  @JsonProperty("termStartDate")
  public Optional<String> getTermStartDate() {
    return termStartDate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue && equalTo((GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue) other);
  }

  private boolean equalTo(GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue other) {
    return azureAssetId.equals(other.azureAssetId) && azureBillingAccountId.equals(other.azureBillingAccountId) && azureCustomerId.equals(other.azureCustomerId) && azureOfferId.equals(other.azureOfferId) && azurePlanId.equals(other.azurePlanId) && billingModel.equals(other.billingModel) && buyerId.equals(other.buyerId) && earningUsd.equals(other.earningUsd) && entitlementId.equals(other.entitlementId) && offerId.equals(other.offerId) && organizationId.equals(other.organizationId) && payoutStatus.equals(other.payoutStatus) && productId.equals(other.productId) && purchaseRecordId.equals(other.purchaseRecordId) && revenueUsd.equals(other.revenueUsd) && termEndDate.equals(other.termEndDate) && termStartDate.equals(other.termStartDate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.azureAssetId, this.azureBillingAccountId, this.azureCustomerId, this.azureOfferId, this.azurePlanId, this.billingModel, this.buyerId, this.earningUsd, this.entitlementId, this.offerId, this.organizationId, this.payoutStatus, this.productId, this.purchaseRecordId, this.revenueUsd, this.termEndDate, this.termStartDate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue{" + "azureAssetId: " + azureAssetId + ", azureBillingAccountId: " + azureBillingAccountId + ", azureCustomerId: " + azureCustomerId + ", azureOfferId: " + azureOfferId + ", azurePlanId: " + azurePlanId + ", billingModel: " + billingModel + ", buyerId: " + buyerId + ", earningUsd: " + earningUsd + ", entitlementId: " + entitlementId + ", offerId: " + offerId + ", organizationId: " + organizationId + ", payoutStatus: " + payoutStatus + ", productId: " + productId + ", purchaseRecordId: " + purchaseRecordId + ", revenueUsd: " + revenueUsd + ", termEndDate: " + termEndDate + ", termStartDate: " + termStartDate + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> azureAssetId = Optional.empty();

    private Optional<String> azureBillingAccountId = Optional.empty();

    private Optional<String> azureCustomerId = Optional.empty();

    private Optional<String> azureOfferId = Optional.empty();

    private Optional<String> azurePlanId = Optional.empty();

    private Optional<String> billingModel = Optional.empty();

    private Optional<String> buyerId = Optional.empty();

    private Optional<Double> earningUsd = Optional.empty();

    private Optional<String> entitlementId = Optional.empty();

    private Optional<String> offerId = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<String> payoutStatus = Optional.empty();

    private Optional<String> productId = Optional.empty();

    private Optional<String> purchaseRecordId = Optional.empty();

    private Optional<Double> revenueUsd = Optional.empty();

    private Optional<String> termEndDate = Optional.empty();

    private Optional<String> termStartDate = Optional.empty();

    private Builder() {
    }

    public Builder from(GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue other) {
      azureAssetId(other.getAzureAssetId());
      azureBillingAccountId(other.getAzureBillingAccountId());
      azureCustomerId(other.getAzureCustomerId());
      azureOfferId(other.getAzureOfferId());
      azurePlanId(other.getAzurePlanId());
      billingModel(other.getBillingModel());
      buyerId(other.getBuyerId());
      earningUsd(other.getEarningUsd());
      entitlementId(other.getEntitlementId());
      offerId(other.getOfferId());
      organizationId(other.getOrganizationId());
      payoutStatus(other.getPayoutStatus());
      productId(other.getProductId());
      purchaseRecordId(other.getPurchaseRecordId());
      revenueUsd(other.getRevenueUsd());
      termEndDate(other.getTermEndDate());
      termStartDate(other.getTermStartDate());
      return this;
    }

    @JsonSetter(
        value = "azureAssetID",
        nulls = Nulls.SKIP
    )
    public Builder azureAssetId(Optional<String> azureAssetId) {
      this.azureAssetId = azureAssetId;
      return this;
    }

    public Builder azureAssetId(String azureAssetId) {
      this.azureAssetId = Optional.of(azureAssetId);
      return this;
    }

    @JsonSetter(
        value = "azureBillingAccountID",
        nulls = Nulls.SKIP
    )
    public Builder azureBillingAccountId(Optional<String> azureBillingAccountId) {
      this.azureBillingAccountId = azureBillingAccountId;
      return this;
    }

    public Builder azureBillingAccountId(String azureBillingAccountId) {
      this.azureBillingAccountId = Optional.of(azureBillingAccountId);
      return this;
    }

    @JsonSetter(
        value = "azureCustomerID",
        nulls = Nulls.SKIP
    )
    public Builder azureCustomerId(Optional<String> azureCustomerId) {
      this.azureCustomerId = azureCustomerId;
      return this;
    }

    public Builder azureCustomerId(String azureCustomerId) {
      this.azureCustomerId = Optional.of(azureCustomerId);
      return this;
    }

    @JsonSetter(
        value = "azureOfferID",
        nulls = Nulls.SKIP
    )
    public Builder azureOfferId(Optional<String> azureOfferId) {
      this.azureOfferId = azureOfferId;
      return this;
    }

    public Builder azureOfferId(String azureOfferId) {
      this.azureOfferId = Optional.of(azureOfferId);
      return this;
    }

    @JsonSetter(
        value = "azurePlanID",
        nulls = Nulls.SKIP
    )
    public Builder azurePlanId(Optional<String> azurePlanId) {
      this.azurePlanId = azurePlanId;
      return this;
    }

    public Builder azurePlanId(String azurePlanId) {
      this.azurePlanId = Optional.of(azurePlanId);
      return this;
    }

    @JsonSetter(
        value = "billingModel",
        nulls = Nulls.SKIP
    )
    public Builder billingModel(Optional<String> billingModel) {
      this.billingModel = billingModel;
      return this;
    }

    public Builder billingModel(String billingModel) {
      this.billingModel = Optional.of(billingModel);
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
        value = "earningUsd",
        nulls = Nulls.SKIP
    )
    public Builder earningUsd(Optional<Double> earningUsd) {
      this.earningUsd = earningUsd;
      return this;
    }

    public Builder earningUsd(Double earningUsd) {
      this.earningUsd = Optional.of(earningUsd);
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
        value = "payoutStatus",
        nulls = Nulls.SKIP
    )
    public Builder payoutStatus(Optional<String> payoutStatus) {
      this.payoutStatus = payoutStatus;
      return this;
    }

    public Builder payoutStatus(String payoutStatus) {
      this.payoutStatus = Optional.of(payoutStatus);
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
        value = "purchaseRecordID",
        nulls = Nulls.SKIP
    )
    public Builder purchaseRecordId(Optional<String> purchaseRecordId) {
      this.purchaseRecordId = purchaseRecordId;
      return this;
    }

    public Builder purchaseRecordId(String purchaseRecordId) {
      this.purchaseRecordId = Optional.of(purchaseRecordId);
      return this;
    }

    @JsonSetter(
        value = "revenueUsd",
        nulls = Nulls.SKIP
    )
    public Builder revenueUsd(Optional<Double> revenueUsd) {
      this.revenueUsd = revenueUsd;
      return this;
    }

    public Builder revenueUsd(Double revenueUsd) {
      this.revenueUsd = Optional.of(revenueUsd);
      return this;
    }

    @JsonSetter(
        value = "termEndDate",
        nulls = Nulls.SKIP
    )
    public Builder termEndDate(Optional<String> termEndDate) {
      this.termEndDate = termEndDate;
      return this;
    }

    public Builder termEndDate(String termEndDate) {
      this.termEndDate = Optional.of(termEndDate);
      return this;
    }

    @JsonSetter(
        value = "termStartDate",
        nulls = Nulls.SKIP
    )
    public Builder termStartDate(Optional<String> termStartDate) {
      this.termStartDate = termStartDate;
      return this;
    }

    public Builder termStartDate(String termStartDate) {
      this.termStartDate = Optional.of(termStartDate);
      return this;
    }

    public GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue build() {
      return new GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue(azureAssetId, azureBillingAccountId, azureCustomerId, azureOfferId, azurePlanId, billingModel, buyerId, earningUsd, entitlementId, offerId, organizationId, payoutStatus, productId, purchaseRecordId, revenueUsd, termEndDate, termStartDate);
    }
  }
}
