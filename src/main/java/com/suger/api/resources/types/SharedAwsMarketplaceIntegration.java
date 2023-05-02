package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedAwsMarketplaceIntegration.Builder.class
)
public final class SharedAwsMarketplaceIntegration {
  private final Optional<String> externalId;

  private final Optional<String> iamRoleArn;

  private final Optional<String> marketplaceStartDate;

  private final Optional<Boolean> mcasFullSyncDone;

  private final Optional<String> mcasIamRoleArn;

  private final Optional<String> mcasS3Bucket;

  private final Optional<String> mcasSnsTopic;

  private final Optional<Boolean> mdfsFullSyncDone;

  private final Optional<String> mdfsKmsKeyArn;

  private final Optional<String> mdfsS3BucketArn;

  private final Optional<List<String>> policyArns;

  private final Optional<Boolean> revenueRecordFullSyncDone;

  private int _cachedHashCode;

  SharedAwsMarketplaceIntegration(Optional<String> externalId, Optional<String> iamRoleArn,
      Optional<String> marketplaceStartDate, Optional<Boolean> mcasFullSyncDone,
      Optional<String> mcasIamRoleArn, Optional<String> mcasS3Bucket, Optional<String> mcasSnsTopic,
      Optional<Boolean> mdfsFullSyncDone, Optional<String> mdfsKmsKeyArn,
      Optional<String> mdfsS3BucketArn, Optional<List<String>> policyArns,
      Optional<Boolean> revenueRecordFullSyncDone) {
    this.externalId = externalId;
    this.iamRoleArn = iamRoleArn;
    this.marketplaceStartDate = marketplaceStartDate;
    this.mcasFullSyncDone = mcasFullSyncDone;
    this.mcasIamRoleArn = mcasIamRoleArn;
    this.mcasS3Bucket = mcasS3Bucket;
    this.mcasSnsTopic = mcasSnsTopic;
    this.mdfsFullSyncDone = mdfsFullSyncDone;
    this.mdfsKmsKeyArn = mdfsKmsKeyArn;
    this.mdfsS3BucketArn = mdfsS3BucketArn;
    this.policyArns = policyArns;
    this.revenueRecordFullSyncDone = revenueRecordFullSyncDone;
  }

  /**
   * @return The external ID for assuming IAM role. If empty, means no external ID set or needed. Otherwise, it should be auth_id in table identity.organization.
   */
  @JsonProperty("externalID")
  public Optional<String> getExternalId() {
    return externalId;
  }

  /**
   * @return The AWS IAM role for Suger service to assume to access the client's AWS services.
   */
  @JsonProperty("iamRoleArn")
  public Optional<String> getIamRoleArn() {
    return iamRoleArn;
  }

  /**
   * @return AWS Marketplace start date which comes from MDFS Full-Sync.
   */
  @JsonProperty("marketplaceStartDate")
  public Optional<String> getMarketplaceStartDate() {
    return marketplaceStartDate;
  }

  /**
   * @return Is AWS Marketplace Commerce Analytics Service (MCAS) full-sync done.
   */
  @JsonProperty("mcasFullSyncDone")
  public Optional<Boolean> getMcasFullSyncDone() {
    return mcasFullSyncDone;
  }

  /**
   * @return IAM role ARN to allow AWS Marketplace to write to the S3 bucket and publish notifications to the SNS topic.
   */
  @JsonProperty("mcasIamRoleArn")
  public Optional<String> getMcasIamRoleArn() {
    return mcasIamRoleArn;
  }

  /**
   * @return S3 bucket for AWS Marketplace Commerce Analytics Service (MCAS)
   */
  @JsonProperty("mcasS3Bucket")
  public Optional<String> getMcasS3Bucket() {
    return mcasS3Bucket;
  }

  /**
   * @return SNS topic ARN for AWS Marketplace Commerce Analytics Service (MCAS)
   */
  @JsonProperty("mcasSnsTopic")
  public Optional<String> getMcasSnsTopic() {
    return mcasSnsTopic;
  }

  /**
   * @return Is AWS Marketplace Data Feeds Service (MDFS) full-sync done.
   */
  @JsonProperty("mdfsFullSyncDone")
  public Optional<Boolean> getMdfsFullSyncDone() {
    return mdfsFullSyncDone;
  }

  /**
   * @return KMS Key ARN for the S3 bucket of AWS Marketplace Data Feeds Service (MDFS)
   */
  @JsonProperty("mdfsKmsKeyArn")
  public Optional<String> getMdfsKmsKeyArn() {
    return mdfsKmsKeyArn;
  }

  /**
   * @return S3 bucket ARN for AWS Marketplace Data Feeds Service (MDFS)
   */
  @JsonProperty("mdfsS3BucketArn")
  public Optional<String> getMdfsS3BucketArn() {
    return mdfsS3BucketArn;
  }

  /**
   * @return The policy ARNs in the IAM role.
   */
  @JsonProperty("policyArns")
  public Optional<List<String>> getPolicyArns() {
    return policyArns;
  }

  /**
   * @return Is AWS Marketplace Revenue Record full-sync done.
   */
  @JsonProperty("revenueRecordFullSyncDone")
  public Optional<Boolean> getRevenueRecordFullSyncDone() {
    return revenueRecordFullSyncDone;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsMarketplaceIntegration && equalTo((SharedAwsMarketplaceIntegration) other);
  }

  private boolean equalTo(SharedAwsMarketplaceIntegration other) {
    return externalId.equals(other.externalId) && iamRoleArn.equals(other.iamRoleArn) && marketplaceStartDate.equals(other.marketplaceStartDate) && mcasFullSyncDone.equals(other.mcasFullSyncDone) && mcasIamRoleArn.equals(other.mcasIamRoleArn) && mcasS3Bucket.equals(other.mcasS3Bucket) && mcasSnsTopic.equals(other.mcasSnsTopic) && mdfsFullSyncDone.equals(other.mdfsFullSyncDone) && mdfsKmsKeyArn.equals(other.mdfsKmsKeyArn) && mdfsS3BucketArn.equals(other.mdfsS3BucketArn) && policyArns.equals(other.policyArns) && revenueRecordFullSyncDone.equals(other.revenueRecordFullSyncDone);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.externalId, this.iamRoleArn, this.marketplaceStartDate, this.mcasFullSyncDone, this.mcasIamRoleArn, this.mcasS3Bucket, this.mcasSnsTopic, this.mdfsFullSyncDone, this.mdfsKmsKeyArn, this.mdfsS3BucketArn, this.policyArns, this.revenueRecordFullSyncDone);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsMarketplaceIntegration{" + "externalId: " + externalId + ", iamRoleArn: " + iamRoleArn + ", marketplaceStartDate: " + marketplaceStartDate + ", mcasFullSyncDone: " + mcasFullSyncDone + ", mcasIamRoleArn: " + mcasIamRoleArn + ", mcasS3Bucket: " + mcasS3Bucket + ", mcasSnsTopic: " + mcasSnsTopic + ", mdfsFullSyncDone: " + mdfsFullSyncDone + ", mdfsKmsKeyArn: " + mdfsKmsKeyArn + ", mdfsS3BucketArn: " + mdfsS3BucketArn + ", policyArns: " + policyArns + ", revenueRecordFullSyncDone: " + revenueRecordFullSyncDone + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> externalId = Optional.empty();

    private Optional<String> iamRoleArn = Optional.empty();

    private Optional<String> marketplaceStartDate = Optional.empty();

    private Optional<Boolean> mcasFullSyncDone = Optional.empty();

    private Optional<String> mcasIamRoleArn = Optional.empty();

    private Optional<String> mcasS3Bucket = Optional.empty();

    private Optional<String> mcasSnsTopic = Optional.empty();

    private Optional<Boolean> mdfsFullSyncDone = Optional.empty();

    private Optional<String> mdfsKmsKeyArn = Optional.empty();

    private Optional<String> mdfsS3BucketArn = Optional.empty();

    private Optional<List<String>> policyArns = Optional.empty();

    private Optional<Boolean> revenueRecordFullSyncDone = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsMarketplaceIntegration other) {
      externalId(other.getExternalId());
      iamRoleArn(other.getIamRoleArn());
      marketplaceStartDate(other.getMarketplaceStartDate());
      mcasFullSyncDone(other.getMcasFullSyncDone());
      mcasIamRoleArn(other.getMcasIamRoleArn());
      mcasS3Bucket(other.getMcasS3Bucket());
      mcasSnsTopic(other.getMcasSnsTopic());
      mdfsFullSyncDone(other.getMdfsFullSyncDone());
      mdfsKmsKeyArn(other.getMdfsKmsKeyArn());
      mdfsS3BucketArn(other.getMdfsS3BucketArn());
      policyArns(other.getPolicyArns());
      revenueRecordFullSyncDone(other.getRevenueRecordFullSyncDone());
      return this;
    }

    @JsonSetter(
        value = "externalID",
        nulls = Nulls.SKIP
    )
    public Builder externalId(Optional<String> externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder externalId(String externalId) {
      this.externalId = Optional.of(externalId);
      return this;
    }

    @JsonSetter(
        value = "iamRoleArn",
        nulls = Nulls.SKIP
    )
    public Builder iamRoleArn(Optional<String> iamRoleArn) {
      this.iamRoleArn = iamRoleArn;
      return this;
    }

    public Builder iamRoleArn(String iamRoleArn) {
      this.iamRoleArn = Optional.of(iamRoleArn);
      return this;
    }

    @JsonSetter(
        value = "marketplaceStartDate",
        nulls = Nulls.SKIP
    )
    public Builder marketplaceStartDate(Optional<String> marketplaceStartDate) {
      this.marketplaceStartDate = marketplaceStartDate;
      return this;
    }

    public Builder marketplaceStartDate(String marketplaceStartDate) {
      this.marketplaceStartDate = Optional.of(marketplaceStartDate);
      return this;
    }

    @JsonSetter(
        value = "mcasFullSyncDone",
        nulls = Nulls.SKIP
    )
    public Builder mcasFullSyncDone(Optional<Boolean> mcasFullSyncDone) {
      this.mcasFullSyncDone = mcasFullSyncDone;
      return this;
    }

    public Builder mcasFullSyncDone(Boolean mcasFullSyncDone) {
      this.mcasFullSyncDone = Optional.of(mcasFullSyncDone);
      return this;
    }

    @JsonSetter(
        value = "mcasIamRoleArn",
        nulls = Nulls.SKIP
    )
    public Builder mcasIamRoleArn(Optional<String> mcasIamRoleArn) {
      this.mcasIamRoleArn = mcasIamRoleArn;
      return this;
    }

    public Builder mcasIamRoleArn(String mcasIamRoleArn) {
      this.mcasIamRoleArn = Optional.of(mcasIamRoleArn);
      return this;
    }

    @JsonSetter(
        value = "mcasS3Bucket",
        nulls = Nulls.SKIP
    )
    public Builder mcasS3Bucket(Optional<String> mcasS3Bucket) {
      this.mcasS3Bucket = mcasS3Bucket;
      return this;
    }

    public Builder mcasS3Bucket(String mcasS3Bucket) {
      this.mcasS3Bucket = Optional.of(mcasS3Bucket);
      return this;
    }

    @JsonSetter(
        value = "mcasSnsTopic",
        nulls = Nulls.SKIP
    )
    public Builder mcasSnsTopic(Optional<String> mcasSnsTopic) {
      this.mcasSnsTopic = mcasSnsTopic;
      return this;
    }

    public Builder mcasSnsTopic(String mcasSnsTopic) {
      this.mcasSnsTopic = Optional.of(mcasSnsTopic);
      return this;
    }

    @JsonSetter(
        value = "mdfsFullSyncDone",
        nulls = Nulls.SKIP
    )
    public Builder mdfsFullSyncDone(Optional<Boolean> mdfsFullSyncDone) {
      this.mdfsFullSyncDone = mdfsFullSyncDone;
      return this;
    }

    public Builder mdfsFullSyncDone(Boolean mdfsFullSyncDone) {
      this.mdfsFullSyncDone = Optional.of(mdfsFullSyncDone);
      return this;
    }

    @JsonSetter(
        value = "mdfsKmsKeyArn",
        nulls = Nulls.SKIP
    )
    public Builder mdfsKmsKeyArn(Optional<String> mdfsKmsKeyArn) {
      this.mdfsKmsKeyArn = mdfsKmsKeyArn;
      return this;
    }

    public Builder mdfsKmsKeyArn(String mdfsKmsKeyArn) {
      this.mdfsKmsKeyArn = Optional.of(mdfsKmsKeyArn);
      return this;
    }

    @JsonSetter(
        value = "mdfsS3BucketArn",
        nulls = Nulls.SKIP
    )
    public Builder mdfsS3BucketArn(Optional<String> mdfsS3BucketArn) {
      this.mdfsS3BucketArn = mdfsS3BucketArn;
      return this;
    }

    public Builder mdfsS3BucketArn(String mdfsS3BucketArn) {
      this.mdfsS3BucketArn = Optional.of(mdfsS3BucketArn);
      return this;
    }

    @JsonSetter(
        value = "policyArns",
        nulls = Nulls.SKIP
    )
    public Builder policyArns(Optional<List<String>> policyArns) {
      this.policyArns = policyArns;
      return this;
    }

    public Builder policyArns(List<String> policyArns) {
      this.policyArns = Optional.of(policyArns);
      return this;
    }

    @JsonSetter(
        value = "revenueRecordFullSyncDone",
        nulls = Nulls.SKIP
    )
    public Builder revenueRecordFullSyncDone(Optional<Boolean> revenueRecordFullSyncDone) {
      this.revenueRecordFullSyncDone = revenueRecordFullSyncDone;
      return this;
    }

    public Builder revenueRecordFullSyncDone(Boolean revenueRecordFullSyncDone) {
      this.revenueRecordFullSyncDone = Optional.of(revenueRecordFullSyncDone);
      return this;
    }

    public SharedAwsMarketplaceIntegration build() {
      return new SharedAwsMarketplaceIntegration(externalId, iamRoleArn, marketplaceStartDate, mcasFullSyncDone, mcasIamRoleArn, mcasS3Bucket, mcasSnsTopic, mdfsFullSyncDone, mdfsKmsKeyArn, mdfsS3BucketArn, policyArns, revenueRecordFullSyncDone);
    }
  }
}
