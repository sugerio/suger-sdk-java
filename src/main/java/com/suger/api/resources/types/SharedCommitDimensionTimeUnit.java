package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedCommitDimensionTimeUnit {
  public static final SharedCommitDimensionTimeUnit MONTH = new SharedCommitDimensionTimeUnit(Value.MONTH, "MONTH");

  public static final SharedCommitDimensionTimeUnit YEAR = new SharedCommitDimensionTimeUnit(Value.YEAR, "YEAR");

  public static final SharedCommitDimensionTimeUnit DAY = new SharedCommitDimensionTimeUnit(Value.DAY, "DAY");

  private final Value value;

  private final String string;

  SharedCommitDimensionTimeUnit(Value value, String string) {
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
      || (other instanceof SharedCommitDimensionTimeUnit && this.string.equals(((SharedCommitDimensionTimeUnit) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case MONTH:
        return visitor.visitMonth();
      case YEAR:
        return visitor.visitYear();
      case DAY:
        return visitor.visitDay();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedCommitDimensionTimeUnit valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "MONTH":
        return MONTH;
      case "YEAR":
        return YEAR;
      case "DAY":
        return DAY;
      default:
        return new SharedCommitDimensionTimeUnit(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DAY,

    MONTH,

    YEAR,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDay();

    T visitMonth();

    T visitYear();

    T visitUnknown(String unknownType);
  }
}
