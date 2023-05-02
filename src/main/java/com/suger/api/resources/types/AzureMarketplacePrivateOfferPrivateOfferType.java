package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureMarketplacePrivateOfferPrivateOfferType {
  public static final AzureMarketplacePrivateOfferPrivateOfferType CSP_PROMOTION = new AzureMarketplacePrivateOfferPrivateOfferType(Value.CSP_PROMOTION, "cspPromotion");

  public static final AzureMarketplacePrivateOfferPrivateOfferType CUSTOMER_PROMOTION = new AzureMarketplacePrivateOfferPrivateOfferType(Value.CUSTOMER_PROMOTION, "customerPromotion");

  private final Value value;

  private final String string;

  AzureMarketplacePrivateOfferPrivateOfferType(Value value, String string) {
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
      || (other instanceof AzureMarketplacePrivateOfferPrivateOfferType && this.string.equals(((AzureMarketplacePrivateOfferPrivateOfferType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case CSP_PROMOTION:
        return visitor.visitCspPromotion();
      case CUSTOMER_PROMOTION:
        return visitor.visitCustomerPromotion();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureMarketplacePrivateOfferPrivateOfferType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "cspPromotion":
        return CSP_PROMOTION;
      case "customerPromotion":
        return CUSTOMER_PROMOTION;
      default:
        return new AzureMarketplacePrivateOfferPrivateOfferType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CUSTOMER_PROMOTION,

    CSP_PROMOTION,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCustomerPromotion();

    T visitCspPromotion();

    T visitUnknown(String unknownType);
  }
}
