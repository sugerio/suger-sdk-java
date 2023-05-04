package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedGcpPurchasePlanPurchaseMode {
  PURCHASE_MODE_PUBLIC("PURCHASE_MODE_PUBLIC");

  private final String value;

  SharedGcpPurchasePlanPurchaseMode(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
