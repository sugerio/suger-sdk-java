package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureProductSetupSellingOption {
  LISTING_ONLY("ListingOnly"),

  LIST_AND_SELL("ListAndSell");

  private final String value;

  AzureProductSetupSellingOption(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
