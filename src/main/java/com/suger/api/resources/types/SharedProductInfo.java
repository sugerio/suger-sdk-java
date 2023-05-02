package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedProductInfo.Builder.class
)
public final class SharedProductInfo {
  private final Optional<Map<String, Optional<String>>> attributes;

  private final Optional<SharedAwsSaasProduct> awsSaasProduct;

  private final Optional<List<SharedAwsSnsSubscription>> awsSnsSubscriptions;

  private final Optional<AzureProduct> azureProduct;

  private final Optional<List<SharedCommitDimension>> commits;

  private final Optional<String> currency;

  private final Optional<List<SharedMeteringDimension>> dimensions;

  private final Optional<String> eulaUrl;

  private final Optional<SharedGcpProduct> gcpProduct;

  private final Optional<String> refundCancelationPolicy;

  private final Optional<String> sellerNotes;

  private int _cachedHashCode;

  SharedProductInfo(Optional<Map<String, Optional<String>>> attributes,
      Optional<SharedAwsSaasProduct> awsSaasProduct,
      Optional<List<SharedAwsSnsSubscription>> awsSnsSubscriptions,
      Optional<AzureProduct> azureProduct, Optional<List<SharedCommitDimension>> commits,
      Optional<String> currency, Optional<List<SharedMeteringDimension>> dimensions,
      Optional<String> eulaUrl, Optional<SharedGcpProduct> gcpProduct,
      Optional<String> refundCancelationPolicy, Optional<String> sellerNotes) {
    this.attributes = attributes;
    this.awsSaasProduct = awsSaasProduct;
    this.awsSnsSubscriptions = awsSnsSubscriptions;
    this.azureProduct = azureProduct;
    this.commits = commits;
    this.currency = currency;
    this.dimensions = dimensions;
    this.eulaUrl = eulaUrl;
    this.gcpProduct = gcpProduct;
    this.refundCancelationPolicy = refundCancelationPolicy;
    this.sellerNotes = sellerNotes;
  }

  @JsonProperty("attributes")
  public Optional<Map<String, Optional<String>>> getAttributes() {
    return attributes;
  }

  @JsonProperty("awsSaasProduct")
  public Optional<SharedAwsSaasProduct> getAwsSaasProduct() {
    return awsSaasProduct;
  }

  @JsonProperty("awsSnsSubscriptions")
  public Optional<List<SharedAwsSnsSubscription>> getAwsSnsSubscriptions() {
    return awsSnsSubscriptions;
  }

  @JsonProperty("azureProduct")
  public Optional<AzureProduct> getAzureProduct() {
    return azureProduct;
  }

  @JsonProperty("commits")
  public Optional<List<SharedCommitDimension>> getCommits() {
    return commits;
  }

  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  @JsonProperty("dimensions")
  public Optional<List<SharedMeteringDimension>> getDimensions() {
    return dimensions;
  }

  @JsonProperty("eulaUrl")
  public Optional<String> getEulaUrl() {
    return eulaUrl;
  }

  @JsonProperty("gcpProduct")
  public Optional<SharedGcpProduct> getGcpProduct() {
    return gcpProduct;
  }

  @JsonProperty("refundCancelationPolicy")
  public Optional<String> getRefundCancelationPolicy() {
    return refundCancelationPolicy;
  }

  @JsonProperty("sellerNotes")
  public Optional<String> getSellerNotes() {
    return sellerNotes;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedProductInfo && equalTo((SharedProductInfo) other);
  }

  private boolean equalTo(SharedProductInfo other) {
    return attributes.equals(other.attributes) && awsSaasProduct.equals(other.awsSaasProduct) && awsSnsSubscriptions.equals(other.awsSnsSubscriptions) && azureProduct.equals(other.azureProduct) && commits.equals(other.commits) && currency.equals(other.currency) && dimensions.equals(other.dimensions) && eulaUrl.equals(other.eulaUrl) && gcpProduct.equals(other.gcpProduct) && refundCancelationPolicy.equals(other.refundCancelationPolicy) && sellerNotes.equals(other.sellerNotes);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.attributes, this.awsSaasProduct, this.awsSnsSubscriptions, this.azureProduct, this.commits, this.currency, this.dimensions, this.eulaUrl, this.gcpProduct, this.refundCancelationPolicy, this.sellerNotes);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedProductInfo{" + "attributes: " + attributes + ", awsSaasProduct: " + awsSaasProduct + ", awsSnsSubscriptions: " + awsSnsSubscriptions + ", azureProduct: " + azureProduct + ", commits: " + commits + ", currency: " + currency + ", dimensions: " + dimensions + ", eulaUrl: " + eulaUrl + ", gcpProduct: " + gcpProduct + ", refundCancelationPolicy: " + refundCancelationPolicy + ", sellerNotes: " + sellerNotes + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Map<String, Optional<String>>> attributes = Optional.empty();

    private Optional<SharedAwsSaasProduct> awsSaasProduct = Optional.empty();

    private Optional<List<SharedAwsSnsSubscription>> awsSnsSubscriptions = Optional.empty();

    private Optional<AzureProduct> azureProduct = Optional.empty();

    private Optional<List<SharedCommitDimension>> commits = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<List<SharedMeteringDimension>> dimensions = Optional.empty();

    private Optional<String> eulaUrl = Optional.empty();

    private Optional<SharedGcpProduct> gcpProduct = Optional.empty();

    private Optional<String> refundCancelationPolicy = Optional.empty();

    private Optional<String> sellerNotes = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedProductInfo other) {
      attributes(other.getAttributes());
      awsSaasProduct(other.getAwsSaasProduct());
      awsSnsSubscriptions(other.getAwsSnsSubscriptions());
      azureProduct(other.getAzureProduct());
      commits(other.getCommits());
      currency(other.getCurrency());
      dimensions(other.getDimensions());
      eulaUrl(other.getEulaUrl());
      gcpProduct(other.getGcpProduct());
      refundCancelationPolicy(other.getRefundCancelationPolicy());
      sellerNotes(other.getSellerNotes());
      return this;
    }

    @JsonSetter(
        value = "attributes",
        nulls = Nulls.SKIP
    )
    public Builder attributes(Optional<Map<String, Optional<String>>> attributes) {
      this.attributes = attributes;
      return this;
    }

    public Builder attributes(Map<String, Optional<String>> attributes) {
      this.attributes = Optional.of(attributes);
      return this;
    }

    @JsonSetter(
        value = "awsSaasProduct",
        nulls = Nulls.SKIP
    )
    public Builder awsSaasProduct(Optional<SharedAwsSaasProduct> awsSaasProduct) {
      this.awsSaasProduct = awsSaasProduct;
      return this;
    }

    public Builder awsSaasProduct(SharedAwsSaasProduct awsSaasProduct) {
      this.awsSaasProduct = Optional.of(awsSaasProduct);
      return this;
    }

    @JsonSetter(
        value = "awsSnsSubscriptions",
        nulls = Nulls.SKIP
    )
    public Builder awsSnsSubscriptions(
        Optional<List<SharedAwsSnsSubscription>> awsSnsSubscriptions) {
      this.awsSnsSubscriptions = awsSnsSubscriptions;
      return this;
    }

    public Builder awsSnsSubscriptions(List<SharedAwsSnsSubscription> awsSnsSubscriptions) {
      this.awsSnsSubscriptions = Optional.of(awsSnsSubscriptions);
      return this;
    }

    @JsonSetter(
        value = "azureProduct",
        nulls = Nulls.SKIP
    )
    public Builder azureProduct(Optional<AzureProduct> azureProduct) {
      this.azureProduct = azureProduct;
      return this;
    }

    public Builder azureProduct(AzureProduct azureProduct) {
      this.azureProduct = Optional.of(azureProduct);
      return this;
    }

    @JsonSetter(
        value = "commits",
        nulls = Nulls.SKIP
    )
    public Builder commits(Optional<List<SharedCommitDimension>> commits) {
      this.commits = commits;
      return this;
    }

    public Builder commits(List<SharedCommitDimension> commits) {
      this.commits = Optional.of(commits);
      return this;
    }

    @JsonSetter(
        value = "currency",
        nulls = Nulls.SKIP
    )
    public Builder currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    public Builder currency(String currency) {
      this.currency = Optional.of(currency);
      return this;
    }

    @JsonSetter(
        value = "dimensions",
        nulls = Nulls.SKIP
    )
    public Builder dimensions(Optional<List<SharedMeteringDimension>> dimensions) {
      this.dimensions = dimensions;
      return this;
    }

    public Builder dimensions(List<SharedMeteringDimension> dimensions) {
      this.dimensions = Optional.of(dimensions);
      return this;
    }

    @JsonSetter(
        value = "eulaUrl",
        nulls = Nulls.SKIP
    )
    public Builder eulaUrl(Optional<String> eulaUrl) {
      this.eulaUrl = eulaUrl;
      return this;
    }

    public Builder eulaUrl(String eulaUrl) {
      this.eulaUrl = Optional.of(eulaUrl);
      return this;
    }

    @JsonSetter(
        value = "gcpProduct",
        nulls = Nulls.SKIP
    )
    public Builder gcpProduct(Optional<SharedGcpProduct> gcpProduct) {
      this.gcpProduct = gcpProduct;
      return this;
    }

    public Builder gcpProduct(SharedGcpProduct gcpProduct) {
      this.gcpProduct = Optional.of(gcpProduct);
      return this;
    }

    @JsonSetter(
        value = "refundCancelationPolicy",
        nulls = Nulls.SKIP
    )
    public Builder refundCancelationPolicy(Optional<String> refundCancelationPolicy) {
      this.refundCancelationPolicy = refundCancelationPolicy;
      return this;
    }

    public Builder refundCancelationPolicy(String refundCancelationPolicy) {
      this.refundCancelationPolicy = Optional.of(refundCancelationPolicy);
      return this;
    }

    @JsonSetter(
        value = "sellerNotes",
        nulls = Nulls.SKIP
    )
    public Builder sellerNotes(Optional<String> sellerNotes) {
      this.sellerNotes = sellerNotes;
      return this;
    }

    public Builder sellerNotes(String sellerNotes) {
      this.sellerNotes = Optional.of(sellerNotes);
      return this;
    }

    public SharedProductInfo build() {
      return new SharedProductInfo(attributes, awsSaasProduct, awsSnsSubscriptions, azureProduct, commits, currency, dimensions, eulaUrl, gcpProduct, refundCancelationPolicy, sellerNotes);
    }
  }
}
