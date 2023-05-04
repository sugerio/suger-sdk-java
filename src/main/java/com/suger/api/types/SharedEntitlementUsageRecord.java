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
    builder = SharedEntitlementUsageRecord.Builder.class
)
public final class SharedEntitlementUsageRecord {
  private final Optional<List<Double>> amounts;

  private final Optional<String> date;

  private final Optional<List<String>> keys;

  private final Optional<List<Double>> quantities;

  private int _cachedHashCode;

  SharedEntitlementUsageRecord(Optional<List<Double>> amounts, Optional<String> date,
      Optional<List<String>> keys, Optional<List<Double>> quantities) {
    this.amounts = amounts;
    this.date = date;
    this.keys = keys;
    this.quantities = quantities;
  }

  @JsonProperty("amounts")
  public Optional<List<Double>> getAmounts() {
    return amounts;
  }

  @JsonProperty("date")
  public Optional<String> getDate() {
    return date;
  }

  @JsonProperty("keys")
  public Optional<List<String>> getKeys() {
    return keys;
  }

  @JsonProperty("quantities")
  public Optional<List<Double>> getQuantities() {
    return quantities;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedEntitlementUsageRecord && equalTo((SharedEntitlementUsageRecord) other);
  }

  private boolean equalTo(SharedEntitlementUsageRecord other) {
    return amounts.equals(other.amounts) && date.equals(other.date) && keys.equals(other.keys) && quantities.equals(other.quantities);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.amounts, this.date, this.keys, this.quantities);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedEntitlementUsageRecord{" + "amounts: " + amounts + ", date: " + date + ", keys: " + keys + ", quantities: " + quantities + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<Double>> amounts = Optional.empty();

    private Optional<String> date = Optional.empty();

    private Optional<List<String>> keys = Optional.empty();

    private Optional<List<Double>> quantities = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedEntitlementUsageRecord other) {
      amounts(other.getAmounts());
      date(other.getDate());
      keys(other.getKeys());
      quantities(other.getQuantities());
      return this;
    }

    @JsonSetter(
        value = "amounts",
        nulls = Nulls.SKIP
    )
    public Builder amounts(Optional<List<Double>> amounts) {
      this.amounts = amounts;
      return this;
    }

    public Builder amounts(List<Double> amounts) {
      this.amounts = Optional.of(amounts);
      return this;
    }

    @JsonSetter(
        value = "date",
        nulls = Nulls.SKIP
    )
    public Builder date(Optional<String> date) {
      this.date = date;
      return this;
    }

    public Builder date(String date) {
      this.date = Optional.of(date);
      return this;
    }

    @JsonSetter(
        value = "keys",
        nulls = Nulls.SKIP
    )
    public Builder keys(Optional<List<String>> keys) {
      this.keys = keys;
      return this;
    }

    public Builder keys(List<String> keys) {
      this.keys = Optional.of(keys);
      return this;
    }

    @JsonSetter(
        value = "quantities",
        nulls = Nulls.SKIP
    )
    public Builder quantities(Optional<List<Double>> quantities) {
      this.quantities = quantities;
      return this;
    }

    public Builder quantities(List<Double> quantities) {
      this.quantities = Optional.of(quantities);
      return this;
    }

    public SharedEntitlementUsageRecord build() {
      return new SharedEntitlementUsageRecord(amounts, date, keys, quantities);
    }
  }
}
