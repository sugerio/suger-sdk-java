package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureProductListingAssetState {
  PENDING_UPLOAD("PendingUpload"),

  UPLOADED("Uploaded"),

  IN_PROCESSING("InProcessing"),

  PROCESSED("Processed"),

  PROCESS_FAILED("ProcessFailed");

  private final String value;

  AzureProductListingAssetState(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
