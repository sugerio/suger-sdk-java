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
    builder = ServicecontrolReportResponse.Builder.class
)
public final class ServicecontrolReportResponse {
  private final Optional<List<ServicecontrolReportError>> reportErrors;

  private final Optional<String> serviceConfigId;

  private final Optional<String> serviceRolloutId;

  private int _cachedHashCode;

  ServicecontrolReportResponse(Optional<List<ServicecontrolReportError>> reportErrors,
      Optional<String> serviceConfigId, Optional<String> serviceRolloutId) {
    this.reportErrors = reportErrors;
    this.serviceConfigId = serviceConfigId;
    this.serviceRolloutId = serviceRolloutId;
  }

  /**
   * @return ReportErrors: Partial failures, one for each <code>Operation</code> in the
   * request that failed processing. There are three possible combinations
   * of the RPC status: 1. The combination of a successful RPC status and
   * an empty <code>report_errors</code> list indicates a complete success where all
   * <code>Operations</code> in the request are processed successfully. 2. The
   * combination of a successful RPC status and a non-empty
   * <code>report_errors</code> list indicates a partial success where some
   * <code>Operations</code> in the request succeeded. Each <code>Operation</code> that failed
   * processing has a corresponding item in this list. 3. A failed RPC
   * status indicates a general non-deterministic failure. When this
   * happens, it's impossible to know which of the 'Operations' in the
   * request succeeded or failed.
   */
  @JsonProperty("reportErrors")
  public Optional<List<ServicecontrolReportError>> getReportErrors() {
    return reportErrors;
  }

  /**
   * @return ServiceConfigId: The actual config id used to process the request.
   */
  @JsonProperty("serviceConfigId")
  public Optional<String> getServiceConfigId() {
    return serviceConfigId;
  }

  /**
   * @return ServiceRolloutId: The current service rollout id used to process the
   * request.
   */
  @JsonProperty("serviceRolloutId")
  public Optional<String> getServiceRolloutId() {
    return serviceRolloutId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ServicecontrolReportResponse && equalTo((ServicecontrolReportResponse) other);
  }

  private boolean equalTo(ServicecontrolReportResponse other) {
    return reportErrors.equals(other.reportErrors) && serviceConfigId.equals(other.serviceConfigId) && serviceRolloutId.equals(other.serviceRolloutId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.reportErrors, this.serviceConfigId, this.serviceRolloutId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ServicecontrolReportResponse{" + "reportErrors: " + reportErrors + ", serviceConfigId: " + serviceConfigId + ", serviceRolloutId: " + serviceRolloutId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<ServicecontrolReportError>> reportErrors = Optional.empty();

    private Optional<String> serviceConfigId = Optional.empty();

    private Optional<String> serviceRolloutId = Optional.empty();

    private Builder() {
    }

    public Builder from(ServicecontrolReportResponse other) {
      reportErrors(other.getReportErrors());
      serviceConfigId(other.getServiceConfigId());
      serviceRolloutId(other.getServiceRolloutId());
      return this;
    }

    @JsonSetter(
        value = "reportErrors",
        nulls = Nulls.SKIP
    )
    public Builder reportErrors(Optional<List<ServicecontrolReportError>> reportErrors) {
      this.reportErrors = reportErrors;
      return this;
    }

    public Builder reportErrors(List<ServicecontrolReportError> reportErrors) {
      this.reportErrors = Optional.of(reportErrors);
      return this;
    }

    @JsonSetter(
        value = "serviceConfigId",
        nulls = Nulls.SKIP
    )
    public Builder serviceConfigId(Optional<String> serviceConfigId) {
      this.serviceConfigId = serviceConfigId;
      return this;
    }

    public Builder serviceConfigId(String serviceConfigId) {
      this.serviceConfigId = Optional.of(serviceConfigId);
      return this;
    }

    @JsonSetter(
        value = "serviceRolloutId",
        nulls = Nulls.SKIP
    )
    public Builder serviceRolloutId(Optional<String> serviceRolloutId) {
      this.serviceRolloutId = serviceRolloutId;
      return this;
    }

    public Builder serviceRolloutId(String serviceRolloutId) {
      this.serviceRolloutId = Optional.of(serviceRolloutId);
      return this;
    }

    public ServicecontrolReportResponse build() {
      return new ServicecontrolReportResponse(reportErrors, serviceConfigId, serviceRolloutId);
    }
  }
}
