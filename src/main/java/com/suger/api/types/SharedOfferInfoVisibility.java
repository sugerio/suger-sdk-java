package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedOfferInfoVisibility {
  PRIVATE("PRIVATE"),

  PUBLIC("PUBLIC");

  private final String value;

  SharedOfferInfoVisibility(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
