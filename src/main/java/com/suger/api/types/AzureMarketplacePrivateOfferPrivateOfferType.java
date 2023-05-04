package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureMarketplacePrivateOfferPrivateOfferType {
  CUSTOMER_PROMOTION("customerPromotion"),

  CSP_PROMOTION("cspPromotion");

  private final String value;

  AzureMarketplacePrivateOfferPrivateOfferType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
