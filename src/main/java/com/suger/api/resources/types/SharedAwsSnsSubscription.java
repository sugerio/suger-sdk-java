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
    builder = SharedAwsSnsSubscription.Builder.class
)
public final class SharedAwsSnsSubscription {
  private final Optional<String> endpoint;

  private final Optional<String> protocol;

  private final Optional<SharedAwsSnsSubscriptionStatus> status;

  private final Optional<String> subscriptionArn;

  private final Optional<String> topicArn;

  private int _cachedHashCode;

  SharedAwsSnsSubscription(Optional<String> endpoint, Optional<String> protocol,
      Optional<SharedAwsSnsSubscriptionStatus> status, Optional<String> subscriptionArn,
      Optional<String> topicArn) {
    this.endpoint = endpoint;
    this.protocol = protocol;
    this.status = status;
    this.subscriptionArn = subscriptionArn;
    this.topicArn = topicArn;
  }

  @JsonProperty("Endpoint")
  public Optional<String> getEndpoint() {
    return endpoint;
  }

  @JsonProperty("Protocol")
  public Optional<String> getProtocol() {
    return protocol;
  }

  @JsonProperty("Status")
  public Optional<SharedAwsSnsSubscriptionStatus> getStatus() {
    return status;
  }

  @JsonProperty("SubscriptionArn")
  public Optional<String> getSubscriptionArn() {
    return subscriptionArn;
  }

  @JsonProperty("TopicArn")
  public Optional<String> getTopicArn() {
    return topicArn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsSnsSubscription && equalTo((SharedAwsSnsSubscription) other);
  }

  private boolean equalTo(SharedAwsSnsSubscription other) {
    return endpoint.equals(other.endpoint) && protocol.equals(other.protocol) && status.equals(other.status) && subscriptionArn.equals(other.subscriptionArn) && topicArn.equals(other.topicArn);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.endpoint, this.protocol, this.status, this.subscriptionArn, this.topicArn);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsSnsSubscription{" + "endpoint: " + endpoint + ", protocol: " + protocol + ", status: " + status + ", subscriptionArn: " + subscriptionArn + ", topicArn: " + topicArn + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> endpoint = Optional.empty();

    private Optional<String> protocol = Optional.empty();

    private Optional<SharedAwsSnsSubscriptionStatus> status = Optional.empty();

    private Optional<String> subscriptionArn = Optional.empty();

    private Optional<String> topicArn = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsSnsSubscription other) {
      endpoint(other.getEndpoint());
      protocol(other.getProtocol());
      status(other.getStatus());
      subscriptionArn(other.getSubscriptionArn());
      topicArn(other.getTopicArn());
      return this;
    }

    @JsonSetter(
        value = "Endpoint",
        nulls = Nulls.SKIP
    )
    public Builder endpoint(Optional<String> endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    public Builder endpoint(String endpoint) {
      this.endpoint = Optional.of(endpoint);
      return this;
    }

    @JsonSetter(
        value = "Protocol",
        nulls = Nulls.SKIP
    )
    public Builder protocol(Optional<String> protocol) {
      this.protocol = protocol;
      return this;
    }

    public Builder protocol(String protocol) {
      this.protocol = Optional.of(protocol);
      return this;
    }

    @JsonSetter(
        value = "Status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<SharedAwsSnsSubscriptionStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(SharedAwsSnsSubscriptionStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "SubscriptionArn",
        nulls = Nulls.SKIP
    )
    public Builder subscriptionArn(Optional<String> subscriptionArn) {
      this.subscriptionArn = subscriptionArn;
      return this;
    }

    public Builder subscriptionArn(String subscriptionArn) {
      this.subscriptionArn = Optional.of(subscriptionArn);
      return this;
    }

    @JsonSetter(
        value = "TopicArn",
        nulls = Nulls.SKIP
    )
    public Builder topicArn(Optional<String> topicArn) {
      this.topicArn = topicArn;
      return this;
    }

    public Builder topicArn(String topicArn) {
      this.topicArn = Optional.of(topicArn);
      return this;
    }

    public SharedAwsSnsSubscription build() {
      return new SharedAwsSnsSubscription(endpoint, protocol, status, subscriptionArn, topicArn);
    }
  }
}
