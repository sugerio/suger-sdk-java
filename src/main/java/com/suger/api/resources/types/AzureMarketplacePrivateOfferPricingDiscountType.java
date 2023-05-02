package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureMarketplacePrivateOfferPricingDiscountType {
  public static final AzureMarketplacePrivateOfferPricingDiscountType PERCENTAGE = new AzureMarketplacePrivateOfferPricingDiscountType(Value.PERCENTAGE, "percentage");

  public static final AzureMarketplacePrivateOfferPricingDiscountType ABSOLUTE = new AzureMarketplacePrivateOfferPricingDiscountType(Value.ABSOLUTE, "absolute");

  private final Value value;

  private final String string;

  AzureMarketplacePrivateOfferPricingDiscountType(Value value, String string) {
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
      || (other instanceof AzureMarketplacePrivateOfferPricingDiscountType && this.string.equals(((AzureMarketplacePrivateOfferPricingDiscountType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case PERCENTAGE:
        return visitor.visitPercentage();
      case ABSOLUTE:
        return visitor.visitAbsolute();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureMarketplacePrivateOfferPricingDiscountType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "percentage":
        return PERCENTAGE;
      case "absolute":
        return ABSOLUTE;
      default:
        return new AzureMarketplacePrivateOfferPricingDiscountType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PERCENTAGE,

    ABSOLUTE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPercentage();

    T visitAbsolute();

    T visitUnknown(String unknownType);
  }
}
