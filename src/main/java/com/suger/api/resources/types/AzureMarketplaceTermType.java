package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureMarketplaceTermType {
  public static final AzureMarketplaceTermType MONTH = new AzureMarketplaceTermType(Value.MONTH, "month");

  public static final AzureMarketplaceTermType WEEK = new AzureMarketplaceTermType(Value.WEEK, "week");

  public static final AzureMarketplaceTermType DAY = new AzureMarketplaceTermType(Value.DAY, "day");

  public static final AzureMarketplaceTermType YEAR = new AzureMarketplaceTermType(Value.YEAR, "year");

  private final Value value;

  private final String string;

  AzureMarketplaceTermType(Value value, String string) {
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
      || (other instanceof AzureMarketplaceTermType && this.string.equals(((AzureMarketplaceTermType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case MONTH:
        return visitor.visitMonth();
      case WEEK:
        return visitor.visitWeek();
      case DAY:
        return visitor.visitDay();
      case YEAR:
        return visitor.visitYear();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureMarketplaceTermType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "month":
        return MONTH;
      case "week":
        return WEEK;
      case "day":
        return DAY;
      case "year":
        return YEAR;
      default:
        return new AzureMarketplaceTermType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DAY,

    WEEK,

    MONTH,

    YEAR,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDay();

    T visitWeek();

    T visitMonth();

    T visitYear();

    T visitUnknown(String unknownType);
  }
}
