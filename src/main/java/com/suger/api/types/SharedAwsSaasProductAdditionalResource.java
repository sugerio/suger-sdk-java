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
    builder = SharedAwsSaasProductAdditionalResource.Builder.class
)
public final class SharedAwsSaasProductAdditionalResource {
  private final Optional<String> text;

  private final Optional<String> type;

  private final Optional<String> url;

  private int _cachedHashCode;

  SharedAwsSaasProductAdditionalResource(Optional<String> text, Optional<String> type,
      Optional<String> url) {
    this.text = text;
    this.type = type;
    this.url = url;
  }

  @JsonProperty("Text")
  public Optional<String> getText() {
    return text;
  }

  @JsonProperty("Type")
  public Optional<String> getType() {
    return type;
  }

  @JsonProperty("Url")
  public Optional<String> getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedAwsSaasProductAdditionalResource && equalTo((SharedAwsSaasProductAdditionalResource) other);
  }

  private boolean equalTo(SharedAwsSaasProductAdditionalResource other) {
    return text.equals(other.text) && type.equals(other.type) && url.equals(other.url);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.text, this.type, this.url);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedAwsSaasProductAdditionalResource{" + "text: " + text + ", type: " + type + ", url: " + url + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> text = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> url = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedAwsSaasProductAdditionalResource other) {
      text(other.getText());
      type(other.getType());
      url(other.getUrl());
      return this;
    }

    @JsonSetter(
        value = "Text",
        nulls = Nulls.SKIP
    )
    public Builder text(Optional<String> text) {
      this.text = text;
      return this;
    }

    public Builder text(String text) {
      this.text = Optional.of(text);
      return this;
    }

    @JsonSetter(
        value = "Type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<String> type) {
      this.type = type;
      return this;
    }

    public Builder type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "Url",
        nulls = Nulls.SKIP
    )
    public Builder url(Optional<String> url) {
      this.url = url;
      return this;
    }

    public Builder url(String url) {
      this.url = Optional.of(url);
      return this;
    }

    public SharedAwsSaasProductAdditionalResource build() {
      return new SharedAwsSaasProductAdditionalResource(text, type, url);
    }
  }
}
