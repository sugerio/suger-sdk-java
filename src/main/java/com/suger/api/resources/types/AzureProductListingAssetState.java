package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductListingAssetState {
  public static final AzureProductListingAssetState UPLOADED = new AzureProductListingAssetState(Value.UPLOADED, "Uploaded");

  public static final AzureProductListingAssetState IN_PROCESSING = new AzureProductListingAssetState(Value.IN_PROCESSING, "InProcessing");

  public static final AzureProductListingAssetState PROCESS_FAILED = new AzureProductListingAssetState(Value.PROCESS_FAILED, "ProcessFailed");

  public static final AzureProductListingAssetState PENDING_UPLOAD = new AzureProductListingAssetState(Value.PENDING_UPLOAD, "PendingUpload");

  public static final AzureProductListingAssetState PROCESSED = new AzureProductListingAssetState(Value.PROCESSED, "Processed");

  private final Value value;

  private final String string;

  AzureProductListingAssetState(Value value, String string) {
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
      || (other instanceof AzureProductListingAssetState && this.string.equals(((AzureProductListingAssetState) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case UPLOADED:
        return visitor.visitUploaded();
      case IN_PROCESSING:
        return visitor.visitInProcessing();
      case PROCESS_FAILED:
        return visitor.visitProcessFailed();
      case PENDING_UPLOAD:
        return visitor.visitPendingUpload();
      case PROCESSED:
        return visitor.visitProcessed();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductListingAssetState valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Uploaded":
        return UPLOADED;
      case "InProcessing":
        return IN_PROCESSING;
      case "ProcessFailed":
        return PROCESS_FAILED;
      case "PendingUpload":
        return PENDING_UPLOAD;
      case "Processed":
        return PROCESSED;
      default:
        return new AzureProductListingAssetState(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    PENDING_UPLOAD,

    UPLOADED,

    IN_PROCESSING,

    PROCESSED,

    PROCESS_FAILED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitPendingUpload();

    T visitUploaded();

    T visitInProcessing();

    T visitProcessed();

    T visitProcessFailed();

    T visitUnknown(String unknownType);
  }
}
