package com.suger.api.types;

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
    builder = AzurePriceAndAvailabilityRecurrentPrice.Builder.class
)
public final class AzurePriceAndAvailabilityRecurrentPrice {
  private final Optional<AzurePriceAndAvailabilityRecurrentPricePriceInputOption> priceInputOption;

  private final Optional<List<AzurePriceAndAvailabilityRecurrentPriceItem>> prices;

  private int _cachedHashCode;

  AzurePriceAndAvailabilityRecurrentPrice(
      Optional<AzurePriceAndAvailabilityRecurrentPricePriceInputOption> priceInputOption,
      Optional<List<AzurePriceAndAvailabilityRecurrentPriceItem>> prices) {
    this.priceInputOption = priceInputOption;
    this.prices = prices;
  }

  /**
   * @return default &quot;usd&quot;
   */
  @JsonProperty("priceInputOption")
  public Optional<AzurePriceAndAvailabilityRecurrentPricePriceInputOption> getPriceInputOption() {
    return priceInputOption;
  }

  @JsonProperty("prices")
  public Optional<List<AzurePriceAndAvailabilityRecurrentPriceItem>> getPrices() {
    return prices;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzurePriceAndAvailabilityRecurrentPrice && equalTo((AzurePriceAndAvailabilityRecurrentPrice) other);
  }

  private boolean equalTo(AzurePriceAndAvailabilityRecurrentPrice other) {
    return priceInputOption.equals(other.priceInputOption) && prices.equals(other.prices);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.priceInputOption, this.prices);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzurePriceAndAvailabilityRecurrentPrice{" + "priceInputOption: " + priceInputOption + ", prices: " + prices + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AzurePriceAndAvailabilityRecurrentPricePriceInputOption> priceInputOption = Optional.empty();

    private Optional<List<AzurePriceAndAvailabilityRecurrentPriceItem>> prices = Optional.empty();

    private Builder() {
    }

    public Builder from(AzurePriceAndAvailabilityRecurrentPrice other) {
      priceInputOption(other.getPriceInputOption());
      prices(other.getPrices());
      return this;
    }

    @JsonSetter(
        value = "priceInputOption",
        nulls = Nulls.SKIP
    )
    public Builder priceInputOption(
        Optional<AzurePriceAndAvailabilityRecurrentPricePriceInputOption> priceInputOption) {
      this.priceInputOption = priceInputOption;
      return this;
    }

    public Builder priceInputOption(
        AzurePriceAndAvailabilityRecurrentPricePriceInputOption priceInputOption) {
      this.priceInputOption = Optional.of(priceInputOption);
      return this;
    }

    @JsonSetter(
        value = "prices",
        nulls = Nulls.SKIP
    )
    public Builder prices(Optional<List<AzurePriceAndAvailabilityRecurrentPriceItem>> prices) {
      this.prices = prices;
      return this;
    }

    public Builder prices(List<AzurePriceAndAvailabilityRecurrentPriceItem> prices) {
      this.prices = Optional.of(prices);
      return this;
    }

    public AzurePriceAndAvailabilityRecurrentPrice build() {
      return new AzurePriceAndAvailabilityRecurrentPrice(priceInputOption, prices);
    }
  }
}
