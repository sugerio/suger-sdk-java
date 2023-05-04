package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum TypesUsageRecordResultStatus {
  SUCCESS("Success"),

  CUSTOMER_NOT_SUBSCRIBED("CustomerNotSubscribed"),

  DUPLICATE_RECORD("DuplicateRecord");

  private final String value;

  TypesUsageRecordResultStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
