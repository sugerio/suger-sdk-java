package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedGcpMarketplaceUserAccountApprovalState {
  STATE_UNSPECIFIED("STATE_UNSPECIFIED"),

  PENDING("PENDING"),

  APPROVED("APPROVED"),

  REJECTED("REJECTED");

  private final String value;

  SharedGcpMarketplaceUserAccountApprovalState(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
