package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureMarketplacePrivateOfferSubState {
  public static final AzureMarketplacePrivateOfferSubState PENDING_ACCEPTANCE = new AzureMarketplacePrivateOfferSubState(Value.PENDING_ACCEPTANCE, "pendingAcceptance");

  public static final AzureMarketplacePrivateOfferSubState ACCEPTED = new AzureMarketplacePrivateOfferSubState(Value.ACCEPTED, "accepted");

  private final Value value;

  private final String string;

  AzureMarketplacePrivateOfferSubState(Value value, String string) {
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
      || (other instanceof AzureMarketplacePrivateOfferSubState && this.string.equals(((AzureMarketplacePrivateOfferSubState) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case PENDING_ACCEPTANCE:
        return visitor.visitPendingAcceptance();
      case ACCEPTED:
        return visitor.visitAccepted();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureMarketplacePrivateOfferSubState valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "pendingAcceptance":
        return PENDING_ACCEPTANCE;
      case "accepted":
        return ACCEPTED;
      default:
        return new AzureMarketplacePrivateOfferSubState(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PENDING_ACCEPTANCE,

    ACCEPTED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPendingAcceptance();

    T visitAccepted();

    T visitUnknown(String unknownType);
  }
}
