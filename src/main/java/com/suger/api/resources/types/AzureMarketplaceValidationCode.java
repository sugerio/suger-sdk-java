package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureMarketplaceValidationCode {
  public static final AzureMarketplaceValidationCode INVALID_STATE = new AzureMarketplaceValidationCode(Value.INVALID_STATE, "invalidState");

  public static final AzureMarketplaceValidationCode INVALID_ID = new AzureMarketplaceValidationCode(Value.INVALID_ID, "invalidId");

  public static final AzureMarketplaceValidationCode INVALID_REQUEST = new AzureMarketplaceValidationCode(Value.INVALID_REQUEST, "invalidRequest");

  public static final AzureMarketplaceValidationCode RESOURCE_NOT_FOUND = new AzureMarketplaceValidationCode(Value.RESOURCE_NOT_FOUND, "resourceNotFound");

  public static final AzureMarketplaceValidationCode COLLECTION_LIMIT_EXCEEDED = new AzureMarketplaceValidationCode(Value.COLLECTION_LIMIT_EXCEEDED, "collectionLimitExceeded");

  public static final AzureMarketplaceValidationCode BUSINESS_VALIDATION_ERROR = new AzureMarketplaceValidationCode(Value.BUSINESS_VALIDATION_ERROR, "businessValidationError");

  public static final AzureMarketplaceValidationCode PRODUCT_LOCKED = new AzureMarketplaceValidationCode(Value.PRODUCT_LOCKED, "productLocked");

  public static final AzureMarketplaceValidationCode INVALID_ENTITY_STATUS = new AzureMarketplaceValidationCode(Value.INVALID_ENTITY_STATUS, "invalidEntityStatus");

  public static final AzureMarketplaceValidationCode NOT_SUPPORTED = new AzureMarketplaceValidationCode(Value.NOT_SUPPORTED, "notSupported");

  public static final AzureMarketplaceValidationCode NOT_DEPLOYED = new AzureMarketplaceValidationCode(Value.NOT_DEPLOYED, "notDeployed");

  public static final AzureMarketplaceValidationCode OPERATION_CANCELED = new AzureMarketplaceValidationCode(Value.OPERATION_CANCELED, "operationCanceled");

  public static final AzureMarketplaceValidationCode SCHEMA_VALIDATION_ERROR = new AzureMarketplaceValidationCode(Value.SCHEMA_VALIDATION_ERROR, "schemaValidationError");

  public static final AzureMarketplaceValidationCode INVALID_RESOURCE = new AzureMarketplaceValidationCode(Value.INVALID_RESOURCE, "invalidResource");

  private final Value value;

  private final String string;

  AzureMarketplaceValidationCode(Value value, String string) {
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
      || (other instanceof AzureMarketplaceValidationCode && this.string.equals(((AzureMarketplaceValidationCode) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case INVALID_STATE:
        return visitor.visitInvalidState();
      case INVALID_ID:
        return visitor.visitInvalidId();
      case INVALID_REQUEST:
        return visitor.visitInvalidRequest();
      case RESOURCE_NOT_FOUND:
        return visitor.visitResourceNotFound();
      case COLLECTION_LIMIT_EXCEEDED:
        return visitor.visitCollectionLimitExceeded();
      case BUSINESS_VALIDATION_ERROR:
        return visitor.visitBusinessValidationError();
      case PRODUCT_LOCKED:
        return visitor.visitProductLocked();
      case INVALID_ENTITY_STATUS:
        return visitor.visitInvalidEntityStatus();
      case NOT_SUPPORTED:
        return visitor.visitNotSupported();
      case NOT_DEPLOYED:
        return visitor.visitNotDeployed();
      case OPERATION_CANCELED:
        return visitor.visitOperationCanceled();
      case SCHEMA_VALIDATION_ERROR:
        return visitor.visitSchemaValidationError();
      case INVALID_RESOURCE:
        return visitor.visitInvalidResource();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureMarketplaceValidationCode valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "invalidState":
        return INVALID_STATE;
      case "invalidId":
        return INVALID_ID;
      case "invalidRequest":
        return INVALID_REQUEST;
      case "resourceNotFound":
        return RESOURCE_NOT_FOUND;
      case "collectionLimitExceeded":
        return COLLECTION_LIMIT_EXCEEDED;
      case "businessValidationError":
        return BUSINESS_VALIDATION_ERROR;
      case "productLocked":
        return PRODUCT_LOCKED;
      case "invalidEntityStatus":
        return INVALID_ENTITY_STATUS;
      case "notSupported":
        return NOT_SUPPORTED;
      case "notDeployed":
        return NOT_DEPLOYED;
      case "operationCanceled":
        return OPERATION_CANCELED;
      case "schemaValidationError":
        return SCHEMA_VALIDATION_ERROR;
      case "invalidResource":
        return INVALID_RESOURCE;
      default:
        return new AzureMarketplaceValidationCode(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    BUSINESS_VALIDATION_ERROR,

    COLLECTION_LIMIT_EXCEEDED,

    INVALID_ID,

    INVALID_ENTITY_STATUS,

    INVALID_REQUEST,

    INVALID_RESOURCE,

    INVALID_STATE,

    NOT_DEPLOYED,

    NOT_SUPPORTED,

    OPERATION_CANCELED,

    PRODUCT_LOCKED,

    RESOURCE_NOT_FOUND,

    SCHEMA_VALIDATION_ERROR,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitBusinessValidationError();

    T visitCollectionLimitExceeded();

    T visitInvalidId();

    T visitInvalidEntityStatus();

    T visitInvalidRequest();

    T visitInvalidResource();

    T visitInvalidState();

    T visitNotDeployed();

    T visitNotSupported();

    T visitOperationCanceled();

    T visitProductLocked();

    T visitResourceNotFound();

    T visitSchemaValidationError();

    T visitUnknown(String unknownType);
  }
}
