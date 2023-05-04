package com.suger.api.types;

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
    builder = AzurePriceCadence.Builder.class
)
public final class AzurePriceCadence {
  private final Optional<AzurePriceCadenceType> type;

  private final Optional<Integer> value;

  private int _cachedHashCode;

  AzurePriceCadence(Optional<AzurePriceCadenceType> type, Optional<Integer> value) {
    this.type = type;
    this.value = value;
  }

  @JsonProperty("type")
  public Optional<AzurePriceCadenceType> getType() {
    return type;
  }

  @JsonProperty("value")
  public Optional<Integer> getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzurePriceCadence && equalTo((AzurePriceCadence) other);
  }

  private boolean equalTo(AzurePriceCadence other) {
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
    return "AzurePriceCadence{" + "type: " + type + ", value: " + value + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AzurePriceCadenceType> type = Optional.empty();

    private Optional<Integer> value = Optional.empty();

    private Builder() {
    }

    public Builder from(AzurePriceCadence other) {
      type(other.getType());
      value(other.getValue());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<AzurePriceCadenceType> type) {
      this.type = type;
      return this;
    }

    public Builder type(AzurePriceCadenceType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "value",
        nulls = Nulls.SKIP
    )
    public Builder value(Optional<Integer> value) {
      this.value = value;
      return this;
    }

    public Builder value(Integer value) {
      this.value = Optional.of(value);
      return this;
    }

    public AzurePriceCadence build() {
      return new AzurePriceCadence(type, value);
    }
  }
}
