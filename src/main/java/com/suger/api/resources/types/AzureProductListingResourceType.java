package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductListingResourceType {
  public static final AzureProductListingResourceType AZURE_LISTING = new AzureProductListingResourceType(Value.AZURE_LISTING, "AzureListing");

  private final Value value;

  private final String string;

  AzureProductListingResourceType(Value value, String string) {
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
      || (other instanceof AzureProductListingResourceType && this.string.equals(((AzureProductListingResourceType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case AZURE_LISTING:
        return visitor.visitAzureListing();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductListingResourceType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "AzureListing":
        return AZURE_LISTING;
      default:
        return new AzureProductListingResourceType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    AZURE_LISTING,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAzureListing();

    T visitUnknown(String unknownType);
  }
}
