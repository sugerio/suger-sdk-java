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
    builder = SharedAzureTerm.Builder.class
)
public final class SharedAzureTerm {
  private final Optional<String> chargeDuration;

  private final Optional<String> endDate;

  private final Optional<String> startDate;

  private final Optional<String> termUnit;

  private int _cachedHashCode;

  SharedAzureTerm(Optional<String> chargeDuration, Optional<String> endDate,
      Optional<String> startDate, Optional<String> termUnit) {
    this.chargeDuration = chargeDuration;
    this.endDate = endDate;
    this.startDate = startDate;
    this.termUnit = termUnit;
  }

  @JsonProperty("chargeDuration")
  public Optional<String> getChargeDuration() {
    return chargeDuration;
  }

  @JsonProperty("endDate")
  public Optional<String> getEndDate() {
    return endDate;
  }

  @JsonProperty("startDate")
  public Optional<String> getStartDate() {
    return startDate;
  }

  @JsonProperty("termUnit")
  public Optional<String> getTermUnit() {
    return termUnit;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAzureTerm && equalTo((SharedAzureTerm) other);
  }

  private boolean equalTo(SharedAzureTerm other) {
    return chargeDuration.equals(other.chargeDuration) && endDate.equals(other.endDate) && startDate.equals(other.startDate) && termUnit.equals(other.termUnit);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.chargeDuration, this.endDate, this.startDate, this.termUnit);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAzureTerm{" + "chargeDuration: " + chargeDuration + ", endDate: " + endDate + ", startDate: " + startDate + ", termUnit: " + termUnit + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> chargeDuration = Optional.empty();

    private Optional<String> endDate = Optional.empty();

    private Optional<String> startDate = Optional.empty();

    private Optional<String> termUnit = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAzureTerm other) {
      chargeDuration(other.getChargeDuration());
      endDate(other.getEndDate());
      startDate(other.getStartDate());
      termUnit(other.getTermUnit());
      return this;
    }

    @JsonSetter(
        value = "chargeDuration",
        nulls = Nulls.SKIP
    )
    public Builder chargeDuration(Optional<String> chargeDuration) {
      this.chargeDuration = chargeDuration;
      return this;
    }

    public Builder chargeDuration(String chargeDuration) {
      this.chargeDuration = Optional.of(chargeDuration);
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
        value = "termUnit",
        nulls = Nulls.SKIP
    )
    public Builder termUnit(Optional<String> termUnit) {
      this.termUnit = termUnit;
      return this;
    }

    public Builder termUnit(String termUnit) {
      this.termUnit = Optional.of(termUnit);
      return this;
    }

    public SharedAzureTerm build() {
      return new SharedAzureTerm(chargeDuration, endDate, startDate, termUnit);
    }
  }
}
