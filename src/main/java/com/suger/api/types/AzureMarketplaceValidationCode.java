package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureMarketplaceValidationCode {
  BUSINESS_VALIDATION_ERROR("businessValidationError"),

  COLLECTION_LIMIT_EXCEEDED("collectionLimitExceeded"),

  INVALID_ID("invalidId"),

  INVALID_ENTITY_STATUS("invalidEntityStatus"),

  INVALID_REQUEST("invalidRequest"),

  INVALID_RESOURCE("invalidResource"),

  INVALID_STATE("invalidState"),

  NOT_DEPLOYED("notDeployed"),

  NOT_SUPPORTED("notSupported"),

  OPERATION_CANCELED("operationCanceled"),

  PRODUCT_LOCKED("productLocked"),

  RESOURCE_NOT_FOUND("resourceNotFound"),

  SCHEMA_VALIDATION_ERROR("schemaValidationError");

  private final String value;

  AzureMarketplaceValidationCode(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
