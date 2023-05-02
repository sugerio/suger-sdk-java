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
    builder = SharedSalesforceSyncFilter.Builder.class
)
public final class SharedSalesforceSyncFilter {
  private final Optional<String> fieldName;

  private final Optional<String> operator;

  private final Object value;

  private int _cachedHashCode;

  SharedSalesforceSyncFilter(Optional<String> fieldName, Optional<String> operator, Object value) {
    this.fieldName = fieldName;
    this.operator = operator;
    this.value = value;
  }

  @JsonProperty("fieldName")
  public Optional<String> getFieldName() {
    return fieldName;
  }

  @JsonProperty("operator")
  public Optional<String> getOperator() {
    return operator;
  }

  @JsonProperty("value")
  public Object getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedSalesforceSyncFilter && equalTo((SharedSalesforceSyncFilter) other);
  }

  private boolean equalTo(SharedSalesforceSyncFilter other) {
    return fieldName.equals(other.fieldName) && operator.equals(other.operator) && value.equals(other.value);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.fieldName, this.operator, this.value);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedSalesforceSyncFilter{" + "fieldName: " + fieldName + ", operator: " + operator + ", value: " + value + "}";
  }

  public static ValueStage builder() {
    return new Builder();
  }

  public interface ValueStage {
    _FinalStage value(Object value);

    Builder from(SharedSalesforceSyncFilter other);
  }

  public interface _FinalStage {
    SharedSalesforceSyncFilter build();

    _FinalStage fieldName(Optional<String> fieldName);

    _FinalStage fieldName(String fieldName);

    _FinalStage operator(Optional<String> operator);

    _FinalStage operator(String operator);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements ValueStage, _FinalStage {
    private Object value;

    private Optional<String> operator = Optional.empty();

    private Optional<String> fieldName = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(SharedSalesforceSyncFilter other) {
      fieldName(other.getFieldName());
      operator(other.getOperator());
      value(other.getValue());
      return this;
    }

    @Override
    @JsonSetter("value")
    public _FinalStage value(Object value) {
      this.value = value;
      return this;
    }

    @Override
    public _FinalStage operator(String operator) {
      this.operator = Optional.of(operator);
      return this;
    }

    @Override
    @JsonSetter(
        value = "operator",
        nulls = Nulls.SKIP
    )
    public _FinalStage operator(Optional<String> operator) {
      this.operator = operator;
      return this;
    }

    @Override
    public _FinalStage fieldName(String fieldName) {
      this.fieldName = Optional.of(fieldName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "fieldName",
        nulls = Nulls.SKIP
    )
    public _FinalStage fieldName(Optional<String> fieldName) {
      this.fieldName = fieldName;
      return this;
    }

    @Override
    public SharedSalesforceSyncFilter build() {
      return new SharedSalesforceSyncFilter(fieldName, operator, value);
    }
  }
}
