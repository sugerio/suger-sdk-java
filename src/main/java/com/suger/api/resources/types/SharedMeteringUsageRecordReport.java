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
    builder = SharedMeteringUsageRecordReport.Builder.class
)
public final class SharedMeteringUsageRecordReport {
  private final Optional<String> creationTime;

  private final Optional<String> entitlementId;

  private final Optional<String> entitlementTermId;

  private final Optional<String> id;

  private final Optional<SharedMeteringUsageRecordReportInfo> info;

  private final Optional<String> organizationId;

  private final Optional<String> productId;

  private int _cachedHashCode;

  SharedMeteringUsageRecordReport(Optional<String> creationTime, Optional<String> entitlementId,
      Optional<String> entitlementTermId, Optional<String> id,
      Optional<SharedMeteringUsageRecordReportInfo> info, Optional<String> organizationId,
      Optional<String> productId) {
    this.creationTime = creationTime;
    this.entitlementId = entitlementId;
    this.entitlementTermId = entitlementTermId;
    this.id = id;
    this.info = info;
    this.organizationId = organizationId;
    this.productId = productId;
  }

  @JsonProperty("creationTime")
  public Optional<String> getCreationTime() {
    return creationTime;
  }

  @JsonProperty("entitlementID")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("entitlementTermID")
  public Optional<String> getEntitlementTermId() {
    return entitlementTermId;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("info")
  public Optional<SharedMeteringUsageRecordReportInfo> getInfo() {
    return info;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("productID")
  public Optional<String> getProductId() {
    return productId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedMeteringUsageRecordReport && equalTo((SharedMeteringUsageRecordReport) other);
  }

  private boolean equalTo(SharedMeteringUsageRecordReport other) {
    return creationTime.equals(other.creationTime) && entitlementId.equals(other.entitlementId) && entitlementTermId.equals(other.entitlementTermId) && id.equals(other.id) && info.equals(other.info) && organizationId.equals(other.organizationId) && productId.equals(other.productId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.creationTime, this.entitlementId, this.entitlementTermId, this.id, this.info, this.organizationId, this.productId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedMeteringUsageRecordReport{" + "creationTime: " + creationTime + ", entitlementId: " + entitlementId + ", entitlementTermId: " + entitlementTermId + ", id: " + id + ", info: " + info + ", organizationId: " + organizationId + ", productId: " + productId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> creationTime = Optional.empty();

    private Optional<String> entitlementId = Optional.empty();

    private Optional<String> entitlementTermId = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<SharedMeteringUsageRecordReportInfo> info = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<String> productId = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedMeteringUsageRecordReport other) {
      creationTime(other.getCreationTime());
      entitlementId(other.getEntitlementId());
      entitlementTermId(other.getEntitlementTermId());
      id(other.getId());
      info(other.getInfo());
      organizationId(other.getOrganizationId());
      productId(other.getProductId());
      return this;
    }

    @JsonSetter(
        value = "creationTime",
        nulls = Nulls.SKIP
    )
    public Builder creationTime(Optional<String> creationTime) {
      this.creationTime = creationTime;
      return this;
    }

    public Builder creationTime(String creationTime) {
      this.creationTime = Optional.of(creationTime);
      return this;
    }

    @JsonSetter(
        value = "entitlementID",
        nulls = Nulls.SKIP
    )
    public Builder entitlementId(Optional<String> entitlementId) {
      this.entitlementId = entitlementId;
      return this;
    }

    public Builder entitlementId(String entitlementId) {
      this.entitlementId = Optional.of(entitlementId);
      return this;
    }

    @JsonSetter(
        value = "entitlementTermID",
        nulls = Nulls.SKIP
    )
    public Builder entitlementTermId(Optional<String> entitlementTermId) {
      this.entitlementTermId = entitlementTermId;
      return this;
    }

    public Builder entitlementTermId(String entitlementTermId) {
      this.entitlementTermId = Optional.of(entitlementTermId);
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

    @JsonSetter(
        value = "info",
        nulls = Nulls.SKIP
    )
    public Builder info(Optional<SharedMeteringUsageRecordReportInfo> info) {
      this.info = info;
      return this;
    }

    public Builder info(SharedMeteringUsageRecordReportInfo info) {
      this.info = Optional.of(info);
      return this;
    }

    @JsonSetter(
        value = "organizationID",
        nulls = Nulls.SKIP
    )
    public Builder organizationId(Optional<String> organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    public Builder organizationId(String organizationId) {
      this.organizationId = Optional.of(organizationId);
      return this;
    }

    @JsonSetter(
        value = "productID",
        nulls = Nulls.SKIP
    )
    public Builder productId(Optional<String> productId) {
      this.productId = productId;
      return this;
    }

    public Builder productId(String productId) {
      this.productId = Optional.of(productId);
      return this;
    }

    public SharedMeteringUsageRecordReport build() {
      return new SharedMeteringUsageRecordReport(creationTime, entitlementId, entitlementTermId, id, info, organizationId, productId);
    }
  }
}
