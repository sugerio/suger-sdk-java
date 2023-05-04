package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedOfferInfo.Builder.class
)
public final class SharedOfferInfo {
  private final Optional<AzurePriceAndAvailabilityPrivateOfferPlan> azureOriginalPlan;

  private final Optional<AzureMarketplacePrivateOffer> azurePrivateOffer;

  private final Optional<AzureProductVariant> azureProductVariant;

  private final Optional<List<String>> buyerAwsAccountIds;

  private final Optional<List<AzureAudience>> buyerAzureTenants;

  private final Optional<List<SharedCommitDimension>> commits;

  private final Optional<String> currency;

  private final Optional<List<SharedMeteringDimension>> dimensions;

  private final Optional<Double> discount;

  private final Optional<SharedEulaType> eulaType;

  private final Optional<String> eulaUrl;

  private final Optional<List<SharedGcpCommerceProducerPurchaseMetric>> gcpMetrics;

  private final Optional<List<SharedGcpPurchasePlan>> gcpPlans;

  private final Optional<List<SharedPaymentInstallment>> paymentInstallments;

  private final Optional<String> privateOfferUrl;

  private final Optional<String> refundCancelationPolicy;

  private final Optional<String> sellerNotes;

  private final Optional<SharedOfferInfoVisibility> visibility;

  private int _cachedHashCode;

  SharedOfferInfo(Optional<AzurePriceAndAvailabilityPrivateOfferPlan> azureOriginalPlan,
      Optional<AzureMarketplacePrivateOffer> azurePrivateOffer,
      Optional<AzureProductVariant> azureProductVariant, Optional<List<String>> buyerAwsAccountIds,
      Optional<List<AzureAudience>> buyerAzureTenants,
      Optional<List<SharedCommitDimension>> commits, Optional<String> currency,
      Optional<List<SharedMeteringDimension>> dimensions, Optional<Double> discount,
      Optional<SharedEulaType> eulaType, Optional<String> eulaUrl,
      Optional<List<SharedGcpCommerceProducerPurchaseMetric>> gcpMetrics,
      Optional<List<SharedGcpPurchasePlan>> gcpPlans,
      Optional<List<SharedPaymentInstallment>> paymentInstallments,
      Optional<String> privateOfferUrl, Optional<String> refundCancelationPolicy,
      Optional<String> sellerNotes, Optional<SharedOfferInfoVisibility> visibility) {
    this.azureOriginalPlan = azureOriginalPlan;
    this.azurePrivateOffer = azurePrivateOffer;
    this.azureProductVariant = azureProductVariant;
    this.buyerAwsAccountIds = buyerAwsAccountIds;
    this.buyerAzureTenants = buyerAzureTenants;
    this.commits = commits;
    this.currency = currency;
    this.dimensions = dimensions;
    this.discount = discount;
    this.eulaType = eulaType;
    this.eulaUrl = eulaUrl;
    this.gcpMetrics = gcpMetrics;
    this.gcpPlans = gcpPlans;
    this.paymentInstallments = paymentInstallments;
    this.privateOfferUrl = privateOfferUrl;
    this.refundCancelationPolicy = refundCancelationPolicy;
    this.sellerNotes = sellerNotes;
    this.visibility = visibility;
  }

  /**
   * @return The origin pricing of Azure plan. Only applicable for Azure Marketplace plans.
   */
  @JsonProperty("azureOriginalPlan")
  public Optional<AzurePriceAndAvailabilityPrivateOfferPlan> getAzureOriginalPlan() {
    return azureOriginalPlan;
  }

  /**
   * @return The private offer for Azure Marketplace. Only applicable for Azure Marketplace private offers.
   */
  @JsonProperty("azurePrivateOffer")
  public Optional<AzureMarketplacePrivateOffer> getAzurePrivateOffer() {
    return azurePrivateOffer;
  }

  @JsonProperty("azureProductVariant")
  public Optional<AzureProductVariant> getAzureProductVariant() {
    return azureProductVariant;
  }

  /**
   * @return The buyers' AWS Account IDs of this offer.
   */
  @JsonProperty("buyerAwsAccountIds")
  public Optional<List<String>> getBuyerAwsAccountIds() {
    return buyerAwsAccountIds;
  }

  /**
   * @return The buyers' Azure tenants of this offer.
   */
  @JsonProperty("buyerAzureTenants")
  public Optional<List<AzureAudience>> getBuyerAzureTenants() {
    return buyerAzureTenants;
  }

  @JsonProperty("commits")
  public Optional<List<SharedCommitDimension>> getCommits() {
    return commits;
  }

  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  @JsonProperty("dimensions")
  public Optional<List<SharedMeteringDimension>> getDimensions() {
    return dimensions;
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
   * @return Only applicable for GCP Marketplace Offers (the default or private offer)
   */
  @JsonProperty("gcpMetrics")
  public Optional<List<SharedGcpCommerceProducerPurchaseMetric>> getGcpMetrics() {
    return gcpMetrics;
  }

  /**
   * @return Only applicable for GCP Marketplace Offers (the default or private offer).
   */
  @JsonProperty("gcpPlans")
  public Optional<List<SharedGcpPurchasePlan>> getGcpPlans() {
    return gcpPlans;
  }

  /**
   * @return For flexible payment schedule. Not empty if it is enabled.
   */
  @JsonProperty("paymentInstallments")
  public Optional<List<SharedPaymentInstallment>> getPaymentInstallments() {
    return paymentInstallments;
  }

  /**
   * @return The URL of the private offer sent to buyers to accept. Only applicable for private offer.
   */
  @JsonProperty("privateOfferUrl")
  public Optional<String> getPrivateOfferUrl() {
    return privateOfferUrl;
  }

  @JsonProperty("refundCancelationPolicy")
  public Optional<String> getRefundCancelationPolicy() {
    return refundCancelationPolicy;
  }

  @JsonProperty("sellerNotes")
  public Optional<String> getSellerNotes() {
    return sellerNotes;
  }

  /**
   * @return The default visibility of offer is PRIVATE.
   */
  @JsonProperty("visibility")
  public Optional<SharedOfferInfoVisibility> getVisibility() {
    return visibility;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedOfferInfo && equalTo((SharedOfferInfo) other);
  }

  private boolean equalTo(SharedOfferInfo other) {
    return azureOriginalPlan.equals(other.azureOriginalPlan) && azurePrivateOffer.equals(other.azurePrivateOffer) && azureProductVariant.equals(other.azureProductVariant) && buyerAwsAccountIds.equals(other.buyerAwsAccountIds) && buyerAzureTenants.equals(other.buyerAzureTenants) && commits.equals(other.commits) && currency.equals(other.currency) && dimensions.equals(other.dimensions) && discount.equals(other.discount) && eulaType.equals(other.eulaType) && eulaUrl.equals(other.eulaUrl) && gcpMetrics.equals(other.gcpMetrics) && gcpPlans.equals(other.gcpPlans) && paymentInstallments.equals(other.paymentInstallments) && privateOfferUrl.equals(other.privateOfferUrl) && refundCancelationPolicy.equals(other.refundCancelationPolicy) && sellerNotes.equals(other.sellerNotes) && visibility.equals(other.visibility);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.azureOriginalPlan, this.azurePrivateOffer, this.azureProductVariant, this.buyerAwsAccountIds, this.buyerAzureTenants, this.commits, this.currency, this.dimensions, this.discount, this.eulaType, this.eulaUrl, this.gcpMetrics, this.gcpPlans, this.paymentInstallments, this.privateOfferUrl, this.refundCancelationPolicy, this.sellerNotes, this.visibility);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedOfferInfo{" + "azureOriginalPlan: " + azureOriginalPlan + ", azurePrivateOffer: " + azurePrivateOffer + ", azureProductVariant: " + azureProductVariant + ", buyerAwsAccountIds: " + buyerAwsAccountIds + ", buyerAzureTenants: " + buyerAzureTenants + ", commits: " + commits + ", currency: " + currency + ", dimensions: " + dimensions + ", discount: " + discount + ", eulaType: " + eulaType + ", eulaUrl: " + eulaUrl + ", gcpMetrics: " + gcpMetrics + ", gcpPlans: " + gcpPlans + ", paymentInstallments: " + paymentInstallments + ", privateOfferUrl: " + privateOfferUrl + ", refundCancelationPolicy: " + refundCancelationPolicy + ", sellerNotes: " + sellerNotes + ", visibility: " + visibility + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AzurePriceAndAvailabilityPrivateOfferPlan> azureOriginalPlan = Optional.empty();

    private Optional<AzureMarketplacePrivateOffer> azurePrivateOffer = Optional.empty();

    private Optional<AzureProductVariant> azureProductVariant = Optional.empty();

    private Optional<List<String>> buyerAwsAccountIds = Optional.empty();

    private Optional<List<AzureAudience>> buyerAzureTenants = Optional.empty();

    private Optional<List<SharedCommitDimension>> commits = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<List<SharedMeteringDimension>> dimensions = Optional.empty();

    private Optional<Double> discount = Optional.empty();

    private Optional<SharedEulaType> eulaType = Optional.empty();

    private Optional<String> eulaUrl = Optional.empty();

    private Optional<List<SharedGcpCommerceProducerPurchaseMetric>> gcpMetrics = Optional.empty();

    private Optional<List<SharedGcpPurchasePlan>> gcpPlans = Optional.empty();

    private Optional<List<SharedPaymentInstallment>> paymentInstallments = Optional.empty();

    private Optional<String> privateOfferUrl = Optional.empty();

    private Optional<String> refundCancelationPolicy = Optional.empty();

    private Optional<String> sellerNotes = Optional.empty();

    private Optional<SharedOfferInfoVisibility> visibility = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedOfferInfo other) {
      azureOriginalPlan(other.getAzureOriginalPlan());
      azurePrivateOffer(other.getAzurePrivateOffer());
      azureProductVariant(other.getAzureProductVariant());
      buyerAwsAccountIds(other.getBuyerAwsAccountIds());
      buyerAzureTenants(other.getBuyerAzureTenants());
      commits(other.getCommits());
      currency(other.getCurrency());
      dimensions(other.getDimensions());
      discount(other.getDiscount());
      eulaType(other.getEulaType());
      eulaUrl(other.getEulaUrl());
      gcpMetrics(other.getGcpMetrics());
      gcpPlans(other.getGcpPlans());
      paymentInstallments(other.getPaymentInstallments());
      privateOfferUrl(other.getPrivateOfferUrl());
      refundCancelationPolicy(other.getRefundCancelationPolicy());
      sellerNotes(other.getSellerNotes());
      visibility(other.getVisibility());
      return this;
    }

    @JsonSetter(
        value = "azureOriginalPlan",
        nulls = Nulls.SKIP
    )
    public Builder azureOriginalPlan(
        Optional<AzurePriceAndAvailabilityPrivateOfferPlan> azureOriginalPlan) {
      this.azureOriginalPlan = azureOriginalPlan;
      return this;
    }

    public Builder azureOriginalPlan(AzurePriceAndAvailabilityPrivateOfferPlan azureOriginalPlan) {
      this.azureOriginalPlan = Optional.of(azureOriginalPlan);
      return this;
    }

    @JsonSetter(
        value = "azurePrivateOffer",
        nulls = Nulls.SKIP
    )
    public Builder azurePrivateOffer(Optional<AzureMarketplacePrivateOffer> azurePrivateOffer) {
      this.azurePrivateOffer = azurePrivateOffer;
      return this;
    }

    public Builder azurePrivateOffer(AzureMarketplacePrivateOffer azurePrivateOffer) {
      this.azurePrivateOffer = Optional.of(azurePrivateOffer);
      return this;
    }

    @JsonSetter(
        value = "azureProductVariant",
        nulls = Nulls.SKIP
    )
    public Builder azureProductVariant(Optional<AzureProductVariant> azureProductVariant) {
      this.azureProductVariant = azureProductVariant;
      return this;
    }

    public Builder azureProductVariant(AzureProductVariant azureProductVariant) {
      this.azureProductVariant = Optional.of(azureProductVariant);
      return this;
    }

    @JsonSetter(
        value = "buyerAwsAccountIds",
        nulls = Nulls.SKIP
    )
    public Builder buyerAwsAccountIds(Optional<List<String>> buyerAwsAccountIds) {
      this.buyerAwsAccountIds = buyerAwsAccountIds;
      return this;
    }

    public Builder buyerAwsAccountIds(List<String> buyerAwsAccountIds) {
      this.buyerAwsAccountIds = Optional.of(buyerAwsAccountIds);
      return this;
    }

    @JsonSetter(
        value = "buyerAzureTenants",
        nulls = Nulls.SKIP
    )
    public Builder buyerAzureTenants(Optional<List<AzureAudience>> buyerAzureTenants) {
      this.buyerAzureTenants = buyerAzureTenants;
      return this;
    }

    public Builder buyerAzureTenants(List<AzureAudience> buyerAzureTenants) {
      this.buyerAzureTenants = Optional.of(buyerAzureTenants);
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
        value = "gcpMetrics",
        nulls = Nulls.SKIP
    )
    public Builder gcpMetrics(Optional<List<SharedGcpCommerceProducerPurchaseMetric>> gcpMetrics) {
      this.gcpMetrics = gcpMetrics;
      return this;
    }

    public Builder gcpMetrics(List<SharedGcpCommerceProducerPurchaseMetric> gcpMetrics) {
      this.gcpMetrics = Optional.of(gcpMetrics);
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
        value = "privateOfferUrl",
        nulls = Nulls.SKIP
    )
    public Builder privateOfferUrl(Optional<String> privateOfferUrl) {
      this.privateOfferUrl = privateOfferUrl;
      return this;
    }

    public Builder privateOfferUrl(String privateOfferUrl) {
      this.privateOfferUrl = Optional.of(privateOfferUrl);
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

    @JsonSetter(
        value = "visibility",
        nulls = Nulls.SKIP
    )
    public Builder visibility(Optional<SharedOfferInfoVisibility> visibility) {
      this.visibility = visibility;
      return this;
    }

    public Builder visibility(SharedOfferInfoVisibility visibility) {
      this.visibility = Optional.of(visibility);
      return this;
    }

    public SharedOfferInfo build() {
      return new SharedOfferInfo(azureOriginalPlan, azurePrivateOffer, azureProductVariant, buyerAwsAccountIds, buyerAzureTenants, commits, currency, dimensions, discount, eulaType, eulaUrl, gcpMetrics, gcpPlans, paymentInstallments, privateOfferUrl, refundCancelationPolicy, sellerNotes, visibility);
    }
  }
}
