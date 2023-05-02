package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureMarketplacePrivateOfferState {
  public static final AzureMarketplacePrivateOfferState DRAFT = new AzureMarketplacePrivateOfferState(Value.DRAFT, "draft");

  public static final AzureMarketplacePrivateOfferState LIVE = new AzureMarketplacePrivateOfferState(Value.LIVE, "live");

  public static final AzureMarketplacePrivateOfferState WITHDRAWN = new AzureMarketplacePrivateOfferState(Value.WITHDRAWN, "withdrawn");

  public static final AzureMarketplacePrivateOfferState DELETED = new AzureMarketplacePrivateOfferState(Value.DELETED, "deleted");

  private final Value value;

  private final String string;

  AzureMarketplacePrivateOfferState(Value value, String string) {
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
      || (other instanceof AzureMarketplacePrivateOfferState && this.string.equals(((AzureMarketplacePrivateOfferState) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case DRAFT:
        return visitor.visitDraft();
      case LIVE:
        return visitor.visitLive();
      case WITHDRAWN:
        return visitor.visitWithdrawn();
      case DELETED:
        return visitor.visitDeleted();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureMarketplacePrivateOfferState valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "draft":
        return DRAFT;
      case "live":
        return LIVE;
      case "withdrawn":
        return WITHDRAWN;
      case "deleted":
        return DELETED;
      default:
        return new AzureMarketplacePrivateOfferState(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    DRAFT,

    LIVE,

    WITHDRAWN,

    DELETED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitDraft();

    T visitLive();

    T visitWithdrawn();

    T visitDeleted();

    T visitUnknown(String unknownType);
  }
}
