package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class ListProductsByPartnerRequestPartner {
  public static final ListProductsByPartnerRequestPartner AWS = new ListProductsByPartnerRequestPartner(Value.AWS, "AWS");

  public static final ListProductsByPartnerRequestPartner AZURE = new ListProductsByPartnerRequestPartner(Value.AZURE, "AZURE");

  public static final ListProductsByPartnerRequestPartner GCP = new ListProductsByPartnerRequestPartner(Value.GCP, "GCP");

  private final Value value;

  private final String string;

  ListProductsByPartnerRequestPartner(Value value, String string) {
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
      || (other instanceof ListProductsByPartnerRequestPartner && this.string.equals(((ListProductsByPartnerRequestPartner) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case AWS:
        return visitor.visitAws();
      case AZURE:
        return visitor.visitAzure();
      case GCP:
        return visitor.visitGcp();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static ListProductsByPartnerRequestPartner valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "AWS":
        return AWS;
      case "AZURE":
        return AZURE;
      case "GCP":
        return GCP;
      default:
        return new ListProductsByPartnerRequestPartner(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    AWS,

    AZURE,

    GCP,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAws();

    T visitAzure();

    T visitGcp();

    T visitUnknown(String unknownType);
  }
}
