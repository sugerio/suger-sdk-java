package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductVariantResourceType {
  public static final AzureProductVariantResourceType AZURE_TEST_DRIVE_VARIANT = new AzureProductVariantResourceType(Value.AZURE_TEST_DRIVE_VARIANT, "AzureTestDriveVariant");

  public static final AzureProductVariantResourceType AZURE_SKU_VARIANT = new AzureProductVariantResourceType(Value.AZURE_SKU_VARIANT, "AzureSkuVariant");

  private final Value value;

  private final String string;

  AzureProductVariantResourceType(Value value, String string) {
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
      || (other instanceof AzureProductVariantResourceType && this.string.equals(((AzureProductVariantResourceType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case AZURE_TEST_DRIVE_VARIANT:
        return visitor.visitAzureTestDriveVariant();
      case AZURE_SKU_VARIANT:
        return visitor.visitAzureSkuVariant();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductVariantResourceType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "AzureTestDriveVariant":
        return AZURE_TEST_DRIVE_VARIANT;
      case "AzureSkuVariant":
        return AZURE_SKU_VARIANT;
      default:
        return new AzureProductVariantResourceType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    AZURE_SKU_VARIANT,

    AZURE_TEST_DRIVE_VARIANT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAzureSkuVariant();

    T visitAzureTestDriveVariant();

    T visitUnknown(String unknownType);
  }
}
