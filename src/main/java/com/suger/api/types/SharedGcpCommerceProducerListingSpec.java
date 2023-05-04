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
    builder = SharedGcpCommerceProducerListingSpec.Builder.class
)
public final class SharedGcpCommerceProducerListingSpec {
  private final Optional<SharedGcpCommerceProducerExternalAccountSpec> externalAccountSpec;

  private final Optional<SharedGcpCommerceProducerListingSpecListingType> listingType;

  private final Optional<SharedGcpCommerceProducerMarketingSpec> marketingSpec;

  private final Optional<SharedGcpCommerceProducerPurchaseSpec> purchaseSpec;

  private int _cachedHashCode;

  SharedGcpCommerceProducerListingSpec(
      Optional<SharedGcpCommerceProducerExternalAccountSpec> externalAccountSpec,
      Optional<SharedGcpCommerceProducerListingSpecListingType> listingType,
      Optional<SharedGcpCommerceProducerMarketingSpec> marketingSpec,
      Optional<SharedGcpCommerceProducerPurchaseSpec> purchaseSpec) {
    this.externalAccountSpec = externalAccountSpec;
    this.listingType = listingType;
    this.marketingSpec = marketingSpec;
    this.purchaseSpec = purchaseSpec;
  }

  @JsonProperty("externalAccountSpec")
  public Optional<SharedGcpCommerceProducerExternalAccountSpec> getExternalAccountSpec() {
    return externalAccountSpec;
  }

  @JsonProperty("listingType")
  public Optional<SharedGcpCommerceProducerListingSpecListingType> getListingType() {
    return listingType;
  }

  @JsonProperty("marketingSpec")
  public Optional<SharedGcpCommerceProducerMarketingSpec> getMarketingSpec() {
    return marketingSpec;
  }

  @JsonProperty("purchaseSpec")
  public Optional<SharedGcpCommerceProducerPurchaseSpec> getPurchaseSpec() {
    return purchaseSpec;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerListingSpec && equalTo((SharedGcpCommerceProducerListingSpec) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerListingSpec other) {
    return externalAccountSpec.equals(other.externalAccountSpec) && listingType.equals(other.listingType) && marketingSpec.equals(other.marketingSpec) && purchaseSpec.equals(other.purchaseSpec);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.externalAccountSpec, this.listingType, this.marketingSpec, this.purchaseSpec);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerListingSpec{" + "externalAccountSpec: " + externalAccountSpec + ", listingType: " + listingType + ", marketingSpec: " + marketingSpec + ", purchaseSpec: " + purchaseSpec + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SharedGcpCommerceProducerExternalAccountSpec> externalAccountSpec = Optional.empty();

    private Optional<SharedGcpCommerceProducerListingSpecListingType> listingType = Optional.empty();

    private Optional<SharedGcpCommerceProducerMarketingSpec> marketingSpec = Optional.empty();

    private Optional<SharedGcpCommerceProducerPurchaseSpec> purchaseSpec = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerListingSpec other) {
      externalAccountSpec(other.getExternalAccountSpec());
      listingType(other.getListingType());
      marketingSpec(other.getMarketingSpec());
      purchaseSpec(other.getPurchaseSpec());
      return this;
    }

    @JsonSetter(
        value = "externalAccountSpec",
        nulls = Nulls.SKIP
    )
    public Builder externalAccountSpec(
        Optional<SharedGcpCommerceProducerExternalAccountSpec> externalAccountSpec) {
      this.externalAccountSpec = externalAccountSpec;
      return this;
    }

    public Builder externalAccountSpec(
        SharedGcpCommerceProducerExternalAccountSpec externalAccountSpec) {
      this.externalAccountSpec = Optional.of(externalAccountSpec);
      return this;
    }

    @JsonSetter(
        value = "listingType",
        nulls = Nulls.SKIP
    )
    public Builder listingType(
        Optional<SharedGcpCommerceProducerListingSpecListingType> listingType) {
      this.listingType = listingType;
      return this;
    }

    public Builder listingType(SharedGcpCommerceProducerListingSpecListingType listingType) {
      this.listingType = Optional.of(listingType);
      return this;
    }

    @JsonSetter(
        value = "marketingSpec",
        nulls = Nulls.SKIP
    )
    public Builder marketingSpec(Optional<SharedGcpCommerceProducerMarketingSpec> marketingSpec) {
      this.marketingSpec = marketingSpec;
      return this;
    }

    public Builder marketingSpec(SharedGcpCommerceProducerMarketingSpec marketingSpec) {
      this.marketingSpec = Optional.of(marketingSpec);
      return this;
    }

    @JsonSetter(
        value = "purchaseSpec",
        nulls = Nulls.SKIP
    )
    public Builder purchaseSpec(Optional<SharedGcpCommerceProducerPurchaseSpec> purchaseSpec) {
      this.purchaseSpec = purchaseSpec;
      return this;
    }

    public Builder purchaseSpec(SharedGcpCommerceProducerPurchaseSpec purchaseSpec) {
      this.purchaseSpec = Optional.of(purchaseSpec);
      return this;
    }

    public SharedGcpCommerceProducerListingSpec build() {
      return new SharedGcpCommerceProducerListingSpec(externalAccountSpec, listingType, marketingSpec, purchaseSpec);
    }
  }
}
