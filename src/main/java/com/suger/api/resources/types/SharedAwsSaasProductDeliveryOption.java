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
    builder = SharedAwsSaasProductDeliveryOption.Builder.class
)
public final class SharedAwsSaasProductDeliveryOption {
  private final Optional<String> fulfillmentUrl;

  private final Optional<String> id;

  private final Optional<String> type;

  private int _cachedHashCode;

  SharedAwsSaasProductDeliveryOption(Optional<String> fulfillmentUrl, Optional<String> id,
      Optional<String> type) {
    this.fulfillmentUrl = fulfillmentUrl;
    this.id = id;
    this.type = type;
  }

  @JsonProperty("FulfillmentUrl")
  public Optional<String> getFulfillmentUrl() {
    return fulfillmentUrl;
  }

  @JsonProperty("Id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("Type")
  public Optional<String> getType() {
    return type;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsSaasProductDeliveryOption && equalTo((SharedAwsSaasProductDeliveryOption) other);
  }

  private boolean equalTo(SharedAwsSaasProductDeliveryOption other) {
    return fulfillmentUrl.equals(other.fulfillmentUrl) && id.equals(other.id) && type.equals(other.type);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.fulfillmentUrl, this.id, this.type);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsSaasProductDeliveryOption{" + "fulfillmentUrl: " + fulfillmentUrl + ", id: " + id + ", type: " + type + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> fulfillmentUrl = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsSaasProductDeliveryOption other) {
      fulfillmentUrl(other.getFulfillmentUrl());
      id(other.getId());
      type(other.getType());
      return this;
    }

    @JsonSetter(
        value = "FulfillmentUrl",
        nulls = Nulls.SKIP
    )
    public Builder fulfillmentUrl(Optional<String> fulfillmentUrl) {
      this.fulfillmentUrl = fulfillmentUrl;
      return this;
    }

    public Builder fulfillmentUrl(String fulfillmentUrl) {
      this.fulfillmentUrl = Optional.of(fulfillmentUrl);
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

    @JsonSetter(
        value = "Type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<String> type) {
      this.type = type;
      return this;
    }

    public Builder type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    public SharedAwsSaasProductDeliveryOption build() {
      return new SharedAwsSaasProductDeliveryOption(fulfillmentUrl, id, type);
    }
  }
}
