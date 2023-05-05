package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedEulaType {
  UNKNOWN(""),

  SCMP("SCMP"),

  ECMP("ECMP"),

  CUSTOM("CUSTOM"),

  ISV("ISV"),

  CURRENT("CURRENT");

  private final String value;

  SharedEulaType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
