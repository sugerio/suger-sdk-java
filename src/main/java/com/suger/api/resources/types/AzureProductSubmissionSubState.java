package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductSubmissionSubState {
  public static final AzureProductSubmissionSubState FAILED_IN_CERTIFICATION = new AzureProductSubmissionSubState(Value.FAILED_IN_CERTIFICATION, "FailedInCertification");

  public static final AzureProductSubmissionSubState IN_DRAFT = new AzureProductSubmissionSubState(Value.IN_DRAFT, "InDraft");

  public static final AzureProductSubmissionSubState READY_TO_PUBLISH = new AzureProductSubmissionSubState(Value.READY_TO_PUBLISH, "ReadyToPublish");

  public static final AzureProductSubmissionSubState SUBMITTED = new AzureProductSubmissionSubState(Value.SUBMITTED, "Submitted");

  public static final AzureProductSubmissionSubState PUBLISHED = new AzureProductSubmissionSubState(Value.PUBLISHED, "Published");

  public static final AzureProductSubmissionSubState PUBLISHING = new AzureProductSubmissionSubState(Value.PUBLISHING, "Publishing");

  public static final AzureProductSubmissionSubState FAILED = new AzureProductSubmissionSubState(Value.FAILED, "Failed");

  public static final AzureProductSubmissionSubState IN_STORE = new AzureProductSubmissionSubState(Value.IN_STORE, "InStore");

  private final Value value;

  private final String string;

  AzureProductSubmissionSubState(Value value, String string) {
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
      || (other instanceof AzureProductSubmissionSubState && this.string.equals(((AzureProductSubmissionSubState) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case FAILED_IN_CERTIFICATION:
        return visitor.visitFailedInCertification();
      case IN_DRAFT:
        return visitor.visitInDraft();
      case READY_TO_PUBLISH:
        return visitor.visitReadyToPublish();
      case SUBMITTED:
        return visitor.visitSubmitted();
      case PUBLISHED:
        return visitor.visitPublished();
      case PUBLISHING:
        return visitor.visitPublishing();
      case FAILED:
        return visitor.visitFailed();
      case IN_STORE:
        return visitor.visitInStore();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductSubmissionSubState valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "FailedInCertification":
        return FAILED_IN_CERTIFICATION;
      case "InDraft":
        return IN_DRAFT;
      case "ReadyToPublish":
        return READY_TO_PUBLISH;
      case "Submitted":
        return SUBMITTED;
      case "Published":
        return PUBLISHED;
      case "Publishing":
        return PUBLISHING;
      case "Failed":
        return FAILED;
      case "InStore":
        return IN_STORE;
      default:
        return new AzureProductSubmissionSubState(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    IN_DRAFT,

    SUBMITTED,

    FAILED,

    FAILED_IN_CERTIFICATION,

    READY_TO_PUBLISH,

    PUBLISHING,

    PUBLISHED,

    IN_STORE,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitInDraft();

    T visitSubmitted();

    T visitFailed();

    T visitFailedInCertification();

    T visitReadyToPublish();

    T visitPublishing();

    T visitPublished();

    T visitInStore();

    T visitUnknown(String unknownType);
  }
}
