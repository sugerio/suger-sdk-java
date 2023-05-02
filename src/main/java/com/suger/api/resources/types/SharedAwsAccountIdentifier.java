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
    builder = SharedAwsAccountIdentifier.Builder.class
)
public final class SharedAwsAccountIdentifier {
  private final Optional<String> awsAccountId;

  private final Optional<String> awsCustomerId;

  private final Optional<SharedCompanyInfo> companyInfo;

  private final Optional<String> dataFeedAccountId;

  private int _cachedHashCode;

  SharedAwsAccountIdentifier(Optional<String> awsAccountId, Optional<String> awsCustomerId,
      Optional<SharedCompanyInfo> companyInfo, Optional<String> dataFeedAccountId) {
    this.awsAccountId = awsAccountId;
    this.awsCustomerId = awsCustomerId;
    this.companyInfo = companyInfo;
    this.dataFeedAccountId = dataFeedAccountId;
  }

  /**
   * @return The AWS Account ID of the buyer in AWS Marketplace
   */
  @JsonProperty("awsAccountID")
  public Optional<String> getAwsAccountId() {
    return awsAccountId;
  }

  /**
   * @return The AWS Customer ID of the buyer in AWS Marketplace
   */
  @JsonProperty("awsCustomerID")
  public Optional<String> getAwsCustomerId() {
    return awsCustomerId;
  }

  @JsonProperty("companyInfo")
  public Optional<SharedCompanyInfo> getCompanyInfo() {
    return companyInfo;
  }

  /**
   * @return The Account ID in AWS Marketplace Data Feed service
   */
  @JsonProperty("dataFeedAccountID")
  public Optional<String> getDataFeedAccountId() {
    return dataFeedAccountId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsAccountIdentifier && equalTo((SharedAwsAccountIdentifier) other);
  }

  private boolean equalTo(SharedAwsAccountIdentifier other) {
    return awsAccountId.equals(other.awsAccountId) && awsCustomerId.equals(other.awsCustomerId) && companyInfo.equals(other.companyInfo) && dataFeedAccountId.equals(other.dataFeedAccountId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.awsAccountId, this.awsCustomerId, this.companyInfo, this.dataFeedAccountId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsAccountIdentifier{" + "awsAccountId: " + awsAccountId + ", awsCustomerId: " + awsCustomerId + ", companyInfo: " + companyInfo + ", dataFeedAccountId: " + dataFeedAccountId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> awsAccountId = Optional.empty();

    private Optional<String> awsCustomerId = Optional.empty();

    private Optional<SharedCompanyInfo> companyInfo = Optional.empty();

    private Optional<String> dataFeedAccountId = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsAccountIdentifier other) {
      awsAccountId(other.getAwsAccountId());
      awsCustomerId(other.getAwsCustomerId());
      companyInfo(other.getCompanyInfo());
      dataFeedAccountId(other.getDataFeedAccountId());
      return this;
    }

    @JsonSetter(
        value = "awsAccountID",
        nulls = Nulls.SKIP
    )
    public Builder awsAccountId(Optional<String> awsAccountId) {
      this.awsAccountId = awsAccountId;
      return this;
    }

    public Builder awsAccountId(String awsAccountId) {
      this.awsAccountId = Optional.of(awsAccountId);
      return this;
    }

    @JsonSetter(
        value = "awsCustomerID",
        nulls = Nulls.SKIP
    )
    public Builder awsCustomerId(Optional<String> awsCustomerId) {
      this.awsCustomerId = awsCustomerId;
      return this;
    }

    public Builder awsCustomerId(String awsCustomerId) {
      this.awsCustomerId = Optional.of(awsCustomerId);
      return this;
    }

    @JsonSetter(
        value = "companyInfo",
        nulls = Nulls.SKIP
    )
    public Builder companyInfo(Optional<SharedCompanyInfo> companyInfo) {
      this.companyInfo = companyInfo;
      return this;
    }

    public Builder companyInfo(SharedCompanyInfo companyInfo) {
      this.companyInfo = Optional.of(companyInfo);
      return this;
    }

    @JsonSetter(
        value = "dataFeedAccountID",
        nulls = Nulls.SKIP
    )
    public Builder dataFeedAccountId(Optional<String> dataFeedAccountId) {
      this.dataFeedAccountId = dataFeedAccountId;
      return this;
    }

    public Builder dataFeedAccountId(String dataFeedAccountId) {
      this.dataFeedAccountId = Optional.of(dataFeedAccountId);
      return this;
    }

    public SharedAwsAccountIdentifier build() {
      return new SharedAwsAccountIdentifier(awsAccountId, awsCustomerId, companyInfo, dataFeedAccountId);
    }
  }
}
