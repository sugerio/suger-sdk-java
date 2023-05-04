package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureProductVariantResourceType {
  AZURE_SKU_VARIANT("AzureSkuVariant"),

  AZURE_TEST_DRIVE_VARIANT("AzureTestDriveVariant");

  private final String value;

  AzureProductVariantResourceType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
