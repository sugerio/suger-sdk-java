package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzureProductVariantPriceSchedule.Builder.class
)
public final class AzureProductVariantPriceSchedule {
  private final Optional<AzureLocalizedTimeRange> dateTimeRange;

  private final Optional<String> friendlyName;

  private final Optional<Boolean> isBaseSchedule;

  private final Optional<List<String>> marketCodes;

  private final Optional<List<AzurePriceSchedule>> schedules;

  private int _cachedHashCode;

  AzureProductVariantPriceSchedule(Optional<AzureLocalizedTimeRange> dateTimeRange,
      Optional<String> friendlyName, Optional<Boolean> isBaseSchedule,
      Optional<List<String>> marketCodes, Optional<List<AzurePriceSchedule>> schedules) {
    this.dateTimeRange = dateTimeRange;
    this.friendlyName = friendlyName;
    this.isBaseSchedule = isBaseSchedule;
    this.marketCodes = marketCodes;
    this.schedules = schedules;
  }

  @JsonProperty("dateTimeRange")
  public Optional<AzureLocalizedTimeRange> getDateTimeRange() {
    return dateTimeRange;
  }

  @JsonProperty("friendlyName")
  public Optional<String> getFriendlyName() {
    return friendlyName;
  }

  /**
   * @return There is only one base schedule.
   */
  @JsonProperty("isBaseSchedule")
  public Optional<Boolean> getIsBaseSchedule() {
    return isBaseSchedule;
  }

  /**
   * @return ISO country code
   */
  @JsonProperty("marketCodes")
  public Optional<List<String>> getMarketCodes() {
    return marketCodes;
  }

  @JsonProperty("schedules")
  public Optional<List<AzurePriceSchedule>> getSchedules() {
    return schedules;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductVariantPriceSchedule && equalTo((AzureProductVariantPriceSchedule) other);
  }

  private boolean equalTo(AzureProductVariantPriceSchedule other) {
    return dateTimeRange.equals(other.dateTimeRange) && friendlyName.equals(other.friendlyName) && isBaseSchedule.equals(other.isBaseSchedule) && marketCodes.equals(other.marketCodes) && schedules.equals(other.schedules);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.dateTimeRange, this.friendlyName, this.isBaseSchedule, this.marketCodes, this.schedules);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductVariantPriceSchedule{" + "dateTimeRange: " + dateTimeRange + ", friendlyName: " + friendlyName + ", isBaseSchedule: " + isBaseSchedule + ", marketCodes: " + marketCodes + ", schedules: " + schedules + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AzureLocalizedTimeRange> dateTimeRange = Optional.empty();

    private Optional<String> friendlyName = Optional.empty();

    private Optional<Boolean> isBaseSchedule = Optional.empty();

    private Optional<List<String>> marketCodes = Optional.empty();

    private Optional<List<AzurePriceSchedule>> schedules = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductVariantPriceSchedule other) {
      dateTimeRange(other.getDateTimeRange());
      friendlyName(other.getFriendlyName());
      isBaseSchedule(other.getIsBaseSchedule());
      marketCodes(other.getMarketCodes());
      schedules(other.getSchedules());
      return this;
    }

    @JsonSetter(
        value = "dateTimeRange",
        nulls = Nulls.SKIP
    )
    public Builder dateTimeRange(Optional<AzureLocalizedTimeRange> dateTimeRange) {
      this.dateTimeRange = dateTimeRange;
      return this;
    }

    public Builder dateTimeRange(AzureLocalizedTimeRange dateTimeRange) {
      this.dateTimeRange = Optional.of(dateTimeRange);
      return this;
    }

    @JsonSetter(
        value = "friendlyName",
        nulls = Nulls.SKIP
    )
    public Builder friendlyName(Optional<String> friendlyName) {
      this.friendlyName = friendlyName;
      return this;
    }

    public Builder friendlyName(String friendlyName) {
      this.friendlyName = Optional.of(friendlyName);
      return this;
    }

    @JsonSetter(
        value = "isBaseSchedule",
        nulls = Nulls.SKIP
    )
    public Builder isBaseSchedule(Optional<Boolean> isBaseSchedule) {
      this.isBaseSchedule = isBaseSchedule;
      return this;
    }

    public Builder isBaseSchedule(Boolean isBaseSchedule) {
      this.isBaseSchedule = Optional.of(isBaseSchedule);
      return this;
    }

    @JsonSetter(
        value = "marketCodes",
        nulls = Nulls.SKIP
    )
    public Builder marketCodes(Optional<List<String>> marketCodes) {
      this.marketCodes = marketCodes;
      return this;
    }

    public Builder marketCodes(List<String> marketCodes) {
      this.marketCodes = Optional.of(marketCodes);
      return this;
    }

    @JsonSetter(
        value = "schedules",
        nulls = Nulls.SKIP
    )
    public Builder schedules(Optional<List<AzurePriceSchedule>> schedules) {
      this.schedules = schedules;
      return this;
    }

    public Builder schedules(List<AzurePriceSchedule> schedules) {
      this.schedules = Optional.of(schedules);
      return this;
    }

    public AzureProductVariantPriceSchedule build() {
      return new AzureProductVariantPriceSchedule(dateTimeRange, friendlyName, isBaseSchedule, marketCodes, schedules);
    }
  }
}
