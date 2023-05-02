package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedEntitlementTermType {
  public static final SharedEntitlementTermType SIGNUP = new SharedEntitlementTermType(Value.SIGNUP, "Signup");

  public static final SharedEntitlementTermType QUANTITY_CHANGE = new SharedEntitlementTermType(Value.QUANTITY_CHANGE, "QuantityChange");

  public static final SharedEntitlementTermType PLAN_CHANGE = new SharedEntitlementTermType(Value.PLAN_CHANGE, "PlanChange");

  public static final SharedEntitlementTermType AUTO_RENEW = new SharedEntitlementTermType(Value.AUTO_RENEW, "AutoRenew");

  public static final SharedEntitlementTermType MANUAL_RENEW = new SharedEntitlementTermType(Value.MANUAL_RENEW, "ManualRenew");

  private final Value value;

  private final String string;

  SharedEntitlementTermType(Value value, String string) {
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
      || (other instanceof SharedEntitlementTermType && this.string.equals(((SharedEntitlementTermType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case SIGNUP:
        return visitor.visitSignup();
      case QUANTITY_CHANGE:
        return visitor.visitQuantityChange();
      case PLAN_CHANGE:
        return visitor.visitPlanChange();
      case AUTO_RENEW:
        return visitor.visitAutoRenew();
      case MANUAL_RENEW:
        return visitor.visitManualRenew();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedEntitlementTermType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Signup":
        return SIGNUP;
      case "QuantityChange":
        return QUANTITY_CHANGE;
      case "PlanChange":
        return PLAN_CHANGE;
      case "AutoRenew":
        return AUTO_RENEW;
      case "ManualRenew":
        return MANUAL_RENEW;
      default:
        return new SharedEntitlementTermType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    AUTO_RENEW,

    MANUAL_RENEW,

    PLAN_CHANGE,

    QUANTITY_CHANGE,

    SIGNUP,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAutoRenew();

    T visitManualRenew();

    T visitPlanChange();

    T visitQuantityChange();

    T visitSignup();

    T visitUnknown(String unknownType);
  }
}
