package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedGcpCommerceProducerPriceModel {
  public static final SharedGcpCommerceProducerPriceModel FREE = new SharedGcpCommerceProducerPriceModel(Value.FREE, "FREE");

  public static final SharedGcpCommerceProducerPriceModel USAGE = new SharedGcpCommerceProducerPriceModel(Value.USAGE, "USAGE");

  public static final SharedGcpCommerceProducerPriceModel SUBSCRIPTION = new SharedGcpCommerceProducerPriceModel(Value.SUBSCRIPTION, "SUBSCRIPTION");

  public static final SharedGcpCommerceProducerPriceModel SUBSCRIPTION_PLUS_USAGE = new SharedGcpCommerceProducerPriceModel(Value.SUBSCRIPTION_PLUS_USAGE, "SUBSCRIPTION_PLUS_USAGE");

  private final Value value;

  private final String string;

  SharedGcpCommerceProducerPriceModel(Value value, String string) {
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
      || (other instanceof SharedGcpCommerceProducerPriceModel && this.string.equals(((SharedGcpCommerceProducerPriceModel) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case FREE:
        return visitor.visitFree();
      case USAGE:
        return visitor.visitUsage();
      case SUBSCRIPTION:
        return visitor.visitSubscription();
      case SUBSCRIPTION_PLUS_USAGE:
        return visitor.visitSubscriptionPlusUsage();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedGcpCommerceProducerPriceModel valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "FREE":
        return FREE;
      case "USAGE":
        return USAGE;
      case "SUBSCRIPTION":
        return SUBSCRIPTION;
      case "SUBSCRIPTION_PLUS_USAGE":
        return SUBSCRIPTION_PLUS_USAGE;
      default:
        return new SharedGcpCommerceProducerPriceModel(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    FREE,

    SUBSCRIPTION,

    USAGE,

    SUBSCRIPTION_PLUS_USAGE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitFree();

    T visitSubscription();

    T visitUsage();

    T visitSubscriptionPlusUsage();

    T visitUnknown(String unknownType);
  }
}
