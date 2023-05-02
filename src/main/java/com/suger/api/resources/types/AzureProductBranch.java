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
    builder = AzureProductBranch.Builder.class
)
public final class AzureProductBranch {
  private final Optional<String> currentDraftInstanceId;

  private final Optional<String> friendlyName;

  private final Optional<String> id;

  private final Optional<String> module;

  private final Optional<String> resourceType;

  private final Optional<String> type;

  private final Optional<String> variantId;

  private int _cachedHashCode;

  AzureProductBranch(Optional<String> currentDraftInstanceId, Optional<String> friendlyName,
      Optional<String> id, Optional<String> module, Optional<String> resourceType,
      Optional<String> type, Optional<String> variantId) {
    this.currentDraftInstanceId = currentDraftInstanceId;
    this.friendlyName = friendlyName;
    this.id = id;
    this.module = module;
    this.resourceType = resourceType;
    this.type = type;
    this.variantId = variantId;
  }

  @JsonProperty("currentDraftInstanceID")
  public Optional<String> getCurrentDraftInstanceId() {
    return currentDraftInstanceId;
  }

  @JsonProperty("friendlyName")
  public Optional<String> getFriendlyName() {
    return friendlyName;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("module")
  public Optional<String> getModule() {
    return module;
  }

  @JsonProperty("resourceType")
  public Optional<String> getResourceType() {
    return resourceType;
  }

  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  @JsonProperty("variantID")
  public Optional<String> getVariantId() {
    return variantId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductBranch && equalTo((AzureProductBranch) other);
  }

  private boolean equalTo(AzureProductBranch other) {
    return currentDraftInstanceId.equals(other.currentDraftInstanceId) && friendlyName.equals(other.friendlyName) && id.equals(other.id) && module.equals(other.module) && resourceType.equals(other.resourceType) && type.equals(other.type) && variantId.equals(other.variantId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.currentDraftInstanceId, this.friendlyName, this.id, this.module, this.resourceType, this.type, this.variantId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductBranch{" + "currentDraftInstanceId: " + currentDraftInstanceId + ", friendlyName: " + friendlyName + ", id: " + id + ", module: " + module + ", resourceType: " + resourceType + ", type: " + type + ", variantId: " + variantId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> currentDraftInstanceId = Optional.empty();

    private Optional<String> friendlyName = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> module = Optional.empty();

    private Optional<String> resourceType = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> variantId = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductBranch other) {
      currentDraftInstanceId(other.getCurrentDraftInstanceId());
      friendlyName(other.getFriendlyName());
      id(other.getId());
      module(other.getModule());
      resourceType(other.getResourceType());
      type(other.getType());
      variantId(other.getVariantId());
      return this;
    }

    @JsonSetter(
        value = "currentDraftInstanceID",
        nulls = Nulls.SKIP
    )
    public Builder currentDraftInstanceId(Optional<String> currentDraftInstanceId) {
      this.currentDraftInstanceId = currentDraftInstanceId;
      return this;
    }

    public Builder currentDraftInstanceId(String currentDraftInstanceId) {
      this.currentDraftInstanceId = Optional.of(currentDraftInstanceId);
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
        value = "module",
        nulls = Nulls.SKIP
    )
    public Builder module(Optional<String> module) {
      this.module = module;
      return this;
    }

    public Builder module(String module) {
      this.module = Optional.of(module);
      return this;
    }

    @JsonSetter(
        value = "resourceType",
        nulls = Nulls.SKIP
    )
    public Builder resourceType(Optional<String> resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    public Builder resourceType(String resourceType) {
      this.resourceType = Optional.of(resourceType);
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

    @JsonSetter(
        value = "variantID",
        nulls = Nulls.SKIP
    )
    public Builder variantId(Optional<String> variantId) {
      this.variantId = variantId;
      return this;
    }

    public Builder variantId(String variantId) {
      this.variantId = Optional.of(variantId);
      return this;
    }

    public AzureProductBranch build() {
      return new AzureProductBranch(currentDraftInstanceId, friendlyName, id, module, resourceType, type, variantId);
    }
  }
}
