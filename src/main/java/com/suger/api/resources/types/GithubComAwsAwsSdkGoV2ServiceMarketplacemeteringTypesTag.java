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
    builder = GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag.Builder.class
)
public final class GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag {
  private final Optional<String> key;

  private final Optional<String> value;

  private int _cachedHashCode;

  GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag(Optional<String> key,
      Optional<String> value) {
    this.key = key;
    this.value = value;
  }

  /**
   * @return One part of a key-value pair that makes up a tag. A key is a label that acts
   * like a category for the specific tag values.
   * <p>This member is required.</p>
   */
  @JsonProperty("key")
  public Optional<String> getKey() {
    return key;
  }

  /**
   * @return One part of a key-value pair that makes up a tag. A value acts as a descriptor
   * within a tag category (key). The value can be empty or null.
   * <p>This member is required.</p>
   */
  @JsonProperty("value")
  public Optional<String> getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag && equalTo((GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag) other);
  }

  private boolean equalTo(GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag other) {
    return key.equals(other.key) && value.equals(other.value);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.key, this.value);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag{" + "key: " + key + ", value: " + value + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> key = Optional.empty();

    private Optional<String> value = Optional.empty();

    private Builder() {
    }

    public Builder from(GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag other) {
      key(other.getKey());
      value(other.getValue());
      return this;
    }

    @JsonSetter(
        value = "key",
        nulls = Nulls.SKIP
    )
    public Builder key(Optional<String> key) {
      this.key = key;
      return this;
    }

    public Builder key(String key) {
      this.key = Optional.of(key);
      return this;
    }

    @JsonSetter(
        value = "value",
        nulls = Nulls.SKIP
    )
    public Builder value(Optional<String> value) {
      this.value = value;
      return this;
    }

    public Builder value(String value) {
      this.value = Optional.of(value);
      return this;
    }

    public GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag build() {
      return new GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag(key, value);
    }
  }
}
