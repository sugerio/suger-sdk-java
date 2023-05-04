package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedEntitlementTermType {
  AUTO_RENEW("AutoRenew"),

  MANUAL_RENEW("ManualRenew"),

  PLAN_CHANGE("PlanChange"),

  QUANTITY_CHANGE("QuantityChange"),

  SIGNUP("Signup");

  private final String value;

  SharedEntitlementTermType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
