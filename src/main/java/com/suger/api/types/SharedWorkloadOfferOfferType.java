package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedWorkloadOfferOfferType {
  DEFAULT("DEFAULT"),

  CONTRACT("CONTRACT"),

  SUBSCRIPTION("SUBSCRIPTION"),

  FREE_TRIAL("FREE_TRIAL"),

  FLAT_RATE("FLAT_RATE"),

  PER_USER("PER_USER"),

  PRIVATE("PRIVATE"),

  UNKNOWN("UNKNOWN");

  private final String value;

  SharedWorkloadOfferOfferType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
