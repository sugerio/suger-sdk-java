package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductSubmissionResourceType {
  public static final AzureProductSubmissionResourceType SUBMISSION = new AzureProductSubmissionResourceType(Value.SUBMISSION, "Submission");

  private final Value value;

  private final String string;

  AzureProductSubmissionResourceType(Value value, String string) {
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
      || (other instanceof AzureProductSubmissionResourceType && this.string.equals(((AzureProductSubmissionResourceType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case SUBMISSION:
        return visitor.visitSubmission();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductSubmissionResourceType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Submission":
        return SUBMISSION;
      default:
        return new AzureProductSubmissionResourceType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    SUBMISSION,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitSubmission();

    T visitUnknown(String unknownType);
  }
}
