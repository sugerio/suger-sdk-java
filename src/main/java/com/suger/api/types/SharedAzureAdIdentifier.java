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
    builder = SharedAzureAdIdentifier.Builder.class
)
public final class SharedAzureAdIdentifier {
  private final Optional<SharedAzureBuyerInfo> buyerInfo;

  private final Optional<SharedCompanyInfo> companyInfo;

  private final Optional<String> emailId;

  private final Optional<String> objectId;

  private final Optional<String> puid;

  private final Optional<String> tenantId;

  private int _cachedHashCode;

  SharedAzureAdIdentifier(Optional<SharedAzureBuyerInfo> buyerInfo,
      Optional<SharedCompanyInfo> companyInfo, Optional<String> emailId, Optional<String> objectId,
      Optional<String> puid, Optional<String> tenantId) {
    this.buyerInfo = buyerInfo;
    this.companyInfo = companyInfo;
    this.emailId = emailId;
    this.objectId = objectId;
    this.puid = puid;
    this.tenantId = tenantId;
  }

  @JsonProperty("buyerInfo")
  public Optional<SharedAzureBuyerInfo> getBuyerInfo() {
    return buyerInfo;
  }

  @JsonProperty("companyInfo")
  public Optional<SharedCompanyInfo> getCompanyInfo() {
    return companyInfo;
  }

  /**
   * @return Email address
   */
  @JsonProperty("emailId")
  public Optional<String> getEmailId() {
    return emailId;
  }

  @JsonProperty("objectId")
  public Optional<String> getObjectId() {
    return objectId;
  }

  /**
   * @return ID of the user, used as External ID of suger IdentityBuyer.
   */
  @JsonProperty("puid")
  public Optional<String> getPuid() {
    return puid;
  }

  @JsonProperty("tenantId")
  public Optional<String> getTenantId() {
    return tenantId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAzureAdIdentifier && equalTo((SharedAzureAdIdentifier) other);
  }

  private boolean equalTo(SharedAzureAdIdentifier other) {
    return buyerInfo.equals(other.buyerInfo) && companyInfo.equals(other.companyInfo) && emailId.equals(other.emailId) && objectId.equals(other.objectId) && puid.equals(other.puid) && tenantId.equals(other.tenantId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.buyerInfo, this.companyInfo, this.emailId, this.objectId, this.puid, this.tenantId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAzureAdIdentifier{" + "buyerInfo: " + buyerInfo + ", companyInfo: " + companyInfo + ", emailId: " + emailId + ", objectId: " + objectId + ", puid: " + puid + ", tenantId: " + tenantId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SharedAzureBuyerInfo> buyerInfo = Optional.empty();

    private Optional<SharedCompanyInfo> companyInfo = Optional.empty();

    private Optional<String> emailId = Optional.empty();

    private Optional<String> objectId = Optional.empty();

    private Optional<String> puid = Optional.empty();

    private Optional<String> tenantId = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAzureAdIdentifier other) {
      buyerInfo(other.getBuyerInfo());
      companyInfo(other.getCompanyInfo());
      emailId(other.getEmailId());
      objectId(other.getObjectId());
      puid(other.getPuid());
      tenantId(other.getTenantId());
      return this;
    }

    @JsonSetter(
        value = "buyerInfo",
        nulls = Nulls.SKIP
    )
    public Builder buyerInfo(Optional<SharedAzureBuyerInfo> buyerInfo) {
      this.buyerInfo = buyerInfo;
      return this;
    }

    public Builder buyerInfo(SharedAzureBuyerInfo buyerInfo) {
      this.buyerInfo = Optional.of(buyerInfo);
      return this;
    }

    @JsonSetter(
        value = "companyInfo",
        nulls = Nulls.SKIP
    )
    public Builder companyInfo(Optional<SharedCompanyInfo> companyInfo) {
      this.companyInfo = companyInfo;
      return this;
    }

    public Builder companyInfo(SharedCompanyInfo companyInfo) {
      this.companyInfo = Optional.of(companyInfo);
      return this;
    }

    @JsonSetter(
        value = "emailId",
        nulls = Nulls.SKIP
    )
    public Builder emailId(Optional<String> emailId) {
      this.emailId = emailId;
      return this;
    }

    public Builder emailId(String emailId) {
      this.emailId = Optional.of(emailId);
      return this;
    }

    @JsonSetter(
        value = "objectId",
        nulls = Nulls.SKIP
    )
    public Builder objectId(Optional<String> objectId) {
      this.objectId = objectId;
      return this;
    }

    public Builder objectId(String objectId) {
      this.objectId = Optional.of(objectId);
      return this;
    }

    @JsonSetter(
        value = "puid",
        nulls = Nulls.SKIP
    )
    public Builder puid(Optional<String> puid) {
      this.puid = puid;
      return this;
    }

    public Builder puid(String puid) {
      this.puid = Optional.of(puid);
      return this;
    }

    @JsonSetter(
        value = "tenantId",
        nulls = Nulls.SKIP
    )
    public Builder tenantId(Optional<String> tenantId) {
      this.tenantId = tenantId;
      return this;
    }

    public Builder tenantId(String tenantId) {
      this.tenantId = Optional.of(tenantId);
      return this;
    }

    public SharedAzureAdIdentifier build() {
      return new SharedAzureAdIdentifier(buyerInfo, companyInfo, emailId, objectId, puid, tenantId);
    }
  }
}
