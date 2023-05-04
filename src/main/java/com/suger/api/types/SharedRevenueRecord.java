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
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SharedRevenueRecord.Builder.class
)
public final class SharedRevenueRecord {
  private final Optional<Double> amount;

  private final Optional<String> buyerId;

  private final Optional<Double> collectableAmount;

  private final Optional<String> currency;

  private final Optional<String> date;

  private final Optional<Double> disburseAmount;

  private final Optional<String> disburseDate;

  private final Optional<String> entitlementId;

  private final Optional<String> id;

  private final Optional<SharedRevenueRecordInfo> info;

  private final Optional<Double> invoiceAmount;

  private final Optional<String> invoiceDate;

  private final Optional<String> organizationId;

  private final Optional<String> partner;

  private final Optional<String> paymentDueDate;

  private final Optional<String> productId;

  private final Optional<Double> refundDisburseAmount;

  private final Optional<String> refundDisburseDate;

  private final Optional<Double> refundInvoiceAmount;

  private final Optional<String> refundInvoiceDate;

  private final Optional<Double> taxAmount;

  private int _cachedHashCode;

  SharedRevenueRecord(Optional<Double> amount, Optional<String> buyerId,
      Optional<Double> collectableAmount, Optional<String> currency, Optional<String> date,
      Optional<Double> disburseAmount, Optional<String> disburseDate,
      Optional<String> entitlementId, Optional<String> id, Optional<SharedRevenueRecordInfo> info,
      Optional<Double> invoiceAmount, Optional<String> invoiceDate, Optional<String> organizationId,
      Optional<String> partner, Optional<String> paymentDueDate, Optional<String> productId,
      Optional<Double> refundDisburseAmount, Optional<String> refundDisburseDate,
      Optional<Double> refundInvoiceAmount, Optional<String> refundInvoiceDate,
      Optional<Double> taxAmount) {
    this.amount = amount;
    this.buyerId = buyerId;
    this.collectableAmount = collectableAmount;
    this.currency = currency;
    this.date = date;
    this.disburseAmount = disburseAmount;
    this.disburseDate = disburseDate;
    this.entitlementId = entitlementId;
    this.id = id;
    this.info = info;
    this.invoiceAmount = invoiceAmount;
    this.invoiceDate = invoiceDate;
    this.organizationId = organizationId;
    this.partner = partner;
    this.paymentDueDate = paymentDueDate;
    this.productId = productId;
    this.refundDisburseAmount = refundDisburseAmount;
    this.refundDisburseDate = refundDisburseDate;
    this.refundInvoiceAmount = refundInvoiceAmount;
    this.refundInvoiceDate = refundInvoiceDate;
    this.taxAmount = taxAmount;
  }

  /**
   * @return The revenue amount for the revenue report
   */
  @JsonProperty("amount")
  public Optional<Double> getAmount() {
    return amount;
  }

  @JsonProperty("buyerID")
  public Optional<String> getBuyerId() {
    return buyerId;
  }

  /**
   * @return The revenue amount that the seller/ISV can collect.
   */
  @JsonProperty("collectableAmount")
  public Optional<Double> getCollectableAmount() {
    return collectableAmount;
  }

  /**
   * @return The currency of the revenue in ISO 4217 format, such as &quot;USD&quot;.
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  /**
   * @return The date for the revenue report
   */
  @JsonProperty("date")
  public Optional<String> getDate() {
    return date;
  }

  @JsonProperty("disburseAmount")
  public Optional<Double> getDisburseAmount() {
    return disburseAmount;
  }

  @JsonProperty("disburseDate")
  public Optional<String> getDisburseDate() {
    return disburseDate;
  }

  @JsonProperty("entitlementID")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("info")
  public Optional<SharedRevenueRecordInfo> getInfo() {
    return info;
  }

  @JsonProperty("invoiceAmount")
  public Optional<Double> getInvoiceAmount() {
    return invoiceAmount;
  }

  @JsonProperty("invoiceDate")
  public Optional<String> getInvoiceDate() {
    return invoiceDate;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("partner")
  public Optional<String> getPartner() {
    return partner;
  }

  @JsonProperty("paymentDueDate")
  public Optional<String> getPaymentDueDate() {
    return paymentDueDate;
  }

  @JsonProperty("productID")
  public Optional<String> getProductId() {
    return productId;
  }

  @JsonProperty("refundDisburseAmount")
  public Optional<Double> getRefundDisburseAmount() {
    return refundDisburseAmount;
  }

  @JsonProperty("refundDisburseDate")
  public Optional<String> getRefundDisburseDate() {
    return refundDisburseDate;
  }

  @JsonProperty("refundInvoiceAmount")
  public Optional<Double> getRefundInvoiceAmount() {
    return refundInvoiceAmount;
  }

  @JsonProperty("refundInvoiceDate")
  public Optional<String> getRefundInvoiceDate() {
    return refundInvoiceDate;
  }

  @JsonProperty("taxAmount")
  public Optional<Double> getTaxAmount() {
    return taxAmount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedRevenueRecord && equalTo((SharedRevenueRecord) other);
  }

  private boolean equalTo(SharedRevenueRecord other) {
    return amount.equals(other.amount) && buyerId.equals(other.buyerId) && collectableAmount.equals(other.collectableAmount) && currency.equals(other.currency) && date.equals(other.date) && disburseAmount.equals(other.disburseAmount) && disburseDate.equals(other.disburseDate) && entitlementId.equals(other.entitlementId) && id.equals(other.id) && info.equals(other.info) && invoiceAmount.equals(other.invoiceAmount) && invoiceDate.equals(other.invoiceDate) && organizationId.equals(other.organizationId) && partner.equals(other.partner) && paymentDueDate.equals(other.paymentDueDate) && productId.equals(other.productId) && refundDisburseAmount.equals(other.refundDisburseAmount) && refundDisburseDate.equals(other.refundDisburseDate) && refundInvoiceAmount.equals(other.refundInvoiceAmount) && refundInvoiceDate.equals(other.refundInvoiceDate) && taxAmount.equals(other.taxAmount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.amount, this.buyerId, this.collectableAmount, this.currency, this.date, this.disburseAmount, this.disburseDate, this.entitlementId, this.id, this.info, this.invoiceAmount, this.invoiceDate, this.organizationId, this.partner, this.paymentDueDate, this.productId, this.refundDisburseAmount, this.refundDisburseDate, this.refundInvoiceAmount, this.refundInvoiceDate, this.taxAmount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedRevenueRecord{" + "amount: " + amount + ", buyerId: " + buyerId + ", collectableAmount: " + collectableAmount + ", currency: " + currency + ", date: " + date + ", disburseAmount: " + disburseAmount + ", disburseDate: " + disburseDate + ", entitlementId: " + entitlementId + ", id: " + id + ", info: " + info + ", invoiceAmount: " + invoiceAmount + ", invoiceDate: " + invoiceDate + ", organizationId: " + organizationId + ", partner: " + partner + ", paymentDueDate: " + paymentDueDate + ", productId: " + productId + ", refundDisburseAmount: " + refundDisburseAmount + ", refundDisburseDate: " + refundDisburseDate + ", refundInvoiceAmount: " + refundInvoiceAmount + ", refundInvoiceDate: " + refundInvoiceDate + ", taxAmount: " + taxAmount + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Double> amount = Optional.empty();

    private Optional<String> buyerId = Optional.empty();

    private Optional<Double> collectableAmount = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<String> date = Optional.empty();

    private Optional<Double> disburseAmount = Optional.empty();

    private Optional<String> disburseDate = Optional.empty();

    private Optional<String> entitlementId = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<SharedRevenueRecordInfo> info = Optional.empty();

    private Optional<Double> invoiceAmount = Optional.empty();

    private Optional<String> invoiceDate = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<String> partner = Optional.empty();

    private Optional<String> paymentDueDate = Optional.empty();

    private Optional<String> productId = Optional.empty();

    private Optional<Double> refundDisburseAmount = Optional.empty();

    private Optional<String> refundDisburseDate = Optional.empty();

    private Optional<Double> refundInvoiceAmount = Optional.empty();

    private Optional<String> refundInvoiceDate = Optional.empty();

    private Optional<Double> taxAmount = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedRevenueRecord other) {
      amount(other.getAmount());
      buyerId(other.getBuyerId());
      collectableAmount(other.getCollectableAmount());
      currency(other.getCurrency());
      date(other.getDate());
      disburseAmount(other.getDisburseAmount());
      disburseDate(other.getDisburseDate());
      entitlementId(other.getEntitlementId());
      id(other.getId());
      info(other.getInfo());
      invoiceAmount(other.getInvoiceAmount());
      invoiceDate(other.getInvoiceDate());
      organizationId(other.getOrganizationId());
      partner(other.getPartner());
      paymentDueDate(other.getPaymentDueDate());
      productId(other.getProductId());
      refundDisburseAmount(other.getRefundDisburseAmount());
      refundDisburseDate(other.getRefundDisburseDate());
      refundInvoiceAmount(other.getRefundInvoiceAmount());
      refundInvoiceDate(other.getRefundInvoiceDate());
      taxAmount(other.getTaxAmount());
      return this;
    }

    @JsonSetter(
        value = "amount",
        nulls = Nulls.SKIP
    )
    public Builder amount(Optional<Double> amount) {
      this.amount = amount;
      return this;
    }

    public Builder amount(Double amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    @JsonSetter(
        value = "buyerID",
        nulls = Nulls.SKIP
    )
    public Builder buyerId(Optional<String> buyerId) {
      this.buyerId = buyerId;
      return this;
    }

    public Builder buyerId(String buyerId) {
      this.buyerId = Optional.of(buyerId);
      return this;
    }

    @JsonSetter(
        value = "collectableAmount",
        nulls = Nulls.SKIP
    )
    public Builder collectableAmount(Optional<Double> collectableAmount) {
      this.collectableAmount = collectableAmount;
      return this;
    }

    public Builder collectableAmount(Double collectableAmount) {
      this.collectableAmount = Optional.of(collectableAmount);
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
        value = "date",
        nulls = Nulls.SKIP
    )
    public Builder date(Optional<String> date) {
      this.date = date;
      return this;
    }

    public Builder date(String date) {
      this.date = Optional.of(date);
      return this;
    }

    @JsonSetter(
        value = "disburseAmount",
        nulls = Nulls.SKIP
    )
    public Builder disburseAmount(Optional<Double> disburseAmount) {
      this.disburseAmount = disburseAmount;
      return this;
    }

    public Builder disburseAmount(Double disburseAmount) {
      this.disburseAmount = Optional.of(disburseAmount);
      return this;
    }

    @JsonSetter(
        value = "disburseDate",
        nulls = Nulls.SKIP
    )
    public Builder disburseDate(Optional<String> disburseDate) {
      this.disburseDate = disburseDate;
      return this;
    }

    public Builder disburseDate(String disburseDate) {
      this.disburseDate = Optional.of(disburseDate);
      return this;
    }

    @JsonSetter(
        value = "entitlementID",
        nulls = Nulls.SKIP
    )
    public Builder entitlementId(Optional<String> entitlementId) {
      this.entitlementId = entitlementId;
      return this;
    }

    public Builder entitlementId(String entitlementId) {
      this.entitlementId = Optional.of(entitlementId);
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
        value = "info",
        nulls = Nulls.SKIP
    )
    public Builder info(Optional<SharedRevenueRecordInfo> info) {
      this.info = info;
      return this;
    }

    public Builder info(SharedRevenueRecordInfo info) {
      this.info = Optional.of(info);
      return this;
    }

    @JsonSetter(
        value = "invoiceAmount",
        nulls = Nulls.SKIP
    )
    public Builder invoiceAmount(Optional<Double> invoiceAmount) {
      this.invoiceAmount = invoiceAmount;
      return this;
    }

    public Builder invoiceAmount(Double invoiceAmount) {
      this.invoiceAmount = Optional.of(invoiceAmount);
      return this;
    }

    @JsonSetter(
        value = "invoiceDate",
        nulls = Nulls.SKIP
    )
    public Builder invoiceDate(Optional<String> invoiceDate) {
      this.invoiceDate = invoiceDate;
      return this;
    }

    public Builder invoiceDate(String invoiceDate) {
      this.invoiceDate = Optional.of(invoiceDate);
      return this;
    }

    @JsonSetter(
        value = "organizationID",
        nulls = Nulls.SKIP
    )
    public Builder organizationId(Optional<String> organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    public Builder organizationId(String organizationId) {
      this.organizationId = Optional.of(organizationId);
      return this;
    }

    @JsonSetter(
        value = "partner",
        nulls = Nulls.SKIP
    )
    public Builder partner(Optional<String> partner) {
      this.partner = partner;
      return this;
    }

    public Builder partner(String partner) {
      this.partner = Optional.of(partner);
      return this;
    }

    @JsonSetter(
        value = "paymentDueDate",
        nulls = Nulls.SKIP
    )
    public Builder paymentDueDate(Optional<String> paymentDueDate) {
      this.paymentDueDate = paymentDueDate;
      return this;
    }

    public Builder paymentDueDate(String paymentDueDate) {
      this.paymentDueDate = Optional.of(paymentDueDate);
      return this;
    }

    @JsonSetter(
        value = "productID",
        nulls = Nulls.SKIP
    )
    public Builder productId(Optional<String> productId) {
      this.productId = productId;
      return this;
    }

    public Builder productId(String productId) {
      this.productId = Optional.of(productId);
      return this;
    }

    @JsonSetter(
        value = "refundDisburseAmount",
        nulls = Nulls.SKIP
    )
    public Builder refundDisburseAmount(Optional<Double> refundDisburseAmount) {
      this.refundDisburseAmount = refundDisburseAmount;
      return this;
    }

    public Builder refundDisburseAmount(Double refundDisburseAmount) {
      this.refundDisburseAmount = Optional.of(refundDisburseAmount);
      return this;
    }

    @JsonSetter(
        value = "refundDisburseDate",
        nulls = Nulls.SKIP
    )
    public Builder refundDisburseDate(Optional<String> refundDisburseDate) {
      this.refundDisburseDate = refundDisburseDate;
      return this;
    }

    public Builder refundDisburseDate(String refundDisburseDate) {
      this.refundDisburseDate = Optional.of(refundDisburseDate);
      return this;
    }

    @JsonSetter(
        value = "refundInvoiceAmount",
        nulls = Nulls.SKIP
    )
    public Builder refundInvoiceAmount(Optional<Double> refundInvoiceAmount) {
      this.refundInvoiceAmount = refundInvoiceAmount;
      return this;
    }

    public Builder refundInvoiceAmount(Double refundInvoiceAmount) {
      this.refundInvoiceAmount = Optional.of(refundInvoiceAmount);
      return this;
    }

    @JsonSetter(
        value = "refundInvoiceDate",
        nulls = Nulls.SKIP
    )
    public Builder refundInvoiceDate(Optional<String> refundInvoiceDate) {
      this.refundInvoiceDate = refundInvoiceDate;
      return this;
    }

    public Builder refundInvoiceDate(String refundInvoiceDate) {
      this.refundInvoiceDate = Optional.of(refundInvoiceDate);
      return this;
    }

    @JsonSetter(
        value = "taxAmount",
        nulls = Nulls.SKIP
    )
    public Builder taxAmount(Optional<Double> taxAmount) {
      this.taxAmount = taxAmount;
      return this;
    }

    public Builder taxAmount(Double taxAmount) {
      this.taxAmount = Optional.of(taxAmount);
      return this;
    }

    public SharedRevenueRecord build() {
      return new SharedRevenueRecord(amount, buyerId, collectableAmount, currency, date, disburseAmount, disburseDate, entitlementId, id, info, invoiceAmount, invoiceDate, organizationId, partner, paymentDueDate, productId, refundDisburseAmount, refundDisburseDate, refundInvoiceAmount, refundInvoiceDate, taxAmount);
    }
  }
}
