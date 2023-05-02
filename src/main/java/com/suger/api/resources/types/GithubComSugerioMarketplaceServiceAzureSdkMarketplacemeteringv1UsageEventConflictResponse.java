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
    builder = GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponse.Builder.class
)
public final class GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponse {
  private final Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo> additionalInfo;

  private final Optional<String> code;

  private final Optional<String> message;

  private int _cachedHashCode;

  GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponse(
      Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo> additionalInfo,
      Optional<String> code, Optional<String> message) {
    this.additionalInfo = additionalInfo;
    this.code = code;
    this.message = message;
  }

  @JsonProperty("additionalInfo")
  public Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo> getAdditionalInfo(
      ) {
    return additionalInfo;
  }

  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  @JsonProperty("message")
  public Optional<String> getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponse && equalTo((GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponse) other);
  }

  private boolean equalTo(
      GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponse other) {
    return additionalInfo.equals(other.additionalInfo) && code.equals(other.code) && message.equals(other.message);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.additionalInfo, this.code, this.message);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponse{" + "additionalInfo: " + additionalInfo + ", code: " + code + ", message: " + message + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo> additionalInfo = Optional.empty();

    private Optional<String> code = Optional.empty();

    private Optional<String> message = Optional.empty();

    private Builder() {
    }

    public Builder from(
        GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponse other) {
      additionalInfo(other.getAdditionalInfo());
      code(other.getCode());
      message(other.getMessage());
      return this;
    }

    @JsonSetter(
        value = "additionalInfo",
        nulls = Nulls.SKIP
    )
    public Builder additionalInfo(
        Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo> additionalInfo) {
      this.additionalInfo = additionalInfo;
      return this;
    }

    public Builder additionalInfo(
        GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponseAdditionalInfo additionalInfo) {
      this.additionalInfo = Optional.of(additionalInfo);
      return this;
    }

    @JsonSetter(
        value = "code",
        nulls = Nulls.SKIP
    )
    public Builder code(Optional<String> code) {
      this.code = code;
      return this;
    }

    public Builder code(String code) {
      this.code = Optional.of(code);
      return this;
    }

    @JsonSetter(
        value = "message",
        nulls = Nulls.SKIP
    )
    public Builder message(Optional<String> message) {
      this.message = message;
      return this;
    }

    public Builder message(String message) {
      this.message = Optional.of(message);
      return this;
    }

    public GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponse build(
        ) {
      return new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventConflictResponse(additionalInfo, code, message);
    }
  }
}
