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
    builder = TypesEntitlement.Builder.class
)
public final class TypesEntitlement {
  private final Optional<String> customerIdentifier;

  private final Optional<String> dimension;

  private final Optional<String> expirationDate;

  private final Optional<String> productCode;

  private final Object value;

  private int _cachedHashCode;

  TypesEntitlement(Optional<String> customerIdentifier, Optional<String> dimension,
      Optional<String> expirationDate, Optional<String> productCode, Object value) {
    this.customerIdentifier = customerIdentifier;
    this.dimension = dimension;
    this.expirationDate = expirationDate;
    this.productCode = productCode;
    this.value = value;
  }

  /**
   * @return The customer identifier is a handle to each unique customer in an application.
   * Customer identifiers are obtained through the ResolveCustomer operation in AWS
   * Marketplace Metering Service.
   */
  @JsonProperty("customerIdentifier")
  public Optional<String> getCustomerIdentifier() {
    return customerIdentifier;
  }

  /**
   * @return The dimension for which the given entitlement applies. Dimensions represent
   * categories of capacity in a product and are specified when the product is listed
   * in AWS Marketplace.
   */
  @JsonProperty("dimension")
  public Optional<String> getDimension() {
    return dimension;
  }

  /**
   * @return The expiration date represents the minimum date through which this entitlement
   * is expected to remain valid. For contractual products listed on AWS Marketplace,
   * the expiration date is the date at which the customer will renew or cancel their
   * contract. Customers who are opting to renew their contract will still have
   * entitlements with an expiration date.
   */
  @JsonProperty("expirationDate")
  public Optional<String> getExpirationDate() {
    return expirationDate;
  }

  /**
   * @return The product code for which the given entitlement applies. Product codes are
   * provided by AWS Marketplace when the product listing is created.
   */
  @JsonProperty("productCode")
  public Optional<String> getProductCode() {
    return productCode;
  }

  @JsonProperty("value")
  public Object getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TypesEntitlement && equalTo((TypesEntitlement) other);
  }

  private boolean equalTo(TypesEntitlement other) {
    return customerIdentifier.equals(other.customerIdentifier) && dimension.equals(other.dimension) && expirationDate.equals(other.expirationDate) && productCode.equals(other.productCode) && value.equals(other.value);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.customerIdentifier, this.dimension, this.expirationDate, this.productCode, this.value);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TypesEntitlement{" + "customerIdentifier: " + customerIdentifier + ", dimension: " + dimension + ", expirationDate: " + expirationDate + ", productCode: " + productCode + ", value: " + value + "}";
  }

  public static ValueStage builder() {
    return new Builder();
  }

  public interface ValueStage {
    _FinalStage value(Object value);

    Builder from(TypesEntitlement other);
  }

  public interface _FinalStage {
    TypesEntitlement build();

    _FinalStage customerIdentifier(Optional<String> customerIdentifier);

    _FinalStage customerIdentifier(String customerIdentifier);

    _FinalStage dimension(Optional<String> dimension);

    _FinalStage dimension(String dimension);

    _FinalStage expirationDate(Optional<String> expirationDate);

    _FinalStage expirationDate(String expirationDate);

    _FinalStage productCode(Optional<String> productCode);

    _FinalStage productCode(String productCode);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements ValueStage, _FinalStage {
    private Object value;

    private Optional<String> productCode = Optional.empty();

    private Optional<String> expirationDate = Optional.empty();

    private Optional<String> dimension = Optional.empty();

    private Optional<String> customerIdentifier = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(TypesEntitlement other) {
      customerIdentifier(other.getCustomerIdentifier());
      dimension(other.getDimension());
      expirationDate(other.getExpirationDate());
      productCode(other.getProductCode());
      value(other.getValue());
      return this;
    }

    @Override
    @JsonSetter("value")
    public _FinalStage value(Object value) {
      this.value = value;
      return this;
    }

    /**
     * <p>The product code for which the given entitlement applies. Product codes are
     * provided by AWS Marketplace when the product listing is created.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage productCode(String productCode) {
      this.productCode = Optional.of(productCode);
      return this;
    }

    @Override
    @JsonSetter(
        value = "productCode",
        nulls = Nulls.SKIP
    )
    public _FinalStage productCode(Optional<String> productCode) {
      this.productCode = productCode;
      return this;
    }

    /**
     * <p>The expiration date represents the minimum date through which this entitlement
     * is expected to remain valid. For contractual products listed on AWS Marketplace,
     * the expiration date is the date at which the customer will renew or cancel their
     * contract. Customers who are opting to renew their contract will still have
     * entitlements with an expiration date.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage expirationDate(String expirationDate) {
      this.expirationDate = Optional.of(expirationDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "expirationDate",
        nulls = Nulls.SKIP
    )
    public _FinalStage expirationDate(Optional<String> expirationDate) {
      this.expirationDate = expirationDate;
      return this;
    }

    /**
     * <p>The dimension for which the given entitlement applies. Dimensions represent
     * categories of capacity in a product and are specified when the product is listed
     * in AWS Marketplace.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage dimension(String dimension) {
      this.dimension = Optional.of(dimension);
      return this;
    }

    @Override
    @JsonSetter(
        value = "dimension",
        nulls = Nulls.SKIP
    )
    public _FinalStage dimension(Optional<String> dimension) {
      this.dimension = dimension;
      return this;
    }

    /**
     * <p>The customer identifier is a handle to each unique customer in an application.
     * Customer identifiers are obtained through the ResolveCustomer operation in AWS
     * Marketplace Metering Service.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage customerIdentifier(String customerIdentifier) {
      this.customerIdentifier = Optional.of(customerIdentifier);
      return this;
    }

    @Override
    @JsonSetter(
        value = "customerIdentifier",
        nulls = Nulls.SKIP
    )
    public _FinalStage customerIdentifier(Optional<String> customerIdentifier) {
      this.customerIdentifier = customerIdentifier;
      return this;
    }

    @Override
    public TypesEntitlement build() {
      return new TypesEntitlement(customerIdentifier, dimension, expirationDate, productCode, value);
    }
  }
}
