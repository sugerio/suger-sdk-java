package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedGcpCommerceProducerPriceModel {
  FREE("FREE"),

  SUBSCRIPTION("SUBSCRIPTION"),

  USAGE("USAGE"),

  SUBSCRIPTION_PLUS_USAGE("SUBSCRIPTION_PLUS_USAGE");

  private final String value;

  SharedGcpCommerceProducerPriceModel(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
