package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureMarketStateState {
  public static final AzureMarketStateState TERMINATED = new AzureMarketStateState(Value.TERMINATED, "Terminated");

  public static final AzureMarketStateState STOP_SELLING = new AzureMarketStateState(Value.STOP_SELLING, "StopSelling");

  public static final AzureMarketStateState DISABLED = new AzureMarketStateState(Value.DISABLED, "Disabled");

  public static final AzureMarketStateState ENABLED = new AzureMarketStateState(Value.ENABLED, "Enabled");

  private final Value value;

  private final String string;

  AzureMarketStateState(Value value, String string) {
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
      || (other instanceof AzureMarketStateState && this.string.equals(((AzureMarketStateState) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case TERMINATED:
        return visitor.visitTerminated();
      case STOP_SELLING:
        return visitor.visitStopSelling();
      case DISABLED:
        return visitor.visitDisabled();
      case ENABLED:
        return visitor.visitEnabled();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureMarketStateState valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Terminated":
        return TERMINATED;
      case "StopSelling":
        return STOP_SELLING;
      case "Disabled":
        return DISABLED;
      case "Enabled":
        return ENABLED;
      default:
        return new AzureMarketStateState(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DISABLED,

    ENABLED,

    STOP_SELLING,

    TERMINATED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDisabled();

    T visitEnabled();

    T visitStopSelling();

    T visitTerminated();

    T visitUnknown(String unknownType);
  }
}
