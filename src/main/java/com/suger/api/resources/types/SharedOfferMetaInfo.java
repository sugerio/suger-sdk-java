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
    builder = SharedOfferMetaInfo.Builder.class
)
public final class SharedOfferMetaInfo {
  private final Optional<String> baseAgreementId;

  private final Optional<List<SharedContact>> contacts;

  private final Optional<Boolean> isAgreementBasedOffer;

  private final Optional<Boolean> isRenewalOffer;

  private final Optional<List<SharedNotificationEvent>> notifications;

  private int _cachedHashCode;

  SharedOfferMetaInfo(Optional<String> baseAgreementId, Optional<List<SharedContact>> contacts,
      Optional<Boolean> isAgreementBasedOffer, Optional<Boolean> isRenewalOffer,
      Optional<List<SharedNotificationEvent>> notifications) {
    this.baseAgreementId = baseAgreementId;
    this.contacts = contacts;
    this.isAgreementBasedOffer = isAgreementBasedOffer;
    this.isRenewalOffer = isRenewalOffer;
    this.notifications = notifications;
  }

  /**
   * @return Applicable for AWS Marketplace only, when the IsAgreementBasedOffer is true.
   */
  @JsonProperty("baseAgreementId")
  public Optional<String> getBaseAgreementId() {
    return baseAgreementId;
  }

  /**
   * @return The contacts of the offer to notify if any updates.
   */
  @JsonProperty("contacts")
  public Optional<List<SharedContact>> getContacts() {
    return contacts;
  }

  /**
   * @return Applicable for AWS Marketplace only, If this offer is agreement based offer.
   */
  @JsonProperty("isAgreementBasedOffer")
  public Optional<Boolean> getIsAgreementBasedOffer() {
    return isAgreementBasedOffer;
  }

  /**
   * @return Applicable for AWS Marketplace only, If this offer is renewal offer.
   */
  @JsonProperty("isRenewalOffer")
  public Optional<Boolean> getIsRenewalOffer() {
    return isRenewalOffer;
  }

  /**
   * @return The notifications of the offer if any updates. In most cases, it is to notify contacts/buyers when the offer is pending acceptance.
   */
  @JsonProperty("notifications")
  public Optional<List<SharedNotificationEvent>> getNotifications() {
    return notifications;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedOfferMetaInfo && equalTo((SharedOfferMetaInfo) other);
  }

  private boolean equalTo(SharedOfferMetaInfo other) {
    return baseAgreementId.equals(other.baseAgreementId) && contacts.equals(other.contacts) && isAgreementBasedOffer.equals(other.isAgreementBasedOffer) && isRenewalOffer.equals(other.isRenewalOffer) && notifications.equals(other.notifications);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.baseAgreementId, this.contacts, this.isAgreementBasedOffer, this.isRenewalOffer, this.notifications);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedOfferMetaInfo{" + "baseAgreementId: " + baseAgreementId + ", contacts: " + contacts + ", isAgreementBasedOffer: " + isAgreementBasedOffer + ", isRenewalOffer: " + isRenewalOffer + ", notifications: " + notifications + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> baseAgreementId = Optional.empty();

    private Optional<List<SharedContact>> contacts = Optional.empty();

    private Optional<Boolean> isAgreementBasedOffer = Optional.empty();

    private Optional<Boolean> isRenewalOffer = Optional.empty();

    private Optional<List<SharedNotificationEvent>> notifications = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedOfferMetaInfo other) {
      baseAgreementId(other.getBaseAgreementId());
      contacts(other.getContacts());
      isAgreementBasedOffer(other.getIsAgreementBasedOffer());
      isRenewalOffer(other.getIsRenewalOffer());
      notifications(other.getNotifications());
      return this;
    }

    @JsonSetter(
        value = "baseAgreementId",
        nulls = Nulls.SKIP
    )
    public Builder baseAgreementId(Optional<String> baseAgreementId) {
      this.baseAgreementId = baseAgreementId;
      return this;
    }

    public Builder baseAgreementId(String baseAgreementId) {
      this.baseAgreementId = Optional.of(baseAgreementId);
      return this;
    }

    @JsonSetter(
        value = "contacts",
        nulls = Nulls.SKIP
    )
    public Builder contacts(Optional<List<SharedContact>> contacts) {
      this.contacts = contacts;
      return this;
    }

    public Builder contacts(List<SharedContact> contacts) {
      this.contacts = Optional.of(contacts);
      return this;
    }

    @JsonSetter(
        value = "isAgreementBasedOffer",
        nulls = Nulls.SKIP
    )
    public Builder isAgreementBasedOffer(Optional<Boolean> isAgreementBasedOffer) {
      this.isAgreementBasedOffer = isAgreementBasedOffer;
      return this;
    }

    public Builder isAgreementBasedOffer(Boolean isAgreementBasedOffer) {
      this.isAgreementBasedOffer = Optional.of(isAgreementBasedOffer);
      return this;
    }

    @JsonSetter(
        value = "isRenewalOffer",
        nulls = Nulls.SKIP
    )
    public Builder isRenewalOffer(Optional<Boolean> isRenewalOffer) {
      this.isRenewalOffer = isRenewalOffer;
      return this;
    }

    public Builder isRenewalOffer(Boolean isRenewalOffer) {
      this.isRenewalOffer = Optional.of(isRenewalOffer);
      return this;
    }

    @JsonSetter(
        value = "notifications",
        nulls = Nulls.SKIP
    )
    public Builder notifications(Optional<List<SharedNotificationEvent>> notifications) {
      this.notifications = notifications;
      return this;
    }

    public Builder notifications(List<SharedNotificationEvent> notifications) {
      this.notifications = Optional.of(notifications);
      return this;
    }

    public SharedOfferMetaInfo build() {
      return new SharedOfferMetaInfo(baseAgreementId, contacts, isAgreementBasedOffer, isRenewalOffer, notifications);
    }
  }
}
