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
    builder = SharedAwsIntegrationCredential.Builder.class
)
public final class SharedAwsIntegrationCredential {
  private final Optional<String> accessKeyId;

  private final Optional<String> iamUserArn;

  private final Optional<String> secretAccessKey;

  private int _cachedHashCode;

  SharedAwsIntegrationCredential(Optional<String> accessKeyId, Optional<String> iamUserArn,
      Optional<String> secretAccessKey) {
    this.accessKeyId = accessKeyId;
    this.iamUserArn = iamUserArn;
    this.secretAccessKey = secretAccessKey;
  }

  /**
   * @return The access key ID of the IAM user for Suger service to access the client's AWS services.
   */
  @JsonProperty("accessKeyId")
  public Optional<String> getAccessKeyId() {
    return accessKeyId;
  }

  /**
   * @return The ARN of the IAM user for Suger service to access the client's AWS services.
   */
  @JsonProperty("iamUserArn")
  public Optional<String> getIamUserArn() {
    return iamUserArn;
  }

  /**
   * @return The secret access key of the IAM user for Suger service to access the client's AWS services.
   */
  @JsonProperty("secretAccessKey")
  public Optional<String> getSecretAccessKey() {
    return secretAccessKey;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsIntegrationCredential && equalTo((SharedAwsIntegrationCredential) other);
  }

  private boolean equalTo(SharedAwsIntegrationCredential other) {
    return accessKeyId.equals(other.accessKeyId) && iamUserArn.equals(other.iamUserArn) && secretAccessKey.equals(other.secretAccessKey);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accessKeyId, this.iamUserArn, this.secretAccessKey);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsIntegrationCredential{" + "accessKeyId: " + accessKeyId + ", iamUserArn: " + iamUserArn + ", secretAccessKey: " + secretAccessKey + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> accessKeyId = Optional.empty();

    private Optional<String> iamUserArn = Optional.empty();

    private Optional<String> secretAccessKey = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsIntegrationCredential other) {
      accessKeyId(other.getAccessKeyId());
      iamUserArn(other.getIamUserArn());
      secretAccessKey(other.getSecretAccessKey());
      return this;
    }

    @JsonSetter(
        value = "accessKeyId",
        nulls = Nulls.SKIP
    )
    public Builder accessKeyId(Optional<String> accessKeyId) {
      this.accessKeyId = accessKeyId;
      return this;
    }

    public Builder accessKeyId(String accessKeyId) {
      this.accessKeyId = Optional.of(accessKeyId);
      return this;
    }

    @JsonSetter(
        value = "iamUserArn",
        nulls = Nulls.SKIP
    )
    public Builder iamUserArn(Optional<String> iamUserArn) {
      this.iamUserArn = iamUserArn;
      return this;
    }

    public Builder iamUserArn(String iamUserArn) {
      this.iamUserArn = Optional.of(iamUserArn);
      return this;
    }

    @JsonSetter(
        value = "secretAccessKey",
        nulls = Nulls.SKIP
    )
    public Builder secretAccessKey(Optional<String> secretAccessKey) {
      this.secretAccessKey = secretAccessKey;
      return this;
    }

    public Builder secretAccessKey(String secretAccessKey) {
      this.secretAccessKey = Optional.of(secretAccessKey);
      return this;
    }

    public SharedAwsIntegrationCredential build() {
      return new SharedAwsIntegrationCredential(accessKeyId, iamUserArn, secretAccessKey);
    }
  }
}
