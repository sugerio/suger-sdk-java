package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedGcpCommerceProducerPriceSubscription.Builder.class
)
public final class SharedGcpCommerceProducerPriceSubscription {
  private final Optional<SharedGcpCommerceProducerPriceSubscriptionPeriod> period;

  private final Optional<SharedGcpCommerceProducerPrice> price;

  private final Optional<SharedGcpCommerceProducerPriceSubscriptionTaxCategoryOverride> taxCategoryOverride;

  private int _cachedHashCode;

  SharedGcpCommerceProducerPriceSubscription(
      Optional<SharedGcpCommerceProducerPriceSubscriptionPeriod> period,
      Optional<SharedGcpCommerceProducerPrice> price,
      Optional<SharedGcpCommerceProducerPriceSubscriptionTaxCategoryOverride> taxCategoryOverride) {
    this.period = period;
    this.price = price;
    this.taxCategoryOverride = taxCategoryOverride;
  }

  @JsonProperty("period")
  public Optional<SharedGcpCommerceProducerPriceSubscriptionPeriod> getPeriod() {
    return period;
  }

  /**
   * @return the Monthly subscription fee as commit.
   */
  @JsonProperty("price")
  public Optional<SharedGcpCommerceProducerPrice> getPrice() {
    return price;
  }

  @JsonProperty("taxCategoryOverride")
  public Optional<SharedGcpCommerceProducerPriceSubscriptionTaxCategoryOverride> getTaxCategoryOverride(
      ) {
    return taxCategoryOverride;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerPriceSubscription && equalTo((SharedGcpCommerceProducerPriceSubscription) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerPriceSubscription other) {
    return period.equals(other.period) && price.equals(other.price) && taxCategoryOverride.equals(other.taxCategoryOverride);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.period, this.price, this.taxCategoryOverride);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerPriceSubscription{" + "period: " + period + ", price: " + price + ", taxCategoryOverride: " + taxCategoryOverride + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SharedGcpCommerceProducerPriceSubscriptionPeriod> period = Optional.empty();

    private Optional<SharedGcpCommerceProducerPrice> price = Optional.empty();

    private Optional<SharedGcpCommerceProducerPriceSubscriptionTaxCategoryOverride> taxCategoryOverride = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerPriceSubscription other) {
      period(other.getPeriod());
      price(other.getPrice());
      taxCategoryOverride(other.getTaxCategoryOverride());
      return this;
    }

    @JsonSetter(
        value = "period",
        nulls = Nulls.SKIP
    )
    public Builder period(Optional<SharedGcpCommerceProducerPriceSubscriptionPeriod> period) {
      this.period = period;
      return this;
    }

    public Builder period(SharedGcpCommerceProducerPriceSubscriptionPeriod period) {
      this.period = Optional.of(period);
      return this;
    }

    @JsonSetter(
        value = "price",
        nulls = Nulls.SKIP
    )
    public Builder price(Optional<SharedGcpCommerceProducerPrice> price) {
      this.price = price;
      return this;
    }

    public Builder price(SharedGcpCommerceProducerPrice price) {
      this.price = Optional.of(price);
      return this;
    }

    @JsonSetter(
        value = "taxCategoryOverride",
        nulls = Nulls.SKIP
    )
    public Builder taxCategoryOverride(
        Optional<SharedGcpCommerceProducerPriceSubscriptionTaxCategoryOverride> taxCategoryOverride) {
      this.taxCategoryOverride = taxCategoryOverride;
      return this;
    }

    public Builder taxCategoryOverride(
        SharedGcpCommerceProducerPriceSubscriptionTaxCategoryOverride taxCategoryOverride) {
      this.taxCategoryOverride = Optional.of(taxCategoryOverride);
      return this;
    }

    public SharedGcpCommerceProducerPriceSubscription build() {
      return new SharedGcpCommerceProducerPriceSubscription(period, price, taxCategoryOverride);
    }
  }
}
