package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedWorkloadEntitlementStatus {
  ACTIVE("ACTIVE"),

  CANCELLED("CANCELLED"),

  SUSPENDED("SUSPENDED"),

  PENDING_START("PENDING_START"),

  UNKNOWN("UNKNOWN");

  private final String value;

  SharedWorkloadEntitlementStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
