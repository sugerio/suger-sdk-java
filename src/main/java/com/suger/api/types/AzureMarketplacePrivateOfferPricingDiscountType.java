package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureMarketplacePrivateOfferPricingDiscountType {
  PERCENTAGE("percentage"),

  ABSOLUTE("absolute");

  private final String value;

  AzureMarketplacePrivateOfferPricingDiscountType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
