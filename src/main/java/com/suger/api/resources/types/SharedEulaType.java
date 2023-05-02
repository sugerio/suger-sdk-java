package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedEulaType {
  public static final SharedEulaType CUSTOM = new SharedEulaType(Value.CUSTOM, "CUSTOM");

  public static final SharedEulaType ISV = new SharedEulaType(Value.ISV, "ISV");

  public static final SharedEulaType ECMP = new SharedEulaType(Value.ECMP, "ECMP");

  public static final SharedEulaType CURRENT = new SharedEulaType(Value.CURRENT, "CURRENT");

  public static final SharedEulaType SCMP = new SharedEulaType(Value.SCMP, "SCMP");

  private final Value value;

  private final String string;

  SharedEulaType(Value value, String string) {
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
      || (other instanceof SharedEulaType && this.string.equals(((SharedEulaType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case CUSTOM:
        return visitor.visitCustom();
      case ISV:
        return visitor.visitIsv();
      case ECMP:
        return visitor.visitEcmp();
      case CURRENT:
        return visitor.visitCurrent();
      case SCMP:
        return visitor.visitScmp();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedEulaType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CUSTOM":
        return CUSTOM;
      case "ISV":
        return ISV;
      case "ECMP":
        return ECMP;
      case "CURRENT":
        return CURRENT;
      case "SCMP":
        return SCMP;
      default:
        return new SharedEulaType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SCMP,

    ECMP,

    CUSTOM,

    ISV,

    CURRENT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitScmp();

    T visitEcmp();

    T visitCustom();

    T visitIsv();

    T visitCurrent();

    T visitUnknown(String unknownType);
  }
}
