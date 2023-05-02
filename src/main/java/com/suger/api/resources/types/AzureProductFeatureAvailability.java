package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzureProductFeatureAvailability.Builder.class
)
public final class AzureProductFeatureAvailability {
  private final Optional<List<AzureProductVariantCustomMeter>> customMeters;

  private final Optional<String> id;

  private final Optional<Boolean> isHidden;

  private final Optional<List<AzureMarketState>> marketStates;

  private final Optional<List<AzureMarket>> markets;

  private final Optional<List<AzureProductVariantPriceSchedule>> priceSchedules;

  private final Optional<List<AzureTypeValue>> properties;

  private final Optional<String> resourceType;

  private final Optional<List<AzureAudience>> subscriptionAudiences;

  private final Optional<List<AzureAudience>> tenantAudiences;

  private final Optional<AzureProductVariantTrial> trial;

  private final Optional<AzureProductFeatureAvailabilityVisibility> visibility;

  private int _cachedHashCode;

  AzureProductFeatureAvailability(Optional<List<AzureProductVariantCustomMeter>> customMeters,
      Optional<String> id, Optional<Boolean> isHidden,
      Optional<List<AzureMarketState>> marketStates, Optional<List<AzureMarket>> markets,
      Optional<List<AzureProductVariantPriceSchedule>> priceSchedules,
      Optional<List<AzureTypeValue>> properties, Optional<String> resourceType,
      Optional<List<AzureAudience>> subscriptionAudiences,
      Optional<List<AzureAudience>> tenantAudiences, Optional<AzureProductVariantTrial> trial,
      Optional<AzureProductFeatureAvailabilityVisibility> visibility) {
    this.customMeters = customMeters;
    this.id = id;
    this.isHidden = isHidden;
    this.marketStates = marketStates;
    this.markets = markets;
    this.priceSchedules = priceSchedules;
    this.properties = properties;
    this.resourceType = resourceType;
    this.subscriptionAudiences = subscriptionAudiences;
    this.tenantAudiences = tenantAudiences;
    this.trial = trial;
    this.visibility = visibility;
  }

  @JsonProperty("customMeters")
  public Optional<List<AzureProductVariantCustomMeter>> getCustomMeters() {
    return customMeters;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("isHidden")
  public Optional<Boolean> getIsHidden() {
    return isHidden;
  }

  @JsonProperty("marketStates")
  public Optional<List<AzureMarketState>> getMarketStates() {
    return marketStates;
  }

  @JsonProperty("markets")
  public Optional<List<AzureMarket>> getMarkets() {
    return markets;
  }

  @JsonProperty("priceSchedules")
  public Optional<List<AzureProductVariantPriceSchedule>> getPriceSchedules() {
    return priceSchedules;
  }

  @JsonProperty("properties")
  public Optional<List<AzureTypeValue>> getProperties() {
    return properties;
  }

  /**
   * @return ResourceType = FeatureAvailability
   */
  @JsonProperty("resourceType")
  public Optional<String> getResourceType() {
    return resourceType;
  }

  @JsonProperty("subscriptionAudiences")
  public Optional<List<AzureAudience>> getSubscriptionAudiences() {
    return subscriptionAudiences;
  }

  @JsonProperty("tenantAudiences")
  public Optional<List<AzureAudience>> getTenantAudiences() {
    return tenantAudiences;
  }

  @JsonProperty("trial")
  public Optional<AzureProductVariantTrial> getTrial() {
    return trial;
  }

  @JsonProperty("visibility")
  public Optional<AzureProductFeatureAvailabilityVisibility> getVisibility() {
    return visibility;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductFeatureAvailability && equalTo((AzureProductFeatureAvailability) other);
  }

  private boolean equalTo(AzureProductFeatureAvailability other) {
    return customMeters.equals(other.customMeters) && id.equals(other.id) && isHidden.equals(other.isHidden) && marketStates.equals(other.marketStates) && markets.equals(other.markets) && priceSchedules.equals(other.priceSchedules) && properties.equals(other.properties) && resourceType.equals(other.resourceType) && subscriptionAudiences.equals(other.subscriptionAudiences) && tenantAudiences.equals(other.tenantAudiences) && trial.equals(other.trial) && visibility.equals(other.visibility);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.customMeters, this.id, this.isHidden, this.marketStates, this.markets, this.priceSchedules, this.properties, this.resourceType, this.subscriptionAudiences, this.tenantAudiences, this.trial, this.visibility);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductFeatureAvailability{" + "customMeters: " + customMeters + ", id: " + id + ", isHidden: " + isHidden + ", marketStates: " + marketStates + ", markets: " + markets + ", priceSchedules: " + priceSchedules + ", properties: " + properties + ", resourceType: " + resourceType + ", subscriptionAudiences: " + subscriptionAudiences + ", tenantAudiences: " + tenantAudiences + ", trial: " + trial + ", visibility: " + visibility + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<AzureProductVariantCustomMeter>> customMeters = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<Boolean> isHidden = Optional.empty();

    private Optional<List<AzureMarketState>> marketStates = Optional.empty();

    private Optional<List<AzureMarket>> markets = Optional.empty();

    private Optional<List<AzureProductVariantPriceSchedule>> priceSchedules = Optional.empty();

    private Optional<List<AzureTypeValue>> properties = Optional.empty();

    private Optional<String> resourceType = Optional.empty();

    private Optional<List<AzureAudience>> subscriptionAudiences = Optional.empty();

    private Optional<List<AzureAudience>> tenantAudiences = Optional.empty();

    private Optional<AzureProductVariantTrial> trial = Optional.empty();

    private Optional<AzureProductFeatureAvailabilityVisibility> visibility = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductFeatureAvailability other) {
      customMeters(other.getCustomMeters());
      id(other.getId());
      isHidden(other.getIsHidden());
      marketStates(other.getMarketStates());
      markets(other.getMarkets());
      priceSchedules(other.getPriceSchedules());
      properties(other.getProperties());
      resourceType(other.getResourceType());
      subscriptionAudiences(other.getSubscriptionAudiences());
      tenantAudiences(other.getTenantAudiences());
      trial(other.getTrial());
      visibility(other.getVisibility());
      return this;
    }

    @JsonSetter(
        value = "customMeters",
        nulls = Nulls.SKIP
    )
    public Builder customMeters(Optional<List<AzureProductVariantCustomMeter>> customMeters) {
      this.customMeters = customMeters;
      return this;
    }

    public Builder customMeters(List<AzureProductVariantCustomMeter> customMeters) {
      this.customMeters = Optional.of(customMeters);
      return this;
    }

    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<String> id) {
      this.id = id;
      return this;
    }

    public Builder id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    @JsonSetter(
        value = "isHidden",
        nulls = Nulls.SKIP
    )
    public Builder isHidden(Optional<Boolean> isHidden) {
      this.isHidden = isHidden;
      return this;
    }

    public Builder isHidden(Boolean isHidden) {
      this.isHidden = Optional.of(isHidden);
      return this;
    }

    @JsonSetter(
        value = "marketStates",
        nulls = Nulls.SKIP
    )
    public Builder marketStates(Optional<List<AzureMarketState>> marketStates) {
      this.marketStates = marketStates;
      return this;
    }

    public Builder marketStates(List<AzureMarketState> marketStates) {
      this.marketStates = Optional.of(marketStates);
      return this;
    }

    @JsonSetter(
        value = "markets",
        nulls = Nulls.SKIP
    )
    public Builder markets(Optional<List<AzureMarket>> markets) {
      this.markets = markets;
      return this;
    }

    public Builder markets(List<AzureMarket> markets) {
      this.markets = Optional.of(markets);
      return this;
    }

    @JsonSetter(
        value = "priceSchedules",
        nulls = Nulls.SKIP
    )
    public Builder priceSchedules(Optional<List<AzureProductVariantPriceSchedule>> priceSchedules) {
      this.priceSchedules = priceSchedules;
      return this;
    }

    public Builder priceSchedules(List<AzureProductVariantPriceSchedule> priceSchedules) {
      this.priceSchedules = Optional.of(priceSchedules);
      return this;
    }

    @JsonSetter(
        value = "properties",
        nulls = Nulls.SKIP
    )
    public Builder properties(Optional<List<AzureTypeValue>> properties) {
      this.properties = properties;
      return this;
    }

    public Builder properties(List<AzureTypeValue> properties) {
      this.properties = Optional.of(properties);
      return this;
    }

    @JsonSetter(
        value = "resourceType",
        nulls = Nulls.SKIP
    )
    public Builder resourceType(Optional<String> resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    public Builder resourceType(String resourceType) {
      this.resourceType = Optional.of(resourceType);
      return this;
    }

    @JsonSetter(
        value = "subscriptionAudiences",
        nulls = Nulls.SKIP
    )
    public Builder subscriptionAudiences(Optional<List<AzureAudience>> subscriptionAudiences) {
      this.subscriptionAudiences = subscriptionAudiences;
      return this;
    }

    public Builder subscriptionAudiences(List<AzureAudience> subscriptionAudiences) {
      this.subscriptionAudiences = Optional.of(subscriptionAudiences);
      return this;
    }

    @JsonSetter(
        value = "tenantAudiences",
        nulls = Nulls.SKIP
    )
    public Builder tenantAudiences(Optional<List<AzureAudience>> tenantAudiences) {
      this.tenantAudiences = tenantAudiences;
      return this;
    }

    public Builder tenantAudiences(List<AzureAudience> tenantAudiences) {
      this.tenantAudiences = Optional.of(tenantAudiences);
      return this;
    }

    @JsonSetter(
        value = "trial",
        nulls = Nulls.SKIP
    )
    public Builder trial(Optional<AzureProductVariantTrial> trial) {
      this.trial = trial;
      return this;
    }

    public Builder trial(AzureProductVariantTrial trial) {
      this.trial = Optional.of(trial);
      return this;
    }

    @JsonSetter(
        value = "visibility",
        nulls = Nulls.SKIP
    )
    public Builder visibility(Optional<AzureProductFeatureAvailabilityVisibility> visibility) {
      this.visibility = visibility;
      return this;
    }

    public Builder visibility(AzureProductFeatureAvailabilityVisibility visibility) {
      this.visibility = Optional.of(visibility);
      return this;
    }

    public AzureProductFeatureAvailability build() {
      return new AzureProductFeatureAvailability(customMeters, id, isHidden, marketStates, markets, priceSchedules, properties, resourceType, subscriptionAudiences, tenantAudiences, trial, visibility);
    }
  }
}
