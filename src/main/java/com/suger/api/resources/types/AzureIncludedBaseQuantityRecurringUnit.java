package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureIncludedBaseQuantityRecurringUnit {
  public static final AzureIncludedBaseQuantityRecurringUnit MONTHLY = new AzureIncludedBaseQuantityRecurringUnit(Value.MONTHLY, "Monthly");

  public static final AzureIncludedBaseQuantityRecurringUnit ANNUAL = new AzureIncludedBaseQuantityRecurringUnit(Value.ANNUAL, "Annual");

  private final Value value;

  private final String string;

  AzureIncludedBaseQuantityRecurringUnit(Value value, String string) {
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
      || (other instanceof AzureIncludedBaseQuantityRecurringUnit && this.string.equals(((AzureIncludedBaseQuantityRecurringUnit) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case MONTHLY:
        return visitor.visitMonthly();
      case ANNUAL:
        return visitor.visitAnnual();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureIncludedBaseQuantityRecurringUnit valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Monthly":
        return MONTHLY;
      case "Annual":
        return ANNUAL;
      default:
        return new AzureIncludedBaseQuantityRecurringUnit(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MONTHLY,

    ANNUAL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMonthly();

    T visitAnnual();

    T visitUnknown(String unknownType);
  }
}
