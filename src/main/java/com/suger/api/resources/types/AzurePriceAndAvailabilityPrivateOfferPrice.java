package com.suger.api.resources.types;

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
    builder = AzurePriceAndAvailabilityPrivateOfferPrice.Builder.class
)
public final class AzurePriceAndAvailabilityPrivateOfferPrice {
  private final Optional<AzurePriceAndAvailabilityPrivateOfferCustomMeters> customMeters;

  private final Optional<AzurePriceAndAvailabilityRecurrentPrice> recurrentPrice;

  private int _cachedHashCode;

  AzurePriceAndAvailabilityPrivateOfferPrice(
      Optional<AzurePriceAndAvailabilityPrivateOfferCustomMeters> customMeters,
      Optional<AzurePriceAndAvailabilityRecurrentPrice> recurrentPrice) {
    this.customMeters = customMeters;
    this.recurrentPrice = recurrentPrice;
  }

  @JsonProperty("customMeters")
  public Optional<AzurePriceAndAvailabilityPrivateOfferCustomMeters> getCustomMeters() {
    return customMeters;
  }

  @JsonProperty("recurrentPrice")
  public Optional<AzurePriceAndAvailabilityRecurrentPrice> getRecurrentPrice() {
    return recurrentPrice;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzurePriceAndAvailabilityPrivateOfferPrice && equalTo((AzurePriceAndAvailabilityPrivateOfferPrice) other);
  }

  private boolean equalTo(AzurePriceAndAvailabilityPrivateOfferPrice other) {
    return customMeters.equals(other.customMeters) && recurrentPrice.equals(other.recurrentPrice);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.customMeters, this.recurrentPrice);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzurePriceAndAvailabilityPrivateOfferPrice{" + "customMeters: " + customMeters + ", recurrentPrice: " + recurrentPrice + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AzurePriceAndAvailabilityPrivateOfferCustomMeters> customMeters = Optional.empty();

    private Optional<AzurePriceAndAvailabilityRecurrentPrice> recurrentPrice = Optional.empty();

    private Builder() {
    }

    public Builder from(AzurePriceAndAvailabilityPrivateOfferPrice other) {
      customMeters(other.getCustomMeters());
      recurrentPrice(other.getRecurrentPrice());
      return this;
    }

    @JsonSetter(
        value = "customMeters",
        nulls = Nulls.SKIP
    )
    public Builder customMeters(
        Optional<AzurePriceAndAvailabilityPrivateOfferCustomMeters> customMeters) {
      this.customMeters = customMeters;
      return this;
    }

    public Builder customMeters(AzurePriceAndAvailabilityPrivateOfferCustomMeters customMeters) {
      this.customMeters = Optional.of(customMeters);
      return this;
    }

    @JsonSetter(
        value = "recurrentPrice",
        nulls = Nulls.SKIP
    )
    public Builder recurrentPrice(
        Optional<AzurePriceAndAvailabilityRecurrentPrice> recurrentPrice) {
      this.recurrentPrice = recurrentPrice;
      return this;
    }

    public Builder recurrentPrice(AzurePriceAndAvailabilityRecurrentPrice recurrentPrice) {
      this.recurrentPrice = Optional.of(recurrentPrice);
      return this;
    }

    public AzurePriceAndAvailabilityPrivateOfferPrice build() {
      return new AzurePriceAndAvailabilityPrivateOfferPrice(customMeters, recurrentPrice);
    }
  }
}
