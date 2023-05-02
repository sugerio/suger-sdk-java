package com.suger.api.resources.types;

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
    builder = SharedPaymentInstallment.Builder.class
)
public final class SharedPaymentInstallment {
  private final Optional<Double> amount;

  private final Optional<String> chargeOn;

  private int _cachedHashCode;

  SharedPaymentInstallment(Optional<Double> amount, Optional<String> chargeOn) {
    this.amount = amount;
    this.chargeOn = chargeOn;
  }

  @JsonProperty("amount")
  public Optional<Double> getAmount() {
    return amount;
  }

  @JsonProperty("chargeOn")
  public Optional<String> getChargeOn() {
    return chargeOn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedPaymentInstallment && equalTo((SharedPaymentInstallment) other);
  }

  private boolean equalTo(SharedPaymentInstallment other) {
    return amount.equals(other.amount) && chargeOn.equals(other.chargeOn);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.amount, this.chargeOn);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedPaymentInstallment{" + "amount: " + amount + ", chargeOn: " + chargeOn + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Double> amount = Optional.empty();

    private Optional<String> chargeOn = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedPaymentInstallment other) {
      amount(other.getAmount());
      chargeOn(other.getChargeOn());
      return this;
    }

    @JsonSetter(
        value = "amount",
        nulls = Nulls.SKIP
    )
    public Builder amount(Optional<Double> amount) {
      this.amount = amount;
      return this;
    }

    public Builder amount(Double amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    @JsonSetter(
        value = "chargeOn",
        nulls = Nulls.SKIP
    )
    public Builder chargeOn(Optional<String> chargeOn) {
      this.chargeOn = chargeOn;
      return this;
    }

    public Builder chargeOn(String chargeOn) {
      this.chargeOn = Optional.of(chargeOn);
      return this;
    }

    public SharedPaymentInstallment build() {
      return new SharedPaymentInstallment(amount, chargeOn);
    }
  }
}
