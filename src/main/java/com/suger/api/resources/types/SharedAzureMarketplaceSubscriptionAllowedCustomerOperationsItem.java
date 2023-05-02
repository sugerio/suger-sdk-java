package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem {
  public static final SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem DELETE = new SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem(Value.DELETE, "Delete");

  public static final SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem READ = new SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem(Value.READ, "Read");

  public static final SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem UPDATE = new SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem(Value.UPDATE, "Update");

  private final Value value;

  private final String string;

  SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem(Value value, String string) {
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
      || (other instanceof SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem && this.string.equals(((SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case DELETE:
        return visitor.visitDelete();
      case READ:
        return visitor.visitRead();
      case UPDATE:
        return visitor.visitUpdate();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem valueOf(
      String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Delete":
        return DELETE;
      case "Read":
        return READ;
      case "Update":
        return UPDATE;
      default:
        return new SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    READ,

    UPDATE,

    DELETE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitRead();

    T visitUpdate();

    T visitDelete();

    T visitUnknown(String unknownType);
  }
}
