package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzureMarketplacePrivateOfferBeneficiary.Builder.class
)
public final class AzureMarketplacePrivateOfferBeneficiary {
  private final Optional<List<AzureMarketplacePrivateOfferBeneficiaryRecipient>> beneficiaryRecipients;

  private final Optional<String> description;

  private final Optional<String> id;

  private int _cachedHashCode;

  AzureMarketplacePrivateOfferBeneficiary(
      Optional<List<AzureMarketplacePrivateOfferBeneficiaryRecipient>> beneficiaryRecipients,
      Optional<String> description, Optional<String> id) {
    this.beneficiaryRecipients = beneficiaryRecipients;
    this.description = description;
    this.id = id;
  }

  @JsonProperty("beneficiaryRecipients")
  public Optional<List<AzureMarketplacePrivateOfferBeneficiaryRecipient>> getBeneficiaryRecipients(
      ) {
    return beneficiaryRecipients;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  /**
   * @return the customer billing account id.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureMarketplacePrivateOfferBeneficiary && equalTo((AzureMarketplacePrivateOfferBeneficiary) other);
  }

  private boolean equalTo(AzureMarketplacePrivateOfferBeneficiary other) {
    return beneficiaryRecipients.equals(other.beneficiaryRecipients) && description.equals(other.description) && id.equals(other.id);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.beneficiaryRecipients, this.description, this.id);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureMarketplacePrivateOfferBeneficiary{" + "beneficiaryRecipients: " + beneficiaryRecipients + ", description: " + description + ", id: " + id + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<AzureMarketplacePrivateOfferBeneficiaryRecipient>> beneficiaryRecipients = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureMarketplacePrivateOfferBeneficiary other) {
      beneficiaryRecipients(other.getBeneficiaryRecipients());
      description(other.getDescription());
      id(other.getId());
      return this;
    }

    @JsonSetter(
        value = "beneficiaryRecipients",
        nulls = Nulls.SKIP
    )
    public Builder beneficiaryRecipients(
        Optional<List<AzureMarketplacePrivateOfferBeneficiaryRecipient>> beneficiaryRecipients) {
      this.beneficiaryRecipients = beneficiaryRecipients;
      return this;
    }

    public Builder beneficiaryRecipients(
        List<AzureMarketplacePrivateOfferBeneficiaryRecipient> beneficiaryRecipients) {
      this.beneficiaryRecipients = Optional.of(beneficiaryRecipients);
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

    public AzureMarketplacePrivateOfferBeneficiary build() {
      return new AzureMarketplacePrivateOfferBeneficiary(beneficiaryRecipients, description, id);
    }
  }
}
