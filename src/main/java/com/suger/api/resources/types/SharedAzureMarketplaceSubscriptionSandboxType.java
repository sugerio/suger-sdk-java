package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedAzureMarketplaceSubscriptionSandboxType {
  public static final SharedAzureMarketplaceSubscriptionSandboxType NONE = new SharedAzureMarketplaceSubscriptionSandboxType(Value.NONE, "None");

  public static final SharedAzureMarketplaceSubscriptionSandboxType CSP = new SharedAzureMarketplaceSubscriptionSandboxType(Value.CSP, "Csp");

  private final Value value;

  private final String string;

  SharedAzureMarketplaceSubscriptionSandboxType(Value value, String string) {
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
      || (other instanceof SharedAzureMarketplaceSubscriptionSandboxType && this.string.equals(((SharedAzureMarketplaceSubscriptionSandboxType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case NONE:
        return visitor.visitNone();
      case CSP:
        return visitor.visitCsp();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedAzureMarketplaceSubscriptionSandboxType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "None":
        return NONE;
      case "Csp":
        return CSP;
      default:
        return new SharedAzureMarketplaceSubscriptionSandboxType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    NONE,

    CSP,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitNone();

    T visitCsp();

    T visitUnknown(String unknownType);
  }
}
