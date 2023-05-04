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
    builder = AzureMarket.Builder.class
)
public final class AzureMarket {
  private final Optional<String> friendlyName;

  private final Optional<String> marketCode;

  private int _cachedHashCode;

  AzureMarket(Optional<String> friendlyName, Optional<String> marketCode) {
    this.friendlyName = friendlyName;
    this.marketCode = marketCode;
  }

  @JsonProperty("friendlyName")
  public Optional<String> getFriendlyName() {
    return friendlyName;
  }

  /**
   * @return ISO Country Code
   */
  @JsonProperty("marketCode")
  public Optional<String> getMarketCode() {
    return marketCode;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureMarket && equalTo((AzureMarket) other);
  }

  private boolean equalTo(AzureMarket other) {
    return friendlyName.equals(other.friendlyName) && marketCode.equals(other.marketCode);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.friendlyName, this.marketCode);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureMarket{" + "friendlyName: " + friendlyName + ", marketCode: " + marketCode + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> friendlyName = Optional.empty();

    private Optional<String> marketCode = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureMarket other) {
      friendlyName(other.getFriendlyName());
      marketCode(other.getMarketCode());
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
        value = "marketCode",
        nulls = Nulls.SKIP
    )
    public Builder marketCode(Optional<String> marketCode) {
      this.marketCode = marketCode;
      return this;
    }

    public Builder marketCode(String marketCode) {
      this.marketCode = Optional.of(marketCode);
      return this;
    }

    public AzureMarket build() {
      return new AzureMarket(friendlyName, marketCode);
    }
  }
}
