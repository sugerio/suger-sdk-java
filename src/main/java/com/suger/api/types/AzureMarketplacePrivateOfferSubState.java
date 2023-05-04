package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureMarketplacePrivateOfferSubState {
  PENDING_ACCEPTANCE("pendingAcceptance"),

  ACCEPTED("accepted");

  private final String value;

  AzureMarketplacePrivateOfferSubState(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
