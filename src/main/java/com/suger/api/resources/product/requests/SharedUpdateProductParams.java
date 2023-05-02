package com.suger.api.resources.product.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = SharedUpdateProductParams.Builder.class
)
public final class SharedUpdateProductParams {
  private final String fulfillmentUrl;

  private final String id;

  private final String organizationId;

  private int _cachedHashCode;

  SharedUpdateProductParams(String fulfillmentUrl, String id, String organizationId) {
    this.fulfillmentUrl = fulfillmentUrl;
    this.id = id;
    this.organizationId = organizationId;
  }

  @JsonProperty("fulfillmentUrl")
  public String getFulfillmentUrl() {
    return fulfillmentUrl;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("organizationID")
  public String getOrganizationId() {
    return organizationId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedUpdateProductParams && equalTo((SharedUpdateProductParams) other);
  }

  private boolean equalTo(SharedUpdateProductParams other) {
    return fulfillmentUrl.equals(other.fulfillmentUrl) && id.equals(other.id) && organizationId.equals(other.organizationId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.fulfillmentUrl, this.id, this.organizationId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedUpdateProductParams{" + "fulfillmentUrl: " + fulfillmentUrl + ", id: " + id + ", organizationId: " + organizationId + "}";
  }

  public static FulfillmentUrlStage builder() {
    return new Builder();
  }

  public interface FulfillmentUrlStage {
    IdStage fulfillmentUrl(String fulfillmentUrl);

    Builder from(SharedUpdateProductParams other);
  }

  public interface IdStage {
    OrganizationIdStage id(String id);
  }

  public interface OrganizationIdStage {
    _FinalStage organizationId(String organizationId);
  }

  public interface _FinalStage {
    SharedUpdateProductParams build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements FulfillmentUrlStage, IdStage, OrganizationIdStage, _FinalStage {
    private String fulfillmentUrl;

    private String id;

    private String organizationId;

    private Builder() {
    }

    @Override
    public Builder from(SharedUpdateProductParams other) {
      fulfillmentUrl(other.getFulfillmentUrl());
      id(other.getId());
      organizationId(other.getOrganizationId());
      return this;
    }

    @Override
    @JsonSetter("fulfillmentUrl")
    public IdStage fulfillmentUrl(String fulfillmentUrl) {
      this.fulfillmentUrl = fulfillmentUrl;
      return this;
    }

    @Override
    @JsonSetter("id")
    public OrganizationIdStage id(String id) {
      this.id = id;
      return this;
    }

    @Override
    @JsonSetter("organizationID")
    public _FinalStage organizationId(String organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    @Override
    public SharedUpdateProductParams build() {
      return new SharedUpdateProductParams(fulfillmentUrl, id, organizationId);
    }
  }
}
