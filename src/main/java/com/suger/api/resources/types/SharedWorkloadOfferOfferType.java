package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedWorkloadOfferOfferType {
  public static final SharedWorkloadOfferOfferType CONTRACT = new SharedWorkloadOfferOfferType(Value.CONTRACT, "CONTRACT");

  public static final SharedWorkloadOfferOfferType DEFAULT = new SharedWorkloadOfferOfferType(Value.DEFAULT, "DEFAULT");

  public static final SharedWorkloadOfferOfferType FREE_TRIAL = new SharedWorkloadOfferOfferType(Value.FREE_TRIAL, "FREE_TRIAL");

  public static final SharedWorkloadOfferOfferType PRIVATE = new SharedWorkloadOfferOfferType(Value.PRIVATE, "PRIVATE");

  public static final SharedWorkloadOfferOfferType FLAT_RATE = new SharedWorkloadOfferOfferType(Value.FLAT_RATE, "FLAT_RATE");

  public static final SharedWorkloadOfferOfferType SUBSCRIPTION = new SharedWorkloadOfferOfferType(Value.SUBSCRIPTION, "SUBSCRIPTION");

  public static final SharedWorkloadOfferOfferType PER_USER = new SharedWorkloadOfferOfferType(Value.PER_USER, "PER_USER");

  public static final SharedWorkloadOfferOfferType UNKNOWN = new SharedWorkloadOfferOfferType(Value.UNKNOWN, "UNKNOWN");

  private final Value value;

  private final String string;

  SharedWorkloadOfferOfferType(Value value, String string) {
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
      || (other instanceof SharedWorkloadOfferOfferType && this.string.equals(((SharedWorkloadOfferOfferType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case CONTRACT:
        return visitor.visitContract();
      case DEFAULT:
        return visitor.visitDefault();
      case FREE_TRIAL:
        return visitor.visitFreeTrial();
      case PRIVATE:
        return visitor.visitPrivate();
      case FLAT_RATE:
        return visitor.visitFlatRate();
      case SUBSCRIPTION:
        return visitor.visitSubscription();
      case PER_USER:
        return visitor.visitPerUser();
      case UNKNOWN:
        return visitor.visitUnknown();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedWorkloadOfferOfferType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CONTRACT":
        return CONTRACT;
      case "DEFAULT":
        return DEFAULT;
      case "FREE_TRIAL":
        return FREE_TRIAL;
      case "PRIVATE":
        return PRIVATE;
      case "FLAT_RATE":
        return FLAT_RATE;
      case "SUBSCRIPTION":
        return SUBSCRIPTION;
      case "PER_USER":
        return PER_USER;
      case "UNKNOWN":
        return UNKNOWN;
      default:
        return new SharedWorkloadOfferOfferType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DEFAULT,

    CONTRACT,

    SUBSCRIPTION,

    FREE_TRIAL,

    FLAT_RATE,

    PER_USER,

    PRIVATE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDefault();

    T visitContract();

    T visitSubscription();

    T visitFreeTrial();

    T visitFlatRate();

    T visitPerUser();

    T visitPrivate();

    T visitUnknown();

    T visitUnknown(String unknownType);
  }
}
