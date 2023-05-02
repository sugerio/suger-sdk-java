package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedNotificationEventStatus {
  public static final SharedNotificationEventStatus PENDING = new SharedNotificationEventStatus(Value.PENDING, "PENDING");

  public static final SharedNotificationEventStatus FAILED = new SharedNotificationEventStatus(Value.FAILED, "FAILED");

  public static final SharedNotificationEventStatus SCHEDULED = new SharedNotificationEventStatus(Value.SCHEDULED, "SCHEDULED");

  public static final SharedNotificationEventStatus DONE = new SharedNotificationEventStatus(Value.DONE, "DONE");

  private final Value value;

  private final String string;

  SharedNotificationEventStatus(Value value, String string) {
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
      || (other instanceof SharedNotificationEventStatus && this.string.equals(((SharedNotificationEventStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case PENDING:
        return visitor.visitPending();
      case FAILED:
        return visitor.visitFailed();
      case SCHEDULED:
        return visitor.visitScheduled();
      case DONE:
        return visitor.visitDone();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedNotificationEventStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PENDING":
        return PENDING;
      case "FAILED":
        return FAILED;
      case "SCHEDULED":
        return SCHEDULED;
      case "DONE":
        return DONE;
      default:
        return new SharedNotificationEventStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SCHEDULED,

    PENDING,

    DONE,

    FAILED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitScheduled();

    T visitPending();

    T visitDone();

    T visitFailed();

    T visitUnknown(String unknownType);
  }
}
