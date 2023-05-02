package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedGcpCommerceProducerPriceSubscriptionPeriod {
  public static final SharedGcpCommerceProducerPriceSubscriptionPeriod ONE_YEAR = new SharedGcpCommerceProducerPriceSubscriptionPeriod(Value.ONE_YEAR, "ONE_YEAR");

  private final Value value;

  private final String string;

  SharedGcpCommerceProducerPriceSubscriptionPeriod(Value value, String string) {
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
      || (other instanceof SharedGcpCommerceProducerPriceSubscriptionPeriod && this.string.equals(((SharedGcpCommerceProducerPriceSubscriptionPeriod) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case ONE_YEAR:
        return visitor.visitOneYear();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedGcpCommerceProducerPriceSubscriptionPeriod valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ONE_YEAR":
        return ONE_YEAR;
      default:
        return new SharedGcpCommerceProducerPriceSubscriptionPeriod(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ONE_YEAR,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitOneYear();

    T visitUnknown(String unknownType);
  }
}
