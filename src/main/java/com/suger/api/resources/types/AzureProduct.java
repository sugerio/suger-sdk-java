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
    builder = AzureProduct.Builder.class
)
public final class AzureProduct {
  private final Optional<List<AzureProductAvailability>> availabilities;

  private final Optional<List<AzureProductBranch>> branches;

  private final Optional<List<AzureTypeValue>> externalIDs;

  private final Optional<String> id;

  private final Optional<Boolean> isModularPublishing;

  private final Optional<List<AzureProductListing>> listings;

  private final Optional<String> name;

  private final Optional<List<AzureProductPackageConfiguration>> packageConfigurations;

  private final Optional<List<AzureProductProperty>> properties;

  private final Optional<String> resourceType;

  private final Optional<AzureProductSetup> setup;

  private final Optional<List<AzureProductSubmission>> submissions;

  private final Optional<List<AzureProductVariant>> variants;

  private int _cachedHashCode;

  AzureProduct(Optional<List<AzureProductAvailability>> availabilities,
      Optional<List<AzureProductBranch>> branches, Optional<List<AzureTypeValue>> externalIDs,
      Optional<String> id, Optional<Boolean> isModularPublishing,
      Optional<List<AzureProductListing>> listings, Optional<String> name,
      Optional<List<AzureProductPackageConfiguration>> packageConfigurations,
      Optional<List<AzureProductProperty>> properties, Optional<String> resourceType,
      Optional<AzureProductSetup> setup, Optional<List<AzureProductSubmission>> submissions,
      Optional<List<AzureProductVariant>> variants) {
    this.availabilities = availabilities;
    this.branches = branches;
    this.externalIDs = externalIDs;
    this.id = id;
    this.isModularPublishing = isModularPublishing;
    this.listings = listings;
    this.name = name;
    this.packageConfigurations = packageConfigurations;
    this.properties = properties;
    this.resourceType = resourceType;
    this.setup = setup;
    this.submissions = submissions;
    this.variants = variants;
  }

  @JsonProperty("availabilities")
  public Optional<List<AzureProductAvailability>> getAvailabilities() {
    return availabilities;
  }

  @JsonProperty("branches")
  public Optional<List<AzureProductBranch>> getBranches() {
    return branches;
  }

  @JsonProperty("externalIDs")
  public Optional<List<AzureTypeValue>> getExternalIDs() {
    return externalIDs;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("isModularPublishing")
  public Optional<Boolean> getIsModularPublishing() {
    return isModularPublishing;
  }

  @JsonProperty("listings")
  public Optional<List<AzureProductListing>> getListings() {
    return listings;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("packageConfigurations")
  public Optional<List<AzureProductPackageConfiguration>> getPackageConfigurations() {
    return packageConfigurations;
  }

  @JsonProperty("properties")
  public Optional<List<AzureProductProperty>> getProperties() {
    return properties;
  }

  @JsonProperty("resourceType")
  public Optional<String> getResourceType() {
    return resourceType;
  }

  /**
   * @return Not original fields. They are populated by other API calls
   */
  @JsonProperty("setup")
  public Optional<AzureProductSetup> getSetup() {
    return setup;
  }

  @JsonProperty("submissions")
  public Optional<List<AzureProductSubmission>> getSubmissions() {
    return submissions;
  }

  @JsonProperty("variants")
  public Optional<List<AzureProductVariant>> getVariants() {
    return variants;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProduct && equalTo((AzureProduct) other);
  }

  private boolean equalTo(AzureProduct other) {
    return availabilities.equals(other.availabilities) && branches.equals(other.branches) && externalIDs.equals(other.externalIDs) && id.equals(other.id) && isModularPublishing.equals(other.isModularPublishing) && listings.equals(other.listings) && name.equals(other.name) && packageConfigurations.equals(other.packageConfigurations) && properties.equals(other.properties) && resourceType.equals(other.resourceType) && setup.equals(other.setup) && submissions.equals(other.submissions) && variants.equals(other.variants);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.availabilities, this.branches, this.externalIDs, this.id, this.isModularPublishing, this.listings, this.name, this.packageConfigurations, this.properties, this.resourceType, this.setup, this.submissions, this.variants);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProduct{" + "availabilities: " + availabilities + ", branches: " + branches + ", externalIDs: " + externalIDs + ", id: " + id + ", isModularPublishing: " + isModularPublishing + ", listings: " + listings + ", name: " + name + ", packageConfigurations: " + packageConfigurations + ", properties: " + properties + ", resourceType: " + resourceType + ", setup: " + setup + ", submissions: " + submissions + ", variants: " + variants + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<AzureProductAvailability>> availabilities = Optional.empty();

    private Optional<List<AzureProductBranch>> branches = Optional.empty();

    private Optional<List<AzureTypeValue>> externalIDs = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<Boolean> isModularPublishing = Optional.empty();

    private Optional<List<AzureProductListing>> listings = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<List<AzureProductPackageConfiguration>> packageConfigurations = Optional.empty();

    private Optional<List<AzureProductProperty>> properties = Optional.empty();

    private Optional<String> resourceType = Optional.empty();

    private Optional<AzureProductSetup> setup = Optional.empty();

    private Optional<List<AzureProductSubmission>> submissions = Optional.empty();

    private Optional<List<AzureProductVariant>> variants = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProduct other) {
      availabilities(other.getAvailabilities());
      branches(other.getBranches());
      externalIDs(other.getExternalIDs());
      id(other.getId());
      isModularPublishing(other.getIsModularPublishing());
      listings(other.getListings());
      name(other.getName());
      packageConfigurations(other.getPackageConfigurations());
      properties(other.getProperties());
      resourceType(other.getResourceType());
      setup(other.getSetup());
      submissions(other.getSubmissions());
      variants(other.getVariants());
      return this;
    }

    @JsonSetter(
        value = "availabilities",
        nulls = Nulls.SKIP
    )
    public Builder availabilities(Optional<List<AzureProductAvailability>> availabilities) {
      this.availabilities = availabilities;
      return this;
    }

    public Builder availabilities(List<AzureProductAvailability> availabilities) {
      this.availabilities = Optional.of(availabilities);
      return this;
    }

    @JsonSetter(
        value = "branches",
        nulls = Nulls.SKIP
    )
    public Builder branches(Optional<List<AzureProductBranch>> branches) {
      this.branches = branches;
      return this;
    }

    public Builder branches(List<AzureProductBranch> branches) {
      this.branches = Optional.of(branches);
      return this;
    }

    @JsonSetter(
        value = "externalIDs",
        nulls = Nulls.SKIP
    )
    public Builder externalIDs(Optional<List<AzureTypeValue>> externalIDs) {
      this.externalIDs = externalIDs;
      return this;
    }

    public Builder externalIDs(List<AzureTypeValue> externalIDs) {
      this.externalIDs = Optional.of(externalIDs);
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
        value = "isModularPublishing",
        nulls = Nulls.SKIP
    )
    public Builder isModularPublishing(Optional<Boolean> isModularPublishing) {
      this.isModularPublishing = isModularPublishing;
      return this;
    }

    public Builder isModularPublishing(Boolean isModularPublishing) {
      this.isModularPublishing = Optional.of(isModularPublishing);
      return this;
    }

    @JsonSetter(
        value = "listings",
        nulls = Nulls.SKIP
    )
    public Builder listings(Optional<List<AzureProductListing>> listings) {
      this.listings = listings;
      return this;
    }

    public Builder listings(List<AzureProductListing> listings) {
      this.listings = Optional.of(listings);
      return this;
    }

    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "packageConfigurations",
        nulls = Nulls.SKIP
    )
    public Builder packageConfigurations(
        Optional<List<AzureProductPackageConfiguration>> packageConfigurations) {
      this.packageConfigurations = packageConfigurations;
      return this;
    }

    public Builder packageConfigurations(
        List<AzureProductPackageConfiguration> packageConfigurations) {
      this.packageConfigurations = Optional.of(packageConfigurations);
      return this;
    }

    @JsonSetter(
        value = "properties",
        nulls = Nulls.SKIP
    )
    public Builder properties(Optional<List<AzureProductProperty>> properties) {
      this.properties = properties;
      return this;
    }

    public Builder properties(List<AzureProductProperty> properties) {
      this.properties = Optional.of(properties);
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
        value = "setup",
        nulls = Nulls.SKIP
    )
    public Builder setup(Optional<AzureProductSetup> setup) {
      this.setup = setup;
      return this;
    }

    public Builder setup(AzureProductSetup setup) {
      this.setup = Optional.of(setup);
      return this;
    }

    @JsonSetter(
        value = "submissions",
        nulls = Nulls.SKIP
    )
    public Builder submissions(Optional<List<AzureProductSubmission>> submissions) {
      this.submissions = submissions;
      return this;
    }

    public Builder submissions(List<AzureProductSubmission> submissions) {
      this.submissions = Optional.of(submissions);
      return this;
    }

    @JsonSetter(
        value = "variants",
        nulls = Nulls.SKIP
    )
    public Builder variants(Optional<List<AzureProductVariant>> variants) {
      this.variants = variants;
      return this;
    }

    public Builder variants(List<AzureProductVariant> variants) {
      this.variants = Optional.of(variants);
      return this;
    }

    public AzureProduct build() {
      return new AzureProduct(availabilities, branches, externalIDs, id, isModularPublishing, listings, name, packageConfigurations, properties, resourceType, setup, submissions, variants);
    }
  }
}
