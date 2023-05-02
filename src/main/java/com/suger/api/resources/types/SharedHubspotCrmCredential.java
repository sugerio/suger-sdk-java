package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedHubspotCrmCredential.Builder.class
)
public final class SharedHubspotCrmCredential {
  private final Optional<String> accessToken;

  private final Optional<Integer> acquiredOn;

  private final Optional<Integer> expiresIn;

  private final Optional<String> refreshToken;

  private int _cachedHashCode;

  SharedHubspotCrmCredential(Optional<String> accessToken, Optional<Integer> acquiredOn,
      Optional<Integer> expiresIn, Optional<String> refreshToken) {
    this.accessToken = accessToken;
    this.acquiredOn = acquiredOn;
    this.expiresIn = expiresIn;
    this.refreshToken = refreshToken;
  }

  @JsonProperty("accessToken")
  public Optional<String> getAccessToken() {
    return accessToken;
  }

  /**
   * @return UTC timestamp on receiving the auth response
   */
  @JsonProperty("acquiredOn")
  public Optional<Integer> getAcquiredOn() {
    return acquiredOn;
  }

  @JsonProperty("expiresIn")
  public Optional<Integer> getExpiresIn() {
    return expiresIn;
  }

  @JsonProperty("refreshToken")
  public Optional<String> getRefreshToken() {
    return refreshToken;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedHubspotCrmCredential && equalTo((SharedHubspotCrmCredential) other);
  }

  private boolean equalTo(SharedHubspotCrmCredential other) {
    return accessToken.equals(other.accessToken) && acquiredOn.equals(other.acquiredOn) && expiresIn.equals(other.expiresIn) && refreshToken.equals(other.refreshToken);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accessToken, this.acquiredOn, this.expiresIn, this.refreshToken);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedHubspotCrmCredential{" + "accessToken: " + accessToken + ", acquiredOn: " + acquiredOn + ", expiresIn: " + expiresIn + ", refreshToken: " + refreshToken + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> accessToken = Optional.empty();

    private Optional<Integer> acquiredOn = Optional.empty();

    private Optional<Integer> expiresIn = Optional.empty();

    private Optional<String> refreshToken = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedHubspotCrmCredential other) {
      accessToken(other.getAccessToken());
      acquiredOn(other.getAcquiredOn());
      expiresIn(other.getExpiresIn());
      refreshToken(other.getRefreshToken());
      return this;
    }

    @JsonSetter(
        value = "accessToken",
        nulls = Nulls.SKIP
    )
    public Builder accessToken(Optional<String> accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    public Builder accessToken(String accessToken) {
      this.accessToken = Optional.of(accessToken);
      return this;
    }

    @JsonSetter(
        value = "acquiredOn",
        nulls = Nulls.SKIP
    )
    public Builder acquiredOn(Optional<Integer> acquiredOn) {
      this.acquiredOn = acquiredOn;
      return this;
    }

    public Builder acquiredOn(Integer acquiredOn) {
      this.acquiredOn = Optional.of(acquiredOn);
      return this;
    }

    @JsonSetter(
        value = "expiresIn",
        nulls = Nulls.SKIP
    )
    public Builder expiresIn(Optional<Integer> expiresIn) {
      this.expiresIn = expiresIn;
      return this;
    }

    public Builder expiresIn(Integer expiresIn) {
      this.expiresIn = Optional.of(expiresIn);
      return this;
    }

    @JsonSetter(
        value = "refreshToken",
        nulls = Nulls.SKIP
    )
    public Builder refreshToken(Optional<String> refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    public Builder refreshToken(String refreshToken) {
      this.refreshToken = Optional.of(refreshToken);
      return this;
    }

    public SharedHubspotCrmCredential build() {
      return new SharedHubspotCrmCredential(accessToken, acquiredOn, expiresIn, refreshToken);
    }
  }
}
