package com.suger.api.resources.report.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = ListRevenueRecordDetailsRequest.Builder.class
)
public final class ListRevenueRecordDetailsRequest {
  private final Optional<String> productId;

  private final Optional<String> entitlementId;

  private final Optional<String> buyerId;

  private final Optional<String> startDate;

  private final Optional<String> endDate;

  private final Optional<Integer> limit;

  private final Optional<Integer> offset;

  private int _cachedHashCode;

  ListRevenueRecordDetailsRequest(Optional<String> productId, Optional<String> entitlementId,
      Optional<String> buyerId, Optional<String> startDate, Optional<String> endDate,
      Optional<Integer> limit, Optional<Integer> offset) {
    this.productId = productId;
    this.entitlementId = entitlementId;
    this.buyerId = buyerId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.limit = limit;
    this.offset = offset;
  }

  @JsonProperty("productId")
  public Optional<String> getProductId() {
    return productId;
  }

  @JsonProperty("entitlementId")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("buyerId")
  public Optional<String> getBuyerId() {
    return buyerId;
  }

  @JsonProperty("startDate")
  public Optional<String> getStartDate() {
    return startDate;
  }

  @JsonProperty("endDate")
  public Optional<String> getEndDate() {
    return endDate;
  }

  @JsonProperty("limit")
  public Optional<Integer> getLimit() {
    return limit;
  }

  @JsonProperty("offset")
  public Optional<Integer> getOffset() {
    return offset;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListRevenueRecordDetailsRequest && equalTo((ListRevenueRecordDetailsRequest) other);
  }

  private boolean equalTo(ListRevenueRecordDetailsRequest other) {
    return productId.equals(other.productId) && entitlementId.equals(other.entitlementId) && buyerId.equals(other.buyerId) && startDate.equals(other.startDate) && endDate.equals(other.endDate) && limit.equals(other.limit) && offset.equals(other.offset);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.productId, this.entitlementId, this.buyerId, this.startDate, this.endDate, this.limit, this.offset);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListRevenueRecordDetailsRequest{" + "productId: " + productId + ", entitlementId: " + entitlementId + ", buyerId: " + buyerId + ", startDate: " + startDate + ", endDate: " + endDate + ", limit: " + limit + ", offset: " + offset + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> productId = Optional.empty();

    private Optional<String> entitlementId = Optional.empty();

    private Optional<String> buyerId = Optional.empty();

    private Optional<String> startDate = Optional.empty();

    private Optional<String> endDate = Optional.empty();

    private Optional<Integer> limit = Optional.empty();

    private Optional<Integer> offset = Optional.empty();

    private Builder() {
    }

    public Builder from(ListRevenueRecordDetailsRequest other) {
      productId(other.getProductId());
      entitlementId(other.getEntitlementId());
      buyerId(other.getBuyerId());
      startDate(other.getStartDate());
      endDate(other.getEndDate());
      limit(other.getLimit());
      offset(other.getOffset());
      return this;
    }

    @JsonSetter(
        value = "productId",
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

    @JsonSetter(
        value = "entitlementId",
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
        value = "buyerId",
        nulls = Nulls.SKIP
    )
    public Builder buyerId(Optional<String> buyerId) {
      this.buyerId = buyerId;
      return this;
    }

    public Builder buyerId(String buyerId) {
      this.buyerId = Optional.of(buyerId);
      return this;
    }

    @JsonSetter(
        value = "startDate",
        nulls = Nulls.SKIP
    )
    public Builder startDate(Optional<String> startDate) {
      this.startDate = startDate;
      return this;
    }

    public Builder startDate(String startDate) {
      this.startDate = Optional.of(startDate);
      return this;
    }

    @JsonSetter(
        value = "endDate",
        nulls = Nulls.SKIP
    )
    public Builder endDate(Optional<String> endDate) {
      this.endDate = endDate;
      return this;
    }

    public Builder endDate(String endDate) {
      this.endDate = Optional.of(endDate);
      return this;
    }

    @JsonSetter(
        value = "limit",
        nulls = Nulls.SKIP
    )
    public Builder limit(Optional<Integer> limit) {
      this.limit = limit;
      return this;
    }

    public Builder limit(Integer limit) {
      this.limit = Optional.of(limit);
      return this;
    }

    @JsonSetter(
        value = "offset",
        nulls = Nulls.SKIP
    )
    public Builder offset(Optional<Integer> offset) {
      this.offset = offset;
      return this;
    }

    public Builder offset(Integer offset) {
      this.offset = Optional.of(offset);
      return this;
    }

    public ListRevenueRecordDetailsRequest build() {
      return new ListRevenueRecordDetailsRequest(productId, entitlementId, buyerId, startDate, endDate, limit, offset);
    }
  }
}
