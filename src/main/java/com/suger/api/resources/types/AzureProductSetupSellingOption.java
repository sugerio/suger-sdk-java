package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductSetupSellingOption {
  public static final AzureProductSetupSellingOption LISTING_ONLY = new AzureProductSetupSellingOption(Value.LISTING_ONLY, "ListingOnly");

  public static final AzureProductSetupSellingOption LIST_AND_SELL = new AzureProductSetupSellingOption(Value.LIST_AND_SELL, "ListAndSell");

  private final Value value;

  private final String string;

  AzureProductSetupSellingOption(Value value, String string) {
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
      || (other instanceof AzureProductSetupSellingOption && this.string.equals(((AzureProductSetupSellingOption) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case LISTING_ONLY:
        return visitor.visitListingOnly();
      case LIST_AND_SELL:
        return visitor.visitListAndSell();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductSetupSellingOption valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ListingOnly":
        return LISTING_ONLY;
      case "ListAndSell":
        return LIST_AND_SELL;
      default:
        return new AzureProductSetupSellingOption(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    LISTING_ONLY,

    LIST_AND_SELL,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitListingOnly();

    T visitListAndSell();

    T visitUnknown(String unknownType);
  }
}
