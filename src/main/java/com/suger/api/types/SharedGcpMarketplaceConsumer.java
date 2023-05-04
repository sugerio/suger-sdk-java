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
    builder = SharedGcpMarketplaceConsumer.Builder.class
)
public final class SharedGcpMarketplaceConsumer {
  private final Optional<String> project;

  private int _cachedHashCode;

  SharedGcpMarketplaceConsumer(Optional<String> project) {
    this.project = project;
  }

  /**
   * @return The project name with format <code>projects/</code>.
   */
  @JsonProperty("project")
  public Optional<String> getProject() {
    return project;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpMarketplaceConsumer && equalTo((SharedGcpMarketplaceConsumer) other);
  }

  private boolean equalTo(SharedGcpMarketplaceConsumer other) {
    return project.equals(other.project);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.project);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpMarketplaceConsumer{" + "project: " + project + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> project = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpMarketplaceConsumer other) {
      project(other.getProject());
      return this;
    }

    @JsonSetter(
        value = "project",
        nulls = Nulls.SKIP
    )
    public Builder project(Optional<String> project) {
      this.project = project;
      return this;
    }

    public Builder project(String project) {
      this.project = Optional.of(project);
      return this;
    }

    public SharedGcpMarketplaceConsumer build() {
      return new SharedGcpMarketplaceConsumer(project);
    }
  }
}
