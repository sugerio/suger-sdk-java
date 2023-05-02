package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class TypesUsageRecordResultStatus {
  public static final TypesUsageRecordResultStatus CUSTOMER_NOT_SUBSCRIBED = new TypesUsageRecordResultStatus(Value.CUSTOMER_NOT_SUBSCRIBED, "CustomerNotSubscribed");

  public static final TypesUsageRecordResultStatus DUPLICATE_RECORD = new TypesUsageRecordResultStatus(Value.DUPLICATE_RECORD, "DuplicateRecord");

  public static final TypesUsageRecordResultStatus SUCCESS = new TypesUsageRecordResultStatus(Value.SUCCESS, "Success");

  private final Value value;

  private final String string;

  TypesUsageRecordResultStatus(Value value, String string) {
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
      || (other instanceof TypesUsageRecordResultStatus && this.string.equals(((TypesUsageRecordResultStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case CUSTOMER_NOT_SUBSCRIBED:
        return visitor.visitCustomerNotSubscribed();
      case DUPLICATE_RECORD:
        return visitor.visitDuplicateRecord();
      case SUCCESS:
        return visitor.visitSuccess();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static TypesUsageRecordResultStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CustomerNotSubscribed":
        return CUSTOMER_NOT_SUBSCRIBED;
      case "DuplicateRecord":
        return DUPLICATE_RECORD;
      case "Success":
        return SUCCESS;
      default:
        return new TypesUsageRecordResultStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SUCCESS,

    CUSTOMER_NOT_SUBSCRIBED,

    DUPLICATE_RECORD,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitSuccess();

    T visitCustomerNotSubscribed();

    T visitDuplicateRecord();

    T visitUnknown(String unknownType);
  }
}
