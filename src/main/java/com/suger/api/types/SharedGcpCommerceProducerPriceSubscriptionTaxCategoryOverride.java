package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedGcpCommerceProducerPriceSubscriptionTaxCategoryOverride {
  TAX_CATEGORY_UNSPECIFIED("TAX_CATEGORY_UNSPECIFIED");

  private final String value;

  SharedGcpCommerceProducerPriceSubscriptionTaxCategoryOverride(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
