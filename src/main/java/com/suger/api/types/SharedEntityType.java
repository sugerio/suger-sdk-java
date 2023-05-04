package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedEntityType {
  ORGANIZATION("ORGANIZATION"),

  PRODUCT("PRODUCT"),

  OFFER("OFFER"),

  ENTITLEMENT("ENTITLEMENT"),

  ENTITLEMENT_TERM("ENTITLEMENT_TERM"),

  INTEGRATION("INTEGRATION");

  private final String value;

  SharedEntityType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}