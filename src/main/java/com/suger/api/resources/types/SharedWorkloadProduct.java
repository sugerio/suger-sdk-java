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
    builder = SharedWorkloadProduct.Builder.class
)
public final class SharedWorkloadProduct {
  private final Optional<String> createdBy;

  private final Optional<String> creationTime;

  private final Optional<String> externalId;

  private final Optional<String> fulfillmentUrl;

  private final Optional<String> id;

  private final Optional<SharedProductInfo> info;

  private final Optional<String> lastUpdateTime;

  private final Optional<String> lastUpdatedBy;

  private final Optional<String> name;

  private final Optional<String> organizationId;

  private final Optional<SharedWorkloadProductPartner> partner;

  private final Optional<SharedWorkloadProductProductType> productType;

  private final Optional<SharedWorkloadProductService> service;

  private final Optional<String> status;

  private int _cachedHashCode;

  SharedWorkloadProduct(Optional<String> createdBy, Optional<String> creationTime,
      Optional<String> externalId, Optional<String> fulfillmentUrl, Optional<String> id,
      Optional<SharedProductInfo> info, Optional<String> lastUpdateTime,
      Optional<String> lastUpdatedBy, Optional<String> name, Optional<String> organizationId,
      Optional<SharedWorkloadProductPartner> partner,
      Optional<SharedWorkloadProductProductType> productType,
      Optional<SharedWorkloadProductService> service, Optional<String> status) {
    this.createdBy = createdBy;
    this.creationTime = creationTime;
    this.externalId = externalId;
    this.fulfillmentUrl = fulfillmentUrl;
    this.id = id;
    this.info = info;
    this.lastUpdateTime = lastUpdateTime;
    this.lastUpdatedBy = lastUpdatedBy;
    this.name = name;
    this.organizationId = organizationId;
    this.partner = partner;
    this.productType = productType;
    this.service = service;
    this.status = status;
  }

  @JsonProperty("createdBy")
  public Optional<String> getCreatedBy() {
    return createdBy;
  }

  @JsonProperty("creationTime")
  public Optional<String> getCreationTime() {
    return creationTime;
  }

  @JsonProperty("externalID")
  public Optional<String> getExternalId() {
    return externalId;
  }

  @JsonProperty("fulfillmentUrl")
  public Optional<String> getFulfillmentUrl() {
    return fulfillmentUrl;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("info")
  public Optional<SharedProductInfo> getInfo() {
    return info;
  }

  @JsonProperty("lastUpdateTime")
  public Optional<String> getLastUpdateTime() {
    return lastUpdateTime;
  }

  @JsonProperty("lastUpdatedBy")
  public Optional<String> getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("partner")
  public Optional<SharedWorkloadProductPartner> getPartner() {
    return partner;
  }

  @JsonProperty("productType")
  public Optional<SharedWorkloadProductProductType> getProductType() {
    return productType;
  }

  @JsonProperty("service")
  public Optional<SharedWorkloadProductService> getService() {
    return service;
  }

  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedWorkloadProduct && equalTo((SharedWorkloadProduct) other);
  }

  private boolean equalTo(SharedWorkloadProduct other) {
    return createdBy.equals(other.createdBy) && creationTime.equals(other.creationTime) && externalId.equals(other.externalId) && fulfillmentUrl.equals(other.fulfillmentUrl) && id.equals(other.id) && info.equals(other.info) && lastUpdateTime.equals(other.lastUpdateTime) && lastUpdatedBy.equals(other.lastUpdatedBy) && name.equals(other.name) && organizationId.equals(other.organizationId) && partner.equals(other.partner) && productType.equals(other.productType) && service.equals(other.service) && status.equals(other.status);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.createdBy, this.creationTime, this.externalId, this.fulfillmentUrl, this.id, this.info, this.lastUpdateTime, this.lastUpdatedBy, this.name, this.organizationId, this.partner, this.productType, this.service, this.status);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedWorkloadProduct{" + "createdBy: " + createdBy + ", creationTime: " + creationTime + ", externalId: " + externalId + ", fulfillmentUrl: " + fulfillmentUrl + ", id: " + id + ", info: " + info + ", lastUpdateTime: " + lastUpdateTime + ", lastUpdatedBy: " + lastUpdatedBy + ", name: " + name + ", organizationId: " + organizationId + ", partner: " + partner + ", productType: " + productType + ", service: " + service + ", status: " + status + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> createdBy = Optional.empty();

    private Optional<String> creationTime = Optional.empty();

    private Optional<String> externalId = Optional.empty();

    private Optional<String> fulfillmentUrl = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<SharedProductInfo> info = Optional.empty();

    private Optional<String> lastUpdateTime = Optional.empty();

    private Optional<String> lastUpdatedBy = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<SharedWorkloadProductPartner> partner = Optional.empty();

    private Optional<SharedWorkloadProductProductType> productType = Optional.empty();

    private Optional<SharedWorkloadProductService> service = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedWorkloadProduct other) {
      createdBy(other.getCreatedBy());
      creationTime(other.getCreationTime());
      externalId(other.getExternalId());
      fulfillmentUrl(other.getFulfillmentUrl());
      id(other.getId());
      info(other.getInfo());
      lastUpdateTime(other.getLastUpdateTime());
      lastUpdatedBy(other.getLastUpdatedBy());
      name(other.getName());
      organizationId(other.getOrganizationId());
      partner(other.getPartner());
      productType(other.getProductType());
      service(other.getService());
      status(other.getStatus());
      return this;
    }

    @JsonSetter(
        value = "createdBy",
        nulls = Nulls.SKIP
    )
    public Builder createdBy(Optional<String> createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    public Builder createdBy(String createdBy) {
      this.createdBy = Optional.of(createdBy);
      return this;
    }

    @JsonSetter(
        value = "creationTime",
        nulls = Nulls.SKIP
    )
    public Builder creationTime(Optional<String> creationTime) {
      this.creationTime = creationTime;
      return this;
    }

    public Builder creationTime(String creationTime) {
      this.creationTime = Optional.of(creationTime);
      return this;
    }

    @JsonSetter(
        value = "externalID",
        nulls = Nulls.SKIP
    )
    public Builder externalId(Optional<String> externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder externalId(String externalId) {
      this.externalId = Optional.of(externalId);
      return this;
    }

    @JsonSetter(
        value = "fulfillmentUrl",
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
        value = "info",
        nulls = Nulls.SKIP
    )
    public Builder info(Optional<SharedProductInfo> info) {
      this.info = info;
      return this;
    }

    public Builder info(SharedProductInfo info) {
      this.info = Optional.of(info);
      return this;
    }

    @JsonSetter(
        value = "lastUpdateTime",
        nulls = Nulls.SKIP
    )
    public Builder lastUpdateTime(Optional<String> lastUpdateTime) {
      this.lastUpdateTime = lastUpdateTime;
      return this;
    }

    public Builder lastUpdateTime(String lastUpdateTime) {
      this.lastUpdateTime = Optional.of(lastUpdateTime);
      return this;
    }

    @JsonSetter(
        value = "lastUpdatedBy",
        nulls = Nulls.SKIP
    )
    public Builder lastUpdatedBy(Optional<String> lastUpdatedBy) {
      this.lastUpdatedBy = lastUpdatedBy;
      return this;
    }

    public Builder lastUpdatedBy(String lastUpdatedBy) {
      this.lastUpdatedBy = Optional.of(lastUpdatedBy);
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
        value = "organizationID",
        nulls = Nulls.SKIP
    )
    public Builder organizationId(Optional<String> organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    public Builder organizationId(String organizationId) {
      this.organizationId = Optional.of(organizationId);
      return this;
    }

    @JsonSetter(
        value = "partner",
        nulls = Nulls.SKIP
    )
    public Builder partner(Optional<SharedWorkloadProductPartner> partner) {
      this.partner = partner;
      return this;
    }

    public Builder partner(SharedWorkloadProductPartner partner) {
      this.partner = Optional.of(partner);
      return this;
    }

    @JsonSetter(
        value = "productType",
        nulls = Nulls.SKIP
    )
    public Builder productType(Optional<SharedWorkloadProductProductType> productType) {
      this.productType = productType;
      return this;
    }

    public Builder productType(SharedWorkloadProductProductType productType) {
      this.productType = Optional.of(productType);
      return this;
    }

    @JsonSetter(
        value = "service",
        nulls = Nulls.SKIP
    )
    public Builder service(Optional<SharedWorkloadProductService> service) {
      this.service = service;
      return this;
    }

    public Builder service(SharedWorkloadProductService service) {
      this.service = Optional.of(service);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<String> status) {
      this.status = status;
      return this;
    }

    public Builder status(String status) {
      this.status = Optional.of(status);
      return this;
    }

    public SharedWorkloadProduct build() {
      return new SharedWorkloadProduct(createdBy, creationTime, externalId, fulfillmentUrl, id, info, lastUpdateTime, lastUpdatedBy, name, organizationId, partner, productType, service, status);
    }
  }
}
