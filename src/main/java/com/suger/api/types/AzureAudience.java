package com.suger.api.types;

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
    builder = AzureAudience.Builder.class
)
public final class AzureAudience {
  private final Optional<String> description;

  private final Optional<String> id;

  private int _cachedHashCode;

  AzureAudience(Optional<String> description, Optional<String> id) {
    this.description = description;
    this.id = id;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureAudience && equalTo((AzureAudience) other);
  }

  private boolean equalTo(AzureAudience other) {
    return description.equals(other.description) && id.equals(other.id);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.description, this.id);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureAudience{" + "description: " + description + ", id: " + id + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> description = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureAudience other) {
      description(other.getDescription());
      id(other.getId());
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
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<String> id) {
      this.id = id;
      return this;
    }

    public Builder id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    public AzureAudience build() {
      return new AzureAudience(description, id);
    }
  }
}
