package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedAzureMarketplaceSubscriptionSessionMode {
  public static final SharedAzureMarketplaceSubscriptionSessionMode NONE = new SharedAzureMarketplaceSubscriptionSessionMode(Value.NONE, "None");

  public static final SharedAzureMarketplaceSubscriptionSessionMode DRY_RUN = new SharedAzureMarketplaceSubscriptionSessionMode(Value.DRY_RUN, "DryRun");

  private final Value value;

  private final String string;

  SharedAzureMarketplaceSubscriptionSessionMode(Value value, String string) {
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
      || (other instanceof SharedAzureMarketplaceSubscriptionSessionMode && this.string.equals(((SharedAzureMarketplaceSubscriptionSessionMode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case NONE:
        return visitor.visitNone();
      case DRY_RUN:
        return visitor.visitDryRun();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedAzureMarketplaceSubscriptionSessionMode valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "None":
        return NONE;
      case "DryRun":
        return DRY_RUN;
      default:
        return new SharedAzureMarketplaceSubscriptionSessionMode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    NONE,

    DRY_RUN,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitNone();

    T visitDryRun();

    T visitUnknown(String unknownType);
  }
}
