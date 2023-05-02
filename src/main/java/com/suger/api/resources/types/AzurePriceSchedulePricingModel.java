package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzurePriceSchedulePricingModel {
  public static final AzurePriceSchedulePricingModel FLAT = new AzurePriceSchedulePricingModel(Value.FLAT, "Flat");

  public static final AzurePriceSchedulePricingModel RECURRING = new AzurePriceSchedulePricingModel(Value.RECURRING, "Recurring");

  public static final AzurePriceSchedulePricingModel USAGE = new AzurePriceSchedulePricingModel(Value.USAGE, "Usage");

  private final Value value;

  private final String string;

  AzurePriceSchedulePricingModel(Value value, String string) {
    this.value = value;
    this.string = string;
  }

  public Value getEnumValue() {
    return value;
  }

  @Override
  @JsonValue
  public String toString() {
    return this.string;
  }

  @Override
  public boolean equals(Object other) {
    return (this == other) 
      || (other instanceof AzurePriceSchedulePricingModel && this.string.equals(((AzurePriceSchedulePricingModel) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case FLAT:
        return visitor.visitFlat();
      case RECURRING:
        return visitor.visitRecurring();
      case USAGE:
        return visitor.visitUsage();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzurePriceSchedulePricingModel valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Flat":
        return FLAT;
      case "Recurring":
        return RECURRING;
      case "Usage":
        return USAGE;
      default:
        return new AzurePriceSchedulePricingModel(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    FLAT,

    RECURRING,

    USAGE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitFlat();

    T visitRecurring();

    T visitUsage();

    T visitUnknown(String unknownType);
  }
}
