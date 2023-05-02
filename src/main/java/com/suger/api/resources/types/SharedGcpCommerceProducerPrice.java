package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedGcpCommerceProducerPrice.Builder.class
)
public final class SharedGcpCommerceProducerPrice {
  private final Optional<String> currencyCode;

  private final Optional<Integer> nanos;

  private final Optional<Integer> units;

  private int _cachedHashCode;

  SharedGcpCommerceProducerPrice(Optional<String> currencyCode, Optional<Integer> nanos,
      Optional<Integer> units) {
    this.currencyCode = currencyCode;
    this.nanos = nanos;
    this.units = units;
  }

  /**
   * @return ISO currency code, Three UPPER_CASE characters
   */
  @JsonProperty("currencyCode")
  public Optional<String> getCurrencyCode() {
    return currencyCode;
  }

  /**
   * @return Decimal part of the price. For example, 2000000 = 0.002, 200000000 = 0.2
   */
  @JsonProperty("nanos")
  public Optional<Integer> getNanos() {
    return nanos;
  }

  /**
   * @return Integer part of the price.
   */
  @JsonProperty("units")
  public Optional<Integer> getUnits() {
    return units;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerPrice && equalTo((SharedGcpCommerceProducerPrice) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerPrice other) {
    return currencyCode.equals(other.currencyCode) && nanos.equals(other.nanos) && units.equals(other.units);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.currencyCode, this.nanos, this.units);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerPrice{" + "currencyCode: " + currencyCode + ", nanos: " + nanos + ", units: " + units + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> currencyCode = Optional.empty();

    private Optional<Integer> nanos = Optional.empty();

    private Optional<Integer> units = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerPrice other) {
      currencyCode(other.getCurrencyCode());
      nanos(other.getNanos());
      units(other.getUnits());
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
        value = "nanos",
        nulls = Nulls.SKIP
    )
    public Builder nanos(Optional<Integer> nanos) {
      this.nanos = nanos;
      return this;
    }

    public Builder nanos(Integer nanos) {
      this.nanos = Optional.of(nanos);
      return this;
    }

    @JsonSetter(
        value = "units",
        nulls = Nulls.SKIP
    )
    public Builder units(Optional<Integer> units) {
      this.units = units;
      return this;
    }

    public Builder units(Integer units) {
      this.units = Optional.of(units);
      return this;
    }

    public SharedGcpCommerceProducerPrice build() {
      return new SharedGcpCommerceProducerPrice(currencyCode, nanos, units);
    }
  }
}
