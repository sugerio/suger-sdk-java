package com.suger.api.resources.types;

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
    builder = AzureMarketplacePrivateOfferBeneficiaryRecipient.Builder.class
)
public final class AzureMarketplacePrivateOfferBeneficiaryRecipient {
  private final Optional<String> id;

  private final Optional<AzureMarketplacePrivateOfferBeneficiaryRecipientRecipientType> recipientType;

  private int _cachedHashCode;

  AzureMarketplacePrivateOfferBeneficiaryRecipient(Optional<String> id,
      Optional<AzureMarketplacePrivateOfferBeneficiaryRecipientRecipientType> recipientType) {
    this.id = id;
    this.recipientType = recipientType;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("recipientType")
  public Optional<AzureMarketplacePrivateOfferBeneficiaryRecipientRecipientType> getRecipientType(
      ) {
    return recipientType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureMarketplacePrivateOfferBeneficiaryRecipient && equalTo((AzureMarketplacePrivateOfferBeneficiaryRecipient) other);
  }

  private boolean equalTo(AzureMarketplacePrivateOfferBeneficiaryRecipient other) {
    return id.equals(other.id) && recipientType.equals(other.recipientType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.recipientType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureMarketplacePrivateOfferBeneficiaryRecipient{" + "id: " + id + ", recipientType: " + recipientType + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<AzureMarketplacePrivateOfferBeneficiaryRecipientRecipientType> recipientType = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureMarketplacePrivateOfferBeneficiaryRecipient other) {
      id(other.getId());
      recipientType(other.getRecipientType());
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

    @JsonSetter(
        value = "recipientType",
        nulls = Nulls.SKIP
    )
    public Builder recipientType(
        Optional<AzureMarketplacePrivateOfferBeneficiaryRecipientRecipientType> recipientType) {
      this.recipientType = recipientType;
      return this;
    }

    public Builder recipientType(
        AzureMarketplacePrivateOfferBeneficiaryRecipientRecipientType recipientType) {
      this.recipientType = Optional.of(recipientType);
      return this;
    }

    public AzureMarketplacePrivateOfferBeneficiaryRecipient build() {
      return new AzureMarketplacePrivateOfferBeneficiaryRecipient(id, recipientType);
    }
  }
}
