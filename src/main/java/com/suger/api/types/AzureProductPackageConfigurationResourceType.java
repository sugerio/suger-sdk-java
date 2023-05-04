package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureProductPackageConfigurationResourceType {
  AZURE_SOFTWARE_AS_A_SERVICE_PACKAGE_CONFIGURATION("AzureSoftwareAsAServicePackageConfiguration");

  private final String value;

  AzureProductPackageConfigurationResourceType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
