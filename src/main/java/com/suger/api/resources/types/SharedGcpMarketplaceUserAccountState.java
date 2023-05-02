package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedGcpMarketplaceUserAccountState {
  public static final SharedGcpMarketplaceUserAccountState ACCOUNT_STATE_UNSPECIFIED = new SharedGcpMarketplaceUserAccountState(Value.ACCOUNT_STATE_UNSPECIFIED, "ACCOUNT_STATE_UNSPECIFIED");

  public static final SharedGcpMarketplaceUserAccountState ACCOUNT_ACTIVE = new SharedGcpMarketplaceUserAccountState(Value.ACCOUNT_ACTIVE, "ACCOUNT_ACTIVE");

  private final Value value;

  private final String string;

  SharedGcpMarketplaceUserAccountState(Value value, String string) {
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
      || (other instanceof SharedGcpMarketplaceUserAccountState && this.string.equals(((SharedGcpMarketplaceUserAccountState) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case ACCOUNT_STATE_UNSPECIFIED:
        return visitor.visitAccountStateUnspecified();
      case ACCOUNT_ACTIVE:
        return visitor.visitAccountActive();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedGcpMarketplaceUserAccountState valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ACCOUNT_STATE_UNSPECIFIED":
        return ACCOUNT_STATE_UNSPECIFIED;
      case "ACCOUNT_ACTIVE":
        return ACCOUNT_ACTIVE;
      default:
        return new SharedGcpMarketplaceUserAccountState(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACCOUNT_STATE_UNSPECIFIED,

    ACCOUNT_ACTIVE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAccountStateUnspecified();

    T visitAccountActive();

    T visitUnknown(String unknownType);
  }
}
