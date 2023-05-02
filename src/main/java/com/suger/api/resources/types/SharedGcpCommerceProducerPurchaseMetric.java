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
    builder = SharedGcpCommerceProducerPurchaseMetric.Builder.class
)
public final class SharedGcpCommerceProducerPurchaseMetric {
  private final Optional<String> description;

  private final Optional<String> displayName;

  private final Optional<String> displayUnit;

  private final Optional<String> displayUnitDescription;

  private final Optional<String> id;

  private final Optional<String> metricKind;

  private final Optional<String> name;

  private final Optional<String> reportingUnit;

  private final Optional<String> unit;

  private final Optional<SharedValueType> valueType;

  private int _cachedHashCode;

  SharedGcpCommerceProducerPurchaseMetric(Optional<String> description,
      Optional<String> displayName, Optional<String> displayUnit,
      Optional<String> displayUnitDescription, Optional<String> id, Optional<String> metricKind,
      Optional<String> name, Optional<String> reportingUnit, Optional<String> unit,
      Optional<SharedValueType> valueType) {
    this.description = description;
    this.displayName = displayName;
    this.displayUnit = displayUnit;
    this.displayUnitDescription = displayUnitDescription;
    this.id = id;
    this.metricKind = metricKind;
    this.name = name;
    this.reportingUnit = reportingUnit;
    this.unit = unit;
    this.valueType = valueType;
  }

  /**
   * @return Description: A detailed description of the metric, which can be used in documentation.
   */
  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("displayName")
  public Optional<String> getDisplayName() {
    return displayName;
  }

  @JsonProperty("displayUnit")
  public Optional<String> getDisplayUnit() {
    return displayUnit;
  }

  @JsonProperty("displayUnitDescription")
  public Optional<String> getDisplayUnitDescription() {
    return displayUnitDescription;
  }

  /**
   * @return The usage metering dimension key, in format of &quot;{plan_key}_{usage_dimension_key}&quot;
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("metricKind")
  public Optional<String> getMetricKind() {
    return metricKind;
  }

  /**
   * @return Name: The resource name of the metric descriptor, in format of &quot;{service_name}/{plan_key}_{usage_dimension_key}&quot;
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("reportingUnit")
  public Optional<String> getReportingUnit() {
    return reportingUnit;
  }

  @JsonProperty("unit")
  public Optional<String> getUnit() {
    return unit;
  }

  @JsonProperty("valueType")
  public Optional<SharedValueType> getValueType() {
    return valueType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerPurchaseMetric && equalTo((SharedGcpCommerceProducerPurchaseMetric) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerPurchaseMetric other) {
    return description.equals(other.description) && displayName.equals(other.displayName) && displayUnit.equals(other.displayUnit) && displayUnitDescription.equals(other.displayUnitDescription) && id.equals(other.id) && metricKind.equals(other.metricKind) && name.equals(other.name) && reportingUnit.equals(other.reportingUnit) && unit.equals(other.unit) && valueType.equals(other.valueType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.description, this.displayName, this.displayUnit, this.displayUnitDescription, this.id, this.metricKind, this.name, this.reportingUnit, this.unit, this.valueType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerPurchaseMetric{" + "description: " + description + ", displayName: " + displayName + ", displayUnit: " + displayUnit + ", displayUnitDescription: " + displayUnitDescription + ", id: " + id + ", metricKind: " + metricKind + ", name: " + name + ", reportingUnit: " + reportingUnit + ", unit: " + unit + ", valueType: " + valueType + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> description = Optional.empty();

    private Optional<String> displayName = Optional.empty();

    private Optional<String> displayUnit = Optional.empty();

    private Optional<String> displayUnitDescription = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> metricKind = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> reportingUnit = Optional.empty();

    private Optional<String> unit = Optional.empty();

    private Optional<SharedValueType> valueType = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerPurchaseMetric other) {
      description(other.getDescription());
      displayName(other.getDisplayName());
      displayUnit(other.getDisplayUnit());
      displayUnitDescription(other.getDisplayUnitDescription());
      id(other.getId());
      metricKind(other.getMetricKind());
      name(other.getName());
      reportingUnit(other.getReportingUnit());
      unit(other.getUnit());
      valueType(other.getValueType());
      return this;
    }

    @JsonSetter(
        value = "description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<String> description) {
      this.description = description;
      return this;
    }

    public Builder description(String description) {
      this.description = Optional.of(description);
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
        value = "displayUnit",
        nulls = Nulls.SKIP
    )
    public Builder displayUnit(Optional<String> displayUnit) {
      this.displayUnit = displayUnit;
      return this;
    }

    public Builder displayUnit(String displayUnit) {
      this.displayUnit = Optional.of(displayUnit);
      return this;
    }

    @JsonSetter(
        value = "displayUnitDescription",
        nulls = Nulls.SKIP
    )
    public Builder displayUnitDescription(Optional<String> displayUnitDescription) {
      this.displayUnitDescription = displayUnitDescription;
      return this;
    }

    public Builder displayUnitDescription(String displayUnitDescription) {
      this.displayUnitDescription = Optional.of(displayUnitDescription);
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
        value = "metricKind",
        nulls = Nulls.SKIP
    )
    public Builder metricKind(Optional<String> metricKind) {
      this.metricKind = metricKind;
      return this;
    }

    public Builder metricKind(String metricKind) {
      this.metricKind = Optional.of(metricKind);
      return this;
    }

    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "reportingUnit",
        nulls = Nulls.SKIP
    )
    public Builder reportingUnit(Optional<String> reportingUnit) {
      this.reportingUnit = reportingUnit;
      return this;
    }

    public Builder reportingUnit(String reportingUnit) {
      this.reportingUnit = Optional.of(reportingUnit);
      return this;
    }

    @JsonSetter(
        value = "unit",
        nulls = Nulls.SKIP
    )
    public Builder unit(Optional<String> unit) {
      this.unit = unit;
      return this;
    }

    public Builder unit(String unit) {
      this.unit = Optional.of(unit);
      return this;
    }

    @JsonSetter(
        value = "valueType",
        nulls = Nulls.SKIP
    )
    public Builder valueType(Optional<SharedValueType> valueType) {
      this.valueType = valueType;
      return this;
    }

    public Builder valueType(SharedValueType valueType) {
      this.valueType = Optional.of(valueType);
      return this;
    }

    public SharedGcpCommerceProducerPurchaseMetric build() {
      return new SharedGcpCommerceProducerPurchaseMetric(description, displayName, displayUnit, displayUnitDescription, id, metricKind, name, reportingUnit, unit, valueType);
    }
  }
}
