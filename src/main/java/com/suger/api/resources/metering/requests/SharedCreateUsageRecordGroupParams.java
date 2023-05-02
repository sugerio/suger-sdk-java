package com.suger.api.resources.metering.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.suger.api.resources.types.SharedMeteringUsageRecordGroupMetaInfo;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedCreateUsageRecordGroupParams.Builder.class
)
public final class SharedCreateUsageRecordGroupParams {
  private final String entitlementId;

  private final Optional<String> id;

  private final Optional<SharedMeteringUsageRecordGroupMetaInfo> metaInfo;

  private final String organizationId;

  private final Map<String, Double> records;

  private int _cachedHashCode;

  SharedCreateUsageRecordGroupParams(String entitlementId, Optional<String> id,
      Optional<SharedMeteringUsageRecordGroupMetaInfo> metaInfo, String organizationId,
      Map<String, Double> records) {
    this.entitlementId = entitlementId;
    this.id = id;
    this.metaInfo = metaInfo;
    this.organizationId = organizationId;
    this.records = records;
  }

  @JsonProperty("entitlementID")
  public String getEntitlementId() {
    return entitlementId;
  }

  /**
   * @return uuid of the UsageRecordGroup (the size is up to 36 characters), if not provided, suger will generate one.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return read-only, don't set it when reporting the usage record group.
   */
  @JsonProperty("metaInfo")
  public Optional<SharedMeteringUsageRecordGroupMetaInfo> getMetaInfo() {
    return metaInfo;
  }

  @JsonProperty("organizationID")
  public String getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("records")
  public Map<String, Double> getRecords() {
    return records;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedCreateUsageRecordGroupParams && equalTo((SharedCreateUsageRecordGroupParams) other);
  }

  private boolean equalTo(SharedCreateUsageRecordGroupParams other) {
    return entitlementId.equals(other.entitlementId) && id.equals(other.id) && metaInfo.equals(other.metaInfo) && organizationId.equals(other.organizationId) && records.equals(other.records);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.entitlementId, this.id, this.metaInfo, this.organizationId, this.records);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedCreateUsageRecordGroupParams{" + "entitlementId: " + entitlementId + ", id: " + id + ", metaInfo: " + metaInfo + ", organizationId: " + organizationId + ", records: " + records + "}";
  }

  public static EntitlementIdStage builder() {
    return new Builder();
  }

  public interface EntitlementIdStage {
    OrganizationIdStage entitlementId(String entitlementId);

    Builder from(SharedCreateUsageRecordGroupParams other);
  }

  public interface OrganizationIdStage {
    _FinalStage organizationId(String organizationId);
  }

  public interface _FinalStage {
    SharedCreateUsageRecordGroupParams build();

    _FinalStage id(Optional<String> id);

    _FinalStage id(String id);

    _FinalStage metaInfo(Optional<SharedMeteringUsageRecordGroupMetaInfo> metaInfo);

    _FinalStage metaInfo(SharedMeteringUsageRecordGroupMetaInfo metaInfo);

    _FinalStage records(Map<String, Double> records);

    _FinalStage putAllRecords(Map<String, Double> records);

    _FinalStage records(String key, Double value);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements EntitlementIdStage, OrganizationIdStage, _FinalStage {
    private String entitlementId;

    private String organizationId;

    private Map<String, Double> records = new LinkedHashMap<>();

    private Optional<SharedMeteringUsageRecordGroupMetaInfo> metaInfo = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(SharedCreateUsageRecordGroupParams other) {
      entitlementId(other.getEntitlementId());
      id(other.getId());
      metaInfo(other.getMetaInfo());
      organizationId(other.getOrganizationId());
      records(other.getRecords());
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
    public _FinalStage records(String key, Double value) {
      this.records.put(key, value);
      return this;
    }

    @Override
    public _FinalStage putAllRecords(Map<String, Double> records) {
      this.records.putAll(records);
      return this;
    }

    @Override
    @JsonSetter(
        value = "records",
        nulls = Nulls.SKIP
    )
    public _FinalStage records(Map<String, Double> records) {
      this.records.clear();
      this.records.putAll(records);
      return this;
    }

    /**
     * <p>read-only, don't set it when reporting the usage record group.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage metaInfo(SharedMeteringUsageRecordGroupMetaInfo metaInfo) {
      this.metaInfo = Optional.of(metaInfo);
      return this;
    }

    @Override
    @JsonSetter(
        value = "metaInfo",
        nulls = Nulls.SKIP
    )
    public _FinalStage metaInfo(Optional<SharedMeteringUsageRecordGroupMetaInfo> metaInfo) {
      this.metaInfo = metaInfo;
      return this;
    }

    /**
     * <p>uuid of the UsageRecordGroup (the size is up to 36 characters), if not provided, suger will generate one.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    @Override
    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public _FinalStage id(Optional<String> id) {
      this.id = id;
      return this;
    }

    @Override
    public SharedCreateUsageRecordGroupParams build() {
      return new SharedCreateUsageRecordGroupParams(entitlementId, id, metaInfo, organizationId, records);
    }
  }
}
