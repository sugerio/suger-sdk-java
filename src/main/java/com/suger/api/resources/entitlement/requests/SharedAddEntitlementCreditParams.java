package com.suger.api.resources.entitlement.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = SharedAddEntitlementCreditParams.Builder.class
)
public final class SharedAddEntitlementCreditParams {
  private final double creditAmountIncrement;

  private final String entitlementId;

  private final String organizationId;

  private int _cachedHashCode;

  SharedAddEntitlementCreditParams(double creditAmountIncrement, String entitlementId,
      String organizationId) {
    this.creditAmountIncrement = creditAmountIncrement;
    this.entitlementId = entitlementId;
    this.organizationId = organizationId;
  }

  /**
   * @return The amount to be added to the credit amount.
   */
  @JsonProperty("creditAmountIncrement")
  public double getCreditAmountIncrement() {
    return creditAmountIncrement;
  }

  @JsonProperty("entitlementID")
  public String getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("organizationID")
  public String getOrganizationId() {
    return organizationId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAddEntitlementCreditParams && equalTo((SharedAddEntitlementCreditParams) other);
  }

  private boolean equalTo(SharedAddEntitlementCreditParams other) {
    return creditAmountIncrement == other.creditAmountIncrement && entitlementId.equals(other.entitlementId) && organizationId.equals(other.organizationId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.creditAmountIncrement, this.entitlementId, this.organizationId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAddEntitlementCreditParams{" + "creditAmountIncrement: " + creditAmountIncrement + ", entitlementId: " + entitlementId + ", organizationId: " + organizationId + "}";
  }

  public static CreditAmountIncrementStage builder() {
    return new Builder();
  }

  public interface CreditAmountIncrementStage {
    EntitlementIdStage creditAmountIncrement(double creditAmountIncrement);

    Builder from(SharedAddEntitlementCreditParams other);
  }

  public interface EntitlementIdStage {
    OrganizationIdStage entitlementId(String entitlementId);
  }

  public interface OrganizationIdStage {
    _FinalStage organizationId(String organizationId);
  }

  public interface _FinalStage {
    SharedAddEntitlementCreditParams build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements CreditAmountIncrementStage, EntitlementIdStage, OrganizationIdStage, _FinalStage {
    private double creditAmountIncrement;

    private String entitlementId;

    private String organizationId;

    private Builder() {
    }

    @Override
    public Builder from(SharedAddEntitlementCreditParams other) {
      creditAmountIncrement(other.getCreditAmountIncrement());
      entitlementId(other.getEntitlementId());
      organizationId(other.getOrganizationId());
      return this;
    }

    /**
     * <p>The amount to be added to the credit amount.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("creditAmountIncrement")
    public EntitlementIdStage creditAmountIncrement(double creditAmountIncrement) {
      this.creditAmountIncrement = creditAmountIncrement;
      return this;
    }

    @Override
    @JsonSetter("entitlementID")
    public OrganizationIdStage entitlementId(String entitlementId) {
      this.entitlementId = entitlementId;
      return this;
    }

    @Override
    @JsonSetter("organizationID")
    public _FinalStage organizationId(String organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    @Override
    public SharedAddEntitlementCreditParams build() {
      return new SharedAddEntitlementCreditParams(creditAmountIncrement, entitlementId, organizationId);
    }
  }
}
