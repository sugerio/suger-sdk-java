package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductPackageConfigurationResourceType {
  public static final AzureProductPackageConfigurationResourceType AZURE_SOFTWARE_AS_A_SERVICE_PACKAGE_CONFIGURATION = new AzureProductPackageConfigurationResourceType(Value.AZURE_SOFTWARE_AS_A_SERVICE_PACKAGE_CONFIGURATION, "AzureSoftwareAsAServicePackageConfiguration");

  private final Value value;

  private final String string;

  AzureProductPackageConfigurationResourceType(Value value, String string) {
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
      || (other instanceof AzureProductPackageConfigurationResourceType && this.string.equals(((AzureProductPackageConfigurationResourceType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case AZURE_SOFTWARE_AS_A_SERVICE_PACKAGE_CONFIGURATION:
        return visitor.visitAzureSoftwareAsAServicePackageConfiguration();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductPackageConfigurationResourceType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "AzureSoftwareAsAServicePackageConfiguration":
        return AZURE_SOFTWARE_AS_A_SERVICE_PACKAGE_CONFIGURATION;
      default:
        return new AzureProductPackageConfigurationResourceType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    AZURE_SOFTWARE_AS_A_SERVICE_PACKAGE_CONFIGURATION,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAzureSoftwareAsAServicePackageConfiguration();

    T visitUnknown(String unknownType);
  }
}
