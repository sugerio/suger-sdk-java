package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedAzureMarketplaceSubscriptionSandboxType {
  NONE("None"),

  CSP("Csp");

  private final String value;

  SharedAzureMarketplaceSubscriptionSandboxType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
