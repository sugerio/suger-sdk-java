package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzureProductSubmission.Builder.class
)
public final class AzureProductSubmission {
  private final Optional<Boolean> areResourcesReady;

  private final Optional<String> friendlyName;

  private final Optional<String> id;

  private final Optional<AzurePendingUpdateInfo> pendingUpdateInfo;

  private final Optional<String> publishedTimeInUtc;

  private final Optional<Integer> releaseNumber;

  private final Optional<AzureProductSubmissionResourceType> resourceType;

  private final Optional<List<AzureTypeValue>> resources;

  private final Optional<AzureProductSubmissionState> state;

  private final Optional<AzureProductSubmissionSubState> subState;

  private final Optional<List<AzureTypeValue>> targets;

  private final Optional<List<AzureVariantResource>> variantResources;

  private int _cachedHashCode;

  AzureProductSubmission(Optional<Boolean> areResourcesReady, Optional<String> friendlyName,
      Optional<String> id, Optional<AzurePendingUpdateInfo> pendingUpdateInfo,
      Optional<String> publishedTimeInUtc, Optional<Integer> releaseNumber,
      Optional<AzureProductSubmissionResourceType> resourceType,
      Optional<List<AzureTypeValue>> resources, Optional<AzureProductSubmissionState> state,
      Optional<AzureProductSubmissionSubState> subState, Optional<List<AzureTypeValue>> targets,
      Optional<List<AzureVariantResource>> variantResources) {
    this.areResourcesReady = areResourcesReady;
    this.friendlyName = friendlyName;
    this.id = id;
    this.pendingUpdateInfo = pendingUpdateInfo;
    this.publishedTimeInUtc = publishedTimeInUtc;
    this.releaseNumber = releaseNumber;
    this.resourceType = resourceType;
    this.resources = resources;
    this.state = state;
    this.subState = subState;
    this.targets = targets;
    this.variantResources = variantResources;
  }

  @JsonProperty("areResourcesReady")
  public Optional<Boolean> getAreResourcesReady() {
    return areResourcesReady;
  }

  @JsonProperty("friendlyName")
  public Optional<String> getFriendlyName() {
    return friendlyName;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("pendingUpdateInfo")
  public Optional<AzurePendingUpdateInfo> getPendingUpdateInfo() {
    return pendingUpdateInfo;
  }

  @JsonProperty("publishedTimeInUtc")
  public Optional<String> getPublishedTimeInUtc() {
    return publishedTimeInUtc;
  }

  @JsonProperty("releaseNumber")
  public Optional<Integer> getReleaseNumber() {
    return releaseNumber;
  }

  @JsonProperty("resourceType")
  public Optional<AzureProductSubmissionResourceType> getResourceType() {
    return resourceType;
  }

  @JsonProperty("resources")
  public Optional<List<AzureTypeValue>> getResources() {
    return resources;
  }

  @JsonProperty("state")
  public Optional<AzureProductSubmissionState> getState() {
    return state;
  }

  @JsonProperty("subState")
  public Optional<AzureProductSubmissionSubState> getSubState() {
    return subState;
  }

  @JsonProperty("targets")
  public Optional<List<AzureTypeValue>> getTargets() {
    return targets;
  }

  @JsonProperty("variantResources")
  public Optional<List<AzureVariantResource>> getVariantResources() {
    return variantResources;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductSubmission && equalTo((AzureProductSubmission) other);
  }

  private boolean equalTo(AzureProductSubmission other) {
    return areResourcesReady.equals(other.areResourcesReady) && friendlyName.equals(other.friendlyName) && id.equals(other.id) && pendingUpdateInfo.equals(other.pendingUpdateInfo) && publishedTimeInUtc.equals(other.publishedTimeInUtc) && releaseNumber.equals(other.releaseNumber) && resourceType.equals(other.resourceType) && resources.equals(other.resources) && state.equals(other.state) && subState.equals(other.subState) && targets.equals(other.targets) && variantResources.equals(other.variantResources);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.areResourcesReady, this.friendlyName, this.id, this.pendingUpdateInfo, this.publishedTimeInUtc, this.releaseNumber, this.resourceType, this.resources, this.state, this.subState, this.targets, this.variantResources);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductSubmission{" + "areResourcesReady: " + areResourcesReady + ", friendlyName: " + friendlyName + ", id: " + id + ", pendingUpdateInfo: " + pendingUpdateInfo + ", publishedTimeInUtc: " + publishedTimeInUtc + ", releaseNumber: " + releaseNumber + ", resourceType: " + resourceType + ", resources: " + resources + ", state: " + state + ", subState: " + subState + ", targets: " + targets + ", variantResources: " + variantResources + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Boolean> areResourcesReady = Optional.empty();

    private Optional<String> friendlyName = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<AzurePendingUpdateInfo> pendingUpdateInfo = Optional.empty();

    private Optional<String> publishedTimeInUtc = Optional.empty();

    private Optional<Integer> releaseNumber = Optional.empty();

    private Optional<AzureProductSubmissionResourceType> resourceType = Optional.empty();

    private Optional<List<AzureTypeValue>> resources = Optional.empty();

    private Optional<AzureProductSubmissionState> state = Optional.empty();

    private Optional<AzureProductSubmissionSubState> subState = Optional.empty();

    private Optional<List<AzureTypeValue>> targets = Optional.empty();

    private Optional<List<AzureVariantResource>> variantResources = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductSubmission other) {
      areResourcesReady(other.getAreResourcesReady());
      friendlyName(other.getFriendlyName());
      id(other.getId());
      pendingUpdateInfo(other.getPendingUpdateInfo());
      publishedTimeInUtc(other.getPublishedTimeInUtc());
      releaseNumber(other.getReleaseNumber());
      resourceType(other.getResourceType());
      resources(other.getResources());
      state(other.getState());
      subState(other.getSubState());
      targets(other.getTargets());
      variantResources(other.getVariantResources());
      return this;
    }

    @JsonSetter(
        value = "areResourcesReady",
        nulls = Nulls.SKIP
    )
    public Builder areResourcesReady(Optional<Boolean> areResourcesReady) {
      this.areResourcesReady = areResourcesReady;
      return this;
    }

    public Builder areResourcesReady(Boolean areResourcesReady) {
      this.areResourcesReady = Optional.of(areResourcesReady);
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
        value = "pendingUpdateInfo",
        nulls = Nulls.SKIP
    )
    public Builder pendingUpdateInfo(Optional<AzurePendingUpdateInfo> pendingUpdateInfo) {
      this.pendingUpdateInfo = pendingUpdateInfo;
      return this;
    }

    public Builder pendingUpdateInfo(AzurePendingUpdateInfo pendingUpdateInfo) {
      this.pendingUpdateInfo = Optional.of(pendingUpdateInfo);
      return this;
    }

    @JsonSetter(
        value = "publishedTimeInUtc",
        nulls = Nulls.SKIP
    )
    public Builder publishedTimeInUtc(Optional<String> publishedTimeInUtc) {
      this.publishedTimeInUtc = publishedTimeInUtc;
      return this;
    }

    public Builder publishedTimeInUtc(String publishedTimeInUtc) {
      this.publishedTimeInUtc = Optional.of(publishedTimeInUtc);
      return this;
    }

    @JsonSetter(
        value = "releaseNumber",
        nulls = Nulls.SKIP
    )
    public Builder releaseNumber(Optional<Integer> releaseNumber) {
      this.releaseNumber = releaseNumber;
      return this;
    }

    public Builder releaseNumber(Integer releaseNumber) {
      this.releaseNumber = Optional.of(releaseNumber);
      return this;
    }

    @JsonSetter(
        value = "resourceType",
        nulls = Nulls.SKIP
    )
    public Builder resourceType(Optional<AzureProductSubmissionResourceType> resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    public Builder resourceType(AzureProductSubmissionResourceType resourceType) {
      this.resourceType = Optional.of(resourceType);
      return this;
    }

    @JsonSetter(
        value = "resources",
        nulls = Nulls.SKIP
    )
    public Builder resources(Optional<List<AzureTypeValue>> resources) {
      this.resources = resources;
      return this;
    }

    public Builder resources(List<AzureTypeValue> resources) {
      this.resources = Optional.of(resources);
      return this;
    }

    @JsonSetter(
        value = "state",
        nulls = Nulls.SKIP
    )
    public Builder state(Optional<AzureProductSubmissionState> state) {
      this.state = state;
      return this;
    }

    public Builder state(AzureProductSubmissionState state) {
      this.state = Optional.of(state);
      return this;
    }

    @JsonSetter(
        value = "subState",
        nulls = Nulls.SKIP
    )
    public Builder subState(Optional<AzureProductSubmissionSubState> subState) {
      this.subState = subState;
      return this;
    }

    public Builder subState(AzureProductSubmissionSubState subState) {
      this.subState = Optional.of(subState);
      return this;
    }

    @JsonSetter(
        value = "targets",
        nulls = Nulls.SKIP
    )
    public Builder targets(Optional<List<AzureTypeValue>> targets) {
      this.targets = targets;
      return this;
    }

    public Builder targets(List<AzureTypeValue> targets) {
      this.targets = Optional.of(targets);
      return this;
    }

    @JsonSetter(
        value = "variantResources",
        nulls = Nulls.SKIP
    )
    public Builder variantResources(Optional<List<AzureVariantResource>> variantResources) {
      this.variantResources = variantResources;
      return this;
    }

    public Builder variantResources(List<AzureVariantResource> variantResources) {
      this.variantResources = Optional.of(variantResources);
      return this;
    }

    public AzureProductSubmission build() {
      return new AzureProductSubmission(areResourcesReady, friendlyName, id, pendingUpdateInfo, publishedTimeInUtc, releaseNumber, resourceType, resources, state, subState, targets, variantResources);
    }
  }
}
