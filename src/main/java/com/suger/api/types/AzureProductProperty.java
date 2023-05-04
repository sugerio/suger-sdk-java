package com.suger.api.types;

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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzureProductProperty.Builder.class
)
public final class AzureProductProperty {
  private final Optional<List<String>> additionalCategories;

  private final Optional<String> appVersion;

  private final Optional<List<String>> applicableProducts;

  private final Optional<List<String>> categories;

  private final Optional<List<String>> customAmendments;

  private final Optional<List<String>> extendedProperties;

  private final Optional<String> globalAmendmentTerms;

  private final Optional<List<String>> hideKeys;

  private final Optional<String> id;

  private final Optional<List<String>> industries;

  private final Optional<Map<String, Object>> leveledCategories;

  private final Optional<Map<String, Object>> leveledIndustries;

  private final Optional<Boolean> marketingOnlyChange;

  private final Optional<List<String>> productTags;

  private final Optional<String> resourceType;

  private final Optional<String> submissionVersion;

  private final Optional<String> termsOfUse;

  private final Optional<Boolean> useEnterpriseContract;

  private int _cachedHashCode;

  AzureProductProperty(Optional<List<String>> additionalCategories, Optional<String> appVersion,
      Optional<List<String>> applicableProducts, Optional<List<String>> categories,
      Optional<List<String>> customAmendments, Optional<List<String>> extendedProperties,
      Optional<String> globalAmendmentTerms, Optional<List<String>> hideKeys, Optional<String> id,
      Optional<List<String>> industries, Optional<Map<String, Object>> leveledCategories,
      Optional<Map<String, Object>> leveledIndustries, Optional<Boolean> marketingOnlyChange,
      Optional<List<String>> productTags, Optional<String> resourceType,
      Optional<String> submissionVersion, Optional<String> termsOfUse,
      Optional<Boolean> useEnterpriseContract) {
    this.additionalCategories = additionalCategories;
    this.appVersion = appVersion;
    this.applicableProducts = applicableProducts;
    this.categories = categories;
    this.customAmendments = customAmendments;
    this.extendedProperties = extendedProperties;
    this.globalAmendmentTerms = globalAmendmentTerms;
    this.hideKeys = hideKeys;
    this.id = id;
    this.industries = industries;
    this.leveledCategories = leveledCategories;
    this.leveledIndustries = leveledIndustries;
    this.marketingOnlyChange = marketingOnlyChange;
    this.productTags = productTags;
    this.resourceType = resourceType;
    this.submissionVersion = submissionVersion;
    this.termsOfUse = termsOfUse;
    this.useEnterpriseContract = useEnterpriseContract;
  }

  @JsonProperty("additionalCategories")
  public Optional<List<String>> getAdditionalCategories() {
    return additionalCategories;
  }

  @JsonProperty("appVersion")
  public Optional<String> getAppVersion() {
    return appVersion;
  }

  @JsonProperty("applicableProducts")
  public Optional<List<String>> getApplicableProducts() {
    return applicableProducts;
  }

  @JsonProperty("categories")
  public Optional<List<String>> getCategories() {
    return categories;
  }

  @JsonProperty("customAmendments")
  public Optional<List<String>> getCustomAmendments() {
    return customAmendments;
  }

  @JsonProperty("extendedProperties")
  public Optional<List<String>> getExtendedProperties() {
    return extendedProperties;
  }

  @JsonProperty("globalAmendmentTerms")
  public Optional<String> getGlobalAmendmentTerms() {
    return globalAmendmentTerms;
  }

  @JsonProperty("hideKeys")
  public Optional<List<String>> getHideKeys() {
    return hideKeys;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("industries")
  public Optional<List<String>> getIndustries() {
    return industries;
  }

  @JsonProperty("leveledCategories")
  public Optional<Map<String, Object>> getLeveledCategories() {
    return leveledCategories;
  }

  @JsonProperty("leveledIndustries")
  public Optional<Map<String, Object>> getLeveledIndustries() {
    return leveledIndustries;
  }

  @JsonProperty("marketingOnlyChange")
  public Optional<Boolean> getMarketingOnlyChange() {
    return marketingOnlyChange;
  }

  @JsonProperty("productTags")
  public Optional<List<String>> getProductTags() {
    return productTags;
  }

  @JsonProperty("resourceType")
  public Optional<String> getResourceType() {
    return resourceType;
  }

  @JsonProperty("submissionVersion")
  public Optional<String> getSubmissionVersion() {
    return submissionVersion;
  }

  @JsonProperty("termsOfUse")
  public Optional<String> getTermsOfUse() {
    return termsOfUse;
  }

  @JsonProperty("useEnterpriseContract")
  public Optional<Boolean> getUseEnterpriseContract() {
    return useEnterpriseContract;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductProperty && equalTo((AzureProductProperty) other);
  }

  private boolean equalTo(AzureProductProperty other) {
    return additionalCategories.equals(other.additionalCategories) && appVersion.equals(other.appVersion) && applicableProducts.equals(other.applicableProducts) && categories.equals(other.categories) && customAmendments.equals(other.customAmendments) && extendedProperties.equals(other.extendedProperties) && globalAmendmentTerms.equals(other.globalAmendmentTerms) && hideKeys.equals(other.hideKeys) && id.equals(other.id) && industries.equals(other.industries) && leveledCategories.equals(other.leveledCategories) && leveledIndustries.equals(other.leveledIndustries) && marketingOnlyChange.equals(other.marketingOnlyChange) && productTags.equals(other.productTags) && resourceType.equals(other.resourceType) && submissionVersion.equals(other.submissionVersion) && termsOfUse.equals(other.termsOfUse) && useEnterpriseContract.equals(other.useEnterpriseContract);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.additionalCategories, this.appVersion, this.applicableProducts, this.categories, this.customAmendments, this.extendedProperties, this.globalAmendmentTerms, this.hideKeys, this.id, this.industries, this.leveledCategories, this.leveledIndustries, this.marketingOnlyChange, this.productTags, this.resourceType, this.submissionVersion, this.termsOfUse, this.useEnterpriseContract);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductProperty{" + "additionalCategories: " + additionalCategories + ", appVersion: " + appVersion + ", applicableProducts: " + applicableProducts + ", categories: " + categories + ", customAmendments: " + customAmendments + ", extendedProperties: " + extendedProperties + ", globalAmendmentTerms: " + globalAmendmentTerms + ", hideKeys: " + hideKeys + ", id: " + id + ", industries: " + industries + ", leveledCategories: " + leveledCategories + ", leveledIndustries: " + leveledIndustries + ", marketingOnlyChange: " + marketingOnlyChange + ", productTags: " + productTags + ", resourceType: " + resourceType + ", submissionVersion: " + submissionVersion + ", termsOfUse: " + termsOfUse + ", useEnterpriseContract: " + useEnterpriseContract + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<String>> additionalCategories = Optional.empty();

    private Optional<String> appVersion = Optional.empty();

    private Optional<List<String>> applicableProducts = Optional.empty();

    private Optional<List<String>> categories = Optional.empty();

    private Optional<List<String>> customAmendments = Optional.empty();

    private Optional<List<String>> extendedProperties = Optional.empty();

    private Optional<String> globalAmendmentTerms = Optional.empty();

    private Optional<List<String>> hideKeys = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<List<String>> industries = Optional.empty();

    private Optional<Map<String, Object>> leveledCategories = Optional.empty();

    private Optional<Map<String, Object>> leveledIndustries = Optional.empty();

    private Optional<Boolean> marketingOnlyChange = Optional.empty();

    private Optional<List<String>> productTags = Optional.empty();

    private Optional<String> resourceType = Optional.empty();

    private Optional<String> submissionVersion = Optional.empty();

    private Optional<String> termsOfUse = Optional.empty();

    private Optional<Boolean> useEnterpriseContract = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductProperty other) {
      additionalCategories(other.getAdditionalCategories());
      appVersion(other.getAppVersion());
      applicableProducts(other.getApplicableProducts());
      categories(other.getCategories());
      customAmendments(other.getCustomAmendments());
      extendedProperties(other.getExtendedProperties());
      globalAmendmentTerms(other.getGlobalAmendmentTerms());
      hideKeys(other.getHideKeys());
      id(other.getId());
      industries(other.getIndustries());
      leveledCategories(other.getLeveledCategories());
      leveledIndustries(other.getLeveledIndustries());
      marketingOnlyChange(other.getMarketingOnlyChange());
      productTags(other.getProductTags());
      resourceType(other.getResourceType());
      submissionVersion(other.getSubmissionVersion());
      termsOfUse(other.getTermsOfUse());
      useEnterpriseContract(other.getUseEnterpriseContract());
      return this;
    }

    @JsonSetter(
        value = "additionalCategories",
        nulls = Nulls.SKIP
    )
    public Builder additionalCategories(Optional<List<String>> additionalCategories) {
      this.additionalCategories = additionalCategories;
      return this;
    }

    public Builder additionalCategories(List<String> additionalCategories) {
      this.additionalCategories = Optional.of(additionalCategories);
      return this;
    }

    @JsonSetter(
        value = "appVersion",
        nulls = Nulls.SKIP
    )
    public Builder appVersion(Optional<String> appVersion) {
      this.appVersion = appVersion;
      return this;
    }

    public Builder appVersion(String appVersion) {
      this.appVersion = Optional.of(appVersion);
      return this;
    }

    @JsonSetter(
        value = "applicableProducts",
        nulls = Nulls.SKIP
    )
    public Builder applicableProducts(Optional<List<String>> applicableProducts) {
      this.applicableProducts = applicableProducts;
      return this;
    }

    public Builder applicableProducts(List<String> applicableProducts) {
      this.applicableProducts = Optional.of(applicableProducts);
      return this;
    }

    @JsonSetter(
        value = "categories",
        nulls = Nulls.SKIP
    )
    public Builder categories(Optional<List<String>> categories) {
      this.categories = categories;
      return this;
    }

    public Builder categories(List<String> categories) {
      this.categories = Optional.of(categories);
      return this;
    }

    @JsonSetter(
        value = "customAmendments",
        nulls = Nulls.SKIP
    )
    public Builder customAmendments(Optional<List<String>> customAmendments) {
      this.customAmendments = customAmendments;
      return this;
    }

    public Builder customAmendments(List<String> customAmendments) {
      this.customAmendments = Optional.of(customAmendments);
      return this;
    }

    @JsonSetter(
        value = "extendedProperties",
        nulls = Nulls.SKIP
    )
    public Builder extendedProperties(Optional<List<String>> extendedProperties) {
      this.extendedProperties = extendedProperties;
      return this;
    }

    public Builder extendedProperties(List<String> extendedProperties) {
      this.extendedProperties = Optional.of(extendedProperties);
      return this;
    }

    @JsonSetter(
        value = "globalAmendmentTerms",
        nulls = Nulls.SKIP
    )
    public Builder globalAmendmentTerms(Optional<String> globalAmendmentTerms) {
      this.globalAmendmentTerms = globalAmendmentTerms;
      return this;
    }

    public Builder globalAmendmentTerms(String globalAmendmentTerms) {
      this.globalAmendmentTerms = Optional.of(globalAmendmentTerms);
      return this;
    }

    @JsonSetter(
        value = "hideKeys",
        nulls = Nulls.SKIP
    )
    public Builder hideKeys(Optional<List<String>> hideKeys) {
      this.hideKeys = hideKeys;
      return this;
    }

    public Builder hideKeys(List<String> hideKeys) {
      this.hideKeys = Optional.of(hideKeys);
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
        value = "industries",
        nulls = Nulls.SKIP
    )
    public Builder industries(Optional<List<String>> industries) {
      this.industries = industries;
      return this;
    }

    public Builder industries(List<String> industries) {
      this.industries = Optional.of(industries);
      return this;
    }

    @JsonSetter(
        value = "leveledCategories",
        nulls = Nulls.SKIP
    )
    public Builder leveledCategories(Optional<Map<String, Object>> leveledCategories) {
      this.leveledCategories = leveledCategories;
      return this;
    }

    public Builder leveledCategories(Map<String, Object> leveledCategories) {
      this.leveledCategories = Optional.of(leveledCategories);
      return this;
    }

    @JsonSetter(
        value = "leveledIndustries",
        nulls = Nulls.SKIP
    )
    public Builder leveledIndustries(Optional<Map<String, Object>> leveledIndustries) {
      this.leveledIndustries = leveledIndustries;
      return this;
    }

    public Builder leveledIndustries(Map<String, Object> leveledIndustries) {
      this.leveledIndustries = Optional.of(leveledIndustries);
      return this;
    }

    @JsonSetter(
        value = "marketingOnlyChange",
        nulls = Nulls.SKIP
    )
    public Builder marketingOnlyChange(Optional<Boolean> marketingOnlyChange) {
      this.marketingOnlyChange = marketingOnlyChange;
      return this;
    }

    public Builder marketingOnlyChange(Boolean marketingOnlyChange) {
      this.marketingOnlyChange = Optional.of(marketingOnlyChange);
      return this;
    }

    @JsonSetter(
        value = "productTags",
        nulls = Nulls.SKIP
    )
    public Builder productTags(Optional<List<String>> productTags) {
      this.productTags = productTags;
      return this;
    }

    public Builder productTags(List<String> productTags) {
      this.productTags = Optional.of(productTags);
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
        value = "submissionVersion",
        nulls = Nulls.SKIP
    )
    public Builder submissionVersion(Optional<String> submissionVersion) {
      this.submissionVersion = submissionVersion;
      return this;
    }

    public Builder submissionVersion(String submissionVersion) {
      this.submissionVersion = Optional.of(submissionVersion);
      return this;
    }

    @JsonSetter(
        value = "termsOfUse",
        nulls = Nulls.SKIP
    )
    public Builder termsOfUse(Optional<String> termsOfUse) {
      this.termsOfUse = termsOfUse;
      return this;
    }

    public Builder termsOfUse(String termsOfUse) {
      this.termsOfUse = Optional.of(termsOfUse);
      return this;
    }

    @JsonSetter(
        value = "useEnterpriseContract",
        nulls = Nulls.SKIP
    )
    public Builder useEnterpriseContract(Optional<Boolean> useEnterpriseContract) {
      this.useEnterpriseContract = useEnterpriseContract;
      return this;
    }

    public Builder useEnterpriseContract(Boolean useEnterpriseContract) {
      this.useEnterpriseContract = Optional.of(useEnterpriseContract);
      return this;
    }

    public AzureProductProperty build() {
      return new AzureProductProperty(additionalCategories, appVersion, applicableProducts, categories, customAmendments, extendedProperties, globalAmendmentTerms, hideKeys, id, industries, leveledCategories, leveledIndustries, marketingOnlyChange, productTags, resourceType, submissionVersion, termsOfUse, useEnterpriseContract);
    }
  }
}
