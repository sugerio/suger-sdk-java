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
    builder = SharedListRevenueRecordsResponse.Builder.class
)
public final class SharedListRevenueRecordsResponse {
  private final Optional<Integer> nextOffset;

  private final Optional<List<SharedRevenueRecord>> revenueRecords;

  private int _cachedHashCode;

  SharedListRevenueRecordsResponse(Optional<Integer> nextOffset,
      Optional<List<SharedRevenueRecord>> revenueRecords) {
    this.nextOffset = nextOffset;
    this.revenueRecords = revenueRecords;
  }

  @JsonProperty("nextOffset")
  public Optional<Integer> getNextOffset() {
    return nextOffset;
  }

  @JsonProperty("revenueRecords")
  public Optional<List<SharedRevenueRecord>> getRevenueRecords() {
    return revenueRecords;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedListRevenueRecordsResponse && equalTo((SharedListRevenueRecordsResponse) other);
  }

  private boolean equalTo(SharedListRevenueRecordsResponse other) {
    return nextOffset.equals(other.nextOffset) && revenueRecords.equals(other.revenueRecords);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.nextOffset, this.revenueRecords);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedListRevenueRecordsResponse{" + "nextOffset: " + nextOffset + ", revenueRecords: " + revenueRecords + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> nextOffset = Optional.empty();

    private Optional<List<SharedRevenueRecord>> revenueRecords = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedListRevenueRecordsResponse other) {
      nextOffset(other.getNextOffset());
      revenueRecords(other.getRevenueRecords());
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
        value = "revenueRecords",
        nulls = Nulls.SKIP
    )
    public Builder revenueRecords(Optional<List<SharedRevenueRecord>> revenueRecords) {
      this.revenueRecords = revenueRecords;
      return this;
    }

    public Builder revenueRecords(List<SharedRevenueRecord> revenueRecords) {
      this.revenueRecords = Optional.of(revenueRecords);
      return this;
    }

    public SharedListRevenueRecordsResponse build() {
      return new SharedListRevenueRecordsResponse(nextOffset, revenueRecords);
    }
  }
}
