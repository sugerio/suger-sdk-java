package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem {
  READ("Read"),

  UPDATE("Update"),

  DELETE("Delete");

  private final String value;

  SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
