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
    builder = SharedHubspotCrmIntegration.Builder.class
)
public final class SharedHubspotCrmIntegration {
  private final Optional<SharedHubspotCrmCredential> credential;

  private final Optional<Integer> portalId;

  private final Optional<String> secretKey;

  private int _cachedHashCode;

  SharedHubspotCrmIntegration(Optional<SharedHubspotCrmCredential> credential,
      Optional<Integer> portalId, Optional<String> secretKey) {
    this.credential = credential;
    this.portalId = portalId;
    this.secretKey = secretKey;
  }

  @JsonProperty("credential")
  public Optional<SharedHubspotCrmCredential> getCredential() {
    return credential;
  }

  /**
   * @return Hubspot Account Id
   */
  @JsonProperty("portalId")
  public Optional<Integer> getPortalId() {
    return portalId;
  }

  @JsonProperty("secretKey")
  public Optional<String> getSecretKey() {
    return secretKey;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedHubspotCrmIntegration && equalTo((SharedHubspotCrmIntegration) other);
  }

  private boolean equalTo(SharedHubspotCrmIntegration other) {
    return credential.equals(other.credential) && portalId.equals(other.portalId) && secretKey.equals(other.secretKey);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.credential, this.portalId, this.secretKey);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedHubspotCrmIntegration{" + "credential: " + credential + ", portalId: " + portalId + ", secretKey: " + secretKey + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SharedHubspotCrmCredential> credential = Optional.empty();

    private Optional<Integer> portalId = Optional.empty();

    private Optional<String> secretKey = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedHubspotCrmIntegration other) {
      credential(other.getCredential());
      portalId(other.getPortalId());
      secretKey(other.getSecretKey());
      return this;
    }

    @JsonSetter(
        value = "credential",
        nulls = Nulls.SKIP
    )
    public Builder credential(Optional<SharedHubspotCrmCredential> credential) {
      this.credential = credential;
      return this;
    }

    public Builder credential(SharedHubspotCrmCredential credential) {
      this.credential = Optional.of(credential);
      return this;
    }

    @JsonSetter(
        value = "portalId",
        nulls = Nulls.SKIP
    )
    public Builder portalId(Optional<Integer> portalId) {
      this.portalId = portalId;
      return this;
    }

    public Builder portalId(Integer portalId) {
      this.portalId = Optional.of(portalId);
      return this;
    }

    @JsonSetter(
        value = "secretKey",
        nulls = Nulls.SKIP
    )
    public Builder secretKey(Optional<String> secretKey) {
      this.secretKey = secretKey;
      return this;
    }

    public Builder secretKey(String secretKey) {
      this.secretKey = Optional.of(secretKey);
      return this;
    }

    public SharedHubspotCrmIntegration build() {
      return new SharedHubspotCrmIntegration(credential, portalId, secretKey);
    }
  }
}
