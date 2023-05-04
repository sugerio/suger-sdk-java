package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedMeteringDimension.Builder.class
)
public final class SharedMeteringDimension {
  private final Optional<String> category;

  private final Optional<String> description;

  private final Optional<List<AzureIncludedBaseQuantity>> includedBaseQuantities;

  private final Optional<String> key;

  private final Optional<String> name;

  private final Optional<Double> rate;

  private final Optional<List<String>> types;

  private final Optional<SharedUsageCount> usageCount;

  private final Optional<SharedValueType> valueType;

  private int _cachedHashCode;

  SharedMeteringDimension(Optional<String> category, Optional<String> description,
      Optional<List<AzureIncludedBaseQuantity>> includedBaseQuantities, Optional<String> key,
      Optional<String> name, Optional<Double> rate, Optional<List<String>> types,
      Optional<SharedUsageCount> usageCount, Optional<SharedValueType> valueType) {
    this.category = category;
    this.description = description;
    this.includedBaseQuantities = includedBaseQuantities;
    this.key = key;
    this.name = name;
    this.rate = rate;
    this.types = types;
    this.usageCount = usageCount;
    this.valueType = valueType;
  }

  @JsonProperty("category")
  public Optional<String> getCategory() {
    return category;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  /**
   * @return how many quantities of this dimension are included in the commit.
   */
  @JsonProperty("includedBaseQuantities")
  public Optional<List<AzureIncludedBaseQuantity>> getIncludedBaseQuantities() {
    return includedBaseQuantities;
  }

  @JsonProperty("key")
  public Optional<String> getKey() {
    return key;
  }

  /**
   * @return Display name of the dimension
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("rate")
  public Optional<Double> getRate() {
    return rate;
  }

  @JsonProperty("types")
  public Optional<List<String>> getTypes() {
    return types;
  }

  /**
   * @return The current Dimension Usage Count. Available when call GetEntitlement API.
   */
  @JsonProperty("usageCount")
  public Optional<SharedUsageCount> getUsageCount() {
    return usageCount;
  }

  @JsonProperty("valueType")
  public Optional<SharedValueType> getValueType() {
    return valueType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedMeteringDimension && equalTo((SharedMeteringDimension) other);
  }

  private boolean equalTo(SharedMeteringDimension other) {
    return category.equals(other.category) && description.equals(other.description) && includedBaseQuantities.equals(other.includedBaseQuantities) && key.equals(other.key) && name.equals(other.name) && rate.equals(other.rate) && types.equals(other.types) && usageCount.equals(other.usageCount) && valueType.equals(other.valueType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.category, this.description, this.includedBaseQuantities, this.key, this.name, this.rate, this.types, this.usageCount, this.valueType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedMeteringDimension{" + "category: " + category + ", description: " + description + ", includedBaseQuantities: " + includedBaseQuantities + ", key: " + key + ", name: " + name + ", rate: " + rate + ", types: " + types + ", usageCount: " + usageCount + ", valueType: " + valueType + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> category = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<List<AzureIncludedBaseQuantity>> includedBaseQuantities = Optional.empty();

    private Optional<String> key = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<Double> rate = Optional.empty();

    private Optional<List<String>> types = Optional.empty();

    private Optional<SharedUsageCount> usageCount = Optional.empty();

    private Optional<SharedValueType> valueType = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedMeteringDimension other) {
      category(other.getCategory());
      description(other.getDescription());
      includedBaseQuantities(other.getIncludedBaseQuantities());
      key(other.getKey());
      name(other.getName());
      rate(other.getRate());
      types(other.getTypes());
      usageCount(other.getUsageCount());
      valueType(other.getValueType());
      return this;
    }

    @JsonSetter(
        value = "category",
        nulls = Nulls.SKIP
    )
    public Builder category(Optional<String> category) {
      this.category = category;
      return this;
    }

    public Builder category(String category) {
      this.category = Optional.of(category);
      return this;
    }

    @JsonSetter(
        value = "description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<String> description) {
      this.description = description;
      return this;
    }

    public Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }

    @JsonSetter(
        value = "includedBaseQuantities",
        nulls = Nulls.SKIP
    )
    public Builder includedBaseQuantities(
        Optional<List<AzureIncludedBaseQuantity>> includedBaseQuantities) {
      this.includedBaseQuantities = includedBaseQuantities;
      return this;
    }

    public Builder includedBaseQuantities(List<AzureIncludedBaseQuantity> includedBaseQuantities) {
      this.includedBaseQuantities = Optional.of(includedBaseQuantities);
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
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "rate",
        nulls = Nulls.SKIP
    )
    public Builder rate(Optional<Double> rate) {
      this.rate = rate;
      return this;
    }

    public Builder rate(Double rate) {
      this.rate = Optional.of(rate);
      return this;
    }

    @JsonSetter(
        value = "types",
        nulls = Nulls.SKIP
    )
    public Builder types(Optional<List<String>> types) {
      this.types = types;
      return this;
    }

    public Builder types(List<String> types) {
      this.types = Optional.of(types);
      return this;
    }

    @JsonSetter(
        value = "usageCount",
        nulls = Nulls.SKIP
    )
    public Builder usageCount(Optional<SharedUsageCount> usageCount) {
      this.usageCount = usageCount;
      return this;
    }

    public Builder usageCount(SharedUsageCount usageCount) {
      this.usageCount = Optional.of(usageCount);
      return this;
    }

    @JsonSetter(
        value = "valueType",
        nulls = Nulls.SKIP
    )
    public Builder valueType(Optional<SharedValueType> valueType) {
      this.valueType = valueType;
      return this;
    }

    public Builder valueType(SharedValueType valueType) {
      this.valueType = Optional.of(valueType);
      return this;
    }

    public SharedMeteringDimension build() {
      return new SharedMeteringDimension(category, description, includedBaseQuantities, key, name, rate, types, usageCount, valueType);
    }
  }
}
