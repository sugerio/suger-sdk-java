package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedAzureIntegration.Builder.class
)
public final class SharedAzureIntegration {
  private final Optional<Boolean> cmaFullSyncDone;

  private final Optional<SharedAzureIntegrationCredential> credential;

  private final Optional<String> secretKey;

  private int _cachedHashCode;

  SharedAzureIntegration(Optional<Boolean> cmaFullSyncDone,
      Optional<SharedAzureIntegrationCredential> credential, Optional<String> secretKey) {
    this.cmaFullSyncDone = cmaFullSyncDone;
    this.credential = credential;
    this.secretKey = secretKey;
  }

  /**
   * @return Is Azure Commercial Marketplace Analytics (CMA) full-sync done.
   */
  @JsonProperty("cmaFullSyncDone")
  public Optional<Boolean> getCmaFullSyncDone() {
    return cmaFullSyncDone;
  }

  @JsonProperty("credential")
  public Optional<SharedAzureIntegrationCredential> getCredential() {
    return credential;
  }

  /**
   * @return The secret key used to store the AzureIntegrationCredential in AWS Secret manager. for internal usage only.
   */
  @JsonProperty("secretKey")
  public Optional<String> getSecretKey() {
    return secretKey;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAzureIntegration && equalTo((SharedAzureIntegration) other);
  }

  private boolean equalTo(SharedAzureIntegration other) {
    return cmaFullSyncDone.equals(other.cmaFullSyncDone) && credential.equals(other.credential) && secretKey.equals(other.secretKey);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.cmaFullSyncDone, this.credential, this.secretKey);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAzureIntegration{" + "cmaFullSyncDone: " + cmaFullSyncDone + ", credential: " + credential + ", secretKey: " + secretKey + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Boolean> cmaFullSyncDone = Optional.empty();

    private Optional<SharedAzureIntegrationCredential> credential = Optional.empty();

    private Optional<String> secretKey = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAzureIntegration other) {
      cmaFullSyncDone(other.getCmaFullSyncDone());
      credential(other.getCredential());
      secretKey(other.getSecretKey());
      return this;
    }

    @JsonSetter(
        value = "cmaFullSyncDone",
        nulls = Nulls.SKIP
    )
    public Builder cmaFullSyncDone(Optional<Boolean> cmaFullSyncDone) {
      this.cmaFullSyncDone = cmaFullSyncDone;
      return this;
    }

    public Builder cmaFullSyncDone(Boolean cmaFullSyncDone) {
      this.cmaFullSyncDone = Optional.of(cmaFullSyncDone);
      return this;
    }

    @JsonSetter(
        value = "credential",
        nulls = Nulls.SKIP
    )
    public Builder credential(Optional<SharedAzureIntegrationCredential> credential) {
      this.credential = credential;
      return this;
    }

    public Builder credential(SharedAzureIntegrationCredential credential) {
      this.credential = Optional.of(credential);
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

    public SharedAzureIntegration build() {
      return new SharedAzureIntegration(cmaFullSyncDone, credential, secretKey);
    }
  }
}
