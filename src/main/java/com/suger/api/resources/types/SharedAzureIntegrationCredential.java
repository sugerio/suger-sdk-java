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
    builder = SharedAzureIntegrationCredential.Builder.class
)
public final class SharedAzureIntegrationCredential {
  private final Optional<String> accessToken;

  private final Optional<String> clientId;

  private final Optional<String> clientSecret;

  private final Optional<String> expiresOn;

  private final Optional<String> refreshToken;

  private final Optional<String> tenantId;

  private final Optional<String> tokenScope;

  private final Optional<String> tokenType;

  private int _cachedHashCode;

  SharedAzureIntegrationCredential(Optional<String> accessToken, Optional<String> clientId,
      Optional<String> clientSecret, Optional<String> expiresOn, Optional<String> refreshToken,
      Optional<String> tenantId, Optional<String> tokenScope, Optional<String> tokenType) {
    this.accessToken = accessToken;
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.expiresOn = expiresOn;
    this.refreshToken = refreshToken;
    this.tenantId = tenantId;
    this.tokenScope = tokenScope;
    this.tokenType = tokenType;
  }

  @JsonProperty("accessToken")
  public Optional<String> getAccessToken() {
    return accessToken;
  }

  @JsonProperty("clientID")
  public Optional<String> getClientId() {
    return clientId;
  }

  @JsonProperty("clientSecret")
  public Optional<String> getClientSecret() {
    return clientSecret;
  }

  /**
   * @return The time when the access token expires.
   */
  @JsonProperty("expiresOn")
  public Optional<String> getExpiresOn() {
    return expiresOn;
  }

  /**
   * @return The refresh token used to refresh the access token.
   */
  @JsonProperty("refreshToken")
  public Optional<String> getRefreshToken() {
    return refreshToken;
  }

  @JsonProperty("tenantID")
  public Optional<String> getTenantId() {
    return tenantId;
  }

  @JsonProperty("tokenScope")
  public Optional<String> getTokenScope() {
    return tokenScope;
  }

  @JsonProperty("tokenType")
  public Optional<String> getTokenType() {
    return tokenType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAzureIntegrationCredential && equalTo((SharedAzureIntegrationCredential) other);
  }

  private boolean equalTo(SharedAzureIntegrationCredential other) {
    return accessToken.equals(other.accessToken) && clientId.equals(other.clientId) && clientSecret.equals(other.clientSecret) && expiresOn.equals(other.expiresOn) && refreshToken.equals(other.refreshToken) && tenantId.equals(other.tenantId) && tokenScope.equals(other.tokenScope) && tokenType.equals(other.tokenType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accessToken, this.clientId, this.clientSecret, this.expiresOn, this.refreshToken, this.tenantId, this.tokenScope, this.tokenType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAzureIntegrationCredential{" + "accessToken: " + accessToken + ", clientId: " + clientId + ", clientSecret: " + clientSecret + ", expiresOn: " + expiresOn + ", refreshToken: " + refreshToken + ", tenantId: " + tenantId + ", tokenScope: " + tokenScope + ", tokenType: " + tokenType + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> accessToken = Optional.empty();

    private Optional<String> clientId = Optional.empty();

    private Optional<String> clientSecret = Optional.empty();

    private Optional<String> expiresOn = Optional.empty();

    private Optional<String> refreshToken = Optional.empty();

    private Optional<String> tenantId = Optional.empty();

    private Optional<String> tokenScope = Optional.empty();

    private Optional<String> tokenType = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAzureIntegrationCredential other) {
      accessToken(other.getAccessToken());
      clientId(other.getClientId());
      clientSecret(other.getClientSecret());
      expiresOn(other.getExpiresOn());
      refreshToken(other.getRefreshToken());
      tenantId(other.getTenantId());
      tokenScope(other.getTokenScope());
      tokenType(other.getTokenType());
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
        value = "clientID",
        nulls = Nulls.SKIP
    )
    public Builder clientId(Optional<String> clientId) {
      this.clientId = clientId;
      return this;
    }

    public Builder clientId(String clientId) {
      this.clientId = Optional.of(clientId);
      return this;
    }

    @JsonSetter(
        value = "clientSecret",
        nulls = Nulls.SKIP
    )
    public Builder clientSecret(Optional<String> clientSecret) {
      this.clientSecret = clientSecret;
      return this;
    }

    public Builder clientSecret(String clientSecret) {
      this.clientSecret = Optional.of(clientSecret);
      return this;
    }

    @JsonSetter(
        value = "expiresOn",
        nulls = Nulls.SKIP
    )
    public Builder expiresOn(Optional<String> expiresOn) {
      this.expiresOn = expiresOn;
      return this;
    }

    public Builder expiresOn(String expiresOn) {
      this.expiresOn = Optional.of(expiresOn);
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

    @JsonSetter(
        value = "tenantID",
        nulls = Nulls.SKIP
    )
    public Builder tenantId(Optional<String> tenantId) {
      this.tenantId = tenantId;
      return this;
    }

    public Builder tenantId(String tenantId) {
      this.tenantId = Optional.of(tenantId);
      return this;
    }

    @JsonSetter(
        value = "tokenScope",
        nulls = Nulls.SKIP
    )
    public Builder tokenScope(Optional<String> tokenScope) {
      this.tokenScope = tokenScope;
      return this;
    }

    public Builder tokenScope(String tokenScope) {
      this.tokenScope = Optional.of(tokenScope);
      return this;
    }

    @JsonSetter(
        value = "tokenType",
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

    public SharedAzureIntegrationCredential build() {
      return new SharedAzureIntegrationCredential(accessToken, clientId, clientSecret, expiresOn, refreshToken, tenantId, tokenScope, tokenType);
    }
  }
}
