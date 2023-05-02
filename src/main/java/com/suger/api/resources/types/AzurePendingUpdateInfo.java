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
    builder = AzurePendingUpdateInfo.Builder.class
)
public final class AzurePendingUpdateInfo {
  private final Optional<String> status;

  private final Optional<String> updateType;

  private int _cachedHashCode;

  AzurePendingUpdateInfo(Optional<String> status, Optional<String> updateType) {
    this.status = status;
    this.updateType = updateType;
  }

  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  @JsonProperty("updateType")
  public Optional<String> getUpdateType() {
    return updateType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzurePendingUpdateInfo && equalTo((AzurePendingUpdateInfo) other);
  }

  private boolean equalTo(AzurePendingUpdateInfo other) {
    return status.equals(other.status) && updateType.equals(other.updateType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.status, this.updateType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzurePendingUpdateInfo{" + "status: " + status + ", updateType: " + updateType + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> status = Optional.empty();

    private Optional<String> updateType = Optional.empty();

    private Builder() {
    }

    public Builder from(AzurePendingUpdateInfo other) {
      status(other.getStatus());
      updateType(other.getUpdateType());
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<String> status) {
      this.status = status;
      return this;
    }

    public Builder status(String status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "updateType",
        nulls = Nulls.SKIP
    )
    public Builder updateType(Optional<String> updateType) {
      this.updateType = updateType;
      return this;
    }

    public Builder updateType(String updateType) {
      this.updateType = Optional.of(updateType);
      return this;
    }

    public AzurePendingUpdateInfo build() {
      return new AzurePendingUpdateInfo(status, updateType);
    }
  }
}
