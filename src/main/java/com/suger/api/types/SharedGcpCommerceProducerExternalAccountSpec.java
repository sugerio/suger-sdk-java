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
    builder = SharedGcpCommerceProducerExternalAccountSpec.Builder.class
)
public final class SharedGcpCommerceProducerExternalAccountSpec {
  private final Optional<String> loginUri;

  private final Optional<String> signupUri;

  private final Optional<String> singleSignOnUri;

  private int _cachedHashCode;

  SharedGcpCommerceProducerExternalAccountSpec(Optional<String> loginUri,
      Optional<String> signupUri, Optional<String> singleSignOnUri) {
    this.loginUri = loginUri;
    this.signupUri = signupUri;
    this.singleSignOnUri = singleSignOnUri;
  }

  @JsonProperty("loginUri")
  public Optional<String> getLoginUri() {
    return loginUri;
  }

  @JsonProperty("signupUri")
  public Optional<String> getSignupUri() {
    return signupUri;
  }

  @JsonProperty("singleSignOnUri")
  public Optional<String> getSingleSignOnUri() {
    return singleSignOnUri;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerExternalAccountSpec && equalTo((SharedGcpCommerceProducerExternalAccountSpec) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerExternalAccountSpec other) {
    return loginUri.equals(other.loginUri) && signupUri.equals(other.signupUri) && singleSignOnUri.equals(other.singleSignOnUri);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.loginUri, this.signupUri, this.singleSignOnUri);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerExternalAccountSpec{" + "loginUri: " + loginUri + ", signupUri: " + signupUri + ", singleSignOnUri: " + singleSignOnUri + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> loginUri = Optional.empty();

    private Optional<String> signupUri = Optional.empty();

    private Optional<String> singleSignOnUri = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerExternalAccountSpec other) {
      loginUri(other.getLoginUri());
      signupUri(other.getSignupUri());
      singleSignOnUri(other.getSingleSignOnUri());
      return this;
    }

    @JsonSetter(
        value = "loginUri",
        nulls = Nulls.SKIP
    )
    public Builder loginUri(Optional<String> loginUri) {
      this.loginUri = loginUri;
      return this;
    }

    public Builder loginUri(String loginUri) {
      this.loginUri = Optional.of(loginUri);
      return this;
    }

    @JsonSetter(
        value = "signupUri",
        nulls = Nulls.SKIP
    )
    public Builder signupUri(Optional<String> signupUri) {
      this.signupUri = signupUri;
      return this;
    }

    public Builder signupUri(String signupUri) {
      this.signupUri = Optional.of(signupUri);
      return this;
    }

    @JsonSetter(
        value = "singleSignOnUri",
        nulls = Nulls.SKIP
    )
    public Builder singleSignOnUri(Optional<String> singleSignOnUri) {
      this.singleSignOnUri = singleSignOnUri;
      return this;
    }

    public Builder singleSignOnUri(String singleSignOnUri) {
      this.singleSignOnUri = Optional.of(singleSignOnUri);
      return this;
    }

    public SharedGcpCommerceProducerExternalAccountSpec build() {
      return new SharedGcpCommerceProducerExternalAccountSpec(loginUri, signupUri, singleSignOnUri);
    }
  }
}
