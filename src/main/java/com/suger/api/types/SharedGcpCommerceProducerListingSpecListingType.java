package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedGcpCommerceProducerListingSpecListingType {
  BILLING_INTEGRATED_MANAGED_SERVICE("BillingIntegratedManagedService");

  private final String value;

  SharedGcpCommerceProducerListingSpecListingType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
