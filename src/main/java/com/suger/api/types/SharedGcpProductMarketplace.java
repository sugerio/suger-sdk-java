package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedGcpProductMarketplace {
  MARKETPLACES_GOOGLE_CLOUD("marketplaces/google-cloud");

  private final String value;

  SharedGcpProductMarketplace(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
