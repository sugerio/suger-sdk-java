package com.suger.api.resources.operation.requests;

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
    builder = ListOperationsRequest.Builder.class
)
public final class ListOperationsRequest {
  private final Optional<String> offerId;

  private final Optional<String> entitlementId;

  private final Optional<String> crmOpportunityId;

  private final Optional<String> partnerOpportunityId;

  private int _cachedHashCode;

  ListOperationsRequest(Optional<String> offerId, Optional<String> entitlementId,
      Optional<String> crmOpportunityId, Optional<String> partnerOpportunityId) {
    this.offerId = offerId;
    this.entitlementId = entitlementId;
    this.crmOpportunityId = crmOpportunityId;
    this.partnerOpportunityId = partnerOpportunityId;
  }

  @JsonProperty("offerId")
  public Optional<String> getOfferId() {
    return offerId;
  }

  @JsonProperty("entitlementId")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("crmOpportunityId")
  public Optional<String> getCrmOpportunityId() {
    return crmOpportunityId;
  }

  @JsonProperty("partnerOpportunityId")
  public Optional<String> getPartnerOpportunityId() {
    return partnerOpportunityId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListOperationsRequest && equalTo((ListOperationsRequest) other);
  }

  private boolean equalTo(ListOperationsRequest other) {
    return offerId.equals(other.offerId) && entitlementId.equals(other.entitlementId) && crmOpportunityId.equals(other.crmOpportunityId) && partnerOpportunityId.equals(other.partnerOpportunityId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.offerId, this.entitlementId, this.crmOpportunityId, this.partnerOpportunityId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListOperationsRequest{" + "offerId: " + offerId + ", entitlementId: " + entitlementId + ", crmOpportunityId: " + crmOpportunityId + ", partnerOpportunityId: " + partnerOpportunityId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> offerId = Optional.empty();

    private Optional<String> entitlementId = Optional.empty();

    private Optional<String> crmOpportunityId = Optional.empty();

    private Optional<String> partnerOpportunityId = Optional.empty();

    private Builder() {
    }

    public Builder from(ListOperationsRequest other) {
      offerId(other.getOfferId());
      entitlementId(other.getEntitlementId());
      crmOpportunityId(other.getCrmOpportunityId());
      partnerOpportunityId(other.getPartnerOpportunityId());
      return this;
    }

    @JsonSetter(
        value = "offerId",
        nulls = Nulls.SKIP
    )
    public Builder offerId(Optional<String> offerId) {
      this.offerId = offerId;
      return this;
    }

    public Builder offerId(String offerId) {
      this.offerId = Optional.of(offerId);
      return this;
    }

    @JsonSetter(
        value = "entitlementId",
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
        value = "crmOpportunityId",
        nulls = Nulls.SKIP
    )
    public Builder crmOpportunityId(Optional<String> crmOpportunityId) {
      this.crmOpportunityId = crmOpportunityId;
      return this;
    }

    public Builder crmOpportunityId(String crmOpportunityId) {
      this.crmOpportunityId = Optional.of(crmOpportunityId);
      return this;
    }

    @JsonSetter(
        value = "partnerOpportunityId",
        nulls = Nulls.SKIP
    )
    public Builder partnerOpportunityId(Optional<String> partnerOpportunityId) {
      this.partnerOpportunityId = partnerOpportunityId;
      return this;
    }

    public Builder partnerOpportunityId(String partnerOpportunityId) {
      this.partnerOpportunityId = Optional.of(partnerOpportunityId);
      return this;
    }

    public ListOperationsRequest build() {
      return new ListOperationsRequest(offerId, entitlementId, crmOpportunityId, partnerOpportunityId);
    }
  }
}
