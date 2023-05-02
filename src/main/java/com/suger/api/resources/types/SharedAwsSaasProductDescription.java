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
    builder = SharedAwsSaasProductDescription.Builder.class
)
public final class SharedAwsSaasProductDescription {
  private final Optional<String> associatedProducts;

  private final Optional<List<String>> categories;

  private final Optional<Boolean> euW8Submitted;

  private final Optional<List<String>> highlights;

  private final Optional<String> longDescription;

  private final Optional<String> manufacturer;

  private final Optional<String> productCode;

  private final Optional<String> productTitle;

  private final Optional<Boolean> registered;

  private final Optional<List<String>> searchKeywords;

  private final Optional<String> shortDescription;

  private final Optional<String> sku;

  private final Optional<Boolean> usW9Submitted;

  private final Optional<String> visibility;

  private int _cachedHashCode;

  SharedAwsSaasProductDescription(Optional<String> associatedProducts,
      Optional<List<String>> categories, Optional<Boolean> euW8Submitted,
      Optional<List<String>> highlights, Optional<String> longDescription,
      Optional<String> manufacturer, Optional<String> productCode, Optional<String> productTitle,
      Optional<Boolean> registered, Optional<List<String>> searchKeywords,
      Optional<String> shortDescription, Optional<String> sku, Optional<Boolean> usW9Submitted,
      Optional<String> visibility) {
    this.associatedProducts = associatedProducts;
    this.categories = categories;
    this.euW8Submitted = euW8Submitted;
    this.highlights = highlights;
    this.longDescription = longDescription;
    this.manufacturer = manufacturer;
    this.productCode = productCode;
    this.productTitle = productTitle;
    this.registered = registered;
    this.searchKeywords = searchKeywords;
    this.shortDescription = shortDescription;
    this.sku = sku;
    this.usW9Submitted = usW9Submitted;
    this.visibility = visibility;
  }

  @JsonProperty("AssociatedProducts")
  public Optional<String> getAssociatedProducts() {
    return associatedProducts;
  }

  @JsonProperty("Categories")
  public Optional<List<String>> getCategories() {
    return categories;
  }

  @JsonProperty("EuW8Submitted")
  public Optional<Boolean> getEuW8Submitted() {
    return euW8Submitted;
  }

  @JsonProperty("Highlights")
  public Optional<List<String>> getHighlights() {
    return highlights;
  }

  @JsonProperty("LongDescription")
  public Optional<String> getLongDescription() {
    return longDescription;
  }

  @JsonProperty("Manufacturer")
  public Optional<String> getManufacturer() {
    return manufacturer;
  }

  @JsonProperty("ProductCode")
  public Optional<String> getProductCode() {
    return productCode;
  }

  @JsonProperty("ProductTitle")
  public Optional<String> getProductTitle() {
    return productTitle;
  }

  @JsonProperty("Registered")
  public Optional<Boolean> getRegistered() {
    return registered;
  }

  @JsonProperty("SearchKeywords")
  public Optional<List<String>> getSearchKeywords() {
    return searchKeywords;
  }

  @JsonProperty("ShortDescription")
  public Optional<String> getShortDescription() {
    return shortDescription;
  }

  @JsonProperty("Sku")
  public Optional<String> getSku() {
    return sku;
  }

  @JsonProperty("UsW9Submitted")
  public Optional<Boolean> getUsW9Submitted() {
    return usW9Submitted;
  }

  @JsonProperty("Visibility")
  public Optional<String> getVisibility() {
    return visibility;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsSaasProductDescription && equalTo((SharedAwsSaasProductDescription) other);
  }

  private boolean equalTo(SharedAwsSaasProductDescription other) {
    return associatedProducts.equals(other.associatedProducts) && categories.equals(other.categories) && euW8Submitted.equals(other.euW8Submitted) && highlights.equals(other.highlights) && longDescription.equals(other.longDescription) && manufacturer.equals(other.manufacturer) && productCode.equals(other.productCode) && productTitle.equals(other.productTitle) && registered.equals(other.registered) && searchKeywords.equals(other.searchKeywords) && shortDescription.equals(other.shortDescription) && sku.equals(other.sku) && usW9Submitted.equals(other.usW9Submitted) && visibility.equals(other.visibility);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.associatedProducts, this.categories, this.euW8Submitted, this.highlights, this.longDescription, this.manufacturer, this.productCode, this.productTitle, this.registered, this.searchKeywords, this.shortDescription, this.sku, this.usW9Submitted, this.visibility);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsSaasProductDescription{" + "associatedProducts: " + associatedProducts + ", categories: " + categories + ", euW8Submitted: " + euW8Submitted + ", highlights: " + highlights + ", longDescription: " + longDescription + ", manufacturer: " + manufacturer + ", productCode: " + productCode + ", productTitle: " + productTitle + ", registered: " + registered + ", searchKeywords: " + searchKeywords + ", shortDescription: " + shortDescription + ", sku: " + sku + ", usW9Submitted: " + usW9Submitted + ", visibility: " + visibility + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> associatedProducts = Optional.empty();

    private Optional<List<String>> categories = Optional.empty();

    private Optional<Boolean> euW8Submitted = Optional.empty();

    private Optional<List<String>> highlights = Optional.empty();

    private Optional<String> longDescription = Optional.empty();

    private Optional<String> manufacturer = Optional.empty();

    private Optional<String> productCode = Optional.empty();

    private Optional<String> productTitle = Optional.empty();

    private Optional<Boolean> registered = Optional.empty();

    private Optional<List<String>> searchKeywords = Optional.empty();

    private Optional<String> shortDescription = Optional.empty();

    private Optional<String> sku = Optional.empty();

    private Optional<Boolean> usW9Submitted = Optional.empty();

    private Optional<String> visibility = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsSaasProductDescription other) {
      associatedProducts(other.getAssociatedProducts());
      categories(other.getCategories());
      euW8Submitted(other.getEuW8Submitted());
      highlights(other.getHighlights());
      longDescription(other.getLongDescription());
      manufacturer(other.getManufacturer());
      productCode(other.getProductCode());
      productTitle(other.getProductTitle());
      registered(other.getRegistered());
      searchKeywords(other.getSearchKeywords());
      shortDescription(other.getShortDescription());
      sku(other.getSku());
      usW9Submitted(other.getUsW9Submitted());
      visibility(other.getVisibility());
      return this;
    }

    @JsonSetter(
        value = "AssociatedProducts",
        nulls = Nulls.SKIP
    )
    public Builder associatedProducts(Optional<String> associatedProducts) {
      this.associatedProducts = associatedProducts;
      return this;
    }

    public Builder associatedProducts(String associatedProducts) {
      this.associatedProducts = Optional.of(associatedProducts);
      return this;
    }

    @JsonSetter(
        value = "Categories",
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
        value = "EuW8Submitted",
        nulls = Nulls.SKIP
    )
    public Builder euW8Submitted(Optional<Boolean> euW8Submitted) {
      this.euW8Submitted = euW8Submitted;
      return this;
    }

    public Builder euW8Submitted(Boolean euW8Submitted) {
      this.euW8Submitted = Optional.of(euW8Submitted);
      return this;
    }

    @JsonSetter(
        value = "Highlights",
        nulls = Nulls.SKIP
    )
    public Builder highlights(Optional<List<String>> highlights) {
      this.highlights = highlights;
      return this;
    }

    public Builder highlights(List<String> highlights) {
      this.highlights = Optional.of(highlights);
      return this;
    }

    @JsonSetter(
        value = "LongDescription",
        nulls = Nulls.SKIP
    )
    public Builder longDescription(Optional<String> longDescription) {
      this.longDescription = longDescription;
      return this;
    }

    public Builder longDescription(String longDescription) {
      this.longDescription = Optional.of(longDescription);
      return this;
    }

    @JsonSetter(
        value = "Manufacturer",
        nulls = Nulls.SKIP
    )
    public Builder manufacturer(Optional<String> manufacturer) {
      this.manufacturer = manufacturer;
      return this;
    }

    public Builder manufacturer(String manufacturer) {
      this.manufacturer = Optional.of(manufacturer);
      return this;
    }

    @JsonSetter(
        value = "ProductCode",
        nulls = Nulls.SKIP
    )
    public Builder productCode(Optional<String> productCode) {
      this.productCode = productCode;
      return this;
    }

    public Builder productCode(String productCode) {
      this.productCode = Optional.of(productCode);
      return this;
    }

    @JsonSetter(
        value = "ProductTitle",
        nulls = Nulls.SKIP
    )
    public Builder productTitle(Optional<String> productTitle) {
      this.productTitle = productTitle;
      return this;
    }

    public Builder productTitle(String productTitle) {
      this.productTitle = Optional.of(productTitle);
      return this;
    }

    @JsonSetter(
        value = "Registered",
        nulls = Nulls.SKIP
    )
    public Builder registered(Optional<Boolean> registered) {
      this.registered = registered;
      return this;
    }

    public Builder registered(Boolean registered) {
      this.registered = Optional.of(registered);
      return this;
    }

    @JsonSetter(
        value = "SearchKeywords",
        nulls = Nulls.SKIP
    )
    public Builder searchKeywords(Optional<List<String>> searchKeywords) {
      this.searchKeywords = searchKeywords;
      return this;
    }

    public Builder searchKeywords(List<String> searchKeywords) {
      this.searchKeywords = Optional.of(searchKeywords);
      return this;
    }

    @JsonSetter(
        value = "ShortDescription",
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
        value = "Sku",
        nulls = Nulls.SKIP
    )
    public Builder sku(Optional<String> sku) {
      this.sku = sku;
      return this;
    }

    public Builder sku(String sku) {
      this.sku = Optional.of(sku);
      return this;
    }

    @JsonSetter(
        value = "UsW9Submitted",
        nulls = Nulls.SKIP
    )
    public Builder usW9Submitted(Optional<Boolean> usW9Submitted) {
      this.usW9Submitted = usW9Submitted;
      return this;
    }

    public Builder usW9Submitted(Boolean usW9Submitted) {
      this.usW9Submitted = Optional.of(usW9Submitted);
      return this;
    }

    @JsonSetter(
        value = "Visibility",
        nulls = Nulls.SKIP
    )
    public Builder visibility(Optional<String> visibility) {
      this.visibility = visibility;
      return this;
    }

    public Builder visibility(String visibility) {
      this.visibility = Optional.of(visibility);
      return this;
    }

    public SharedAwsSaasProductDescription build() {
      return new SharedAwsSaasProductDescription(associatedProducts, categories, euW8Submitted, highlights, longDescription, manufacturer, productCode, productTitle, registered, searchKeywords, shortDescription, sku, usW9Submitted, visibility);
    }
  }
}
