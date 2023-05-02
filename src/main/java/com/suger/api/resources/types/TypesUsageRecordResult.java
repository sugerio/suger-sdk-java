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
    builder = TypesUsageRecordResult.Builder.class
)
public final class TypesUsageRecordResult {
  private final Optional<String> meteringRecordId;

  private final Optional<TypesUsageRecordResultStatus> status;

  private final Optional<TypesUsageRecord> usageRecord;

  private int _cachedHashCode;

  TypesUsageRecordResult(Optional<String> meteringRecordId,
      Optional<TypesUsageRecordResultStatus> status, Optional<TypesUsageRecord> usageRecord) {
    this.meteringRecordId = meteringRecordId;
    this.status = status;
    this.usageRecord = usageRecord;
  }

  /**
   * @return The MeteringRecordId is a unique identifier for this metering event.
   */
  @JsonProperty("meteringRecordId")
  public Optional<String> getMeteringRecordId() {
    return meteringRecordId;
  }

  /**
   * @return The UsageRecordResultStatus indicates the status of an individual UsageRecord
   * processed by BatchMeterUsage.
   * <ul>
   * <li>
   * <p>Success- The UsageRecord was accepted and
   * honored by BatchMeterUsage.</p>
   * </li>
   * <li>
   * <p>CustomerNotSubscribed- The CustomerIdentifier
   * specified is not able to use your product. The UsageRecord was not honored.
   * There are three causes for this result:</p>
   * </li>
   * <li>
   * <p>The customer identifier is
   * invalid.</p>
   * </li>
   * <li>
   * <p>The customer identifier provided in the metering record does not
   * have an active agreement or subscription with this product. Future UsageRecords
   * for this customer will fail until the customer subscribes to your product.</p>
   * </li>
   * <li></li>
   * </ul>
   * <p>The customer's AWS account was suspended.</p>
   * <ul>
   * <li>DuplicateRecord- Indicates that the
   * UsageRecord was invalid and not honored. A previously metered UsageRecord had
   * the same customer, dimension, and time, but a different quantity.</li>
   * </ul>
   */
  @JsonProperty("status")
  public Optional<TypesUsageRecordResultStatus> getStatus() {
    return status;
  }

  /**
   * @return The UsageRecord that was part of the BatchMeterUsage request.
   */
  @JsonProperty("usageRecord")
  public Optional<TypesUsageRecord> getUsageRecord() {
    return usageRecord;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TypesUsageRecordResult && equalTo((TypesUsageRecordResult) other);
  }

  private boolean equalTo(TypesUsageRecordResult other) {
    return meteringRecordId.equals(other.meteringRecordId) && status.equals(other.status) && usageRecord.equals(other.usageRecord);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.meteringRecordId, this.status, this.usageRecord);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TypesUsageRecordResult{" + "meteringRecordId: " + meteringRecordId + ", status: " + status + ", usageRecord: " + usageRecord + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> meteringRecordId = Optional.empty();

    private Optional<TypesUsageRecordResultStatus> status = Optional.empty();

    private Optional<TypesUsageRecord> usageRecord = Optional.empty();

    private Builder() {
    }

    public Builder from(TypesUsageRecordResult other) {
      meteringRecordId(other.getMeteringRecordId());
      status(other.getStatus());
      usageRecord(other.getUsageRecord());
      return this;
    }

    @JsonSetter(
        value = "meteringRecordId",
        nulls = Nulls.SKIP
    )
    public Builder meteringRecordId(Optional<String> meteringRecordId) {
      this.meteringRecordId = meteringRecordId;
      return this;
    }

    public Builder meteringRecordId(String meteringRecordId) {
      this.meteringRecordId = Optional.of(meteringRecordId);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<TypesUsageRecordResultStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(TypesUsageRecordResultStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "usageRecord",
        nulls = Nulls.SKIP
    )
    public Builder usageRecord(Optional<TypesUsageRecord> usageRecord) {
      this.usageRecord = usageRecord;
      return this;
    }

    public Builder usageRecord(TypesUsageRecord usageRecord) {
      this.usageRecord = Optional.of(usageRecord);
      return this;
    }

    public TypesUsageRecordResult build() {
      return new TypesUsageRecordResult(meteringRecordId, status, usageRecord);
    }
  }
}
