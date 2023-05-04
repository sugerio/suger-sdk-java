package com.suger.api.types;

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
    builder = SharedSalesforceCrmCredential.Builder.class
)
public final class SharedSalesforceCrmCredential {
  private final Optional<String> accessToken;

  private final Optional<Integer> exp;

  private final Optional<String> instanceUrl;

  private final Optional<String> refreshToken;

  private int _cachedHashCode;

  SharedSalesforceCrmCredential(Optional<String> accessToken, Optional<Integer> exp,
      Optional<String> instanceUrl, Optional<String> refreshToken) {
    this.accessToken = accessToken;
    this.exp = exp;
    this.instanceUrl = instanceUrl;
    this.refreshToken = refreshToken;
  }

  @JsonProperty("access_token")
  public Optional<String> getAccessToken() {
    return accessToken;
  }

  @JsonProperty("exp")
  public Optional<Integer> getExp() {
    return exp;
  }

  @JsonProperty("instance_url")
  public Optional<String> getInstanceUrl() {
    return instanceUrl;
  }

  @JsonProperty("refresh_token")
  public Optional<String> getRefreshToken() {
    return refreshToken;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedSalesforceCrmCredential && equalTo((SharedSalesforceCrmCredential) other);
  }

  private boolean equalTo(SharedSalesforceCrmCredential other) {
    return accessToken.equals(other.accessToken) && exp.equals(other.exp) && instanceUrl.equals(other.instanceUrl) && refreshToken.equals(other.refreshToken);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accessToken, this.exp, this.instanceUrl, this.refreshToken);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedSalesforceCrmCredential{" + "accessToken: " + accessToken + ", exp: " + exp + ", instanceUrl: " + instanceUrl + ", refreshToken: " + refreshToken + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> accessToken = Optional.empty();

    private Optional<Integer> exp = Optional.empty();

    private Optional<String> instanceUrl = Optional.empty();

    private Optional<String> refreshToken = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedSalesforceCrmCredential other) {
      accessToken(other.getAccessToken());
      exp(other.getExp());
      instanceUrl(other.getInstanceUrl());
      refreshToken(other.getRefreshToken());
      return this;
    }

    @JsonSetter(
        value = "access_token",
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
        value = "exp",
        nulls = Nulls.SKIP
    )
    public Builder exp(Optional<Integer> exp) {
      this.exp = exp;
      return this;
    }

    public Builder exp(Integer exp) {
      this.exp = Optional.of(exp);
      return this;
    }

    @JsonSetter(
        value = "instance_url",
        nulls = Nulls.SKIP
    )
    public Builder instanceUrl(Optional<String> instanceUrl) {
      this.instanceUrl = instanceUrl;
      return this;
    }

    public Builder instanceUrl(String instanceUrl) {
      this.instanceUrl = Optional.of(instanceUrl);
      return this;
    }

    @JsonSetter(
        value = "refresh_token",
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

    public SharedSalesforceCrmCredential build() {
      return new SharedSalesforceCrmCredential(accessToken, exp, instanceUrl, refreshToken);
    }
  }
}
