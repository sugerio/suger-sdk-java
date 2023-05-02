package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedOfferInfoVisibility {
  public static final SharedOfferInfoVisibility PUBLIC = new SharedOfferInfoVisibility(Value.PUBLIC, "PUBLIC");

  public static final SharedOfferInfoVisibility PRIVATE = new SharedOfferInfoVisibility(Value.PRIVATE, "PRIVATE");

  private final Value value;

  private final String string;

  SharedOfferInfoVisibility(Value value, String string) {
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
      || (other instanceof SharedOfferInfoVisibility && this.string.equals(((SharedOfferInfoVisibility) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case PUBLIC:
        return visitor.visitPublic();
      case PRIVATE:
        return visitor.visitPrivate();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedOfferInfoVisibility valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PUBLIC":
        return PUBLIC;
      case "PRIVATE":
        return PRIVATE;
      default:
        return new SharedOfferInfoVisibility(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PRIVATE,

    PUBLIC,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPrivate();

    T visitPublic();

    T visitUnknown(String unknownType);
  }
}
