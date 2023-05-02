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
    builder = TypesUsageAllocation.Builder.class
)
public final class TypesUsageAllocation {
  private final Optional<Integer> allocatedUsageQuantity;

  private final Optional<List<GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag>> tags;

  private int _cachedHashCode;

  TypesUsageAllocation(Optional<Integer> allocatedUsageQuantity,
      Optional<List<GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag>> tags) {
    this.allocatedUsageQuantity = allocatedUsageQuantity;
    this.tags = tags;
  }

  /**
   * @return The total quantity allocated to this bucket of usage.
   * <p>This member is required.</p>
   */
  @JsonProperty("allocatedUsageQuantity")
  public Optional<Integer> getAllocatedUsageQuantity() {
    return allocatedUsageQuantity;
  }

  /**
   * @return The set of tags that define the bucket of usage. For the bucket of items with no
   * tags, this parameter can be left out.
   */
  @JsonProperty("tags")
  public Optional<List<GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag>> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TypesUsageAllocation && equalTo((TypesUsageAllocation) other);
  }

  private boolean equalTo(TypesUsageAllocation other) {
    return allocatedUsageQuantity.equals(other.allocatedUsageQuantity) && tags.equals(other.tags);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.allocatedUsageQuantity, this.tags);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TypesUsageAllocation{" + "allocatedUsageQuantity: " + allocatedUsageQuantity + ", tags: " + tags + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> allocatedUsageQuantity = Optional.empty();

    private Optional<List<GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag>> tags = Optional.empty();

    private Builder() {
    }

    public Builder from(TypesUsageAllocation other) {
      allocatedUsageQuantity(other.getAllocatedUsageQuantity());
      tags(other.getTags());
      return this;
    }

    @JsonSetter(
        value = "allocatedUsageQuantity",
        nulls = Nulls.SKIP
    )
    public Builder allocatedUsageQuantity(Optional<Integer> allocatedUsageQuantity) {
      this.allocatedUsageQuantity = allocatedUsageQuantity;
      return this;
    }

    public Builder allocatedUsageQuantity(Integer allocatedUsageQuantity) {
      this.allocatedUsageQuantity = Optional.of(allocatedUsageQuantity);
      return this;
    }

    @JsonSetter(
        value = "tags",
        nulls = Nulls.SKIP
    )
    public Builder tags(
        Optional<List<GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag>> tags) {
      this.tags = tags;
      return this;
    }

    public Builder tags(List<GithubComAwsAwsSdkGoV2ServiceMarketplacemeteringTypesTag> tags) {
      this.tags = Optional.of(tags);
      return this;
    }

    public TypesUsageAllocation build() {
      return new TypesUsageAllocation(allocatedUsageQuantity, tags);
    }
  }
}
