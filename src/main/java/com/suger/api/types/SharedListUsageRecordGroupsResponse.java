package com.suger.api.types;

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
    builder = SharedListUsageRecordGroupsResponse.Builder.class
)
public final class SharedListUsageRecordGroupsResponse {
  private final Optional<Integer> nextOffset;

  private final Optional<List<SharedMeteringUsageRecordGroup>> usageRecordGroups;

  private int _cachedHashCode;

  SharedListUsageRecordGroupsResponse(Optional<Integer> nextOffset,
      Optional<List<SharedMeteringUsageRecordGroup>> usageRecordGroups) {
    this.nextOffset = nextOffset;
    this.usageRecordGroups = usageRecordGroups;
  }

  @JsonProperty("nextOffset")
  public Optional<Integer> getNextOffset() {
    return nextOffset;
  }

  @JsonProperty("usageRecordGroups")
  public Optional<List<SharedMeteringUsageRecordGroup>> getUsageRecordGroups() {
    return usageRecordGroups;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedListUsageRecordGroupsResponse && equalTo((SharedListUsageRecordGroupsResponse) other);
  }

  private boolean equalTo(SharedListUsageRecordGroupsResponse other) {
    return nextOffset.equals(other.nextOffset) && usageRecordGroups.equals(other.usageRecordGroups);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.nextOffset, this.usageRecordGroups);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedListUsageRecordGroupsResponse{" + "nextOffset: " + nextOffset + ", usageRecordGroups: " + usageRecordGroups + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> nextOffset = Optional.empty();

    private Optional<List<SharedMeteringUsageRecordGroup>> usageRecordGroups = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedListUsageRecordGroupsResponse other) {
      nextOffset(other.getNextOffset());
      usageRecordGroups(other.getUsageRecordGroups());
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
        value = "usageRecordGroups",
        nulls = Nulls.SKIP
    )
    public Builder usageRecordGroups(
        Optional<List<SharedMeteringUsageRecordGroup>> usageRecordGroups) {
      this.usageRecordGroups = usageRecordGroups;
      return this;
    }

    public Builder usageRecordGroups(List<SharedMeteringUsageRecordGroup> usageRecordGroups) {
      this.usageRecordGroups = Optional.of(usageRecordGroups);
      return this;
    }

    public SharedListUsageRecordGroupsResponse build() {
      return new SharedListUsageRecordGroupsResponse(nextOffset, usageRecordGroups);
    }
  }
}
