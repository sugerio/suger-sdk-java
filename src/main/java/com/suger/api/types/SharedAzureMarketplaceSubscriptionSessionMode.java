package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedAzureMarketplaceSubscriptionSessionMode {
  NONE("None"),

  DRY_RUN("DryRun");

  private final String value;

  SharedAzureMarketplaceSubscriptionSessionMode(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
