package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductSetupResourceType {
  public static final AzureProductSetupResourceType AZURE_PRODUCT_SETUP = new AzureProductSetupResourceType(Value.AZURE_PRODUCT_SETUP, "AzureProductSetup");

  private final Value value;

  private final String string;

  AzureProductSetupResourceType(Value value, String string) {
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
      || (other instanceof AzureProductSetupResourceType && this.string.equals(((AzureProductSetupResourceType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case AZURE_PRODUCT_SETUP:
        return visitor.visitAzureProductSetup();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductSetupResourceType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "AzureProductSetup":
        return AZURE_PRODUCT_SETUP;
      default:
        return new AzureProductSetupResourceType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    AZURE_PRODUCT_SETUP,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAzureProductSetup();

    T visitUnknown(String unknownType);
  }
}
