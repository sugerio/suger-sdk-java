package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedNotificationEventAction {
  ACCEPT("ACCEPT"),

  CREATE("CREATE"),

  DELETE("DELETE"),

  CANCEL("CANCEL"),

  PENDING_CANCEL("PENDING_CANCEL"),

  EXPIRE("EXPIRE"),

  REINSTATE("REINSTATE"),

  SUSPEND("SUSPEND"),

  UPDATE("UPDATE"),

  NOTIFY_CONTACTS("NOTIFY_CONTACTS"),

  TEST("TEST");

  private final String value;

  SharedNotificationEventAction(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
