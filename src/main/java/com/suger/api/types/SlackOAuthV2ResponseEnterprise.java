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
    builder = SlackOAuthV2ResponseEnterprise.Builder.class
)
public final class SlackOAuthV2ResponseEnterprise {
  private final Optional<String> id;

  private final Optional<String> name;

  private int _cachedHashCode;

  SlackOAuthV2ResponseEnterprise(Optional<String> id, Optional<String> name) {
    this.id = id;
    this.name = name;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SlackOAuthV2ResponseEnterprise && equalTo((SlackOAuthV2ResponseEnterprise) other);
  }

  private boolean equalTo(SlackOAuthV2ResponseEnterprise other) {
    return id.equals(other.id) && name.equals(other.name);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.name);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SlackOAuthV2ResponseEnterprise{" + "id: " + id + ", name: " + name + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Builder() {
    }

    public Builder from(SlackOAuthV2ResponseEnterprise other) {
      id(other.getId());
      name(other.getName());
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

    public SlackOAuthV2ResponseEnterprise build() {
      return new SlackOAuthV2ResponseEnterprise(id, name);
    }
  }
}
