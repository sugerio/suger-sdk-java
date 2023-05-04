package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedAwsSnsSubscriptionStatus {
  UNKNOWN("UNKNOWN"),

  CONFIRMED("CONFIRMED"),

  PENDING_CONFIRMATION("PENDING_CONFIRMATION");

  private final String value;

  SharedAwsSnsSubscriptionStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
