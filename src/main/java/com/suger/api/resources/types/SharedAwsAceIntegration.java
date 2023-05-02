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
    builder = SharedAwsAceIntegration.Builder.class
)
public final class SharedAwsAceIntegration {
  private final Optional<SharedAwsIntegrationCredential> credential;

  private final Optional<String> partnerId;

  private final Optional<String> s3BucketName;

  private final Optional<String> s3BucketRegion;

  private final Optional<String> secretKey;

  private int _cachedHashCode;

  SharedAwsAceIntegration(Optional<SharedAwsIntegrationCredential> credential,
      Optional<String> partnerId, Optional<String> s3BucketName, Optional<String> s3BucketRegion,
      Optional<String> secretKey) {
    this.credential = credential;
    this.partnerId = partnerId;
    this.s3BucketName = s3BucketName;
    this.s3BucketRegion = s3BucketRegion;
    this.secretKey = secretKey;
  }

  @JsonProperty("credential")
  public Optional<SharedAwsIntegrationCredential> getCredential() {
    return credential;
  }

  /**
   * @return The partner ID of the ISV/Seller in AWS Partner Network.
   */
  @JsonProperty("partnerId")
  public Optional<String> getPartnerId() {
    return partnerId;
  }

  /**
   * @return The Name of the S3 bucket for AWS APN Customer Engagement Program (ACE) to sync the leads &amp; opportunities.
   */
  @JsonProperty("s3BucketName")
  public Optional<String> getS3BucketName() {
    return s3BucketName;
  }

  /**
   * @return The region of the S3 bucket for AWS APN Customer Engagement Program (ACE) to sync the leads &amp; opportunities.
   */
  @JsonProperty("s3BucketRegion")
  public Optional<String> getS3BucketRegion() {
    return s3BucketRegion;
  }

  /**
   * @return The secret key used to store the AzureIntegrationCredential in AWS Secret manager. for internal usage only.
   */
  @JsonProperty("secretKey")
  public Optional<String> getSecretKey() {
    return secretKey;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsAceIntegration && equalTo((SharedAwsAceIntegration) other);
  }

  private boolean equalTo(SharedAwsAceIntegration other) {
    return credential.equals(other.credential) && partnerId.equals(other.partnerId) && s3BucketName.equals(other.s3BucketName) && s3BucketRegion.equals(other.s3BucketRegion) && secretKey.equals(other.secretKey);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.credential, this.partnerId, this.s3BucketName, this.s3BucketRegion, this.secretKey);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsAceIntegration{" + "credential: " + credential + ", partnerId: " + partnerId + ", s3BucketName: " + s3BucketName + ", s3BucketRegion: " + s3BucketRegion + ", secretKey: " + secretKey + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SharedAwsIntegrationCredential> credential = Optional.empty();

    private Optional<String> partnerId = Optional.empty();

    private Optional<String> s3BucketName = Optional.empty();

    private Optional<String> s3BucketRegion = Optional.empty();

    private Optional<String> secretKey = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsAceIntegration other) {
      credential(other.getCredential());
      partnerId(other.getPartnerId());
      s3BucketName(other.getS3BucketName());
      s3BucketRegion(other.getS3BucketRegion());
      secretKey(other.getSecretKey());
      return this;
    }

    @JsonSetter(
        value = "credential",
        nulls = Nulls.SKIP
    )
    public Builder credential(Optional<SharedAwsIntegrationCredential> credential) {
      this.credential = credential;
      return this;
    }

    public Builder credential(SharedAwsIntegrationCredential credential) {
      this.credential = Optional.of(credential);
      return this;
    }

    @JsonSetter(
        value = "partnerId",
        nulls = Nulls.SKIP
    )
    public Builder partnerId(Optional<String> partnerId) {
      this.partnerId = partnerId;
      return this;
    }

    public Builder partnerId(String partnerId) {
      this.partnerId = Optional.of(partnerId);
      return this;
    }

    @JsonSetter(
        value = "s3BucketName",
        nulls = Nulls.SKIP
    )
    public Builder s3BucketName(Optional<String> s3BucketName) {
      this.s3BucketName = s3BucketName;
      return this;
    }

    public Builder s3BucketName(String s3BucketName) {
      this.s3BucketName = Optional.of(s3BucketName);
      return this;
    }

    @JsonSetter(
        value = "s3BucketRegion",
        nulls = Nulls.SKIP
    )
    public Builder s3BucketRegion(Optional<String> s3BucketRegion) {
      this.s3BucketRegion = s3BucketRegion;
      return this;
    }

    public Builder s3BucketRegion(String s3BucketRegion) {
      this.s3BucketRegion = Optional.of(s3BucketRegion);
      return this;
    }

    @JsonSetter(
        value = "secretKey",
        nulls = Nulls.SKIP
    )
    public Builder secretKey(Optional<String> secretKey) {
      this.secretKey = secretKey;
      return this;
    }

    public Builder secretKey(String secretKey) {
      this.secretKey = Optional.of(secretKey);
      return this;
    }

    public SharedAwsAceIntegration build() {
      return new SharedAwsAceIntegration(credential, partnerId, s3BucketName, s3BucketRegion, secretKey);
    }
  }
}
