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
    builder = SharedCompanyInfo.Builder.class
)
public final class SharedCompanyInfo {
  private final Optional<String> addressLine1;

  private final Optional<String> addressLine2;

  private final Optional<String> city;

  private final Optional<String> country;

  private final Optional<String> emailDomain;

  private final Optional<String> name;

  private final Optional<String> postalCode;

  private final Optional<String> state;

  private int _cachedHashCode;

  SharedCompanyInfo(Optional<String> addressLine1, Optional<String> addressLine2,
      Optional<String> city, Optional<String> country, Optional<String> emailDomain,
      Optional<String> name, Optional<String> postalCode, Optional<String> state) {
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.city = city;
    this.country = country;
    this.emailDomain = emailDomain;
    this.name = name;
    this.postalCode = postalCode;
    this.state = state;
  }

  @JsonProperty("addressLine1")
  public Optional<String> getAddressLine1() {
    return addressLine1;
  }

  @JsonProperty("addressLine2")
  public Optional<String> getAddressLine2() {
    return addressLine2;
  }

  @JsonProperty("city")
  public Optional<String> getCity() {
    return city;
  }

  @JsonProperty("country")
  public Optional<String> getCountry() {
    return country;
  }

  @JsonProperty("emailDomain")
  public Optional<String> getEmailDomain() {
    return emailDomain;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("postalCode")
  public Optional<String> getPostalCode() {
    return postalCode;
  }

  @JsonProperty("state")
  public Optional<String> getState() {
    return state;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedCompanyInfo && equalTo((SharedCompanyInfo) other);
  }

  private boolean equalTo(SharedCompanyInfo other) {
    return addressLine1.equals(other.addressLine1) && addressLine2.equals(other.addressLine2) && city.equals(other.city) && country.equals(other.country) && emailDomain.equals(other.emailDomain) && name.equals(other.name) && postalCode.equals(other.postalCode) && state.equals(other.state);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.addressLine1, this.addressLine2, this.city, this.country, this.emailDomain, this.name, this.postalCode, this.state);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedCompanyInfo{" + "addressLine1: " + addressLine1 + ", addressLine2: " + addressLine2 + ", city: " + city + ", country: " + country + ", emailDomain: " + emailDomain + ", name: " + name + ", postalCode: " + postalCode + ", state: " + state + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> addressLine1 = Optional.empty();

    private Optional<String> addressLine2 = Optional.empty();

    private Optional<String> city = Optional.empty();

    private Optional<String> country = Optional.empty();

    private Optional<String> emailDomain = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> postalCode = Optional.empty();

    private Optional<String> state = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedCompanyInfo other) {
      addressLine1(other.getAddressLine1());
      addressLine2(other.getAddressLine2());
      city(other.getCity());
      country(other.getCountry());
      emailDomain(other.getEmailDomain());
      name(other.getName());
      postalCode(other.getPostalCode());
      state(other.getState());
      return this;
    }

    @JsonSetter(
        value = "addressLine1",
        nulls = Nulls.SKIP
    )
    public Builder addressLine1(Optional<String> addressLine1) {
      this.addressLine1 = addressLine1;
      return this;
    }

    public Builder addressLine1(String addressLine1) {
      this.addressLine1 = Optional.of(addressLine1);
      return this;
    }

    @JsonSetter(
        value = "addressLine2",
        nulls = Nulls.SKIP
    )
    public Builder addressLine2(Optional<String> addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    public Builder addressLine2(String addressLine2) {
      this.addressLine2 = Optional.of(addressLine2);
      return this;
    }

    @JsonSetter(
        value = "city",
        nulls = Nulls.SKIP
    )
    public Builder city(Optional<String> city) {
      this.city = city;
      return this;
    }

    public Builder city(String city) {
      this.city = Optional.of(city);
      return this;
    }

    @JsonSetter(
        value = "country",
        nulls = Nulls.SKIP
    )
    public Builder country(Optional<String> country) {
      this.country = country;
      return this;
    }

    public Builder country(String country) {
      this.country = Optional.of(country);
      return this;
    }

    @JsonSetter(
        value = "emailDomain",
        nulls = Nulls.SKIP
    )
    public Builder emailDomain(Optional<String> emailDomain) {
      this.emailDomain = emailDomain;
      return this;
    }

    public Builder emailDomain(String emailDomain) {
      this.emailDomain = Optional.of(emailDomain);
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
        value = "postalCode",
        nulls = Nulls.SKIP
    )
    public Builder postalCode(Optional<String> postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    public Builder postalCode(String postalCode) {
      this.postalCode = Optional.of(postalCode);
      return this;
    }

    @JsonSetter(
        value = "state",
        nulls = Nulls.SKIP
    )
    public Builder state(Optional<String> state) {
      this.state = state;
      return this;
    }

    public Builder state(String state) {
      this.state = Optional.of(state);
      return this;
    }

    public SharedCompanyInfo build() {
      return new SharedCompanyInfo(addressLine1, addressLine2, city, country, emailDomain, name, postalCode, state);
    }
  }
}
