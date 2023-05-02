package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedGcpCommerceProducerPriceUsageTaxCategoryOverride {
  public static final SharedGcpCommerceProducerPriceUsageTaxCategoryOverride TAX_CATEGORY_UNSPECIFIED = new SharedGcpCommerceProducerPriceUsageTaxCategoryOverride(Value.TAX_CATEGORY_UNSPECIFIED, "TAX_CATEGORY_UNSPECIFIED");

  private final Value value;

  private final String string;

  SharedGcpCommerceProducerPriceUsageTaxCategoryOverride(Value value, String string) {
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
      || (other instanceof SharedGcpCommerceProducerPriceUsageTaxCategoryOverride && this.string.equals(((SharedGcpCommerceProducerPriceUsageTaxCategoryOverride) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case TAX_CATEGORY_UNSPECIFIED:
        return visitor.visitTaxCategoryUnspecified();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedGcpCommerceProducerPriceUsageTaxCategoryOverride valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "TAX_CATEGORY_UNSPECIFIED":
        return TAX_CATEGORY_UNSPECIFIED;
      default:
        return new SharedGcpCommerceProducerPriceUsageTaxCategoryOverride(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    TAX_CATEGORY_UNSPECIFIED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitTaxCategoryUnspecified();

    T visitUnknown(String unknownType);
  }
}
