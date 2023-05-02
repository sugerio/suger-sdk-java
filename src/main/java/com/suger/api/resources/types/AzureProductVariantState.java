package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductVariantState {
  public static final AzureProductVariantState IN_ACTIVE = new AzureProductVariantState(Value.IN_ACTIVE, "InActive");

  public static final AzureProductVariantState ACTIVE = new AzureProductVariantState(Value.ACTIVE, "Active");

  private final Value value;

  private final String string;

  AzureProductVariantState(Value value, String string) {
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
      || (other instanceof AzureProductVariantState && this.string.equals(((AzureProductVariantState) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case IN_ACTIVE:
        return visitor.visitInActive();
      case ACTIVE:
        return visitor.visitActive();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductVariantState valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "InActive":
        return IN_ACTIVE;
      case "Active":
        return ACTIVE;
      default:
        return new AzureProductVariantState(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    IN_ACTIVE,

    ACTIVE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitInActive();

    T visitActive();

    T visitUnknown(String unknownType);
  }
}
