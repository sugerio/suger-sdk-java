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
    builder = SharedIdentityBuyer.Builder.class
)
public final class SharedIdentityBuyer {
  private final Optional<String> creationTime;

  private final Optional<String> description;

  private final Optional<String> externalId;

  private final Optional<String> id;

  private final Optional<SharedBuyerInfo> info;

  private final Optional<String> lastUpdateTime;

  private final Optional<String> name;

  private final Optional<String> organizationId;

  private final Optional<SharedIdentityBuyerPartner> partner;

  private int _cachedHashCode;

  SharedIdentityBuyer(Optional<String> creationTime, Optional<String> description,
      Optional<String> externalId, Optional<String> id, Optional<SharedBuyerInfo> info,
      Optional<String> lastUpdateTime, Optional<String> name, Optional<String> organizationId,
      Optional<SharedIdentityBuyerPartner> partner) {
    this.creationTime = creationTime;
    this.description = description;
    this.externalId = externalId;
    this.id = id;
    this.info = info;
    this.lastUpdateTime = lastUpdateTime;
    this.name = name;
    this.organizationId = organizationId;
    this.partner = partner;
  }

  @JsonProperty("creationTime")
  public Optional<String> getCreationTime() {
    return creationTime;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("externalID")
  public Optional<String> getExternalId() {
    return externalId;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("info")
  public Optional<SharedBuyerInfo> getInfo() {
    return info;
  }

  @JsonProperty("lastUpdateTime")
  public Optional<String> getLastUpdateTime() {
    return lastUpdateTime;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("partner")
  public Optional<SharedIdentityBuyerPartner> getPartner() {
    return partner;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedIdentityBuyer && equalTo((SharedIdentityBuyer) other);
  }

  private boolean equalTo(SharedIdentityBuyer other) {
    return creationTime.equals(other.creationTime) && description.equals(other.description) && externalId.equals(other.externalId) && id.equals(other.id) && info.equals(other.info) && lastUpdateTime.equals(other.lastUpdateTime) && name.equals(other.name) && organizationId.equals(other.organizationId) && partner.equals(other.partner);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.creationTime, this.description, this.externalId, this.id, this.info, this.lastUpdateTime, this.name, this.organizationId, this.partner);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedIdentityBuyer{" + "creationTime: " + creationTime + ", description: " + description + ", externalId: " + externalId + ", id: " + id + ", info: " + info + ", lastUpdateTime: " + lastUpdateTime + ", name: " + name + ", organizationId: " + organizationId + ", partner: " + partner + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> creationTime = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<String> externalId = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<SharedBuyerInfo> info = Optional.empty();

    private Optional<String> lastUpdateTime = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<SharedIdentityBuyerPartner> partner = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedIdentityBuyer other) {
      creationTime(other.getCreationTime());
      description(other.getDescription());
      externalId(other.getExternalId());
      id(other.getId());
      info(other.getInfo());
      lastUpdateTime(other.getLastUpdateTime());
      name(other.getName());
      organizationId(other.getOrganizationId());
      partner(other.getPartner());
      return this;
    }

    @JsonSetter(
        value = "creationTime",
        nulls = Nulls.SKIP
    )
    public Builder creationTime(Optional<String> creationTime) {
      this.creationTime = creationTime;
      return this;
    }

    public Builder creationTime(String creationTime) {
      this.creationTime = Optional.of(creationTime);
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
        value = "externalID",
        nulls = Nulls.SKIP
    )
    public Builder externalId(Optional<String> externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder externalId(String externalId) {
      this.externalId = Optional.of(externalId);
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
    public Builder info(Optional<SharedBuyerInfo> info) {
      this.info = info;
      return this;
    }

    public Builder info(SharedBuyerInfo info) {
      this.info = Optional.of(info);
      return this;
    }

    @JsonSetter(
        value = "lastUpdateTime",
        nulls = Nulls.SKIP
    )
    public Builder lastUpdateTime(Optional<String> lastUpdateTime) {
      this.lastUpdateTime = lastUpdateTime;
      return this;
    }

    public Builder lastUpdateTime(String lastUpdateTime) {
      this.lastUpdateTime = Optional.of(lastUpdateTime);
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
    public Builder partner(Optional<SharedIdentityBuyerPartner> partner) {
      this.partner = partner;
      return this;
    }

    public Builder partner(SharedIdentityBuyerPartner partner) {
      this.partner = Optional.of(partner);
      return this;
    }

    public SharedIdentityBuyer build() {
      return new SharedIdentityBuyer(creationTime, description, externalId, id, info, lastUpdateTime, name, organizationId, partner);
    }
  }
}
