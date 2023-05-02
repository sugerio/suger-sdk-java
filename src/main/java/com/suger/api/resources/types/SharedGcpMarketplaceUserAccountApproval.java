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
    builder = SharedGcpMarketplaceUserAccountApproval.Builder.class
)
public final class SharedGcpMarketplaceUserAccountApproval {
  private final Optional<String> name;

  private final Optional<String> reason;

  private final Optional<SharedGcpMarketplaceUserAccountApprovalState> state;

  private final Optional<String> updateTime;

  private int _cachedHashCode;

  SharedGcpMarketplaceUserAccountApproval(Optional<String> name, Optional<String> reason,
      Optional<SharedGcpMarketplaceUserAccountApprovalState> state, Optional<String> updateTime) {
    this.name = name;
    this.reason = reason;
    this.state = state;
    this.updateTime = updateTime;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return An explanation for the state of the approval.
   */
  @JsonProperty("reason")
  public Optional<String> getReason() {
    return reason;
  }

  @JsonProperty("state")
  public Optional<SharedGcpMarketplaceUserAccountApprovalState> getState() {
    return state;
  }

  /**
   * @return RFC3339 UTC timestamp
   */
  @JsonProperty("updateTime")
  public Optional<String> getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpMarketplaceUserAccountApproval && equalTo((SharedGcpMarketplaceUserAccountApproval) other);
  }

  private boolean equalTo(SharedGcpMarketplaceUserAccountApproval other) {
    return name.equals(other.name) && reason.equals(other.reason) && state.equals(other.state) && updateTime.equals(other.updateTime);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.reason, this.state, this.updateTime);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpMarketplaceUserAccountApproval{" + "name: " + name + ", reason: " + reason + ", state: " + state + ", updateTime: " + updateTime + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> name = Optional.empty();

    private Optional<String> reason = Optional.empty();

    private Optional<SharedGcpMarketplaceUserAccountApprovalState> state = Optional.empty();

    private Optional<String> updateTime = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpMarketplaceUserAccountApproval other) {
      name(other.getName());
      reason(other.getReason());
      state(other.getState());
      updateTime(other.getUpdateTime());
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
        value = "reason",
        nulls = Nulls.SKIP
    )
    public Builder reason(Optional<String> reason) {
      this.reason = reason;
      return this;
    }

    public Builder reason(String reason) {
      this.reason = Optional.of(reason);
      return this;
    }

    @JsonSetter(
        value = "state",
        nulls = Nulls.SKIP
    )
    public Builder state(Optional<SharedGcpMarketplaceUserAccountApprovalState> state) {
      this.state = state;
      return this;
    }

    public Builder state(SharedGcpMarketplaceUserAccountApprovalState state) {
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

    public SharedGcpMarketplaceUserAccountApproval build() {
      return new SharedGcpMarketplaceUserAccountApproval(name, reason, state, updateTime);
    }
  }
}
