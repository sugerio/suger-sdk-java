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
    builder = SharedGcpCommerceProducerServiceConfig.Builder.class
)
public final class SharedGcpCommerceProducerServiceConfig {
  private final Optional<SharedGcpCommerceProducerServiceBilling> billing;

  private final Optional<List<SharedGcpCommerceProducerPurchaseMetric>> metrics;

  private final Optional<String> name;

  private final Optional<String> producerProjectId;

  private final Optional<String> title;

  private int _cachedHashCode;

  SharedGcpCommerceProducerServiceConfig(Optional<SharedGcpCommerceProducerServiceBilling> billing,
      Optional<List<SharedGcpCommerceProducerPurchaseMetric>> metrics, Optional<String> name,
      Optional<String> producerProjectId, Optional<String> title) {
    this.billing = billing;
    this.metrics = metrics;
    this.name = name;
    this.producerProjectId = producerProjectId;
    this.title = title;
  }

  @JsonProperty("billing")
  public Optional<SharedGcpCommerceProducerServiceBilling> getBilling() {
    return billing;
  }

  /**
   * @return Metrics: Defines the metrics used by this service.
   */
  @JsonProperty("metrics")
  public Optional<List<SharedGcpCommerceProducerPurchaseMetric>> getMetrics() {
    return metrics;
  }

  /**
   * @return In format of &quot;{product-name}.endpoints.{provider-id}.cloud.goog&quot;
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("producerProjectId")
  public Optional<String> getProducerProjectId() {
    return producerProjectId;
  }

  /**
   * @return The Product title
   */
  @JsonProperty("title")
  public Optional<String> getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerServiceConfig && equalTo((SharedGcpCommerceProducerServiceConfig) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerServiceConfig other) {
    return billing.equals(other.billing) && metrics.equals(other.metrics) && name.equals(other.name) && producerProjectId.equals(other.producerProjectId) && title.equals(other.title);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.billing, this.metrics, this.name, this.producerProjectId, this.title);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerServiceConfig{" + "billing: " + billing + ", metrics: " + metrics + ", name: " + name + ", producerProjectId: " + producerProjectId + ", title: " + title + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SharedGcpCommerceProducerServiceBilling> billing = Optional.empty();

    private Optional<List<SharedGcpCommerceProducerPurchaseMetric>> metrics = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> producerProjectId = Optional.empty();

    private Optional<String> title = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerServiceConfig other) {
      billing(other.getBilling());
      metrics(other.getMetrics());
      name(other.getName());
      producerProjectId(other.getProducerProjectId());
      title(other.getTitle());
      return this;
    }

    @JsonSetter(
        value = "billing",
        nulls = Nulls.SKIP
    )
    public Builder billing(Optional<SharedGcpCommerceProducerServiceBilling> billing) {
      this.billing = billing;
      return this;
    }

    public Builder billing(SharedGcpCommerceProducerServiceBilling billing) {
      this.billing = Optional.of(billing);
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
        value = "producerProjectId",
        nulls = Nulls.SKIP
    )
    public Builder producerProjectId(Optional<String> producerProjectId) {
      this.producerProjectId = producerProjectId;
      return this;
    }

    public Builder producerProjectId(String producerProjectId) {
      this.producerProjectId = Optional.of(producerProjectId);
      return this;
    }

    @JsonSetter(
        value = "title",
        nulls = Nulls.SKIP
    )
    public Builder title(Optional<String> title) {
      this.title = title;
      return this;
    }

    public Builder title(String title) {
      this.title = Optional.of(title);
      return this;
    }

    public SharedGcpCommerceProducerServiceConfig build() {
      return new SharedGcpCommerceProducerServiceConfig(billing, metrics, name, producerProjectId, title);
    }
  }
}
