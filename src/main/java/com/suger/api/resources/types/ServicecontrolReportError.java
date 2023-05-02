package com.suger.api.resources.types;

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
    builder = ServicecontrolReportError.Builder.class
)
public final class ServicecontrolReportError {
  private final Optional<String> operationId;

  private final Optional<ServicecontrolStatus> status;

  private int _cachedHashCode;

  ServicecontrolReportError(Optional<String> operationId, Optional<ServicecontrolStatus> status) {
    this.operationId = operationId;
    this.status = status;
  }

  /**
   * @return OperationId: The Operation.operation_id value from the request.
   */
  @JsonProperty("operationId")
  public Optional<String> getOperationId() {
    return operationId;
  }

  /**
   * @return Status: Details of the error when processing the Operation.
   */
  @JsonProperty("status")
  public Optional<ServicecontrolStatus> getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ServicecontrolReportError && equalTo((ServicecontrolReportError) other);
  }

  private boolean equalTo(ServicecontrolReportError other) {
    return operationId.equals(other.operationId) && status.equals(other.status);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.operationId, this.status);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ServicecontrolReportError{" + "operationId: " + operationId + ", status: " + status + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> operationId = Optional.empty();

    private Optional<ServicecontrolStatus> status = Optional.empty();

    private Builder() {
    }

    public Builder from(ServicecontrolReportError other) {
      operationId(other.getOperationId());
      status(other.getStatus());
      return this;
    }

    @JsonSetter(
        value = "operationId",
        nulls = Nulls.SKIP
    )
    public Builder operationId(Optional<String> operationId) {
      this.operationId = operationId;
      return this;
    }

    public Builder operationId(String operationId) {
      this.operationId = Optional.of(operationId);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<ServicecontrolStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(ServicecontrolStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    public ServicecontrolReportError build() {
      return new ServicecontrolReportError(operationId, status);
    }
  }
}
