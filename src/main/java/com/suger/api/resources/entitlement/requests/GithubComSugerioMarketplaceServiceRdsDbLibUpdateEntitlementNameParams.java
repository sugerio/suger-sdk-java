package com.suger.api.resources.entitlement.requests;

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
    builder = GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams.Builder.class
)
public final class GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams {
  private final Optional<String> id;

  private final Optional<String> name;

  private final Optional<String> organizationId;

  private int _cachedHashCode;

  GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams(Optional<String> id,
      Optional<String> name, Optional<String> organizationId) {
    this.id = id;
    this.name = name;
    this.organizationId = organizationId;
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
    return other instanceof GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams && equalTo((GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams) other);
  }

  private boolean equalTo(
      GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams other) {
    return id.equals(other.id) && name.equals(other.name) && organizationId.equals(other.organizationId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.name, this.organizationId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams{" + "id: " + id + ", name: " + name + ", organizationId: " + organizationId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Builder() {
    }

    public Builder from(
        GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams other) {
      id(other.getId());
      name(other.getName());
      organizationId(other.getOrganizationId());
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

    public GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams build() {
      return new GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams(id, name, organizationId);
    }
  }
}
