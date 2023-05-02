package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureListingContactType {
  public static final AzureListingContactType CHANNEL_MANAGER = new AzureListingContactType(Value.CHANNEL_MANAGER, "ChannelManager");

  public static final AzureListingContactType ENGINEERING = new AzureListingContactType(Value.ENGINEERING, "Engineering");

  public static final AzureListingContactType CUSTOMER_SUPPORT = new AzureListingContactType(Value.CUSTOMER_SUPPORT, "CustomerSupport");

  private final Value value;

  private final String string;

  AzureListingContactType(Value value, String string) {
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
      || (other instanceof AzureListingContactType && this.string.equals(((AzureListingContactType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case CHANNEL_MANAGER:
        return visitor.visitChannelManager();
      case ENGINEERING:
        return visitor.visitEngineering();
      case CUSTOMER_SUPPORT:
        return visitor.visitCustomerSupport();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureListingContactType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ChannelManager":
        return CHANNEL_MANAGER;
      case "Engineering":
        return ENGINEERING;
      case "CustomerSupport":
        return CUSTOMER_SUPPORT;
      default:
        return new AzureListingContactType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CUSTOMER_SUPPORT,

    ENGINEERING,

    CHANNEL_MANAGER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCustomerSupport();

    T visitEngineering();

    T visitChannelManager();

    T visitUnknown(String unknownType);
  }
}
