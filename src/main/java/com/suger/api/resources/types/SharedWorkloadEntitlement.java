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
    builder = SharedWorkloadEntitlement.Builder.class
)
public final class SharedWorkloadEntitlement {
  private final Optional<String> buyerId;

  private final Optional<String> creationTime;

  private final Optional<String> endTime;

  private final Optional<String> entitlementTermId;

  private final Optional<String> externalBuyerId;

  private final Optional<String> externalId;

  private final Optional<String> externalProductId;

  private final Optional<String> id;

  private final Optional<SharedEntitlementInfo> info;

  private final Optional<String> lastUpdateTime;

  private final Optional<String> name;

  private final Optional<String> offerId;

  private final Optional<String> organizationId;

  private final Optional<SharedWorkloadEntitlementPartner> partner;

  private final Optional<String> productId;

  private final Optional<SharedWorkloadEntitlementService> service;

  private final Optional<String> startTime;

  private final Optional<SharedWorkloadEntitlementStatus> status;

  private final Optional<String> type;

  private int _cachedHashCode;

  SharedWorkloadEntitlement(Optional<String> buyerId, Optional<String> creationTime,
      Optional<String> endTime, Optional<String> entitlementTermId,
      Optional<String> externalBuyerId, Optional<String> externalId,
      Optional<String> externalProductId, Optional<String> id, Optional<SharedEntitlementInfo> info,
      Optional<String> lastUpdateTime, Optional<String> name, Optional<String> offerId,
      Optional<String> organizationId, Optional<SharedWorkloadEntitlementPartner> partner,
      Optional<String> productId, Optional<SharedWorkloadEntitlementService> service,
      Optional<String> startTime, Optional<SharedWorkloadEntitlementStatus> status,
      Optional<String> type) {
    this.buyerId = buyerId;
    this.creationTime = creationTime;
    this.endTime = endTime;
    this.entitlementTermId = entitlementTermId;
    this.externalBuyerId = externalBuyerId;
    this.externalId = externalId;
    this.externalProductId = externalProductId;
    this.id = id;
    this.info = info;
    this.lastUpdateTime = lastUpdateTime;
    this.name = name;
    this.offerId = offerId;
    this.organizationId = organizationId;
    this.partner = partner;
    this.productId = productId;
    this.service = service;
    this.startTime = startTime;
    this.status = status;
    this.type = type;
  }

  @JsonProperty("buyerID")
  public Optional<String> getBuyerId() {
    return buyerId;
  }

  @JsonProperty("creationTime")
  public Optional<String> getCreationTime() {
    return creationTime;
  }

  /**
   * @return nullable
   */
  @JsonProperty("endTime")
  public Optional<String> getEndTime() {
    return endTime;
  }

  @JsonProperty("entitlementTermID")
  public Optional<String> getEntitlementTermId() {
    return entitlementTermId;
  }

  @JsonProperty("externalBuyerID")
  public Optional<String> getExternalBuyerId() {
    return externalBuyerId;
  }

  @JsonProperty("externalID")
  public Optional<String> getExternalId() {
    return externalId;
  }

  @JsonProperty("externalProductID")
  public Optional<String> getExternalProductId() {
    return externalProductId;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("info")
  public Optional<SharedEntitlementInfo> getInfo() {
    return info;
  }

  @JsonProperty("lastUpdateTime")
  public Optional<String> getLastUpdateTime() {
    return lastUpdateTime;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("offerID")
  public Optional<String> getOfferId() {
    return offerId;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("partner")
  public Optional<SharedWorkloadEntitlementPartner> getPartner() {
    return partner;
  }

  @JsonProperty("productID")
  public Optional<String> getProductId() {
    return productId;
  }

  @JsonProperty("service")
  public Optional<SharedWorkloadEntitlementService> getService() {
    return service;
  }

  @JsonProperty("startTime")
  public Optional<String> getStartTime() {
    return startTime;
  }

  @JsonProperty("status")
  public Optional<SharedWorkloadEntitlementStatus> getStatus() {
    return status;
  }

  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedWorkloadEntitlement && equalTo((SharedWorkloadEntitlement) other);
  }

  private boolean equalTo(SharedWorkloadEntitlement other) {
    return buyerId.equals(other.buyerId) && creationTime.equals(other.creationTime) && endTime.equals(other.endTime) && entitlementTermId.equals(other.entitlementTermId) && externalBuyerId.equals(other.externalBuyerId) && externalId.equals(other.externalId) && externalProductId.equals(other.externalProductId) && id.equals(other.id) && info.equals(other.info) && lastUpdateTime.equals(other.lastUpdateTime) && name.equals(other.name) && offerId.equals(other.offerId) && organizationId.equals(other.organizationId) && partner.equals(other.partner) && productId.equals(other.productId) && service.equals(other.service) && startTime.equals(other.startTime) && status.equals(other.status) && type.equals(other.type);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.buyerId, this.creationTime, this.endTime, this.entitlementTermId, this.externalBuyerId, this.externalId, this.externalProductId, this.id, this.info, this.lastUpdateTime, this.name, this.offerId, this.organizationId, this.partner, this.productId, this.service, this.startTime, this.status, this.type);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedWorkloadEntitlement{" + "buyerId: " + buyerId + ", creationTime: " + creationTime + ", endTime: " + endTime + ", entitlementTermId: " + entitlementTermId + ", externalBuyerId: " + externalBuyerId + ", externalId: " + externalId + ", externalProductId: " + externalProductId + ", id: " + id + ", info: " + info + ", lastUpdateTime: " + lastUpdateTime + ", name: " + name + ", offerId: " + offerId + ", organizationId: " + organizationId + ", partner: " + partner + ", productId: " + productId + ", service: " + service + ", startTime: " + startTime + ", status: " + status + ", type: " + type + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> buyerId = Optional.empty();

    private Optional<String> creationTime = Optional.empty();

    private Optional<String> endTime = Optional.empty();

    private Optional<String> entitlementTermId = Optional.empty();

    private Optional<String> externalBuyerId = Optional.empty();

    private Optional<String> externalId = Optional.empty();

    private Optional<String> externalProductId = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<SharedEntitlementInfo> info = Optional.empty();

    private Optional<String> lastUpdateTime = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> offerId = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<SharedWorkloadEntitlementPartner> partner = Optional.empty();

    private Optional<String> productId = Optional.empty();

    private Optional<SharedWorkloadEntitlementService> service = Optional.empty();

    private Optional<String> startTime = Optional.empty();

    private Optional<SharedWorkloadEntitlementStatus> status = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedWorkloadEntitlement other) {
      buyerId(other.getBuyerId());
      creationTime(other.getCreationTime());
      endTime(other.getEndTime());
      entitlementTermId(other.getEntitlementTermId());
      externalBuyerId(other.getExternalBuyerId());
      externalId(other.getExternalId());
      externalProductId(other.getExternalProductId());
      id(other.getId());
      info(other.getInfo());
      lastUpdateTime(other.getLastUpdateTime());
      name(other.getName());
      offerId(other.getOfferId());
      organizationId(other.getOrganizationId());
      partner(other.getPartner());
      productId(other.getProductId());
      service(other.getService());
      startTime(other.getStartTime());
      status(other.getStatus());
      type(other.getType());
      return this;
    }

    @JsonSetter(
        value = "buyerID",
        nulls = Nulls.SKIP
    )
    public Builder buyerId(Optional<String> buyerId) {
      this.buyerId = buyerId;
      return this;
    }

    public Builder buyerId(String buyerId) {
      this.buyerId = Optional.of(buyerId);
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
        value = "endTime",
        nulls = Nulls.SKIP
    )
    public Builder endTime(Optional<String> endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder endTime(String endTime) {
      this.endTime = Optional.of(endTime);
      return this;
    }

    @JsonSetter(
        value = "entitlementTermID",
        nulls = Nulls.SKIP
    )
    public Builder entitlementTermId(Optional<String> entitlementTermId) {
      this.entitlementTermId = entitlementTermId;
      return this;
    }

    public Builder entitlementTermId(String entitlementTermId) {
      this.entitlementTermId = Optional.of(entitlementTermId);
      return this;
    }

    @JsonSetter(
        value = "externalBuyerID",
        nulls = Nulls.SKIP
    )
    public Builder externalBuyerId(Optional<String> externalBuyerId) {
      this.externalBuyerId = externalBuyerId;
      return this;
    }

    public Builder externalBuyerId(String externalBuyerId) {
      this.externalBuyerId = Optional.of(externalBuyerId);
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
        value = "externalProductID",
        nulls = Nulls.SKIP
    )
    public Builder externalProductId(Optional<String> externalProductId) {
      this.externalProductId = externalProductId;
      return this;
    }

    public Builder externalProductId(String externalProductId) {
      this.externalProductId = Optional.of(externalProductId);
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
    public Builder info(Optional<SharedEntitlementInfo> info) {
      this.info = info;
      return this;
    }

    public Builder info(SharedEntitlementInfo info) {
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
        value = "offerID",
        nulls = Nulls.SKIP
    )
    public Builder offerId(Optional<String> offerId) {
      this.offerId = offerId;
      return this;
    }

    public Builder offerId(String offerId) {
      this.offerId = Optional.of(offerId);
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
    public Builder partner(Optional<SharedWorkloadEntitlementPartner> partner) {
      this.partner = partner;
      return this;
    }

    public Builder partner(SharedWorkloadEntitlementPartner partner) {
      this.partner = Optional.of(partner);
      return this;
    }

    @JsonSetter(
        value = "productID",
        nulls = Nulls.SKIP
    )
    public Builder productId(Optional<String> productId) {
      this.productId = productId;
      return this;
    }

    public Builder productId(String productId) {
      this.productId = Optional.of(productId);
      return this;
    }

    @JsonSetter(
        value = "service",
        nulls = Nulls.SKIP
    )
    public Builder service(Optional<SharedWorkloadEntitlementService> service) {
      this.service = service;
      return this;
    }

    public Builder service(SharedWorkloadEntitlementService service) {
      this.service = Optional.of(service);
      return this;
    }

    @JsonSetter(
        value = "startTime",
        nulls = Nulls.SKIP
    )
    public Builder startTime(Optional<String> startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder startTime(String startTime) {
      this.startTime = Optional.of(startTime);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<SharedWorkloadEntitlementStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(SharedWorkloadEntitlementStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "type",
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

    public SharedWorkloadEntitlement build() {
      return new SharedWorkloadEntitlement(buyerId, creationTime, endTime, entitlementTermId, externalBuyerId, externalId, externalProductId, id, info, lastUpdateTime, name, offerId, organizationId, partner, productId, service, startTime, status, type);
    }
  }
}
