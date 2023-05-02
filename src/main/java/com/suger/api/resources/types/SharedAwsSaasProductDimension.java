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
    builder = SharedAwsSaasProductDimension.Builder.class
)
public final class SharedAwsSaasProductDimension {
  private final Optional<String> description;

  private final Optional<String> key;

  private final Optional<String> name;

  private final Optional<List<String>> types;

  private final Optional<String> unit;

  private int _cachedHashCode;

  SharedAwsSaasProductDimension(Optional<String> description, Optional<String> key,
      Optional<String> name, Optional<List<String>> types, Optional<String> unit) {
    this.description = description;
    this.key = key;
    this.name = name;
    this.types = types;
    this.unit = unit;
  }

  @JsonProperty("Description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("Key")
  public Optional<String> getKey() {
    return key;
  }

  @JsonProperty("Name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("Types")
  public Optional<List<String>> getTypes() {
    return types;
  }

  @JsonProperty("Unit")
  public Optional<String> getUnit() {
    return unit;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsSaasProductDimension && equalTo((SharedAwsSaasProductDimension) other);
  }

  private boolean equalTo(SharedAwsSaasProductDimension other) {
    return description.equals(other.description) && key.equals(other.key) && name.equals(other.name) && types.equals(other.types) && unit.equals(other.unit);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.description, this.key, this.name, this.types, this.unit);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsSaasProductDimension{" + "description: " + description + ", key: " + key + ", name: " + name + ", types: " + types + ", unit: " + unit + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> description = Optional.empty();

    private Optional<String> key = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<List<String>> types = Optional.empty();

    private Optional<String> unit = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsSaasProductDimension other) {
      description(other.getDescription());
      key(other.getKey());
      name(other.getName());
      types(other.getTypes());
      unit(other.getUnit());
      return this;
    }

    @JsonSetter(
        value = "Description",
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
        value = "Key",
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
        value = "Name",
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
        value = "Types",
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
        value = "Unit",
        nulls = Nulls.SKIP
    )
    public Builder unit(Optional<String> unit) {
      this.unit = unit;
      return this;
    }

    public Builder unit(String unit) {
      this.unit = Optional.of(unit);
      return this;
    }

    public SharedAwsSaasProductDimension build() {
      return new SharedAwsSaasProductDimension(description, key, name, types, unit);
    }
  }
}
