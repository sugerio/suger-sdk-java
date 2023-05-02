package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureMarketplaceValidationLevel {
  public static final AzureMarketplaceValidationLevel WARNING = new AzureMarketplaceValidationLevel(Value.WARNING, "warning");

  public static final AzureMarketplaceValidationLevel INFORMATIONAL = new AzureMarketplaceValidationLevel(Value.INFORMATIONAL, "informational");

  private final Value value;

  private final String string;

  AzureMarketplaceValidationLevel(Value value, String string) {
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
      || (other instanceof AzureMarketplaceValidationLevel && this.string.equals(((AzureMarketplaceValidationLevel) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case WARNING:
        return visitor.visitWarning();
      case INFORMATIONAL:
        return visitor.visitInformational();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureMarketplaceValidationLevel valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "warning":
        return WARNING;
      case "informational":
        return INFORMATIONAL;
      default:
        return new AzureMarketplaceValidationLevel(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    INFORMATIONAL,

    WARNING,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitInformational();

    T visitWarning();

    T visitUnknown(String unknownType);
  }
}
