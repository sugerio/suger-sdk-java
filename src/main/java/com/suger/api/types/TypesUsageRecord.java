package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = TypesUsageRecord.Builder.class
)
public final class TypesUsageRecord {
  private final Optional<String> customerIdentifier;

  private final Optional<String> dimension;

  private final Optional<Integer> quantity;

  private final Optional<String> timestamp;

  private final Optional<List<TypesUsageAllocation>> usageAllocations;

  private int _cachedHashCode;

  TypesUsageRecord(Optional<String> customerIdentifier, Optional<String> dimension,
      Optional<Integer> quantity, Optional<String> timestamp,
      Optional<List<TypesUsageAllocation>> usageAllocations) {
    this.customerIdentifier = customerIdentifier;
    this.dimension = dimension;
    this.quantity = quantity;
    this.timestamp = timestamp;
    this.usageAllocations = usageAllocations;
  }

  /**
   * @return The CustomerIdentifier is obtained through the ResolveCustomer operation and
   * represents an individual buyer in your application.
   * <p>This member is required.</p>
   */
  @JsonProperty("customerIdentifier")
  public Optional<String> getCustomerIdentifier() {
    return customerIdentifier;
  }

  /**
   * @return During the process of registering a product on AWS Marketplace, dimensions are
   * specified. These represent different units of value in your application.
   * <p>This member is required.</p>
   */
  @JsonProperty("dimension")
  public Optional<String> getDimension() {
    return dimension;
  }

  /**
   * @return The quantity of usage consumed by the customer for the given dimension and time.
   * Defaults to 0 if not specified.
   */
  @JsonProperty("quantity")
  public Optional<Integer> getQuantity() {
    return quantity;
  }

  /**
   * @return Timestamp, in UTC, for which the usage is being reported. Your application can
   * meter usage for up to one hour in the past. Make sure the timestamp value is not
   * before the start of the software usage.
   * <p>This member is required.</p>
   */
  @JsonProperty("timestamp")
  public Optional<String> getTimestamp() {
    return timestamp;
  }

  /**
   * @return The set of UsageAllocations to submit. The sum of all UsageAllocation quantities
   * must equal the Quantity of the UsageRecord.
   */
  @JsonProperty("usageAllocations")
  public Optional<List<TypesUsageAllocation>> getUsageAllocations() {
    return usageAllocations;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TypesUsageRecord && equalTo((TypesUsageRecord) other);
  }

  private boolean equalTo(TypesUsageRecord other) {
    return customerIdentifier.equals(other.customerIdentifier) && dimension.equals(other.dimension) && quantity.equals(other.quantity) && timestamp.equals(other.timestamp) && usageAllocations.equals(other.usageAllocations);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.customerIdentifier, this.dimension, this.quantity, this.timestamp, this.usageAllocations);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TypesUsageRecord{" + "customerIdentifier: " + customerIdentifier + ", dimension: " + dimension + ", quantity: " + quantity + ", timestamp: " + timestamp + ", usageAllocations: " + usageAllocations + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> customerIdentifier = Optional.empty();

    private Optional<String> dimension = Optional.empty();

    private Optional<Integer> quantity = Optional.empty();

    private Optional<String> timestamp = Optional.empty();

    private Optional<List<TypesUsageAllocation>> usageAllocations = Optional.empty();

    private Builder() {
    }

    public Builder from(TypesUsageRecord other) {
      customerIdentifier(other.getCustomerIdentifier());
      dimension(other.getDimension());
      quantity(other.getQuantity());
      timestamp(other.getTimestamp());
      usageAllocations(other.getUsageAllocations());
      return this;
    }

    @JsonSetter(
        value = "customerIdentifier",
        nulls = Nulls.SKIP
    )
    public Builder customerIdentifier(Optional<String> customerIdentifier) {
      this.customerIdentifier = customerIdentifier;
      return this;
    }

    public Builder customerIdentifier(String customerIdentifier) {
      this.customerIdentifier = Optional.of(customerIdentifier);
      return this;
    }

    @JsonSetter(
        value = "dimension",
        nulls = Nulls.SKIP
    )
    public Builder dimension(Optional<String> dimension) {
      this.dimension = dimension;
      return this;
    }

    public Builder dimension(String dimension) {
      this.dimension = Optional.of(dimension);
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
        value = "timestamp",
        nulls = Nulls.SKIP
    )
    public Builder timestamp(Optional<String> timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder timestamp(String timestamp) {
      this.timestamp = Optional.of(timestamp);
      return this;
    }

    @JsonSetter(
        value = "usageAllocations",
        nulls = Nulls.SKIP
    )
    public Builder usageAllocations(Optional<List<TypesUsageAllocation>> usageAllocations) {
      this.usageAllocations = usageAllocations;
      return this;
    }

    public Builder usageAllocations(List<TypesUsageAllocation> usageAllocations) {
      this.usageAllocations = Optional.of(usageAllocations);
      return this;
    }

    public TypesUsageRecord build() {
      return new TypesUsageRecord(customerIdentifier, dimension, quantity, timestamp, usageAllocations);
    }
  }
}
