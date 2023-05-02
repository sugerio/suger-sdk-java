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
    builder = AzureProductListingAsset.Builder.class
)
public final class AzureProductListingAsset {
  private final Optional<String> description;

  private final Optional<String> fileName;

  private final Optional<String> fileSasUri;

  private final Optional<String> friendlyName;

  private final Optional<String> id;

  private final Optional<Integer> order;

  private final Optional<String> publisherDefinedSasUri;

  private final Optional<AzureProductListingAssetResourceType> resourceType;

  private final Optional<AzureProductListingAssetState> state;

  private final Optional<String> type;

  private int _cachedHashCode;

  AzureProductListingAsset(Optional<String> description, Optional<String> fileName,
      Optional<String> fileSasUri, Optional<String> friendlyName, Optional<String> id,
      Optional<Integer> order, Optional<String> publisherDefinedSasUri,
      Optional<AzureProductListingAssetResourceType> resourceType,
      Optional<AzureProductListingAssetState> state, Optional<String> type) {
    this.description = description;
    this.fileName = fileName;
    this.fileSasUri = fileSasUri;
    this.friendlyName = friendlyName;
    this.id = id;
    this.order = order;
    this.publisherDefinedSasUri = publisherDefinedSasUri;
    this.resourceType = resourceType;
    this.state = state;
    this.type = type;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("fileName")
  public Optional<String> getFileName() {
    return fileName;
  }

  @JsonProperty("fileSasUri")
  public Optional<String> getFileSasUri() {
    return fileSasUri;
  }

  @JsonProperty("friendlyName")
  public Optional<String> getFriendlyName() {
    return friendlyName;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("order")
  public Optional<Integer> getOrder() {
    return order;
  }

  @JsonProperty("publisherDefinedSasUri")
  public Optional<String> getPublisherDefinedSasUri() {
    return publisherDefinedSasUri;
  }

  @JsonProperty("resourceType")
  public Optional<AzureProductListingAssetResourceType> getResourceType() {
    return resourceType;
  }

  @JsonProperty("state")
  public Optional<AzureProductListingAssetState> getState() {
    return state;
  }

  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductListingAsset && equalTo((AzureProductListingAsset) other);
  }

  private boolean equalTo(AzureProductListingAsset other) {
    return description.equals(other.description) && fileName.equals(other.fileName) && fileSasUri.equals(other.fileSasUri) && friendlyName.equals(other.friendlyName) && id.equals(other.id) && order.equals(other.order) && publisherDefinedSasUri.equals(other.publisherDefinedSasUri) && resourceType.equals(other.resourceType) && state.equals(other.state) && type.equals(other.type);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.description, this.fileName, this.fileSasUri, this.friendlyName, this.id, this.order, this.publisherDefinedSasUri, this.resourceType, this.state, this.type);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductListingAsset{" + "description: " + description + ", fileName: " + fileName + ", fileSasUri: " + fileSasUri + ", friendlyName: " + friendlyName + ", id: " + id + ", order: " + order + ", publisherDefinedSasUri: " + publisherDefinedSasUri + ", resourceType: " + resourceType + ", state: " + state + ", type: " + type + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> description = Optional.empty();

    private Optional<String> fileName = Optional.empty();

    private Optional<String> fileSasUri = Optional.empty();

    private Optional<String> friendlyName = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<Integer> order = Optional.empty();

    private Optional<String> publisherDefinedSasUri = Optional.empty();

    private Optional<AzureProductListingAssetResourceType> resourceType = Optional.empty();

    private Optional<AzureProductListingAssetState> state = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductListingAsset other) {
      description(other.getDescription());
      fileName(other.getFileName());
      fileSasUri(other.getFileSasUri());
      friendlyName(other.getFriendlyName());
      id(other.getId());
      order(other.getOrder());
      publisherDefinedSasUri(other.getPublisherDefinedSasUri());
      resourceType(other.getResourceType());
      state(other.getState());
      type(other.getType());
      return this;
    }

    @JsonSetter(
        value = "description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<String> description) {
      this.description = description;
      return this;
    }

    public Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }

    @JsonSetter(
        value = "fileName",
        nulls = Nulls.SKIP
    )
    public Builder fileName(Optional<String> fileName) {
      this.fileName = fileName;
      return this;
    }

    public Builder fileName(String fileName) {
      this.fileName = Optional.of(fileName);
      return this;
    }

    @JsonSetter(
        value = "fileSasUri",
        nulls = Nulls.SKIP
    )
    public Builder fileSasUri(Optional<String> fileSasUri) {
      this.fileSasUri = fileSasUri;
      return this;
    }

    public Builder fileSasUri(String fileSasUri) {
      this.fileSasUri = Optional.of(fileSasUri);
      return this;
    }

    @JsonSetter(
        value = "friendlyName",
        nulls = Nulls.SKIP
    )
    public Builder friendlyName(Optional<String> friendlyName) {
      this.friendlyName = friendlyName;
      return this;
    }

    public Builder friendlyName(String friendlyName) {
      this.friendlyName = Optional.of(friendlyName);
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
        value = "order",
        nulls = Nulls.SKIP
    )
    public Builder order(Optional<Integer> order) {
      this.order = order;
      return this;
    }

    public Builder order(Integer order) {
      this.order = Optional.of(order);
      return this;
    }

    @JsonSetter(
        value = "publisherDefinedSasUri",
        nulls = Nulls.SKIP
    )
    public Builder publisherDefinedSasUri(Optional<String> publisherDefinedSasUri) {
      this.publisherDefinedSasUri = publisherDefinedSasUri;
      return this;
    }

    public Builder publisherDefinedSasUri(String publisherDefinedSasUri) {
      this.publisherDefinedSasUri = Optional.of(publisherDefinedSasUri);
      return this;
    }

    @JsonSetter(
        value = "resourceType",
        nulls = Nulls.SKIP
    )
    public Builder resourceType(Optional<AzureProductListingAssetResourceType> resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    public Builder resourceType(AzureProductListingAssetResourceType resourceType) {
      this.resourceType = Optional.of(resourceType);
      return this;
    }

    @JsonSetter(
        value = "state",
        nulls = Nulls.SKIP
    )
    public Builder state(Optional<AzureProductListingAssetState> state) {
      this.state = state;
      return this;
    }

    public Builder state(AzureProductListingAssetState state) {
      this.state = Optional.of(state);
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<String> type) {
      this.type = type;
      return this;
    }

    public Builder type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    public AzureProductListingAsset build() {
      return new AzureProductListingAsset(description, fileName, fileSasUri, friendlyName, id, order, publisherDefinedSasUri, resourceType, state, type);
    }
  }
}
