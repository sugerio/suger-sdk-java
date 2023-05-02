package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedWorkloadEntitlementTermService {
  public static final SharedWorkloadEntitlementTermService MARKETPLACE = new SharedWorkloadEntitlementTermService(Value.MARKETPLACE, "MARKETPLACE");

  private final Value value;

  private final String string;

  SharedWorkloadEntitlementTermService(Value value, String string) {
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
      || (other instanceof SharedWorkloadEntitlementTermService && this.string.equals(((SharedWorkloadEntitlementTermService) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case MARKETPLACE:
        return visitor.visitMarketplace();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedWorkloadEntitlementTermService valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "MARKETPLACE":
        return MARKETPLACE;
      default:
        return new SharedWorkloadEntitlementTermService(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MARKETPLACE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMarketplace();

    T visitUnknown(String unknownType);
  }
}
