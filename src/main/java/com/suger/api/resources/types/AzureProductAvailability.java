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
    builder = AzureProductAvailability.Builder.class
)
public final class AzureProductAvailability {
  private final Optional<List<AzureAudience>> emailAudiences;

  private final Optional<String> enterpriseLicensing;

  private final Optional<String> id;

  private final Optional<String> resourceType;

  private final Optional<List<AzureAudience>> subscriptionAudiences;

  private final Optional<String> visibility;

  private int _cachedHashCode;

  AzureProductAvailability(Optional<List<AzureAudience>> emailAudiences,
      Optional<String> enterpriseLicensing, Optional<String> id, Optional<String> resourceType,
      Optional<List<AzureAudience>> subscriptionAudiences, Optional<String> visibility) {
    this.emailAudiences = emailAudiences;
    this.enterpriseLicensing = enterpriseLicensing;
    this.id = id;
    this.resourceType = resourceType;
    this.subscriptionAudiences = subscriptionAudiences;
    this.visibility = visibility;
  }

  @JsonProperty("emailAudiences")
  public Optional<List<AzureAudience>> getEmailAudiences() {
    return emailAudiences;
  }

  @JsonProperty("enterpriseLicensing")
  public Optional<String> getEnterpriseLicensing() {
    return enterpriseLicensing;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("resourceType")
  public Optional<String> getResourceType() {
    return resourceType;
  }

  @JsonProperty("subscriptionAudiences")
  public Optional<List<AzureAudience>> getSubscriptionAudiences() {
    return subscriptionAudiences;
  }

  @JsonProperty("visibility")
  public Optional<String> getVisibility() {
    return visibility;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductAvailability && equalTo((AzureProductAvailability) other);
  }

  private boolean equalTo(AzureProductAvailability other) {
    return emailAudiences.equals(other.emailAudiences) && enterpriseLicensing.equals(other.enterpriseLicensing) && id.equals(other.id) && resourceType.equals(other.resourceType) && subscriptionAudiences.equals(other.subscriptionAudiences) && visibility.equals(other.visibility);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.emailAudiences, this.enterpriseLicensing, this.id, this.resourceType, this.subscriptionAudiences, this.visibility);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductAvailability{" + "emailAudiences: " + emailAudiences + ", enterpriseLicensing: " + enterpriseLicensing + ", id: " + id + ", resourceType: " + resourceType + ", subscriptionAudiences: " + subscriptionAudiences + ", visibility: " + visibility + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<AzureAudience>> emailAudiences = Optional.empty();

    private Optional<String> enterpriseLicensing = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> resourceType = Optional.empty();

    private Optional<List<AzureAudience>> subscriptionAudiences = Optional.empty();

    private Optional<String> visibility = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductAvailability other) {
      emailAudiences(other.getEmailAudiences());
      enterpriseLicensing(other.getEnterpriseLicensing());
      id(other.getId());
      resourceType(other.getResourceType());
      subscriptionAudiences(other.getSubscriptionAudiences());
      visibility(other.getVisibility());
      return this;
    }

    @JsonSetter(
        value = "emailAudiences",
        nulls = Nulls.SKIP
    )
    public Builder emailAudiences(Optional<List<AzureAudience>> emailAudiences) {
      this.emailAudiences = emailAudiences;
      return this;
    }

    public Builder emailAudiences(List<AzureAudience> emailAudiences) {
      this.emailAudiences = Optional.of(emailAudiences);
      return this;
    }

    @JsonSetter(
        value = "enterpriseLicensing",
        nulls = Nulls.SKIP
    )
    public Builder enterpriseLicensing(Optional<String> enterpriseLicensing) {
      this.enterpriseLicensing = enterpriseLicensing;
      return this;
    }

    public Builder enterpriseLicensing(String enterpriseLicensing) {
      this.enterpriseLicensing = Optional.of(enterpriseLicensing);
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
        value = "subscriptionAudiences",
        nulls = Nulls.SKIP
    )
    public Builder subscriptionAudiences(Optional<List<AzureAudience>> subscriptionAudiences) {
      this.subscriptionAudiences = subscriptionAudiences;
      return this;
    }

    public Builder subscriptionAudiences(List<AzureAudience> subscriptionAudiences) {
      this.subscriptionAudiences = Optional.of(subscriptionAudiences);
      return this;
    }

    @JsonSetter(
        value = "visibility",
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

    public AzureProductAvailability build() {
      return new AzureProductAvailability(emailAudiences, enterpriseLicensing, id, resourceType, subscriptionAudiences, visibility);
    }
  }
}
