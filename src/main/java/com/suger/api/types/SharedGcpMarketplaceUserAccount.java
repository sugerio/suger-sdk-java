package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedGcpMarketplaceUserAccount.Builder.class
)
public final class SharedGcpMarketplaceUserAccount {
  private final Optional<List<SharedGcpMarketplaceUserAccountApproval>> approvals;

  private final Optional<String> createTime;

  private final Optional<String> id;

  private final Optional<List<Integer>> inputProperties;

  private final Optional<String> name;

  private final Optional<String> provider;

  private final Optional<SharedGcpMarketplaceUserAccountState> state;

  private final Optional<String> updateTime;

  private final Optional<SharedGcpUserInfo> userInfo;

  private int _cachedHashCode;

  SharedGcpMarketplaceUserAccount(Optional<List<SharedGcpMarketplaceUserAccountApproval>> approvals,
      Optional<String> createTime, Optional<String> id, Optional<List<Integer>> inputProperties,
      Optional<String> name, Optional<String> provider,
      Optional<SharedGcpMarketplaceUserAccountState> state, Optional<String> updateTime,
      Optional<SharedGcpUserInfo> userInfo) {
    this.approvals = approvals;
    this.createTime = createTime;
    this.id = id;
    this.inputProperties = inputProperties;
    this.name = name;
    this.provider = provider;
    this.state = state;
    this.updateTime = updateTime;
    this.userInfo = userInfo;
  }

  /**
   * @return The approvals for this account, that are permitted or have been completed.
   */
  @JsonProperty("approvals")
  public Optional<List<SharedGcpMarketplaceUserAccountApproval>> getApprovals() {
    return approvals;
  }

  @JsonProperty("createTime")
  public Optional<String> getCreateTime() {
    return createTime;
  }

  /**
   * @return GCP Marketplace User Account ID.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return RFC3339 UTC timestamp
   */
  @JsonProperty("inputProperties")
  public Optional<List<Integer>> getInputProperties() {
    return inputProperties;
  }

  /**
   * @return The resource name of the account. Account names have the form providers/{provider_id}/accounts/{account_id}.
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return The identifier of the service provider (SaaS Seller) that this account was created against.
   */
  @JsonProperty("provider")
  public Optional<String> getProvider() {
    return provider;
  }

  /**
   * @return The state of the account. An account might not be able to make a purchase if the billing account is suspended, for example.
   */
  @JsonProperty("state")
  public Optional<SharedGcpMarketplaceUserAccountState> getState() {
    return state;
  }

  /**
   * @return RFC3339 UTC timestamp
   */
  @JsonProperty("updateTime")
  public Optional<String> getUpdateTime() {
    return updateTime;
  }

  @JsonProperty("userInfo")
  public Optional<SharedGcpUserInfo> getUserInfo() {
    return userInfo;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpMarketplaceUserAccount && equalTo((SharedGcpMarketplaceUserAccount) other);
  }

  private boolean equalTo(SharedGcpMarketplaceUserAccount other) {
    return approvals.equals(other.approvals) && createTime.equals(other.createTime) && id.equals(other.id) && inputProperties.equals(other.inputProperties) && name.equals(other.name) && provider.equals(other.provider) && state.equals(other.state) && updateTime.equals(other.updateTime) && userInfo.equals(other.userInfo);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.approvals, this.createTime, this.id, this.inputProperties, this.name, this.provider, this.state, this.updateTime, this.userInfo);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpMarketplaceUserAccount{" + "approvals: " + approvals + ", createTime: " + createTime + ", id: " + id + ", inputProperties: " + inputProperties + ", name: " + name + ", provider: " + provider + ", state: " + state + ", updateTime: " + updateTime + ", userInfo: " + userInfo + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<SharedGcpMarketplaceUserAccountApproval>> approvals = Optional.empty();

    private Optional<String> createTime = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<List<Integer>> inputProperties = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> provider = Optional.empty();

    private Optional<SharedGcpMarketplaceUserAccountState> state = Optional.empty();

    private Optional<String> updateTime = Optional.empty();

    private Optional<SharedGcpUserInfo> userInfo = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpMarketplaceUserAccount other) {
      approvals(other.getApprovals());
      createTime(other.getCreateTime());
      id(other.getId());
      inputProperties(other.getInputProperties());
      name(other.getName());
      provider(other.getProvider());
      state(other.getState());
      updateTime(other.getUpdateTime());
      userInfo(other.getUserInfo());
      return this;
    }

    @JsonSetter(
        value = "approvals",
        nulls = Nulls.SKIP
    )
    public Builder approvals(Optional<List<SharedGcpMarketplaceUserAccountApproval>> approvals) {
      this.approvals = approvals;
      return this;
    }

    public Builder approvals(List<SharedGcpMarketplaceUserAccountApproval> approvals) {
      this.approvals = Optional.of(approvals);
      return this;
    }

    @JsonSetter(
        value = "createTime",
        nulls = Nulls.SKIP
    )
    public Builder createTime(Optional<String> createTime) {
      this.createTime = createTime;
      return this;
    }

    public Builder createTime(String createTime) {
      this.createTime = Optional.of(createTime);
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
        value = "inputProperties",
        nulls = Nulls.SKIP
    )
    public Builder inputProperties(Optional<List<Integer>> inputProperties) {
      this.inputProperties = inputProperties;
      return this;
    }

    public Builder inputProperties(List<Integer> inputProperties) {
      this.inputProperties = Optional.of(inputProperties);
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
        value = "provider",
        nulls = Nulls.SKIP
    )
    public Builder provider(Optional<String> provider) {
      this.provider = provider;
      return this;
    }

    public Builder provider(String provider) {
      this.provider = Optional.of(provider);
      return this;
    }

    @JsonSetter(
        value = "state",
        nulls = Nulls.SKIP
    )
    public Builder state(Optional<SharedGcpMarketplaceUserAccountState> state) {
      this.state = state;
      return this;
    }

    public Builder state(SharedGcpMarketplaceUserAccountState state) {
      this.state = Optional.of(state);
      return this;
    }

    @JsonSetter(
        value = "updateTime",
        nulls = Nulls.SKIP
    )
    public Builder updateTime(Optional<String> updateTime) {
      this.updateTime = updateTime;
      return this;
    }

    public Builder updateTime(String updateTime) {
      this.updateTime = Optional.of(updateTime);
      return this;
    }

    @JsonSetter(
        value = "userInfo",
        nulls = Nulls.SKIP
    )
    public Builder userInfo(Optional<SharedGcpUserInfo> userInfo) {
      this.userInfo = userInfo;
      return this;
    }

    public Builder userInfo(SharedGcpUserInfo userInfo) {
      this.userInfo = Optional.of(userInfo);
      return this;
    }

    public SharedGcpMarketplaceUserAccount build() {
      return new SharedGcpMarketplaceUserAccount(approvals, createTime, id, inputProperties, name, provider, state, updateTime, userInfo);
    }
  }
}
