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
    builder = AzureListingContact.Builder.class
)
public final class AzureListingContact {
  private final Optional<String> email;

  private final Optional<String> name;

  private final Optional<String> phone;

  private final Optional<AzureListingContactType> type;

  private final Optional<String> uri;

  private int _cachedHashCode;

  AzureListingContact(Optional<String> email, Optional<String> name, Optional<String> phone,
      Optional<AzureListingContactType> type, Optional<String> uri) {
    this.email = email;
    this.name = name;
    this.phone = phone;
    this.type = type;
    this.uri = uri;
  }

  @JsonProperty("email")
  public Optional<String> getEmail() {
    return email;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("phone")
  public Optional<String> getPhone() {
    return phone;
  }

  @JsonProperty("type")
  public Optional<AzureListingContactType> getType() {
    return type;
  }

  @JsonProperty("uri")
  public Optional<String> getUri() {
    return uri;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureListingContact && equalTo((AzureListingContact) other);
  }

  private boolean equalTo(AzureListingContact other) {
    return email.equals(other.email) && name.equals(other.name) && phone.equals(other.phone) && type.equals(other.type) && uri.equals(other.uri);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.email, this.name, this.phone, this.type, this.uri);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureListingContact{" + "email: " + email + ", name: " + name + ", phone: " + phone + ", type: " + type + ", uri: " + uri + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> email = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> phone = Optional.empty();

    private Optional<AzureListingContactType> type = Optional.empty();

    private Optional<String> uri = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureListingContact other) {
      email(other.getEmail());
      name(other.getName());
      phone(other.getPhone());
      type(other.getType());
      uri(other.getUri());
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

    @JsonSetter(
        value = "phone",
        nulls = Nulls.SKIP
    )
    public Builder phone(Optional<String> phone) {
      this.phone = phone;
      return this;
    }

    public Builder phone(String phone) {
      this.phone = Optional.of(phone);
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<AzureListingContactType> type) {
      this.type = type;
      return this;
    }

    public Builder type(AzureListingContactType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "uri",
        nulls = Nulls.SKIP
    )
    public Builder uri(Optional<String> uri) {
      this.uri = uri;
      return this;
    }

    public Builder uri(String uri) {
      this.uri = Optional.of(uri);
      return this;
    }

    public AzureListingContact build() {
      return new AzureListingContact(email, name, phone, type, uri);
    }
  }
}
