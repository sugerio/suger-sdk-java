package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureMarketStateState {
  DISABLED("Disabled"),

  ENABLED("Enabled"),

  STOP_SELLING("StopSelling"),

  TERMINATED("Terminated");

  private final String value;

  AzureMarketStateState(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
