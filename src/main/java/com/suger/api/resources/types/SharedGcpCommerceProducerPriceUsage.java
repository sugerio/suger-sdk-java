package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedGcpCommerceProducerPriceUsage.Builder.class
)
public final class SharedGcpCommerceProducerPriceUsage {
  private final Optional<Integer> displayQuantity;

  private final Optional<String> metricId;

  private final Optional<List<SharedGcpCommerceProducerPriceTier>> priceTiers;

  private final Optional<SharedGcpCommerceProducerPriceUsageTaxCategoryOverride> taxCategoryOverride;

  private int _cachedHashCode;

  SharedGcpCommerceProducerPriceUsage(Optional<Integer> displayQuantity, Optional<String> metricId,
      Optional<List<SharedGcpCommerceProducerPriceTier>> priceTiers,
      Optional<SharedGcpCommerceProducerPriceUsageTaxCategoryOverride> taxCategoryOverride) {
    this.displayQuantity = displayQuantity;
    this.metricId = metricId;
    this.priceTiers = priceTiers;
    this.taxCategoryOverride = taxCategoryOverride;
  }

  /**
   * @return Default value is 1.
   */
  @JsonProperty("displayQuantity")
  public Optional<Integer> getDisplayQuantity() {
    return displayQuantity;
  }

  /**
   * @return the usage metering dimension key
   */
  @JsonProperty("metricId")
  public Optional<String> getMetricId() {
    return metricId;
  }

  @JsonProperty("priceTiers")
  public Optional<List<SharedGcpCommerceProducerPriceTier>> getPriceTiers() {
    return priceTiers;
  }

  @JsonProperty("taxCategoryOverride")
  public Optional<SharedGcpCommerceProducerPriceUsageTaxCategoryOverride> getTaxCategoryOverride() {
    return taxCategoryOverride;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerPriceUsage && equalTo((SharedGcpCommerceProducerPriceUsage) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerPriceUsage other) {
    return displayQuantity.equals(other.displayQuantity) && metricId.equals(other.metricId) && priceTiers.equals(other.priceTiers) && taxCategoryOverride.equals(other.taxCategoryOverride);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.displayQuantity, this.metricId, this.priceTiers, this.taxCategoryOverride);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerPriceUsage{" + "displayQuantity: " + displayQuantity + ", metricId: " + metricId + ", priceTiers: " + priceTiers + ", taxCategoryOverride: " + taxCategoryOverride + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> displayQuantity = Optional.empty();

    private Optional<String> metricId = Optional.empty();

    private Optional<List<SharedGcpCommerceProducerPriceTier>> priceTiers = Optional.empty();

    private Optional<SharedGcpCommerceProducerPriceUsageTaxCategoryOverride> taxCategoryOverride = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerPriceUsage other) {
      displayQuantity(other.getDisplayQuantity());
      metricId(other.getMetricId());
      priceTiers(other.getPriceTiers());
      taxCategoryOverride(other.getTaxCategoryOverride());
      return this;
    }

    @JsonSetter(
        value = "displayQuantity",
        nulls = Nulls.SKIP
    )
    public Builder displayQuantity(Optional<Integer> displayQuantity) {
      this.displayQuantity = displayQuantity;
      return this;
    }

    public Builder displayQuantity(Integer displayQuantity) {
      this.displayQuantity = Optional.of(displayQuantity);
      return this;
    }

    @JsonSetter(
        value = "metricId",
        nulls = Nulls.SKIP
    )
    public Builder metricId(Optional<String> metricId) {
      this.metricId = metricId;
      return this;
    }

    public Builder metricId(String metricId) {
      this.metricId = Optional.of(metricId);
      return this;
    }

    @JsonSetter(
        value = "priceTiers",
        nulls = Nulls.SKIP
    )
    public Builder priceTiers(Optional<List<SharedGcpCommerceProducerPriceTier>> priceTiers) {
      this.priceTiers = priceTiers;
      return this;
    }

    public Builder priceTiers(List<SharedGcpCommerceProducerPriceTier> priceTiers) {
      this.priceTiers = Optional.of(priceTiers);
      return this;
    }

    @JsonSetter(
        value = "taxCategoryOverride",
        nulls = Nulls.SKIP
    )
    public Builder taxCategoryOverride(
        Optional<SharedGcpCommerceProducerPriceUsageTaxCategoryOverride> taxCategoryOverride) {
      this.taxCategoryOverride = taxCategoryOverride;
      return this;
    }

    public Builder taxCategoryOverride(
        SharedGcpCommerceProducerPriceUsageTaxCategoryOverride taxCategoryOverride) {
      this.taxCategoryOverride = Optional.of(taxCategoryOverride);
      return this;
    }

    public SharedGcpCommerceProducerPriceUsage build() {
      return new SharedGcpCommerceProducerPriceUsage(displayQuantity, metricId, priceTiers, taxCategoryOverride);
    }
  }
}
