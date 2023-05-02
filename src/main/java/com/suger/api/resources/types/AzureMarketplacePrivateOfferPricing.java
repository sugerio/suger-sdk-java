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
    builder = AzureMarketplacePrivateOfferPricing.Builder.class
)
public final class AzureMarketplacePrivateOfferPricing {
  private final Optional<Double> discountPercentage;

  private final Optional<AzureMarketplacePrivateOfferPricingDiscountType> discountType;

  private final Optional<AzurePriceAndAvailabilityPrivateOfferPlan> originalPlan;

  private final Optional<String> plan;

  private final Optional<String> planName;

  private final Optional<AzureMarketplacePrivateOfferPricingPlanType> planType;

  private final Optional<String> priceDetails;

  private final Optional<AzurePriceAndAvailabilityPrivateOfferPlan> privateOfferPlan;

  private final Optional<String> product;

  private final Optional<String> sugerOfferId;

  private int _cachedHashCode;

  AzureMarketplacePrivateOfferPricing(Optional<Double> discountPercentage,
      Optional<AzureMarketplacePrivateOfferPricingDiscountType> discountType,
      Optional<AzurePriceAndAvailabilityPrivateOfferPlan> originalPlan, Optional<String> plan,
      Optional<String> planName, Optional<AzureMarketplacePrivateOfferPricingPlanType> planType,
      Optional<String> priceDetails,
      Optional<AzurePriceAndAvailabilityPrivateOfferPlan> privateOfferPlan,
      Optional<String> product, Optional<String> sugerOfferId) {
    this.discountPercentage = discountPercentage;
    this.discountType = discountType;
    this.originalPlan = originalPlan;
    this.plan = plan;
    this.planName = planName;
    this.planType = planType;
    this.priceDetails = priceDetails;
    this.privateOfferPlan = privateOfferPlan;
    this.product = product;
    this.sugerOfferId = sugerOfferId;
  }

  /**
   * @return between 0 and 100
   */
  @JsonProperty("discountPercentage")
  public Optional<Double> getDiscountPercentage() {
    return discountPercentage;
  }

  @JsonProperty("discountType")
  public Optional<AzureMarketplacePrivateOfferPricingDiscountType> getDiscountType() {
    return discountType;
  }

  /**
   * @return the pricing plan of the original plan.
   */
  @JsonProperty("originalPlan")
  public Optional<AzurePriceAndAvailabilityPrivateOfferPlan> getOriginalPlan() {
    return originalPlan;
  }

  /**
   * @return in format of &quot;plan/product-durable-id/plan-durable-id&quot;
   */
  @JsonProperty("plan")
  public Optional<String> getPlan() {
    return plan;
  }

  @JsonProperty("planName")
  public Optional<String> getPlanName() {
    return planName;
  }

  /**
   * @return The type of the plan, FLAT_RATE or PER_USER.
   */
  @JsonProperty("planType")
  public Optional<AzureMarketplacePrivateOfferPricingPlanType> getPlanType() {
    return planType;
  }

  @JsonProperty("priceDetails")
  public Optional<String> getPriceDetails() {
    return priceDetails;
  }

  /**
   * @return the pricing plan of the private offer
   */
  @JsonProperty("privateOfferPlan")
  public Optional<AzurePriceAndAvailabilityPrivateOfferPlan> getPrivateOfferPlan() {
    return privateOfferPlan;
  }

  /**
   * @return in format of &quot;product/product-durable-id&quot;
   */
  @JsonProperty("product")
  public Optional<String> getProduct() {
    return product;
  }

  @JsonProperty("sugerOfferId")
  public Optional<String> getSugerOfferId() {
    return sugerOfferId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureMarketplacePrivateOfferPricing && equalTo((AzureMarketplacePrivateOfferPricing) other);
  }

  private boolean equalTo(AzureMarketplacePrivateOfferPricing other) {
    return discountPercentage.equals(other.discountPercentage) && discountType.equals(other.discountType) && originalPlan.equals(other.originalPlan) && plan.equals(other.plan) && planName.equals(other.planName) && planType.equals(other.planType) && priceDetails.equals(other.priceDetails) && privateOfferPlan.equals(other.privateOfferPlan) && product.equals(other.product) && sugerOfferId.equals(other.sugerOfferId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.discountPercentage, this.discountType, this.originalPlan, this.plan, this.planName, this.planType, this.priceDetails, this.privateOfferPlan, this.product, this.sugerOfferId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureMarketplacePrivateOfferPricing{" + "discountPercentage: " + discountPercentage + ", discountType: " + discountType + ", originalPlan: " + originalPlan + ", plan: " + plan + ", planName: " + planName + ", planType: " + planType + ", priceDetails: " + priceDetails + ", privateOfferPlan: " + privateOfferPlan + ", product: " + product + ", sugerOfferId: " + sugerOfferId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Double> discountPercentage = Optional.empty();

    private Optional<AzureMarketplacePrivateOfferPricingDiscountType> discountType = Optional.empty();

    private Optional<AzurePriceAndAvailabilityPrivateOfferPlan> originalPlan = Optional.empty();

    private Optional<String> plan = Optional.empty();

    private Optional<String> planName = Optional.empty();

    private Optional<AzureMarketplacePrivateOfferPricingPlanType> planType = Optional.empty();

    private Optional<String> priceDetails = Optional.empty();

    private Optional<AzurePriceAndAvailabilityPrivateOfferPlan> privateOfferPlan = Optional.empty();

    private Optional<String> product = Optional.empty();

    private Optional<String> sugerOfferId = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureMarketplacePrivateOfferPricing other) {
      discountPercentage(other.getDiscountPercentage());
      discountType(other.getDiscountType());
      originalPlan(other.getOriginalPlan());
      plan(other.getPlan());
      planName(other.getPlanName());
      planType(other.getPlanType());
      priceDetails(other.getPriceDetails());
      privateOfferPlan(other.getPrivateOfferPlan());
      product(other.getProduct());
      sugerOfferId(other.getSugerOfferId());
      return this;
    }

    @JsonSetter(
        value = "discountPercentage",
        nulls = Nulls.SKIP
    )
    public Builder discountPercentage(Optional<Double> discountPercentage) {
      this.discountPercentage = discountPercentage;
      return this;
    }

    public Builder discountPercentage(Double discountPercentage) {
      this.discountPercentage = Optional.of(discountPercentage);
      return this;
    }

    @JsonSetter(
        value = "discountType",
        nulls = Nulls.SKIP
    )
    public Builder discountType(
        Optional<AzureMarketplacePrivateOfferPricingDiscountType> discountType) {
      this.discountType = discountType;
      return this;
    }

    public Builder discountType(AzureMarketplacePrivateOfferPricingDiscountType discountType) {
      this.discountType = Optional.of(discountType);
      return this;
    }

    @JsonSetter(
        value = "originalPlan",
        nulls = Nulls.SKIP
    )
    public Builder originalPlan(Optional<AzurePriceAndAvailabilityPrivateOfferPlan> originalPlan) {
      this.originalPlan = originalPlan;
      return this;
    }

    public Builder originalPlan(AzurePriceAndAvailabilityPrivateOfferPlan originalPlan) {
      this.originalPlan = Optional.of(originalPlan);
      return this;
    }

    @JsonSetter(
        value = "plan",
        nulls = Nulls.SKIP
    )
    public Builder plan(Optional<String> plan) {
      this.plan = plan;
      return this;
    }

    public Builder plan(String plan) {
      this.plan = Optional.of(plan);
      return this;
    }

    @JsonSetter(
        value = "planName",
        nulls = Nulls.SKIP
    )
    public Builder planName(Optional<String> planName) {
      this.planName = planName;
      return this;
    }

    public Builder planName(String planName) {
      this.planName = Optional.of(planName);
      return this;
    }

    @JsonSetter(
        value = "planType",
        nulls = Nulls.SKIP
    )
    public Builder planType(Optional<AzureMarketplacePrivateOfferPricingPlanType> planType) {
      this.planType = planType;
      return this;
    }

    public Builder planType(AzureMarketplacePrivateOfferPricingPlanType planType) {
      this.planType = Optional.of(planType);
      return this;
    }

    @JsonSetter(
        value = "priceDetails",
        nulls = Nulls.SKIP
    )
    public Builder priceDetails(Optional<String> priceDetails) {
      this.priceDetails = priceDetails;
      return this;
    }

    public Builder priceDetails(String priceDetails) {
      this.priceDetails = Optional.of(priceDetails);
      return this;
    }

    @JsonSetter(
        value = "privateOfferPlan",
        nulls = Nulls.SKIP
    )
    public Builder privateOfferPlan(
        Optional<AzurePriceAndAvailabilityPrivateOfferPlan> privateOfferPlan) {
      this.privateOfferPlan = privateOfferPlan;
      return this;
    }

    public Builder privateOfferPlan(AzurePriceAndAvailabilityPrivateOfferPlan privateOfferPlan) {
      this.privateOfferPlan = Optional.of(privateOfferPlan);
      return this;
    }

    @JsonSetter(
        value = "product",
        nulls = Nulls.SKIP
    )
    public Builder product(Optional<String> product) {
      this.product = product;
      return this;
    }

    public Builder product(String product) {
      this.product = Optional.of(product);
      return this;
    }

    @JsonSetter(
        value = "sugerOfferId",
        nulls = Nulls.SKIP
    )
    public Builder sugerOfferId(Optional<String> sugerOfferId) {
      this.sugerOfferId = sugerOfferId;
      return this;
    }

    public Builder sugerOfferId(String sugerOfferId) {
      this.sugerOfferId = Optional.of(sugerOfferId);
      return this;
    }

    public AzureMarketplacePrivateOfferPricing build() {
      return new AzureMarketplacePrivateOfferPricing(discountPercentage, discountType, originalPlan, plan, planName, planType, priceDetails, privateOfferPlan, product, sugerOfferId);
    }
  }
}
