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
    builder = SharedIntegrationInfo.Builder.class
)
public final class SharedIntegrationInfo {
  private final Optional<SharedAwsAceIntegration> awsAceIntegration;

  private final Optional<SharedAwsMarketplaceIntegration> awsIntegration;

  private final Optional<SharedAzureIntegration> azureIntegration;

  private final Optional<SharedGcpIntegration> gcpIntegration;

  private final Optional<SharedHubspotCrmIntegration> hubspotCrmIntegration;

  private final Optional<SharedSalesforceCrmIntegration> salesforceCrmIntegration;

  private final Optional<SharedSlackIntegration> slackIntegration;

  private int _cachedHashCode;

  SharedIntegrationInfo(Optional<SharedAwsAceIntegration> awsAceIntegration,
      Optional<SharedAwsMarketplaceIntegration> awsIntegration,
      Optional<SharedAzureIntegration> azureIntegration,
      Optional<SharedGcpIntegration> gcpIntegration,
      Optional<SharedHubspotCrmIntegration> hubspotCrmIntegration,
      Optional<SharedSalesforceCrmIntegration> salesforceCrmIntegration,
      Optional<SharedSlackIntegration> slackIntegration) {
    this.awsAceIntegration = awsAceIntegration;
    this.awsIntegration = awsIntegration;
    this.azureIntegration = azureIntegration;
    this.gcpIntegration = gcpIntegration;
    this.hubspotCrmIntegration = hubspotCrmIntegration;
    this.salesforceCrmIntegration = salesforceCrmIntegration;
    this.slackIntegration = slackIntegration;
  }

  /**
   * @return AWS ACE Integration
   */
  @JsonProperty("awsAceIntegration")
  public Optional<SharedAwsAceIntegration> getAwsAceIntegration() {
    return awsAceIntegration;
  }

  /**
   * @return AWS Marketplace Integration
   */
  @JsonProperty("awsIntegration")
  public Optional<SharedAwsMarketplaceIntegration> getAwsIntegration() {
    return awsIntegration;
  }

  /**
   * @return Azure Marketplace Integration
   */
  @JsonProperty("azureIntegration")
  public Optional<SharedAzureIntegration> getAzureIntegration() {
    return azureIntegration;
  }

  /**
   * @return GCP Marketplace Integration
   */
  @JsonProperty("gcpIntegration")
  public Optional<SharedGcpIntegration> getGcpIntegration() {
    return gcpIntegration;
  }

  /**
   * @return Integration for HubSpot CRM
   */
  @JsonProperty("hubspotCrmIntegration")
  public Optional<SharedHubspotCrmIntegration> getHubspotCrmIntegration() {
    return hubspotCrmIntegration;
  }

  /**
   * @return Integration for Salesforce CRM
   */
  @JsonProperty("salesforceCrmIntegration")
  public Optional<SharedSalesforceCrmIntegration> getSalesforceCrmIntegration() {
    return salesforceCrmIntegration;
  }

  @JsonProperty("slackIntegration")
  public Optional<SharedSlackIntegration> getSlackIntegration() {
    return slackIntegration;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedIntegrationInfo && equalTo((SharedIntegrationInfo) other);
  }

  private boolean equalTo(SharedIntegrationInfo other) {
    return awsAceIntegration.equals(other.awsAceIntegration) && awsIntegration.equals(other.awsIntegration) && azureIntegration.equals(other.azureIntegration) && gcpIntegration.equals(other.gcpIntegration) && hubspotCrmIntegration.equals(other.hubspotCrmIntegration) && salesforceCrmIntegration.equals(other.salesforceCrmIntegration) && slackIntegration.equals(other.slackIntegration);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.awsAceIntegration, this.awsIntegration, this.azureIntegration, this.gcpIntegration, this.hubspotCrmIntegration, this.salesforceCrmIntegration, this.slackIntegration);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedIntegrationInfo{" + "awsAceIntegration: " + awsAceIntegration + ", awsIntegration: " + awsIntegration + ", azureIntegration: " + azureIntegration + ", gcpIntegration: " + gcpIntegration + ", hubspotCrmIntegration: " + hubspotCrmIntegration + ", salesforceCrmIntegration: " + salesforceCrmIntegration + ", slackIntegration: " + slackIntegration + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<SharedAwsAceIntegration> awsAceIntegration = Optional.empty();

    private Optional<SharedAwsMarketplaceIntegration> awsIntegration = Optional.empty();

    private Optional<SharedAzureIntegration> azureIntegration = Optional.empty();

    private Optional<SharedGcpIntegration> gcpIntegration = Optional.empty();

    private Optional<SharedHubspotCrmIntegration> hubspotCrmIntegration = Optional.empty();

    private Optional<SharedSalesforceCrmIntegration> salesforceCrmIntegration = Optional.empty();

    private Optional<SharedSlackIntegration> slackIntegration = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedIntegrationInfo other) {
      awsAceIntegration(other.getAwsAceIntegration());
      awsIntegration(other.getAwsIntegration());
      azureIntegration(other.getAzureIntegration());
      gcpIntegration(other.getGcpIntegration());
      hubspotCrmIntegration(other.getHubspotCrmIntegration());
      salesforceCrmIntegration(other.getSalesforceCrmIntegration());
      slackIntegration(other.getSlackIntegration());
      return this;
    }

    @JsonSetter(
        value = "awsAceIntegration",
        nulls = Nulls.SKIP
    )
    public Builder awsAceIntegration(Optional<SharedAwsAceIntegration> awsAceIntegration) {
      this.awsAceIntegration = awsAceIntegration;
      return this;
    }

    public Builder awsAceIntegration(SharedAwsAceIntegration awsAceIntegration) {
      this.awsAceIntegration = Optional.of(awsAceIntegration);
      return this;
    }

    @JsonSetter(
        value = "awsIntegration",
        nulls = Nulls.SKIP
    )
    public Builder awsIntegration(Optional<SharedAwsMarketplaceIntegration> awsIntegration) {
      this.awsIntegration = awsIntegration;
      return this;
    }

    public Builder awsIntegration(SharedAwsMarketplaceIntegration awsIntegration) {
      this.awsIntegration = Optional.of(awsIntegration);
      return this;
    }

    @JsonSetter(
        value = "azureIntegration",
        nulls = Nulls.SKIP
    )
    public Builder azureIntegration(Optional<SharedAzureIntegration> azureIntegration) {
      this.azureIntegration = azureIntegration;
      return this;
    }

    public Builder azureIntegration(SharedAzureIntegration azureIntegration) {
      this.azureIntegration = Optional.of(azureIntegration);
      return this;
    }

    @JsonSetter(
        value = "gcpIntegration",
        nulls = Nulls.SKIP
    )
    public Builder gcpIntegration(Optional<SharedGcpIntegration> gcpIntegration) {
      this.gcpIntegration = gcpIntegration;
      return this;
    }

    public Builder gcpIntegration(SharedGcpIntegration gcpIntegration) {
      this.gcpIntegration = Optional.of(gcpIntegration);
      return this;
    }

    @JsonSetter(
        value = "hubspotCrmIntegration",
        nulls = Nulls.SKIP
    )
    public Builder hubspotCrmIntegration(
        Optional<SharedHubspotCrmIntegration> hubspotCrmIntegration) {
      this.hubspotCrmIntegration = hubspotCrmIntegration;
      return this;
    }

    public Builder hubspotCrmIntegration(SharedHubspotCrmIntegration hubspotCrmIntegration) {
      this.hubspotCrmIntegration = Optional.of(hubspotCrmIntegration);
      return this;
    }

    @JsonSetter(
        value = "salesforceCrmIntegration",
        nulls = Nulls.SKIP
    )
    public Builder salesforceCrmIntegration(
        Optional<SharedSalesforceCrmIntegration> salesforceCrmIntegration) {
      this.salesforceCrmIntegration = salesforceCrmIntegration;
      return this;
    }

    public Builder salesforceCrmIntegration(
        SharedSalesforceCrmIntegration salesforceCrmIntegration) {
      this.salesforceCrmIntegration = Optional.of(salesforceCrmIntegration);
      return this;
    }

    @JsonSetter(
        value = "slackIntegration",
        nulls = Nulls.SKIP
    )
    public Builder slackIntegration(Optional<SharedSlackIntegration> slackIntegration) {
      this.slackIntegration = slackIntegration;
      return this;
    }

    public Builder slackIntegration(SharedSlackIntegration slackIntegration) {
      this.slackIntegration = Optional.of(slackIntegration);
      return this;
    }

    public SharedIntegrationInfo build() {
      return new SharedIntegrationInfo(awsAceIntegration, awsIntegration, azureIntegration, gcpIntegration, hubspotCrmIntegration, salesforceCrmIntegration, slackIntegration);
    }
  }
}
