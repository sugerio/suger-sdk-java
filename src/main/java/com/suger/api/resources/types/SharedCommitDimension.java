package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedCommitDimension.Builder.class
)
public final class SharedCommitDimension {
  private final Optional<String> category;

  private final Optional<String> description;

  private final Optional<Boolean> isUserCreated;

  private final Optional<String> key;

  private final Optional<Integer> length;

  private final Optional<Integer> maximumUsers;

  private final Optional<Integer> minimumUsers;

  private final Optional<String> name;

  private final Optional<Integer> quantity;

  private final Optional<Double> rate;

  private final Optional<SharedCommitDimensionTimeUnit> timeUnit;

  private final Optional<SharedCommitDimensionType> type;

  private final Optional<List<String>> types;

  private int _cachedHashCode;

  SharedCommitDimension(Optional<String> category, Optional<String> description,
      Optional<Boolean> isUserCreated, Optional<String> key, Optional<Integer> length,
      Optional<Integer> maximumUsers, Optional<Integer> minimumUsers, Optional<String> name,
      Optional<Integer> quantity, Optional<Double> rate,
      Optional<SharedCommitDimensionTimeUnit> timeUnit, Optional<SharedCommitDimensionType> type,
      Optional<List<String>> types) {
    this.category = category;
    this.description = description;
    this.isUserCreated = isUserCreated;
    this.key = key;
    this.length = length;
    this.maximumUsers = maximumUsers;
    this.minimumUsers = minimumUsers;
    this.name = name;
    this.quantity = quantity;
    this.rate = rate;
    this.timeUnit = timeUnit;
    this.type = type;
    this.types = types;
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
   * @return Whether this commit dimension is newly created by user when creating AWS Marketplace Contract private offer.
   */
  @JsonProperty("isUserCreated")
  public Optional<Boolean> getIsUserCreated() {
    return isUserCreated;
  }

  /**
   * @return API name of the dimension
   */
  @JsonProperty("key")
  public Optional<String> getKey() {
    return key;
  }

  /**
   * @return The term length for the commit amount, such as 6 months, or 1 year. length is used together with timeUnit
   */
  @JsonProperty("length")
  public Optional<Integer> getLength() {
    return length;
  }

  /**
   * @return The maximum number of users for PER_USER commit
   */
  @JsonProperty("maximumUsers")
  public Optional<Integer> getMaximumUsers() {
    return maximumUsers;
  }

  /**
   * @return The minimum number of users for PER_USER commit
   */
  @JsonProperty("minimumUsers")
  public Optional<Integer> getMinimumUsers() {
    return minimumUsers;
  }

  /**
   * @return Display name of the dimension
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return The quantity of this commit.
   */
  @JsonProperty("quantity")
  public Optional<Integer> getQuantity() {
    return quantity;
  }

  /**
   * @return The commit amount.
   */
  @JsonProperty("rate")
  public Optional<Double> getRate() {
    return rate;
  }

  /**
   * @return The term unit for the commit amount.
   */
  @JsonProperty("timeUnit")
  public Optional<SharedCommitDimensionTimeUnit> getTimeUnit() {
    return timeUnit;
  }

  @JsonProperty("type")
  public Optional<SharedCommitDimensionType> getType() {
    return type;
  }

  @JsonProperty("types")
  public Optional<List<String>> getTypes() {
    return types;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedCommitDimension && equalTo((SharedCommitDimension) other);
  }

  private boolean equalTo(SharedCommitDimension other) {
    return category.equals(other.category) && description.equals(other.description) && isUserCreated.equals(other.isUserCreated) && key.equals(other.key) && length.equals(other.length) && maximumUsers.equals(other.maximumUsers) && minimumUsers.equals(other.minimumUsers) && name.equals(other.name) && quantity.equals(other.quantity) && rate.equals(other.rate) && timeUnit.equals(other.timeUnit) && type.equals(other.type) && types.equals(other.types);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.category, this.description, this.isUserCreated, this.key, this.length, this.maximumUsers, this.minimumUsers, this.name, this.quantity, this.rate, this.timeUnit, this.type, this.types);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedCommitDimension{" + "category: " + category + ", description: " + description + ", isUserCreated: " + isUserCreated + ", key: " + key + ", length: " + length + ", maximumUsers: " + maximumUsers + ", minimumUsers: " + minimumUsers + ", name: " + name + ", quantity: " + quantity + ", rate: " + rate + ", timeUnit: " + timeUnit + ", type: " + type + ", types: " + types + "}";
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

    private Optional<Boolean> isUserCreated = Optional.empty();

    private Optional<String> key = Optional.empty();

    private Optional<Integer> length = Optional.empty();

    private Optional<Integer> maximumUsers = Optional.empty();

    private Optional<Integer> minimumUsers = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<Integer> quantity = Optional.empty();

    private Optional<Double> rate = Optional.empty();

    private Optional<SharedCommitDimensionTimeUnit> timeUnit = Optional.empty();

    private Optional<SharedCommitDimensionType> type = Optional.empty();

    private Optional<List<String>> types = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedCommitDimension other) {
      category(other.getCategory());
      description(other.getDescription());
      isUserCreated(other.getIsUserCreated());
      key(other.getKey());
      length(other.getLength());
      maximumUsers(other.getMaximumUsers());
      minimumUsers(other.getMinimumUsers());
      name(other.getName());
      quantity(other.getQuantity());
      rate(other.getRate());
      timeUnit(other.getTimeUnit());
      type(other.getType());
      types(other.getTypes());
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
        value = "isUserCreated",
        nulls = Nulls.SKIP
    )
    public Builder isUserCreated(Optional<Boolean> isUserCreated) {
      this.isUserCreated = isUserCreated;
      return this;
    }

    public Builder isUserCreated(Boolean isUserCreated) {
      this.isUserCreated = Optional.of(isUserCreated);
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
        value = "length",
        nulls = Nulls.SKIP
    )
    public Builder length(Optional<Integer> length) {
      this.length = length;
      return this;
    }

    public Builder length(Integer length) {
      this.length = Optional.of(length);
      return this;
    }

    @JsonSetter(
        value = "maximumUsers",
        nulls = Nulls.SKIP
    )
    public Builder maximumUsers(Optional<Integer> maximumUsers) {
      this.maximumUsers = maximumUsers;
      return this;
    }

    public Builder maximumUsers(Integer maximumUsers) {
      this.maximumUsers = Optional.of(maximumUsers);
      return this;
    }

    @JsonSetter(
        value = "minimumUsers",
        nulls = Nulls.SKIP
    )
    public Builder minimumUsers(Optional<Integer> minimumUsers) {
      this.minimumUsers = minimumUsers;
      return this;
    }

    public Builder minimumUsers(Integer minimumUsers) {
      this.minimumUsers = Optional.of(minimumUsers);
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
        value = "quantity",
        nulls = Nulls.SKIP
    )
    public Builder quantity(Optional<Integer> quantity) {
      this.quantity = quantity;
      return this;
    }

    public Builder quantity(Integer quantity) {
      this.quantity = Optional.of(quantity);
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
        value = "timeUnit",
        nulls = Nulls.SKIP
    )
    public Builder timeUnit(Optional<SharedCommitDimensionTimeUnit> timeUnit) {
      this.timeUnit = timeUnit;
      return this;
    }

    public Builder timeUnit(SharedCommitDimensionTimeUnit timeUnit) {
      this.timeUnit = Optional.of(timeUnit);
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<SharedCommitDimensionType> type) {
      this.type = type;
      return this;
    }

    public Builder type(SharedCommitDimensionType type) {
      this.type = Optional.of(type);
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

    public SharedCommitDimension build() {
      return new SharedCommitDimension(category, description, isUserCreated, key, length, maximumUsers, minimumUsers, name, quantity, rate, timeUnit, type, types);
    }
  }
}
