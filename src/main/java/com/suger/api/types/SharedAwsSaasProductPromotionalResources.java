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
    builder = SharedAwsSaasProductPromotionalResources.Builder.class
)
public final class SharedAwsSaasProductPromotionalResources {
  private final Optional<List<SharedAwsSaasProductAdditionalResource>> additionalResources;

  private final Optional<String> logoUrl;

  private int _cachedHashCode;

  SharedAwsSaasProductPromotionalResources(
      Optional<List<SharedAwsSaasProductAdditionalResource>> additionalResources,
      Optional<String> logoUrl) {
    this.additionalResources = additionalResources;
    this.logoUrl = logoUrl;
  }

  @JsonProperty("AdditionalResources")
  public Optional<List<SharedAwsSaasProductAdditionalResource>> getAdditionalResources() {
    return additionalResources;
  }

  @JsonProperty("LogoUrl")
  public Optional<String> getLogoUrl() {
    return logoUrl;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsSaasProductPromotionalResources && equalTo((SharedAwsSaasProductPromotionalResources) other);
  }

  private boolean equalTo(SharedAwsSaasProductPromotionalResources other) {
    return additionalResources.equals(other.additionalResources) && logoUrl.equals(other.logoUrl);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.additionalResources, this.logoUrl);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsSaasProductPromotionalResources{" + "additionalResources: " + additionalResources + ", logoUrl: " + logoUrl + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<SharedAwsSaasProductAdditionalResource>> additionalResources = Optional.empty();

    private Optional<String> logoUrl = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsSaasProductPromotionalResources other) {
      additionalResources(other.getAdditionalResources());
      logoUrl(other.getLogoUrl());
      return this;
    }

    @JsonSetter(
        value = "AdditionalResources",
        nulls = Nulls.SKIP
    )
    public Builder additionalResources(
        Optional<List<SharedAwsSaasProductAdditionalResource>> additionalResources) {
      this.additionalResources = additionalResources;
      return this;
    }

    public Builder additionalResources(
        List<SharedAwsSaasProductAdditionalResource> additionalResources) {
      this.additionalResources = Optional.of(additionalResources);
      return this;
    }

    @JsonSetter(
        value = "LogoUrl",
        nulls = Nulls.SKIP
    )
    public Builder logoUrl(Optional<String> logoUrl) {
      this.logoUrl = logoUrl;
      return this;
    }

    public Builder logoUrl(String logoUrl) {
      this.logoUrl = Optional.of(logoUrl);
      return this;
    }

    public SharedAwsSaasProductPromotionalResources build() {
      return new SharedAwsSaasProductPromotionalResources(additionalResources, logoUrl);
    }
  }
}
