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
    builder = SlackOAuthV2ResponseAuthedUser.Builder.class
)
public final class SlackOAuthV2ResponseAuthedUser {
  private final Optional<String> accessToken;

  private final Optional<Integer> expiresIn;

  private final Optional<String> id;

  private final Optional<String> refreshToken;

  private final Optional<String> scope;

  private final Optional<String> tokenType;

  private int _cachedHashCode;

  SlackOAuthV2ResponseAuthedUser(Optional<String> accessToken, Optional<Integer> expiresIn,
      Optional<String> id, Optional<String> refreshToken, Optional<String> scope,
      Optional<String> tokenType) {
    this.accessToken = accessToken;
    this.expiresIn = expiresIn;
    this.id = id;
    this.refreshToken = refreshToken;
    this.scope = scope;
    this.tokenType = tokenType;
  }

  @JsonProperty("access_token")
  public Optional<String> getAccessToken() {
    return accessToken;
  }

  @JsonProperty("expires_in")
  public Optional<Integer> getExpiresIn() {
    return expiresIn;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("refresh_token")
  public Optional<String> getRefreshToken() {
    return refreshToken;
  }

  @JsonProperty("scope")
  public Optional<String> getScope() {
    return scope;
  }

  @JsonProperty("token_type")
  public Optional<String> getTokenType() {
    return tokenType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SlackOAuthV2ResponseAuthedUser && equalTo((SlackOAuthV2ResponseAuthedUser) other);
  }

  private boolean equalTo(SlackOAuthV2ResponseAuthedUser other) {
    return accessToken.equals(other.accessToken) && expiresIn.equals(other.expiresIn) && id.equals(other.id) && refreshToken.equals(other.refreshToken) && scope.equals(other.scope) && tokenType.equals(other.tokenType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accessToken, this.expiresIn, this.id, this.refreshToken, this.scope, this.tokenType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SlackOAuthV2ResponseAuthedUser{" + "accessToken: " + accessToken + ", expiresIn: " + expiresIn + ", id: " + id + ", refreshToken: " + refreshToken + ", scope: " + scope + ", tokenType: " + tokenType + "}";
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

    private Optional<String> id = Optional.empty();

    private Optional<String> refreshToken = Optional.empty();

    private Optional<String> scope = Optional.empty();

    private Optional<String> tokenType = Optional.empty();

    private Builder() {
    }

    public Builder from(SlackOAuthV2ResponseAuthedUser other) {
      accessToken(other.getAccessToken());
      expiresIn(other.getExpiresIn());
      id(other.getId());
      refreshToken(other.getRefreshToken());
      scope(other.getScope());
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
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<String> id) {
      this.id = id;
      return this;
    }

    public Builder id(String id) {
      this.id = Optional.of(id);
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

    @JsonSetter(
        value = "scope",
        nulls = Nulls.SKIP
    )
    public Builder scope(Optional<String> scope) {
      this.scope = scope;
      return this;
    }

    public Builder scope(String scope) {
      this.scope = Optional.of(scope);
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

    public SlackOAuthV2ResponseAuthedUser build() {
      return new SlackOAuthV2ResponseAuthedUser(accessToken, expiresIn, id, refreshToken, scope, tokenType);
    }
  }
}
