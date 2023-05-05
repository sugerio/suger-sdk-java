package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedGcpMarketplaceEntitlementState {
  STATE_UNSPECIFIED("ENTITLEMENT_STATE_UNSPECIFIED"),

  ACTIVATION_REQUESTED("ENTITLEMENT_ACTIVATION_REQUESTED"),

  ACTIVE("ENTITLEMENT_ACTIVE"),

  PENDING_CANCELLATION("ENTITLEMENT_PENDING_CANCELLATION"),

  CANCELLED("ENTITLEMENT_CANCELLED"),

  PENDING_PLAN_CHANGE("ENTITLEMENT_PENDING_PLAN_CHANGE"),

  PENDING_PLAN_CHANGE_APPROVAL("ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL"),

  SUSPENDED("ENTITLEMENT_SUSPENDED");

  private final String value;

  SharedGcpMarketplaceEntitlementState(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
