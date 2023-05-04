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
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzureProductVariantTrial.Builder.class
)
public final class AzureProductVariantTrial {
  private final Optional<AzureLocalizedTimeRange> dateTimeRange;

  private final Optional<Integer> duration;

  private final Optional<AzureProductVariantTrialDurationType> durationType;

  private final Optional<AzureProductVariantTrialType> type;

  private int _cachedHashCode;

  AzureProductVariantTrial(Optional<AzureLocalizedTimeRange> dateTimeRange,
      Optional<Integer> duration, Optional<AzureProductVariantTrialDurationType> durationType,
      Optional<AzureProductVariantTrialType> type) {
    this.dateTimeRange = dateTimeRange;
    this.duration = duration;
    this.durationType = durationType;
    this.type = type;
  }

  @JsonProperty("dateTimeRange")
  public Optional<AzureLocalizedTimeRange> getDateTimeRange() {
    return dateTimeRange;
  }

  @JsonProperty("duration")
  public Optional<Integer> getDuration() {
    return duration;
  }

  @JsonProperty("durationType")
  public Optional<AzureProductVariantTrialDurationType> getDurationType() {
    return durationType;
  }

  @JsonProperty("type")
  public Optional<AzureProductVariantTrialType> getType() {
    return type;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductVariantTrial && equalTo((AzureProductVariantTrial) other);
  }

  private boolean equalTo(AzureProductVariantTrial other) {
    return dateTimeRange.equals(other.dateTimeRange) && duration.equals(other.duration) && durationType.equals(other.durationType) && type.equals(other.type);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.dateTimeRange, this.duration, this.durationType, this.type);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductVariantTrial{" + "dateTimeRange: " + dateTimeRange + ", duration: " + duration + ", durationType: " + durationType + ", type: " + type + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AzureLocalizedTimeRange> dateTimeRange = Optional.empty();

    private Optional<Integer> duration = Optional.empty();

    private Optional<AzureProductVariantTrialDurationType> durationType = Optional.empty();

    private Optional<AzureProductVariantTrialType> type = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductVariantTrial other) {
      dateTimeRange(other.getDateTimeRange());
      duration(other.getDuration());
      durationType(other.getDurationType());
      type(other.getType());
      return this;
    }

    @JsonSetter(
        value = "dateTimeRange",
        nulls = Nulls.SKIP
    )
    public Builder dateTimeRange(Optional<AzureLocalizedTimeRange> dateTimeRange) {
      this.dateTimeRange = dateTimeRange;
      return this;
    }

    public Builder dateTimeRange(AzureLocalizedTimeRange dateTimeRange) {
      this.dateTimeRange = Optional.of(dateTimeRange);
      return this;
    }

    @JsonSetter(
        value = "duration",
        nulls = Nulls.SKIP
    )
    public Builder duration(Optional<Integer> duration) {
      this.duration = duration;
      return this;
    }

    public Builder duration(Integer duration) {
      this.duration = Optional.of(duration);
      return this;
    }

    @JsonSetter(
        value = "durationType",
        nulls = Nulls.SKIP
    )
    public Builder durationType(Optional<AzureProductVariantTrialDurationType> durationType) {
      this.durationType = durationType;
      return this;
    }

    public Builder durationType(AzureProductVariantTrialDurationType durationType) {
      this.durationType = Optional.of(durationType);
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<AzureProductVariantTrialType> type) {
      this.type = type;
      return this;
    }

    public Builder type(AzureProductVariantTrialType type) {
      this.type = Optional.of(type);
      return this;
    }

    public AzureProductVariantTrial build() {
      return new AzureProductVariantTrial(dateTimeRange, duration, durationType, type);
    }
  }
}
