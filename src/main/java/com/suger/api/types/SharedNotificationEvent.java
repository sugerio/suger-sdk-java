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
    builder = SharedNotificationEvent.Builder.class
)
public final class SharedNotificationEvent {
  private final Optional<SharedNotificationEventAction> action;

  private final Optional<String> entityId;

  private final Optional<String> entityStatus;

  private final Optional<SharedEntityType> entityType;

  private final Optional<String> eventId;

  private final Optional<SharedNotificationEventStatus> eventStatus;

  private final Optional<String> lastUpdateTime;

  private final Optional<String> message;

  private final Optional<String> organizationId;

  private final Optional<String> timestamp;

  private int _cachedHashCode;

  SharedNotificationEvent(Optional<SharedNotificationEventAction> action, Optional<String> entityId,
      Optional<String> entityStatus, Optional<SharedEntityType> entityType,
      Optional<String> eventId, Optional<SharedNotificationEventStatus> eventStatus,
      Optional<String> lastUpdateTime, Optional<String> message, Optional<String> organizationId,
      Optional<String> timestamp) {
    this.action = action;
    this.entityId = entityId;
    this.entityStatus = entityStatus;
    this.entityType = entityType;
    this.eventId = eventId;
    this.eventStatus = eventStatus;
    this.lastUpdateTime = lastUpdateTime;
    this.message = message;
    this.organizationId = organizationId;
    this.timestamp = timestamp;
  }

  @JsonProperty("action")
  public Optional<SharedNotificationEventAction> getAction() {
    return action;
  }

  @JsonProperty("entityID")
  public Optional<String> getEntityId() {
    return entityId;
  }

  @JsonProperty("entityStatus")
  public Optional<String> getEntityStatus() {
    return entityStatus;
  }

  @JsonProperty("entityType")
  public Optional<SharedEntityType> getEntityType() {
    return entityType;
  }

  /**
   * @return notification event id.
   */
  @JsonProperty("eventID")
  public Optional<String> getEventId() {
    return eventId;
  }

  /**
   * @return notification event status.
   */
  @JsonProperty("eventStatus")
  public Optional<SharedNotificationEventStatus> getEventStatus() {
    return eventStatus;
  }

  /**
   * @return timestamp of the event when it is updated.
   */
  @JsonProperty("lastUpdateTime")
  public Optional<String> getLastUpdateTime() {
    return lastUpdateTime;
  }

  @JsonProperty("message")
  public Optional<String> getMessage() {
    return message;
  }

  /**
   * @return suger organization id.
   */
  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  /**
   * @return timestamp of the event when it is scheduled or created.
   */
  @JsonProperty("timestamp")
  public Optional<String> getTimestamp() {
    return timestamp;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedNotificationEvent && equalTo((SharedNotificationEvent) other);
  }

  private boolean equalTo(SharedNotificationEvent other) {
    return action.equals(other.action) && entityId.equals(other.entityId) && entityStatus.equals(other.entityStatus) && entityType.equals(other.entityType) && eventId.equals(other.eventId) && eventStatus.equals(other.eventStatus) && lastUpdateTime.equals(other.lastUpdateTime) && message.equals(other.message) && organizationId.equals(other.organizationId) && timestamp.equals(other.timestamp);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.action, this.entityId, this.entityStatus, this.entityType, this.eventId, this.eventStatus, this.lastUpdateTime, this.message, this.organizationId, this.timestamp);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedNotificationEvent{" + "action: " + action + ", entityId: " + entityId + ", entityStatus: " + entityStatus + ", entityType: " + entityType + ", eventId: " + eventId + ", eventStatus: " + eventStatus + ", lastUpdateTime: " + lastUpdateTime + ", message: " + message + ", organizationId: " + organizationId + ", timestamp: " + timestamp + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SharedNotificationEventAction> action = Optional.empty();

    private Optional<String> entityId = Optional.empty();

    private Optional<String> entityStatus = Optional.empty();

    private Optional<SharedEntityType> entityType = Optional.empty();

    private Optional<String> eventId = Optional.empty();

    private Optional<SharedNotificationEventStatus> eventStatus = Optional.empty();

    private Optional<String> lastUpdateTime = Optional.empty();

    private Optional<String> message = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<String> timestamp = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedNotificationEvent other) {
      action(other.getAction());
      entityId(other.getEntityId());
      entityStatus(other.getEntityStatus());
      entityType(other.getEntityType());
      eventId(other.getEventId());
      eventStatus(other.getEventStatus());
      lastUpdateTime(other.getLastUpdateTime());
      message(other.getMessage());
      organizationId(other.getOrganizationId());
      timestamp(other.getTimestamp());
      return this;
    }

    @JsonSetter(
        value = "action",
        nulls = Nulls.SKIP
    )
    public Builder action(Optional<SharedNotificationEventAction> action) {
      this.action = action;
      return this;
    }

    public Builder action(SharedNotificationEventAction action) {
      this.action = Optional.of(action);
      return this;
    }

    @JsonSetter(
        value = "entityID",
        nulls = Nulls.SKIP
    )
    public Builder entityId(Optional<String> entityId) {
      this.entityId = entityId;
      return this;
    }

    public Builder entityId(String entityId) {
      this.entityId = Optional.of(entityId);
      return this;
    }

    @JsonSetter(
        value = "entityStatus",
        nulls = Nulls.SKIP
    )
    public Builder entityStatus(Optional<String> entityStatus) {
      this.entityStatus = entityStatus;
      return this;
    }

    public Builder entityStatus(String entityStatus) {
      this.entityStatus = Optional.of(entityStatus);
      return this;
    }

    @JsonSetter(
        value = "entityType",
        nulls = Nulls.SKIP
    )
    public Builder entityType(Optional<SharedEntityType> entityType) {
      this.entityType = entityType;
      return this;
    }

    public Builder entityType(SharedEntityType entityType) {
      this.entityType = Optional.of(entityType);
      return this;
    }

    @JsonSetter(
        value = "eventID",
        nulls = Nulls.SKIP
    )
    public Builder eventId(Optional<String> eventId) {
      this.eventId = eventId;
      return this;
    }

    public Builder eventId(String eventId) {
      this.eventId = Optional.of(eventId);
      return this;
    }

    @JsonSetter(
        value = "eventStatus",
        nulls = Nulls.SKIP
    )
    public Builder eventStatus(Optional<SharedNotificationEventStatus> eventStatus) {
      this.eventStatus = eventStatus;
      return this;
    }

    public Builder eventStatus(SharedNotificationEventStatus eventStatus) {
      this.eventStatus = Optional.of(eventStatus);
      return this;
    }

    @JsonSetter(
        value = "lastUpdateTime",
        nulls = Nulls.SKIP
    )
    public Builder lastUpdateTime(Optional<String> lastUpdateTime) {
      this.lastUpdateTime = lastUpdateTime;
      return this;
    }

    public Builder lastUpdateTime(String lastUpdateTime) {
      this.lastUpdateTime = Optional.of(lastUpdateTime);
      return this;
    }

    @JsonSetter(
        value = "message",
        nulls = Nulls.SKIP
    )
    public Builder message(Optional<String> message) {
      this.message = message;
      return this;
    }

    public Builder message(String message) {
      this.message = Optional.of(message);
      return this;
    }

    @JsonSetter(
        value = "organizationID",
        nulls = Nulls.SKIP
    )
    public Builder organizationId(Optional<String> organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    public Builder organizationId(String organizationId) {
      this.organizationId = Optional.of(organizationId);
      return this;
    }

    @JsonSetter(
        value = "timestamp",
        nulls = Nulls.SKIP
    )
    public Builder timestamp(Optional<String> timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public Builder timestamp(String timestamp) {
      this.timestamp = Optional.of(timestamp);
      return this;
    }

    public SharedNotificationEvent build() {
      return new SharedNotificationEvent(action, entityId, entityStatus, entityType, eventId, eventStatus, lastUpdateTime, message, organizationId, timestamp);
    }
  }
}
