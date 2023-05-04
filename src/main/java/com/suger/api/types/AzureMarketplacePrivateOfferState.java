package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureMarketplacePrivateOfferState {
  DRAFT("draft"),

  LIVE("live"),

  WITHDRAWN("withdrawn"),

  DELETED("deleted");

  private final String value;

  AzureMarketplacePrivateOfferState(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
