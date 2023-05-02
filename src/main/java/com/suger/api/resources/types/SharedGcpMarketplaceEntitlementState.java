package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedGcpMarketplaceEntitlementState {
  public static final SharedGcpMarketplaceEntitlementState ENTITLEMENT_ACTIVE = new SharedGcpMarketplaceEntitlementState(Value.ENTITLEMENT_ACTIVE, "ENTITLEMENT_ACTIVE");

  public static final SharedGcpMarketplaceEntitlementState ENTITLEMENT_PENDING_CANCELLATION = new SharedGcpMarketplaceEntitlementState(Value.ENTITLEMENT_PENDING_CANCELLATION, "ENTITLEMENT_PENDING_CANCELLATION");

  public static final SharedGcpMarketplaceEntitlementState ENTITLEMENT_ACTIVATION_REQUESTED = new SharedGcpMarketplaceEntitlementState(Value.ENTITLEMENT_ACTIVATION_REQUESTED, "ENTITLEMENT_ACTIVATION_REQUESTED");

  public static final SharedGcpMarketplaceEntitlementState ENTITLEMENT_CANCELLED = new SharedGcpMarketplaceEntitlementState(Value.ENTITLEMENT_CANCELLED, "ENTITLEMENT_CANCELLED");

  public static final SharedGcpMarketplaceEntitlementState ENTITLEMENT_SUSPENDED = new SharedGcpMarketplaceEntitlementState(Value.ENTITLEMENT_SUSPENDED, "ENTITLEMENT_SUSPENDED");

  public static final SharedGcpMarketplaceEntitlementState ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL = new SharedGcpMarketplaceEntitlementState(Value.ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL, "ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL");

  public static final SharedGcpMarketplaceEntitlementState ENTITLEMENT_STATE_UNSPECIFIED = new SharedGcpMarketplaceEntitlementState(Value.ENTITLEMENT_STATE_UNSPECIFIED, "ENTITLEMENT_STATE_UNSPECIFIED");

  public static final SharedGcpMarketplaceEntitlementState ENTITLEMENT_PENDING_PLAN_CHANGE = new SharedGcpMarketplaceEntitlementState(Value.ENTITLEMENT_PENDING_PLAN_CHANGE, "ENTITLEMENT_PENDING_PLAN_CHANGE");

  private final Value value;

  private final String string;

  SharedGcpMarketplaceEntitlementState(Value value, String string) {
    this.value = value;
    this.string = string;
  }

  public Value getEnumValue() {
    return value;
  }

  @Override
  @JsonValue
  public String toString() {
    return this.string;
  }

  @Override
  public boolean equals(Object other) {
    return (this == other) 
      || (other instanceof SharedGcpMarketplaceEntitlementState && this.string.equals(((SharedGcpMarketplaceEntitlementState) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case ENTITLEMENT_ACTIVE:
        return visitor.visitEntitlementActive();
      case ENTITLEMENT_PENDING_CANCELLATION:
        return visitor.visitEntitlementPendingCancellation();
      case ENTITLEMENT_ACTIVATION_REQUESTED:
        return visitor.visitEntitlementActivationRequested();
      case ENTITLEMENT_CANCELLED:
        return visitor.visitEntitlementCancelled();
      case ENTITLEMENT_SUSPENDED:
        return visitor.visitEntitlementSuspended();
      case ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL:
        return visitor.visitEntitlementPendingPlanChangeApproval();
      case ENTITLEMENT_STATE_UNSPECIFIED:
        return visitor.visitEntitlementStateUnspecified();
      case ENTITLEMENT_PENDING_PLAN_CHANGE:
        return visitor.visitEntitlementPendingPlanChange();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedGcpMarketplaceEntitlementState valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ENTITLEMENT_ACTIVE":
        return ENTITLEMENT_ACTIVE;
      case "ENTITLEMENT_PENDING_CANCELLATION":
        return ENTITLEMENT_PENDING_CANCELLATION;
      case "ENTITLEMENT_ACTIVATION_REQUESTED":
        return ENTITLEMENT_ACTIVATION_REQUESTED;
      case "ENTITLEMENT_CANCELLED":
        return ENTITLEMENT_CANCELLED;
      case "ENTITLEMENT_SUSPENDED":
        return ENTITLEMENT_SUSPENDED;
      case "ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL":
        return ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL;
      case "ENTITLEMENT_STATE_UNSPECIFIED":
        return ENTITLEMENT_STATE_UNSPECIFIED;
      case "ENTITLEMENT_PENDING_PLAN_CHANGE":
        return ENTITLEMENT_PENDING_PLAN_CHANGE;
      default:
        return new SharedGcpMarketplaceEntitlementState(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ENTITLEMENT_STATE_UNSPECIFIED,

    ENTITLEMENT_ACTIVATION_REQUESTED,

    ENTITLEMENT_ACTIVE,

    ENTITLEMENT_PENDING_CANCELLATION,

    ENTITLEMENT_CANCELLED,

    ENTITLEMENT_PENDING_PLAN_CHANGE,

    ENTITLEMENT_PENDING_PLAN_CHANGE_APPROVAL,

    ENTITLEMENT_SUSPENDED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitEntitlementStateUnspecified();

    T visitEntitlementActivationRequested();

    T visitEntitlementActive();

    T visitEntitlementPendingCancellation();

    T visitEntitlementCancelled();

    T visitEntitlementPendingPlanChange();

    T visitEntitlementPendingPlanChangeApproval();

    T visitEntitlementSuspended();

    T visitUnknown(String unknownType);
  }
}
