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
    builder = AzureMarketState.Builder.class
)
public final class AzureMarketState {
  private final Optional<String> marketCode;

  private final Optional<AzureMarketStateState> state;

  private int _cachedHashCode;

  AzureMarketState(Optional<String> marketCode, Optional<AzureMarketStateState> state) {
    this.marketCode = marketCode;
    this.state = state;
  }

  /**
   * @return ISO Country Code
   */
  @JsonProperty("marketCode")
  public Optional<String> getMarketCode() {
    return marketCode;
  }

  @JsonProperty("state")
  public Optional<AzureMarketStateState> getState() {
    return state;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureMarketState && equalTo((AzureMarketState) other);
  }

  private boolean equalTo(AzureMarketState other) {
    return marketCode.equals(other.marketCode) && state.equals(other.state);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.marketCode, this.state);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureMarketState{" + "marketCode: " + marketCode + ", state: " + state + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> marketCode = Optional.empty();

    private Optional<AzureMarketStateState> state = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureMarketState other) {
      marketCode(other.getMarketCode());
      state(other.getState());
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

    @JsonSetter(
        value = "state",
        nulls = Nulls.SKIP
    )
    public Builder state(Optional<AzureMarketStateState> state) {
      this.state = state;
      return this;
    }

    public Builder state(AzureMarketStateState state) {
      this.state = Optional.of(state);
      return this;
    }

    public AzureMarketState build() {
      return new AzureMarketState(marketCode, state);
    }
  }
}
