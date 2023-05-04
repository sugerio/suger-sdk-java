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
    builder = SharedSlackIntegration.Builder.class
)
public final class SharedSlackIntegration {
  private final Optional<String> accessToken;

  private final Optional<String> appId;

  private final Optional<SlackOAuthV2ResponseAuthedUser> authedUser;

  private final Optional<String> botUserId;

  private final Optional<SlackOAuthV2ResponseEnterprise> enterprise;

  private final Optional<Integer> expiresIn;

  private final Optional<SlackOAuthResponseIncomingWebhook> incomingWebhook;

  private final Optional<String> redirectUrl;

  private final Optional<String> refreshToken;

  private final Optional<String> scope;

  private final Optional<SlackOAuthV2ResponseTeam> team;

  private final Optional<String> tokenType;

  private int _cachedHashCode;

  SharedSlackIntegration(Optional<String> accessToken, Optional<String> appId,
      Optional<SlackOAuthV2ResponseAuthedUser> authedUser, Optional<String> botUserId,
      Optional<SlackOAuthV2ResponseEnterprise> enterprise, Optional<Integer> expiresIn,
      Optional<SlackOAuthResponseIncomingWebhook> incomingWebhook, Optional<String> redirectUrl,
      Optional<String> refreshToken, Optional<String> scope,
      Optional<SlackOAuthV2ResponseTeam> team, Optional<String> tokenType) {
    this.accessToken = accessToken;
    this.appId = appId;
    this.authedUser = authedUser;
    this.botUserId = botUserId;
    this.enterprise = enterprise;
    this.expiresIn = expiresIn;
    this.incomingWebhook = incomingWebhook;
    this.redirectUrl = redirectUrl;
    this.refreshToken = refreshToken;
    this.scope = scope;
    this.team = team;
    this.tokenType = tokenType;
  }

  @JsonProperty("accessToken")
  public Optional<String> getAccessToken() {
    return accessToken;
  }

  @JsonProperty("appId")
  public Optional<String> getAppId() {
    return appId;
  }

  @JsonProperty("authedUser")
  public Optional<SlackOAuthV2ResponseAuthedUser> getAuthedUser() {
    return authedUser;
  }

  @JsonProperty("botUserId")
  public Optional<String> getBotUserId() {
    return botUserId;
  }

  @JsonProperty("enterprise")
  public Optional<SlackOAuthV2ResponseEnterprise> getEnterprise() {
    return enterprise;
  }

  @JsonProperty("expiresIn")
  public Optional<Integer> getExpiresIn() {
    return expiresIn;
  }

  @JsonProperty("incomingWebhook")
  public Optional<SlackOAuthResponseIncomingWebhook> getIncomingWebhook() {
    return incomingWebhook;
  }

  @JsonProperty("redirectUrl")
  public Optional<String> getRedirectUrl() {
    return redirectUrl;
  }

  @JsonProperty("refreshToken")
  public Optional<String> getRefreshToken() {
    return refreshToken;
  }

  /**
   * @return The scope of the access token. multiple scopes are separated by comma.
   */
  @JsonProperty("scope")
  public Optional<String> getScope() {
    return scope;
  }

  @JsonProperty("team")
  public Optional<SlackOAuthV2ResponseTeam> getTeam() {
    return team;
  }

  @JsonProperty("tokenType")
  public Optional<String> getTokenType() {
    return tokenType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedSlackIntegration && equalTo((SharedSlackIntegration) other);
  }

  private boolean equalTo(SharedSlackIntegration other) {
    return accessToken.equals(other.accessToken) && appId.equals(other.appId) && authedUser.equals(other.authedUser) && botUserId.equals(other.botUserId) && enterprise.equals(other.enterprise) && expiresIn.equals(other.expiresIn) && incomingWebhook.equals(other.incomingWebhook) && redirectUrl.equals(other.redirectUrl) && refreshToken.equals(other.refreshToken) && scope.equals(other.scope) && team.equals(other.team) && tokenType.equals(other.tokenType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accessToken, this.appId, this.authedUser, this.botUserId, this.enterprise, this.expiresIn, this.incomingWebhook, this.redirectUrl, this.refreshToken, this.scope, this.team, this.tokenType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedSlackIntegration{" + "accessToken: " + accessToken + ", appId: " + appId + ", authedUser: " + authedUser + ", botUserId: " + botUserId + ", enterprise: " + enterprise + ", expiresIn: " + expiresIn + ", incomingWebhook: " + incomingWebhook + ", redirectUrl: " + redirectUrl + ", refreshToken: " + refreshToken + ", scope: " + scope + ", team: " + team + ", tokenType: " + tokenType + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> accessToken = Optional.empty();

    private Optional<String> appId = Optional.empty();

    private Optional<SlackOAuthV2ResponseAuthedUser> authedUser = Optional.empty();

    private Optional<String> botUserId = Optional.empty();

    private Optional<SlackOAuthV2ResponseEnterprise> enterprise = Optional.empty();

    private Optional<Integer> expiresIn = Optional.empty();

    private Optional<SlackOAuthResponseIncomingWebhook> incomingWebhook = Optional.empty();

    private Optional<String> redirectUrl = Optional.empty();

    private Optional<String> refreshToken = Optional.empty();

    private Optional<String> scope = Optional.empty();

    private Optional<SlackOAuthV2ResponseTeam> team = Optional.empty();

    private Optional<String> tokenType = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedSlackIntegration other) {
      accessToken(other.getAccessToken());
      appId(other.getAppId());
      authedUser(other.getAuthedUser());
      botUserId(other.getBotUserId());
      enterprise(other.getEnterprise());
      expiresIn(other.getExpiresIn());
      incomingWebhook(other.getIncomingWebhook());
      redirectUrl(other.getRedirectUrl());
      refreshToken(other.getRefreshToken());
      scope(other.getScope());
      team(other.getTeam());
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
        value = "appId",
        nulls = Nulls.SKIP
    )
    public Builder appId(Optional<String> appId) {
      this.appId = appId;
      return this;
    }

    public Builder appId(String appId) {
      this.appId = Optional.of(appId);
      return this;
    }

    @JsonSetter(
        value = "authedUser",
        nulls = Nulls.SKIP
    )
    public Builder authedUser(Optional<SlackOAuthV2ResponseAuthedUser> authedUser) {
      this.authedUser = authedUser;
      return this;
    }

    public Builder authedUser(SlackOAuthV2ResponseAuthedUser authedUser) {
      this.authedUser = Optional.of(authedUser);
      return this;
    }

    @JsonSetter(
        value = "botUserId",
        nulls = Nulls.SKIP
    )
    public Builder botUserId(Optional<String> botUserId) {
      this.botUserId = botUserId;
      return this;
    }

    public Builder botUserId(String botUserId) {
      this.botUserId = Optional.of(botUserId);
      return this;
    }

    @JsonSetter(
        value = "enterprise",
        nulls = Nulls.SKIP
    )
    public Builder enterprise(Optional<SlackOAuthV2ResponseEnterprise> enterprise) {
      this.enterprise = enterprise;
      return this;
    }

    public Builder enterprise(SlackOAuthV2ResponseEnterprise enterprise) {
      this.enterprise = Optional.of(enterprise);
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
        value = "incomingWebhook",
        nulls = Nulls.SKIP
    )
    public Builder incomingWebhook(Optional<SlackOAuthResponseIncomingWebhook> incomingWebhook) {
      this.incomingWebhook = incomingWebhook;
      return this;
    }

    public Builder incomingWebhook(SlackOAuthResponseIncomingWebhook incomingWebhook) {
      this.incomingWebhook = Optional.of(incomingWebhook);
      return this;
    }

    @JsonSetter(
        value = "redirectUrl",
        nulls = Nulls.SKIP
    )
    public Builder redirectUrl(Optional<String> redirectUrl) {
      this.redirectUrl = redirectUrl;
      return this;
    }

    public Builder redirectUrl(String redirectUrl) {
      this.redirectUrl = Optional.of(redirectUrl);
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
        value = "team",
        nulls = Nulls.SKIP
    )
    public Builder team(Optional<SlackOAuthV2ResponseTeam> team) {
      this.team = team;
      return this;
    }

    public Builder team(SlackOAuthV2ResponseTeam team) {
      this.team = Optional.of(team);
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

    public SharedSlackIntegration build() {
      return new SharedSlackIntegration(accessToken, appId, authedUser, botUserId, enterprise, expiresIn, incomingWebhook, redirectUrl, refreshToken, scope, team, tokenType);
    }
  }
}
