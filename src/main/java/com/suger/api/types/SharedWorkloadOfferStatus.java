package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedWorkloadOfferStatus {
  ACCEPTED("ACCEPTED"),

  PENDING_CREATE("PENDING_CREATE"),

  CREATE_FAILED("CREATE_FAILED"),

  CREATE_SUCCESS("CREATE_SUCCESS"),

  DRAFT("DRAFT"),

  EXPIRED("EXPIRED"),

  PENDING_ACCEPTANCE("PENDING_ACCEPTANCE"),

  PENDING_CANCEL("PENDING_CANCEL"),

  CANCEL_FAILED("CANCEL_FAILED"),

  CANCEL_SUCCESS("CANCEL_SUCCESS");

  private final String value;

  SharedWorkloadOfferStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
