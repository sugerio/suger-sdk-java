package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo.Builder.class
)
public final class GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo {
  private final Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse> acceptedMessage;

  private int _cachedHashCode;

  GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo(
      Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse> acceptedMessage) {
    this.acceptedMessage = acceptedMessage;
  }

  @JsonProperty("acceptedMessage")
  public Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse> getAcceptedMessage(
      ) {
    return acceptedMessage;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo && equalTo((GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo) other);
  }

  private boolean equalTo(
      GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo other) {
    return acceptedMessage.equals(other.acceptedMessage);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.acceptedMessage);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo{" + "acceptedMessage: " + acceptedMessage + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse> acceptedMessage = Optional.empty();

    private Builder() {
    }

    public Builder from(
        GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo other) {
      acceptedMessage(other.getAcceptedMessage());
      return this;
    }

    @JsonSetter(
        value = "acceptedMessage",
        nulls = Nulls.SKIP
    )
    public Builder acceptedMessage(
        Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse> acceptedMessage) {
      this.acceptedMessage = acceptedMessage;
      return this;
    }

    public Builder acceptedMessage(
        GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse acceptedMessage) {
      this.acceptedMessage = Optional.of(acceptedMessage);
      return this;
    }

    public GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo build(
        ) {
      return new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo(acceptedMessage);
    }
  }
}
