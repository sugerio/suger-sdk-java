package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedNotificationEventStatus {
  SCHEDULED("SCHEDULED"),

  PENDING("PENDING"),

  DONE("DONE"),

  FAILED("FAILED");

  private final String value;

  SharedNotificationEventStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
