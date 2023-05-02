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
    builder = SharedEntitlementTermInfo.Builder.class
)
public final class SharedEntitlementTermInfo {
  private final Optional<SharedEntitlementTermType> type;

  private int _cachedHashCode;

  SharedEntitlementTermInfo(Optional<SharedEntitlementTermType> type) {
    this.type = type;
  }

  @JsonProperty("type")
  public Optional<SharedEntitlementTermType> getType() {
    return type;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedEntitlementTermInfo && equalTo((SharedEntitlementTermInfo) other);
  }

  private boolean equalTo(SharedEntitlementTermInfo other) {
    return type.equals(other.type);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedEntitlementTermInfo{" + "type: " + type + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SharedEntitlementTermType> type = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedEntitlementTermInfo other) {
      type(other.getType());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<SharedEntitlementTermType> type) {
      this.type = type;
      return this;
    }

    public Builder type(SharedEntitlementTermType type) {
      this.type = Optional.of(type);
      return this;
    }

    public SharedEntitlementTermInfo build() {
      return new SharedEntitlementTermInfo(type);
    }
  }
}
