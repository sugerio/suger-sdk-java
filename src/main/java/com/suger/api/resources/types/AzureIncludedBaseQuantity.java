package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzureIncludedBaseQuantity.Builder.class
)
public final class AzureIncludedBaseQuantity {
  private final Optional<Boolean> isInfinite;

  private final Optional<Double> quantity;

  private final Optional<AzureIncludedBaseQuantityRecurringUnit> recurringUnit;

  private int _cachedHashCode;

  AzureIncludedBaseQuantity(Optional<Boolean> isInfinite, Optional<Double> quantity,
      Optional<AzureIncludedBaseQuantityRecurringUnit> recurringUnit) {
    this.isInfinite = isInfinite;
    this.quantity = quantity;
    this.recurringUnit = recurringUnit;
  }

  @JsonProperty("isInfinite")
  public Optional<Boolean> getIsInfinite() {
    return isInfinite;
  }

  @JsonProperty("quantity")
  public Optional<Double> getQuantity() {
    return quantity;
  }

  @JsonProperty("recurringUnit")
  public Optional<AzureIncludedBaseQuantityRecurringUnit> getRecurringUnit() {
    return recurringUnit;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureIncludedBaseQuantity && equalTo((AzureIncludedBaseQuantity) other);
  }

  private boolean equalTo(AzureIncludedBaseQuantity other) {
    return isInfinite.equals(other.isInfinite) && quantity.equals(other.quantity) && recurringUnit.equals(other.recurringUnit);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.isInfinite, this.quantity, this.recurringUnit);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureIncludedBaseQuantity{" + "isInfinite: " + isInfinite + ", quantity: " + quantity + ", recurringUnit: " + recurringUnit + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Boolean> isInfinite = Optional.empty();

    private Optional<Double> quantity = Optional.empty();

    private Optional<AzureIncludedBaseQuantityRecurringUnit> recurringUnit = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureIncludedBaseQuantity other) {
      isInfinite(other.getIsInfinite());
      quantity(other.getQuantity());
      recurringUnit(other.getRecurringUnit());
      return this;
    }

    @JsonSetter(
        value = "isInfinite",
        nulls = Nulls.SKIP
    )
    public Builder isInfinite(Optional<Boolean> isInfinite) {
      this.isInfinite = isInfinite;
      return this;
    }

    public Builder isInfinite(Boolean isInfinite) {
      this.isInfinite = Optional.of(isInfinite);
      return this;
    }

    @JsonSetter(
        value = "quantity",
        nulls = Nulls.SKIP
    )
    public Builder quantity(Optional<Double> quantity) {
      this.quantity = quantity;
      return this;
    }

    public Builder quantity(Double quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    @JsonSetter(
        value = "recurringUnit",
        nulls = Nulls.SKIP
    )
    public Builder recurringUnit(Optional<AzureIncludedBaseQuantityRecurringUnit> recurringUnit) {
      this.recurringUnit = recurringUnit;
      return this;
    }

    public Builder recurringUnit(AzureIncludedBaseQuantityRecurringUnit recurringUnit) {
      this.recurringUnit = Optional.of(recurringUnit);
      return this;
    }

    public AzureIncludedBaseQuantity build() {
      return new AzureIncludedBaseQuantity(isInfinite, quantity, recurringUnit);
    }
  }
}
