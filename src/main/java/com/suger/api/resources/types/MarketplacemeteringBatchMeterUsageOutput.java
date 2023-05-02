package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = MarketplacemeteringBatchMeterUsageOutput.Builder.class
)
public final class MarketplacemeteringBatchMeterUsageOutput {
  private final Optional<Map<String, Object>> resultMetadata;

  private final Optional<List<TypesUsageRecordResult>> results;

  private final Optional<List<TypesUsageRecord>> unprocessedRecords;

  private int _cachedHashCode;

  MarketplacemeteringBatchMeterUsageOutput(Optional<Map<String, Object>> resultMetadata,
      Optional<List<TypesUsageRecordResult>> results,
      Optional<List<TypesUsageRecord>> unprocessedRecords) {
    this.resultMetadata = resultMetadata;
    this.results = results;
    this.unprocessedRecords = unprocessedRecords;
  }

  /**
   * @return Metadata pertaining to the operation's result.
   */
  @JsonProperty("resultMetadata")
  public Optional<Map<String, Object>> getResultMetadata() {
    return resultMetadata;
  }

  /**
   * @return Contains all UsageRecords processed by BatchMeterUsage. These records were
   * either honored by AWS Marketplace Metering Service or were invalid. Invalid
   * records should be fixed before being resubmitted.
   */
  @JsonProperty("results")
  public Optional<List<TypesUsageRecordResult>> getResults() {
    return results;
  }

  /**
   * @return Contains all UsageRecords that were not processed by BatchMeterUsage. This is a
   * list of UsageRecords. You can retry the failed request by making another
   * BatchMeterUsage call with this list as input in the BatchMeterUsageRequest.
   */
  @JsonProperty("unprocessedRecords")
  public Optional<List<TypesUsageRecord>> getUnprocessedRecords() {
    return unprocessedRecords;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof MarketplacemeteringBatchMeterUsageOutput && equalTo((MarketplacemeteringBatchMeterUsageOutput) other);
  }

  private boolean equalTo(MarketplacemeteringBatchMeterUsageOutput other) {
    return resultMetadata.equals(other.resultMetadata) && results.equals(other.results) && unprocessedRecords.equals(other.unprocessedRecords);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.resultMetadata, this.results, this.unprocessedRecords);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "MarketplacemeteringBatchMeterUsageOutput{" + "resultMetadata: " + resultMetadata + ", results: " + results + ", unprocessedRecords: " + unprocessedRecords + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Map<String, Object>> resultMetadata = Optional.empty();

    private Optional<List<TypesUsageRecordResult>> results = Optional.empty();

    private Optional<List<TypesUsageRecord>> unprocessedRecords = Optional.empty();

    private Builder() {
    }

    public Builder from(MarketplacemeteringBatchMeterUsageOutput other) {
      resultMetadata(other.getResultMetadata());
      results(other.getResults());
      unprocessedRecords(other.getUnprocessedRecords());
      return this;
    }

    @JsonSetter(
        value = "resultMetadata",
        nulls = Nulls.SKIP
    )
    public Builder resultMetadata(Optional<Map<String, Object>> resultMetadata) {
      this.resultMetadata = resultMetadata;
      return this;
    }

    public Builder resultMetadata(Map<String, Object> resultMetadata) {
      this.resultMetadata = Optional.of(resultMetadata);
      return this;
    }

    @JsonSetter(
        value = "results",
        nulls = Nulls.SKIP
    )
    public Builder results(Optional<List<TypesUsageRecordResult>> results) {
      this.results = results;
      return this;
    }

    public Builder results(List<TypesUsageRecordResult> results) {
      this.results = Optional.of(results);
      return this;
    }

    @JsonSetter(
        value = "unprocessedRecords",
        nulls = Nulls.SKIP
    )
    public Builder unprocessedRecords(Optional<List<TypesUsageRecord>> unprocessedRecords) {
      this.unprocessedRecords = unprocessedRecords;
      return this;
    }

    public Builder unprocessedRecords(List<TypesUsageRecord> unprocessedRecords) {
      this.unprocessedRecords = Optional.of(unprocessedRecords);
      return this;
    }

    public MarketplacemeteringBatchMeterUsageOutput build() {
      return new MarketplacemeteringBatchMeterUsageOutput(resultMetadata, results, unprocessedRecords);
    }
  }
}
