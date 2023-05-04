package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedWorkloadEntitlementTermService {
  MARKETPLACE("MARKETPLACE");

  private final String value;

  SharedWorkloadEntitlementTermService(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
