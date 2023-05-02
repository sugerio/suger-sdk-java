package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse.Builder.class
)
public final class GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse {
  private final Optional<String> dimension;

  private final Optional<String> effectiveStartTime;

  private final Optional<String> messageTime;

  private final Optional<String> planId;

  private final Optional<Double> quantity;

  private final Optional<String> resourceId;

  private final Optional<String> resourceUri;

  private final Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum> status;

  private final Optional<String> usageEventId;

  private int _cachedHashCode;

  GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse(
      Optional<String> dimension, Optional<String> effectiveStartTime, Optional<String> messageTime,
      Optional<String> planId, Optional<Double> quantity, Optional<String> resourceId,
      Optional<String> resourceUri,
      Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum> status,
      Optional<String> usageEventId) {
    this.dimension = dimension;
    this.effectiveStartTime = effectiveStartTime;
    this.messageTime = messageTime;
    this.planId = planId;
    this.quantity = quantity;
    this.resourceId = resourceId;
    this.resourceUri = resourceUri;
    this.status = status;
    this.usageEventId = usageEventId;
  }

  /**
   * @return Dimension identifier
   */
  @JsonProperty("dimension")
  public Optional<String> getDimension() {
    return dimension;
  }

  /**
   * @return Time in UTC when the usage event occurred
   */
  @JsonProperty("effectiveStartTime")
  public Optional<String> getEffectiveStartTime() {
    return effectiveStartTime;
  }

  /**
   * @return Time this message was created in UTC
   */
  @JsonProperty("messageTime")
  public Optional<String> getMessageTime() {
    return messageTime;
  }

  /**
   * @return Plan associated with the purchased offer
   */
  @JsonProperty("planId")
  public Optional<String> getPlanId() {
    return planId;
  }

  /**
   * @return Number of units consumed
   */
  @JsonProperty("quantity")
  public Optional<Double> getQuantity() {
    return quantity;
  }

  /**
   * @return Identifier of the resource against which usage is emitted
   */
  @JsonProperty("resourceId")
  public Optional<String> getResourceId() {
    return resourceId;
  }

  /**
   * @return Identifier of the managed app resource against which usage is emitted
   */
  @JsonProperty("resourceUri")
  public Optional<String> getResourceUri() {
    return resourceUri;
  }

  /**
   * @return Status of the operation.
   */
  @JsonProperty("status")
  public Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum> getStatus(
      ) {
    return status;
  }

  /**
   * @return Unique identifier associated with the usage event
   */
  @JsonProperty("usageEventId")
  public Optional<String> getUsageEventId() {
    return usageEventId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse && equalTo((GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse) other);
  }

  private boolean equalTo(
      GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse other) {
    return dimension.equals(other.dimension) && effectiveStartTime.equals(other.effectiveStartTime) && messageTime.equals(other.messageTime) && planId.equals(other.planId) && quantity.equals(other.quantity) && resourceId.equals(other.resourceId) && resourceUri.equals(other.resourceUri) && status.equals(other.status) && usageEventId.equals(other.usageEventId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.dimension, this.effectiveStartTime, this.messageTime, this.planId, this.quantity, this.resourceId, this.resourceUri, this.status, this.usageEventId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse{" + "dimension: " + dimension + ", effectiveStartTime: " + effectiveStartTime + ", messageTime: " + messageTime + ", planId: " + planId + ", quantity: " + quantity + ", resourceId: " + resourceId + ", resourceUri: " + resourceUri + ", status: " + status + ", usageEventId: " + usageEventId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> dimension = Optional.empty();

    private Optional<String> effectiveStartTime = Optional.empty();

    private Optional<String> messageTime = Optional.empty();

    private Optional<String> planId = Optional.empty();

    private Optional<Double> quantity = Optional.empty();

    private Optional<String> resourceId = Optional.empty();

    private Optional<String> resourceUri = Optional.empty();

    private Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum> status = Optional.empty();

    private Optional<String> usageEventId = Optional.empty();

    private Builder() {
    }

    public Builder from(
        GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse other) {
      dimension(other.getDimension());
      effectiveStartTime(other.getEffectiveStartTime());
      messageTime(other.getMessageTime());
      planId(other.getPlanId());
      quantity(other.getQuantity());
      resourceId(other.getResourceId());
      resourceUri(other.getResourceUri());
      status(other.getStatus());
      usageEventId(other.getUsageEventId());
      return this;
    }

    @JsonSetter(
        value = "dimension",
        nulls = Nulls.SKIP
    )
    public Builder dimension(Optional<String> dimension) {
      this.dimension = dimension;
      return this;
    }

    public Builder dimension(String dimension) {
      this.dimension = Optional.of(dimension);
      return this;
    }

    @JsonSetter(
        value = "effectiveStartTime",
        nulls = Nulls.SKIP
    )
    public Builder effectiveStartTime(Optional<String> effectiveStartTime) {
      this.effectiveStartTime = effectiveStartTime;
      return this;
    }

    public Builder effectiveStartTime(String effectiveStartTime) {
      this.effectiveStartTime = Optional.of(effectiveStartTime);
      return this;
    }

    @JsonSetter(
        value = "messageTime",
        nulls = Nulls.SKIP
    )
    public Builder messageTime(Optional<String> messageTime) {
      this.messageTime = messageTime;
      return this;
    }

    public Builder messageTime(String messageTime) {
      this.messageTime = Optional.of(messageTime);
      return this;
    }

    @JsonSetter(
        value = "planId",
        nulls = Nulls.SKIP
    )
    public Builder planId(Optional<String> planId) {
      this.planId = planId;
      return this;
    }

    public Builder planId(String planId) {
      this.planId = Optional.of(planId);
      return this;
    }

    @JsonSetter(
        value = "quantity",
        nulls = Nulls.SKIP
    )
    public Builder quantity(Optional<Double> quantity) {
      this.quantity = quantity;
      return this;
    }

    public Builder quantity(Double quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    @JsonSetter(
        value = "resourceId",
        nulls = Nulls.SKIP
    )
    public Builder resourceId(Optional<String> resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    public Builder resourceId(String resourceId) {
      this.resourceId = Optional.of(resourceId);
      return this;
    }

    @JsonSetter(
        value = "resourceUri",
        nulls = Nulls.SKIP
    )
    public Builder resourceUri(Optional<String> resourceUri) {
      this.resourceUri = resourceUri;
      return this;
    }

    public Builder resourceUri(String resourceUri) {
      this.resourceUri = Optional.of(resourceUri);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(
        Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum> status) {
      this.status = status;
      return this;
    }

    public Builder status(
        GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventStatusEnum status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "usageEventId",
        nulls = Nulls.SKIP
    )
    public Builder usageEventId(Optional<String> usageEventId) {
      this.usageEventId = usageEventId;
      return this;
    }

    public Builder usageEventId(String usageEventId) {
      this.usageEventId = Optional.of(usageEventId);
      return this;
    }

    public GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse build(
        ) {
      return new GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1UsageEventOkResponse(dimension, effectiveStartTime, messageTime, planId, quantity, resourceId, resourceUri, status, usageEventId);
    }
  }
}
