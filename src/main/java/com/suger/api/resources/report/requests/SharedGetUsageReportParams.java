package com.suger.api.resources.report.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = SharedGetUsageReportParams.Builder.class
)
public final class SharedGetUsageReportParams {
  private final String entitlementId;

  private final String organizationId;

  private int _cachedHashCode;

  SharedGetUsageReportParams(String entitlementId, String organizationId) {
    this.entitlementId = entitlementId;
    this.organizationId = organizationId;
  }

  @JsonProperty("entitlementID")
  public String getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("organizationID")
  public String getOrganizationId() {
    return organizationId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGetUsageReportParams && equalTo((SharedGetUsageReportParams) other);
  }

  private boolean equalTo(SharedGetUsageReportParams other) {
    return entitlementId.equals(other.entitlementId) && organizationId.equals(other.organizationId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.entitlementId, this.organizationId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGetUsageReportParams{" + "entitlementId: " + entitlementId + ", organizationId: " + organizationId + "}";
  }

  public static EntitlementIdStage builder() {
    return new Builder();
  }

  public interface EntitlementIdStage {
    OrganizationIdStage entitlementId(String entitlementId);

    Builder from(SharedGetUsageReportParams other);
  }

  public interface OrganizationIdStage {
    _FinalStage organizationId(String organizationId);
  }

  public interface _FinalStage {
    SharedGetUsageReportParams build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements EntitlementIdStage, OrganizationIdStage, _FinalStage {
    private String entitlementId;

    private String organizationId;

    private Builder() {
    }

    @Override
    public Builder from(SharedGetUsageReportParams other) {
      entitlementId(other.getEntitlementId());
      organizationId(other.getOrganizationId());
      return this;
    }

    @Override
    @JsonSetter("entitlementID")
    public OrganizationIdStage entitlementId(String entitlementId) {
      this.entitlementId = entitlementId;
      return this;
    }

    @Override
    @JsonSetter("organizationID")
    public _FinalStage organizationId(String organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    @Override
    public SharedGetUsageReportParams build() {
      return new SharedGetUsageReportParams(entitlementId, organizationId);
    }
  }
}
