package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductVariantTrialDurationType {
  public static final AzureProductVariantTrialDurationType DAYS = new AzureProductVariantTrialDurationType(Value.DAYS, "Days");

  public static final AzureProductVariantTrialDurationType MINUTE = new AzureProductVariantTrialDurationType(Value.MINUTE, "Minute");

  public static final AzureProductVariantTrialDurationType MONTHS = new AzureProductVariantTrialDurationType(Value.MONTHS, "Months");

  private final Value value;

  private final String string;

  AzureProductVariantTrialDurationType(Value value, String string) {
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
      || (other instanceof AzureProductVariantTrialDurationType && this.string.equals(((AzureProductVariantTrialDurationType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case DAYS:
        return visitor.visitDays();
      case MINUTE:
        return visitor.visitMinute();
      case MONTHS:
        return visitor.visitMonths();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductVariantTrialDurationType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Days":
        return DAYS;
      case "Minute":
        return MINUTE;
      case "Months":
        return MONTHS;
      default:
        return new AzureProductVariantTrialDurationType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MINUTE,

    DAYS,

    MONTHS,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMinute();

    T visitDays();

    T visitMonths();

    T visitUnknown(String unknownType);
  }
}
