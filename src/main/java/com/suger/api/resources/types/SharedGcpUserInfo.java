package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedGcpUserInfo.Builder.class
)
public final class SharedGcpUserInfo {
  private final Optional<List<String>> roles;

  private final Optional<String> userIdentity;

  private int _cachedHashCode;

  SharedGcpUserInfo(Optional<List<String>> roles, Optional<String> userIdentity) {
    this.roles = roles;
    this.userIdentity = userIdentity;
  }

  /**
   * @return An array of strings representing the user's roles. Right now, it can be either: ** account_admin, which indicates that the user is a Billing Account Administrator of the billing account that purchased the product, or ** project_editor, which indicates that the user is a Project Editor, but not a Billing Administrator, of the project under that billing account.
   */
  @JsonProperty("roles")
  public Optional<List<String>> getRoles() {
    return roles;
  }

  /**
   * @return The user's obfuscated GAIA ID, which can be used to initiate Open ID Connect.
   */
  @JsonProperty("user_identity")
  public Optional<String> getUserIdentity() {
    return userIdentity;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpUserInfo && equalTo((SharedGcpUserInfo) other);
  }

  private boolean equalTo(SharedGcpUserInfo other) {
    return roles.equals(other.roles) && userIdentity.equals(other.userIdentity);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.roles, this.userIdentity);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpUserInfo{" + "roles: " + roles + ", userIdentity: " + userIdentity + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<String>> roles = Optional.empty();

    private Optional<String> userIdentity = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpUserInfo other) {
      roles(other.getRoles());
      userIdentity(other.getUserIdentity());
      return this;
    }

    @JsonSetter(
        value = "roles",
        nulls = Nulls.SKIP
    )
    public Builder roles(Optional<List<String>> roles) {
      this.roles = roles;
      return this;
    }

    public Builder roles(List<String> roles) {
      this.roles = Optional.of(roles);
      return this;
    }

    @JsonSetter(
        value = "user_identity",
        nulls = Nulls.SKIP
    )
    public Builder userIdentity(Optional<String> userIdentity) {
      this.userIdentity = userIdentity;
      return this;
    }

    public Builder userIdentity(String userIdentity) {
      this.userIdentity = Optional.of(userIdentity);
      return this;
    }

    public SharedGcpUserInfo build() {
      return new SharedGcpUserInfo(roles, userIdentity);
    }
  }
}
