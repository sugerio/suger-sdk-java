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
    builder = SharedUsageReport.Builder.class
)
public final class SharedUsageReport {
  private final Optional<String> entitlementId;

  private final Optional<String> organizationId;

  private final Optional<String> reportDate;

  private final Optional<List<SharedEntitlementUsageRecord>> usageRecords;

  private int _cachedHashCode;

  SharedUsageReport(Optional<String> entitlementId, Optional<String> organizationId,
      Optional<String> reportDate, Optional<List<SharedEntitlementUsageRecord>> usageRecords) {
    this.entitlementId = entitlementId;
    this.organizationId = organizationId;
    this.reportDate = reportDate;
    this.usageRecords = usageRecords;
  }

  @JsonProperty("entitlementID")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("reportDate")
  public Optional<String> getReportDate() {
    return reportDate;
  }

  @JsonProperty("usageRecords")
  public Optional<List<SharedEntitlementUsageRecord>> getUsageRecords() {
    return usageRecords;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedUsageReport && equalTo((SharedUsageReport) other);
  }

  private boolean equalTo(SharedUsageReport other) {
    return entitlementId.equals(other.entitlementId) && organizationId.equals(other.organizationId) && reportDate.equals(other.reportDate) && usageRecords.equals(other.usageRecords);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.entitlementId, this.organizationId, this.reportDate, this.usageRecords);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedUsageReport{" + "entitlementId: " + entitlementId + ", organizationId: " + organizationId + ", reportDate: " + reportDate + ", usageRecords: " + usageRecords + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> entitlementId = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<String> reportDate = Optional.empty();

    private Optional<List<SharedEntitlementUsageRecord>> usageRecords = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedUsageReport other) {
      entitlementId(other.getEntitlementId());
      organizationId(other.getOrganizationId());
      reportDate(other.getReportDate());
      usageRecords(other.getUsageRecords());
      return this;
    }

    @JsonSetter(
        value = "entitlementID",
        nulls = Nulls.SKIP
    )
    public Builder entitlementId(Optional<String> entitlementId) {
      this.entitlementId = entitlementId;
      return this;
    }

    public Builder entitlementId(String entitlementId) {
      this.entitlementId = Optional.of(entitlementId);
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
        value = "reportDate",
        nulls = Nulls.SKIP
    )
    public Builder reportDate(Optional<String> reportDate) {
      this.reportDate = reportDate;
      return this;
    }

    public Builder reportDate(String reportDate) {
      this.reportDate = Optional.of(reportDate);
      return this;
    }

    @JsonSetter(
        value = "usageRecords",
        nulls = Nulls.SKIP
    )
    public Builder usageRecords(Optional<List<SharedEntitlementUsageRecord>> usageRecords) {
      this.usageRecords = usageRecords;
      return this;
    }

    public Builder usageRecords(List<SharedEntitlementUsageRecord> usageRecords) {
      this.usageRecords = Optional.of(usageRecords);
      return this;
    }

    public SharedUsageReport build() {
      return new SharedUsageReport(entitlementId, organizationId, reportDate, usageRecords);
    }
  }
}
