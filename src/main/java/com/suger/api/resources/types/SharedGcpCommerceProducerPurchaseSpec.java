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
    builder = SharedGcpCommerceProducerPurchaseSpec.Builder.class
)
public final class SharedGcpCommerceProducerPurchaseSpec {
  private final Optional<List<SharedGcpCommerceProducerPurchaseMetric>> metrics;

  private final Optional<List<SharedGcpPurchasePlan>> purchaseOptionSpecs;

  private int _cachedHashCode;

  SharedGcpCommerceProducerPurchaseSpec(
      Optional<List<SharedGcpCommerceProducerPurchaseMetric>> metrics,
      Optional<List<SharedGcpPurchasePlan>> purchaseOptionSpecs) {
    this.metrics = metrics;
    this.purchaseOptionSpecs = purchaseOptionSpecs;
  }

  @JsonProperty("metrics")
  public Optional<List<SharedGcpCommerceProducerPurchaseMetric>> getMetrics() {
    return metrics;
  }

  @JsonProperty("purchaseOptionSpecs")
  public Optional<List<SharedGcpPurchasePlan>> getPurchaseOptionSpecs() {
    return purchaseOptionSpecs;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerPurchaseSpec && equalTo((SharedGcpCommerceProducerPurchaseSpec) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerPurchaseSpec other) {
    return metrics.equals(other.metrics) && purchaseOptionSpecs.equals(other.purchaseOptionSpecs);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.metrics, this.purchaseOptionSpecs);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerPurchaseSpec{" + "metrics: " + metrics + ", purchaseOptionSpecs: " + purchaseOptionSpecs + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<SharedGcpCommerceProducerPurchaseMetric>> metrics = Optional.empty();

    private Optional<List<SharedGcpPurchasePlan>> purchaseOptionSpecs = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerPurchaseSpec other) {
      metrics(other.getMetrics());
      purchaseOptionSpecs(other.getPurchaseOptionSpecs());
      return this;
    }

    @JsonSetter(
        value = "metrics",
        nulls = Nulls.SKIP
    )
    public Builder metrics(Optional<List<SharedGcpCommerceProducerPurchaseMetric>> metrics) {
      this.metrics = metrics;
      return this;
    }

    public Builder metrics(List<SharedGcpCommerceProducerPurchaseMetric> metrics) {
      this.metrics = Optional.of(metrics);
      return this;
    }

    @JsonSetter(
        value = "purchaseOptionSpecs",
        nulls = Nulls.SKIP
    )
    public Builder purchaseOptionSpecs(Optional<List<SharedGcpPurchasePlan>> purchaseOptionSpecs) {
      this.purchaseOptionSpecs = purchaseOptionSpecs;
      return this;
    }

    public Builder purchaseOptionSpecs(List<SharedGcpPurchasePlan> purchaseOptionSpecs) {
      this.purchaseOptionSpecs = Optional.of(purchaseOptionSpecs);
      return this;
    }

    public SharedGcpCommerceProducerPurchaseSpec build() {
      return new SharedGcpCommerceProducerPurchaseSpec(metrics, purchaseOptionSpecs);
    }
  }
}
