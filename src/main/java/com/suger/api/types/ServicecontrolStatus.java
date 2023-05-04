package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = ServicecontrolStatus.Builder.class
)
public final class ServicecontrolStatus {
  private final Optional<Integer> code;

  private final Optional<List<List<Integer>>> details;

  private final Optional<String> message;

  private int _cachedHashCode;

  ServicecontrolStatus(Optional<Integer> code, Optional<List<List<Integer>>> details,
      Optional<String> message) {
    this.code = code;
    this.details = details;
    this.message = message;
  }

  /**
   * @return Code: The status code, which should be an enum value of
   * google.rpc.Code.
   */
  @JsonProperty("code")
  public Optional<Integer> getCode() {
    return code;
  }

  /**
   * @return Details: A list of messages that carry the error details. There is a
   * common set of message types for APIs to use.
   */
  @JsonProperty("details")
  public Optional<List<List<Integer>>> getDetails() {
    return details;
  }

  /**
   * @return Message: A developer-facing error message, which should be in
   * English. Any user-facing error message should be localized and sent
   * in the google.rpc.Status.details field, or localized by the client.
   */
  @JsonProperty("message")
  public Optional<String> getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ServicecontrolStatus && equalTo((ServicecontrolStatus) other);
  }

  private boolean equalTo(ServicecontrolStatus other) {
    return code.equals(other.code) && details.equals(other.details) && message.equals(other.message);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.code, this.details, this.message);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ServicecontrolStatus{" + "code: " + code + ", details: " + details + ", message: " + message + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> code = Optional.empty();

    private Optional<List<List<Integer>>> details = Optional.empty();

    private Optional<String> message = Optional.empty();

    private Builder() {
    }

    public Builder from(ServicecontrolStatus other) {
      code(other.getCode());
      details(other.getDetails());
      message(other.getMessage());
      return this;
    }

    @JsonSetter(
        value = "code",
        nulls = Nulls.SKIP
    )
    public Builder code(Optional<Integer> code) {
      this.code = code;
      return this;
    }

    public Builder code(Integer code) {
      this.code = Optional.of(code);
      return this;
    }

    @JsonSetter(
        value = "details",
        nulls = Nulls.SKIP
    )
    public Builder details(Optional<List<List<Integer>>> details) {
      this.details = details;
      return this;
    }

    public Builder details(List<List<Integer>> details) {
      this.details = Optional.of(details);
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

    public ServicecontrolStatus build() {
      return new ServicecontrolStatus(code, details, message);
    }
  }
}
