package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedValueType {
  UNSPECIFIED("VALUE_TYPE_UNSPECIFIED"),

  BOOL("BOOL"),

  INT_64("INT64"),

  DOUBLE("DOUBLE"),

  STRING("STRING"),

  DISTRIBUTION("DISTRIBUTION"),

  MONEY("MONEY");

  private final String value;

  SharedValueType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
