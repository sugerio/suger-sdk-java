package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureMarketplaceTermType {
  DAY("day"),

  WEEK("week"),

  MONTH("month"),

  YEAR("year");

  private final String value;

  AzureMarketplaceTermType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
