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
    builder = AzurePriceAndAvailabilityPrivateOfferPlan.Builder.class
)
public final class AzurePriceAndAvailabilityPrivateOfferPlan {
  private final Optional<String> schema;

  private final Optional<String> id;

  private final Optional<String> plan;

  private final Optional<AzurePriceAndAvailabilityPrivateOfferPrice> pricing;

  private final Optional<String> product;

  private final Optional<String> resourceName;

  private final Optional<List<AzureMarketplaceValidation>> validations;

  private int _cachedHashCode;

  AzurePriceAndAvailabilityPrivateOfferPlan(Optional<String> schema, Optional<String> id,
      Optional<String> plan, Optional<AzurePriceAndAvailabilityPrivateOfferPrice> pricing,
      Optional<String> product, Optional<String> resourceName,
      Optional<List<AzureMarketplaceValidation>> validations) {
    this.schema = schema;
    this.id = id;
    this.plan = plan;
    this.pricing = pricing;
    this.product = product;
    this.resourceName = resourceName;
    this.validations = validations;
  }

  @JsonProperty("$schema")
  public Optional<String> getSchema() {
    return schema;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("plan")
  public Optional<String> getPlan() {
    return plan;
  }

  @JsonProperty("pricing")
  public Optional<AzurePriceAndAvailabilityPrivateOfferPrice> getPricing() {
    return pricing;
  }

  @JsonProperty("product")
  public Optional<String> getProduct() {
    return product;
  }

  @JsonProperty("resourceName")
  public Optional<String> getResourceName() {
    return resourceName;
  }

  @JsonProperty("validations")
  public Optional<List<AzureMarketplaceValidation>> getValidations() {
    return validations;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzurePriceAndAvailabilityPrivateOfferPlan && equalTo((AzurePriceAndAvailabilityPrivateOfferPlan) other);
  }

  private boolean equalTo(AzurePriceAndAvailabilityPrivateOfferPlan other) {
    return schema.equals(other.schema) && id.equals(other.id) && plan.equals(other.plan) && pricing.equals(other.pricing) && product.equals(other.product) && resourceName.equals(other.resourceName) && validations.equals(other.validations);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.schema, this.id, this.plan, this.pricing, this.product, this.resourceName, this.validations);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzurePriceAndAvailabilityPrivateOfferPlan{" + "schema: " + schema + ", id: " + id + ", plan: " + plan + ", pricing: " + pricing + ", product: " + product + ", resourceName: " + resourceName + ", validations: " + validations + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> schema = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> plan = Optional.empty();

    private Optional<AzurePriceAndAvailabilityPrivateOfferPrice> pricing = Optional.empty();

    private Optional<String> product = Optional.empty();

    private Optional<String> resourceName = Optional.empty();

    private Optional<List<AzureMarketplaceValidation>> validations = Optional.empty();

    private Builder() {
    }

    public Builder from(AzurePriceAndAvailabilityPrivateOfferPlan other) {
      schema(other.getSchema());
      id(other.getId());
      plan(other.getPlan());
      pricing(other.getPricing());
      product(other.getProduct());
      resourceName(other.getResourceName());
      validations(other.getValidations());
      return this;
    }

    @JsonSetter(
        value = "$schema",
        nulls = Nulls.SKIP
    )
    public Builder schema(Optional<String> schema) {
      this.schema = schema;
      return this;
    }

    public Builder schema(String schema) {
      this.schema = Optional.of(schema);
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
        value = "plan",
        nulls = Nulls.SKIP
    )
    public Builder plan(Optional<String> plan) {
      this.plan = plan;
      return this;
    }

    public Builder plan(String plan) {
      this.plan = Optional.of(plan);
      return this;
    }

    @JsonSetter(
        value = "pricing",
        nulls = Nulls.SKIP
    )
    public Builder pricing(Optional<AzurePriceAndAvailabilityPrivateOfferPrice> pricing) {
      this.pricing = pricing;
      return this;
    }

    public Builder pricing(AzurePriceAndAvailabilityPrivateOfferPrice pricing) {
      this.pricing = Optional.of(pricing);
      return this;
    }

    @JsonSetter(
        value = "product",
        nulls = Nulls.SKIP
    )
    public Builder product(Optional<String> product) {
      this.product = product;
      return this;
    }

    public Builder product(String product) {
      this.product = Optional.of(product);
      return this;
    }

    @JsonSetter(
        value = "resourceName",
        nulls = Nulls.SKIP
    )
    public Builder resourceName(Optional<String> resourceName) {
      this.resourceName = resourceName;
      return this;
    }

    public Builder resourceName(String resourceName) {
      this.resourceName = Optional.of(resourceName);
      return this;
    }

    @JsonSetter(
        value = "validations",
        nulls = Nulls.SKIP
    )
    public Builder validations(Optional<List<AzureMarketplaceValidation>> validations) {
      this.validations = validations;
      return this;
    }

    public Builder validations(List<AzureMarketplaceValidation> validations) {
      this.validations = Optional.of(validations);
      return this;
    }

    public AzurePriceAndAvailabilityPrivateOfferPlan build() {
      return new AzurePriceAndAvailabilityPrivateOfferPlan(schema, id, plan, pricing, product, resourceName, validations);
    }
  }
}
