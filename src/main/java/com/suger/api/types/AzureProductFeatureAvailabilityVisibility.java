package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureProductFeatureAvailabilityVisibility {
  PUBLIC("Public"),

  PRIVATE("Private");

  private final String value;

  AzureProductFeatureAvailabilityVisibility(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
