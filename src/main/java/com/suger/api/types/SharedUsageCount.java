package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedUsageCount.Builder.class
)
public final class SharedUsageCount {
  private final Optional<Double> creditCount;

  private final Optional<Double> includedCount;

  private final Optional<Double> reportedCount;

  private int _cachedHashCode;

  SharedUsageCount(Optional<Double> creditCount, Optional<Double> includedCount,
      Optional<Double> reportedCount) {
    this.creditCount = creditCount;
    this.includedCount = includedCount;
    this.reportedCount = reportedCount;
  }

  /**
   * @return The count of this dimension usage records that are handled as credit.
   */
  @JsonProperty("creditCount")
  public Optional<Double> getCreditCount() {
    return creditCount;
  }

  /**
   * @return The count of this dimension usage records that are handled as included in IncludedBaseQuantity
   */
  @JsonProperty("includedCount")
  public Optional<Double> getIncludedCount() {
    return includedCount;
  }

  /**
   * @return The count of this dimension usage records that are reported to cloud vendors.
   */
  @JsonProperty("reportedCount")
  public Optional<Double> getReportedCount() {
    return reportedCount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedUsageCount && equalTo((SharedUsageCount) other);
  }

  private boolean equalTo(SharedUsageCount other) {
    return creditCount.equals(other.creditCount) && includedCount.equals(other.includedCount) && reportedCount.equals(other.reportedCount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.creditCount, this.includedCount, this.reportedCount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedUsageCount{" + "creditCount: " + creditCount + ", includedCount: " + includedCount + ", reportedCount: " + reportedCount + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Double> creditCount = Optional.empty();

    private Optional<Double> includedCount = Optional.empty();

    private Optional<Double> reportedCount = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedUsageCount other) {
      creditCount(other.getCreditCount());
      includedCount(other.getIncludedCount());
      reportedCount(other.getReportedCount());
      return this;
    }

    @JsonSetter(
        value = "creditCount",
        nulls = Nulls.SKIP
    )
    public Builder creditCount(Optional<Double> creditCount) {
      this.creditCount = creditCount;
      return this;
    }

    public Builder creditCount(Double creditCount) {
      this.creditCount = Optional.of(creditCount);
      return this;
    }

    @JsonSetter(
        value = "includedCount",
        nulls = Nulls.SKIP
    )
    public Builder includedCount(Optional<Double> includedCount) {
      this.includedCount = includedCount;
      return this;
    }

    public Builder includedCount(Double includedCount) {
      this.includedCount = Optional.of(includedCount);
      return this;
    }

    @JsonSetter(
        value = "reportedCount",
        nulls = Nulls.SKIP
    )
    public Builder reportedCount(Optional<Double> reportedCount) {
      this.reportedCount = reportedCount;
      return this;
    }

    public Builder reportedCount(Double reportedCount) {
      this.reportedCount = Optional.of(reportedCount);
      return this;
    }

    public SharedUsageCount build() {
      return new SharedUsageCount(creditCount, includedCount, reportedCount);
    }
  }
}
