package com.suger.api.resources.types;

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
    builder = SharedGcpCommerceProducerPriceInfo.Builder.class
)
public final class SharedGcpCommerceProducerPriceInfo {
  private final Optional<String> description;

  private final Optional<SharedGcpCommerceProducerPriceModel> priceModel;

  private final Optional<List<SharedGcpCommerceProducerPriceSubscription>> subscriptionPlans;

  private final Optional<List<SharedGcpCommerceProducerPriceUsage>> usageFees;

  private int _cachedHashCode;

  SharedGcpCommerceProducerPriceInfo(Optional<String> description,
      Optional<SharedGcpCommerceProducerPriceModel> priceModel,
      Optional<List<SharedGcpCommerceProducerPriceSubscription>> subscriptionPlans,
      Optional<List<SharedGcpCommerceProducerPriceUsage>> usageFees) {
    this.description = description;
    this.priceModel = priceModel;
    this.subscriptionPlans = subscriptionPlans;
    this.usageFees = usageFees;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("priceModel")
  public Optional<SharedGcpCommerceProducerPriceModel> getPriceModel() {
    return priceModel;
  }

  /**
   * @return Commit price plan, when priceModel = SUBSCRIPTION or SUBSCRIPTION_PLUS_USAGE.
   */
  @JsonProperty("subscriptionPlans")
  public Optional<List<SharedGcpCommerceProducerPriceSubscription>> getSubscriptionPlans() {
    return subscriptionPlans;
  }

  /**
   * @return Usage based metering plan, when priceModel =  USAGE or SUBSCRIPTION_PLUS_USAGE
   */
  @JsonProperty("usageFees")
  public Optional<List<SharedGcpCommerceProducerPriceUsage>> getUsageFees() {
    return usageFees;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerPriceInfo && equalTo((SharedGcpCommerceProducerPriceInfo) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerPriceInfo other) {
    return description.equals(other.description) && priceModel.equals(other.priceModel) && subscriptionPlans.equals(other.subscriptionPlans) && usageFees.equals(other.usageFees);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.description, this.priceModel, this.subscriptionPlans, this.usageFees);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerPriceInfo{" + "description: " + description + ", priceModel: " + priceModel + ", subscriptionPlans: " + subscriptionPlans + ", usageFees: " + usageFees + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> description = Optional.empty();

    private Optional<SharedGcpCommerceProducerPriceModel> priceModel = Optional.empty();

    private Optional<List<SharedGcpCommerceProducerPriceSubscription>> subscriptionPlans = Optional.empty();

    private Optional<List<SharedGcpCommerceProducerPriceUsage>> usageFees = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerPriceInfo other) {
      description(other.getDescription());
      priceModel(other.getPriceModel());
      subscriptionPlans(other.getSubscriptionPlans());
      usageFees(other.getUsageFees());
      return this;
    }

    @JsonSetter(
        value = "description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<String> description) {
      this.description = description;
      return this;
    }

    public Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }

    @JsonSetter(
        value = "priceModel",
        nulls = Nulls.SKIP
    )
    public Builder priceModel(Optional<SharedGcpCommerceProducerPriceModel> priceModel) {
      this.priceModel = priceModel;
      return this;
    }

    public Builder priceModel(SharedGcpCommerceProducerPriceModel priceModel) {
      this.priceModel = Optional.of(priceModel);
      return this;
    }

    @JsonSetter(
        value = "subscriptionPlans",
        nulls = Nulls.SKIP
    )
    public Builder subscriptionPlans(
        Optional<List<SharedGcpCommerceProducerPriceSubscription>> subscriptionPlans) {
      this.subscriptionPlans = subscriptionPlans;
      return this;
    }

    public Builder subscriptionPlans(
        List<SharedGcpCommerceProducerPriceSubscription> subscriptionPlans) {
      this.subscriptionPlans = Optional.of(subscriptionPlans);
      return this;
    }

    @JsonSetter(
        value = "usageFees",
        nulls = Nulls.SKIP
    )
    public Builder usageFees(Optional<List<SharedGcpCommerceProducerPriceUsage>> usageFees) {
      this.usageFees = usageFees;
      return this;
    }

    public Builder usageFees(List<SharedGcpCommerceProducerPriceUsage> usageFees) {
      this.usageFees = Optional.of(usageFees);
      return this;
    }

    public SharedGcpCommerceProducerPriceInfo build() {
      return new SharedGcpCommerceProducerPriceInfo(description, priceModel, subscriptionPlans, usageFees);
    }
  }
}
