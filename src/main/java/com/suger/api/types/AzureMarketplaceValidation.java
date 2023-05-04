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
    builder = AzureMarketplaceValidation.Builder.class
)
public final class AzureMarketplaceValidation {
  private final Optional<String> schema;

  private final Optional<AzureMarketplaceValidationCode> code;

  private final Optional<AzureMarketplaceValidationLevel> level;

  private final Optional<String> message;

  private final Optional<String> resourceId;

  private int _cachedHashCode;

  AzureMarketplaceValidation(Optional<String> schema, Optional<AzureMarketplaceValidationCode> code,
      Optional<AzureMarketplaceValidationLevel> level, Optional<String> message,
      Optional<String> resourceId) {
    this.schema = schema;
    this.code = code;
    this.level = level;
    this.message = message;
    this.resourceId = resourceId;
  }

  @JsonProperty("$schema")
  public Optional<String> getSchema() {
    return schema;
  }

  @JsonProperty("code")
  public Optional<AzureMarketplaceValidationCode> getCode() {
    return code;
  }

  @JsonProperty("level")
  public Optional<AzureMarketplaceValidationLevel> getLevel() {
    return level;
  }

  @JsonProperty("message")
  public Optional<String> getMessage() {
    return message;
  }

  @JsonProperty("resourceId")
  public Optional<String> getResourceId() {
    return resourceId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureMarketplaceValidation && equalTo((AzureMarketplaceValidation) other);
  }

  private boolean equalTo(AzureMarketplaceValidation other) {
    return schema.equals(other.schema) && code.equals(other.code) && level.equals(other.level) && message.equals(other.message) && resourceId.equals(other.resourceId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.schema, this.code, this.level, this.message, this.resourceId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureMarketplaceValidation{" + "schema: " + schema + ", code: " + code + ", level: " + level + ", message: " + message + ", resourceId: " + resourceId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> schema = Optional.empty();

    private Optional<AzureMarketplaceValidationCode> code = Optional.empty();

    private Optional<AzureMarketplaceValidationLevel> level = Optional.empty();

    private Optional<String> message = Optional.empty();

    private Optional<String> resourceId = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureMarketplaceValidation other) {
      schema(other.getSchema());
      code(other.getCode());
      level(other.getLevel());
      message(other.getMessage());
      resourceId(other.getResourceId());
      return this;
    }

    @JsonSetter(
        value = "$schema",
        nulls = Nulls.SKIP
    )
    public Builder schema(Optional<String> schema) {
      this.schema = schema;
      return this;
    }

    public Builder schema(String schema) {
      this.schema = Optional.of(schema);
      return this;
    }

    @JsonSetter(
        value = "code",
        nulls = Nulls.SKIP
    )
    public Builder code(Optional<AzureMarketplaceValidationCode> code) {
      this.code = code;
      return this;
    }

    public Builder code(AzureMarketplaceValidationCode code) {
      this.code = Optional.of(code);
      return this;
    }

    @JsonSetter(
        value = "level",
        nulls = Nulls.SKIP
    )
    public Builder level(Optional<AzureMarketplaceValidationLevel> level) {
      this.level = level;
      return this;
    }

    public Builder level(AzureMarketplaceValidationLevel level) {
      this.level = Optional.of(level);
      return this;
    }

    @JsonSetter(
        value = "message",
        nulls = Nulls.SKIP
    )
    public Builder message(Optional<String> message) {
      this.message = message;
      return this;
    }

    public Builder message(String message) {
      this.message = Optional.of(message);
      return this;
    }

    @JsonSetter(
        value = "resourceId",
        nulls = Nulls.SKIP
    )
    public Builder resourceId(Optional<String> resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    public Builder resourceId(String resourceId) {
      this.resourceId = Optional.of(resourceId);
      return this;
    }

    public AzureMarketplaceValidation build() {
      return new AzureMarketplaceValidation(schema, code, level, message, resourceId);
    }
  }
}
