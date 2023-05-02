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
    builder = AzurePrice.Builder.class
)
public final class AzurePrice {
  private final Optional<String> currencyCode;

  private final Optional<Double> openPrice;

  private final Optional<String> priceTierId;

  private int _cachedHashCode;

  AzurePrice(Optional<String> currencyCode, Optional<Double> openPrice,
      Optional<String> priceTierId) {
    this.currencyCode = currencyCode;
    this.openPrice = openPrice;
    this.priceTierId = priceTierId;
  }

  /**
   * @return ISO currency code, Three characters
   */
  @JsonProperty("currencyCode")
  public Optional<String> getCurrencyCode() {
    return currencyCode;
  }

  @JsonProperty("openPrice")
  public Optional<Double> getOpenPrice() {
    return openPrice;
  }

  @JsonProperty("priceTierID")
  public Optional<String> getPriceTierId() {
    return priceTierId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzurePrice && equalTo((AzurePrice) other);
  }

  private boolean equalTo(AzurePrice other) {
    return currencyCode.equals(other.currencyCode) && openPrice.equals(other.openPrice) && priceTierId.equals(other.priceTierId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.currencyCode, this.openPrice, this.priceTierId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzurePrice{" + "currencyCode: " + currencyCode + ", openPrice: " + openPrice + ", priceTierId: " + priceTierId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> currencyCode = Optional.empty();

    private Optional<Double> openPrice = Optional.empty();

    private Optional<String> priceTierId = Optional.empty();

    private Builder() {
    }

    public Builder from(AzurePrice other) {
      currencyCode(other.getCurrencyCode());
      openPrice(other.getOpenPrice());
      priceTierId(other.getPriceTierId());
      return this;
    }

    @JsonSetter(
        value = "currencyCode",
        nulls = Nulls.SKIP
    )
    public Builder currencyCode(Optional<String> currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    public Builder currencyCode(String currencyCode) {
      this.currencyCode = Optional.of(currencyCode);
      return this;
    }

    @JsonSetter(
        value = "openPrice",
        nulls = Nulls.SKIP
    )
    public Builder openPrice(Optional<Double> openPrice) {
      this.openPrice = openPrice;
      return this;
    }

    public Builder openPrice(Double openPrice) {
      this.openPrice = Optional.of(openPrice);
      return this;
    }

    @JsonSetter(
        value = "priceTierID",
        nulls = Nulls.SKIP
    )
    public Builder priceTierId(Optional<String> priceTierId) {
      this.priceTierId = priceTierId;
      return this;
    }

    public Builder priceTierId(String priceTierId) {
      this.priceTierId = Optional.of(priceTierId);
      return this;
    }

    public AzurePrice build() {
      return new AzurePrice(currencyCode, openPrice, priceTierId);
    }
  }
}
