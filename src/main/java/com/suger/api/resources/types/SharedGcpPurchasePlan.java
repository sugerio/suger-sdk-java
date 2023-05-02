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
    builder = SharedGcpPurchasePlan.Builder.class
)
public final class SharedGcpPurchasePlan {
  private final Optional<String> name;

  private final Optional<SharedGcpCommerceProducerPriceInfo> priceInfo;

  private final Optional<SharedGcpPurchasePlanPurchaseMode> purchaseMode;

  private final Optional<String> title;

  private int _cachedHashCode;

  SharedGcpPurchasePlan(Optional<String> name,
      Optional<SharedGcpCommerceProducerPriceInfo> priceInfo,
      Optional<SharedGcpPurchasePlanPurchaseMode> purchaseMode, Optional<String> title) {
    this.name = name;
    this.priceInfo = priceInfo;
    this.purchaseMode = purchaseMode;
    this.title = title;
  }

  /**
   * @return The Plan key.
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("priceInfo")
  public Optional<SharedGcpCommerceProducerPriceInfo> getPriceInfo() {
    return priceInfo;
  }

  @JsonProperty("purchaseMode")
  public Optional<SharedGcpPurchasePlanPurchaseMode> getPurchaseMode() {
    return purchaseMode;
  }

  /**
   * @return The Plan title
   */
  @JsonProperty("title")
  public Optional<String> getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpPurchasePlan && equalTo((SharedGcpPurchasePlan) other);
  }

  private boolean equalTo(SharedGcpPurchasePlan other) {
    return name.equals(other.name) && priceInfo.equals(other.priceInfo) && purchaseMode.equals(other.purchaseMode) && title.equals(other.title);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.priceInfo, this.purchaseMode, this.title);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpPurchasePlan{" + "name: " + name + ", priceInfo: " + priceInfo + ", purchaseMode: " + purchaseMode + ", title: " + title + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> name = Optional.empty();

    private Optional<SharedGcpCommerceProducerPriceInfo> priceInfo = Optional.empty();

    private Optional<SharedGcpPurchasePlanPurchaseMode> purchaseMode = Optional.empty();

    private Optional<String> title = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpPurchasePlan other) {
      name(other.getName());
      priceInfo(other.getPriceInfo());
      purchaseMode(other.getPurchaseMode());
      title(other.getTitle());
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
        value = "priceInfo",
        nulls = Nulls.SKIP
    )
    public Builder priceInfo(Optional<SharedGcpCommerceProducerPriceInfo> priceInfo) {
      this.priceInfo = priceInfo;
      return this;
    }

    public Builder priceInfo(SharedGcpCommerceProducerPriceInfo priceInfo) {
      this.priceInfo = Optional.of(priceInfo);
      return this;
    }

    @JsonSetter(
        value = "purchaseMode",
        nulls = Nulls.SKIP
    )
    public Builder purchaseMode(Optional<SharedGcpPurchasePlanPurchaseMode> purchaseMode) {
      this.purchaseMode = purchaseMode;
      return this;
    }

    public Builder purchaseMode(SharedGcpPurchasePlanPurchaseMode purchaseMode) {
      this.purchaseMode = Optional.of(purchaseMode);
      return this;
    }

    @JsonSetter(
        value = "title",
        nulls = Nulls.SKIP
    )
    public Builder title(Optional<String> title) {
      this.title = title;
      return this;
    }

    public Builder title(String title) {
      this.title = Optional.of(title);
      return this;
    }

    public SharedGcpPurchasePlan build() {
      return new SharedGcpPurchasePlan(name, priceInfo, purchaseMode, title);
    }
  }
}
