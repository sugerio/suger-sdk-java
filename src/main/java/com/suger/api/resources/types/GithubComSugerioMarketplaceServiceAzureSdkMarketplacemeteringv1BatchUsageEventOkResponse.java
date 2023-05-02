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
    builder = GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse.Builder.class
)
public final class GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse {
  private final Optional<Integer> count;

  private final Optional<List<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageBatchEventOkMessage>> result;

  private int _cachedHashCode;

  GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse(
      Optional<Integer> count,
      Optional<List<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageBatchEventOkMessage>> result) {
    this.count = count;
    this.result = result;
  }

  @JsonProperty("count")
  public Optional<Integer> getCount() {
    return count;
  }

  @JsonProperty("result")
  public Optional<List<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageBatchEventOkMessage>> getResult(
      ) {
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse && equalTo((GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse) other);
  }

  private boolean equalTo(
      GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse other) {
    return count.equals(other.count) && result.equals(other.result);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.count, this.result);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse{" + "count: " + count + ", result: " + result + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> count = Optional.empty();

    private Optional<List<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageBatchEventOkMessage>> result = Optional.empty();

    private Builder() {
    }

    public Builder from(
        GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse other) {
      count(other.getCount());
      result(other.getResult());
      return this;
    }

    @JsonSetter(
        value = "count",
        nulls = Nulls.SKIP
    )
    public Builder count(Optional<Integer> count) {
      this.count = count;
      return this;
    }

    public Builder count(Integer count) {
      this.count = Optional.of(count);
      return this;
    }

    @JsonSetter(
        value = "result",
        nulls = Nulls.SKIP
    )
    public Builder result(
        Optional<List<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageBatchEventOkMessage>> result) {
      this.result = result;
      return this;
    }

    public Builder result(
        List<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageBatchEventOkMessage> result) {
      this.result = Optional.of(result);
      return this;
    }

    public GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse build(
        ) {
      return new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse(count, result);
    }
  }
}
