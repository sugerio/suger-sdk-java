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
    builder = SharedContact.Builder.class
)
public final class SharedContact {
  private final Optional<String> company;

  private final Optional<String> email;

  private final Optional<String> name;

  private int _cachedHashCode;

  SharedContact(Optional<String> company, Optional<String> email, Optional<String> name) {
    this.company = company;
    this.email = email;
    this.name = name;
  }

  @JsonProperty("company")
  public Optional<String> getCompany() {
    return company;
  }

  @JsonProperty("email")
  public Optional<String> getEmail() {
    return email;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedContact && equalTo((SharedContact) other);
  }

  private boolean equalTo(SharedContact other) {
    return company.equals(other.company) && email.equals(other.email) && name.equals(other.name);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.company, this.email, this.name);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedContact{" + "company: " + company + ", email: " + email + ", name: " + name + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> company = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedContact other) {
      company(other.getCompany());
      email(other.getEmail());
      name(other.getName());
      return this;
    }

    @JsonSetter(
        value = "company",
        nulls = Nulls.SKIP
    )
    public Builder company(Optional<String> company) {
      this.company = company;
      return this;
    }

    public Builder company(String company) {
      this.company = Optional.of(company);
      return this;
    }

    @JsonSetter(
        value = "email",
        nulls = Nulls.SKIP
    )
    public Builder email(Optional<String> email) {
      this.email = email;
      return this;
    }

    public Builder email(String email) {
      this.email = Optional.of(email);
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

    public SharedContact build() {
      return new SharedContact(company, email, name);
    }
  }
}
