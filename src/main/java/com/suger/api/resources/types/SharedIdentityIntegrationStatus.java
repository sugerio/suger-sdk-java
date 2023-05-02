package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedIdentityIntegrationStatus {
  public static final SharedIdentityIntegrationStatus VERIFIED = new SharedIdentityIntegrationStatus(Value.VERIFIED, "VERIFIED");

  public static final SharedIdentityIntegrationStatus CREATED = new SharedIdentityIntegrationStatus(Value.CREATED, "CREATED");

  public static final SharedIdentityIntegrationStatus NOT_VERIFIED = new SharedIdentityIntegrationStatus(Value.NOT_VERIFIED, "NOT_VERIFIED");

  private final Value value;

  private final String string;

  SharedIdentityIntegrationStatus(Value value, String string) {
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
      || (other instanceof SharedIdentityIntegrationStatus && this.string.equals(((SharedIdentityIntegrationStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case VERIFIED:
        return visitor.visitVerified();
      case CREATED:
        return visitor.visitCreated();
      case NOT_VERIFIED:
        return visitor.visitNotVerified();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedIdentityIntegrationStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "VERIFIED":
        return VERIFIED;
      case "CREATED":
        return CREATED;
      case "NOT_VERIFIED":
        return NOT_VERIFIED;
      default:
        return new SharedIdentityIntegrationStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    CREATED,

    VERIFIED,

    NOT_VERIFIED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitCreated();

    T visitVerified();

    T visitNotVerified();

    T visitUnknown(String unknownType);
  }
}
