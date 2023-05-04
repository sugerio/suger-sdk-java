package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzurePriceSchedulePricingModel {
  FLAT("Flat"),

  RECURRING("Recurring"),

  USAGE("Usage");

  private final String value;

  AzurePriceSchedulePricingModel(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
