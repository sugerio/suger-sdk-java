package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductSubmissionState {
  public static final AzureProductSubmissionState PUBLISHED = new AzureProductSubmissionState(Value.PUBLISHED, "Published");

  public static final AzureProductSubmissionState INPROGRESS = new AzureProductSubmissionState(Value.INPROGRESS, "Inprogress");

  private final Value value;

  private final String string;

  AzureProductSubmissionState(Value value, String string) {
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
      || (other instanceof AzureProductSubmissionState && this.string.equals(((AzureProductSubmissionState) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case PUBLISHED:
        return visitor.visitPublished();
      case INPROGRESS:
        return visitor.visitInprogress();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductSubmissionState valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Published":
        return PUBLISHED;
      case "Inprogress":
        return INPROGRESS;
      default:
        return new AzureProductSubmissionState(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    INPROGRESS,

    PUBLISHED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitInprogress();

    T visitPublished();

    T visitUnknown(String unknownType);
  }
}
