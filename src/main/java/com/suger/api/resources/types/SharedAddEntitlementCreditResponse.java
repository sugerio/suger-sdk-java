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
    builder = SharedAddEntitlementCreditResponse.Builder.class
)
public final class SharedAddEntitlementCreditResponse {
  private final Optional<Double> creditAmountIncrement;

  private final Optional<String> entitlementId;

  private final Optional<String> entitlementTermId;

  private final Optional<Double> newCreditAmount;

  private final Optional<String> organizationId;

  private int _cachedHashCode;

  SharedAddEntitlementCreditResponse(Optional<Double> creditAmountIncrement,
      Optional<String> entitlementId, Optional<String> entitlementTermId,
      Optional<Double> newCreditAmount, Optional<String> organizationId) {
    this.creditAmountIncrement = creditAmountIncrement;
    this.entitlementId = entitlementId;
    this.entitlementTermId = entitlementTermId;
    this.newCreditAmount = newCreditAmount;
    this.organizationId = organizationId;
  }

  /**
   * @return The amount to be added to the credit amount.
   */
  @JsonProperty("creditAmountIncrement")
  public Optional<Double> getCreditAmountIncrement() {
    return creditAmountIncrement;
  }

  @JsonProperty("entitlementID")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("entitlementTermID")
  public Optional<String> getEntitlementTermId() {
    return entitlementTermId;
  }

  /**
   * @return The new credit amount after the increment.
   */
  @JsonProperty("newCreditAmount")
  public Optional<Double> getNewCreditAmount() {
    return newCreditAmount;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAddEntitlementCreditResponse && equalTo((SharedAddEntitlementCreditResponse) other);
  }

  private boolean equalTo(SharedAddEntitlementCreditResponse other) {
    return creditAmountIncrement.equals(other.creditAmountIncrement) && entitlementId.equals(other.entitlementId) && entitlementTermId.equals(other.entitlementTermId) && newCreditAmount.equals(other.newCreditAmount) && organizationId.equals(other.organizationId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.creditAmountIncrement, this.entitlementId, this.entitlementTermId, this.newCreditAmount, this.organizationId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAddEntitlementCreditResponse{" + "creditAmountIncrement: " + creditAmountIncrement + ", entitlementId: " + entitlementId + ", entitlementTermId: " + entitlementTermId + ", newCreditAmount: " + newCreditAmount + ", organizationId: " + organizationId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Double> creditAmountIncrement = Optional.empty();

    private Optional<String> entitlementId = Optional.empty();

    private Optional<String> entitlementTermId = Optional.empty();

    private Optional<Double> newCreditAmount = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAddEntitlementCreditResponse other) {
      creditAmountIncrement(other.getCreditAmountIncrement());
      entitlementId(other.getEntitlementId());
      entitlementTermId(other.getEntitlementTermId());
      newCreditAmount(other.getNewCreditAmount());
      organizationId(other.getOrganizationId());
      return this;
    }

    @JsonSetter(
        value = "creditAmountIncrement",
        nulls = Nulls.SKIP
    )
    public Builder creditAmountIncrement(Optional<Double> creditAmountIncrement) {
      this.creditAmountIncrement = creditAmountIncrement;
      return this;
    }

    public Builder creditAmountIncrement(Double creditAmountIncrement) {
      this.creditAmountIncrement = Optional.of(creditAmountIncrement);
      return this;
    }

    @JsonSetter(
        value = "entitlementID",
        nulls = Nulls.SKIP
    )
    public Builder entitlementId(Optional<String> entitlementId) {
      this.entitlementId = entitlementId;
      return this;
    }

    public Builder entitlementId(String entitlementId) {
      this.entitlementId = Optional.of(entitlementId);
      return this;
    }

    @JsonSetter(
        value = "entitlementTermID",
        nulls = Nulls.SKIP
    )
    public Builder entitlementTermId(Optional<String> entitlementTermId) {
      this.entitlementTermId = entitlementTermId;
      return this;
    }

    public Builder entitlementTermId(String entitlementTermId) {
      this.entitlementTermId = Optional.of(entitlementTermId);
      return this;
    }

    @JsonSetter(
        value = "newCreditAmount",
        nulls = Nulls.SKIP
    )
    public Builder newCreditAmount(Optional<Double> newCreditAmount) {
      this.newCreditAmount = newCreditAmount;
      return this;
    }

    public Builder newCreditAmount(Double newCreditAmount) {
      this.newCreditAmount = Optional.of(newCreditAmount);
      return this;
    }

    @JsonSetter(
        value = "organizationID",
        nulls = Nulls.SKIP
    )
    public Builder organizationId(Optional<String> organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    public Builder organizationId(String organizationId) {
      this.organizationId = Optional.of(organizationId);
      return this;
    }

    public SharedAddEntitlementCreditResponse build() {
      return new SharedAddEntitlementCreditResponse(creditAmountIncrement, entitlementId, entitlementTermId, newCreditAmount, organizationId);
    }
  }
}
