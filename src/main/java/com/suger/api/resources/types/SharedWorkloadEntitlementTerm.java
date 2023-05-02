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
    builder = SharedWorkloadEntitlementTerm.Builder.class
)
public final class SharedWorkloadEntitlementTerm {
  private final Optional<String> buyerId;

  private final Optional<Double> commitAmount;

  private final Optional<Double> creditAmount;

  private final Optional<String> endTime;

  private final Optional<String> entitlementId;

  private final Optional<SharedEntitlementInfo> entitlementInfo;

  private final Optional<String> externalEntitlementId;

  private final Optional<String> id;

  private final Optional<SharedEntitlementTermInfo> info;

  private final Optional<String> offerId;

  private final Optional<String> organizationId;

  private final Optional<SharedWorkloadEntitlementTermPartner> partner;

  private final Optional<String> productId;

  private final Optional<SharedWorkloadEntitlementTermService> service;

  private final Optional<String> startTime;

  private final Optional<Double> usedCommitAmount;

  private final Optional<Double> usedCreditAmount;

  private int _cachedHashCode;

  SharedWorkloadEntitlementTerm(Optional<String> buyerId, Optional<Double> commitAmount,
      Optional<Double> creditAmount, Optional<String> endTime, Optional<String> entitlementId,
      Optional<SharedEntitlementInfo> entitlementInfo, Optional<String> externalEntitlementId,
      Optional<String> id, Optional<SharedEntitlementTermInfo> info, Optional<String> offerId,
      Optional<String> organizationId, Optional<SharedWorkloadEntitlementTermPartner> partner,
      Optional<String> productId, Optional<SharedWorkloadEntitlementTermService> service,
      Optional<String> startTime, Optional<Double> usedCommitAmount,
      Optional<Double> usedCreditAmount) {
    this.buyerId = buyerId;
    this.commitAmount = commitAmount;
    this.creditAmount = creditAmount;
    this.endTime = endTime;
    this.entitlementId = entitlementId;
    this.entitlementInfo = entitlementInfo;
    this.externalEntitlementId = externalEntitlementId;
    this.id = id;
    this.info = info;
    this.offerId = offerId;
    this.organizationId = organizationId;
    this.partner = partner;
    this.productId = productId;
    this.service = service;
    this.startTime = startTime;
    this.usedCommitAmount = usedCommitAmount;
    this.usedCreditAmount = usedCreditAmount;
  }

  @JsonProperty("buyerID")
  public Optional<String> getBuyerId() {
    return buyerId;
  }

  @JsonProperty("commitAmount")
  public Optional<Double> getCommitAmount() {
    return commitAmount;
  }

  @JsonProperty("creditAmount")
  public Optional<Double> getCreditAmount() {
    return creditAmount;
  }

  /**
   * @return nullable
   */
  @JsonProperty("endTime")
  public Optional<String> getEndTime() {
    return endTime;
  }

  @JsonProperty("entitlementID")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("entitlementInfo")
  public Optional<SharedEntitlementInfo> getEntitlementInfo() {
    return entitlementInfo;
  }

  @JsonProperty("externalEntitlementID")
  public Optional<String> getExternalEntitlementId() {
    return externalEntitlementId;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("info")
  public Optional<SharedEntitlementTermInfo> getInfo() {
    return info;
  }

  @JsonProperty("offerID")
  public Optional<String> getOfferId() {
    return offerId;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("partner")
  public Optional<SharedWorkloadEntitlementTermPartner> getPartner() {
    return partner;
  }

  @JsonProperty("productID")
  public Optional<String> getProductId() {
    return productId;
  }

  @JsonProperty("service")
  public Optional<SharedWorkloadEntitlementTermService> getService() {
    return service;
  }

  @JsonProperty("startTime")
  public Optional<String> getStartTime() {
    return startTime;
  }

  @JsonProperty("usedCommitAmount")
  public Optional<Double> getUsedCommitAmount() {
    return usedCommitAmount;
  }

  @JsonProperty("usedCreditAmount")
  public Optional<Double> getUsedCreditAmount() {
    return usedCreditAmount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedWorkloadEntitlementTerm && equalTo((SharedWorkloadEntitlementTerm) other);
  }

  private boolean equalTo(SharedWorkloadEntitlementTerm other) {
    return buyerId.equals(other.buyerId) && commitAmount.equals(other.commitAmount) && creditAmount.equals(other.creditAmount) && endTime.equals(other.endTime) && entitlementId.equals(other.entitlementId) && entitlementInfo.equals(other.entitlementInfo) && externalEntitlementId.equals(other.externalEntitlementId) && id.equals(other.id) && info.equals(other.info) && offerId.equals(other.offerId) && organizationId.equals(other.organizationId) && partner.equals(other.partner) && productId.equals(other.productId) && service.equals(other.service) && startTime.equals(other.startTime) && usedCommitAmount.equals(other.usedCommitAmount) && usedCreditAmount.equals(other.usedCreditAmount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.buyerId, this.commitAmount, this.creditAmount, this.endTime, this.entitlementId, this.entitlementInfo, this.externalEntitlementId, this.id, this.info, this.offerId, this.organizationId, this.partner, this.productId, this.service, this.startTime, this.usedCommitAmount, this.usedCreditAmount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedWorkloadEntitlementTerm{" + "buyerId: " + buyerId + ", commitAmount: " + commitAmount + ", creditAmount: " + creditAmount + ", endTime: " + endTime + ", entitlementId: " + entitlementId + ", entitlementInfo: " + entitlementInfo + ", externalEntitlementId: " + externalEntitlementId + ", id: " + id + ", info: " + info + ", offerId: " + offerId + ", organizationId: " + organizationId + ", partner: " + partner + ", productId: " + productId + ", service: " + service + ", startTime: " + startTime + ", usedCommitAmount: " + usedCommitAmount + ", usedCreditAmount: " + usedCreditAmount + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> buyerId = Optional.empty();

    private Optional<Double> commitAmount = Optional.empty();

    private Optional<Double> creditAmount = Optional.empty();

    private Optional<String> endTime = Optional.empty();

    private Optional<String> entitlementId = Optional.empty();

    private Optional<SharedEntitlementInfo> entitlementInfo = Optional.empty();

    private Optional<String> externalEntitlementId = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<SharedEntitlementTermInfo> info = Optional.empty();

    private Optional<String> offerId = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<SharedWorkloadEntitlementTermPartner> partner = Optional.empty();

    private Optional<String> productId = Optional.empty();

    private Optional<SharedWorkloadEntitlementTermService> service = Optional.empty();

    private Optional<String> startTime = Optional.empty();

    private Optional<Double> usedCommitAmount = Optional.empty();

    private Optional<Double> usedCreditAmount = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedWorkloadEntitlementTerm other) {
      buyerId(other.getBuyerId());
      commitAmount(other.getCommitAmount());
      creditAmount(other.getCreditAmount());
      endTime(other.getEndTime());
      entitlementId(other.getEntitlementId());
      entitlementInfo(other.getEntitlementInfo());
      externalEntitlementId(other.getExternalEntitlementId());
      id(other.getId());
      info(other.getInfo());
      offerId(other.getOfferId());
      organizationId(other.getOrganizationId());
      partner(other.getPartner());
      productId(other.getProductId());
      service(other.getService());
      startTime(other.getStartTime());
      usedCommitAmount(other.getUsedCommitAmount());
      usedCreditAmount(other.getUsedCreditAmount());
      return this;
    }

    @JsonSetter(
        value = "buyerID",
        nulls = Nulls.SKIP
    )
    public Builder buyerId(Optional<String> buyerId) {
      this.buyerId = buyerId;
      return this;
    }

    public Builder buyerId(String buyerId) {
      this.buyerId = Optional.of(buyerId);
      return this;
    }

    @JsonSetter(
        value = "commitAmount",
        nulls = Nulls.SKIP
    )
    public Builder commitAmount(Optional<Double> commitAmount) {
      this.commitAmount = commitAmount;
      return this;
    }

    public Builder commitAmount(Double commitAmount) {
      this.commitAmount = Optional.of(commitAmount);
      return this;
    }

    @JsonSetter(
        value = "creditAmount",
        nulls = Nulls.SKIP
    )
    public Builder creditAmount(Optional<Double> creditAmount) {
      this.creditAmount = creditAmount;
      return this;
    }

    public Builder creditAmount(Double creditAmount) {
      this.creditAmount = Optional.of(creditAmount);
      return this;
    }

    @JsonSetter(
        value = "endTime",
        nulls = Nulls.SKIP
    )
    public Builder endTime(Optional<String> endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder endTime(String endTime) {
      this.endTime = Optional.of(endTime);
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
        value = "entitlementInfo",
        nulls = Nulls.SKIP
    )
    public Builder entitlementInfo(Optional<SharedEntitlementInfo> entitlementInfo) {
      this.entitlementInfo = entitlementInfo;
      return this;
    }

    public Builder entitlementInfo(SharedEntitlementInfo entitlementInfo) {
      this.entitlementInfo = Optional.of(entitlementInfo);
      return this;
    }

    @JsonSetter(
        value = "externalEntitlementID",
        nulls = Nulls.SKIP
    )
    public Builder externalEntitlementId(Optional<String> externalEntitlementId) {
      this.externalEntitlementId = externalEntitlementId;
      return this;
    }

    public Builder externalEntitlementId(String externalEntitlementId) {
      this.externalEntitlementId = Optional.of(externalEntitlementId);
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
        value = "info",
        nulls = Nulls.SKIP
    )
    public Builder info(Optional<SharedEntitlementTermInfo> info) {
      this.info = info;
      return this;
    }

    public Builder info(SharedEntitlementTermInfo info) {
      this.info = Optional.of(info);
      return this;
    }

    @JsonSetter(
        value = "offerID",
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

    @JsonSetter(
        value = "partner",
        nulls = Nulls.SKIP
    )
    public Builder partner(Optional<SharedWorkloadEntitlementTermPartner> partner) {
      this.partner = partner;
      return this;
    }

    public Builder partner(SharedWorkloadEntitlementTermPartner partner) {
      this.partner = Optional.of(partner);
      return this;
    }

    @JsonSetter(
        value = "productID",
        nulls = Nulls.SKIP
    )
    public Builder productId(Optional<String> productId) {
      this.productId = productId;
      return this;
    }

    public Builder productId(String productId) {
      this.productId = Optional.of(productId);
      return this;
    }

    @JsonSetter(
        value = "service",
        nulls = Nulls.SKIP
    )
    public Builder service(Optional<SharedWorkloadEntitlementTermService> service) {
      this.service = service;
      return this;
    }

    public Builder service(SharedWorkloadEntitlementTermService service) {
      this.service = Optional.of(service);
      return this;
    }

    @JsonSetter(
        value = "startTime",
        nulls = Nulls.SKIP
    )
    public Builder startTime(Optional<String> startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder startTime(String startTime) {
      this.startTime = Optional.of(startTime);
      return this;
    }

    @JsonSetter(
        value = "usedCommitAmount",
        nulls = Nulls.SKIP
    )
    public Builder usedCommitAmount(Optional<Double> usedCommitAmount) {
      this.usedCommitAmount = usedCommitAmount;
      return this;
    }

    public Builder usedCommitAmount(Double usedCommitAmount) {
      this.usedCommitAmount = Optional.of(usedCommitAmount);
      return this;
    }

    @JsonSetter(
        value = "usedCreditAmount",
        nulls = Nulls.SKIP
    )
    public Builder usedCreditAmount(Optional<Double> usedCreditAmount) {
      this.usedCreditAmount = usedCreditAmount;
      return this;
    }

    public Builder usedCreditAmount(Double usedCreditAmount) {
      this.usedCreditAmount = Optional.of(usedCreditAmount);
      return this;
    }

    public SharedWorkloadEntitlementTerm build() {
      return new SharedWorkloadEntitlementTerm(buyerId, commitAmount, creditAmount, endTime, entitlementId, entitlementInfo, externalEntitlementId, id, info, offerId, organizationId, partner, productId, service, startTime, usedCommitAmount, usedCreditAmount);
    }
  }
}
