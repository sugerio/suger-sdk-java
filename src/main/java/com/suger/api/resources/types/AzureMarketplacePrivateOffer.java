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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzureMarketplacePrivateOffer.Builder.class
)
public final class AzureMarketplacePrivateOffer {
  private final Optional<String> schema;

  private final Optional<String> acceptBy;

  private final Optional<List<AzureMarketplacePrivateOfferAcceptanceLink>> acceptanceLinks;

  private final Optional<List<AzureMarketplacePrivateOfferBeneficiary>> beneficiaries;

  private final Optional<String> eTag;

  private final Optional<String> end;

  private final Optional<String> id;

  private final Optional<String> lastModified;

  private final Optional<String> name;

  private final Optional<List<String>> notificationContacts;

  private final Optional<String> preparedBy;

  private final Optional<List<AzureMarketplacePrivateOfferPricing>> pricing;

  private final Optional<AzureMarketplacePrivateOfferPrivateOfferType> privateOfferType;

  private final Optional<String> resourceName;

  private final Optional<String> start;

  private final Optional<AzureMarketplacePrivateOfferState> state;

  private final Optional<AzureMarketplacePrivateOfferSubState> subState;

  private final Optional<String> termsAndConditionsDocSasUrl;

  private final Optional<AzureMarketplacePrivateOfferPromotionReference> upgradedFrom;

  private final Optional<List<AzureMarketplaceValidation>> validations;

  private final Optional<Boolean> variableStartDate;

  private int _cachedHashCode;

  AzureMarketplacePrivateOffer(Optional<String> schema, Optional<String> acceptBy,
      Optional<List<AzureMarketplacePrivateOfferAcceptanceLink>> acceptanceLinks,
      Optional<List<AzureMarketplacePrivateOfferBeneficiary>> beneficiaries, Optional<String> eTag,
      Optional<String> end, Optional<String> id, Optional<String> lastModified,
      Optional<String> name, Optional<List<String>> notificationContacts,
      Optional<String> preparedBy, Optional<List<AzureMarketplacePrivateOfferPricing>> pricing,
      Optional<AzureMarketplacePrivateOfferPrivateOfferType> privateOfferType,
      Optional<String> resourceName, Optional<String> start,
      Optional<AzureMarketplacePrivateOfferState> state,
      Optional<AzureMarketplacePrivateOfferSubState> subState,
      Optional<String> termsAndConditionsDocSasUrl,
      Optional<AzureMarketplacePrivateOfferPromotionReference> upgradedFrom,
      Optional<List<AzureMarketplaceValidation>> validations, Optional<Boolean> variableStartDate) {
    this.schema = schema;
    this.acceptBy = acceptBy;
    this.acceptanceLinks = acceptanceLinks;
    this.beneficiaries = beneficiaries;
    this.eTag = eTag;
    this.end = end;
    this.id = id;
    this.lastModified = lastModified;
    this.name = name;
    this.notificationContacts = notificationContacts;
    this.preparedBy = preparedBy;
    this.pricing = pricing;
    this.privateOfferType = privateOfferType;
    this.resourceName = resourceName;
    this.start = start;
    this.state = state;
    this.subState = subState;
    this.termsAndConditionsDocSasUrl = termsAndConditionsDocSasUrl;
    this.upgradedFrom = upgradedFrom;
    this.validations = validations;
    this.variableStartDate = variableStartDate;
  }

  @JsonProperty("$schema")
  public Optional<String> getSchema() {
    return schema;
  }

  /**
   * @return in format YYYY-MM-DD
   */
  @JsonProperty("acceptBy")
  public Optional<String> getAcceptBy() {
    return acceptBy;
  }

  @JsonProperty("acceptanceLinks")
  public Optional<List<AzureMarketplacePrivateOfferAcceptanceLink>> getAcceptanceLinks() {
    return acceptanceLinks;
  }

  /**
   * @return array of email addresses.
   */
  @JsonProperty("beneficiaries")
  public Optional<List<AzureMarketplacePrivateOfferBeneficiary>> getBeneficiaries() {
    return beneficiaries;
  }

  @JsonProperty("eTag")
  public Optional<String> getETag() {
    return eTag;
  }

  /**
   * @return in format YYYY-MM-DD
   */
  @JsonProperty("end")
  public Optional<String> getEnd() {
    return end;
  }

  /**
   * @return in format of &quot;private-offer/private-offer-durable-id&quot;
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return in format YYYY-MM-DD
   */
  @JsonProperty("lastModified")
  public Optional<String> getLastModified() {
    return lastModified;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return array of email addresses of the users to be notified of any changes in the private offer status.
   */
  @JsonProperty("notificationContacts")
  public Optional<List<String>> getNotificationContacts() {
    return notificationContacts;
  }

  @JsonProperty("preparedBy")
  public Optional<String> getPreparedBy() {
    return preparedBy;
  }

  /**
   * @return Up to 10 pricing entries are allowed.
   */
  @JsonProperty("pricing")
  public Optional<List<AzureMarketplacePrivateOfferPricing>> getPricing() {
    return pricing;
  }

  @JsonProperty("privateOfferType")
  public Optional<AzureMarketplacePrivateOfferPrivateOfferType> getPrivateOfferType() {
    return privateOfferType;
  }

  @JsonProperty("resourceName")
  public Optional<String> getResourceName() {
    return resourceName;
  }

  /**
   * @return in format YYYY-MM-DD, if VariableStartDate = true, this field should be empty.
   */
  @JsonProperty("start")
  public Optional<String> getStart() {
    return start;
  }

  @JsonProperty("state")
  public Optional<AzureMarketplacePrivateOfferState> getState() {
    return state;
  }

  @JsonProperty("subState")
  public Optional<AzureMarketplacePrivateOfferSubState> getSubState() {
    return subState;
  }

  @JsonProperty("termsAndConditionsDocSasUrl")
  public Optional<String> getTermsAndConditionsDocSasUrl() {
    return termsAndConditionsDocSasUrl;
  }

  @JsonProperty("upgradedFrom")
  public Optional<AzureMarketplacePrivateOfferPromotionReference> getUpgradedFrom() {
    return upgradedFrom;
  }

  @JsonProperty("validations")
  public Optional<List<AzureMarketplaceValidation>> getValidations() {
    return validations;
  }

  @JsonProperty("variableStartDate")
  public Optional<Boolean> getVariableStartDate() {
    return variableStartDate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureMarketplacePrivateOffer && equalTo((AzureMarketplacePrivateOffer) other);
  }

  private boolean equalTo(AzureMarketplacePrivateOffer other) {
    return schema.equals(other.schema) && acceptBy.equals(other.acceptBy) && acceptanceLinks.equals(other.acceptanceLinks) && beneficiaries.equals(other.beneficiaries) && eTag.equals(other.eTag) && end.equals(other.end) && id.equals(other.id) && lastModified.equals(other.lastModified) && name.equals(other.name) && notificationContacts.equals(other.notificationContacts) && preparedBy.equals(other.preparedBy) && pricing.equals(other.pricing) && privateOfferType.equals(other.privateOfferType) && resourceName.equals(other.resourceName) && start.equals(other.start) && state.equals(other.state) && subState.equals(other.subState) && termsAndConditionsDocSasUrl.equals(other.termsAndConditionsDocSasUrl) && upgradedFrom.equals(other.upgradedFrom) && validations.equals(other.validations) && variableStartDate.equals(other.variableStartDate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.schema, this.acceptBy, this.acceptanceLinks, this.beneficiaries, this.eTag, this.end, this.id, this.lastModified, this.name, this.notificationContacts, this.preparedBy, this.pricing, this.privateOfferType, this.resourceName, this.start, this.state, this.subState, this.termsAndConditionsDocSasUrl, this.upgradedFrom, this.validations, this.variableStartDate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureMarketplacePrivateOffer{" + "schema: " + schema + ", acceptBy: " + acceptBy + ", acceptanceLinks: " + acceptanceLinks + ", beneficiaries: " + beneficiaries + ", eTag: " + eTag + ", end: " + end + ", id: " + id + ", lastModified: " + lastModified + ", name: " + name + ", notificationContacts: " + notificationContacts + ", preparedBy: " + preparedBy + ", pricing: " + pricing + ", privateOfferType: " + privateOfferType + ", resourceName: " + resourceName + ", start: " + start + ", state: " + state + ", subState: " + subState + ", termsAndConditionsDocSasUrl: " + termsAndConditionsDocSasUrl + ", upgradedFrom: " + upgradedFrom + ", validations: " + validations + ", variableStartDate: " + variableStartDate + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> schema = Optional.empty();

    private Optional<String> acceptBy = Optional.empty();

    private Optional<List<AzureMarketplacePrivateOfferAcceptanceLink>> acceptanceLinks = Optional.empty();

    private Optional<List<AzureMarketplacePrivateOfferBeneficiary>> beneficiaries = Optional.empty();

    private Optional<String> eTag = Optional.empty();

    private Optional<String> end = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> lastModified = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<List<String>> notificationContacts = Optional.empty();

    private Optional<String> preparedBy = Optional.empty();

    private Optional<List<AzureMarketplacePrivateOfferPricing>> pricing = Optional.empty();

    private Optional<AzureMarketplacePrivateOfferPrivateOfferType> privateOfferType = Optional.empty();

    private Optional<String> resourceName = Optional.empty();

    private Optional<String> start = Optional.empty();

    private Optional<AzureMarketplacePrivateOfferState> state = Optional.empty();

    private Optional<AzureMarketplacePrivateOfferSubState> subState = Optional.empty();

    private Optional<String> termsAndConditionsDocSasUrl = Optional.empty();

    private Optional<AzureMarketplacePrivateOfferPromotionReference> upgradedFrom = Optional.empty();

    private Optional<List<AzureMarketplaceValidation>> validations = Optional.empty();

    private Optional<Boolean> variableStartDate = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureMarketplacePrivateOffer other) {
      schema(other.getSchema());
      acceptBy(other.getAcceptBy());
      acceptanceLinks(other.getAcceptanceLinks());
      beneficiaries(other.getBeneficiaries());
      eTag(other.getETag());
      end(other.getEnd());
      id(other.getId());
      lastModified(other.getLastModified());
      name(other.getName());
      notificationContacts(other.getNotificationContacts());
      preparedBy(other.getPreparedBy());
      pricing(other.getPricing());
      privateOfferType(other.getPrivateOfferType());
      resourceName(other.getResourceName());
      start(other.getStart());
      state(other.getState());
      subState(other.getSubState());
      termsAndConditionsDocSasUrl(other.getTermsAndConditionsDocSasUrl());
      upgradedFrom(other.getUpgradedFrom());
      validations(other.getValidations());
      variableStartDate(other.getVariableStartDate());
      return this;
    }

    @JsonSetter(
        value = "$schema",
        nulls = Nulls.SKIP
    )
    public Builder schema(Optional<String> schema) {
      this.schema = schema;
      return this;
    }

    public Builder schema(String schema) {
      this.schema = Optional.of(schema);
      return this;
    }

    @JsonSetter(
        value = "acceptBy",
        nulls = Nulls.SKIP
    )
    public Builder acceptBy(Optional<String> acceptBy) {
      this.acceptBy = acceptBy;
      return this;
    }

    public Builder acceptBy(String acceptBy) {
      this.acceptBy = Optional.of(acceptBy);
      return this;
    }

    @JsonSetter(
        value = "acceptanceLinks",
        nulls = Nulls.SKIP
    )
    public Builder acceptanceLinks(
        Optional<List<AzureMarketplacePrivateOfferAcceptanceLink>> acceptanceLinks) {
      this.acceptanceLinks = acceptanceLinks;
      return this;
    }

    public Builder acceptanceLinks(
        List<AzureMarketplacePrivateOfferAcceptanceLink> acceptanceLinks) {
      this.acceptanceLinks = Optional.of(acceptanceLinks);
      return this;
    }

    @JsonSetter(
        value = "beneficiaries",
        nulls = Nulls.SKIP
    )
    public Builder beneficiaries(
        Optional<List<AzureMarketplacePrivateOfferBeneficiary>> beneficiaries) {
      this.beneficiaries = beneficiaries;
      return this;
    }

    public Builder beneficiaries(List<AzureMarketplacePrivateOfferBeneficiary> beneficiaries) {
      this.beneficiaries = Optional.of(beneficiaries);
      return this;
    }

    @JsonSetter(
        value = "eTag",
        nulls = Nulls.SKIP
    )
    public Builder eTag(Optional<String> eTag) {
      this.eTag = eTag;
      return this;
    }

    public Builder eTag(String eTag) {
      this.eTag = Optional.of(eTag);
      return this;
    }

    @JsonSetter(
        value = "end",
        nulls = Nulls.SKIP
    )
    public Builder end(Optional<String> end) {
      this.end = end;
      return this;
    }

    public Builder end(String end) {
      this.end = Optional.of(end);
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
        value = "lastModified",
        nulls = Nulls.SKIP
    )
    public Builder lastModified(Optional<String> lastModified) {
      this.lastModified = lastModified;
      return this;
    }

    public Builder lastModified(String lastModified) {
      this.lastModified = Optional.of(lastModified);
      return this;
    }

    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "notificationContacts",
        nulls = Nulls.SKIP
    )
    public Builder notificationContacts(Optional<List<String>> notificationContacts) {
      this.notificationContacts = notificationContacts;
      return this;
    }

    public Builder notificationContacts(List<String> notificationContacts) {
      this.notificationContacts = Optional.of(notificationContacts);
      return this;
    }

    @JsonSetter(
        value = "preparedBy",
        nulls = Nulls.SKIP
    )
    public Builder preparedBy(Optional<String> preparedBy) {
      this.preparedBy = preparedBy;
      return this;
    }

    public Builder preparedBy(String preparedBy) {
      this.preparedBy = Optional.of(preparedBy);
      return this;
    }

    @JsonSetter(
        value = "pricing",
        nulls = Nulls.SKIP
    )
    public Builder pricing(Optional<List<AzureMarketplacePrivateOfferPricing>> pricing) {
      this.pricing = pricing;
      return this;
    }

    public Builder pricing(List<AzureMarketplacePrivateOfferPricing> pricing) {
      this.pricing = Optional.of(pricing);
      return this;
    }

    @JsonSetter(
        value = "privateOfferType",
        nulls = Nulls.SKIP
    )
    public Builder privateOfferType(
        Optional<AzureMarketplacePrivateOfferPrivateOfferType> privateOfferType) {
      this.privateOfferType = privateOfferType;
      return this;
    }

    public Builder privateOfferType(AzureMarketplacePrivateOfferPrivateOfferType privateOfferType) {
      this.privateOfferType = Optional.of(privateOfferType);
      return this;
    }

    @JsonSetter(
        value = "resourceName",
        nulls = Nulls.SKIP
    )
    public Builder resourceName(Optional<String> resourceName) {
      this.resourceName = resourceName;
      return this;
    }

    public Builder resourceName(String resourceName) {
      this.resourceName = Optional.of(resourceName);
      return this;
    }

    @JsonSetter(
        value = "start",
        nulls = Nulls.SKIP
    )
    public Builder start(Optional<String> start) {
      this.start = start;
      return this;
    }

    public Builder start(String start) {
      this.start = Optional.of(start);
      return this;
    }

    @JsonSetter(
        value = "state",
        nulls = Nulls.SKIP
    )
    public Builder state(Optional<AzureMarketplacePrivateOfferState> state) {
      this.state = state;
      return this;
    }

    public Builder state(AzureMarketplacePrivateOfferState state) {
      this.state = Optional.of(state);
      return this;
    }

    @JsonSetter(
        value = "subState",
        nulls = Nulls.SKIP
    )
    public Builder subState(Optional<AzureMarketplacePrivateOfferSubState> subState) {
      this.subState = subState;
      return this;
    }

    public Builder subState(AzureMarketplacePrivateOfferSubState subState) {
      this.subState = Optional.of(subState);
      return this;
    }

    @JsonSetter(
        value = "termsAndConditionsDocSasUrl",
        nulls = Nulls.SKIP
    )
    public Builder termsAndConditionsDocSasUrl(Optional<String> termsAndConditionsDocSasUrl) {
      this.termsAndConditionsDocSasUrl = termsAndConditionsDocSasUrl;
      return this;
    }

    public Builder termsAndConditionsDocSasUrl(String termsAndConditionsDocSasUrl) {
      this.termsAndConditionsDocSasUrl = Optional.of(termsAndConditionsDocSasUrl);
      return this;
    }

    @JsonSetter(
        value = "upgradedFrom",
        nulls = Nulls.SKIP
    )
    public Builder upgradedFrom(
        Optional<AzureMarketplacePrivateOfferPromotionReference> upgradedFrom) {
      this.upgradedFrom = upgradedFrom;
      return this;
    }

    public Builder upgradedFrom(AzureMarketplacePrivateOfferPromotionReference upgradedFrom) {
      this.upgradedFrom = Optional.of(upgradedFrom);
      return this;
    }

    @JsonSetter(
        value = "validations",
        nulls = Nulls.SKIP
    )
    public Builder validations(Optional<List<AzureMarketplaceValidation>> validations) {
      this.validations = validations;
      return this;
    }

    public Builder validations(List<AzureMarketplaceValidation> validations) {
      this.validations = Optional.of(validations);
      return this;
    }

    @JsonSetter(
        value = "variableStartDate",
        nulls = Nulls.SKIP
    )
    public Builder variableStartDate(Optional<Boolean> variableStartDate) {
      this.variableStartDate = variableStartDate;
      return this;
    }

    public Builder variableStartDate(Boolean variableStartDate) {
      this.variableStartDate = Optional.of(variableStartDate);
      return this;
    }

    public AzureMarketplacePrivateOffer build() {
      return new AzureMarketplacePrivateOffer(schema, acceptBy, acceptanceLinks, beneficiaries, eTag, end, id, lastModified, name, notificationContacts, preparedBy, pricing, privateOfferType, resourceName, start, state, subState, termsAndConditionsDocSasUrl, upgradedFrom, validations, variableStartDate);
    }
  }
}
