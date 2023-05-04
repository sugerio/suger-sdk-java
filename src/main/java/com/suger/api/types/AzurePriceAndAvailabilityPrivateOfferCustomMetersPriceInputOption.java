package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzurePriceAndAvailabilityPrivateOfferCustomMetersPriceInputOption {
  PER_MARKET("perMarket"),

  USD("usd");

  private final String value;

  AzurePriceAndAvailabilityPrivateOfferCustomMetersPriceInputOption(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
