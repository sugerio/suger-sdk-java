package com.suger.api.types;

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
    builder = AzureProductSetup.Builder.class
)
public final class AzureProductSetup {
  private final Optional<AzureProductSetupCallToAction> callToAction;

  private final Optional<List<AzureTypeValue>> channelStates;

  private final Optional<Boolean> enableTestDrive;

  private final Optional<AzureProductSetupResourceType> resourceType;

  private final Optional<AzureProductSetupSellingOption> sellingOption;

  private final Optional<String> testDriveType;

  private final Optional<String> trialUri;

  private int _cachedHashCode;

  AzureProductSetup(Optional<AzureProductSetupCallToAction> callToAction,
      Optional<List<AzureTypeValue>> channelStates, Optional<Boolean> enableTestDrive,
      Optional<AzureProductSetupResourceType> resourceType,
      Optional<AzureProductSetupSellingOption> sellingOption, Optional<String> testDriveType,
      Optional<String> trialUri) {
    this.callToAction = callToAction;
    this.channelStates = channelStates;
    this.enableTestDrive = enableTestDrive;
    this.resourceType = resourceType;
    this.sellingOption = sellingOption;
    this.testDriveType = testDriveType;
    this.trialUri = trialUri;
  }

  @JsonProperty("callToAction")
  public Optional<AzureProductSetupCallToAction> getCallToAction() {
    return callToAction;
  }

  @JsonProperty("channelStates")
  public Optional<List<AzureTypeValue>> getChannelStates() {
    return channelStates;
  }

  @JsonProperty("enableTestDrive")
  public Optional<Boolean> getEnableTestDrive() {
    return enableTestDrive;
  }

  @JsonProperty("resourceType")
  public Optional<AzureProductSetupResourceType> getResourceType() {
    return resourceType;
  }

  @JsonProperty("sellingOption")
  public Optional<AzureProductSetupSellingOption> getSellingOption() {
    return sellingOption;
  }

  @JsonProperty("testDriveType")
  public Optional<String> getTestDriveType() {
    return testDriveType;
  }

  @JsonProperty("trialUri")
  public Optional<String> getTrialUri() {
    return trialUri;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureProductSetup && equalTo((AzureProductSetup) other);
  }

  private boolean equalTo(AzureProductSetup other) {
    return callToAction.equals(other.callToAction) && channelStates.equals(other.channelStates) && enableTestDrive.equals(other.enableTestDrive) && resourceType.equals(other.resourceType) && sellingOption.equals(other.sellingOption) && testDriveType.equals(other.testDriveType) && trialUri.equals(other.trialUri);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.callToAction, this.channelStates, this.enableTestDrive, this.resourceType, this.sellingOption, this.testDriveType, this.trialUri);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureProductSetup{" + "callToAction: " + callToAction + ", channelStates: " + channelStates + ", enableTestDrive: " + enableTestDrive + ", resourceType: " + resourceType + ", sellingOption: " + sellingOption + ", testDriveType: " + testDriveType + ", trialUri: " + trialUri + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<AzureProductSetupCallToAction> callToAction = Optional.empty();

    private Optional<List<AzureTypeValue>> channelStates = Optional.empty();

    private Optional<Boolean> enableTestDrive = Optional.empty();

    private Optional<AzureProductSetupResourceType> resourceType = Optional.empty();

    private Optional<AzureProductSetupSellingOption> sellingOption = Optional.empty();

    private Optional<String> testDriveType = Optional.empty();

    private Optional<String> trialUri = Optional.empty();

    private Builder() {
    }

    public Builder from(AzureProductSetup other) {
      callToAction(other.getCallToAction());
      channelStates(other.getChannelStates());
      enableTestDrive(other.getEnableTestDrive());
      resourceType(other.getResourceType());
      sellingOption(other.getSellingOption());
      testDriveType(other.getTestDriveType());
      trialUri(other.getTrialUri());
      return this;
    }

    @JsonSetter(
        value = "callToAction",
        nulls = Nulls.SKIP
    )
    public Builder callToAction(Optional<AzureProductSetupCallToAction> callToAction) {
      this.callToAction = callToAction;
      return this;
    }

    public Builder callToAction(AzureProductSetupCallToAction callToAction) {
      this.callToAction = Optional.of(callToAction);
      return this;
    }

    @JsonSetter(
        value = "channelStates",
        nulls = Nulls.SKIP
    )
    public Builder channelStates(Optional<List<AzureTypeValue>> channelStates) {
      this.channelStates = channelStates;
      return this;
    }

    public Builder channelStates(List<AzureTypeValue> channelStates) {
      this.channelStates = Optional.of(channelStates);
      return this;
    }

    @JsonSetter(
        value = "enableTestDrive",
        nulls = Nulls.SKIP
    )
    public Builder enableTestDrive(Optional<Boolean> enableTestDrive) {
      this.enableTestDrive = enableTestDrive;
      return this;
    }

    public Builder enableTestDrive(Boolean enableTestDrive) {
      this.enableTestDrive = Optional.of(enableTestDrive);
      return this;
    }

    @JsonSetter(
        value = "resourceType",
        nulls = Nulls.SKIP
    )
    public Builder resourceType(Optional<AzureProductSetupResourceType> resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    public Builder resourceType(AzureProductSetupResourceType resourceType) {
      this.resourceType = Optional.of(resourceType);
      return this;
    }

    @JsonSetter(
        value = "sellingOption",
        nulls = Nulls.SKIP
    )
    public Builder sellingOption(Optional<AzureProductSetupSellingOption> sellingOption) {
      this.sellingOption = sellingOption;
      return this;
    }

    public Builder sellingOption(AzureProductSetupSellingOption sellingOption) {
      this.sellingOption = Optional.of(sellingOption);
      return this;
    }

    @JsonSetter(
        value = "testDriveType",
        nulls = Nulls.SKIP
    )
    public Builder testDriveType(Optional<String> testDriveType) {
      this.testDriveType = testDriveType;
      return this;
    }

    public Builder testDriveType(String testDriveType) {
      this.testDriveType = Optional.of(testDriveType);
      return this;
    }

    @JsonSetter(
        value = "trialUri",
        nulls = Nulls.SKIP
    )
    public Builder trialUri(Optional<String> trialUri) {
      this.trialUri = trialUri;
      return this;
    }

    public Builder trialUri(String trialUri) {
      this.trialUri = Optional.of(trialUri);
      return this;
    }

    public AzureProductSetup build() {
      return new AzureProductSetup(callToAction, channelStates, enableTestDrive, resourceType, sellingOption, testDriveType, trialUri);
    }
  }
}
