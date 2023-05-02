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
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedRevenueRecordInfo.Builder.class
)
public final class SharedRevenueRecordInfo {
  private final Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent>> awsRevenueRecords;

  private final Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue>> azureRevenueRecords;

  private final Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage>> gcpRevenueRecords;

  private int _cachedHashCode;

  SharedRevenueRecordInfo(
      Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent>> awsRevenueRecords,
      Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue>> azureRevenueRecords,
      Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage>> gcpRevenueRecords) {
    this.awsRevenueRecords = awsRevenueRecords;
    this.azureRevenueRecords = azureRevenueRecords;
    this.gcpRevenueRecords = gcpRevenueRecords;
  }

  /**
   * @return For raw revenue records in AWS Marketplace
   */
  @JsonProperty("awsRevenueRecords")
  public Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent>> getAwsRevenueRecords(
      ) {
    return awsRevenueRecords;
  }

  /**
   * @return For raw revenue records in Azure Marketplace
   */
  @JsonProperty("azureRevenueRecords")
  public Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue>> getAzureRevenueRecords(
      ) {
    return azureRevenueRecords;
  }

  /**
   * @return For raw revenue records in GCP Marketplace
   */
  @JsonProperty("gcpRevenueRecords")
  public Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage>> getGcpRevenueRecords(
      ) {
    return gcpRevenueRecords;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedRevenueRecordInfo && equalTo((SharedRevenueRecordInfo) other);
  }

  private boolean equalTo(SharedRevenueRecordInfo other) {
    return awsRevenueRecords.equals(other.awsRevenueRecords) && azureRevenueRecords.equals(other.azureRevenueRecords) && gcpRevenueRecords.equals(other.gcpRevenueRecords);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.awsRevenueRecords, this.azureRevenueRecords, this.gcpRevenueRecords);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedRevenueRecordInfo{" + "awsRevenueRecords: " + awsRevenueRecords + ", azureRevenueRecords: " + azureRevenueRecords + ", gcpRevenueRecords: " + gcpRevenueRecords + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent>> awsRevenueRecords = Optional.empty();

    private Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue>> azureRevenueRecords = Optional.empty();

    private Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage>> gcpRevenueRecords = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedRevenueRecordInfo other) {
      awsRevenueRecords(other.getAwsRevenueRecords());
      azureRevenueRecords(other.getAzureRevenueRecords());
      gcpRevenueRecords(other.getGcpRevenueRecords());
      return this;
    }

    @JsonSetter(
        value = "awsRevenueRecords",
        nulls = Nulls.SKIP
    )
    public Builder awsRevenueRecords(
        Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent>> awsRevenueRecords) {
      this.awsRevenueRecords = awsRevenueRecords;
      return this;
    }

    public Builder awsRevenueRecords(
        List<GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent> awsRevenueRecords) {
      this.awsRevenueRecords = Optional.of(awsRevenueRecords);
      return this;
    }

    @JsonSetter(
        value = "azureRevenueRecords",
        nulls = Nulls.SKIP
    )
    public Builder azureRevenueRecords(
        Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue>> azureRevenueRecords) {
      this.azureRevenueRecords = azureRevenueRecords;
      return this;
    }

    public Builder azureRevenueRecords(
        List<GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue> azureRevenueRecords) {
      this.azureRevenueRecords = Optional.of(azureRevenueRecords);
      return this;
    }

    @JsonSetter(
        value = "gcpRevenueRecords",
        nulls = Nulls.SKIP
    )
    public Builder gcpRevenueRecords(
        Optional<List<GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage>> gcpRevenueRecords) {
      this.gcpRevenueRecords = gcpRevenueRecords;
      return this;
    }

    public Builder gcpRevenueRecords(
        List<GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage> gcpRevenueRecords) {
      this.gcpRevenueRecords = Optional.of(gcpRevenueRecords);
      return this;
    }

    public SharedRevenueRecordInfo build() {
      return new SharedRevenueRecordInfo(awsRevenueRecords, azureRevenueRecords, gcpRevenueRecords);
    }
  }
}
