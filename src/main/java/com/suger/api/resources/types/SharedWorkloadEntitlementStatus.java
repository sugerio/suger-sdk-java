package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedWorkloadEntitlementStatus {
  public static final SharedWorkloadEntitlementStatus CANCELLED = new SharedWorkloadEntitlementStatus(Value.CANCELLED, "CANCELLED");

  public static final SharedWorkloadEntitlementStatus SUSPENDED = new SharedWorkloadEntitlementStatus(Value.SUSPENDED, "SUSPENDED");

  public static final SharedWorkloadEntitlementStatus PENDING_START = new SharedWorkloadEntitlementStatus(Value.PENDING_START, "PENDING_START");

  public static final SharedWorkloadEntitlementStatus ACTIVE = new SharedWorkloadEntitlementStatus(Value.ACTIVE, "ACTIVE");

  public static final SharedWorkloadEntitlementStatus UNKNOWN = new SharedWorkloadEntitlementStatus(Value.UNKNOWN, "UNKNOWN");

  private final Value value;

  private final String string;

  SharedWorkloadEntitlementStatus(Value value, String string) {
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
      || (other instanceof SharedWorkloadEntitlementStatus && this.string.equals(((SharedWorkloadEntitlementStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case CANCELLED:
        return visitor.visitCancelled();
      case SUSPENDED:
        return visitor.visitSuspended();
      case PENDING_START:
        return visitor.visitPendingStart();
      case ACTIVE:
        return visitor.visitActive();
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
  public static SharedWorkloadEntitlementStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CANCELLED":
        return CANCELLED;
      case "SUSPENDED":
        return SUSPENDED;
      case "PENDING_START":
        return PENDING_START;
      case "ACTIVE":
        return ACTIVE;
      case "UNKNOWN":
        return UNKNOWN;
      default:
        return new SharedWorkloadEntitlementStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACTIVE,

    CANCELLED,

    SUSPENDED,

    PENDING_START,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitActive();

    T visitCancelled();

    T visitSuspended();

    T visitPendingStart();

    T visitUnknown();

    T visitUnknown(String unknownType);
  }
}
