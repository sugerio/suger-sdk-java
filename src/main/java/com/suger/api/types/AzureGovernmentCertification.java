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
    builder = AzureGovernmentCertification.Builder.class
)
public final class AzureGovernmentCertification {
  private final Optional<String> title;

  private final Optional<String> uri;

  private final Optional<List<AzureValidationResult>> validationResults;

  private int _cachedHashCode;

  AzureGovernmentCertification(Optional<String> title, Optional<String> uri,
      Optional<List<AzureValidationResult>> validationResults) {
    this.title = title;
    this.uri = uri;
    this.validationResults = validationResults;
  }

  @JsonProperty("title")
  public Optional<String> getTitle() {
    return title;
  }

  @JsonProperty("uri")
  public Optional<String> getUri() {
    return uri;
  }

  @JsonProperty("validationResults")
  public Optional<List<AzureValidationResult>> getValidationResults() {
    return validationResults;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureGovernmentCertification && equalTo((AzureGovernmentCertification) other);
  }

  private boolean equalTo(AzureGovernmentCertification other) {
    return title.equals(other.title) && uri.equals(other.uri) && validationResults.equals(other.validationResults);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.title, this.uri, this.validationResults);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureGovernmentCertification{" + "title: " + title + ", uri: " + uri + ", validationResults: " + validationResults + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> title = Optional.empty();

    private Optional<String> uri = Optional.empty();

    private Optional<List<AzureValidationResult>> validationResults = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureGovernmentCertification other) {
      title(other.getTitle());
      uri(other.getUri());
      validationResults(other.getValidationResults());
      return this;
    }

    @JsonSetter(
        value = "title",
        nulls = Nulls.SKIP
    )
    public Builder title(Optional<String> title) {
      this.title = title;
      return this;
    }

    public Builder title(String title) {
      this.title = Optional.of(title);
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

    @JsonSetter(
        value = "validationResults",
        nulls = Nulls.SKIP
    )
    public Builder validationResults(Optional<List<AzureValidationResult>> validationResults) {
      this.validationResults = validationResults;
      return this;
    }

    public Builder validationResults(List<AzureValidationResult> validationResults) {
      this.validationResults = Optional.of(validationResults);
      return this;
    }

    public AzureGovernmentCertification build() {
      return new AzureGovernmentCertification(title, uri, validationResults);
    }
  }
}
