package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedWorkloadProductProductType {
  public static final SharedWorkloadProductProductType USAGE_BASED = new SharedWorkloadProductProductType(Value.USAGE_BASED, "USAGE_BASED");

  public static final SharedWorkloadProductProductType CONTRACT = new SharedWorkloadProductProductType(Value.CONTRACT, "CONTRACT");

  public static final SharedWorkloadProductProductType FLAT_RATE = new SharedWorkloadProductProductType(Value.FLAT_RATE, "FLAT_RATE");

  public static final SharedWorkloadProductProductType SUBSCRIPTION = new SharedWorkloadProductProductType(Value.SUBSCRIPTION, "SUBSCRIPTION");

  public static final SharedWorkloadProductProductType PER_USER = new SharedWorkloadProductProductType(Value.PER_USER, "PER_USER");

  public static final SharedWorkloadProductProductType UNKNOWN = new SharedWorkloadProductProductType(Value.UNKNOWN, "UNKNOWN");

  private final Value value;

  private final String string;

  SharedWorkloadProductProductType(Value value, String string) {
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
      || (other instanceof SharedWorkloadProductProductType && this.string.equals(((SharedWorkloadProductProductType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case USAGE_BASED:
        return visitor.visitUsageBased();
      case CONTRACT:
        return visitor.visitContract();
      case FLAT_RATE:
        return visitor.visitFlatRate();
      case SUBSCRIPTION:
        return visitor.visitSubscription();
      case PER_USER:
        return visitor.visitPerUser();
      case UNKNOWN:
        return visitor.visitUnknown();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedWorkloadProductProductType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "USAGE_BASED":
        return USAGE_BASED;
      case "CONTRACT":
        return CONTRACT;
      case "FLAT_RATE":
        return FLAT_RATE;
      case "SUBSCRIPTION":
        return SUBSCRIPTION;
      case "PER_USER":
        return PER_USER;
      case "UNKNOWN":
        return UNKNOWN;
      default:
        return new SharedWorkloadProductProductType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    UNKNOWN,

    SUBSCRIPTION,

    CONTRACT,

    FLAT_RATE,

    PER_USER,

    USAGE_BASED
  }

  public interface Visitor<T> {
    T visitUnknown();

    T visitSubscription();

    T visitContract();

    T visitFlatRate();

    T visitPerUser();

    T visitUsageBased();

    T visitUnknown(String unknownType);
  }
}
