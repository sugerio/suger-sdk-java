package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedAzureMarketplaceSubscriptionStatus {
  public static final SharedAzureMarketplaceSubscriptionStatus NOT_STARTED = new SharedAzureMarketplaceSubscriptionStatus(Value.NOT_STARTED, "NotStarted");

  public static final SharedAzureMarketplaceSubscriptionStatus UNSUBSCRIBED = new SharedAzureMarketplaceSubscriptionStatus(Value.UNSUBSCRIBED, "Unsubscribed");

  public static final SharedAzureMarketplaceSubscriptionStatus PENDING_FULFILLMENT_START = new SharedAzureMarketplaceSubscriptionStatus(Value.PENDING_FULFILLMENT_START, "PendingFulfillmentStart");

  public static final SharedAzureMarketplaceSubscriptionStatus SUSPENDED = new SharedAzureMarketplaceSubscriptionStatus(Value.SUSPENDED, "Suspended");

  public static final SharedAzureMarketplaceSubscriptionStatus SUBSCRIBED = new SharedAzureMarketplaceSubscriptionStatus(Value.SUBSCRIBED, "Subscribed");

  private final Value value;

  private final String string;

  SharedAzureMarketplaceSubscriptionStatus(Value value, String string) {
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
      || (other instanceof SharedAzureMarketplaceSubscriptionStatus && this.string.equals(((SharedAzureMarketplaceSubscriptionStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case NOT_STARTED:
        return visitor.visitNotStarted();
      case UNSUBSCRIBED:
        return visitor.visitUnsubscribed();
      case PENDING_FULFILLMENT_START:
        return visitor.visitPendingFulfillmentStart();
      case SUSPENDED:
        return visitor.visitSuspended();
      case SUBSCRIBED:
        return visitor.visitSubscribed();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedAzureMarketplaceSubscriptionStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "NotStarted":
        return NOT_STARTED;
      case "Unsubscribed":
        return UNSUBSCRIBED;
      case "PendingFulfillmentStart":
        return PENDING_FULFILLMENT_START;
      case "Suspended":
        return SUSPENDED;
      case "Subscribed":
        return SUBSCRIBED;
      default:
        return new SharedAzureMarketplaceSubscriptionStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    NOT_STARTED,

    PENDING_FULFILLMENT_START,

    SUBSCRIBED,

    SUSPENDED,

    UNSUBSCRIBED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitNotStarted();

    T visitPendingFulfillmentStart();

    T visitSubscribed();

    T visitSuspended();

    T visitUnsubscribed();

    T visitUnknown(String unknownType);
  }
}
