package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedGcpProductMarketplace {
  public static final SharedGcpProductMarketplace MARKETPLACES_GOOGLE_CLOUD = new SharedGcpProductMarketplace(Value.MARKETPLACES_GOOGLE_CLOUD, "marketplaces/google-cloud");

  private final Value value;

  private final String string;

  SharedGcpProductMarketplace(Value value, String string) {
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
      || (other instanceof SharedGcpProductMarketplace && this.string.equals(((SharedGcpProductMarketplace) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case MARKETPLACES_GOOGLE_CLOUD:
        return visitor.visitMarketplacesGoogleCloud();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedGcpProductMarketplace valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "marketplaces/google-cloud":
        return MARKETPLACES_GOOGLE_CLOUD;
      default:
        return new SharedGcpProductMarketplace(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MARKETPLACES_GOOGLE_CLOUD,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMarketplacesGoogleCloud();

    T visitUnknown(String unknownType);
  }
}
