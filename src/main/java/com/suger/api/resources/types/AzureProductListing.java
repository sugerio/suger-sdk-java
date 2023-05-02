package com.suger.api.resources.types;

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
    builder = AzureProductListing.Builder.class
)
public final class AzureProductListing {
  private final Optional<String> accessInformation;

  private final Optional<List<AzureProductListingAsset>> assets;

  private final Optional<List<String>> compatibleProducts;

  private final Optional<String> description;

  private final Optional<String> gettingStartedInstructions;

  private final Optional<String> id;

  private final Optional<List<String>> keywords;

  private final Optional<String> languageCode;

  private final Optional<List<AzureListingContact>> listingContacts;

  private final Optional<List<AzureListingUri>> listingUris;

  private final Optional<String> productDisplayName;

  private final Optional<String> publisherName;

  private final Optional<AzureProductListingResourceType> resourceType;

  private final Optional<String> shortDescription;

  private final Optional<String> summary;

  private final Optional<String> title;

  private int _cachedHashCode;

  AzureProductListing(Optional<String> accessInformation,
      Optional<List<AzureProductListingAsset>> assets, Optional<List<String>> compatibleProducts,
      Optional<String> description, Optional<String> gettingStartedInstructions,
      Optional<String> id, Optional<List<String>> keywords, Optional<String> languageCode,
      Optional<List<AzureListingContact>> listingContacts,
      Optional<List<AzureListingUri>> listingUris, Optional<String> productDisplayName,
      Optional<String> publisherName, Optional<AzureProductListingResourceType> resourceType,
      Optional<String> shortDescription, Optional<String> summary, Optional<String> title) {
    this.accessInformation = accessInformation;
    this.assets = assets;
    this.compatibleProducts = compatibleProducts;
    this.description = description;
    this.gettingStartedInstructions = gettingStartedInstructions;
    this.id = id;
    this.keywords = keywords;
    this.languageCode = languageCode;
    this.listingContacts = listingContacts;
    this.listingUris = listingUris;
    this.productDisplayName = productDisplayName;
    this.publisherName = publisherName;
    this.resourceType = resourceType;
    this.shortDescription = shortDescription;
    this.summary = summary;
    this.title = title;
  }

  @JsonProperty("accessInformation")
  public Optional<String> getAccessInformation() {
    return accessInformation;
  }

  /**
   * @return Not original fields. They are populated by other API calls
   */
  @JsonProperty("assets")
  public Optional<List<AzureProductListingAsset>> getAssets() {
    return assets;
  }

  @JsonProperty("compatibleProducts")
  public Optional<List<String>> getCompatibleProducts() {
    return compatibleProducts;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("gettingStartedInstructions")
  public Optional<String> getGettingStartedInstructions() {
    return gettingStartedInstructions;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("keywords")
  public Optional<List<String>> getKeywords() {
    return keywords;
  }

  @JsonProperty("languageCode")
  public Optional<String> getLanguageCode() {
    return languageCode;
  }

  @JsonProperty("listingContacts")
  public Optional<List<AzureListingContact>> getListingContacts() {
    return listingContacts;
  }

  @JsonProperty("listingUris")
  public Optional<List<AzureListingUri>> getListingUris() {
    return listingUris;
  }

  @JsonProperty("productDisplayName")
  public Optional<String> getProductDisplayName() {
    return productDisplayName;
  }

  @JsonProperty("publisherName")
  public Optional<String> getPublisherName() {
    return publisherName;
  }

  @JsonProperty("resourceType")
  public Optional<AzureProductListingResourceType> getResourceType() {
    return resourceType;
  }

  @JsonProperty("shortDescription")
  public Optional<String> getShortDescription() {
    return shortDescription;
  }

  @JsonProperty("summary")
  public Optional<String> getSummary() {
    return summary;
  }

  @JsonProperty("title")
  public Optional<String> getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductListing && equalTo((AzureProductListing) other);
  }

  private boolean equalTo(AzureProductListing other) {
    return accessInformation.equals(other.accessInformation) && assets.equals(other.assets) && compatibleProducts.equals(other.compatibleProducts) && description.equals(other.description) && gettingStartedInstructions.equals(other.gettingStartedInstructions) && id.equals(other.id) && keywords.equals(other.keywords) && languageCode.equals(other.languageCode) && listingContacts.equals(other.listingContacts) && listingUris.equals(other.listingUris) && productDisplayName.equals(other.productDisplayName) && publisherName.equals(other.publisherName) && resourceType.equals(other.resourceType) && shortDescription.equals(other.shortDescription) && summary.equals(other.summary) && title.equals(other.title);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accessInformation, this.assets, this.compatibleProducts, this.description, this.gettingStartedInstructions, this.id, this.keywords, this.languageCode, this.listingContacts, this.listingUris, this.productDisplayName, this.publisherName, this.resourceType, this.shortDescription, this.summary, this.title);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductListing{" + "accessInformation: " + accessInformation + ", assets: " + assets + ", compatibleProducts: " + compatibleProducts + ", description: " + description + ", gettingStartedInstructions: " + gettingStartedInstructions + ", id: " + id + ", keywords: " + keywords + ", languageCode: " + languageCode + ", listingContacts: " + listingContacts + ", listingUris: " + listingUris + ", productDisplayName: " + productDisplayName + ", publisherName: " + publisherName + ", resourceType: " + resourceType + ", shortDescription: " + shortDescription + ", summary: " + summary + ", title: " + title + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> accessInformation = Optional.empty();

    private Optional<List<AzureProductListingAsset>> assets = Optional.empty();

    private Optional<List<String>> compatibleProducts = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<String> gettingStartedInstructions = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<List<String>> keywords = Optional.empty();

    private Optional<String> languageCode = Optional.empty();

    private Optional<List<AzureListingContact>> listingContacts = Optional.empty();

    private Optional<List<AzureListingUri>> listingUris = Optional.empty();

    private Optional<String> productDisplayName = Optional.empty();

    private Optional<String> publisherName = Optional.empty();

    private Optional<AzureProductListingResourceType> resourceType = Optional.empty();

    private Optional<String> shortDescription = Optional.empty();

    private Optional<String> summary = Optional.empty();

    private Optional<String> title = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductListing other) {
      accessInformation(other.getAccessInformation());
      assets(other.getAssets());
      compatibleProducts(other.getCompatibleProducts());
      description(other.getDescription());
      gettingStartedInstructions(other.getGettingStartedInstructions());
      id(other.getId());
      keywords(other.getKeywords());
      languageCode(other.getLanguageCode());
      listingContacts(other.getListingContacts());
      listingUris(other.getListingUris());
      productDisplayName(other.getProductDisplayName());
      publisherName(other.getPublisherName());
      resourceType(other.getResourceType());
      shortDescription(other.getShortDescription());
      summary(other.getSummary());
      title(other.getTitle());
      return this;
    }

    @JsonSetter(
        value = "accessInformation",
        nulls = Nulls.SKIP
    )
    public Builder accessInformation(Optional<String> accessInformation) {
      this.accessInformation = accessInformation;
      return this;
    }

    public Builder accessInformation(String accessInformation) {
      this.accessInformation = Optional.of(accessInformation);
      return this;
    }

    @JsonSetter(
        value = "assets",
        nulls = Nulls.SKIP
    )
    public Builder assets(Optional<List<AzureProductListingAsset>> assets) {
      this.assets = assets;
      return this;
    }

    public Builder assets(List<AzureProductListingAsset> assets) {
      this.assets = Optional.of(assets);
      return this;
    }

    @JsonSetter(
        value = "compatibleProducts",
        nulls = Nulls.SKIP
    )
    public Builder compatibleProducts(Optional<List<String>> compatibleProducts) {
      this.compatibleProducts = compatibleProducts;
      return this;
    }

    public Builder compatibleProducts(List<String> compatibleProducts) {
      this.compatibleProducts = Optional.of(compatibleProducts);
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
        value = "gettingStartedInstructions",
        nulls = Nulls.SKIP
    )
    public Builder gettingStartedInstructions(Optional<String> gettingStartedInstructions) {
      this.gettingStartedInstructions = gettingStartedInstructions;
      return this;
    }

    public Builder gettingStartedInstructions(String gettingStartedInstructions) {
      this.gettingStartedInstructions = Optional.of(gettingStartedInstructions);
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
        value = "keywords",
        nulls = Nulls.SKIP
    )
    public Builder keywords(Optional<List<String>> keywords) {
      this.keywords = keywords;
      return this;
    }

    public Builder keywords(List<String> keywords) {
      this.keywords = Optional.of(keywords);
      return this;
    }

    @JsonSetter(
        value = "languageCode",
        nulls = Nulls.SKIP
    )
    public Builder languageCode(Optional<String> languageCode) {
      this.languageCode = languageCode;
      return this;
    }

    public Builder languageCode(String languageCode) {
      this.languageCode = Optional.of(languageCode);
      return this;
    }

    @JsonSetter(
        value = "listingContacts",
        nulls = Nulls.SKIP
    )
    public Builder listingContacts(Optional<List<AzureListingContact>> listingContacts) {
      this.listingContacts = listingContacts;
      return this;
    }

    public Builder listingContacts(List<AzureListingContact> listingContacts) {
      this.listingContacts = Optional.of(listingContacts);
      return this;
    }

    @JsonSetter(
        value = "listingUris",
        nulls = Nulls.SKIP
    )
    public Builder listingUris(Optional<List<AzureListingUri>> listingUris) {
      this.listingUris = listingUris;
      return this;
    }

    public Builder listingUris(List<AzureListingUri> listingUris) {
      this.listingUris = Optional.of(listingUris);
      return this;
    }

    @JsonSetter(
        value = "productDisplayName",
        nulls = Nulls.SKIP
    )
    public Builder productDisplayName(Optional<String> productDisplayName) {
      this.productDisplayName = productDisplayName;
      return this;
    }

    public Builder productDisplayName(String productDisplayName) {
      this.productDisplayName = Optional.of(productDisplayName);
      return this;
    }

    @JsonSetter(
        value = "publisherName",
        nulls = Nulls.SKIP
    )
    public Builder publisherName(Optional<String> publisherName) {
      this.publisherName = publisherName;
      return this;
    }

    public Builder publisherName(String publisherName) {
      this.publisherName = Optional.of(publisherName);
      return this;
    }

    @JsonSetter(
        value = "resourceType",
        nulls = Nulls.SKIP
    )
    public Builder resourceType(Optional<AzureProductListingResourceType> resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    public Builder resourceType(AzureProductListingResourceType resourceType) {
      this.resourceType = Optional.of(resourceType);
      return this;
    }

    @JsonSetter(
        value = "shortDescription",
        nulls = Nulls.SKIP
    )
    public Builder shortDescription(Optional<String> shortDescription) {
      this.shortDescription = shortDescription;
      return this;
    }

    public Builder shortDescription(String shortDescription) {
      this.shortDescription = Optional.of(shortDescription);
      return this;
    }

    @JsonSetter(
        value = "summary",
        nulls = Nulls.SKIP
    )
    public Builder summary(Optional<String> summary) {
      this.summary = summary;
      return this;
    }

    public Builder summary(String summary) {
      this.summary = Optional.of(summary);
      return this;
    }

    @JsonSetter(
        value = "title",
        nulls = Nulls.SKIP
    )
    public Builder title(Optional<String> title) {
      this.title = title;
      return this;
    }

    public Builder title(String title) {
      this.title = Optional.of(title);
      return this;
    }

    public AzureProductListing build() {
      return new AzureProductListing(accessInformation, assets, compatibleProducts, description, gettingStartedInstructions, id, keywords, languageCode, listingContacts, listingUris, productDisplayName, publisherName, resourceType, shortDescription, summary, title);
    }
  }
}
