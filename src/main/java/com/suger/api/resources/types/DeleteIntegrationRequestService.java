package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class DeleteIntegrationRequestService {
  public static final DeleteIntegrationRequestService MARKETPLACE = new DeleteIntegrationRequestService(Value.MARKETPLACE, "MARKETPLACE");

  public static final DeleteIntegrationRequestService CRM = new DeleteIntegrationRequestService(Value.CRM, "CRM");

  private final Value value;

  private final String string;

  DeleteIntegrationRequestService(Value value, String string) {
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
      || (other instanceof DeleteIntegrationRequestService && this.string.equals(((DeleteIntegrationRequestService) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case MARKETPLACE:
        return visitor.visitMarketplace();
      case CRM:
        return visitor.visitCrm();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static DeleteIntegrationRequestService valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "MARKETPLACE":
        return MARKETPLACE;
      case "CRM":
        return CRM;
      default:
        return new DeleteIntegrationRequestService(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    MARKETPLACE,

    CRM,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitMarketplace();

    T visitCrm();

    T visitUnknown(String unknownType);
  }
}
