package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzureValidationResult.Builder.class
)
public final class AzureValidationResult {
  private final Optional<String> errorMessage;

  private final Optional<List<String>> memberNames;

  private int _cachedHashCode;

  AzureValidationResult(Optional<String> errorMessage, Optional<List<String>> memberNames) {
    this.errorMessage = errorMessage;
    this.memberNames = memberNames;
  }

  @JsonProperty("errorMessage")
  public Optional<String> getErrorMessage() {
    return errorMessage;
  }

  @JsonProperty("memberNames")
  public Optional<List<String>> getMemberNames() {
    return memberNames;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureValidationResult && equalTo((AzureValidationResult) other);
  }

  private boolean equalTo(AzureValidationResult other) {
    return errorMessage.equals(other.errorMessage) && memberNames.equals(other.memberNames);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.errorMessage, this.memberNames);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureValidationResult{" + "errorMessage: " + errorMessage + ", memberNames: " + memberNames + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> errorMessage = Optional.empty();

    private Optional<List<String>> memberNames = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureValidationResult other) {
      errorMessage(other.getErrorMessage());
      memberNames(other.getMemberNames());
      return this;
    }

    @JsonSetter(
        value = "errorMessage",
        nulls = Nulls.SKIP
    )
    public Builder errorMessage(Optional<String> errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }

    public Builder errorMessage(String errorMessage) {
      this.errorMessage = Optional.of(errorMessage);
      return this;
    }

    @JsonSetter(
        value = "memberNames",
        nulls = Nulls.SKIP
    )
    public Builder memberNames(Optional<List<String>> memberNames) {
      this.memberNames = memberNames;
      return this;
    }

    public Builder memberNames(List<String> memberNames) {
      this.memberNames = Optional.of(memberNames);
      return this;
    }

    public AzureValidationResult build() {
      return new AzureValidationResult(errorMessage, memberNames);
    }
  }
}
