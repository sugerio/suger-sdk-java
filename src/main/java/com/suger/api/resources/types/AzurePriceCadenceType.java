package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzurePriceCadenceType {
  public static final AzurePriceCadenceType YEAR = new AzurePriceCadenceType(Value.YEAR, "Year");

  public static final AzurePriceCadenceType MONTH = new AzurePriceCadenceType(Value.MONTH, "Month");

  private final Value value;

  private final String string;

  AzurePriceCadenceType(Value value, String string) {
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
      || (other instanceof AzurePriceCadenceType && this.string.equals(((AzurePriceCadenceType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case YEAR:
        return visitor.visitYear();
      case MONTH:
        return visitor.visitMonth();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzurePriceCadenceType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Year":
        return YEAR;
      case "Month":
        return MONTH;
      default:
        return new AzurePriceCadenceType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MONTH,

    YEAR,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMonth();

    T visitYear();

    T visitUnknown(String unknownType);
  }
}
