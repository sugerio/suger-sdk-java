package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedCreateIntegrationParamsPartner {
  AWS("AWS"),

  AZURE("AZURE"),

  GCP("GCP");

  private final String value;

  SharedCreateIntegrationParamsPartner(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
