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
    builder = SharedGcpCommerceProducerServiceBilling.Builder.class
)
public final class SharedGcpCommerceProducerServiceBilling {
  private final Optional<List<String>> metrics;

  private int _cachedHashCode;

  SharedGcpCommerceProducerServiceBilling(Optional<List<String>> metrics) {
    this.metrics = metrics;
  }

  /**
   * @return in format of [&quot;{product-name}.endpoints.{provider-id}.cloud.goog/{plan_key}_{usage_dimension_key}&quot;]
   */
  @JsonProperty("metrics")
  public Optional<List<String>> getMetrics() {
    return metrics;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerServiceBilling && equalTo((SharedGcpCommerceProducerServiceBilling) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerServiceBilling other) {
    return metrics.equals(other.metrics);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.metrics);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerServiceBilling{" + "metrics: " + metrics + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<String>> metrics = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerServiceBilling other) {
      metrics(other.getMetrics());
      return this;
    }

    @JsonSetter(
        value = "metrics",
        nulls = Nulls.SKIP
    )
    public Builder metrics(Optional<List<String>> metrics) {
      this.metrics = metrics;
      return this;
    }

    public Builder metrics(List<String> metrics) {
      this.metrics = Optional.of(metrics);
      return this;
    }

    public SharedGcpCommerceProducerServiceBilling build() {
      return new SharedGcpCommerceProducerServiceBilling(metrics);
    }
  }
}
