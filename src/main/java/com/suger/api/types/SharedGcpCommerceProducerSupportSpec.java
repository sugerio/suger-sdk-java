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
    builder = SharedGcpCommerceProducerSupportSpec.Builder.class
)
public final class SharedGcpCommerceProducerSupportSpec {
  private final Optional<String> description;

  private final Optional<String> email;

  private final Optional<String> uri;

  private int _cachedHashCode;

  SharedGcpCommerceProducerSupportSpec(Optional<String> description, Optional<String> email,
      Optional<String> uri) {
    this.description = description;
    this.email = email;
    this.uri = uri;
  }

  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @JsonProperty("email")
  public Optional<String> getEmail() {
    return email;
  }

  @JsonProperty("uri")
  public Optional<String> getUri() {
    return uri;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpCommerceProducerSupportSpec && equalTo((SharedGcpCommerceProducerSupportSpec) other);
  }

  private boolean equalTo(SharedGcpCommerceProducerSupportSpec other) {
    return description.equals(other.description) && email.equals(other.email) && uri.equals(other.uri);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.description, this.email, this.uri);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpCommerceProducerSupportSpec{" + "description: " + description + ", email: " + email + ", uri: " + uri + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> description = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Optional<String> uri = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpCommerceProducerSupportSpec other) {
      description(other.getDescription());
      email(other.getEmail());
      uri(other.getUri());
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

    public SharedGcpCommerceProducerSupportSpec build() {
      return new SharedGcpCommerceProducerSupportSpec(description, email, uri);
    }
  }
}
