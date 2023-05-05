package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedOperationType {
  OPERATION_TYPE_TEMPORAL_WORKFLOW("TemporalWorkflow");

  private final String value;

  SharedOperationType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
