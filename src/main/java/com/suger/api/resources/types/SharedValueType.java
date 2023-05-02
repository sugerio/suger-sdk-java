package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedValueType {
  public static final SharedValueType INT_64 = new SharedValueType(Value.INT_64, "INT64");

  public static final SharedValueType DISTRIBUTION = new SharedValueType(Value.DISTRIBUTION, "DISTRIBUTION");

  public static final SharedValueType DOUBLE = new SharedValueType(Value.DOUBLE, "DOUBLE");

  public static final SharedValueType VALUE_TYPE_UNSPECIFIED = new SharedValueType(Value.VALUE_TYPE_UNSPECIFIED, "VALUE_TYPE_UNSPECIFIED");

  public static final SharedValueType STRING = new SharedValueType(Value.STRING, "STRING");

  public static final SharedValueType BOOL = new SharedValueType(Value.BOOL, "BOOL");

  public static final SharedValueType MONEY = new SharedValueType(Value.MONEY, "MONEY");

  private final Value value;

  private final String string;

  SharedValueType(Value value, String string) {
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
      || (other instanceof SharedValueType && this.string.equals(((SharedValueType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case INT_64:
        return visitor.visitInt64();
      case DISTRIBUTION:
        return visitor.visitDistribution();
      case DOUBLE:
        return visitor.visitDouble();
      case VALUE_TYPE_UNSPECIFIED:
        return visitor.visitValueTypeUnspecified();
      case STRING:
        return visitor.visitString();
      case BOOL:
        return visitor.visitBool();
      case MONEY:
        return visitor.visitMoney();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedValueType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "INT64":
        return INT_64;
      case "DISTRIBUTION":
        return DISTRIBUTION;
      case "DOUBLE":
        return DOUBLE;
      case "VALUE_TYPE_UNSPECIFIED":
        return VALUE_TYPE_UNSPECIFIED;
      case "STRING":
        return STRING;
      case "BOOL":
        return BOOL;
      case "MONEY":
        return MONEY;
      default:
        return new SharedValueType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    VALUE_TYPE_UNSPECIFIED,

    BOOL,

    INT_64,

    DOUBLE,

    STRING,

    DISTRIBUTION,

    MONEY,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitValueTypeUnspecified();

    T visitBool();

    T visitInt64();

    T visitDouble();

    T visitString();

    T visitDistribution();

    T visitMoney();

    T visitUnknown(String unknownType);
  }
}
