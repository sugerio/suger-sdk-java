package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzurePricingUnitName {
  public static final AzurePricingUnitName TRANSACTIONS = new AzurePricingUnitName(Value.TRANSACTIONS, "transactions");

  public static final AzurePricingUnitName SHAREDCORE = new AzurePricingUnitName(Value.SHAREDCORE, "sharedcore");

  private final Value value;

  private final String string;

  AzurePricingUnitName(Value value, String string) {
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
      || (other instanceof AzurePricingUnitName && this.string.equals(((AzurePricingUnitName) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case TRANSACTIONS:
        return visitor.visitTransactions();
      case SHAREDCORE:
        return visitor.visitSharedcore();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzurePricingUnitName valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "transactions":
        return TRANSACTIONS;
      case "sharedcore":
        return SHAREDCORE;
      default:
        return new AzurePricingUnitName(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SHAREDCORE,

    TRANSACTIONS,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitSharedcore();

    T visitTransactions();

    T visitUnknown(String unknownType);
  }
}
