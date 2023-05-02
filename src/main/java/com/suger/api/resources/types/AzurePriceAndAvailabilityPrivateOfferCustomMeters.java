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
    builder = AzurePriceAndAvailabilityPrivateOfferCustomMeters.Builder.class
)
public final class AzurePriceAndAvailabilityPrivateOfferCustomMeters {
  private final Object meters;

  private final Optional<AzurePriceAndAvailabilityPrivateOfferCustomMetersPriceInputOption> priceInputOption;

  private int _cachedHashCode;

  AzurePriceAndAvailabilityPrivateOfferCustomMeters(Object meters,
      Optional<AzurePriceAndAvailabilityPrivateOfferCustomMetersPriceInputOption> priceInputOption) {
    this.meters = meters;
    this.priceInputOption = priceInputOption;
  }

  @JsonProperty("meters")
  public Object getMeters() {
    return meters;
  }

  /**
   * @return default &quot;usd&quot;
   */
  @JsonProperty("priceInputOption")
  public Optional<AzurePriceAndAvailabilityPrivateOfferCustomMetersPriceInputOption> getPriceInputOption(
      ) {
    return priceInputOption;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzurePriceAndAvailabilityPrivateOfferCustomMeters && equalTo((AzurePriceAndAvailabilityPrivateOfferCustomMeters) other);
  }

  private boolean equalTo(AzurePriceAndAvailabilityPrivateOfferCustomMeters other) {
    return meters.equals(other.meters) && priceInputOption.equals(other.priceInputOption);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.meters, this.priceInputOption);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzurePriceAndAvailabilityPrivateOfferCustomMeters{" + "meters: " + meters + ", priceInputOption: " + priceInputOption + "}";
  }

  public static MetersStage builder() {
    return new Builder();
  }

  public interface MetersStage {
    _FinalStage meters(Object meters);

    Builder from(AzurePriceAndAvailabilityPrivateOfferCustomMeters other);
  }

  public interface _FinalStage {
    AzurePriceAndAvailabilityPrivateOfferCustomMeters build();

    _FinalStage priceInputOption(
        Optional<AzurePriceAndAvailabilityPrivateOfferCustomMetersPriceInputOption> priceInputOption);

    _FinalStage priceInputOption(
        AzurePriceAndAvailabilityPrivateOfferCustomMetersPriceInputOption priceInputOption);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements MetersStage, _FinalStage {
    private Object meters;

    private Optional<AzurePriceAndAvailabilityPrivateOfferCustomMetersPriceInputOption> priceInputOption = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(AzurePriceAndAvailabilityPrivateOfferCustomMeters other) {
      meters(other.getMeters());
      priceInputOption(other.getPriceInputOption());
      return this;
    }

    @Override
    @JsonSetter("meters")
    public _FinalStage meters(Object meters) {
      this.meters = meters;
      return this;
    }

    /**
     * <p>default &quot;usd&quot;</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage priceInputOption(
        AzurePriceAndAvailabilityPrivateOfferCustomMetersPriceInputOption priceInputOption) {
      this.priceInputOption = Optional.of(priceInputOption);
      return this;
    }

    @Override
    @JsonSetter(
        value = "priceInputOption",
        nulls = Nulls.SKIP
    )
    public _FinalStage priceInputOption(
        Optional<AzurePriceAndAvailabilityPrivateOfferCustomMetersPriceInputOption> priceInputOption) {
      this.priceInputOption = priceInputOption;
      return this;
    }

    @Override
    public AzurePriceAndAvailabilityPrivateOfferCustomMeters build() {
      return new AzurePriceAndAvailabilityPrivateOfferCustomMeters(meters, priceInputOption);
    }
  }
}
