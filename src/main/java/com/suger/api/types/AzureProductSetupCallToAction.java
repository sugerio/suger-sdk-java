package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureProductSetupCallToAction {
  FREE("free"),

  FREE_TRIAL("free-trial"),

  CONTACT_ME("contact-me");

  private final String value;

  AzureProductSetupCallToAction(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
