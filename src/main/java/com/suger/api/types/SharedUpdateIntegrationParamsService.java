package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedUpdateIntegrationParamsService {
  MARKETPLACE("MARKETPLACE");

  private final String value;

  SharedUpdateIntegrationParamsService(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
