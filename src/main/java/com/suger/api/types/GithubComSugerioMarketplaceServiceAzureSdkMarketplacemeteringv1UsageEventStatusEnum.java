package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum {
  ACCEPTED("Accepted"),

  EXPIRED("Expired"),

  DUPLICATE("Duplicate"),

  ERROR("Error"),

  RESOURCE_NOT_FOUND("ResourceNotFound"),

  RESOURCE_NOT_AUTHORIZED("ResourceNotAuthorized"),

  INVALID_DIMENSION("InvalidDimension"),

  INVALID_QUANTITY("InvalidQuantity"),

  BAD_ARGUMENT("BadArgument");

  private final String value;

  GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum(
      String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
