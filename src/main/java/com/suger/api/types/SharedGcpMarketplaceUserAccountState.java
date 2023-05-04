package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedGcpMarketplaceUserAccountState {
  ACCOUNT_STATE_UNSPECIFIED("ACCOUNT_STATE_UNSPECIFIED"),

  ACCOUNT_ACTIVE("ACCOUNT_ACTIVE");

  private final String value;

  SharedGcpMarketplaceUserAccountState(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
