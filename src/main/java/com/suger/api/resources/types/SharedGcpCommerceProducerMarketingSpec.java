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
    builder = SharedGcpCommerceProducerMarketingSpec.Builder.class
)
public final class SharedGcpCommerceProducerMarketingSpec {
  private final Optional<String> description;

  private final Optional<List<String>> displayNames;

  private final Optional<String> eulaUrl;

  private final Optional<String> externalMarketingUrl;

  private final Optional<String> icon;

  private final Optional<List<String>> searchCategories;

  private final Optional<String> searchDescription;

  private final Optional<List<String>> searchKeywords;

  private final Optional<String> shortTitle;

  private final Optional<SharedGcpCommerceProducerSupportSpec> supportSpec;

  private final Optional<String> title;

  private int _cachedHashCode;

  SharedGcpCommerceProducerMarketingSpec(Optional<String> description,
      Optional<List<String>> displayNames, Optional<String> eulaUrl,
      Optional<String> externalMarketingUrl, Optional<String> icon,
      Optional<List<String>> searchCategories, Optional<String> searchDescription,
      Optional<List<String>> searchKeywords, Optional<String> shortTitle,
      Optional<SharedGcpCommerceProducerSupportSpec> supportSpec, Optional<String> title) {
    this.description = description;
    this.displayNames = displayNames;
    this.eulaUrl = eulaUrl;
    this.externalMarketingUrl = externalMarketingUrl;
    this.icon = icon;
    this.searchCategories = searchCategories;
    this.searchDescription = searchDescription;
    this.searchKeywords = searchKeywords;
    this.shortTitle = shortTitle;
    this.supportSpec = supportSpec;
    this.title = title;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  /**
   * @return In format of &quot;{provider-id}/{product-name}&quot;
   */
  @JsonProperty("displayNames")
  public Optional<List<String>> getDisplayNames() {
    return displayNames;
  }

  @JsonProperty("eulaUrl")
  public Optional<String> getEulaUrl() {
    return eulaUrl;
  }

  @JsonProperty("externalMarketingUrl")
  public Optional<String> getExternalMarketingUrl() {
    return externalMarketingUrl;
  }

  /**
   * @return In format of &quot;base64://...&quot;
   */
  @JsonProperty("icon")
  public Optional<String> getIcon() {
    return icon;
  }

  @JsonProperty("searchCategories")
  public Optional<List<String>> getSearchCategories() {
    return searchCategories;
  }

  @JsonProperty("searchDescription")
  public Optional<String> getSearchDescription() {
    return searchDescription;
  }

  @JsonProperty("searchKeywords")
  public Optional<List<String>> getSearchKeywords() {
    return searchKeywords;
  }

  @JsonProperty("shortTitle")
  public Optional<String> getShortTitle() {
    return shortTitle;
  }

  @JsonProperty("supportSpec")
  public Optional<SharedGcpCommerceProducerSupportSpec> getSupportSpec() {
    return supportSpec;
  }

  /**
   * @return The product title.
   */
  @JsonProperty("title")
  public Optional<String> getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerMarketingSpec && equalTo((SharedGcpCommerceProducerMarketingSpec) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerMarketingSpec other) {
    return description.equals(other.description) && displayNames.equals(other.displayNames) && eulaUrl.equals(other.eulaUrl) && externalMarketingUrl.equals(other.externalMarketingUrl) && icon.equals(other.icon) && searchCategories.equals(other.searchCategories) && searchDescription.equals(other.searchDescription) && searchKeywords.equals(other.searchKeywords) && shortTitle.equals(other.shortTitle) && supportSpec.equals(other.supportSpec) && title.equals(other.title);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.description, this.displayNames, this.eulaUrl, this.externalMarketingUrl, this.icon, this.searchCategories, this.searchDescription, this.searchKeywords, this.shortTitle, this.supportSpec, this.title);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerMarketingSpec{" + "description: " + description + ", displayNames: " + displayNames + ", eulaUrl: " + eulaUrl + ", externalMarketingUrl: " + externalMarketingUrl + ", icon: " + icon + ", searchCategories: " + searchCategories + ", searchDescription: " + searchDescription + ", searchKeywords: " + searchKeywords + ", shortTitle: " + shortTitle + ", supportSpec: " + supportSpec + ", title: " + title + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> description = Optional.empty();

    private Optional<List<String>> displayNames = Optional.empty();

    private Optional<String> eulaUrl = Optional.empty();

    private Optional<String> externalMarketingUrl = Optional.empty();

    private Optional<String> icon = Optional.empty();

    private Optional<List<String>> searchCategories = Optional.empty();

    private Optional<String> searchDescription = Optional.empty();

    private Optional<List<String>> searchKeywords = Optional.empty();

    private Optional<String> shortTitle = Optional.empty();

    private Optional<SharedGcpCommerceProducerSupportSpec> supportSpec = Optional.empty();

    private Optional<String> title = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerMarketingSpec other) {
      description(other.getDescription());
      displayNames(other.getDisplayNames());
      eulaUrl(other.getEulaUrl());
      externalMarketingUrl(other.getExternalMarketingUrl());
      icon(other.getIcon());
      searchCategories(other.getSearchCategories());
      searchDescription(other.getSearchDescription());
      searchKeywords(other.getSearchKeywords());
      shortTitle(other.getShortTitle());
      supportSpec(other.getSupportSpec());
      title(other.getTitle());
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
        value = "displayNames",
        nulls = Nulls.SKIP
    )
    public Builder displayNames(Optional<List<String>> displayNames) {
      this.displayNames = displayNames;
      return this;
    }

    public Builder displayNames(List<String> displayNames) {
      this.displayNames = Optional.of(displayNames);
      return this;
    }

    @JsonSetter(
        value = "eulaUrl",
        nulls = Nulls.SKIP
    )
    public Builder eulaUrl(Optional<String> eulaUrl) {
      this.eulaUrl = eulaUrl;
      return this;
    }

    public Builder eulaUrl(String eulaUrl) {
      this.eulaUrl = Optional.of(eulaUrl);
      return this;
    }

    @JsonSetter(
        value = "externalMarketingUrl",
        nulls = Nulls.SKIP
    )
    public Builder externalMarketingUrl(Optional<String> externalMarketingUrl) {
      this.externalMarketingUrl = externalMarketingUrl;
      return this;
    }

    public Builder externalMarketingUrl(String externalMarketingUrl) {
      this.externalMarketingUrl = Optional.of(externalMarketingUrl);
      return this;
    }

    @JsonSetter(
        value = "icon",
        nulls = Nulls.SKIP
    )
    public Builder icon(Optional<String> icon) {
      this.icon = icon;
      return this;
    }

    public Builder icon(String icon) {
      this.icon = Optional.of(icon);
      return this;
    }

    @JsonSetter(
        value = "searchCategories",
        nulls = Nulls.SKIP
    )
    public Builder searchCategories(Optional<List<String>> searchCategories) {
      this.searchCategories = searchCategories;
      return this;
    }

    public Builder searchCategories(List<String> searchCategories) {
      this.searchCategories = Optional.of(searchCategories);
      return this;
    }

    @JsonSetter(
        value = "searchDescription",
        nulls = Nulls.SKIP
    )
    public Builder searchDescription(Optional<String> searchDescription) {
      this.searchDescription = searchDescription;
      return this;
    }

    public Builder searchDescription(String searchDescription) {
      this.searchDescription = Optional.of(searchDescription);
      return this;
    }

    @JsonSetter(
        value = "searchKeywords",
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
        value = "shortTitle",
        nulls = Nulls.SKIP
    )
    public Builder shortTitle(Optional<String> shortTitle) {
      this.shortTitle = shortTitle;
      return this;
    }

    public Builder shortTitle(String shortTitle) {
      this.shortTitle = Optional.of(shortTitle);
      return this;
    }

    @JsonSetter(
        value = "supportSpec",
        nulls = Nulls.SKIP
    )
    public Builder supportSpec(Optional<SharedGcpCommerceProducerSupportSpec> supportSpec) {
      this.supportSpec = supportSpec;
      return this;
    }

    public Builder supportSpec(SharedGcpCommerceProducerSupportSpec supportSpec) {
      this.supportSpec = Optional.of(supportSpec);
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

    public SharedGcpCommerceProducerMarketingSpec build() {
      return new SharedGcpCommerceProducerMarketingSpec(description, displayNames, eulaUrl, externalMarketingUrl, icon, searchCategories, searchDescription, searchKeywords, shortTitle, supportSpec, title);
    }
  }
}
