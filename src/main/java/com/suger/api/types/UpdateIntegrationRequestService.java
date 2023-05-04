package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum UpdateIntegrationRequestService {
  MARKETPLACE("MARKETPLACE"),

  CRM("CRM");

  private final String value;

  UpdateIntegrationRequestService(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
