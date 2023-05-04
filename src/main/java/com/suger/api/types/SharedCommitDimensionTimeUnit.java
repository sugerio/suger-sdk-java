package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedCommitDimensionTimeUnit {
  DAY("DAY"),

  MONTH("MONTH"),

  YEAR("YEAR");

  private final String value;

  SharedCommitDimensionTimeUnit(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
