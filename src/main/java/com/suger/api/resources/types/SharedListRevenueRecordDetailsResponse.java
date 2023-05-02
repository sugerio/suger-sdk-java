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
    builder = SharedListRevenueRecordDetailsResponse.Builder.class
)
public final class SharedListRevenueRecordDetailsResponse {
  private final Optional<Integer> nextOffset;

  private final Optional<List<SharedRevenueRecordDetail>> revenueRecordDetails;

  private int _cachedHashCode;

  SharedListRevenueRecordDetailsResponse(Optional<Integer> nextOffset,
      Optional<List<SharedRevenueRecordDetail>> revenueRecordDetails) {
    this.nextOffset = nextOffset;
    this.revenueRecordDetails = revenueRecordDetails;
  }

  @JsonProperty("nextOffset")
  public Optional<Integer> getNextOffset() {
    return nextOffset;
  }

  @JsonProperty("revenueRecordDetails")
  public Optional<List<SharedRevenueRecordDetail>> getRevenueRecordDetails() {
    return revenueRecordDetails;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedListRevenueRecordDetailsResponse && equalTo((SharedListRevenueRecordDetailsResponse) other);
  }

  private boolean equalTo(SharedListRevenueRecordDetailsResponse other) {
    return nextOffset.equals(other.nextOffset) && revenueRecordDetails.equals(other.revenueRecordDetails);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.nextOffset, this.revenueRecordDetails);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedListRevenueRecordDetailsResponse{" + "nextOffset: " + nextOffset + ", revenueRecordDetails: " + revenueRecordDetails + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> nextOffset = Optional.empty();

    private Optional<List<SharedRevenueRecordDetail>> revenueRecordDetails = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedListRevenueRecordDetailsResponse other) {
      nextOffset(other.getNextOffset());
      revenueRecordDetails(other.getRevenueRecordDetails());
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
        value = "revenueRecordDetails",
        nulls = Nulls.SKIP
    )
    public Builder revenueRecordDetails(
        Optional<List<SharedRevenueRecordDetail>> revenueRecordDetails) {
      this.revenueRecordDetails = revenueRecordDetails;
      return this;
    }

    public Builder revenueRecordDetails(List<SharedRevenueRecordDetail> revenueRecordDetails) {
      this.revenueRecordDetails = Optional.of(revenueRecordDetails);
      return this;
    }

    public SharedListRevenueRecordDetailsResponse build() {
      return new SharedListRevenueRecordDetailsResponse(nextOffset, revenueRecordDetails);
    }
  }
}
