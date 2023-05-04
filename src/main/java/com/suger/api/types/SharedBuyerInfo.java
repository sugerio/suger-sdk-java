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
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedBuyerInfo.Builder.class
)
public final class SharedBuyerInfo {
  private final Optional<SharedAwsAccountIdentifier> awsBuyer;

  private final Optional<SharedAzureAdIdentifier> azureBuyer;

  private final Optional<Double> collectableAmount;

  private final Optional<Double> disbursedAmount;

  private final Optional<SharedGcpMarketplaceUserAccount> gcpBuyer;

  private final Optional<Double> invoicedAmount;

  private int _cachedHashCode;

  SharedBuyerInfo(Optional<SharedAwsAccountIdentifier> awsBuyer,
      Optional<SharedAzureAdIdentifier> azureBuyer, Optional<Double> collectableAmount,
      Optional<Double> disbursedAmount, Optional<SharedGcpMarketplaceUserAccount> gcpBuyer,
      Optional<Double> invoicedAmount) {
    this.awsBuyer = awsBuyer;
    this.azureBuyer = azureBuyer;
    this.collectableAmount = collectableAmount;
    this.disbursedAmount = disbursedAmount;
    this.gcpBuyer = gcpBuyer;
    this.invoicedAmount = invoicedAmount;
  }

  /**
   * @return Buyer from AWS Marketplace
   */
  @JsonProperty("awsBuyer")
  public Optional<SharedAwsAccountIdentifier> getAwsBuyer() {
    return awsBuyer;
  }

  /**
   * @return Buyer from Azure Marketplace
   */
  @JsonProperty("azureBuyer")
  public Optional<SharedAzureAdIdentifier> getAzureBuyer() {
    return azureBuyer;
  }

  /**
   * @return The amount that the seller can collect. It excludes the marketplace commision fee.
   */
  @JsonProperty("collectableAmount")
  public Optional<Double> getCollectableAmount() {
    return collectableAmount;
  }

  /**
   * @return The amount that has been disbursed to the seller account.
   */
  @JsonProperty("disbursedAmount")
  public Optional<Double> getDisbursedAmount() {
    return disbursedAmount;
  }

  /**
   * @return Buyer from GCP Marketplace
   */
  @JsonProperty("gcpBuyer")
  public Optional<SharedGcpMarketplaceUserAccount> getGcpBuyer() {
    return gcpBuyer;
  }

  /**
   * @return The amount that the buyer has got invoiced.
   */
  @JsonProperty("invoicedAmount")
  public Optional<Double> getInvoicedAmount() {
    return invoicedAmount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedBuyerInfo && equalTo((SharedBuyerInfo) other);
  }

  private boolean equalTo(SharedBuyerInfo other) {
    return awsBuyer.equals(other.awsBuyer) && azureBuyer.equals(other.azureBuyer) && collectableAmount.equals(other.collectableAmount) && disbursedAmount.equals(other.disbursedAmount) && gcpBuyer.equals(other.gcpBuyer) && invoicedAmount.equals(other.invoicedAmount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.awsBuyer, this.azureBuyer, this.collectableAmount, this.disbursedAmount, this.gcpBuyer, this.invoicedAmount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedBuyerInfo{" + "awsBuyer: " + awsBuyer + ", azureBuyer: " + azureBuyer + ", collectableAmount: " + collectableAmount + ", disbursedAmount: " + disbursedAmount + ", gcpBuyer: " + gcpBuyer + ", invoicedAmount: " + invoicedAmount + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SharedAwsAccountIdentifier> awsBuyer = Optional.empty();

    private Optional<SharedAzureAdIdentifier> azureBuyer = Optional.empty();

    private Optional<Double> collectableAmount = Optional.empty();

    private Optional<Double> disbursedAmount = Optional.empty();

    private Optional<SharedGcpMarketplaceUserAccount> gcpBuyer = Optional.empty();

    private Optional<Double> invoicedAmount = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedBuyerInfo other) {
      awsBuyer(other.getAwsBuyer());
      azureBuyer(other.getAzureBuyer());
      collectableAmount(other.getCollectableAmount());
      disbursedAmount(other.getDisbursedAmount());
      gcpBuyer(other.getGcpBuyer());
      invoicedAmount(other.getInvoicedAmount());
      return this;
    }

    @JsonSetter(
        value = "awsBuyer",
        nulls = Nulls.SKIP
    )
    public Builder awsBuyer(Optional<SharedAwsAccountIdentifier> awsBuyer) {
      this.awsBuyer = awsBuyer;
      return this;
    }

    public Builder awsBuyer(SharedAwsAccountIdentifier awsBuyer) {
      this.awsBuyer = Optional.of(awsBuyer);
      return this;
    }

    @JsonSetter(
        value = "azureBuyer",
        nulls = Nulls.SKIP
    )
    public Builder azureBuyer(Optional<SharedAzureAdIdentifier> azureBuyer) {
      this.azureBuyer = azureBuyer;
      return this;
    }

    public Builder azureBuyer(SharedAzureAdIdentifier azureBuyer) {
      this.azureBuyer = Optional.of(azureBuyer);
      return this;
    }

    @JsonSetter(
        value = "collectableAmount",
        nulls = Nulls.SKIP
    )
    public Builder collectableAmount(Optional<Double> collectableAmount) {
      this.collectableAmount = collectableAmount;
      return this;
    }

    public Builder collectableAmount(Double collectableAmount) {
      this.collectableAmount = Optional.of(collectableAmount);
      return this;
    }

    @JsonSetter(
        value = "disbursedAmount",
        nulls = Nulls.SKIP
    )
    public Builder disbursedAmount(Optional<Double> disbursedAmount) {
      this.disbursedAmount = disbursedAmount;
      return this;
    }

    public Builder disbursedAmount(Double disbursedAmount) {
      this.disbursedAmount = Optional.of(disbursedAmount);
      return this;
    }

    @JsonSetter(
        value = "gcpBuyer",
        nulls = Nulls.SKIP
    )
    public Builder gcpBuyer(Optional<SharedGcpMarketplaceUserAccount> gcpBuyer) {
      this.gcpBuyer = gcpBuyer;
      return this;
    }

    public Builder gcpBuyer(SharedGcpMarketplaceUserAccount gcpBuyer) {
      this.gcpBuyer = Optional.of(gcpBuyer);
      return this;
    }

    @JsonSetter(
        value = "invoicedAmount",
        nulls = Nulls.SKIP
    )
    public Builder invoicedAmount(Optional<Double> invoicedAmount) {
      this.invoicedAmount = invoicedAmount;
      return this;
    }

    public Builder invoicedAmount(Double invoicedAmount) {
      this.invoicedAmount = Optional.of(invoicedAmount);
      return this;
    }

    public SharedBuyerInfo build() {
      return new SharedBuyerInfo(awsBuyer, azureBuyer, collectableAmount, disbursedAmount, gcpBuyer, invoicedAmount);
    }
  }
}
