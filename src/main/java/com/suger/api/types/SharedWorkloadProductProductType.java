package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedWorkloadProductProductType {
  UNKNOWN("UNKNOWN"),

  SUBSCRIPTION("SUBSCRIPTION"),

  CONTRACT("CONTRACT"),

  FLAT_RATE("FLAT_RATE"),

  PER_USER("PER_USER"),

  USAGE_BASED("USAGE_BASED");

  private final String value;

  SharedWorkloadProductProductType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
