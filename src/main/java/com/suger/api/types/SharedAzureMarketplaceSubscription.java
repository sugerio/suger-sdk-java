package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedAzureMarketplaceSubscription.Builder.class
)
public final class SharedAzureMarketplaceSubscription {
  private final Optional<List<SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem>> allowedCustomerOperations;

  private final Optional<Boolean> autoRenew;

  private final Optional<SharedAzureAdIdentifier> beneficiary;

  private final Optional<String> created;

  private final Optional<String> fulfillmentId;

  private final Optional<String> id;

  private final Optional<Boolean> isFreeTrial;

  private final Optional<Boolean> isTest;

  private final Optional<String> lastModified;

  private final Optional<String> name;

  private final Optional<String> offerId;

  private final Optional<String> planId;

  private final Optional<String> publisherId;

  private final Optional<SharedAzureAdIdentifier> purchaser;

  private final Optional<Integer> quantity;

  private final Optional<SharedAzureMarketplaceSubscriptionStatus> saasSubscriptionStatus;

  private final Optional<SharedAzureMarketplaceSubscriptionSandboxType> sandboxType;

  private final Optional<String> sessionId;

  private final Optional<SharedAzureMarketplaceSubscriptionSessionMode> sessionMode;

  private final Optional<String> storeFront;

  private final Optional<SharedAzureTerm> term;

  private int _cachedHashCode;

  SharedAzureMarketplaceSubscription(
      Optional<List<SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem>> allowedCustomerOperations,
      Optional<Boolean> autoRenew, Optional<SharedAzureAdIdentifier> beneficiary,
      Optional<String> created, Optional<String> fulfillmentId, Optional<String> id,
      Optional<Boolean> isFreeTrial, Optional<Boolean> isTest, Optional<String> lastModified,
      Optional<String> name, Optional<String> offerId, Optional<String> planId,
      Optional<String> publisherId, Optional<SharedAzureAdIdentifier> purchaser,
      Optional<Integer> quantity,
      Optional<SharedAzureMarketplaceSubscriptionStatus> saasSubscriptionStatus,
      Optional<SharedAzureMarketplaceSubscriptionSandboxType> sandboxType,
      Optional<String> sessionId,
      Optional<SharedAzureMarketplaceSubscriptionSessionMode> sessionMode,
      Optional<String> storeFront, Optional<SharedAzureTerm> term) {
    this.allowedCustomerOperations = allowedCustomerOperations;
    this.autoRenew = autoRenew;
    this.beneficiary = beneficiary;
    this.created = created;
    this.fulfillmentId = fulfillmentId;
    this.id = id;
    this.isFreeTrial = isFreeTrial;
    this.isTest = isTest;
    this.lastModified = lastModified;
    this.name = name;
    this.offerId = offerId;
    this.planId = planId;
    this.publisherId = publisherId;
    this.purchaser = purchaser;
    this.quantity = quantity;
    this.saasSubscriptionStatus = saasSubscriptionStatus;
    this.sandboxType = sandboxType;
    this.sessionId = sessionId;
    this.sessionMode = sessionMode;
    this.storeFront = storeFront;
    this.term = term;
  }

  @JsonProperty("allowedCustomerOperations")
  public Optional<List<SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem>> getAllowedCustomerOperations(
      ) {
    return allowedCustomerOperations;
  }

  @JsonProperty("autoRenew")
  public Optional<Boolean> getAutoRenew() {
    return autoRenew;
  }

  @JsonProperty("beneficiary")
  public Optional<SharedAzureAdIdentifier> getBeneficiary() {
    return beneficiary;
  }

  @JsonProperty("created")
  public Optional<String> getCreated() {
    return created;
  }

  @JsonProperty("fulfillmentId")
  public Optional<String> getFulfillmentId() {
    return fulfillmentId;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("isFreeTrial")
  public Optional<Boolean> getIsFreeTrial() {
    return isFreeTrial;
  }

  @JsonProperty("isTest")
  public Optional<Boolean> getIsTest() {
    return isTest;
  }

  @JsonProperty("lastModified")
  public Optional<String> getLastModified() {
    return lastModified;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("offerId")
  public Optional<String> getOfferId() {
    return offerId;
  }

  @JsonProperty("planId")
  public Optional<String> getPlanId() {
    return planId;
  }

  @JsonProperty("publisherId")
  public Optional<String> getPublisherId() {
    return publisherId;
  }

  @JsonProperty("purchaser")
  public Optional<SharedAzureAdIdentifier> getPurchaser() {
    return purchaser;
  }

  @JsonProperty("quantity")
  public Optional<Integer> getQuantity() {
    return quantity;
  }

  @JsonProperty("saasSubscriptionStatus")
  public Optional<SharedAzureMarketplaceSubscriptionStatus> getSaasSubscriptionStatus() {
    return saasSubscriptionStatus;
  }

  @JsonProperty("sandboxType")
  public Optional<SharedAzureMarketplaceSubscriptionSandboxType> getSandboxType() {
    return sandboxType;
  }

  @JsonProperty("sessionId")
  public Optional<String> getSessionId() {
    return sessionId;
  }

  @JsonProperty("sessionMode")
  public Optional<SharedAzureMarketplaceSubscriptionSessionMode> getSessionMode() {
    return sessionMode;
  }

  @JsonProperty("storeFront")
  public Optional<String> getStoreFront() {
    return storeFront;
  }

  @JsonProperty("term")
  public Optional<SharedAzureTerm> getTerm() {
    return term;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAzureMarketplaceSubscription && equalTo((SharedAzureMarketplaceSubscription) other);
  }

  private boolean equalTo(SharedAzureMarketplaceSubscription other) {
    return allowedCustomerOperations.equals(other.allowedCustomerOperations) && autoRenew.equals(other.autoRenew) && beneficiary.equals(other.beneficiary) && created.equals(other.created) && fulfillmentId.equals(other.fulfillmentId) && id.equals(other.id) && isFreeTrial.equals(other.isFreeTrial) && isTest.equals(other.isTest) && lastModified.equals(other.lastModified) && name.equals(other.name) && offerId.equals(other.offerId) && planId.equals(other.planId) && publisherId.equals(other.publisherId) && purchaser.equals(other.purchaser) && quantity.equals(other.quantity) && saasSubscriptionStatus.equals(other.saasSubscriptionStatus) && sandboxType.equals(other.sandboxType) && sessionId.equals(other.sessionId) && sessionMode.equals(other.sessionMode) && storeFront.equals(other.storeFront) && term.equals(other.term);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.allowedCustomerOperations, this.autoRenew, this.beneficiary, this.created, this.fulfillmentId, this.id, this.isFreeTrial, this.isTest, this.lastModified, this.name, this.offerId, this.planId, this.publisherId, this.purchaser, this.quantity, this.saasSubscriptionStatus, this.sandboxType, this.sessionId, this.sessionMode, this.storeFront, this.term);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAzureMarketplaceSubscription{" + "allowedCustomerOperations: " + allowedCustomerOperations + ", autoRenew: " + autoRenew + ", beneficiary: " + beneficiary + ", created: " + created + ", fulfillmentId: " + fulfillmentId + ", id: " + id + ", isFreeTrial: " + isFreeTrial + ", isTest: " + isTest + ", lastModified: " + lastModified + ", name: " + name + ", offerId: " + offerId + ", planId: " + planId + ", publisherId: " + publisherId + ", purchaser: " + purchaser + ", quantity: " + quantity + ", saasSubscriptionStatus: " + saasSubscriptionStatus + ", sandboxType: " + sandboxType + ", sessionId: " + sessionId + ", sessionMode: " + sessionMode + ", storeFront: " + storeFront + ", term: " + term + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem>> allowedCustomerOperations = Optional.empty();

    private Optional<Boolean> autoRenew = Optional.empty();

    private Optional<SharedAzureAdIdentifier> beneficiary = Optional.empty();

    private Optional<String> created = Optional.empty();

    private Optional<String> fulfillmentId = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<Boolean> isFreeTrial = Optional.empty();

    private Optional<Boolean> isTest = Optional.empty();

    private Optional<String> lastModified = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> offerId = Optional.empty();

    private Optional<String> planId = Optional.empty();

    private Optional<String> publisherId = Optional.empty();

    private Optional<SharedAzureAdIdentifier> purchaser = Optional.empty();

    private Optional<Integer> quantity = Optional.empty();

    private Optional<SharedAzureMarketplaceSubscriptionStatus> saasSubscriptionStatus = Optional.empty();

    private Optional<SharedAzureMarketplaceSubscriptionSandboxType> sandboxType = Optional.empty();

    private Optional<String> sessionId = Optional.empty();

    private Optional<SharedAzureMarketplaceSubscriptionSessionMode> sessionMode = Optional.empty();

    private Optional<String> storeFront = Optional.empty();

    private Optional<SharedAzureTerm> term = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAzureMarketplaceSubscription other) {
      allowedCustomerOperations(other.getAllowedCustomerOperations());
      autoRenew(other.getAutoRenew());
      beneficiary(other.getBeneficiary());
      created(other.getCreated());
      fulfillmentId(other.getFulfillmentId());
      id(other.getId());
      isFreeTrial(other.getIsFreeTrial());
      isTest(other.getIsTest());
      lastModified(other.getLastModified());
      name(other.getName());
      offerId(other.getOfferId());
      planId(other.getPlanId());
      publisherId(other.getPublisherId());
      purchaser(other.getPurchaser());
      quantity(other.getQuantity());
      saasSubscriptionStatus(other.getSaasSubscriptionStatus());
      sandboxType(other.getSandboxType());
      sessionId(other.getSessionId());
      sessionMode(other.getSessionMode());
      storeFront(other.getStoreFront());
      term(other.getTerm());
      return this;
    }

    @JsonSetter(
        value = "allowedCustomerOperations",
        nulls = Nulls.SKIP
    )
    public Builder allowedCustomerOperations(
        Optional<List<SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem>> allowedCustomerOperations) {
      this.allowedCustomerOperations = allowedCustomerOperations;
      return this;
    }

    public Builder allowedCustomerOperations(
        List<SharedAzureMarketplaceSubscriptionAllowedCustomerOperationsItem> allowedCustomerOperations) {
      this.allowedCustomerOperations = Optional.of(allowedCustomerOperations);
      return this;
    }

    @JsonSetter(
        value = "autoRenew",
        nulls = Nulls.SKIP
    )
    public Builder autoRenew(Optional<Boolean> autoRenew) {
      this.autoRenew = autoRenew;
      return this;
    }

    public Builder autoRenew(Boolean autoRenew) {
      this.autoRenew = Optional.of(autoRenew);
      return this;
    }

    @JsonSetter(
        value = "beneficiary",
        nulls = Nulls.SKIP
    )
    public Builder beneficiary(Optional<SharedAzureAdIdentifier> beneficiary) {
      this.beneficiary = beneficiary;
      return this;
    }

    public Builder beneficiary(SharedAzureAdIdentifier beneficiary) {
      this.beneficiary = Optional.of(beneficiary);
      return this;
    }

    @JsonSetter(
        value = "created",
        nulls = Nulls.SKIP
    )
    public Builder created(Optional<String> created) {
      this.created = created;
      return this;
    }

    public Builder created(String created) {
      this.created = Optional.of(created);
      return this;
    }

    @JsonSetter(
        value = "fulfillmentId",
        nulls = Nulls.SKIP
    )
    public Builder fulfillmentId(Optional<String> fulfillmentId) {
      this.fulfillmentId = fulfillmentId;
      return this;
    }

    public Builder fulfillmentId(String fulfillmentId) {
      this.fulfillmentId = Optional.of(fulfillmentId);
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
        value = "isFreeTrial",
        nulls = Nulls.SKIP
    )
    public Builder isFreeTrial(Optional<Boolean> isFreeTrial) {
      this.isFreeTrial = isFreeTrial;
      return this;
    }

    public Builder isFreeTrial(Boolean isFreeTrial) {
      this.isFreeTrial = Optional.of(isFreeTrial);
      return this;
    }

    @JsonSetter(
        value = "isTest",
        nulls = Nulls.SKIP
    )
    public Builder isTest(Optional<Boolean> isTest) {
      this.isTest = isTest;
      return this;
    }

    public Builder isTest(Boolean isTest) {
      this.isTest = Optional.of(isTest);
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
        value = "planId",
        nulls = Nulls.SKIP
    )
    public Builder planId(Optional<String> planId) {
      this.planId = planId;
      return this;
    }

    public Builder planId(String planId) {
      this.planId = Optional.of(planId);
      return this;
    }

    @JsonSetter(
        value = "publisherId",
        nulls = Nulls.SKIP
    )
    public Builder publisherId(Optional<String> publisherId) {
      this.publisherId = publisherId;
      return this;
    }

    public Builder publisherId(String publisherId) {
      this.publisherId = Optional.of(publisherId);
      return this;
    }

    @JsonSetter(
        value = "purchaser",
        nulls = Nulls.SKIP
    )
    public Builder purchaser(Optional<SharedAzureAdIdentifier> purchaser) {
      this.purchaser = purchaser;
      return this;
    }

    public Builder purchaser(SharedAzureAdIdentifier purchaser) {
      this.purchaser = Optional.of(purchaser);
      return this;
    }

    @JsonSetter(
        value = "quantity",
        nulls = Nulls.SKIP
    )
    public Builder quantity(Optional<Integer> quantity) {
      this.quantity = quantity;
      return this;
    }

    public Builder quantity(Integer quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    @JsonSetter(
        value = "saasSubscriptionStatus",
        nulls = Nulls.SKIP
    )
    public Builder saasSubscriptionStatus(
        Optional<SharedAzureMarketplaceSubscriptionStatus> saasSubscriptionStatus) {
      this.saasSubscriptionStatus = saasSubscriptionStatus;
      return this;
    }

    public Builder saasSubscriptionStatus(
        SharedAzureMarketplaceSubscriptionStatus saasSubscriptionStatus) {
      this.saasSubscriptionStatus = Optional.of(saasSubscriptionStatus);
      return this;
    }

    @JsonSetter(
        value = "sandboxType",
        nulls = Nulls.SKIP
    )
    public Builder sandboxType(
        Optional<SharedAzureMarketplaceSubscriptionSandboxType> sandboxType) {
      this.sandboxType = sandboxType;
      return this;
    }

    public Builder sandboxType(SharedAzureMarketplaceSubscriptionSandboxType sandboxType) {
      this.sandboxType = Optional.of(sandboxType);
      return this;
    }

    @JsonSetter(
        value = "sessionId",
        nulls = Nulls.SKIP
    )
    public Builder sessionId(Optional<String> sessionId) {
      this.sessionId = sessionId;
      return this;
    }

    public Builder sessionId(String sessionId) {
      this.sessionId = Optional.of(sessionId);
      return this;
    }

    @JsonSetter(
        value = "sessionMode",
        nulls = Nulls.SKIP
    )
    public Builder sessionMode(
        Optional<SharedAzureMarketplaceSubscriptionSessionMode> sessionMode) {
      this.sessionMode = sessionMode;
      return this;
    }

    public Builder sessionMode(SharedAzureMarketplaceSubscriptionSessionMode sessionMode) {
      this.sessionMode = Optional.of(sessionMode);
      return this;
    }

    @JsonSetter(
        value = "storeFront",
        nulls = Nulls.SKIP
    )
    public Builder storeFront(Optional<String> storeFront) {
      this.storeFront = storeFront;
      return this;
    }

    public Builder storeFront(String storeFront) {
      this.storeFront = Optional.of(storeFront);
      return this;
    }

    @JsonSetter(
        value = "term",
        nulls = Nulls.SKIP
    )
    public Builder term(Optional<SharedAzureTerm> term) {
      this.term = term;
      return this;
    }

    public Builder term(SharedAzureTerm term) {
      this.term = Optional.of(term);
      return this;
    }

    public SharedAzureMarketplaceSubscription build() {
      return new SharedAzureMarketplaceSubscription(allowedCustomerOperations, autoRenew, beneficiary, created, fulfillmentId, id, isFreeTrial, isTest, lastModified, name, offerId, planId, publisherId, purchaser, quantity, saasSubscriptionStatus, sandboxType, sessionId, sessionMode, storeFront, term);
    }
  }
}
