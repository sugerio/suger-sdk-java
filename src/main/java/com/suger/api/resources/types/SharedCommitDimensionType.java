package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedCommitDimensionType {
  public static final SharedCommitDimensionType FLAT_RATE = new SharedCommitDimensionType(Value.FLAT_RATE, "FLAT_RATE");

  public static final SharedCommitDimensionType PER_USER = new SharedCommitDimensionType(Value.PER_USER, "PER_USER");

  private final Value value;

  private final String string;

  SharedCommitDimensionType(Value value, String string) {
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
      || (other instanceof SharedCommitDimensionType && this.string.equals(((SharedCommitDimensionType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case FLAT_RATE:
        return visitor.visitFlatRate();
      case PER_USER:
        return visitor.visitPerUser();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedCommitDimensionType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "FLAT_RATE":
        return FLAT_RATE;
      case "PER_USER":
        return PER_USER;
      default:
        return new SharedCommitDimensionType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    FLAT_RATE,

    PER_USER,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitFlatRate();

    T visitPerUser();

    T visitUnknown(String unknownType);
  }
}
