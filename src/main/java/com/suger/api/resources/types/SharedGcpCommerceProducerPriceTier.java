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
    builder = SharedGcpCommerceProducerPriceTier.Builder.class
)
public final class SharedGcpCommerceProducerPriceTier {
  private final Optional<Double> endUsageAmount;

  private final Optional<SharedGcpCommerceProducerPrice> price;

  private final Optional<Double> startUsageAmount;

  private int _cachedHashCode;

  SharedGcpCommerceProducerPriceTier(Optional<Double> endUsageAmount,
      Optional<SharedGcpCommerceProducerPrice> price, Optional<Double> startUsageAmount) {
    this.endUsageAmount = endUsageAmount;
    this.price = price;
    this.startUsageAmount = startUsageAmount;
  }

  /**
   * @return The usage amount below which this tier is effective.
   */
  @JsonProperty("endUsageAmount")
  public Optional<Double> getEndUsageAmount() {
    return endUsageAmount;
  }

  /**
   * @return The price of this tier
   */
  @JsonProperty("price")
  public Optional<SharedGcpCommerceProducerPrice> getPrice() {
    return price;
  }

  /**
   * @return The usage amount beyond which this tier is effective.
   */
  @JsonProperty("startUsageAmount")
  public Optional<Double> getStartUsageAmount() {
    return startUsageAmount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerPriceTier && equalTo((SharedGcpCommerceProducerPriceTier) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerPriceTier other) {
    return endUsageAmount.equals(other.endUsageAmount) && price.equals(other.price) && startUsageAmount.equals(other.startUsageAmount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.endUsageAmount, this.price, this.startUsageAmount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerPriceTier{" + "endUsageAmount: " + endUsageAmount + ", price: " + price + ", startUsageAmount: " + startUsageAmount + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Double> endUsageAmount = Optional.empty();

    private Optional<SharedGcpCommerceProducerPrice> price = Optional.empty();

    private Optional<Double> startUsageAmount = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerPriceTier other) {
      endUsageAmount(other.getEndUsageAmount());
      price(other.getPrice());
      startUsageAmount(other.getStartUsageAmount());
      return this;
    }

    @JsonSetter(
        value = "endUsageAmount",
        nulls = Nulls.SKIP
    )
    public Builder endUsageAmount(Optional<Double> endUsageAmount) {
      this.endUsageAmount = endUsageAmount;
      return this;
    }

    public Builder endUsageAmount(Double endUsageAmount) {
      this.endUsageAmount = Optional.of(endUsageAmount);
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
        value = "startUsageAmount",
        nulls = Nulls.SKIP
    )
    public Builder startUsageAmount(Optional<Double> startUsageAmount) {
      this.startUsageAmount = startUsageAmount;
      return this;
    }

    public Builder startUsageAmount(Double startUsageAmount) {
      this.startUsageAmount = Optional.of(startUsageAmount);
      return this;
    }

    public SharedGcpCommerceProducerPriceTier build() {
      return new SharedGcpCommerceProducerPriceTier(endUsageAmount, price, startUsageAmount);
    }
  }
}
