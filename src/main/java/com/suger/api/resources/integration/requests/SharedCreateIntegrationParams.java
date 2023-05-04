package com.suger.api.resources.integration.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.suger.api.types.SharedCreateIntegrationParamsPartner;
import com.suger.api.types.SharedCreateIntegrationParamsService;
import com.suger.api.types.SharedIntegrationInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedCreateIntegrationParams.Builder.class
)
public final class SharedCreateIntegrationParams {
  private final Optional<String> createdBy;

  private final SharedIntegrationInfo info;

  private final String organizationId;

  private final SharedCreateIntegrationParamsPartner partner;

  private final SharedCreateIntegrationParamsService service;

  private int _cachedHashCode;

  SharedCreateIntegrationParams(Optional<String> createdBy, SharedIntegrationInfo info,
      String organizationId, SharedCreateIntegrationParamsPartner partner,
      SharedCreateIntegrationParamsService service) {
    this.createdBy = createdBy;
    this.info = info;
    this.organizationId = organizationId;
    this.partner = partner;
    this.service = service;
  }

  @JsonProperty("createdBy")
  public Optional<String> getCreatedBy() {
    return createdBy;
  }

  @JsonProperty("info")
  public SharedIntegrationInfo getInfo() {
    return info;
  }

  @JsonProperty("organizationID")
  public String getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("partner")
  public SharedCreateIntegrationParamsPartner getPartner() {
    return partner;
  }

  @JsonProperty("service")
  public SharedCreateIntegrationParamsService getService() {
    return service;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedCreateIntegrationParams && equalTo((SharedCreateIntegrationParams) other);
  }

  private boolean equalTo(SharedCreateIntegrationParams other) {
    return createdBy.equals(other.createdBy) && info.equals(other.info) && organizationId.equals(other.organizationId) && partner.equals(other.partner) && service.equals(other.service);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.createdBy, this.info, this.organizationId, this.partner, this.service);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedCreateIntegrationParams{" + "createdBy: " + createdBy + ", info: " + info + ", organizationId: " + organizationId + ", partner: " + partner + ", service: " + service + "}";
  }

  public static InfoStage builder() {
    return new Builder();
  }

  public interface InfoStage {
    OrganizationIdStage info(SharedIntegrationInfo info);

    Builder from(SharedCreateIntegrationParams other);
  }

  public interface OrganizationIdStage {
    PartnerStage organizationId(String organizationId);
  }

  public interface PartnerStage {
    ServiceStage partner(SharedCreateIntegrationParamsPartner partner);
  }

  public interface ServiceStage {
    _FinalStage service(SharedCreateIntegrationParamsService service);
  }

  public interface _FinalStage {
    SharedCreateIntegrationParams build();

    _FinalStage createdBy(Optional<String> createdBy);

    _FinalStage createdBy(String createdBy);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements InfoStage, OrganizationIdStage, PartnerStage, ServiceStage, _FinalStage {
    private SharedIntegrationInfo info;

    private String organizationId;

    private SharedCreateIntegrationParamsPartner partner;

    private SharedCreateIntegrationParamsService service;

    private Optional<String> createdBy = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(SharedCreateIntegrationParams other) {
      createdBy(other.getCreatedBy());
      info(other.getInfo());
      organizationId(other.getOrganizationId());
      partner(other.getPartner());
      service(other.getService());
      return this;
    }

    @Override
    @JsonSetter("info")
    public OrganizationIdStage info(SharedIntegrationInfo info) {
      this.info = info;
      return this;
    }

    @Override
    @JsonSetter("organizationID")
    public PartnerStage organizationId(String organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    @Override
    @JsonSetter("partner")
    public ServiceStage partner(SharedCreateIntegrationParamsPartner partner) {
      this.partner = partner;
      return this;
    }

    @Override
    @JsonSetter("service")
    public _FinalStage service(SharedCreateIntegrationParamsService service) {
      this.service = service;
      return this;
    }

    @Override
    public _FinalStage createdBy(String createdBy) {
      this.createdBy = Optional.of(createdBy);
      return this;
    }

    @Override
    @JsonSetter(
        value = "createdBy",
        nulls = Nulls.SKIP
    )
    public _FinalStage createdBy(Optional<String> createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    @Override
    public SharedCreateIntegrationParams build() {
      return new SharedCreateIntegrationParams(createdBy, info, organizationId, partner, service);
    }
  }
}
