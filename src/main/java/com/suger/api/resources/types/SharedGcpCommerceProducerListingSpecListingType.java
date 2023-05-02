package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedGcpCommerceProducerListingSpecListingType {
  public static final SharedGcpCommerceProducerListingSpecListingType BILLING_INTEGRATED_MANAGED_SERVICE = new SharedGcpCommerceProducerListingSpecListingType(Value.BILLING_INTEGRATED_MANAGED_SERVICE, "BillingIntegratedManagedService");

  private final Value value;

  private final String string;

  SharedGcpCommerceProducerListingSpecListingType(Value value, String string) {
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
      || (other instanceof SharedGcpCommerceProducerListingSpecListingType && this.string.equals(((SharedGcpCommerceProducerListingSpecListingType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case BILLING_INTEGRATED_MANAGED_SERVICE:
        return visitor.visitBillingIntegratedManagedService();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedGcpCommerceProducerListingSpecListingType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "BillingIntegratedManagedService":
        return BILLING_INTEGRATED_MANAGED_SERVICE;
      default:
        return new SharedGcpCommerceProducerListingSpecListingType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    BILLING_INTEGRATED_MANAGED_SERVICE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitBillingIntegratedManagedService();

    T visitUnknown(String unknownType);
  }
}
