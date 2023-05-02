package com.suger.api.resources.api.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = SharedGetApiClientAccessTokenParams.Builder.class
)
public final class SharedGetApiClientAccessTokenParams {
  private final String id;

  private final String organizationId;

  private final String secret;

  private int _cachedHashCode;

  SharedGetApiClientAccessTokenParams(String id, String organizationId, String secret) {
    this.id = id;
    this.organizationId = organizationId;
    this.secret = secret;
  }

  /**
   * @return The ID of the API Client.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("organizationID")
  public String getOrganizationId() {
    return organizationId;
  }

  /**
   * @return The secret of the API Client.
   */
  @JsonProperty("secret")
  public String getSecret() {
    return secret;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGetApiClientAccessTokenParams && equalTo((SharedGetApiClientAccessTokenParams) other);
  }

  private boolean equalTo(SharedGetApiClientAccessTokenParams other) {
    return id.equals(other.id) && organizationId.equals(other.organizationId) && secret.equals(other.secret);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.organizationId, this.secret);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGetApiClientAccessTokenParams{" + "id: " + id + ", organizationId: " + organizationId + ", secret: " + secret + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    OrganizationIdStage id(String id);

    Builder from(SharedGetApiClientAccessTokenParams other);
  }

  public interface OrganizationIdStage {
    SecretStage organizationId(String organizationId);
  }

  public interface SecretStage {
    _FinalStage secret(String secret);
  }

  public interface _FinalStage {
    SharedGetApiClientAccessTokenParams build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, OrganizationIdStage, SecretStage, _FinalStage {
    private String id;

    private String organizationId;

    private String secret;

    private Builder() {
    }

    @Override
    public Builder from(SharedGetApiClientAccessTokenParams other) {
      id(other.getId());
      organizationId(other.getOrganizationId());
      secret(other.getSecret());
      return this;
    }

    /**
     * <p>The ID of the API Client.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public OrganizationIdStage id(String id) {
      this.id = id;
      return this;
    }

    @Override
    @JsonSetter("organizationID")
    public SecretStage organizationId(String organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    /**
     * <p>The secret of the API Client.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("secret")
    public _FinalStage secret(String secret) {
      this.secret = secret;
      return this;
    }

    @Override
    public SharedGetApiClientAccessTokenParams build() {
      return new SharedGetApiClientAccessTokenParams(id, organizationId, secret);
    }
  }
}
