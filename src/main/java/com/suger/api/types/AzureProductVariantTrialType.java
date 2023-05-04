package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureProductVariantTrialType {
  NO_TRIAL("NoTrial"),

  TIMED_ACCESS("TimedAccess"),

  TIMED_USAGE("TimedUsage"),

  UNLIMITED("Unlimited");

  private final String value;

  AzureProductVariantTrialType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
