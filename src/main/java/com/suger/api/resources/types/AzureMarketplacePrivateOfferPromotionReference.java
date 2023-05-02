package com.suger.api.resources.types;

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
    builder = AzureMarketplacePrivateOfferPromotionReference.Builder.class
)
public final class AzureMarketplacePrivateOfferPromotionReference {
  private final Optional<String> id;

  private final Optional<String> name;

  private int _cachedHashCode;

  AzureMarketplacePrivateOfferPromotionReference(Optional<String> id, Optional<String> name) {
    this.id = id;
    this.name = name;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureMarketplacePrivateOfferPromotionReference && equalTo((AzureMarketplacePrivateOfferPromotionReference) other);
  }

  private boolean equalTo(AzureMarketplacePrivateOfferPromotionReference other) {
    return id.equals(other.id) && name.equals(other.name);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.name);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureMarketplacePrivateOfferPromotionReference{" + "id: " + id + ", name: " + name + "}";
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

    private Builder() {
    }

    public Builder from(AzureMarketplacePrivateOfferPromotionReference other) {
      id(other.getId());
      name(other.getName());
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

    public AzureMarketplacePrivateOfferPromotionReference build() {
      return new AzureMarketplacePrivateOfferPromotionReference(id, name);
    }
  }
}
