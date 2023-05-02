package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedRevenueReportType {
  public static final SharedRevenueReportType DISBURSED_AMOUNT = new SharedRevenueReportType(Value.DISBURSED_AMOUNT, "DisbursedAmount");

  public static final SharedRevenueReportType COLLECTABLE_AMOUNT = new SharedRevenueReportType(Value.COLLECTABLE_AMOUNT, "CollectableAmount");

  public static final SharedRevenueReportType INVOICED_AMOUNT = new SharedRevenueReportType(Value.INVOICED_AMOUNT, "InvoicedAmount");

  private final Value value;

  private final String string;

  SharedRevenueReportType(Value value, String string) {
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
      || (other instanceof SharedRevenueReportType && this.string.equals(((SharedRevenueReportType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case DISBURSED_AMOUNT:
        return visitor.visitDisbursedAmount();
      case COLLECTABLE_AMOUNT:
        return visitor.visitCollectableAmount();
      case INVOICED_AMOUNT:
        return visitor.visitInvoicedAmount();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedRevenueReportType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "DisbursedAmount":
        return DISBURSED_AMOUNT;
      case "CollectableAmount":
        return COLLECTABLE_AMOUNT;
      case "InvoicedAmount":
        return INVOICED_AMOUNT;
      default:
        return new SharedRevenueReportType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    INVOICED_AMOUNT,

    COLLECTABLE_AMOUNT,

    DISBURSED_AMOUNT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitInvoicedAmount();

    T visitCollectableAmount();

    T visitDisbursedAmount();

    T visitUnknown(String unknownType);
  }
}
