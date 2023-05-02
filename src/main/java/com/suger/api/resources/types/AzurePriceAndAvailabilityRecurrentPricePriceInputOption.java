package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzurePriceAndAvailabilityRecurrentPricePriceInputOption {
  public static final AzurePriceAndAvailabilityRecurrentPricePriceInputOption USD = new AzurePriceAndAvailabilityRecurrentPricePriceInputOption(Value.USD, "usd");

  public static final AzurePriceAndAvailabilityRecurrentPricePriceInputOption PER_MARKET = new AzurePriceAndAvailabilityRecurrentPricePriceInputOption(Value.PER_MARKET, "perMarket");

  private final Value value;

  private final String string;

  AzurePriceAndAvailabilityRecurrentPricePriceInputOption(Value value, String string) {
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
      || (other instanceof AzurePriceAndAvailabilityRecurrentPricePriceInputOption && this.string.equals(((AzurePriceAndAvailabilityRecurrentPricePriceInputOption) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case USD:
        return visitor.visitUsd();
      case PER_MARKET:
        return visitor.visitPerMarket();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzurePriceAndAvailabilityRecurrentPricePriceInputOption valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "usd":
        return USD;
      case "perMarket":
        return PER_MARKET;
      default:
        return new AzurePriceAndAvailabilityRecurrentPricePriceInputOption(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PER_MARKET,

    USD,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPerMarket();

    T visitUsd();

    T visitUnknown(String unknownType);
  }
}
