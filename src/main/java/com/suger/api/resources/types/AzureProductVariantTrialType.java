package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductVariantTrialType {
  public static final AzureProductVariantTrialType NO_TRIAL = new AzureProductVariantTrialType(Value.NO_TRIAL, "NoTrial");

  public static final AzureProductVariantTrialType TIMED_USAGE = new AzureProductVariantTrialType(Value.TIMED_USAGE, "TimedUsage");

  public static final AzureProductVariantTrialType TIMED_ACCESS = new AzureProductVariantTrialType(Value.TIMED_ACCESS, "TimedAccess");

  public static final AzureProductVariantTrialType UNLIMITED = new AzureProductVariantTrialType(Value.UNLIMITED, "Unlimited");

  private final Value value;

  private final String string;

  AzureProductVariantTrialType(Value value, String string) {
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
      || (other instanceof AzureProductVariantTrialType && this.string.equals(((AzureProductVariantTrialType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case NO_TRIAL:
        return visitor.visitNoTrial();
      case TIMED_USAGE:
        return visitor.visitTimedUsage();
      case TIMED_ACCESS:
        return visitor.visitTimedAccess();
      case UNLIMITED:
        return visitor.visitUnlimited();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductVariantTrialType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "NoTrial":
        return NO_TRIAL;
      case "TimedUsage":
        return TIMED_USAGE;
      case "TimedAccess":
        return TIMED_ACCESS;
      case "Unlimited":
        return UNLIMITED;
      default:
        return new AzureProductVariantTrialType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    NO_TRIAL,

    TIMED_ACCESS,

    TIMED_USAGE,

    UNLIMITED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitNoTrial();

    T visitTimedAccess();

    T visitTimedUsage();

    T visitUnlimited();

    T visitUnknown(String unknownType);
  }
}
