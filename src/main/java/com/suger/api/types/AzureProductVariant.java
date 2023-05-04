package com.suger.api.types;

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
    builder = AzureProductVariant.Builder.class
)
public final class AzureProductVariant {
  private final Optional<List<AzureGovernmentCertification>> azureGovernmentCertifications;

  private final Optional<List<String>> cloudAvailabilities;

  private final Optional<String> conversionPaths;

  private final Optional<List<AzureTypeValue>> extendedProperties;

  private final Optional<String> externalId;

  private final Optional<List<AzureProductFeatureAvailability>> featureAvailabilities;

  private final Optional<String> friendlyName;

  private final Optional<String> id;

  private final Optional<String> leadGenId;

  private final Optional<String> referenceVariantId;

  private final Optional<AzureProductVariantResourceType> resourceType;

  private final Optional<AzureProductVariantState> state;

  private int _cachedHashCode;

  AzureProductVariant(Optional<List<AzureGovernmentCertification>> azureGovernmentCertifications,
      Optional<List<String>> cloudAvailabilities, Optional<String> conversionPaths,
      Optional<List<AzureTypeValue>> extendedProperties, Optional<String> externalId,
      Optional<List<AzureProductFeatureAvailability>> featureAvailabilities,
      Optional<String> friendlyName, Optional<String> id, Optional<String> leadGenId,
      Optional<String> referenceVariantId, Optional<AzureProductVariantResourceType> resourceType,
      Optional<AzureProductVariantState> state) {
    this.azureGovernmentCertifications = azureGovernmentCertifications;
    this.cloudAvailabilities = cloudAvailabilities;
    this.conversionPaths = conversionPaths;
    this.extendedProperties = extendedProperties;
    this.externalId = externalId;
    this.featureAvailabilities = featureAvailabilities;
    this.friendlyName = friendlyName;
    this.id = id;
    this.leadGenId = leadGenId;
    this.referenceVariantId = referenceVariantId;
    this.resourceType = resourceType;
    this.state = state;
  }

  @JsonProperty("azureGovernmentCertifications")
  public Optional<List<AzureGovernmentCertification>> getAzureGovernmentCertifications() {
    return azureGovernmentCertifications;
  }

  @JsonProperty("cloudAvailabilities")
  public Optional<List<String>> getCloudAvailabilities() {
    return cloudAvailabilities;
  }

  @JsonProperty("conversionPaths")
  public Optional<String> getConversionPaths() {
    return conversionPaths;
  }

  @JsonProperty("extendedProperties")
  public Optional<List<AzureTypeValue>> getExtendedProperties() {
    return extendedProperties;
  }

  @JsonProperty("externalID")
  public Optional<String> getExternalId() {
    return externalId;
  }

  /**
   * @return Not original fields. They are populated by other API calls
   */
  @JsonProperty("featureAvailabilities")
  public Optional<List<AzureProductFeatureAvailability>> getFeatureAvailabilities() {
    return featureAvailabilities;
  }

  @JsonProperty("friendlyName")
  public Optional<String> getFriendlyName() {
    return friendlyName;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("leadGenID")
  public Optional<String> getLeadGenId() {
    return leadGenId;
  }

  @JsonProperty("referenceVariantID")
  public Optional<String> getReferenceVariantId() {
    return referenceVariantId;
  }

  @JsonProperty("resourceType")
  public Optional<AzureProductVariantResourceType> getResourceType() {
    return resourceType;
  }

  @JsonProperty("state")
  public Optional<AzureProductVariantState> getState() {
    return state;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductVariant && equalTo((AzureProductVariant) other);
  }

  private boolean equalTo(AzureProductVariant other) {
    return azureGovernmentCertifications.equals(other.azureGovernmentCertifications) && cloudAvailabilities.equals(other.cloudAvailabilities) && conversionPaths.equals(other.conversionPaths) && extendedProperties.equals(other.extendedProperties) && externalId.equals(other.externalId) && featureAvailabilities.equals(other.featureAvailabilities) && friendlyName.equals(other.friendlyName) && id.equals(other.id) && leadGenId.equals(other.leadGenId) && referenceVariantId.equals(other.referenceVariantId) && resourceType.equals(other.resourceType) && state.equals(other.state);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.azureGovernmentCertifications, this.cloudAvailabilities, this.conversionPaths, this.extendedProperties, this.externalId, this.featureAvailabilities, this.friendlyName, this.id, this.leadGenId, this.referenceVariantId, this.resourceType, this.state);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductVariant{" + "azureGovernmentCertifications: " + azureGovernmentCertifications + ", cloudAvailabilities: " + cloudAvailabilities + ", conversionPaths: " + conversionPaths + ", extendedProperties: " + extendedProperties + ", externalId: " + externalId + ", featureAvailabilities: " + featureAvailabilities + ", friendlyName: " + friendlyName + ", id: " + id + ", leadGenId: " + leadGenId + ", referenceVariantId: " + referenceVariantId + ", resourceType: " + resourceType + ", state: " + state + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<AzureGovernmentCertification>> azureGovernmentCertifications = Optional.empty();

    private Optional<List<String>> cloudAvailabilities = Optional.empty();

    private Optional<String> conversionPaths = Optional.empty();

    private Optional<List<AzureTypeValue>> extendedProperties = Optional.empty();

    private Optional<String> externalId = Optional.empty();

    private Optional<List<AzureProductFeatureAvailability>> featureAvailabilities = Optional.empty();

    private Optional<String> friendlyName = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> leadGenId = Optional.empty();

    private Optional<String> referenceVariantId = Optional.empty();

    private Optional<AzureProductVariantResourceType> resourceType = Optional.empty();

    private Optional<AzureProductVariantState> state = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductVariant other) {
      azureGovernmentCertifications(other.getAzureGovernmentCertifications());
      cloudAvailabilities(other.getCloudAvailabilities());
      conversionPaths(other.getConversionPaths());
      extendedProperties(other.getExtendedProperties());
      externalId(other.getExternalId());
      featureAvailabilities(other.getFeatureAvailabilities());
      friendlyName(other.getFriendlyName());
      id(other.getId());
      leadGenId(other.getLeadGenId());
      referenceVariantId(other.getReferenceVariantId());
      resourceType(other.getResourceType());
      state(other.getState());
      return this;
    }

    @JsonSetter(
        value = "azureGovernmentCertifications",
        nulls = Nulls.SKIP
    )
    public Builder azureGovernmentCertifications(
        Optional<List<AzureGovernmentCertification>> azureGovernmentCertifications) {
      this.azureGovernmentCertifications = azureGovernmentCertifications;
      return this;
    }

    public Builder azureGovernmentCertifications(
        List<AzureGovernmentCertification> azureGovernmentCertifications) {
      this.azureGovernmentCertifications = Optional.of(azureGovernmentCertifications);
      return this;
    }

    @JsonSetter(
        value = "cloudAvailabilities",
        nulls = Nulls.SKIP
    )
    public Builder cloudAvailabilities(Optional<List<String>> cloudAvailabilities) {
      this.cloudAvailabilities = cloudAvailabilities;
      return this;
    }

    public Builder cloudAvailabilities(List<String> cloudAvailabilities) {
      this.cloudAvailabilities = Optional.of(cloudAvailabilities);
      return this;
    }

    @JsonSetter(
        value = "conversionPaths",
        nulls = Nulls.SKIP
    )
    public Builder conversionPaths(Optional<String> conversionPaths) {
      this.conversionPaths = conversionPaths;
      return this;
    }

    public Builder conversionPaths(String conversionPaths) {
      this.conversionPaths = Optional.of(conversionPaths);
      return this;
    }

    @JsonSetter(
        value = "extendedProperties",
        nulls = Nulls.SKIP
    )
    public Builder extendedProperties(Optional<List<AzureTypeValue>> extendedProperties) {
      this.extendedProperties = extendedProperties;
      return this;
    }

    public Builder extendedProperties(List<AzureTypeValue> extendedProperties) {
      this.extendedProperties = Optional.of(extendedProperties);
      return this;
    }

    @JsonSetter(
        value = "externalID",
        nulls = Nulls.SKIP
    )
    public Builder externalId(Optional<String> externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder externalId(String externalId) {
      this.externalId = Optional.of(externalId);
      return this;
    }

    @JsonSetter(
        value = "featureAvailabilities",
        nulls = Nulls.SKIP
    )
    public Builder featureAvailabilities(
        Optional<List<AzureProductFeatureAvailability>> featureAvailabilities) {
      this.featureAvailabilities = featureAvailabilities;
      return this;
    }

    public Builder featureAvailabilities(
        List<AzureProductFeatureAvailability> featureAvailabilities) {
      this.featureAvailabilities = Optional.of(featureAvailabilities);
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
        value = "leadGenID",
        nulls = Nulls.SKIP
    )
    public Builder leadGenId(Optional<String> leadGenId) {
      this.leadGenId = leadGenId;
      return this;
    }

    public Builder leadGenId(String leadGenId) {
      this.leadGenId = Optional.of(leadGenId);
      return this;
    }

    @JsonSetter(
        value = "referenceVariantID",
        nulls = Nulls.SKIP
    )
    public Builder referenceVariantId(Optional<String> referenceVariantId) {
      this.referenceVariantId = referenceVariantId;
      return this;
    }

    public Builder referenceVariantId(String referenceVariantId) {
      this.referenceVariantId = Optional.of(referenceVariantId);
      return this;
    }

    @JsonSetter(
        value = "resourceType",
        nulls = Nulls.SKIP
    )
    public Builder resourceType(Optional<AzureProductVariantResourceType> resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    public Builder resourceType(AzureProductVariantResourceType resourceType) {
      this.resourceType = Optional.of(resourceType);
      return this;
    }

    @JsonSetter(
        value = "state",
        nulls = Nulls.SKIP
    )
    public Builder state(Optional<AzureProductVariantState> state) {
      this.state = state;
      return this;
    }

    public Builder state(AzureProductVariantState state) {
      this.state = Optional.of(state);
      return this;
    }

    public AzureProductVariant build() {
      return new AzureProductVariant(azureGovernmentCertifications, cloudAvailabilities, conversionPaths, extendedProperties, externalId, featureAvailabilities, friendlyName, id, leadGenId, referenceVariantId, resourceType, state);
    }
  }
}
