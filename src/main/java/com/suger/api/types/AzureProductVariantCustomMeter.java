package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzureProductVariantCustomMeter.Builder.class
)
public final class AzureProductVariantCustomMeter {
  private final Optional<String> displayName;

  private final Optional<String> id;

  private final Optional<List<AzureIncludedBaseQuantity>> includedBaseQuantities;

  private final Optional<Boolean> isEnabled;

  private final Optional<Double> priceInUsd;

  private final Optional<String> uniqueId;

  private final Optional<String> unitOfMeasure;

  private int _cachedHashCode;

  AzureProductVariantCustomMeter(Optional<String> displayName, Optional<String> id,
      Optional<List<AzureIncludedBaseQuantity>> includedBaseQuantities, Optional<Boolean> isEnabled,
      Optional<Double> priceInUsd, Optional<String> uniqueId, Optional<String> unitOfMeasure) {
    this.displayName = displayName;
    this.id = id;
    this.includedBaseQuantities = includedBaseQuantities;
    this.isEnabled = isEnabled;
    this.priceInUsd = priceInUsd;
    this.uniqueId = uniqueId;
    this.unitOfMeasure = unitOfMeasure;
  }

  @JsonProperty("displayName")
  public Optional<String> getDisplayName() {
    return displayName;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("includedBaseQuantities")
  public Optional<List<AzureIncludedBaseQuantity>> getIncludedBaseQuantities() {
    return includedBaseQuantities;
  }

  @JsonProperty("isEnabled")
  public Optional<Boolean> getIsEnabled() {
    return isEnabled;
  }

  @JsonProperty("priceInUsd")
  public Optional<Double> getPriceInUsd() {
    return priceInUsd;
  }

  @JsonProperty("uniqueID")
  public Optional<String> getUniqueId() {
    return uniqueId;
  }

  @JsonProperty("unitOfMeasure")
  public Optional<String> getUnitOfMeasure() {
    return unitOfMeasure;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductVariantCustomMeter && equalTo((AzureProductVariantCustomMeter) other);
  }

  private boolean equalTo(AzureProductVariantCustomMeter other) {
    return displayName.equals(other.displayName) && id.equals(other.id) && includedBaseQuantities.equals(other.includedBaseQuantities) && isEnabled.equals(other.isEnabled) && priceInUsd.equals(other.priceInUsd) && uniqueId.equals(other.uniqueId) && unitOfMeasure.equals(other.unitOfMeasure);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.displayName, this.id, this.includedBaseQuantities, this.isEnabled, this.priceInUsd, this.uniqueId, this.unitOfMeasure);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductVariantCustomMeter{" + "displayName: " + displayName + ", id: " + id + ", includedBaseQuantities: " + includedBaseQuantities + ", isEnabled: " + isEnabled + ", priceInUsd: " + priceInUsd + ", uniqueId: " + uniqueId + ", unitOfMeasure: " + unitOfMeasure + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> displayName = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<List<AzureIncludedBaseQuantity>> includedBaseQuantities = Optional.empty();

    private Optional<Boolean> isEnabled = Optional.empty();

    private Optional<Double> priceInUsd = Optional.empty();

    private Optional<String> uniqueId = Optional.empty();

    private Optional<String> unitOfMeasure = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductVariantCustomMeter other) {
      displayName(other.getDisplayName());
      id(other.getId());
      includedBaseQuantities(other.getIncludedBaseQuantities());
      isEnabled(other.getIsEnabled());
      priceInUsd(other.getPriceInUsd());
      uniqueId(other.getUniqueId());
      unitOfMeasure(other.getUnitOfMeasure());
      return this;
    }

    @JsonSetter(
        value = "displayName",
        nulls = Nulls.SKIP
    )
    public Builder displayName(Optional<String> displayName) {
      this.displayName = displayName;
      return this;
    }

    public Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
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
        value = "includedBaseQuantities",
        nulls = Nulls.SKIP
    )
    public Builder includedBaseQuantities(
        Optional<List<AzureIncludedBaseQuantity>> includedBaseQuantities) {
      this.includedBaseQuantities = includedBaseQuantities;
      return this;
    }

    public Builder includedBaseQuantities(List<AzureIncludedBaseQuantity> includedBaseQuantities) {
      this.includedBaseQuantities = Optional.of(includedBaseQuantities);
      return this;
    }

    @JsonSetter(
        value = "isEnabled",
        nulls = Nulls.SKIP
    )
    public Builder isEnabled(Optional<Boolean> isEnabled) {
      this.isEnabled = isEnabled;
      return this;
    }

    public Builder isEnabled(Boolean isEnabled) {
      this.isEnabled = Optional.of(isEnabled);
      return this;
    }

    @JsonSetter(
        value = "priceInUsd",
        nulls = Nulls.SKIP
    )
    public Builder priceInUsd(Optional<Double> priceInUsd) {
      this.priceInUsd = priceInUsd;
      return this;
    }

    public Builder priceInUsd(Double priceInUsd) {
      this.priceInUsd = Optional.of(priceInUsd);
      return this;
    }

    @JsonSetter(
        value = "uniqueID",
        nulls = Nulls.SKIP
    )
    public Builder uniqueId(Optional<String> uniqueId) {
      this.uniqueId = uniqueId;
      return this;
    }

    public Builder uniqueId(String uniqueId) {
      this.uniqueId = Optional.of(uniqueId);
      return this;
    }

    @JsonSetter(
        value = "unitOfMeasure",
        nulls = Nulls.SKIP
    )
    public Builder unitOfMeasure(Optional<String> unitOfMeasure) {
      this.unitOfMeasure = unitOfMeasure;
      return this;
    }

    public Builder unitOfMeasure(String unitOfMeasure) {
      this.unitOfMeasure = Optional.of(unitOfMeasure);
      return this;
    }

    public AzureProductVariantCustomMeter build() {
      return new AzureProductVariantCustomMeter(displayName, id, includedBaseQuantities, isEnabled, priceInUsd, uniqueId, unitOfMeasure);
    }
  }
}
