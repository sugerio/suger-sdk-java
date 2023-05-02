package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductFeatureAvailabilityVisibility {
  public static final AzureProductFeatureAvailabilityVisibility PRIVATE = new AzureProductFeatureAvailabilityVisibility(Value.PRIVATE, "Private");

  public static final AzureProductFeatureAvailabilityVisibility PUBLIC = new AzureProductFeatureAvailabilityVisibility(Value.PUBLIC, "Public");

  private final Value value;

  private final String string;

  AzureProductFeatureAvailabilityVisibility(Value value, String string) {
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
      || (other instanceof AzureProductFeatureAvailabilityVisibility && this.string.equals(((AzureProductFeatureAvailabilityVisibility) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case PRIVATE:
        return visitor.visitPrivate();
      case PUBLIC:
        return visitor.visitPublic();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductFeatureAvailabilityVisibility valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Private":
        return PRIVATE;
      case "Public":
        return PUBLIC;
      default:
        return new AzureProductFeatureAvailabilityVisibility(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PUBLIC,

    PRIVATE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPublic();

    T visitPrivate();

    T visitUnknown(String unknownType);
  }
}
