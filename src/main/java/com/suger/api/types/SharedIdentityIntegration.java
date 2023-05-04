package com.suger.api.types;

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
    builder = SharedIdentityIntegration.Builder.class
)
public final class SharedIdentityIntegration {
  private final Optional<String> createdBy;

  private final Optional<String> creationTime;

  private final Optional<SharedIntegrationInfo> info;

  private final Optional<String> lastUpdateTime;

  private final Optional<String> lastUpdatedBy;

  private final Optional<String> organizationId;

  private final Optional<SharedIdentityIntegrationPartner> partner;

  private final Optional<SharedIdentityIntegrationService> service;

  private final Optional<SharedIdentityIntegrationStatus> status;

  private int _cachedHashCode;

  SharedIdentityIntegration(Optional<String> createdBy, Optional<String> creationTime,
      Optional<SharedIntegrationInfo> info, Optional<String> lastUpdateTime,
      Optional<String> lastUpdatedBy, Optional<String> organizationId,
      Optional<SharedIdentityIntegrationPartner> partner,
      Optional<SharedIdentityIntegrationService> service,
      Optional<SharedIdentityIntegrationStatus> status) {
    this.createdBy = createdBy;
    this.creationTime = creationTime;
    this.info = info;
    this.lastUpdateTime = lastUpdateTime;
    this.lastUpdatedBy = lastUpdatedBy;
    this.organizationId = organizationId;
    this.partner = partner;
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

  @JsonProperty("info")
  public Optional<SharedIntegrationInfo> getInfo() {
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

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("partner")
  public Optional<SharedIdentityIntegrationPartner> getPartner() {
    return partner;
  }

  @JsonProperty("service")
  public Optional<SharedIdentityIntegrationService> getService() {
    return service;
  }

  @JsonProperty("status")
  public Optional<SharedIdentityIntegrationStatus> getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedIdentityIntegration && equalTo((SharedIdentityIntegration) other);
  }

  private boolean equalTo(SharedIdentityIntegration other) {
    return createdBy.equals(other.createdBy) && creationTime.equals(other.creationTime) && info.equals(other.info) && lastUpdateTime.equals(other.lastUpdateTime) && lastUpdatedBy.equals(other.lastUpdatedBy) && organizationId.equals(other.organizationId) && partner.equals(other.partner) && service.equals(other.service) && status.equals(other.status);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.createdBy, this.creationTime, this.info, this.lastUpdateTime, this.lastUpdatedBy, this.organizationId, this.partner, this.service, this.status);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedIdentityIntegration{" + "createdBy: " + createdBy + ", creationTime: " + creationTime + ", info: " + info + ", lastUpdateTime: " + lastUpdateTime + ", lastUpdatedBy: " + lastUpdatedBy + ", organizationId: " + organizationId + ", partner: " + partner + ", service: " + service + ", status: " + status + "}";
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

    private Optional<SharedIntegrationInfo> info = Optional.empty();

    private Optional<String> lastUpdateTime = Optional.empty();

    private Optional<String> lastUpdatedBy = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<SharedIdentityIntegrationPartner> partner = Optional.empty();

    private Optional<SharedIdentityIntegrationService> service = Optional.empty();

    private Optional<SharedIdentityIntegrationStatus> status = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedIdentityIntegration other) {
      createdBy(other.getCreatedBy());
      creationTime(other.getCreationTime());
      info(other.getInfo());
      lastUpdateTime(other.getLastUpdateTime());
      lastUpdatedBy(other.getLastUpdatedBy());
      organizationId(other.getOrganizationId());
      partner(other.getPartner());
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
        value = "info",
        nulls = Nulls.SKIP
    )
    public Builder info(Optional<SharedIntegrationInfo> info) {
      this.info = info;
      return this;
    }

    public Builder info(SharedIntegrationInfo info) {
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
    public Builder partner(Optional<SharedIdentityIntegrationPartner> partner) {
      this.partner = partner;
      return this;
    }

    public Builder partner(SharedIdentityIntegrationPartner partner) {
      this.partner = Optional.of(partner);
      return this;
    }

    @JsonSetter(
        value = "service",
        nulls = Nulls.SKIP
    )
    public Builder service(Optional<SharedIdentityIntegrationService> service) {
      this.service = service;
      return this;
    }

    public Builder service(SharedIdentityIntegrationService service) {
      this.service = Optional.of(service);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<SharedIdentityIntegrationStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(SharedIdentityIntegrationStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    public SharedIdentityIntegration build() {
      return new SharedIdentityIntegration(createdBy, creationTime, info, lastUpdateTime, lastUpdatedBy, organizationId, partner, service, status);
    }
  }
}
