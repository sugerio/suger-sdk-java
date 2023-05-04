package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureProductVariantState {
  IN_ACTIVE("InActive"),

  ACTIVE("Active");

  private final String value;

  AzureProductVariantState(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
