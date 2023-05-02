package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedEntityType {
  public static final SharedEntityType ORGANIZATION = new SharedEntityType(Value.ORGANIZATION, "ORGANIZATION");

  public static final SharedEntityType ENTITLEMENT = new SharedEntityType(Value.ENTITLEMENT, "ENTITLEMENT");

  public static final SharedEntityType PRODUCT = new SharedEntityType(Value.PRODUCT, "PRODUCT");

  public static final SharedEntityType INTEGRATION = new SharedEntityType(Value.INTEGRATION, "INTEGRATION");

  public static final SharedEntityType OFFER = new SharedEntityType(Value.OFFER, "OFFER");

  public static final SharedEntityType ENTITLEMENT_TERM = new SharedEntityType(Value.ENTITLEMENT_TERM, "ENTITLEMENT_TERM");

  private final Value value;

  private final String string;

  SharedEntityType(Value value, String string) {
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
      || (other instanceof SharedEntityType && this.string.equals(((SharedEntityType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case ORGANIZATION:
        return visitor.visitOrganization();
      case ENTITLEMENT:
        return visitor.visitEntitlement();
      case PRODUCT:
        return visitor.visitProduct();
      case INTEGRATION:
        return visitor.visitIntegration();
      case OFFER:
        return visitor.visitOffer();
      case ENTITLEMENT_TERM:
        return visitor.visitEntitlementTerm();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedEntityType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ORGANIZATION":
        return ORGANIZATION;
      case "ENTITLEMENT":
        return ENTITLEMENT;
      case "PRODUCT":
        return PRODUCT;
      case "INTEGRATION":
        return INTEGRATION;
      case "OFFER":
        return OFFER;
      case "ENTITLEMENT_TERM":
        return ENTITLEMENT_TERM;
      default:
        return new SharedEntityType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ORGANIZATION,

    PRODUCT,

    OFFER,

    ENTITLEMENT,

    ENTITLEMENT_TERM,

    INTEGRATION,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitOrganization();

    T visitProduct();

    T visitOffer();

    T visitEntitlement();

    T visitEntitlementTerm();

    T visitIntegration();

    T visitUnknown(String unknownType);
  }
}
