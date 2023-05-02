package com.suger.api.resources.metering.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = ListUsageRecordReportsByEntitlementRequest.Builder.class
)
public final class ListUsageRecordReportsByEntitlementRequest {
  private final Optional<String> entitlementTermId;

  private final Optional<String> startDate;

  private final Optional<String> endDate;

  private final Optional<Integer> limit;

  private final Optional<Integer> offset;

  private int _cachedHashCode;

  ListUsageRecordReportsByEntitlementRequest(Optional<String> entitlementTermId,
      Optional<String> startDate, Optional<String> endDate, Optional<Integer> limit,
      Optional<Integer> offset) {
    this.entitlementTermId = entitlementTermId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.limit = limit;
    this.offset = offset;
  }

  @JsonProperty("entitlementTermId")
  public Optional<String> getEntitlementTermId() {
    return entitlementTermId;
  }

  @JsonProperty("startDate")
  public Optional<String> getStartDate() {
    return startDate;
  }

  @JsonProperty("endDate")
  public Optional<String> getEndDate() {
    return endDate;
  }

  @JsonProperty("limit")
  public Optional<Integer> getLimit() {
    return limit;
  }

  @JsonProperty("offset")
  public Optional<Integer> getOffset() {
    return offset;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListUsageRecordReportsByEntitlementRequest && equalTo((ListUsageRecordReportsByEntitlementRequest) other);
  }

  private boolean equalTo(ListUsageRecordReportsByEntitlementRequest other) {
    return entitlementTermId.equals(other.entitlementTermId) && startDate.equals(other.startDate) && endDate.equals(other.endDate) && limit.equals(other.limit) && offset.equals(other.offset);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.entitlementTermId, this.startDate, this.endDate, this.limit, this.offset);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListUsageRecordReportsByEntitlementRequest{" + "entitlementTermId: " + entitlementTermId + ", startDate: " + startDate + ", endDate: " + endDate + ", limit: " + limit + ", offset: " + offset + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> entitlementTermId = Optional.empty();

    private Optional<String> startDate = Optional.empty();

    private Optional<String> endDate = Optional.empty();

    private Optional<Integer> limit = Optional.empty();

    private Optional<Integer> offset = Optional.empty();

    private Builder() {
    }

    public Builder from(ListUsageRecordReportsByEntitlementRequest other) {
      entitlementTermId(other.getEntitlementTermId());
      startDate(other.getStartDate());
      endDate(other.getEndDate());
      limit(other.getLimit());
      offset(other.getOffset());
      return this;
    }

    @JsonSetter(
        value = "entitlementTermId",
        nulls = Nulls.SKIP
    )
    public Builder entitlementTermId(Optional<String> entitlementTermId) {
      this.entitlementTermId = entitlementTermId;
      return this;
    }

    public Builder entitlementTermId(String entitlementTermId) {
      this.entitlementTermId = Optional.of(entitlementTermId);
      return this;
    }

    @JsonSetter(
        value = "startDate",
        nulls = Nulls.SKIP
    )
    public Builder startDate(Optional<String> startDate) {
      this.startDate = startDate;
      return this;
    }

    public Builder startDate(String startDate) {
      this.startDate = Optional.of(startDate);
      return this;
    }

    @JsonSetter(
        value = "endDate",
        nulls = Nulls.SKIP
    )
    public Builder endDate(Optional<String> endDate) {
      this.endDate = endDate;
      return this;
    }

    public Builder endDate(String endDate) {
      this.endDate = Optional.of(endDate);
      return this;
    }

    @JsonSetter(
        value = "limit",
        nulls = Nulls.SKIP
    )
    public Builder limit(Optional<Integer> limit) {
      this.limit = limit;
      return this;
    }

    public Builder limit(Integer limit) {
      this.limit = Optional.of(limit);
      return this;
    }

    @JsonSetter(
        value = "offset",
        nulls = Nulls.SKIP
    )
    public Builder offset(Optional<Integer> offset) {
      this.offset = offset;
      return this;
    }

    public Builder offset(Integer offset) {
      this.offset = Optional.of(offset);
      return this;
    }

    public ListUsageRecordReportsByEntitlementRequest build() {
      return new ListUsageRecordReportsByEntitlementRequest(entitlementTermId, startDate, endDate, limit, offset);
    }
  }
}
