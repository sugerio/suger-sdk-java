package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureProductVariantTrialDurationType {
  MINUTE("Minute"),

  DAYS("Days"),

  MONTHS("Months");

  private final String value;

  AzureProductVariantTrialDurationType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
