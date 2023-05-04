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
    builder = SharedAwsSaasProduct.Builder.class
)
public final class SharedAwsSaasProduct {
  private final Optional<SharedAwsSaasProductDescription> description;

  private final Optional<List<SharedAwsSaasProductDimension>> dimensions;

  private final Optional<SharedAwsSaasProductPromotionalResources> promotionalResources;

  private final Optional<SharedAwsSaasProductSupportInformation> supportInformation;

  private final Optional<List<SharedAwsSaasProductVersion>> versions;

  private final Optional<String> dataFeedProductId;

  private final Optional<String> productId;

  private int _cachedHashCode;

  SharedAwsSaasProduct(Optional<SharedAwsSaasProductDescription> description,
      Optional<List<SharedAwsSaasProductDimension>> dimensions,
      Optional<SharedAwsSaasProductPromotionalResources> promotionalResources,
      Optional<SharedAwsSaasProductSupportInformation> supportInformation,
      Optional<List<SharedAwsSaasProductVersion>> versions, Optional<String> dataFeedProductId,
      Optional<String> productId) {
    this.description = description;
    this.dimensions = dimensions;
    this.promotionalResources = promotionalResources;
    this.supportInformation = supportInformation;
    this.versions = versions;
    this.dataFeedProductId = dataFeedProductId;
    this.productId = productId;
  }

  @JsonProperty("Description")
  public Optional<SharedAwsSaasProductDescription> getDescription() {
    return description;
  }

  @JsonProperty("Dimensions")
  public Optional<List<SharedAwsSaasProductDimension>> getDimensions() {
    return dimensions;
  }

  @JsonProperty("PromotionalResources")
  public Optional<SharedAwsSaasProductPromotionalResources> getPromotionalResources() {
    return promotionalResources;
  }

  @JsonProperty("SupportInformation")
  public Optional<SharedAwsSaasProductSupportInformation> getSupportInformation() {
    return supportInformation;
  }

  @JsonProperty("Versions")
  public Optional<List<SharedAwsSaasProductVersion>> getVersions() {
    return versions;
  }

  /**
   * @return The product Id in AWS Marketplace Data Feed Service.
   */
  @JsonProperty("dataFeedProductId")
  public Optional<String> getDataFeedProductId() {
    return dataFeedProductId;
  }

  @JsonProperty("productId")
  public Optional<String> getProductId() {
    return productId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsSaasProduct && equalTo((SharedAwsSaasProduct) other);
  }

  private boolean equalTo(SharedAwsSaasProduct other) {
    return description.equals(other.description) && dimensions.equals(other.dimensions) && promotionalResources.equals(other.promotionalResources) && supportInformation.equals(other.supportInformation) && versions.equals(other.versions) && dataFeedProductId.equals(other.dataFeedProductId) && productId.equals(other.productId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.description, this.dimensions, this.promotionalResources, this.supportInformation, this.versions, this.dataFeedProductId, this.productId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsSaasProduct{" + "description: " + description + ", dimensions: " + dimensions + ", promotionalResources: " + promotionalResources + ", supportInformation: " + supportInformation + ", versions: " + versions + ", dataFeedProductId: " + dataFeedProductId + ", productId: " + productId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SharedAwsSaasProductDescription> description = Optional.empty();

    private Optional<List<SharedAwsSaasProductDimension>> dimensions = Optional.empty();

    private Optional<SharedAwsSaasProductPromotionalResources> promotionalResources = Optional.empty();

    private Optional<SharedAwsSaasProductSupportInformation> supportInformation = Optional.empty();

    private Optional<List<SharedAwsSaasProductVersion>> versions = Optional.empty();

    private Optional<String> dataFeedProductId = Optional.empty();

    private Optional<String> productId = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsSaasProduct other) {
      description(other.getDescription());
      dimensions(other.getDimensions());
      promotionalResources(other.getPromotionalResources());
      supportInformation(other.getSupportInformation());
      versions(other.getVersions());
      dataFeedProductId(other.getDataFeedProductId());
      productId(other.getProductId());
      return this;
    }

    @JsonSetter(
        value = "Description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<SharedAwsSaasProductDescription> description) {
      this.description = description;
      return this;
    }

    public Builder description(SharedAwsSaasProductDescription description) {
      this.description = Optional.of(description);
      return this;
    }

    @JsonSetter(
        value = "Dimensions",
        nulls = Nulls.SKIP
    )
    public Builder dimensions(Optional<List<SharedAwsSaasProductDimension>> dimensions) {
      this.dimensions = dimensions;
      return this;
    }

    public Builder dimensions(List<SharedAwsSaasProductDimension> dimensions) {
      this.dimensions = Optional.of(dimensions);
      return this;
    }

    @JsonSetter(
        value = "PromotionalResources",
        nulls = Nulls.SKIP
    )
    public Builder promotionalResources(
        Optional<SharedAwsSaasProductPromotionalResources> promotionalResources) {
      this.promotionalResources = promotionalResources;
      return this;
    }

    public Builder promotionalResources(
        SharedAwsSaasProductPromotionalResources promotionalResources) {
      this.promotionalResources = Optional.of(promotionalResources);
      return this;
    }

    @JsonSetter(
        value = "SupportInformation",
        nulls = Nulls.SKIP
    )
    public Builder supportInformation(
        Optional<SharedAwsSaasProductSupportInformation> supportInformation) {
      this.supportInformation = supportInformation;
      return this;
    }

    public Builder supportInformation(SharedAwsSaasProductSupportInformation supportInformation) {
      this.supportInformation = Optional.of(supportInformation);
      return this;
    }

    @JsonSetter(
        value = "Versions",
        nulls = Nulls.SKIP
    )
    public Builder versions(Optional<List<SharedAwsSaasProductVersion>> versions) {
      this.versions = versions;
      return this;
    }

    public Builder versions(List<SharedAwsSaasProductVersion> versions) {
      this.versions = Optional.of(versions);
      return this;
    }

    @JsonSetter(
        value = "dataFeedProductId",
        nulls = Nulls.SKIP
    )
    public Builder dataFeedProductId(Optional<String> dataFeedProductId) {
      this.dataFeedProductId = dataFeedProductId;
      return this;
    }

    public Builder dataFeedProductId(String dataFeedProductId) {
      this.dataFeedProductId = Optional.of(dataFeedProductId);
      return this;
    }

    @JsonSetter(
        value = "productId",
        nulls = Nulls.SKIP
    )
    public Builder productId(Optional<String> productId) {
      this.productId = productId;
      return this;
    }

    public Builder productId(String productId) {
      this.productId = Optional.of(productId);
      return this;
    }

    public SharedAwsSaasProduct build() {
      return new SharedAwsSaasProduct(description, dimensions, promotionalResources, supportInformation, versions, dataFeedProductId, productId);
    }
  }
}
