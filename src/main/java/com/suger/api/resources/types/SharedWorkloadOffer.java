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
    builder = SharedWorkloadOffer.Builder.class
)
public final class SharedWorkloadOffer {
  private final Optional<String> createdBy;

  private final Optional<String> creationTime;

  private final Optional<String> endTime;

  private final Optional<String> expireTime;

  private final Optional<String> externalId;

  private final Optional<String> id;

  private final Optional<SharedOfferInfo> info;

  private final Optional<String> lastUpdateTime;

  private final Optional<String> lastUpdatedBy;

  private final Optional<SharedOfferMetaInfo> metaInfo;

  private final Optional<String> name;

  private final Optional<SharedWorkloadOfferOfferType> offerType;

  private final Optional<String> organizationId;

  private final Optional<SharedWorkloadOfferPartner> partner;

  private final Optional<String> productId;

  private final Optional<SharedWorkloadOfferService> service;

  private final Optional<SharedWorkloadOfferStatus> status;

  private int _cachedHashCode;

  SharedWorkloadOffer(Optional<String> createdBy, Optional<String> creationTime,
      Optional<String> endTime, Optional<String> expireTime, Optional<String> externalId,
      Optional<String> id, Optional<SharedOfferInfo> info, Optional<String> lastUpdateTime,
      Optional<String> lastUpdatedBy, Optional<SharedOfferMetaInfo> metaInfo, Optional<String> name,
      Optional<SharedWorkloadOfferOfferType> offerType, Optional<String> organizationId,
      Optional<SharedWorkloadOfferPartner> partner, Optional<String> productId,
      Optional<SharedWorkloadOfferService> service, Optional<SharedWorkloadOfferStatus> status) {
    this.createdBy = createdBy;
    this.creationTime = creationTime;
    this.endTime = endTime;
    this.expireTime = expireTime;
    this.externalId = externalId;
    this.id = id;
    this.info = info;
    this.lastUpdateTime = lastUpdateTime;
    this.lastUpdatedBy = lastUpdatedBy;
    this.metaInfo = metaInfo;
    this.name = name;
    this.offerType = offerType;
    this.organizationId = organizationId;
    this.partner = partner;
    this.productId = productId;
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

  /**
   * @return nullable
   */
  @JsonProperty("endTime")
  public Optional<String> getEndTime() {
    return endTime;
  }

  /**
   * @return nullable
   */
  @JsonProperty("expireTime")
  public Optional<String> getExpireTime() {
    return expireTime;
  }

  @JsonProperty("externalID")
  public Optional<String> getExternalId() {
    return externalId;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("info")
  public Optional<SharedOfferInfo> getInfo() {
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

  @JsonProperty("metaInfo")
  public Optional<SharedOfferMetaInfo> getMetaInfo() {
    return metaInfo;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("offerType")
  public Optional<SharedWorkloadOfferOfferType> getOfferType() {
    return offerType;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("partner")
  public Optional<SharedWorkloadOfferPartner> getPartner() {
    return partner;
  }

  @JsonProperty("productID")
  public Optional<String> getProductId() {
    return productId;
  }

  @JsonProperty("service")
  public Optional<SharedWorkloadOfferService> getService() {
    return service;
  }

  @JsonProperty("status")
  public Optional<SharedWorkloadOfferStatus> getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedWorkloadOffer && equalTo((SharedWorkloadOffer) other);
  }

  private boolean equalTo(SharedWorkloadOffer other) {
    return createdBy.equals(other.createdBy) && creationTime.equals(other.creationTime) && endTime.equals(other.endTime) && expireTime.equals(other.expireTime) && externalId.equals(other.externalId) && id.equals(other.id) && info.equals(other.info) && lastUpdateTime.equals(other.lastUpdateTime) && lastUpdatedBy.equals(other.lastUpdatedBy) && metaInfo.equals(other.metaInfo) && name.equals(other.name) && offerType.equals(other.offerType) && organizationId.equals(other.organizationId) && partner.equals(other.partner) && productId.equals(other.productId) && service.equals(other.service) && status.equals(other.status);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.createdBy, this.creationTime, this.endTime, this.expireTime, this.externalId, this.id, this.info, this.lastUpdateTime, this.lastUpdatedBy, this.metaInfo, this.name, this.offerType, this.organizationId, this.partner, this.productId, this.service, this.status);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedWorkloadOffer{" + "createdBy: " + createdBy + ", creationTime: " + creationTime + ", endTime: " + endTime + ", expireTime: " + expireTime + ", externalId: " + externalId + ", id: " + id + ", info: " + info + ", lastUpdateTime: " + lastUpdateTime + ", lastUpdatedBy: " + lastUpdatedBy + ", metaInfo: " + metaInfo + ", name: " + name + ", offerType: " + offerType + ", organizationId: " + organizationId + ", partner: " + partner + ", productId: " + productId + ", service: " + service + ", status: " + status + "}";
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

    private Optional<String> endTime = Optional.empty();

    private Optional<String> expireTime = Optional.empty();

    private Optional<String> externalId = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<SharedOfferInfo> info = Optional.empty();

    private Optional<String> lastUpdateTime = Optional.empty();

    private Optional<String> lastUpdatedBy = Optional.empty();

    private Optional<SharedOfferMetaInfo> metaInfo = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<SharedWorkloadOfferOfferType> offerType = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<SharedWorkloadOfferPartner> partner = Optional.empty();

    private Optional<String> productId = Optional.empty();

    private Optional<SharedWorkloadOfferService> service = Optional.empty();

    private Optional<SharedWorkloadOfferStatus> status = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedWorkloadOffer other) {
      createdBy(other.getCreatedBy());
      creationTime(other.getCreationTime());
      endTime(other.getEndTime());
      expireTime(other.getExpireTime());
      externalId(other.getExternalId());
      id(other.getId());
      info(other.getInfo());
      lastUpdateTime(other.getLastUpdateTime());
      lastUpdatedBy(other.getLastUpdatedBy());
      metaInfo(other.getMetaInfo());
      name(other.getName());
      offerType(other.getOfferType());
      organizationId(other.getOrganizationId());
      partner(other.getPartner());
      productId(other.getProductId());
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
        value = "expireTime",
        nulls = Nulls.SKIP
    )
    public Builder expireTime(Optional<String> expireTime) {
      this.expireTime = expireTime;
      return this;
    }

    public Builder expireTime(String expireTime) {
      this.expireTime = Optional.of(expireTime);
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
    public Builder info(Optional<SharedOfferInfo> info) {
      this.info = info;
      return this;
    }

    public Builder info(SharedOfferInfo info) {
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
        value = "metaInfo",
        nulls = Nulls.SKIP
    )
    public Builder metaInfo(Optional<SharedOfferMetaInfo> metaInfo) {
      this.metaInfo = metaInfo;
      return this;
    }

    public Builder metaInfo(SharedOfferMetaInfo metaInfo) {
      this.metaInfo = Optional.of(metaInfo);
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
        value = "offerType",
        nulls = Nulls.SKIP
    )
    public Builder offerType(Optional<SharedWorkloadOfferOfferType> offerType) {
      this.offerType = offerType;
      return this;
    }

    public Builder offerType(SharedWorkloadOfferOfferType offerType) {
      this.offerType = Optional.of(offerType);
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
    public Builder partner(Optional<SharedWorkloadOfferPartner> partner) {
      this.partner = partner;
      return this;
    }

    public Builder partner(SharedWorkloadOfferPartner partner) {
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
    public Builder service(Optional<SharedWorkloadOfferService> service) {
      this.service = service;
      return this;
    }

    public Builder service(SharedWorkloadOfferService service) {
      this.service = Optional.of(service);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<SharedWorkloadOfferStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(SharedWorkloadOfferStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    public SharedWorkloadOffer build() {
      return new SharedWorkloadOffer(createdBy, creationTime, endTime, expireTime, externalId, id, info, lastUpdateTime, lastUpdatedBy, metaInfo, name, offerType, organizationId, partner, productId, service, status);
    }
  }
}
