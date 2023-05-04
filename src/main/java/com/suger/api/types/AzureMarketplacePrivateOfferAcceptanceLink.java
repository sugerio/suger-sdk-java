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
    builder = AzureMarketplacePrivateOfferAcceptanceLink.Builder.class
)
public final class AzureMarketplacePrivateOfferAcceptanceLink {
  private final Optional<String> beneficiaryId;

  private final Optional<String> link;

  private int _cachedHashCode;

  AzureMarketplacePrivateOfferAcceptanceLink(Optional<String> beneficiaryId,
      Optional<String> link) {
    this.beneficiaryId = beneficiaryId;
    this.link = link;
  }

  /**
   * @return The Customer Billing Account ID.
   */
  @JsonProperty("beneficiaryId")
  public Optional<String> getBeneficiaryId() {
    return beneficiaryId;
  }

  @JsonProperty("link")
  public Optional<String> getLink() {
    return link;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureMarketplacePrivateOfferAcceptanceLink && equalTo((AzureMarketplacePrivateOfferAcceptanceLink) other);
  }

  private boolean equalTo(AzureMarketplacePrivateOfferAcceptanceLink other) {
    return beneficiaryId.equals(other.beneficiaryId) && link.equals(other.link);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.beneficiaryId, this.link);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureMarketplacePrivateOfferAcceptanceLink{" + "beneficiaryId: " + beneficiaryId + ", link: " + link + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> beneficiaryId = Optional.empty();

    private Optional<String> link = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureMarketplacePrivateOfferAcceptanceLink other) {
      beneficiaryId(other.getBeneficiaryId());
      link(other.getLink());
      return this;
    }

    @JsonSetter(
        value = "beneficiaryId",
        nulls = Nulls.SKIP
    )
    public Builder beneficiaryId(Optional<String> beneficiaryId) {
      this.beneficiaryId = beneficiaryId;
      return this;
    }

    public Builder beneficiaryId(String beneficiaryId) {
      this.beneficiaryId = Optional.of(beneficiaryId);
      return this;
    }

    @JsonSetter(
        value = "link",
        nulls = Nulls.SKIP
    )
    public Builder link(Optional<String> link) {
      this.link = link;
      return this;
    }

    public Builder link(String link) {
      this.link = Optional.of(link);
      return this;
    }

    public AzureMarketplacePrivateOfferAcceptanceLink build() {
      return new AzureMarketplacePrivateOfferAcceptanceLink(beneficiaryId, link);
    }
  }
}
