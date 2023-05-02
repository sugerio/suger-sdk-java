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
    builder = SharedAwsSaasProductVersion.Builder.class
)
public final class SharedAwsSaasProductVersion {
  private final Optional<List<SharedAwsSaasProductDeliveryOption>> deliveryOptions;

  private final Optional<String> id;

  private int _cachedHashCode;

  SharedAwsSaasProductVersion(Optional<List<SharedAwsSaasProductDeliveryOption>> deliveryOptions,
      Optional<String> id) {
    this.deliveryOptions = deliveryOptions;
    this.id = id;
  }

  @JsonProperty("DeliveryOptions")
  public Optional<List<SharedAwsSaasProductDeliveryOption>> getDeliveryOptions() {
    return deliveryOptions;
  }

  @JsonProperty("Id")
  public Optional<String> getId() {
    return id;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsSaasProductVersion && equalTo((SharedAwsSaasProductVersion) other);
  }

  private boolean equalTo(SharedAwsSaasProductVersion other) {
    return deliveryOptions.equals(other.deliveryOptions) && id.equals(other.id);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.deliveryOptions, this.id);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsSaasProductVersion{" + "deliveryOptions: " + deliveryOptions + ", id: " + id + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<SharedAwsSaasProductDeliveryOption>> deliveryOptions = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsSaasProductVersion other) {
      deliveryOptions(other.getDeliveryOptions());
      id(other.getId());
      return this;
    }

    @JsonSetter(
        value = "DeliveryOptions",
        nulls = Nulls.SKIP
    )
    public Builder deliveryOptions(
        Optional<List<SharedAwsSaasProductDeliveryOption>> deliveryOptions) {
      this.deliveryOptions = deliveryOptions;
      return this;
    }

    public Builder deliveryOptions(List<SharedAwsSaasProductDeliveryOption> deliveryOptions) {
      this.deliveryOptions = Optional.of(deliveryOptions);
      return this;
    }

    @JsonSetter(
        value = "Id",
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

    public SharedAwsSaasProductVersion build() {
      return new SharedAwsSaasProductVersion(deliveryOptions, id);
    }
  }
}
