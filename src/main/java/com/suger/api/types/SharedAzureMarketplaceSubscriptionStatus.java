package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum SharedAzureMarketplaceSubscriptionStatus {
  NOT_STARTED("NotStarted"),

  PENDING_FULFILLMENT_START("PendingFulfillmentStart"),

  SUBSCRIBED("Subscribed"),

  SUSPENDED("Suspended"),

  UNSUBSCRIBED("Unsubscribed");

  private final String value;

  SharedAzureMarketplaceSubscriptionStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
