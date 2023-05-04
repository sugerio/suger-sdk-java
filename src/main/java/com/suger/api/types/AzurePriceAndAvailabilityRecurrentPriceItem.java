package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzurePriceAndAvailabilityRecurrentPriceItem.Builder.class
)
public final class AzurePriceAndAvailabilityRecurrentPriceItem {
  private final Optional<AzureMarketplaceTerm> billingTerm;

  private final Optional<AzureMarketplaceTerm> paymentOption;

  private final Optional<Double> pricePerPaymentInUsd;

  private final Optional<List<AzureMarketplacePrice>> prices;

  private int _cachedHashCode;

  AzurePriceAndAvailabilityRecurrentPriceItem(Optional<AzureMarketplaceTerm> billingTerm,
      Optional<AzureMarketplaceTerm> paymentOption, Optional<Double> pricePerPaymentInUsd,
      Optional<List<AzureMarketplacePrice>> prices) {
    this.billingTerm = billingTerm;
    this.paymentOption = paymentOption;
    this.pricePerPaymentInUsd = pricePerPaymentInUsd;
    this.prices = prices;
  }

  @JsonProperty("billingTerm")
  public Optional<AzureMarketplaceTerm> getBillingTerm() {
    return billingTerm;
  }

  @JsonProperty("paymentOption")
  public Optional<AzureMarketplaceTerm> getPaymentOption() {
    return paymentOption;
  }

  @JsonProperty("pricePerPaymentInUsd")
  public Optional<Double> getPricePerPaymentInUsd() {
    return pricePerPaymentInUsd;
  }

  @JsonProperty("prices")
  public Optional<List<AzureMarketplacePrice>> getPrices() {
    return prices;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzurePriceAndAvailabilityRecurrentPriceItem && equalTo((AzurePriceAndAvailabilityRecurrentPriceItem) other);
  }

  private boolean equalTo(AzurePriceAndAvailabilityRecurrentPriceItem other) {
    return billingTerm.equals(other.billingTerm) && paymentOption.equals(other.paymentOption) && pricePerPaymentInUsd.equals(other.pricePerPaymentInUsd) && prices.equals(other.prices);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.billingTerm, this.paymentOption, this.pricePerPaymentInUsd, this.prices);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzurePriceAndAvailabilityRecurrentPriceItem{" + "billingTerm: " + billingTerm + ", paymentOption: " + paymentOption + ", pricePerPaymentInUsd: " + pricePerPaymentInUsd + ", prices: " + prices + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AzureMarketplaceTerm> billingTerm = Optional.empty();

    private Optional<AzureMarketplaceTerm> paymentOption = Optional.empty();

    private Optional<Double> pricePerPaymentInUsd = Optional.empty();

    private Optional<List<AzureMarketplacePrice>> prices = Optional.empty();

    private Builder() {
    }

    public Builder from(AzurePriceAndAvailabilityRecurrentPriceItem other) {
      billingTerm(other.getBillingTerm());
      paymentOption(other.getPaymentOption());
      pricePerPaymentInUsd(other.getPricePerPaymentInUsd());
      prices(other.getPrices());
      return this;
    }

    @JsonSetter(
        value = "billingTerm",
        nulls = Nulls.SKIP
    )
    public Builder billingTerm(Optional<AzureMarketplaceTerm> billingTerm) {
      this.billingTerm = billingTerm;
      return this;
    }

    public Builder billingTerm(AzureMarketplaceTerm billingTerm) {
      this.billingTerm = Optional.of(billingTerm);
      return this;
    }

    @JsonSetter(
        value = "paymentOption",
        nulls = Nulls.SKIP
    )
    public Builder paymentOption(Optional<AzureMarketplaceTerm> paymentOption) {
      this.paymentOption = paymentOption;
      return this;
    }

    public Builder paymentOption(AzureMarketplaceTerm paymentOption) {
      this.paymentOption = Optional.of(paymentOption);
      return this;
    }

    @JsonSetter(
        value = "pricePerPaymentInUsd",
        nulls = Nulls.SKIP
    )
    public Builder pricePerPaymentInUsd(Optional<Double> pricePerPaymentInUsd) {
      this.pricePerPaymentInUsd = pricePerPaymentInUsd;
      return this;
    }

    public Builder pricePerPaymentInUsd(Double pricePerPaymentInUsd) {
      this.pricePerPaymentInUsd = Optional.of(pricePerPaymentInUsd);
      return this;
    }

    @JsonSetter(
        value = "prices",
        nulls = Nulls.SKIP
    )
    public Builder prices(Optional<List<AzureMarketplacePrice>> prices) {
      this.prices = prices;
      return this;
    }

    public Builder prices(List<AzureMarketplacePrice> prices) {
      this.prices = Optional.of(prices);
      return this;
    }

    public AzurePriceAndAvailabilityRecurrentPriceItem build() {
      return new AzurePriceAndAvailabilityRecurrentPriceItem(billingTerm, paymentOption, pricePerPaymentInUsd, prices);
    }
  }
}
