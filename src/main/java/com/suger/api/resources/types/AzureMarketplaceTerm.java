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
    builder = AzureMarketplaceTerm.Builder.class
)
public final class AzureMarketplaceTerm {
  private final Optional<AzureMarketplaceTermType> type;

  private final Optional<Double> value;

  private int _cachedHashCode;

  AzureMarketplaceTerm(Optional<AzureMarketplaceTermType> type, Optional<Double> value) {
    this.type = type;
    this.value = value;
  }

  @JsonProperty("type")
  public Optional<AzureMarketplaceTermType> getType() {
    return type;
  }

  /**
   * @return default 0
   */
  @JsonProperty("value")
  public Optional<Double> getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureMarketplaceTerm && equalTo((AzureMarketplaceTerm) other);
  }

  private boolean equalTo(AzureMarketplaceTerm other) {
    return type.equals(other.type) && value.equals(other.value);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.value);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureMarketplaceTerm{" + "type: " + type + ", value: " + value + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AzureMarketplaceTermType> type = Optional.empty();

    private Optional<Double> value = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureMarketplaceTerm other) {
      type(other.getType());
      value(other.getValue());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<AzureMarketplaceTermType> type) {
      this.type = type;
      return this;
    }

    public Builder type(AzureMarketplaceTermType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "value",
        nulls = Nulls.SKIP
    )
    public Builder value(Optional<Double> value) {
      this.value = value;
      return this;
    }

    public Builder value(Double value) {
      this.value = Optional.of(value);
      return this;
    }

    public AzureMarketplaceTerm build() {
      return new AzureMarketplaceTerm(type, value);
    }
  }
}
