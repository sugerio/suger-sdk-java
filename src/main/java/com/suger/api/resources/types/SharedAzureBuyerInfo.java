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
    builder = SharedAzureBuyerInfo.Builder.class
)
public final class SharedAzureBuyerInfo {
  private final Optional<String> billingAccountId;

  private final Optional<String> customerId;

  private final Optional<String> firstName;

  private final Optional<String> lastName;

  private int _cachedHashCode;

  SharedAzureBuyerInfo(Optional<String> billingAccountId, Optional<String> customerId,
      Optional<String> firstName, Optional<String> lastName) {
    this.billingAccountId = billingAccountId;
    this.customerId = customerId;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @JsonProperty("billingAccountId")
  public Optional<String> getBillingAccountId() {
    return billingAccountId;
  }

  @JsonProperty("customerId")
  public Optional<String> getCustomerId() {
    return customerId;
  }

  @JsonProperty("firstName")
  public Optional<String> getFirstName() {
    return firstName;
  }

  @JsonProperty("lastName")
  public Optional<String> getLastName() {
    return lastName;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAzureBuyerInfo && equalTo((SharedAzureBuyerInfo) other);
  }

  private boolean equalTo(SharedAzureBuyerInfo other) {
    return billingAccountId.equals(other.billingAccountId) && customerId.equals(other.customerId) && firstName.equals(other.firstName) && lastName.equals(other.lastName);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.billingAccountId, this.customerId, this.firstName, this.lastName);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAzureBuyerInfo{" + "billingAccountId: " + billingAccountId + ", customerId: " + customerId + ", firstName: " + firstName + ", lastName: " + lastName + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> billingAccountId = Optional.empty();

    private Optional<String> customerId = Optional.empty();

    private Optional<String> firstName = Optional.empty();

    private Optional<String> lastName = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAzureBuyerInfo other) {
      billingAccountId(other.getBillingAccountId());
      customerId(other.getCustomerId());
      firstName(other.getFirstName());
      lastName(other.getLastName());
      return this;
    }

    @JsonSetter(
        value = "billingAccountId",
        nulls = Nulls.SKIP
    )
    public Builder billingAccountId(Optional<String> billingAccountId) {
      this.billingAccountId = billingAccountId;
      return this;
    }

    public Builder billingAccountId(String billingAccountId) {
      this.billingAccountId = Optional.of(billingAccountId);
      return this;
    }

    @JsonSetter(
        value = "customerId",
        nulls = Nulls.SKIP
    )
    public Builder customerId(Optional<String> customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder customerId(String customerId) {
      this.customerId = Optional.of(customerId);
      return this;
    }

    @JsonSetter(
        value = "firstName",
        nulls = Nulls.SKIP
    )
    public Builder firstName(Optional<String> firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder firstName(String firstName) {
      this.firstName = Optional.of(firstName);
      return this;
    }

    @JsonSetter(
        value = "lastName",
        nulls = Nulls.SKIP
    )
    public Builder lastName(Optional<String> lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = Optional.of(lastName);
      return this;
    }

    public SharedAzureBuyerInfo build() {
      return new SharedAzureBuyerInfo(billingAccountId, customerId, firstName, lastName);
    }
  }
}
