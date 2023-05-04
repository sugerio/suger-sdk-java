package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedMeteringUsageRecordGroup.Builder.class
)
public final class SharedMeteringUsageRecordGroup {
  private final Optional<String> creationTime;

  private final Optional<String> entitlementId;

  private final Optional<String> id;

  private final Optional<String> lastUpdateTime;

  private final Optional<SharedMeteringUsageRecordGroupMetaInfo> metaInfo;

  private final Optional<String> organizationId;

  private final Optional<Map<String, Optional<Double>>> records;

  private final Optional<Integer> serialId;

  private final Optional<String> status;

  private final Optional<String> usageRecordReportId;

  private int _cachedHashCode;

  SharedMeteringUsageRecordGroup(Optional<String> creationTime, Optional<String> entitlementId,
      Optional<String> id, Optional<String> lastUpdateTime,
      Optional<SharedMeteringUsageRecordGroupMetaInfo> metaInfo, Optional<String> organizationId,
      Optional<Map<String, Optional<Double>>> records, Optional<Integer> serialId,
      Optional<String> status, Optional<String> usageRecordReportId) {
    this.creationTime = creationTime;
    this.entitlementId = entitlementId;
    this.id = id;
    this.lastUpdateTime = lastUpdateTime;
    this.metaInfo = metaInfo;
    this.organizationId = organizationId;
    this.records = records;
    this.serialId = serialId;
    this.status = status;
    this.usageRecordReportId = usageRecordReportId;
  }

  @JsonProperty("creationTime")
  public Optional<String> getCreationTime() {
    return creationTime;
  }

  @JsonProperty("entitlementID")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("lastUpdateTime")
  public Optional<String> getLastUpdateTime() {
    return lastUpdateTime;
  }

  @JsonProperty("metaInfo")
  public Optional<SharedMeteringUsageRecordGroupMetaInfo> getMetaInfo() {
    return metaInfo;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("records")
  public Optional<Map<String, Optional<Double>>> getRecords() {
    return records;
  }

  @JsonProperty("serialID")
  public Optional<Integer> getSerialId() {
    return serialId;
  }

  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  @JsonProperty("usageRecordReportID")
  public Optional<String> getUsageRecordReportId() {
    return usageRecordReportId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedMeteringUsageRecordGroup && equalTo((SharedMeteringUsageRecordGroup) other);
  }

  private boolean equalTo(SharedMeteringUsageRecordGroup other) {
    return creationTime.equals(other.creationTime) && entitlementId.equals(other.entitlementId) && id.equals(other.id) && lastUpdateTime.equals(other.lastUpdateTime) && metaInfo.equals(other.metaInfo) && organizationId.equals(other.organizationId) && records.equals(other.records) && serialId.equals(other.serialId) && status.equals(other.status) && usageRecordReportId.equals(other.usageRecordReportId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.creationTime, this.entitlementId, this.id, this.lastUpdateTime, this.metaInfo, this.organizationId, this.records, this.serialId, this.status, this.usageRecordReportId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedMeteringUsageRecordGroup{" + "creationTime: " + creationTime + ", entitlementId: " + entitlementId + ", id: " + id + ", lastUpdateTime: " + lastUpdateTime + ", metaInfo: " + metaInfo + ", organizationId: " + organizationId + ", records: " + records + ", serialId: " + serialId + ", status: " + status + ", usageRecordReportId: " + usageRecordReportId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> creationTime = Optional.empty();

    private Optional<String> entitlementId = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> lastUpdateTime = Optional.empty();

    private Optional<SharedMeteringUsageRecordGroupMetaInfo> metaInfo = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<Map<String, Optional<Double>>> records = Optional.empty();

    private Optional<Integer> serialId = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<String> usageRecordReportId = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedMeteringUsageRecordGroup other) {
      creationTime(other.getCreationTime());
      entitlementId(other.getEntitlementId());
      id(other.getId());
      lastUpdateTime(other.getLastUpdateTime());
      metaInfo(other.getMetaInfo());
      organizationId(other.getOrganizationId());
      records(other.getRecords());
      serialId(other.getSerialId());
      status(other.getStatus());
      usageRecordReportId(other.getUsageRecordReportId());
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
        value = "metaInfo",
        nulls = Nulls.SKIP
    )
    public Builder metaInfo(Optional<SharedMeteringUsageRecordGroupMetaInfo> metaInfo) {
      this.metaInfo = metaInfo;
      return this;
    }

    public Builder metaInfo(SharedMeteringUsageRecordGroupMetaInfo metaInfo) {
      this.metaInfo = Optional.of(metaInfo);
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
        value = "records",
        nulls = Nulls.SKIP
    )
    public Builder records(Optional<Map<String, Optional<Double>>> records) {
      this.records = records;
      return this;
    }

    public Builder records(Map<String, Optional<Double>> records) {
      this.records = Optional.of(records);
      return this;
    }

    @JsonSetter(
        value = "serialID",
        nulls = Nulls.SKIP
    )
    public Builder serialId(Optional<Integer> serialId) {
      this.serialId = serialId;
      return this;
    }

    public Builder serialId(Integer serialId) {
      this.serialId = Optional.of(serialId);
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

    @JsonSetter(
        value = "usageRecordReportID",
        nulls = Nulls.SKIP
    )
    public Builder usageRecordReportId(Optional<String> usageRecordReportId) {
      this.usageRecordReportId = usageRecordReportId;
      return this;
    }

    public Builder usageRecordReportId(String usageRecordReportId) {
      this.usageRecordReportId = Optional.of(usageRecordReportId);
      return this;
    }

    public SharedMeteringUsageRecordGroup build() {
      return new SharedMeteringUsageRecordGroup(creationTime, entitlementId, id, lastUpdateTime, metaInfo, organizationId, records, serialId, status, usageRecordReportId);
    }
  }
}
