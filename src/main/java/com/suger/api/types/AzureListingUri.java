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
    builder = AzureListingUri.Builder.class
)
public final class AzureListingUri {
  private final Optional<String> displayText;

  private final Optional<String> subtype;

  private final Optional<String> type;

  private final Optional<String> uri;

  private int _cachedHashCode;

  AzureListingUri(Optional<String> displayText, Optional<String> subtype, Optional<String> type,
      Optional<String> uri) {
    this.displayText = displayText;
    this.subtype = subtype;
    this.type = type;
    this.uri = uri;
  }

  @JsonProperty("displayText")
  public Optional<String> getDisplayText() {
    return displayText;
  }

  @JsonProperty("subtype")
  public Optional<String> getSubtype() {
    return subtype;
  }

  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  @JsonProperty("uri")
  public Optional<String> getUri() {
    return uri;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureListingUri && equalTo((AzureListingUri) other);
  }

  private boolean equalTo(AzureListingUri other) {
    return displayText.equals(other.displayText) && subtype.equals(other.subtype) && type.equals(other.type) && uri.equals(other.uri);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.displayText, this.subtype, this.type, this.uri);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureListingUri{" + "displayText: " + displayText + ", subtype: " + subtype + ", type: " + type + ", uri: " + uri + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> displayText = Optional.empty();

    private Optional<String> subtype = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> uri = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureListingUri other) {
      displayText(other.getDisplayText());
      subtype(other.getSubtype());
      type(other.getType());
      uri(other.getUri());
      return this;
    }

    @JsonSetter(
        value = "displayText",
        nulls = Nulls.SKIP
    )
    public Builder displayText(Optional<String> displayText) {
      this.displayText = displayText;
      return this;
    }

    public Builder displayText(String displayText) {
      this.displayText = Optional.of(displayText);
      return this;
    }

    @JsonSetter(
        value = "subtype",
        nulls = Nulls.SKIP
    )
    public Builder subtype(Optional<String> subtype) {
      this.subtype = subtype;
      return this;
    }

    public Builder subtype(String subtype) {
      this.subtype = Optional.of(subtype);
      return this;
    }

    @JsonSetter(
        value = "type",
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

    public AzureListingUri build() {
      return new AzureListingUri(displayText, subtype, type, uri);
    }
  }
}
