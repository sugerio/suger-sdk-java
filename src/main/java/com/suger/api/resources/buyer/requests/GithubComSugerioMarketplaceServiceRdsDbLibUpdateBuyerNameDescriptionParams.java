package com.suger.api.resources.buyer.requests;

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
    builder = GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams.Builder.class
)
public final class GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams {
  private final Optional<String> description;

  private final Optional<String> id;

  private final Optional<String> name;

  private final Optional<String> organizationId;

  private int _cachedHashCode;

  GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams(
      Optional<String> description, Optional<String> id, Optional<String> name,
      Optional<String> organizationId) {
    this.description = description;
    this.id = id;
    this.name = name;
    this.organizationId = organizationId;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams && equalTo((GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams) other);
  }

  private boolean equalTo(
      GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams other) {
    return description.equals(other.description) && id.equals(other.id) && name.equals(other.name) && organizationId.equals(other.organizationId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.description, this.id, this.name, this.organizationId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams{" + "description: " + description + ", id: " + id + ", name: " + name + ", organizationId: " + organizationId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> description = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Builder() {
    }

    public Builder from(
        GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams other) {
      description(other.getDescription());
      id(other.getId());
      name(other.getName());
      organizationId(other.getOrganizationId());
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
        value = "organizationID",
        nulls = Nulls.SKIP
    )
    public Builder organizationId(Optional<String> organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    public Builder organizationId(String organizationId) {
      this.organizationId = Optional.of(organizationId);
      return this;
    }

    public GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams build() {
      return new GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams(description, id, name, organizationId);
    }
  }
}
