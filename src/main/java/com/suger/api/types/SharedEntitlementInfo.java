package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedEntitlementInfo.Builder.class
)
public final class SharedEntitlementInfo {
  private final Optional<Boolean> autoRenew;

  private final Optional<List<TypesEntitlement>> awsEntitlements;

  private final Optional<List<SharedAzureMarketplaceSubscription>> azureSubscriptions;

  private final Optional<Double> collectableAmount;

  private final Optional<Double> commitAmount;

  private final Optional<List<SharedCommitDimension>> commits;

  private final Optional<String> currency;

  private final Optional<List<SharedMeteringDimension>> dimensions;

  private final Optional<Double> disbursedAmount;

  private final Optional<Double> discount;

  private final Optional<SharedEulaType> eulaType;

  private final Optional<String> eulaUrl;

  private final Optional<List<SharedGcpMarketplaceEntitlement>> gcpEntitlements;

  private final Optional<List<SharedGcpPurchasePlan>> gcpPlans;

  private final Optional<Double> invoicedAmount;

  private final Optional<List<SharedPaymentInstallment>> paymentInstallments;

  private final Optional<String> refundCancelationPolicy;

  private final Optional<String> sellerNotes;

  private int _cachedHashCode;

  SharedEntitlementInfo(Optional<Boolean> autoRenew,
      Optional<List<TypesEntitlement>> awsEntitlements,
      Optional<List<SharedAzureMarketplaceSubscription>> azureSubscriptions,
      Optional<Double> collectableAmount, Optional<Double> commitAmount,
      Optional<List<SharedCommitDimension>> commits, Optional<String> currency,
      Optional<List<SharedMeteringDimension>> dimensions, Optional<Double> disbursedAmount,
      Optional<Double> discount, Optional<SharedEulaType> eulaType, Optional<String> eulaUrl,
      Optional<List<SharedGcpMarketplaceEntitlement>> gcpEntitlements,
      Optional<List<SharedGcpPurchasePlan>> gcpPlans, Optional<Double> invoicedAmount,
      Optional<List<SharedPaymentInstallment>> paymentInstallments,
      Optional<String> refundCancelationPolicy, Optional<String> sellerNotes) {
    this.autoRenew = autoRenew;
    this.awsEntitlements = awsEntitlements;
    this.azureSubscriptions = azureSubscriptions;
    this.collectableAmount = collectableAmount;
    this.commitAmount = commitAmount;
    this.commits = commits;
    this.currency = currency;
    this.dimensions = dimensions;
    this.disbursedAmount = disbursedAmount;
    this.discount = discount;
    this.eulaType = eulaType;
    this.eulaUrl = eulaUrl;
    this.gcpEntitlements = gcpEntitlements;
    this.gcpPlans = gcpPlans;
    this.invoicedAmount = invoicedAmount;
    this.paymentInstallments = paymentInstallments;
    this.refundCancelationPolicy = refundCancelationPolicy;
    this.sellerNotes = sellerNotes;
  }

  /**
   * @return Is this Entitlement Auto Renew enabled.
   */
  @JsonProperty("autoRenew")
  public Optional<Boolean> getAutoRenew() {
    return autoRenew;
  }

  /**
   * @return Nullable. AWS Entitlements from AWS Marketplace.
   */
  @JsonProperty("awsEntitlements")
  public Optional<List<TypesEntitlement>> getAwsEntitlements() {
    return awsEntitlements;
  }

  /**
   * @return Nullable. Azure Subscriptions from Azure Marketplace.
   */
  @JsonProperty("azureSubscriptions")
  public Optional<List<SharedAzureMarketplaceSubscription>> getAzureSubscriptions() {
    return azureSubscriptions;
  }

  /**
   * @return The amount that the seller can collect. It excludes the marketplace commision fee.
   */
  @JsonProperty("collectableAmount")
  public Optional<Double> getCollectableAmount() {
    return collectableAmount;
  }

  /**
   * @return The amount that the buyer has committed to pay. It can be the sum of payment installments if applicable.
   */
  @JsonProperty("commitAmount")
  public Optional<Double> getCommitAmount() {
    return commitAmount;
  }

  /**
   * @return The dimensions for commit.
   */
  @JsonProperty("commits")
  public Optional<List<SharedCommitDimension>> getCommits() {
    return commits;
  }

  /**
   * @return The default Currency is USD.
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  /**
   * @return The dimensions for usage-based metering.
   */
  @JsonProperty("dimensions")
  public Optional<List<SharedMeteringDimension>> getDimensions() {
    return dimensions;
  }

  /**
   * @return The amount that has been disbursed to the seller account.
   */
  @JsonProperty("disbursedAmount")
  public Optional<Double> getDisbursedAmount() {
    return disbursedAmount;
  }

  /**
   * @return The rate of discount (0 ~ 1.0), such as 0.1 which is 10% off. 0 which is no discount.
   */
  @JsonProperty("discount")
  public Optional<Double> getDiscount() {
    return discount;
  }

  @JsonProperty("eulaType")
  public Optional<SharedEulaType> getEulaType() {
    return eulaType;
  }

  @JsonProperty("eulaUrl")
  public Optional<String> getEulaUrl() {
    return eulaUrl;
  }

  /**
   * @return Nullable. GCP Entitlements from GCP Marketplace.
   */
  @JsonProperty("gcpEntitlements")
  public Optional<List<SharedGcpMarketplaceEntitlement>> getGcpEntitlements() {
    return gcpEntitlements;
  }

  /**
   * @return Only applicable for GCP Marketplace Entitlements.
   */
  @JsonProperty("gcpPlans")
  public Optional<List<SharedGcpPurchasePlan>> getGcpPlans() {
    return gcpPlans;
  }

  /**
   * @return The amount that the buyer has got invoiced.
   */
  @JsonProperty("invoicedAmount")
  public Optional<Double> getInvoicedAmount() {
    return invoicedAmount;
  }

  /**
   * @return For flexible payment schedules
   */
  @JsonProperty("paymentInstallments")
  public Optional<List<SharedPaymentInstallment>> getPaymentInstallments() {
    return paymentInstallments;
  }

  @JsonProperty("refundCancelationPolicy")
  public Optional<String> getRefundCancelationPolicy() {
    return refundCancelationPolicy;
  }

  @JsonProperty("sellerNotes")
  public Optional<String> getSellerNotes() {
    return sellerNotes;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedEntitlementInfo && equalTo((SharedEntitlementInfo) other);
  }

  private boolean equalTo(SharedEntitlementInfo other) {
    return autoRenew.equals(other.autoRenew) && awsEntitlements.equals(other.awsEntitlements) && azureSubscriptions.equals(other.azureSubscriptions) && collectableAmount.equals(other.collectableAmount) && commitAmount.equals(other.commitAmount) && commits.equals(other.commits) && currency.equals(other.currency) && dimensions.equals(other.dimensions) && disbursedAmount.equals(other.disbursedAmount) && discount.equals(other.discount) && eulaType.equals(other.eulaType) && eulaUrl.equals(other.eulaUrl) && gcpEntitlements.equals(other.gcpEntitlements) && gcpPlans.equals(other.gcpPlans) && invoicedAmount.equals(other.invoicedAmount) && paymentInstallments.equals(other.paymentInstallments) && refundCancelationPolicy.equals(other.refundCancelationPolicy) && sellerNotes.equals(other.sellerNotes);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.autoRenew, this.awsEntitlements, this.azureSubscriptions, this.collectableAmount, this.commitAmount, this.commits, this.currency, this.dimensions, this.disbursedAmount, this.discount, this.eulaType, this.eulaUrl, this.gcpEntitlements, this.gcpPlans, this.invoicedAmount, this.paymentInstallments, this.refundCancelationPolicy, this.sellerNotes);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedEntitlementInfo{" + "autoRenew: " + autoRenew + ", awsEntitlements: " + awsEntitlements + ", azureSubscriptions: " + azureSubscriptions + ", collectableAmount: " + collectableAmount + ", commitAmount: " + commitAmount + ", commits: " + commits + ", currency: " + currency + ", dimensions: " + dimensions + ", disbursedAmount: " + disbursedAmount + ", discount: " + discount + ", eulaType: " + eulaType + ", eulaUrl: " + eulaUrl + ", gcpEntitlements: " + gcpEntitlements + ", gcpPlans: " + gcpPlans + ", invoicedAmount: " + invoicedAmount + ", paymentInstallments: " + paymentInstallments + ", refundCancelationPolicy: " + refundCancelationPolicy + ", sellerNotes: " + sellerNotes + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Boolean> autoRenew = Optional.empty();

    private Optional<List<TypesEntitlement>> awsEntitlements = Optional.empty();

    private Optional<List<SharedAzureMarketplaceSubscription>> azureSubscriptions = Optional.empty();

    private Optional<Double> collectableAmount = Optional.empty();

    private Optional<Double> commitAmount = Optional.empty();

    private Optional<List<SharedCommitDimension>> commits = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<List<SharedMeteringDimension>> dimensions = Optional.empty();

    private Optional<Double> disbursedAmount = Optional.empty();

    private Optional<Double> discount = Optional.empty();

    private Optional<SharedEulaType> eulaType = Optional.empty();

    private Optional<String> eulaUrl = Optional.empty();

    private Optional<List<SharedGcpMarketplaceEntitlement>> gcpEntitlements = Optional.empty();

    private Optional<List<SharedGcpPurchasePlan>> gcpPlans = Optional.empty();

    private Optional<Double> invoicedAmount = Optional.empty();

    private Optional<List<SharedPaymentInstallment>> paymentInstallments = Optional.empty();

    private Optional<String> refundCancelationPolicy = Optional.empty();

    private Optional<String> sellerNotes = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedEntitlementInfo other) {
      autoRenew(other.getAutoRenew());
      awsEntitlements(other.getAwsEntitlements());
      azureSubscriptions(other.getAzureSubscriptions());
      collectableAmount(other.getCollectableAmount());
      commitAmount(other.getCommitAmount());
      commits(other.getCommits());
      currency(other.getCurrency());
      dimensions(other.getDimensions());
      disbursedAmount(other.getDisbursedAmount());
      discount(other.getDiscount());
      eulaType(other.getEulaType());
      eulaUrl(other.getEulaUrl());
      gcpEntitlements(other.getGcpEntitlements());
      gcpPlans(other.getGcpPlans());
      invoicedAmount(other.getInvoicedAmount());
      paymentInstallments(other.getPaymentInstallments());
      refundCancelationPolicy(other.getRefundCancelationPolicy());
      sellerNotes(other.getSellerNotes());
      return this;
    }

    @JsonSetter(
        value = "autoRenew",
        nulls = Nulls.SKIP
    )
    public Builder autoRenew(Optional<Boolean> autoRenew) {
      this.autoRenew = autoRenew;
      return this;
    }

    public Builder autoRenew(Boolean autoRenew) {
      this.autoRenew = Optional.of(autoRenew);
      return this;
    }

    @JsonSetter(
        value = "awsEntitlements",
        nulls = Nulls.SKIP
    )
    public Builder awsEntitlements(Optional<List<TypesEntitlement>> awsEntitlements) {
      this.awsEntitlements = awsEntitlements;
      return this;
    }

    public Builder awsEntitlements(List<TypesEntitlement> awsEntitlements) {
      this.awsEntitlements = Optional.of(awsEntitlements);
      return this;
    }

    @JsonSetter(
        value = "azureSubscriptions",
        nulls = Nulls.SKIP
    )
    public Builder azureSubscriptions(
        Optional<List<SharedAzureMarketplaceSubscription>> azureSubscriptions) {
      this.azureSubscriptions = azureSubscriptions;
      return this;
    }

    public Builder azureSubscriptions(List<SharedAzureMarketplaceSubscription> azureSubscriptions) {
      this.azureSubscriptions = Optional.of(azureSubscriptions);
      return this;
    }

    @JsonSetter(
        value = "collectableAmount",
        nulls = Nulls.SKIP
    )
    public Builder collectableAmount(Optional<Double> collectableAmount) {
      this.collectableAmount = collectableAmount;
      return this;
    }

    public Builder collectableAmount(Double collectableAmount) {
      this.collectableAmount = Optional.of(collectableAmount);
      return this;
    }

    @JsonSetter(
        value = "commitAmount",
        nulls = Nulls.SKIP
    )
    public Builder commitAmount(Optional<Double> commitAmount) {
      this.commitAmount = commitAmount;
      return this;
    }

    public Builder commitAmount(Double commitAmount) {
      this.commitAmount = Optional.of(commitAmount);
      return this;
    }

    @JsonSetter(
        value = "commits",
        nulls = Nulls.SKIP
    )
    public Builder commits(Optional<List<SharedCommitDimension>> commits) {
      this.commits = commits;
      return this;
    }

    public Builder commits(List<SharedCommitDimension> commits) {
      this.commits = Optional.of(commits);
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
        value = "dimensions",
        nulls = Nulls.SKIP
    )
    public Builder dimensions(Optional<List<SharedMeteringDimension>> dimensions) {
      this.dimensions = dimensions;
      return this;
    }

    public Builder dimensions(List<SharedMeteringDimension> dimensions) {
      this.dimensions = Optional.of(dimensions);
      return this;
    }

    @JsonSetter(
        value = "disbursedAmount",
        nulls = Nulls.SKIP
    )
    public Builder disbursedAmount(Optional<Double> disbursedAmount) {
      this.disbursedAmount = disbursedAmount;
      return this;
    }

    public Builder disbursedAmount(Double disbursedAmount) {
      this.disbursedAmount = Optional.of(disbursedAmount);
      return this;
    }

    @JsonSetter(
        value = "discount",
        nulls = Nulls.SKIP
    )
    public Builder discount(Optional<Double> discount) {
      this.discount = discount;
      return this;
    }

    public Builder discount(Double discount) {
      this.discount = Optional.of(discount);
      return this;
    }

    @JsonSetter(
        value = "eulaType",
        nulls = Nulls.SKIP
    )
    public Builder eulaType(Optional<SharedEulaType> eulaType) {
      this.eulaType = eulaType;
      return this;
    }

    public Builder eulaType(SharedEulaType eulaType) {
      this.eulaType = Optional.of(eulaType);
      return this;
    }

    @JsonSetter(
        value = "eulaUrl",
        nulls = Nulls.SKIP
    )
    public Builder eulaUrl(Optional<String> eulaUrl) {
      this.eulaUrl = eulaUrl;
      return this;
    }

    public Builder eulaUrl(String eulaUrl) {
      this.eulaUrl = Optional.of(eulaUrl);
      return this;
    }

    @JsonSetter(
        value = "gcpEntitlements",
        nulls = Nulls.SKIP
    )
    public Builder gcpEntitlements(
        Optional<List<SharedGcpMarketplaceEntitlement>> gcpEntitlements) {
      this.gcpEntitlements = gcpEntitlements;
      return this;
    }

    public Builder gcpEntitlements(List<SharedGcpMarketplaceEntitlement> gcpEntitlements) {
      this.gcpEntitlements = Optional.of(gcpEntitlements);
      return this;
    }

    @JsonSetter(
        value = "gcpPlans",
        nulls = Nulls.SKIP
    )
    public Builder gcpPlans(Optional<List<SharedGcpPurchasePlan>> gcpPlans) {
      this.gcpPlans = gcpPlans;
      return this;
    }

    public Builder gcpPlans(List<SharedGcpPurchasePlan> gcpPlans) {
      this.gcpPlans = Optional.of(gcpPlans);
      return this;
    }

    @JsonSetter(
        value = "invoicedAmount",
        nulls = Nulls.SKIP
    )
    public Builder invoicedAmount(Optional<Double> invoicedAmount) {
      this.invoicedAmount = invoicedAmount;
      return this;
    }

    public Builder invoicedAmount(Double invoicedAmount) {
      this.invoicedAmount = Optional.of(invoicedAmount);
      return this;
    }

    @JsonSetter(
        value = "paymentInstallments",
        nulls = Nulls.SKIP
    )
    public Builder paymentInstallments(
        Optional<List<SharedPaymentInstallment>> paymentInstallments) {
      this.paymentInstallments = paymentInstallments;
      return this;
    }

    public Builder paymentInstallments(List<SharedPaymentInstallment> paymentInstallments) {
      this.paymentInstallments = Optional.of(paymentInstallments);
      return this;
    }

    @JsonSetter(
        value = "refundCancelationPolicy",
        nulls = Nulls.SKIP
    )
    public Builder refundCancelationPolicy(Optional<String> refundCancelationPolicy) {
      this.refundCancelationPolicy = refundCancelationPolicy;
      return this;
    }

    public Builder refundCancelationPolicy(String refundCancelationPolicy) {
      this.refundCancelationPolicy = Optional.of(refundCancelationPolicy);
      return this;
    }

    @JsonSetter(
        value = "sellerNotes",
        nulls = Nulls.SKIP
    )
    public Builder sellerNotes(Optional<String> sellerNotes) {
      this.sellerNotes = sellerNotes;
      return this;
    }

    public Builder sellerNotes(String sellerNotes) {
      this.sellerNotes = Optional.of(sellerNotes);
      return this;
    }

    public SharedEntitlementInfo build() {
      return new SharedEntitlementInfo(autoRenew, awsEntitlements, azureSubscriptions, collectableAmount, commitAmount, commits, currency, dimensions, disbursedAmount, discount, eulaType, eulaUrl, gcpEntitlements, gcpPlans, invoicedAmount, paymentInstallments, refundCancelationPolicy, sellerNotes);
    }
  }
}
