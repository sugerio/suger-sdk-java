package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedGcpMarketplaceEntitlementState {
  ENTITLEMENT_STATE_UNSPECIFIED("ENTITLEMENT_STATE_UNSPECIFIED"),

  ENTITLEMENT_ACTIVATION_REQUESTED("ENTITLEMENT_ACTIVATION_REQUESTED"),

  ENTITLEMENT_ACTIVE("ENTITLEMENT_ACTIVE"),

  ENTITLEMENT_PENDING_CANCELLATION("ENTITLEMENT_PENDING_CANCELLATION"),

  ENTITLEMENT_CANCELLED("ENTITLEMENT_CANCELLED"),

  ENTITLEMENT_PENDING_PLAN_CHANGE("ENTITLEMENT_PENDING_PLAN_CHANGE"),

  ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL("ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL"),

  ENTITLEMENT_SUSPENDED("ENTITLEMENT_SUSPENDED");

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
