package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedGcpIntegration.Builder.class
)
public final class SharedGcpIntegration {
  private final Optional<String> gcpProjectId;

  private final Optional<String> gcpProjectNumber;

  private final Optional<String> identityProviderId;

  private final Optional<String> partnerId;

  private final Optional<String> pubsubTopic;

  private final Optional<String> reportBucket;

  private final Optional<Boolean> reportFullSyncDone;

  private final Optional<String> reportStartDate;

  private final Optional<String> serviceAccountEmail;

  private final Optional<List<String>> serviceNames;

  private final Optional<String> workloadIdentityPoolId;

  private int _cachedHashCode;

  SharedGcpIntegration(Optional<String> gcpProjectId, Optional<String> gcpProjectNumber,
      Optional<String> identityProviderId, Optional<String> partnerId, Optional<String> pubsubTopic,
      Optional<String> reportBucket, Optional<Boolean> reportFullSyncDone,
      Optional<String> reportStartDate, Optional<String> serviceAccountEmail,
      Optional<List<String>> serviceNames, Optional<String> workloadIdentityPoolId) {
    this.gcpProjectId = gcpProjectId;
    this.gcpProjectNumber = gcpProjectNumber;
    this.identityProviderId = identityProviderId;
    this.partnerId = partnerId;
    this.pubsubTopic = pubsubTopic;
    this.reportBucket = reportBucket;
    this.reportFullSyncDone = reportFullSyncDone;
    this.reportStartDate = reportStartDate;
    this.serviceAccountEmail = serviceAccountEmail;
    this.serviceNames = serviceNames;
    this.workloadIdentityPoolId = workloadIdentityPoolId;
  }

  @JsonProperty("gcpProjectId")
  public Optional<String> getGcpProjectId() {
    return gcpProjectId;
  }

  @JsonProperty("gcpProjectNumber")
  public Optional<String> getGcpProjectNumber() {
    return gcpProjectNumber;
  }

  @JsonProperty("identityProviderId")
  public Optional<String> getIdentityProviderId() {
    return identityProviderId;
  }

  /**
   * @return The GCP Marketplace Partner ID, it is also called as Provider ID somewhere.
   */
  @JsonProperty("partnerId")
  public Optional<String> getPartnerId() {
    return partnerId;
  }

  /**
   * @return The resource name of the Pub/Sub topic to receive notifications from Google when a user signs up for your service, purchases a plan, or changes an existing plan.
   */
  @JsonProperty("pubsubTopic")
  public Optional<String> getPubsubTopic() {
    return pubsubTopic;
  }

  /**
   * @return The GCP storage bucket name to store the GCP Marketplace reports.
   */
  @JsonProperty("reportBucket")
  public Optional<String> getReportBucket() {
    return reportBucket;
  }

  /**
   * @return Is GCP Marketplace Report full-sync done.
   */
  @JsonProperty("reportFullSyncDone")
  public Optional<Boolean> getReportFullSyncDone() {
    return reportFullSyncDone;
  }

  /**
   * @return The UTC date when GCP Marketplace reprots start to generate.
   */
  @JsonProperty("reportStartDate")
  public Optional<String> getReportStartDate() {
    return reportStartDate;
  }

  @JsonProperty("serviceAccountEmail")
  public Optional<String> getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  /**
   * @return The array of service resource names of the listings in GCP Marketplace.
   */
  @JsonProperty("serviceNames")
  public Optional<List<String>> getServiceNames() {
    return serviceNames;
  }

  @JsonProperty("workloadIdentityPoolId")
  public Optional<String> getWorkloadIdentityPoolId() {
    return workloadIdentityPoolId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpIntegration && equalTo((SharedGcpIntegration) other);
  }

  private boolean equalTo(SharedGcpIntegration other) {
    return gcpProjectId.equals(other.gcpProjectId) && gcpProjectNumber.equals(other.gcpProjectNumber) && identityProviderId.equals(other.identityProviderId) && partnerId.equals(other.partnerId) && pubsubTopic.equals(other.pubsubTopic) && reportBucket.equals(other.reportBucket) && reportFullSyncDone.equals(other.reportFullSyncDone) && reportStartDate.equals(other.reportStartDate) && serviceAccountEmail.equals(other.serviceAccountEmail) && serviceNames.equals(other.serviceNames) && workloadIdentityPoolId.equals(other.workloadIdentityPoolId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.gcpProjectId, this.gcpProjectNumber, this.identityProviderId, this.partnerId, this.pubsubTopic, this.reportBucket, this.reportFullSyncDone, this.reportStartDate, this.serviceAccountEmail, this.serviceNames, this.workloadIdentityPoolId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpIntegration{" + "gcpProjectId: " + gcpProjectId + ", gcpProjectNumber: " + gcpProjectNumber + ", identityProviderId: " + identityProviderId + ", partnerId: " + partnerId + ", pubsubTopic: " + pubsubTopic + ", reportBucket: " + reportBucket + ", reportFullSyncDone: " + reportFullSyncDone + ", reportStartDate: " + reportStartDate + ", serviceAccountEmail: " + serviceAccountEmail + ", serviceNames: " + serviceNames + ", workloadIdentityPoolId: " + workloadIdentityPoolId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> gcpProjectId = Optional.empty();

    private Optional<String> gcpProjectNumber = Optional.empty();

    private Optional<String> identityProviderId = Optional.empty();

    private Optional<String> partnerId = Optional.empty();

    private Optional<String> pubsubTopic = Optional.empty();

    private Optional<String> reportBucket = Optional.empty();

    private Optional<Boolean> reportFullSyncDone = Optional.empty();

    private Optional<String> reportStartDate = Optional.empty();

    private Optional<String> serviceAccountEmail = Optional.empty();

    private Optional<List<String>> serviceNames = Optional.empty();

    private Optional<String> workloadIdentityPoolId = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpIntegration other) {
      gcpProjectId(other.getGcpProjectId());
      gcpProjectNumber(other.getGcpProjectNumber());
      identityProviderId(other.getIdentityProviderId());
      partnerId(other.getPartnerId());
      pubsubTopic(other.getPubsubTopic());
      reportBucket(other.getReportBucket());
      reportFullSyncDone(other.getReportFullSyncDone());
      reportStartDate(other.getReportStartDate());
      serviceAccountEmail(other.getServiceAccountEmail());
      serviceNames(other.getServiceNames());
      workloadIdentityPoolId(other.getWorkloadIdentityPoolId());
      return this;
    }

    @JsonSetter(
        value = "gcpProjectId",
        nulls = Nulls.SKIP
    )
    public Builder gcpProjectId(Optional<String> gcpProjectId) {
      this.gcpProjectId = gcpProjectId;
      return this;
    }

    public Builder gcpProjectId(String gcpProjectId) {
      this.gcpProjectId = Optional.of(gcpProjectId);
      return this;
    }

    @JsonSetter(
        value = "gcpProjectNumber",
        nulls = Nulls.SKIP
    )
    public Builder gcpProjectNumber(Optional<String> gcpProjectNumber) {
      this.gcpProjectNumber = gcpProjectNumber;
      return this;
    }

    public Builder gcpProjectNumber(String gcpProjectNumber) {
      this.gcpProjectNumber = Optional.of(gcpProjectNumber);
      return this;
    }

    @JsonSetter(
        value = "identityProviderId",
        nulls = Nulls.SKIP
    )
    public Builder identityProviderId(Optional<String> identityProviderId) {
      this.identityProviderId = identityProviderId;
      return this;
    }

    public Builder identityProviderId(String identityProviderId) {
      this.identityProviderId = Optional.of(identityProviderId);
      return this;
    }

    @JsonSetter(
        value = "partnerId",
        nulls = Nulls.SKIP
    )
    public Builder partnerId(Optional<String> partnerId) {
      this.partnerId = partnerId;
      return this;
    }

    public Builder partnerId(String partnerId) {
      this.partnerId = Optional.of(partnerId);
      return this;
    }

    @JsonSetter(
        value = "pubsubTopic",
        nulls = Nulls.SKIP
    )
    public Builder pubsubTopic(Optional<String> pubsubTopic) {
      this.pubsubTopic = pubsubTopic;
      return this;
    }

    public Builder pubsubTopic(String pubsubTopic) {
      this.pubsubTopic = Optional.of(pubsubTopic);
      return this;
    }

    @JsonSetter(
        value = "reportBucket",
        nulls = Nulls.SKIP
    )
    public Builder reportBucket(Optional<String> reportBucket) {
      this.reportBucket = reportBucket;
      return this;
    }

    public Builder reportBucket(String reportBucket) {
      this.reportBucket = Optional.of(reportBucket);
      return this;
    }

    @JsonSetter(
        value = "reportFullSyncDone",
        nulls = Nulls.SKIP
    )
    public Builder reportFullSyncDone(Optional<Boolean> reportFullSyncDone) {
      this.reportFullSyncDone = reportFullSyncDone;
      return this;
    }

    public Builder reportFullSyncDone(Boolean reportFullSyncDone) {
      this.reportFullSyncDone = Optional.of(reportFullSyncDone);
      return this;
    }

    @JsonSetter(
        value = "reportStartDate",
        nulls = Nulls.SKIP
    )
    public Builder reportStartDate(Optional<String> reportStartDate) {
      this.reportStartDate = reportStartDate;
      return this;
    }

    public Builder reportStartDate(String reportStartDate) {
      this.reportStartDate = Optional.of(reportStartDate);
      return this;
    }

    @JsonSetter(
        value = "serviceAccountEmail",
        nulls = Nulls.SKIP
    )
    public Builder serviceAccountEmail(Optional<String> serviceAccountEmail) {
      this.serviceAccountEmail = serviceAccountEmail;
      return this;
    }

    public Builder serviceAccountEmail(String serviceAccountEmail) {
      this.serviceAccountEmail = Optional.of(serviceAccountEmail);
      return this;
    }

    @JsonSetter(
        value = "serviceNames",
        nulls = Nulls.SKIP
    )
    public Builder serviceNames(Optional<List<String>> serviceNames) {
      this.serviceNames = serviceNames;
      return this;
    }

    public Builder serviceNames(List<String> serviceNames) {
      this.serviceNames = Optional.of(serviceNames);
      return this;
    }

    @JsonSetter(
        value = "workloadIdentityPoolId",
        nulls = Nulls.SKIP
    )
    public Builder workloadIdentityPoolId(Optional<String> workloadIdentityPoolId) {
      this.workloadIdentityPoolId = workloadIdentityPoolId;
      return this;
    }

    public Builder workloadIdentityPoolId(String workloadIdentityPoolId) {
      this.workloadIdentityPoolId = Optional.of(workloadIdentityPoolId);
      return this;
    }

    public SharedGcpIntegration build() {
      return new SharedGcpIntegration(gcpProjectId, gcpProjectNumber, identityProviderId, partnerId, pubsubTopic, reportBucket, reportFullSyncDone, reportStartDate, serviceAccountEmail, serviceNames, workloadIdentityPoolId);
    }
  }
}
