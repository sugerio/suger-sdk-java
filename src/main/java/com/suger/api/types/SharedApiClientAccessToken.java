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
    builder = SharedApiClientAccessToken.Builder.class
)
public final class SharedApiClientAccessToken {
  private final Optional<String> accessToken;

  private final Optional<Integer> expiresIn;

  private final Optional<String> tokenType;

  private int _cachedHashCode;

  SharedApiClientAccessToken(Optional<String> accessToken, Optional<Integer> expiresIn,
      Optional<String> tokenType) {
    this.accessToken = accessToken;
    this.expiresIn = expiresIn;
    this.tokenType = tokenType;
  }

  @JsonProperty("access_token")
  public Optional<String> getAccessToken() {
    return accessToken;
  }

  /**
   * @return The token expires in 1 hour
   */
  @JsonProperty("expires_in")
  public Optional<Integer> getExpiresIn() {
    return expiresIn;
  }

  @JsonProperty("token_type")
  public Optional<String> getTokenType() {
    return tokenType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedApiClientAccessToken && equalTo((SharedApiClientAccessToken) other);
  }

  private boolean equalTo(SharedApiClientAccessToken other) {
    return accessToken.equals(other.accessToken) && expiresIn.equals(other.expiresIn) && tokenType.equals(other.tokenType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accessToken, this.expiresIn, this.tokenType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedApiClientAccessToken{" + "accessToken: " + accessToken + ", expiresIn: " + expiresIn + ", tokenType: " + tokenType + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> accessToken = Optional.empty();

    private Optional<Integer> expiresIn = Optional.empty();

    private Optional<String> tokenType = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedApiClientAccessToken other) {
      accessToken(other.getAccessToken());
      expiresIn(other.getExpiresIn());
      tokenType(other.getTokenType());
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
        value = "expires_in",
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
        value = "token_type",
        nulls = Nulls.SKIP
    )
    public Builder tokenType(Optional<String> tokenType) {
      this.tokenType = tokenType;
      return this;
    }

    public Builder tokenType(String tokenType) {
      this.tokenType = Optional.of(tokenType);
      return this;
    }

    public SharedApiClientAccessToken build() {
      return new SharedApiClientAccessToken(accessToken, expiresIn, tokenType);
    }
  }
}
