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
    builder = AzureTypeValue.Builder.class
)
public final class AzureTypeValue {
  private final Optional<String> type;

  private final Optional<String> value;

  private int _cachedHashCode;

  AzureTypeValue(Optional<String> type, Optional<String> value) {
    this.type = type;
    this.value = value;
  }

  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  @JsonProperty("value")
  public Optional<String> getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureTypeValue && equalTo((AzureTypeValue) other);
  }

  private boolean equalTo(AzureTypeValue other) {
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
    return "AzureTypeValue{" + "type: " + type + ", value: " + value + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> type = Optional.empty();

    private Optional<String> value = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureTypeValue other) {
      type(other.getType());
      value(other.getValue());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<String> type) {
      this.type = type;
      return this;
    }

    public Builder type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "value",
        nulls = Nulls.SKIP
    )
    public Builder value(Optional<String> value) {
      this.value = value;
      return this;
    }

    public Builder value(String value) {
      this.value = Optional.of(value);
      return this;
    }

    public AzureTypeValue build() {
      return new AzureTypeValue(type, value);
    }
  }
}
