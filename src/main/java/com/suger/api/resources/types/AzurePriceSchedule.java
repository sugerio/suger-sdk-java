package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzurePriceSchedule.Builder.class
)
public final class AzurePriceSchedule {
  private final Optional<AzurePriceCadence> priceCadence;

  private final Optional<AzurePriceSchedulePricingModel> pricingModel;

  private final Optional<List<AzurePricingUnit>> pricingUnits;

  private final Optional<AzurePrice> retailPrice;

  private int _cachedHashCode;

  AzurePriceSchedule(Optional<AzurePriceCadence> priceCadence,
      Optional<AzurePriceSchedulePricingModel> pricingModel,
      Optional<List<AzurePricingUnit>> pricingUnits, Optional<AzurePrice> retailPrice) {
    this.priceCadence = priceCadence;
    this.pricingModel = pricingModel;
    this.pricingUnits = pricingUnits;
    this.retailPrice = retailPrice;
  }

  @JsonProperty("priceCadence")
  public Optional<AzurePriceCadence> getPriceCadence() {
    return priceCadence;
  }

  @JsonProperty("pricingModel")
  public Optional<AzurePriceSchedulePricingModel> getPricingModel() {
    return pricingModel;
  }

  @JsonProperty("pricingUnits")
  public Optional<List<AzurePricingUnit>> getPricingUnits() {
    return pricingUnits;
  }

  @JsonProperty("retailPrice")
  public Optional<AzurePrice> getRetailPrice() {
    return retailPrice;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzurePriceSchedule && equalTo((AzurePriceSchedule) other);
  }

  private boolean equalTo(AzurePriceSchedule other) {
    return priceCadence.equals(other.priceCadence) && pricingModel.equals(other.pricingModel) && pricingUnits.equals(other.pricingUnits) && retailPrice.equals(other.retailPrice);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.priceCadence, this.pricingModel, this.pricingUnits, this.retailPrice);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzurePriceSchedule{" + "priceCadence: " + priceCadence + ", pricingModel: " + pricingModel + ", pricingUnits: " + pricingUnits + ", retailPrice: " + retailPrice + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AzurePriceCadence> priceCadence = Optional.empty();

    private Optional<AzurePriceSchedulePricingModel> pricingModel = Optional.empty();

    private Optional<List<AzurePricingUnit>> pricingUnits = Optional.empty();

    private Optional<AzurePrice> retailPrice = Optional.empty();

    private Builder() {
    }

    public Builder from(AzurePriceSchedule other) {
      priceCadence(other.getPriceCadence());
      pricingModel(other.getPricingModel());
      pricingUnits(other.getPricingUnits());
      retailPrice(other.getRetailPrice());
      return this;
    }

    @JsonSetter(
        value = "priceCadence",
        nulls = Nulls.SKIP
    )
    public Builder priceCadence(Optional<AzurePriceCadence> priceCadence) {
      this.priceCadence = priceCadence;
      return this;
    }

    public Builder priceCadence(AzurePriceCadence priceCadence) {
      this.priceCadence = Optional.of(priceCadence);
      return this;
    }

    @JsonSetter(
        value = "pricingModel",
        nulls = Nulls.SKIP
    )
    public Builder pricingModel(Optional<AzurePriceSchedulePricingModel> pricingModel) {
      this.pricingModel = pricingModel;
      return this;
    }

    public Builder pricingModel(AzurePriceSchedulePricingModel pricingModel) {
      this.pricingModel = Optional.of(pricingModel);
      return this;
    }

    @JsonSetter(
        value = "pricingUnits",
        nulls = Nulls.SKIP
    )
    public Builder pricingUnits(Optional<List<AzurePricingUnit>> pricingUnits) {
      this.pricingUnits = pricingUnits;
      return this;
    }

    public Builder pricingUnits(List<AzurePricingUnit> pricingUnits) {
      this.pricingUnits = Optional.of(pricingUnits);
      return this;
    }

    @JsonSetter(
        value = "retailPrice",
        nulls = Nulls.SKIP
    )
    public Builder retailPrice(Optional<AzurePrice> retailPrice) {
      this.retailPrice = retailPrice;
      return this;
    }

    public Builder retailPrice(AzurePrice retailPrice) {
      this.retailPrice = Optional.of(retailPrice);
      return this;
    }

    public AzurePriceSchedule build() {
      return new AzurePriceSchedule(priceCadence, pricingModel, pricingUnits, retailPrice);
    }
  }
}
