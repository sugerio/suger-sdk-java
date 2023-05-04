package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureProductSubmissionSubState {
  IN_DRAFT("InDraft"),

  SUBMITTED("Submitted"),

  FAILED("Failed"),

  FAILED_IN_CERTIFICATION("FailedInCertification"),

  READY_TO_PUBLISH("ReadyToPublish"),

  PUBLISHING("Publishing"),

  PUBLISHED("Published"),

  IN_STORE("InStore");

  private final String value;

  AzureProductSubmissionSubState(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
