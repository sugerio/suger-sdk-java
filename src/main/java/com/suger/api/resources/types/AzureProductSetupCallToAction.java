package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductSetupCallToAction {
  public static final AzureProductSetupCallToAction FREE_TRIAL = new AzureProductSetupCallToAction(Value.FREE_TRIAL, "free-trial");

  public static final AzureProductSetupCallToAction CONTACT_ME = new AzureProductSetupCallToAction(Value.CONTACT_ME, "contact-me");

  public static final AzureProductSetupCallToAction FREE = new AzureProductSetupCallToAction(Value.FREE, "free");

  private final Value value;

  private final String string;

  AzureProductSetupCallToAction(Value value, String string) {
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
      || (other instanceof AzureProductSetupCallToAction && this.string.equals(((AzureProductSetupCallToAction) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case FREE_TRIAL:
        return visitor.visitFreeTrial();
      case CONTACT_ME:
        return visitor.visitContactMe();
      case FREE:
        return visitor.visitFree();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductSetupCallToAction valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "free-trial":
        return FREE_TRIAL;
      case "contact-me":
        return CONTACT_ME;
      case "free":
        return FREE;
      default:
        return new AzureProductSetupCallToAction(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    FREE,

    FREE_TRIAL,

    CONTACT_ME,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitFree();

    T visitFreeTrial();

    T visitContactMe();

    T visitUnknown(String unknownType);
  }
}
