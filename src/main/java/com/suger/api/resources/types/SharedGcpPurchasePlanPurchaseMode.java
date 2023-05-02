package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedGcpPurchasePlanPurchaseMode {
  public static final SharedGcpPurchasePlanPurchaseMode PURCHASE_MODE_PUBLIC = new SharedGcpPurchasePlanPurchaseMode(Value.PURCHASE_MODE_PUBLIC, "PURCHASE_MODE_PUBLIC");

  private final Value value;

  private final String string;

  SharedGcpPurchasePlanPurchaseMode(Value value, String string) {
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
      || (other instanceof SharedGcpPurchasePlanPurchaseMode && this.string.equals(((SharedGcpPurchasePlanPurchaseMode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case PURCHASE_MODE_PUBLIC:
        return visitor.visitPurchaseModePublic();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedGcpPurchasePlanPurchaseMode valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PURCHASE_MODE_PUBLIC":
        return PURCHASE_MODE_PUBLIC;
      default:
        return new SharedGcpPurchasePlanPurchaseMode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PURCHASE_MODE_PUBLIC,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPurchaseModePublic();

    T visitUnknown(String unknownType);
  }
}
