package com.suger.api.resources.integration.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.suger.api.types.SharedIntegrationInfo;
import com.suger.api.types.SharedUpdateIntegrationParamsPartner;
import com.suger.api.types.SharedUpdateIntegrationParamsService;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = SharedUpdateIntegrationParams.Builder.class
)
public final class SharedUpdateIntegrationParams {
  private final SharedIntegrationInfo info;

  private final String organizationId;

  private final SharedUpdateIntegrationParamsPartner partner;

  private final SharedUpdateIntegrationParamsService service;

  private int _cachedHashCode;

  SharedUpdateIntegrationParams(SharedIntegrationInfo info, String organizationId,
      SharedUpdateIntegrationParamsPartner partner, SharedUpdateIntegrationParamsService service) {
    this.info = info;
    this.organizationId = organizationId;
    this.partner = partner;
    this.service = service;
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
  public SharedUpdateIntegrationParamsPartner getPartner() {
    return partner;
  }

  @JsonProperty("service")
  public SharedUpdateIntegrationParamsService getService() {
    return service;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedUpdateIntegrationParams && equalTo((SharedUpdateIntegrationParams) other);
  }

  private boolean equalTo(SharedUpdateIntegrationParams other) {
    return info.equals(other.info) && organizationId.equals(other.organizationId) && partner.equals(other.partner) && service.equals(other.service);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.info, this.organizationId, this.partner, this.service);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedUpdateIntegrationParams{" + "info: " + info + ", organizationId: " + organizationId + ", partner: " + partner + ", service: " + service + "}";
  }

  public static InfoStage builder() {
    return new Builder();
  }

  public interface InfoStage {
    OrganizationIdStage info(SharedIntegrationInfo info);

    Builder from(SharedUpdateIntegrationParams other);
  }

  public interface OrganizationIdStage {
    PartnerStage organizationId(String organizationId);
  }

  public interface PartnerStage {
    ServiceStage partner(SharedUpdateIntegrationParamsPartner partner);
  }

  public interface ServiceStage {
    _FinalStage service(SharedUpdateIntegrationParamsService service);
  }

  public interface _FinalStage {
    SharedUpdateIntegrationParams build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements InfoStage, OrganizationIdStage, PartnerStage, ServiceStage, _FinalStage {
    private SharedIntegrationInfo info;

    private String organizationId;

    private SharedUpdateIntegrationParamsPartner partner;

    private SharedUpdateIntegrationParamsService service;

    private Builder() {
    }

    @Override
    public Builder from(SharedUpdateIntegrationParams other) {
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
    public ServiceStage partner(SharedUpdateIntegrationParamsPartner partner) {
      this.partner = partner;
      return this;
    }

    @Override
    @JsonSetter("service")
    public _FinalStage service(SharedUpdateIntegrationParamsService service) {
      this.service = service;
      return this;
    }

    @Override
    public SharedUpdateIntegrationParams build() {
      return new SharedUpdateIntegrationParams(info, organizationId, partner, service);
    }
  }
}
