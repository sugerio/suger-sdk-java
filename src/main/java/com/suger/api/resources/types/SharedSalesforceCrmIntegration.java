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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedSalesforceCrmIntegration.Builder.class
)
public final class SharedSalesforceCrmIntegration {
  private final Optional<SharedSalesforceCrmCredential> credential;

  private final Optional<List<SharedSalesforceSyncFilter>> filters;

  private final Optional<String> instanceUrl;

  private final Optional<Boolean> isSandbox;

  private final Optional<String> secretKey;

  private final Optional<String> subdomain;

  private int _cachedHashCode;

  SharedSalesforceCrmIntegration(Optional<SharedSalesforceCrmCredential> credential,
      Optional<List<SharedSalesforceSyncFilter>> filters, Optional<String> instanceUrl,
      Optional<Boolean> isSandbox, Optional<String> secretKey, Optional<String> subdomain) {
    this.credential = credential;
    this.filters = filters;
    this.instanceUrl = instanceUrl;
    this.isSandbox = isSandbox;
    this.secretKey = secretKey;
    this.subdomain = subdomain;
  }

  /**
   * @return System created
   */
  @JsonProperty("credential")
  public Optional<SharedSalesforceCrmCredential> getCredential() {
    return credential;
  }

  @JsonProperty("filters")
  public Optional<List<SharedSalesforceSyncFilter>> getFilters() {
    return filters;
  }

  @JsonProperty("instanceUrl")
  public Optional<String> getInstanceUrl() {
    return instanceUrl;
  }

  @JsonProperty("isSandbox")
  public Optional<Boolean> getIsSandbox() {
    return isSandbox;
  }

  @JsonProperty("secretKey")
  public Optional<String> getSecretKey() {
    return secretKey;
  }

  /**
   * @return User defined when setting up the integration
   */
  @JsonProperty("subdomain")
  public Optional<String> getSubdomain() {
    return subdomain;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedSalesforceCrmIntegration && equalTo((SharedSalesforceCrmIntegration) other);
  }

  private boolean equalTo(SharedSalesforceCrmIntegration other) {
    return credential.equals(other.credential) && filters.equals(other.filters) && instanceUrl.equals(other.instanceUrl) && isSandbox.equals(other.isSandbox) && secretKey.equals(other.secretKey) && subdomain.equals(other.subdomain);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.credential, this.filters, this.instanceUrl, this.isSandbox, this.secretKey, this.subdomain);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedSalesforceCrmIntegration{" + "credential: " + credential + ", filters: " + filters + ", instanceUrl: " + instanceUrl + ", isSandbox: " + isSandbox + ", secretKey: " + secretKey + ", subdomain: " + subdomain + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SharedSalesforceCrmCredential> credential = Optional.empty();

    private Optional<List<SharedSalesforceSyncFilter>> filters = Optional.empty();

    private Optional<String> instanceUrl = Optional.empty();

    private Optional<Boolean> isSandbox = Optional.empty();

    private Optional<String> secretKey = Optional.empty();

    private Optional<String> subdomain = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedSalesforceCrmIntegration other) {
      credential(other.getCredential());
      filters(other.getFilters());
      instanceUrl(other.getInstanceUrl());
      isSandbox(other.getIsSandbox());
      secretKey(other.getSecretKey());
      subdomain(other.getSubdomain());
      return this;
    }

    @JsonSetter(
        value = "credential",
        nulls = Nulls.SKIP
    )
    public Builder credential(Optional<SharedSalesforceCrmCredential> credential) {
      this.credential = credential;
      return this;
    }

    public Builder credential(SharedSalesforceCrmCredential credential) {
      this.credential = Optional.of(credential);
      return this;
    }

    @JsonSetter(
        value = "filters",
        nulls = Nulls.SKIP
    )
    public Builder filters(Optional<List<SharedSalesforceSyncFilter>> filters) {
      this.filters = filters;
      return this;
    }

    public Builder filters(List<SharedSalesforceSyncFilter> filters) {
      this.filters = Optional.of(filters);
      return this;
    }

    @JsonSetter(
        value = "instanceUrl",
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
        value = "isSandbox",
        nulls = Nulls.SKIP
    )
    public Builder isSandbox(Optional<Boolean> isSandbox) {
      this.isSandbox = isSandbox;
      return this;
    }

    public Builder isSandbox(Boolean isSandbox) {
      this.isSandbox = Optional.of(isSandbox);
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

    @JsonSetter(
        value = "subdomain",
        nulls = Nulls.SKIP
    )
    public Builder subdomain(Optional<String> subdomain) {
      this.subdomain = subdomain;
      return this;
    }

    public Builder subdomain(String subdomain) {
      this.subdomain = Optional.of(subdomain);
      return this;
    }

    public SharedSalesforceCrmIntegration build() {
      return new SharedSalesforceCrmIntegration(credential, filters, instanceUrl, isSandbox, secretKey, subdomain);
    }
  }
}
