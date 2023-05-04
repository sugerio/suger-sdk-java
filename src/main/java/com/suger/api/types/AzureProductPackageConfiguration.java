package com.suger.api.types;

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
    builder = AzureProductPackageConfiguration.Builder.class
)
public final class AzureProductPackageConfiguration {
  private final Optional<String> azureActiveDirectoryApplicationId;

  private final Optional<String> azureActiveDirectoryTenantId;

  private final Optional<String> connectionWebhook;

  private final Optional<String> id;

  private final Optional<String> landingPageUri;

  private final Optional<AzureProductPackageConfigurationResourceType> resourceType;

  private int _cachedHashCode;

  AzureProductPackageConfiguration(Optional<String> azureActiveDirectoryApplicationId,
      Optional<String> azureActiveDirectoryTenantId, Optional<String> connectionWebhook,
      Optional<String> id, Optional<String> landingPageUri,
      Optional<AzureProductPackageConfigurationResourceType> resourceType) {
    this.azureActiveDirectoryApplicationId = azureActiveDirectoryApplicationId;
    this.azureActiveDirectoryTenantId = azureActiveDirectoryTenantId;
    this.connectionWebhook = connectionWebhook;
    this.id = id;
    this.landingPageUri = landingPageUri;
    this.resourceType = resourceType;
  }

  @JsonProperty("azureActiveDirectoryApplicationID")
  public Optional<String> getAzureActiveDirectoryApplicationId() {
    return azureActiveDirectoryApplicationId;
  }

  @JsonProperty("azureActiveDirectoryTenantID")
  public Optional<String> getAzureActiveDirectoryTenantId() {
    return azureActiveDirectoryTenantId;
  }

  @JsonProperty("connectionWebhook")
  public Optional<String> getConnectionWebhook() {
    return connectionWebhook;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("landingPageUri")
  public Optional<String> getLandingPageUri() {
    return landingPageUri;
  }

  @JsonProperty("resourceType")
  public Optional<AzureProductPackageConfigurationResourceType> getResourceType() {
    return resourceType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductPackageConfiguration && equalTo((AzureProductPackageConfiguration) other);
  }

  private boolean equalTo(AzureProductPackageConfiguration other) {
    return azureActiveDirectoryApplicationId.equals(other.azureActiveDirectoryApplicationId) && azureActiveDirectoryTenantId.equals(other.azureActiveDirectoryTenantId) && connectionWebhook.equals(other.connectionWebhook) && id.equals(other.id) && landingPageUri.equals(other.landingPageUri) && resourceType.equals(other.resourceType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.azureActiveDirectoryApplicationId, this.azureActiveDirectoryTenantId, this.connectionWebhook, this.id, this.landingPageUri, this.resourceType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductPackageConfiguration{" + "azureActiveDirectoryApplicationId: " + azureActiveDirectoryApplicationId + ", azureActiveDirectoryTenantId: " + azureActiveDirectoryTenantId + ", connectionWebhook: " + connectionWebhook + ", id: " + id + ", landingPageUri: " + landingPageUri + ", resourceType: " + resourceType + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> azureActiveDirectoryApplicationId = Optional.empty();

    private Optional<String> azureActiveDirectoryTenantId = Optional.empty();

    private Optional<String> connectionWebhook = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> landingPageUri = Optional.empty();

    private Optional<AzureProductPackageConfigurationResourceType> resourceType = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductPackageConfiguration other) {
      azureActiveDirectoryApplicationId(other.getAzureActiveDirectoryApplicationId());
      azureActiveDirectoryTenantId(other.getAzureActiveDirectoryTenantId());
      connectionWebhook(other.getConnectionWebhook());
      id(other.getId());
      landingPageUri(other.getLandingPageUri());
      resourceType(other.getResourceType());
      return this;
    }

    @JsonSetter(
        value = "azureActiveDirectoryApplicationID",
        nulls = Nulls.SKIP
    )
    public Builder azureActiveDirectoryApplicationId(
        Optional<String> azureActiveDirectoryApplicationId) {
      this.azureActiveDirectoryApplicationId = azureActiveDirectoryApplicationId;
      return this;
    }

    public Builder azureActiveDirectoryApplicationId(String azureActiveDirectoryApplicationId) {
      this.azureActiveDirectoryApplicationId = Optional.of(azureActiveDirectoryApplicationId);
      return this;
    }

    @JsonSetter(
        value = "azureActiveDirectoryTenantID",
        nulls = Nulls.SKIP
    )
    public Builder azureActiveDirectoryTenantId(Optional<String> azureActiveDirectoryTenantId) {
      this.azureActiveDirectoryTenantId = azureActiveDirectoryTenantId;
      return this;
    }

    public Builder azureActiveDirectoryTenantId(String azureActiveDirectoryTenantId) {
      this.azureActiveDirectoryTenantId = Optional.of(azureActiveDirectoryTenantId);
      return this;
    }

    @JsonSetter(
        value = "connectionWebhook",
        nulls = Nulls.SKIP
    )
    public Builder connectionWebhook(Optional<String> connectionWebhook) {
      this.connectionWebhook = connectionWebhook;
      return this;
    }

    public Builder connectionWebhook(String connectionWebhook) {
      this.connectionWebhook = Optional.of(connectionWebhook);
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
        value = "landingPageUri",
        nulls = Nulls.SKIP
    )
    public Builder landingPageUri(Optional<String> landingPageUri) {
      this.landingPageUri = landingPageUri;
      return this;
    }

    public Builder landingPageUri(String landingPageUri) {
      this.landingPageUri = Optional.of(landingPageUri);
      return this;
    }

    @JsonSetter(
        value = "resourceType",
        nulls = Nulls.SKIP
    )
    public Builder resourceType(
        Optional<AzureProductPackageConfigurationResourceType> resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    public Builder resourceType(AzureProductPackageConfigurationResourceType resourceType) {
      this.resourceType = Optional.of(resourceType);
      return this;
    }

    public AzureProductPackageConfiguration build() {
      return new AzureProductPackageConfiguration(azureActiveDirectoryApplicationId, azureActiveDirectoryTenantId, connectionWebhook, id, landingPageUri, resourceType);
    }
  }
}
