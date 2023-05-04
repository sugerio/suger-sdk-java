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
    builder = AzureVariantResource.Builder.class
)
public final class AzureVariantResource {
  private final Optional<List<AzureTypeValue>> resources;

  private final Optional<String> variantId;

  private int _cachedHashCode;

  AzureVariantResource(Optional<List<AzureTypeValue>> resources, Optional<String> variantId) {
    this.resources = resources;
    this.variantId = variantId;
  }

  @JsonProperty("resources")
  public Optional<List<AzureTypeValue>> getResources() {
    return resources;
  }

  @JsonProperty("variantID")
  public Optional<String> getVariantId() {
    return variantId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureVariantResource && equalTo((AzureVariantResource) other);
  }

  private boolean equalTo(AzureVariantResource other) {
    return resources.equals(other.resources) && variantId.equals(other.variantId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.resources, this.variantId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureVariantResource{" + "resources: " + resources + ", variantId: " + variantId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<AzureTypeValue>> resources = Optional.empty();

    private Optional<String> variantId = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureVariantResource other) {
      resources(other.getResources());
      variantId(other.getVariantId());
      return this;
    }

    @JsonSetter(
        value = "resources",
        nulls = Nulls.SKIP
    )
    public Builder resources(Optional<List<AzureTypeValue>> resources) {
      this.resources = resources;
      return this;
    }

    public Builder resources(List<AzureTypeValue> resources) {
      this.resources = Optional.of(resources);
      return this;
    }

    @JsonSetter(
        value = "variantID",
        nulls = Nulls.SKIP
    )
    public Builder variantId(Optional<String> variantId) {
      this.variantId = variantId;
      return this;
    }

    public Builder variantId(String variantId) {
      this.variantId = Optional.of(variantId);
      return this;
    }

    public AzureVariantResource build() {
      return new AzureVariantResource(resources, variantId);
    }
  }
}
