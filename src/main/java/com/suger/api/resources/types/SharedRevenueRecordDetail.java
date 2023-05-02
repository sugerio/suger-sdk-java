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
    builder = SharedRevenueRecordDetail.Builder.class
)
public final class SharedRevenueRecordDetail {
  private final Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent> awsRevenueRecordDetail;

  private final Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue> azureRevenueRecordDetail;

  private final Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage> gcpRevenueRecordDetail;

  private int _cachedHashCode;

  SharedRevenueRecordDetail(
      Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent> awsRevenueRecordDetail,
      Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue> azureRevenueRecordDetail,
      Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage> gcpRevenueRecordDetail) {
    this.awsRevenueRecordDetail = awsRevenueRecordDetail;
    this.azureRevenueRecordDetail = azureRevenueRecordDetail;
    this.gcpRevenueRecordDetail = gcpRevenueRecordDetail;
  }

  /**
   * @return For AWS Marketplace
   */
  @JsonProperty("awsRevenueRecordDetail")
  public Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent> getAwsRevenueRecordDetail(
      ) {
    return awsRevenueRecordDetail;
  }

  /**
   * @return For Azure Marketplace
   */
  @JsonProperty("azureRevenueRecordDetail")
  public Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue> getAzureRevenueRecordDetail(
      ) {
    return azureRevenueRecordDetail;
  }

  /**
   * @return For GCP Marketplace
   */
  @JsonProperty("gcpRevenueRecordDetail")
  public Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage> getGcpRevenueRecordDetail(
      ) {
    return gcpRevenueRecordDetail;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedRevenueRecordDetail && equalTo((SharedRevenueRecordDetail) other);
  }

  private boolean equalTo(SharedRevenueRecordDetail other) {
    return awsRevenueRecordDetail.equals(other.awsRevenueRecordDetail) && azureRevenueRecordDetail.equals(other.azureRevenueRecordDetail) && gcpRevenueRecordDetail.equals(other.gcpRevenueRecordDetail);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.awsRevenueRecordDetail, this.azureRevenueRecordDetail, this.gcpRevenueRecordDetail);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedRevenueRecordDetail{" + "awsRevenueRecordDetail: " + awsRevenueRecordDetail + ", azureRevenueRecordDetail: " + azureRevenueRecordDetail + ", gcpRevenueRecordDetail: " + gcpRevenueRecordDetail + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent> awsRevenueRecordDetail = Optional.empty();

    private Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue> azureRevenueRecordDetail = Optional.empty();

    private Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage> gcpRevenueRecordDetail = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedRevenueRecordDetail other) {
      awsRevenueRecordDetail(other.getAwsRevenueRecordDetail());
      azureRevenueRecordDetail(other.getAzureRevenueRecordDetail());
      gcpRevenueRecordDetail(other.getGcpRevenueRecordDetail());
      return this;
    }

    @JsonSetter(
        value = "awsRevenueRecordDetail",
        nulls = Nulls.SKIP
    )
    public Builder awsRevenueRecordDetail(
        Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent> awsRevenueRecordDetail) {
      this.awsRevenueRecordDetail = awsRevenueRecordDetail;
      return this;
    }

    public Builder awsRevenueRecordDetail(
        GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent awsRevenueRecordDetail) {
      this.awsRevenueRecordDetail = Optional.of(awsRevenueRecordDetail);
      return this;
    }

    @JsonSetter(
        value = "azureRevenueRecordDetail",
        nulls = Nulls.SKIP
    )
    public Builder azureRevenueRecordDetail(
        Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue> azureRevenueRecordDetail) {
      this.azureRevenueRecordDetail = azureRevenueRecordDetail;
      return this;
    }

    public Builder azureRevenueRecordDetail(
        GithubComSugerioMarketplaceServiceRdsDbLibBillingAzureCmaRevenue azureRevenueRecordDetail) {
      this.azureRevenueRecordDetail = Optional.of(azureRevenueRecordDetail);
      return this;
    }

    @JsonSetter(
        value = "gcpRevenueRecordDetail",
        nulls = Nulls.SKIP
    )
    public Builder gcpRevenueRecordDetail(
        Optional<GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage> gcpRevenueRecordDetail) {
      this.gcpRevenueRecordDetail = gcpRevenueRecordDetail;
      return this;
    }

    public Builder gcpRevenueRecordDetail(
        GithubComSugerioMarketplaceServiceRdsDbLibBillingGcpChargeUsage gcpRevenueRecordDetail) {
      this.gcpRevenueRecordDetail = Optional.of(gcpRevenueRecordDetail);
      return this;
    }

    public SharedRevenueRecordDetail build() {
      return new SharedRevenueRecordDetail(awsRevenueRecordDetail, azureRevenueRecordDetail, gcpRevenueRecordDetail);
    }
  }
}
