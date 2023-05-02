package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedOperationType {
  public static final SharedOperationType TEMPORAL_WORKFLOW = new SharedOperationType(Value.TEMPORAL_WORKFLOW, "TemporalWorkflow");

  private final Value value;

  private final String string;

  SharedOperationType(Value value, String string) {
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
      || (other instanceof SharedOperationType && this.string.equals(((SharedOperationType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case TEMPORAL_WORKFLOW:
        return visitor.visitTemporalWorkflow();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedOperationType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "TemporalWorkflow":
        return TEMPORAL_WORKFLOW;
      default:
        return new SharedOperationType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    TEMPORAL_WORKFLOW,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitTemporalWorkflow();

    T visitUnknown(String unknownType);
  }
}
