package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedListUsageRecordReportsResponse.Builder.class
)
public final class SharedListUsageRecordReportsResponse {
  private final Optional<Integer> nextOffset;

  private final Optional<List<SharedMeteringUsageRecordReport>> usageRecordReports;

  private int _cachedHashCode;

  SharedListUsageRecordReportsResponse(Optional<Integer> nextOffset,
      Optional<List<SharedMeteringUsageRecordReport>> usageRecordReports) {
    this.nextOffset = nextOffset;
    this.usageRecordReports = usageRecordReports;
  }

  @JsonProperty("nextOffset")
  public Optional<Integer> getNextOffset() {
    return nextOffset;
  }

  @JsonProperty("usageRecordReports")
  public Optional<List<SharedMeteringUsageRecordReport>> getUsageRecordReports() {
    return usageRecordReports;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedListUsageRecordReportsResponse && equalTo((SharedListUsageRecordReportsResponse) other);
  }

  private boolean equalTo(SharedListUsageRecordReportsResponse other) {
    return nextOffset.equals(other.nextOffset) && usageRecordReports.equals(other.usageRecordReports);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.nextOffset, this.usageRecordReports);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedListUsageRecordReportsResponse{" + "nextOffset: " + nextOffset + ", usageRecordReports: " + usageRecordReports + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> nextOffset = Optional.empty();

    private Optional<List<SharedMeteringUsageRecordReport>> usageRecordReports = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedListUsageRecordReportsResponse other) {
      nextOffset(other.getNextOffset());
      usageRecordReports(other.getUsageRecordReports());
      return this;
    }

    @JsonSetter(
        value = "nextOffset",
        nulls = Nulls.SKIP
    )
    public Builder nextOffset(Optional<Integer> nextOffset) {
      this.nextOffset = nextOffset;
      return this;
    }

    public Builder nextOffset(Integer nextOffset) {
      this.nextOffset = Optional.of(nextOffset);
      return this;
    }

    @JsonSetter(
        value = "usageRecordReports",
        nulls = Nulls.SKIP
    )
    public Builder usageRecordReports(
        Optional<List<SharedMeteringUsageRecordReport>> usageRecordReports) {
      this.usageRecordReports = usageRecordReports;
      return this;
    }

    public Builder usageRecordReports(List<SharedMeteringUsageRecordReport> usageRecordReports) {
      this.usageRecordReports = Optional.of(usageRecordReports);
      return this;
    }

    public SharedListUsageRecordReportsResponse build() {
      return new SharedListUsageRecordReportsResponse(nextOffset, usageRecordReports);
    }
  }
}
