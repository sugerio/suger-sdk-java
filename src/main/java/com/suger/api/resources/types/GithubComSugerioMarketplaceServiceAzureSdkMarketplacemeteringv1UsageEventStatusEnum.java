package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum {
  public static final GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum ERROR = new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum(Value.ERROR, "Error");

  public static final GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum RESOURCE_NOT_FOUND = new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum(Value.RESOURCE_NOT_FOUND, "ResourceNotFound");

  public static final GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum RESOURCE_NOT_AUTHORIZED = new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum(Value.RESOURCE_NOT_AUTHORIZED, "ResourceNotAuthorized");

  public static final GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum EXPIRED = new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum(Value.EXPIRED, "Expired");

  public static final GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum INVALID_QUANTITY = new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum(Value.INVALID_QUANTITY, "InvalidQuantity");

  public static final GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum INVALID_DIMENSION = new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum(Value.INVALID_DIMENSION, "InvalidDimension");

  public static final GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum ACCEPTED = new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum(Value.ACCEPTED, "Accepted");

  public static final GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum DUPLICATE = new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum(Value.DUPLICATE, "Duplicate");

  public static final GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum BAD_ARGUMENT = new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum(Value.BAD_ARGUMENT, "BadArgument");

  private final Value value;

  private final String string;

  GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum(Value value,
      String string) {
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
      || (other instanceof GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum && this.string.equals(((GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case ERROR:
        return visitor.visitError();
      case RESOURCE_NOT_FOUND:
        return visitor.visitResourceNotFound();
      case RESOURCE_NOT_AUTHORIZED:
        return visitor.visitResourceNotAuthorized();
      case EXPIRED:
        return visitor.visitExpired();
      case INVALID_QUANTITY:
        return visitor.visitInvalidQuantity();
      case INVALID_DIMENSION:
        return visitor.visitInvalidDimension();
      case ACCEPTED:
        return visitor.visitAccepted();
      case DUPLICATE:
        return visitor.visitDuplicate();
      case BAD_ARGUMENT:
        return visitor.visitBadArgument();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum valueOf(
      String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "Error":
        return ERROR;
      case "ResourceNotFound":
        return RESOURCE_NOT_FOUND;
      case "ResourceNotAuthorized":
        return RESOURCE_NOT_AUTHORIZED;
      case "Expired":
        return EXPIRED;
      case "InvalidQuantity":
        return INVALID_QUANTITY;
      case "InvalidDimension":
        return INVALID_DIMENSION;
      case "Accepted":
        return ACCEPTED;
      case "Duplicate":
        return DUPLICATE;
      case "BadArgument":
        return BAD_ARGUMENT;
      default:
        return new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACCEPTED,

    EXPIRED,

    DUPLICATE,

    ERROR,

    RESOURCE_NOT_FOUND,

    RESOURCE_NOT_AUTHORIZED,

    INVALID_DIMENSION,

    INVALID_QUANTITY,

    BAD_ARGUMENT,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAccepted();

    T visitExpired();

    T visitDuplicate();

    T visitError();

    T visitResourceNotFound();

    T visitResourceNotAuthorized();

    T visitInvalidDimension();

    T visitInvalidQuantity();

    T visitBadArgument();

    T visitUnknown(String unknownType);
  }
}
