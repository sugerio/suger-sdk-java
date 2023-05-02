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
    builder = AzureLocalizedTimeRange.Builder.class
)
public final class AzureLocalizedTimeRange {
  private final Optional<AzureLocalizedDateTime> endAt;

  private final Optional<AzureLocalizedDateTime> startAt;

  private int _cachedHashCode;

  AzureLocalizedTimeRange(Optional<AzureLocalizedDateTime> endAt,
      Optional<AzureLocalizedDateTime> startAt) {
    this.endAt = endAt;
    this.startAt = startAt;
  }

  @JsonProperty("endAt")
  public Optional<AzureLocalizedDateTime> getEndAt() {
    return endAt;
  }

  @JsonProperty("startAt")
  public Optional<AzureLocalizedDateTime> getStartAt() {
    return startAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureLocalizedTimeRange && equalTo((AzureLocalizedTimeRange) other);
  }

  private boolean equalTo(AzureLocalizedTimeRange other) {
    return endAt.equals(other.endAt) && startAt.equals(other.startAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.endAt, this.startAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureLocalizedTimeRange{" + "endAt: " + endAt + ", startAt: " + startAt + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AzureLocalizedDateTime> endAt = Optional.empty();

    private Optional<AzureLocalizedDateTime> startAt = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureLocalizedTimeRange other) {
      endAt(other.getEndAt());
      startAt(other.getStartAt());
      return this;
    }

    @JsonSetter(
        value = "endAt",
        nulls = Nulls.SKIP
    )
    public Builder endAt(Optional<AzureLocalizedDateTime> endAt) {
      this.endAt = endAt;
      return this;
    }

    public Builder endAt(AzureLocalizedDateTime endAt) {
      this.endAt = Optional.of(endAt);
      return this;
    }

    @JsonSetter(
        value = "startAt",
        nulls = Nulls.SKIP
    )
    public Builder startAt(Optional<AzureLocalizedDateTime> startAt) {
      this.startAt = startAt;
      return this;
    }

    public Builder startAt(AzureLocalizedDateTime startAt) {
      this.startAt = Optional.of(startAt);
      return this;
    }

    public AzureLocalizedTimeRange build() {
      return new AzureLocalizedTimeRange(endAt, startAt);
    }
  }
}
