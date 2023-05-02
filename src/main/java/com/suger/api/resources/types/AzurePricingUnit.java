package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzurePricingUnit.Builder.class
)
public final class AzurePricingUnit {
  private final Optional<Boolean> isUnlimitedUnit;

  private final Optional<Integer> lowerUnit;

  private final Optional<AzurePricingUnitName> name;

  private final Optional<String> unitType;

  private final Optional<Integer> upperUnit;

  private int _cachedHashCode;

  AzurePricingUnit(Optional<Boolean> isUnlimitedUnit, Optional<Integer> lowerUnit,
      Optional<AzurePricingUnitName> name, Optional<String> unitType, Optional<Integer> upperUnit) {
    this.isUnlimitedUnit = isUnlimitedUnit;
    this.lowerUnit = lowerUnit;
    this.name = name;
    this.unitType = unitType;
    this.upperUnit = upperUnit;
  }

  @JsonProperty("isUnlimitedUnit")
  public Optional<Boolean> getIsUnlimitedUnit() {
    return isUnlimitedUnit;
  }

  @JsonProperty("lowerUnit")
  public Optional<Integer> getLowerUnit() {
    return lowerUnit;
  }

  @JsonProperty("name")
  public Optional<AzurePricingUnitName> getName() {
    return name;
  }

  @JsonProperty("unitType")
  public Optional<String> getUnitType() {
    return unitType;
  }

  @JsonProperty("upperUnit")
  public Optional<Integer> getUpperUnit() {
    return upperUnit;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzurePricingUnit && equalTo((AzurePricingUnit) other);
  }

  private boolean equalTo(AzurePricingUnit other) {
    return isUnlimitedUnit.equals(other.isUnlimitedUnit) && lowerUnit.equals(other.lowerUnit) && name.equals(other.name) && unitType.equals(other.unitType) && upperUnit.equals(other.upperUnit);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.isUnlimitedUnit, this.lowerUnit, this.name, this.unitType, this.upperUnit);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzurePricingUnit{" + "isUnlimitedUnit: " + isUnlimitedUnit + ", lowerUnit: " + lowerUnit + ", name: " + name + ", unitType: " + unitType + ", upperUnit: " + upperUnit + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Boolean> isUnlimitedUnit = Optional.empty();

    private Optional<Integer> lowerUnit = Optional.empty();

    private Optional<AzurePricingUnitName> name = Optional.empty();

    private Optional<String> unitType = Optional.empty();

    private Optional<Integer> upperUnit = Optional.empty();

    private Builder() {
    }

    public Builder from(AzurePricingUnit other) {
      isUnlimitedUnit(other.getIsUnlimitedUnit());
      lowerUnit(other.getLowerUnit());
      name(other.getName());
      unitType(other.getUnitType());
      upperUnit(other.getUpperUnit());
      return this;
    }

    @JsonSetter(
        value = "isUnlimitedUnit",
        nulls = Nulls.SKIP
    )
    public Builder isUnlimitedUnit(Optional<Boolean> isUnlimitedUnit) {
      this.isUnlimitedUnit = isUnlimitedUnit;
      return this;
    }

    public Builder isUnlimitedUnit(Boolean isUnlimitedUnit) {
      this.isUnlimitedUnit = Optional.of(isUnlimitedUnit);
      return this;
    }

    @JsonSetter(
        value = "lowerUnit",
        nulls = Nulls.SKIP
    )
    public Builder lowerUnit(Optional<Integer> lowerUnit) {
      this.lowerUnit = lowerUnit;
      return this;
    }

    public Builder lowerUnit(Integer lowerUnit) {
      this.lowerUnit = Optional.of(lowerUnit);
      return this;
    }

    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<AzurePricingUnitName> name) {
      this.name = name;
      return this;
    }

    public Builder name(AzurePricingUnitName name) {
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "unitType",
        nulls = Nulls.SKIP
    )
    public Builder unitType(Optional<String> unitType) {
      this.unitType = unitType;
      return this;
    }

    public Builder unitType(String unitType) {
      this.unitType = Optional.of(unitType);
      return this;
    }

    @JsonSetter(
        value = "upperUnit",
        nulls = Nulls.SKIP
    )
    public Builder upperUnit(Optional<Integer> upperUnit) {
      this.upperUnit = upperUnit;
      return this;
    }

    public Builder upperUnit(Integer upperUnit) {
      this.upperUnit = Optional.of(upperUnit);
      return this;
    }

    public AzurePricingUnit build() {
      return new AzurePricingUnit(isUnlimitedUnit, lowerUnit, name, unitType, upperUnit);
    }
  }
}
