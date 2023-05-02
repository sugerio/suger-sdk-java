package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedMeteringUsageRecordGroupMetaInfo.Builder.class
)
public final class SharedMeteringUsageRecordGroupMetaInfo {
  private final Optional<Map<String, Optional<Double>>> originRecords;

  private int _cachedHashCode;

  SharedMeteringUsageRecordGroupMetaInfo(Optional<Map<String, Optional<Double>>> originRecords) {
    this.originRecords = originRecords;
  }

  /**
   * @return The original records reported by the customer before convertion. If no dimension mapping is applied, this field is the same as the records field.
   */
  @JsonProperty("originRecords")
  public Optional<Map<String, Optional<Double>>> getOriginRecords() {
    return originRecords;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedMeteringUsageRecordGroupMetaInfo && equalTo((SharedMeteringUsageRecordGroupMetaInfo) other);
  }

  private boolean equalTo(SharedMeteringUsageRecordGroupMetaInfo other) {
    return originRecords.equals(other.originRecords);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.originRecords);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedMeteringUsageRecordGroupMetaInfo{" + "originRecords: " + originRecords + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Map<String, Optional<Double>>> originRecords = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedMeteringUsageRecordGroupMetaInfo other) {
      originRecords(other.getOriginRecords());
      return this;
    }

    @JsonSetter(
        value = "originRecords",
        nulls = Nulls.SKIP
    )
    public Builder originRecords(Optional<Map<String, Optional<Double>>> originRecords) {
      this.originRecords = originRecords;
      return this;
    }

    public Builder originRecords(Map<String, Optional<Double>> originRecords) {
      this.originRecords = Optional.of(originRecords);
      return this;
    }

    public SharedMeteringUsageRecordGroupMetaInfo build() {
      return new SharedMeteringUsageRecordGroupMetaInfo(originRecords);
    }
  }
}
