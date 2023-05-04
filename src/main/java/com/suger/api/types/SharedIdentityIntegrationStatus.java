package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedIdentityIntegrationStatus {
  CREATED("CREATED"),

  VERIFIED("VERIFIED"),

  NOT_VERIFIED("NOT_VERIFIED");

  private final String value;

  SharedIdentityIntegrationStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
