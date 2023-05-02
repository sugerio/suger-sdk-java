package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzureLocalizedDateTime.Builder.class
)
public final class AzureLocalizedDateTime {
  private final Optional<String> dateTimeInUtc;

  private final Optional<Boolean> localizePerMarket;

  private int _cachedHashCode;

  AzureLocalizedDateTime(Optional<String> dateTimeInUtc, Optional<Boolean> localizePerMarket) {
    this.dateTimeInUtc = dateTimeInUtc;
    this.localizePerMarket = localizePerMarket;
  }

  @JsonProperty("dateTimeInUtc")
  public Optional<String> getDateTimeInUtc() {
    return dateTimeInUtc;
  }

  @JsonProperty("localizePerMarket")
  public Optional<Boolean> getLocalizePerMarket() {
    return localizePerMarket;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureLocalizedDateTime && equalTo((AzureLocalizedDateTime) other);
  }

  private boolean equalTo(AzureLocalizedDateTime other) {
    return dateTimeInUtc.equals(other.dateTimeInUtc) && localizePerMarket.equals(other.localizePerMarket);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.dateTimeInUtc, this.localizePerMarket);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureLocalizedDateTime{" + "dateTimeInUtc: " + dateTimeInUtc + ", localizePerMarket: " + localizePerMarket + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> dateTimeInUtc = Optional.empty();

    private Optional<Boolean> localizePerMarket = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureLocalizedDateTime other) {
      dateTimeInUtc(other.getDateTimeInUtc());
      localizePerMarket(other.getLocalizePerMarket());
      return this;
    }

    @JsonSetter(
        value = "dateTimeInUtc",
        nulls = Nulls.SKIP
    )
    public Builder dateTimeInUtc(Optional<String> dateTimeInUtc) {
      this.dateTimeInUtc = dateTimeInUtc;
      return this;
    }

    public Builder dateTimeInUtc(String dateTimeInUtc) {
      this.dateTimeInUtc = Optional.of(dateTimeInUtc);
      return this;
    }

    @JsonSetter(
        value = "localizePerMarket",
        nulls = Nulls.SKIP
    )
    public Builder localizePerMarket(Optional<Boolean> localizePerMarket) {
      this.localizePerMarket = localizePerMarket;
      return this;
    }

    public Builder localizePerMarket(Boolean localizePerMarket) {
      this.localizePerMarket = Optional.of(localizePerMarket);
      return this;
    }

    public AzureLocalizedDateTime build() {
      return new AzureLocalizedDateTime(dateTimeInUtc, localizePerMarket);
    }
  }
}
