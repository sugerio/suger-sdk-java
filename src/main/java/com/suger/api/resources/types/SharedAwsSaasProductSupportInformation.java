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
    builder = SharedAwsSaasProductSupportInformation.Builder.class
)
public final class SharedAwsSaasProductSupportInformation {
  private final Optional<String> description;

  private int _cachedHashCode;

  SharedAwsSaasProductSupportInformation(Optional<String> description) {
    this.description = description;
  }

  @JsonProperty("Description")
  public Optional<String> getDescription() {
    return description;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsSaasProductSupportInformation && equalTo((SharedAwsSaasProductSupportInformation) other);
  }

  private boolean equalTo(SharedAwsSaasProductSupportInformation other) {
    return description.equals(other.description);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.description);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsSaasProductSupportInformation{" + "description: " + description + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> description = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsSaasProductSupportInformation other) {
      description(other.getDescription());
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

    public SharedAwsSaasProductSupportInformation build() {
      return new SharedAwsSaasProductSupportInformation(description);
    }
  }
}
