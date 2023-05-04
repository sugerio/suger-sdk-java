package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureMarketplacePrivateOfferPricingPlanType {
  FLAT_RATE("FLAT_RATE"),

  PER_USER("PER_USER");

  private final String value;

  AzureMarketplacePrivateOfferPricingPlanType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
