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
    builder = SharedOperation.Builder.class
)
public final class SharedOperation {
  private final Optional<String> endTime;

  private final Optional<String> id;

  private final Optional<String> message;

  private final Optional<String> name;

  private final Optional<String> startTime;

  private final Optional<String> status;

  private final Optional<SharedOperationType> type;

  private int _cachedHashCode;

  SharedOperation(Optional<String> endTime, Optional<String> id, Optional<String> message,
      Optional<String> name, Optional<String> startTime, Optional<String> status,
      Optional<SharedOperationType> type) {
    this.endTime = endTime;
    this.id = id;
    this.message = message;
    this.name = name;
    this.startTime = startTime;
    this.status = status;
    this.type = type;
  }

  @JsonProperty("endTime")
  public Optional<String> getEndTime() {
    return endTime;
  }

  /**
   * @return Operation ID.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("message")
  public Optional<String> getMessage() {
    return message;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("startTime")
  public Optional<String> getStartTime() {
    return startTime;
  }

  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  @JsonProperty("type")
  public Optional<SharedOperationType> getType() {
    return type;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedOperation && equalTo((SharedOperation) other);
  }

  private boolean equalTo(SharedOperation other) {
    return endTime.equals(other.endTime) && id.equals(other.id) && message.equals(other.message) && name.equals(other.name) && startTime.equals(other.startTime) && status.equals(other.status) && type.equals(other.type);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.endTime, this.id, this.message, this.name, this.startTime, this.status, this.type);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedOperation{" + "endTime: " + endTime + ", id: " + id + ", message: " + message + ", name: " + name + ", startTime: " + startTime + ", status: " + status + ", type: " + type + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> endTime = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> message = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> startTime = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<SharedOperationType> type = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedOperation other) {
      endTime(other.getEndTime());
      id(other.getId());
      message(other.getMessage());
      name(other.getName());
      startTime(other.getStartTime());
      status(other.getStatus());
      type(other.getType());
      return this;
    }

    @JsonSetter(
        value = "endTime",
        nulls = Nulls.SKIP
    )
    public Builder endTime(Optional<String> endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder endTime(String endTime) {
      this.endTime = Optional.of(endTime);
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
        value = "startTime",
        nulls = Nulls.SKIP
    )
    public Builder startTime(Optional<String> startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder startTime(String startTime) {
      this.startTime = Optional.of(startTime);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<String> status) {
      this.status = status;
      return this;
    }

    public Builder status(String status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<SharedOperationType> type) {
      this.type = type;
      return this;
    }

    public Builder type(SharedOperationType type) {
      this.type = Optional.of(type);
      return this;
    }

    public SharedOperation build() {
      return new SharedOperation(endTime, id, message, name, startTime, status, type);
    }
  }
}
