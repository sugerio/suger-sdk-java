package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedMeteringUsageRecordReportInfo.Builder.class
)
public final class SharedMeteringUsageRecordReportInfo {
  private final Optional<MarketplacemeteringBatchMeterUsageOutput> awsMeteringResponse;

  private final Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse> azureMeteringResponse;

  private final Optional<Double> commitAmount;

  private final Optional<Double> creditAmount;

  private final Optional<Map<String, Optional<Double>>> creditRecords;

  private final Optional<Map<String, Optional<Double>>> dimensionUnitPrice;

  private final Optional<String> endTime;

  private final Optional<ServicecontrolReportResponse> gcpMeteringResponse;

  private final Optional<Map<String, Optional<Double>>> includedRecords;

  private final Optional<Map<String, Optional<Double>>> reportedRecords;

  private final Optional<String> startTime;

  private final Optional<List<String>> usageRecordGroupIds;

  private final Optional<Double> usedCommitAmount;

  private final Optional<Double> usedCommitAmountIncrement;

  private final Optional<Double> usedCreditAmount;

  private final Optional<Double> usedCreditAmountIncrement;

  private int _cachedHashCode;

  SharedMeteringUsageRecordReportInfo(
      Optional<MarketplacemeteringBatchMeterUsageOutput> awsMeteringResponse,
      Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse> azureMeteringResponse,
      Optional<Double> commitAmount, Optional<Double> creditAmount,
      Optional<Map<String, Optional<Double>>> creditRecords,
      Optional<Map<String, Optional<Double>>> dimensionUnitPrice, Optional<String> endTime,
      Optional<ServicecontrolReportResponse> gcpMeteringResponse,
      Optional<Map<String, Optional<Double>>> includedRecords,
      Optional<Map<String, Optional<Double>>> reportedRecords, Optional<String> startTime,
      Optional<List<String>> usageRecordGroupIds, Optional<Double> usedCommitAmount,
      Optional<Double> usedCommitAmountIncrement, Optional<Double> usedCreditAmount,
      Optional<Double> usedCreditAmountIncrement) {
    this.awsMeteringResponse = awsMeteringResponse;
    this.azureMeteringResponse = azureMeteringResponse;
    this.commitAmount = commitAmount;
    this.creditAmount = creditAmount;
    this.creditRecords = creditRecords;
    this.dimensionUnitPrice = dimensionUnitPrice;
    this.endTime = endTime;
    this.gcpMeteringResponse = gcpMeteringResponse;
    this.includedRecords = includedRecords;
    this.reportedRecords = reportedRecords;
    this.startTime = startTime;
    this.usageRecordGroupIds = usageRecordGroupIds;
    this.usedCommitAmount = usedCommitAmount;
    this.usedCommitAmountIncrement = usedCommitAmountIncrement;
    this.usedCreditAmount = usedCreditAmount;
    this.usedCreditAmountIncrement = usedCreditAmountIncrement;
  }

  /**
   * @return The raw response from AWS metering service.
   */
  @JsonProperty("awsMeteringResponse")
  public Optional<MarketplacemeteringBatchMeterUsageOutput> getAwsMeteringResponse() {
    return awsMeteringResponse;
  }

  /**
   * @return The raw response from Azure metering service.
   */
  @JsonProperty("azureMeteringResponse")
  public Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse> getAzureMeteringResponse(
      ) {
    return azureMeteringResponse;
  }

  /**
   * @return The amount of the commit if applicable.
   */
  @JsonProperty("commitAmount")
  public Optional<Double> getCommitAmount() {
    return commitAmount;
  }

  /**
   * @return The amount of the credit if applicable.
   */
  @JsonProperty("creditAmount")
  public Optional<Double> getCreditAmount() {
    return creditAmount;
  }

  /**
   * @return The credit usage records in the map of &lt;DimensionKey, Count&gt;
   */
  @JsonProperty("creditRecords")
  public Optional<Map<String, Optional<Double>>> getCreditRecords() {
    return creditRecords;
  }

  /**
   * @return The unit price of each dimension in the map of &lt;DimensionKey, UnitPrice&gt;
   */
  @JsonProperty("dimensionUnitPrice")
  public Optional<Map<String, Optional<Double>>> getDimensionUnitPrice() {
    return dimensionUnitPrice;
  }

  /**
   * @return time in UTC when the UsageRecordReport ends
   */
  @JsonProperty("endTime")
  public Optional<String> getEndTime() {
    return endTime;
  }

  /**
   * @return The raw response from GCP metering service.
   */
  @JsonProperty("gcpMeteringResponse")
  public Optional<ServicecontrolReportResponse> getGcpMeteringResponse() {
    return gcpMeteringResponse;
  }

  /**
   * @return The included usage records in the map of &lt;DimensionKey, Count&gt;
   */
  @JsonProperty("includedRecords")
  public Optional<Map<String, Optional<Double>>> getIncludedRecords() {
    return includedRecords;
  }

  /**
   * @return The reported usage records in the map of &lt;DimensionKey, Count&gt;
   */
  @JsonProperty("reportedRecords")
  public Optional<Map<String, Optional<Double>>> getReportedRecords() {
    return reportedRecords;
  }

  /**
   * @return time in UTC when the UsageRecordReport starts
   */
  @JsonProperty("startTime")
  public Optional<String> getStartTime() {
    return startTime;
  }

  /**
   * @return The IDs of UsageRecordGroups aggregated in this UsageRecordReport.
   */
  @JsonProperty("usageRecordGroupIds")
  public Optional<List<String>> getUsageRecordGroupIds() {
    return usageRecordGroupIds;
  }

  /**
   * @return The amount of the used commit before the this usage record report if applicable.
   */
  @JsonProperty("usedCommitAmount")
  public Optional<Double> getUsedCommitAmount() {
    return usedCommitAmount;
  }

  /**
   * @return The amount of the used commit increment in this usage record report if applicable.
   */
  @JsonProperty("usedCommitAmountIncrement")
  public Optional<Double> getUsedCommitAmountIncrement() {
    return usedCommitAmountIncrement;
  }

  /**
   * @return The amount of the used credit before the this usage record report if applicable.
   */
  @JsonProperty("usedCreditAmount")
  public Optional<Double> getUsedCreditAmount() {
    return usedCreditAmount;
  }

  /**
   * @return The amount of the used credit increment in this usage record report if applicable.
   */
  @JsonProperty("usedCreditAmountIncrement")
  public Optional<Double> getUsedCreditAmountIncrement() {
    return usedCreditAmountIncrement;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedMeteringUsageRecordReportInfo && equalTo((SharedMeteringUsageRecordReportInfo) other);
  }

  private boolean equalTo(SharedMeteringUsageRecordReportInfo other) {
    return awsMeteringResponse.equals(other.awsMeteringResponse) && azureMeteringResponse.equals(other.azureMeteringResponse) && commitAmount.equals(other.commitAmount) && creditAmount.equals(other.creditAmount) && creditRecords.equals(other.creditRecords) && dimensionUnitPrice.equals(other.dimensionUnitPrice) && endTime.equals(other.endTime) && gcpMeteringResponse.equals(other.gcpMeteringResponse) && includedRecords.equals(other.includedRecords) && reportedRecords.equals(other.reportedRecords) && startTime.equals(other.startTime) && usageRecordGroupIds.equals(other.usageRecordGroupIds) && usedCommitAmount.equals(other.usedCommitAmount) && usedCommitAmountIncrement.equals(other.usedCommitAmountIncrement) && usedCreditAmount.equals(other.usedCreditAmount) && usedCreditAmountIncrement.equals(other.usedCreditAmountIncrement);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.awsMeteringResponse, this.azureMeteringResponse, this.commitAmount, this.creditAmount, this.creditRecords, this.dimensionUnitPrice, this.endTime, this.gcpMeteringResponse, this.includedRecords, this.reportedRecords, this.startTime, this.usageRecordGroupIds, this.usedCommitAmount, this.usedCommitAmountIncrement, this.usedCreditAmount, this.usedCreditAmountIncrement);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedMeteringUsageRecordReportInfo{" + "awsMeteringResponse: " + awsMeteringResponse + ", azureMeteringResponse: " + azureMeteringResponse + ", commitAmount: " + commitAmount + ", creditAmount: " + creditAmount + ", creditRecords: " + creditRecords + ", dimensionUnitPrice: " + dimensionUnitPrice + ", endTime: " + endTime + ", gcpMeteringResponse: " + gcpMeteringResponse + ", includedRecords: " + includedRecords + ", reportedRecords: " + reportedRecords + ", startTime: " + startTime + ", usageRecordGroupIds: " + usageRecordGroupIds + ", usedCommitAmount: " + usedCommitAmount + ", usedCommitAmountIncrement: " + usedCommitAmountIncrement + ", usedCreditAmount: " + usedCreditAmount + ", usedCreditAmountIncrement: " + usedCreditAmountIncrement + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<MarketplacemeteringBatchMeterUsageOutput> awsMeteringResponse = Optional.empty();

    private Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse> azureMeteringResponse = Optional.empty();

    private Optional<Double> commitAmount = Optional.empty();

    private Optional<Double> creditAmount = Optional.empty();

    private Optional<Map<String, Optional<Double>>> creditRecords = Optional.empty();

    private Optional<Map<String, Optional<Double>>> dimensionUnitPrice = Optional.empty();

    private Optional<String> endTime = Optional.empty();

    private Optional<ServicecontrolReportResponse> gcpMeteringResponse = Optional.empty();

    private Optional<Map<String, Optional<Double>>> includedRecords = Optional.empty();

    private Optional<Map<String, Optional<Double>>> reportedRecords = Optional.empty();

    private Optional<String> startTime = Optional.empty();

    private Optional<List<String>> usageRecordGroupIds = Optional.empty();

    private Optional<Double> usedCommitAmount = Optional.empty();

    private Optional<Double> usedCommitAmountIncrement = Optional.empty();

    private Optional<Double> usedCreditAmount = Optional.empty();

    private Optional<Double> usedCreditAmountIncrement = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedMeteringUsageRecordReportInfo other) {
      awsMeteringResponse(other.getAwsMeteringResponse());
      azureMeteringResponse(other.getAzureMeteringResponse());
      commitAmount(other.getCommitAmount());
      creditAmount(other.getCreditAmount());
      creditRecords(other.getCreditRecords());
      dimensionUnitPrice(other.getDimensionUnitPrice());
      endTime(other.getEndTime());
      gcpMeteringResponse(other.getGcpMeteringResponse());
      includedRecords(other.getIncludedRecords());
      reportedRecords(other.getReportedRecords());
      startTime(other.getStartTime());
      usageRecordGroupIds(other.getUsageRecordGroupIds());
      usedCommitAmount(other.getUsedCommitAmount());
      usedCommitAmountIncrement(other.getUsedCommitAmountIncrement());
      usedCreditAmount(other.getUsedCreditAmount());
      usedCreditAmountIncrement(other.getUsedCreditAmountIncrement());
      return this;
    }

    @JsonSetter(
        value = "awsMeteringResponse",
        nulls = Nulls.SKIP
    )
    public Builder awsMeteringResponse(
        Optional<MarketplacemeteringBatchMeterUsageOutput> awsMeteringResponse) {
      this.awsMeteringResponse = awsMeteringResponse;
      return this;
    }

    public Builder awsMeteringResponse(
        MarketplacemeteringBatchMeterUsageOutput awsMeteringResponse) {
      this.awsMeteringResponse = Optional.of(awsMeteringResponse);
      return this;
    }

    @JsonSetter(
        value = "azureMeteringResponse",
        nulls = Nulls.SKIP
    )
    public Builder azureMeteringResponse(
        Optional<GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse> azureMeteringResponse) {
      this.azureMeteringResponse = azureMeteringResponse;
      return this;
    }

    public Builder azureMeteringResponse(
        GithubComSugerioMarketplaceServiceAzureSdkMarketplacemeteringv1BatchUsageEventOkResponse azureMeteringResponse) {
      this.azureMeteringResponse = Optional.of(azureMeteringResponse);
      return this;
    }

    @JsonSetter(
        value = "commitAmount",
        nulls = Nulls.SKIP
    )
    public Builder commitAmount(Optional<Double> commitAmount) {
      this.commitAmount = commitAmount;
      return this;
    }

    public Builder commitAmount(Double commitAmount) {
      this.commitAmount = Optional.of(commitAmount);
      return this;
    }

    @JsonSetter(
        value = "creditAmount",
        nulls = Nulls.SKIP
    )
    public Builder creditAmount(Optional<Double> creditAmount) {
      this.creditAmount = creditAmount;
      return this;
    }

    public Builder creditAmount(Double creditAmount) {
      this.creditAmount = Optional.of(creditAmount);
      return this;
    }

    @JsonSetter(
        value = "creditRecords",
        nulls = Nulls.SKIP
    )
    public Builder creditRecords(Optional<Map<String, Optional<Double>>> creditRecords) {
      this.creditRecords = creditRecords;
      return this;
    }

    public Builder creditRecords(Map<String, Optional<Double>> creditRecords) {
      this.creditRecords = Optional.of(creditRecords);
      return this;
    }

    @JsonSetter(
        value = "dimensionUnitPrice",
        nulls = Nulls.SKIP
    )
    public Builder dimensionUnitPrice(Optional<Map<String, Optional<Double>>> dimensionUnitPrice) {
      this.dimensionUnitPrice = dimensionUnitPrice;
      return this;
    }

    public Builder dimensionUnitPrice(Map<String, Optional<Double>> dimensionUnitPrice) {
      this.dimensionUnitPrice = Optional.of(dimensionUnitPrice);
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
        value = "gcpMeteringResponse",
        nulls = Nulls.SKIP
    )
    public Builder gcpMeteringResponse(Optional<ServicecontrolReportResponse> gcpMeteringResponse) {
      this.gcpMeteringResponse = gcpMeteringResponse;
      return this;
    }

    public Builder gcpMeteringResponse(ServicecontrolReportResponse gcpMeteringResponse) {
      this.gcpMeteringResponse = Optional.of(gcpMeteringResponse);
      return this;
    }

    @JsonSetter(
        value = "includedRecords",
        nulls = Nulls.SKIP
    )
    public Builder includedRecords(Optional<Map<String, Optional<Double>>> includedRecords) {
      this.includedRecords = includedRecords;
      return this;
    }

    public Builder includedRecords(Map<String, Optional<Double>> includedRecords) {
      this.includedRecords = Optional.of(includedRecords);
      return this;
    }

    @JsonSetter(
        value = "reportedRecords",
        nulls = Nulls.SKIP
    )
    public Builder reportedRecords(Optional<Map<String, Optional<Double>>> reportedRecords) {
      this.reportedRecords = reportedRecords;
      return this;
    }

    public Builder reportedRecords(Map<String, Optional<Double>> reportedRecords) {
      this.reportedRecords = Optional.of(reportedRecords);
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
        value = "usageRecordGroupIds",
        nulls = Nulls.SKIP
    )
    public Builder usageRecordGroupIds(Optional<List<String>> usageRecordGroupIds) {
      this.usageRecordGroupIds = usageRecordGroupIds;
      return this;
    }

    public Builder usageRecordGroupIds(List<String> usageRecordGroupIds) {
      this.usageRecordGroupIds = Optional.of(usageRecordGroupIds);
      return this;
    }

    @JsonSetter(
        value = "usedCommitAmount",
        nulls = Nulls.SKIP
    )
    public Builder usedCommitAmount(Optional<Double> usedCommitAmount) {
      this.usedCommitAmount = usedCommitAmount;
      return this;
    }

    public Builder usedCommitAmount(Double usedCommitAmount) {
      this.usedCommitAmount = Optional.of(usedCommitAmount);
      return this;
    }

    @JsonSetter(
        value = "usedCommitAmountIncrement",
        nulls = Nulls.SKIP
    )
    public Builder usedCommitAmountIncrement(Optional<Double> usedCommitAmountIncrement) {
      this.usedCommitAmountIncrement = usedCommitAmountIncrement;
      return this;
    }

    public Builder usedCommitAmountIncrement(Double usedCommitAmountIncrement) {
      this.usedCommitAmountIncrement = Optional.of(usedCommitAmountIncrement);
      return this;
    }

    @JsonSetter(
        value = "usedCreditAmount",
        nulls = Nulls.SKIP
    )
    public Builder usedCreditAmount(Optional<Double> usedCreditAmount) {
      this.usedCreditAmount = usedCreditAmount;
      return this;
    }

    public Builder usedCreditAmount(Double usedCreditAmount) {
      this.usedCreditAmount = Optional.of(usedCreditAmount);
      return this;
    }

    @JsonSetter(
        value = "usedCreditAmountIncrement",
        nulls = Nulls.SKIP
    )
    public Builder usedCreditAmountIncrement(Optional<Double> usedCreditAmountIncrement) {
      this.usedCreditAmountIncrement = usedCreditAmountIncrement;
      return this;
    }

    public Builder usedCreditAmountIncrement(Double usedCreditAmountIncrement) {
      this.usedCreditAmountIncrement = Optional.of(usedCreditAmountIncrement);
      return this;
    }

    public SharedMeteringUsageRecordReportInfo build() {
      return new SharedMeteringUsageRecordReportInfo(awsMeteringResponse, azureMeteringResponse, commitAmount, creditAmount, creditRecords, dimensionUnitPrice, endTime, gcpMeteringResponse, includedRecords, reportedRecords, startTime, usageRecordGroupIds, usedCommitAmount, usedCommitAmountIncrement, usedCreditAmount, usedCreditAmountIncrement);
    }
  }
}
