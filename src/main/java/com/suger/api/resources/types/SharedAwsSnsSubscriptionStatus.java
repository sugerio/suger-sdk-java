package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedAwsSnsSubscriptionStatus {
  public static final SharedAwsSnsSubscriptionStatus CONFIRMED = new SharedAwsSnsSubscriptionStatus(Value.CONFIRMED, "CONFIRMED");

  public static final SharedAwsSnsSubscriptionStatus PENDING_CONFIRMATION = new SharedAwsSnsSubscriptionStatus(Value.PENDING_CONFIRMATION, "PENDING_CONFIRMATION");

  public static final SharedAwsSnsSubscriptionStatus UNKNOWN = new SharedAwsSnsSubscriptionStatus(Value.UNKNOWN, "UNKNOWN");

  private final Value value;

  private final String string;

  SharedAwsSnsSubscriptionStatus(Value value, String string) {
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
      || (other instanceof SharedAwsSnsSubscriptionStatus && this.string.equals(((SharedAwsSnsSubscriptionStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case CONFIRMED:
        return visitor.visitConfirmed();
      case PENDING_CONFIRMATION:
        return visitor.visitPendingConfirmation();
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
  public static SharedAwsSnsSubscriptionStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CONFIRMED":
        return CONFIRMED;
      case "PENDING_CONFIRMATION":
        return PENDING_CONFIRMATION;
      case "UNKNOWN":
        return UNKNOWN;
      default:
        return new SharedAwsSnsSubscriptionStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    UNKNOWN,

    CONFIRMED,

    PENDING_CONFIRMATION
  }

  public interface Visitor<T> {
    T visitUnknown();

    T visitConfirmed();

    T visitPendingConfirmation();

    T visitUnknown(String unknownType);
  }
}
