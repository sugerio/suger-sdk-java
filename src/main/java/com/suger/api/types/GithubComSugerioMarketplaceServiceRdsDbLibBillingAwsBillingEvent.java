package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent.Builder.class
)
public final class GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent {
  private final Optional<String> action;

  private final Optional<String> agreementId;

  private final Optional<Double> amount;

  private final Optional<Integer> balanceImpacting;

  private final Optional<String> bankTraceId;

  private final Optional<String> billingAddressId;

  private final Optional<String> brokerId;

  private final Optional<String> buyerId;

  private final Optional<String> currency;

  private final Optional<String> dataFeedProductId;

  private final Optional<String> disbursementBillingEventId;

  private final Optional<String> endUserAccountId;

  private final Optional<String> entitlementId;

  private final Optional<String> fromAccountId;

  private final Optional<String> id;

  private final Optional<SqlNullTime> insertDate;

  private final Optional<SqlNullTime> invoiceDate;

  private final Optional<String> invoiceId;

  private final Optional<String> offerId;

  private final Optional<String> organizationId;

  private final Optional<String> parentBillingEventId;

  private final Optional<SqlNullTime> paymentDueDate;

  private final Optional<String> productId;

  private final Optional<String> toAccountId;

  private final Optional<String> transactionReferenceId;

  private final Optional<String> transactionType;

  private final Optional<SqlNullTime> usagePeriodEndDate;

  private final Optional<SqlNullTime> usagePeriodStartDate;

  private int _cachedHashCode;

  GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent(Optional<String> action,
      Optional<String> agreementId, Optional<Double> amount, Optional<Integer> balanceImpacting,
      Optional<String> bankTraceId, Optional<String> billingAddressId, Optional<String> brokerId,
      Optional<String> buyerId, Optional<String> currency, Optional<String> dataFeedProductId,
      Optional<String> disbursementBillingEventId, Optional<String> endUserAccountId,
      Optional<String> entitlementId, Optional<String> fromAccountId, Optional<String> id,
      Optional<SqlNullTime> insertDate, Optional<SqlNullTime> invoiceDate,
      Optional<String> invoiceId, Optional<String> offerId, Optional<String> organizationId,
      Optional<String> parentBillingEventId, Optional<SqlNullTime> paymentDueDate,
      Optional<String> productId, Optional<String> toAccountId,
      Optional<String> transactionReferenceId, Optional<String> transactionType,
      Optional<SqlNullTime> usagePeriodEndDate, Optional<SqlNullTime> usagePeriodStartDate) {
    this.action = action;
    this.agreementId = agreementId;
    this.amount = amount;
    this.balanceImpacting = balanceImpacting;
    this.bankTraceId = bankTraceId;
    this.billingAddressId = billingAddressId;
    this.brokerId = brokerId;
    this.buyerId = buyerId;
    this.currency = currency;
    this.dataFeedProductId = dataFeedProductId;
    this.disbursementBillingEventId = disbursementBillingEventId;
    this.endUserAccountId = endUserAccountId;
    this.entitlementId = entitlementId;
    this.fromAccountId = fromAccountId;
    this.id = id;
    this.insertDate = insertDate;
    this.invoiceDate = invoiceDate;
    this.invoiceId = invoiceId;
    this.offerId = offerId;
    this.organizationId = organizationId;
    this.parentBillingEventId = parentBillingEventId;
    this.paymentDueDate = paymentDueDate;
    this.productId = productId;
    this.toAccountId = toAccountId;
    this.transactionReferenceId = transactionReferenceId;
    this.transactionType = transactionType;
    this.usagePeriodEndDate = usagePeriodEndDate;
    this.usagePeriodStartDate = usagePeriodStartDate;
  }

  @JsonProperty("action")
  public Optional<String> getAction() {
    return action;
  }

  @JsonProperty("agreementID")
  public Optional<String> getAgreementId() {
    return agreementId;
  }

  @JsonProperty("amount")
  public Optional<Double> getAmount() {
    return amount;
  }

  @JsonProperty("balanceImpacting")
  public Optional<Integer> getBalanceImpacting() {
    return balanceImpacting;
  }

  @JsonProperty("bankTraceID")
  public Optional<String> getBankTraceId() {
    return bankTraceId;
  }

  @JsonProperty("billingAddressID")
  public Optional<String> getBillingAddressId() {
    return billingAddressId;
  }

  @JsonProperty("brokerID")
  public Optional<String> getBrokerId() {
    return brokerId;
  }

  @JsonProperty("buyerID")
  public Optional<String> getBuyerId() {
    return buyerId;
  }

  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  @JsonProperty("dataFeedProductID")
  public Optional<String> getDataFeedProductId() {
    return dataFeedProductId;
  }

  @JsonProperty("disbursementBillingEventID")
  public Optional<String> getDisbursementBillingEventId() {
    return disbursementBillingEventId;
  }

  @JsonProperty("endUserAccountID")
  public Optional<String> getEndUserAccountId() {
    return endUserAccountId;
  }

  @JsonProperty("entitlementID")
  public Optional<String> getEntitlementId() {
    return entitlementId;
  }

  @JsonProperty("fromAccountID")
  public Optional<String> getFromAccountId() {
    return fromAccountId;
  }

  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("insertDate")
  public Optional<SqlNullTime> getInsertDate() {
    return insertDate;
  }

  @JsonProperty("invoiceDate")
  public Optional<SqlNullTime> getInvoiceDate() {
    return invoiceDate;
  }

  @JsonProperty("invoiceID")
  public Optional<String> getInvoiceId() {
    return invoiceId;
  }

  @JsonProperty("offerID")
  public Optional<String> getOfferId() {
    return offerId;
  }

  @JsonProperty("organizationID")
  public Optional<String> getOrganizationId() {
    return organizationId;
  }

  @JsonProperty("parentBillingEventID")
  public Optional<String> getParentBillingEventId() {
    return parentBillingEventId;
  }

  @JsonProperty("paymentDueDate")
  public Optional<SqlNullTime> getPaymentDueDate() {
    return paymentDueDate;
  }

  @JsonProperty("productID")
  public Optional<String> getProductId() {
    return productId;
  }

  @JsonProperty("toAccountID")
  public Optional<String> getToAccountId() {
    return toAccountId;
  }

  @JsonProperty("transactionReferenceID")
  public Optional<String> getTransactionReferenceId() {
    return transactionReferenceId;
  }

  @JsonProperty("transactionType")
  public Optional<String> getTransactionType() {
    return transactionType;
  }

  @JsonProperty("usagePeriodEndDate")
  public Optional<SqlNullTime> getUsagePeriodEndDate() {
    return usagePeriodEndDate;
  }

  @JsonProperty("usagePeriodStartDate")
  public Optional<SqlNullTime> getUsagePeriodStartDate() {
    return usagePeriodStartDate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent && equalTo((GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent) other);
  }

  private boolean equalTo(GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent other) {
    return action.equals(other.action) && agreementId.equals(other.agreementId) && amount.equals(other.amount) && balanceImpacting.equals(other.balanceImpacting) && bankTraceId.equals(other.bankTraceId) && billingAddressId.equals(other.billingAddressId) && brokerId.equals(other.brokerId) && buyerId.equals(other.buyerId) && currency.equals(other.currency) && dataFeedProductId.equals(other.dataFeedProductId) && disbursementBillingEventId.equals(other.disbursementBillingEventId) && endUserAccountId.equals(other.endUserAccountId) && entitlementId.equals(other.entitlementId) && fromAccountId.equals(other.fromAccountId) && id.equals(other.id) && insertDate.equals(other.insertDate) && invoiceDate.equals(other.invoiceDate) && invoiceId.equals(other.invoiceId) && offerId.equals(other.offerId) && organizationId.equals(other.organizationId) && parentBillingEventId.equals(other.parentBillingEventId) && paymentDueDate.equals(other.paymentDueDate) && productId.equals(other.productId) && toAccountId.equals(other.toAccountId) && transactionReferenceId.equals(other.transactionReferenceId) && transactionType.equals(other.transactionType) && usagePeriodEndDate.equals(other.usagePeriodEndDate) && usagePeriodStartDate.equals(other.usagePeriodStartDate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.action, this.agreementId, this.amount, this.balanceImpacting, this.bankTraceId, this.billingAddressId, this.brokerId, this.buyerId, this.currency, this.dataFeedProductId, this.disbursementBillingEventId, this.endUserAccountId, this.entitlementId, this.fromAccountId, this.id, this.insertDate, this.invoiceDate, this.invoiceId, this.offerId, this.organizationId, this.parentBillingEventId, this.paymentDueDate, this.productId, this.toAccountId, this.transactionReferenceId, this.transactionType, this.usagePeriodEndDate, this.usagePeriodStartDate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent{" + "action: " + action + ", agreementId: " + agreementId + ", amount: " + amount + ", balanceImpacting: " + balanceImpacting + ", bankTraceId: " + bankTraceId + ", billingAddressId: " + billingAddressId + ", brokerId: " + brokerId + ", buyerId: " + buyerId + ", currency: " + currency + ", dataFeedProductId: " + dataFeedProductId + ", disbursementBillingEventId: " + disbursementBillingEventId + ", endUserAccountId: " + endUserAccountId + ", entitlementId: " + entitlementId + ", fromAccountId: " + fromAccountId + ", id: " + id + ", insertDate: " + insertDate + ", invoiceDate: " + invoiceDate + ", invoiceId: " + invoiceId + ", offerId: " + offerId + ", organizationId: " + organizationId + ", parentBillingEventId: " + parentBillingEventId + ", paymentDueDate: " + paymentDueDate + ", productId: " + productId + ", toAccountId: " + toAccountId + ", transactionReferenceId: " + transactionReferenceId + ", transactionType: " + transactionType + ", usagePeriodEndDate: " + usagePeriodEndDate + ", usagePeriodStartDate: " + usagePeriodStartDate + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> action = Optional.empty();

    private Optional<String> agreementId = Optional.empty();

    private Optional<Double> amount = Optional.empty();

    private Optional<Integer> balanceImpacting = Optional.empty();

    private Optional<String> bankTraceId = Optional.empty();

    private Optional<String> billingAddressId = Optional.empty();

    private Optional<String> brokerId = Optional.empty();

    private Optional<String> buyerId = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<String> dataFeedProductId = Optional.empty();

    private Optional<String> disbursementBillingEventId = Optional.empty();

    private Optional<String> endUserAccountId = Optional.empty();

    private Optional<String> entitlementId = Optional.empty();

    private Optional<String> fromAccountId = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<SqlNullTime> insertDate = Optional.empty();

    private Optional<SqlNullTime> invoiceDate = Optional.empty();

    private Optional<String> invoiceId = Optional.empty();

    private Optional<String> offerId = Optional.empty();

    private Optional<String> organizationId = Optional.empty();

    private Optional<String> parentBillingEventId = Optional.empty();

    private Optional<SqlNullTime> paymentDueDate = Optional.empty();

    private Optional<String> productId = Optional.empty();

    private Optional<String> toAccountId = Optional.empty();

    private Optional<String> transactionReferenceId = Optional.empty();

    private Optional<String> transactionType = Optional.empty();

    private Optional<SqlNullTime> usagePeriodEndDate = Optional.empty();

    private Optional<SqlNullTime> usagePeriodStartDate = Optional.empty();

    private Builder() {
    }

    public Builder from(GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent other) {
      action(other.getAction());
      agreementId(other.getAgreementId());
      amount(other.getAmount());
      balanceImpacting(other.getBalanceImpacting());
      bankTraceId(other.getBankTraceId());
      billingAddressId(other.getBillingAddressId());
      brokerId(other.getBrokerId());
      buyerId(other.getBuyerId());
      currency(other.getCurrency());
      dataFeedProductId(other.getDataFeedProductId());
      disbursementBillingEventId(other.getDisbursementBillingEventId());
      endUserAccountId(other.getEndUserAccountId());
      entitlementId(other.getEntitlementId());
      fromAccountId(other.getFromAccountId());
      id(other.getId());
      insertDate(other.getInsertDate());
      invoiceDate(other.getInvoiceDate());
      invoiceId(other.getInvoiceId());
      offerId(other.getOfferId());
      organizationId(other.getOrganizationId());
      parentBillingEventId(other.getParentBillingEventId());
      paymentDueDate(other.getPaymentDueDate());
      productId(other.getProductId());
      toAccountId(other.getToAccountId());
      transactionReferenceId(other.getTransactionReferenceId());
      transactionType(other.getTransactionType());
      usagePeriodEndDate(other.getUsagePeriodEndDate());
      usagePeriodStartDate(other.getUsagePeriodStartDate());
      return this;
    }

    @JsonSetter(
        value = "action",
        nulls = Nulls.SKIP
    )
    public Builder action(Optional<String> action) {
      this.action = action;
      return this;
    }

    public Builder action(String action) {
      this.action = Optional.of(action);
      return this;
    }

    @JsonSetter(
        value = "agreementID",
        nulls = Nulls.SKIP
    )
    public Builder agreementId(Optional<String> agreementId) {
      this.agreementId = agreementId;
      return this;
    }

    public Builder agreementId(String agreementId) {
      this.agreementId = Optional.of(agreementId);
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
        value = "balanceImpacting",
        nulls = Nulls.SKIP
    )
    public Builder balanceImpacting(Optional<Integer> balanceImpacting) {
      this.balanceImpacting = balanceImpacting;
      return this;
    }

    public Builder balanceImpacting(Integer balanceImpacting) {
      this.balanceImpacting = Optional.of(balanceImpacting);
      return this;
    }

    @JsonSetter(
        value = "bankTraceID",
        nulls = Nulls.SKIP
    )
    public Builder bankTraceId(Optional<String> bankTraceId) {
      this.bankTraceId = bankTraceId;
      return this;
    }

    public Builder bankTraceId(String bankTraceId) {
      this.bankTraceId = Optional.of(bankTraceId);
      return this;
    }

    @JsonSetter(
        value = "billingAddressID",
        nulls = Nulls.SKIP
    )
    public Builder billingAddressId(Optional<String> billingAddressId) {
      this.billingAddressId = billingAddressId;
      return this;
    }

    public Builder billingAddressId(String billingAddressId) {
      this.billingAddressId = Optional.of(billingAddressId);
      return this;
    }

    @JsonSetter(
        value = "brokerID",
        nulls = Nulls.SKIP
    )
    public Builder brokerId(Optional<String> brokerId) {
      this.brokerId = brokerId;
      return this;
    }

    public Builder brokerId(String brokerId) {
      this.brokerId = Optional.of(brokerId);
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
        value = "dataFeedProductID",
        nulls = Nulls.SKIP
    )
    public Builder dataFeedProductId(Optional<String> dataFeedProductId) {
      this.dataFeedProductId = dataFeedProductId;
      return this;
    }

    public Builder dataFeedProductId(String dataFeedProductId) {
      this.dataFeedProductId = Optional.of(dataFeedProductId);
      return this;
    }

    @JsonSetter(
        value = "disbursementBillingEventID",
        nulls = Nulls.SKIP
    )
    public Builder disbursementBillingEventId(Optional<String> disbursementBillingEventId) {
      this.disbursementBillingEventId = disbursementBillingEventId;
      return this;
    }

    public Builder disbursementBillingEventId(String disbursementBillingEventId) {
      this.disbursementBillingEventId = Optional.of(disbursementBillingEventId);
      return this;
    }

    @JsonSetter(
        value = "endUserAccountID",
        nulls = Nulls.SKIP
    )
    public Builder endUserAccountId(Optional<String> endUserAccountId) {
      this.endUserAccountId = endUserAccountId;
      return this;
    }

    public Builder endUserAccountId(String endUserAccountId) {
      this.endUserAccountId = Optional.of(endUserAccountId);
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
        value = "fromAccountID",
        nulls = Nulls.SKIP
    )
    public Builder fromAccountId(Optional<String> fromAccountId) {
      this.fromAccountId = fromAccountId;
      return this;
    }

    public Builder fromAccountId(String fromAccountId) {
      this.fromAccountId = Optional.of(fromAccountId);
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
        value = "insertDate",
        nulls = Nulls.SKIP
    )
    public Builder insertDate(Optional<SqlNullTime> insertDate) {
      this.insertDate = insertDate;
      return this;
    }

    public Builder insertDate(SqlNullTime insertDate) {
      this.insertDate = Optional.of(insertDate);
      return this;
    }

    @JsonSetter(
        value = "invoiceDate",
        nulls = Nulls.SKIP
    )
    public Builder invoiceDate(Optional<SqlNullTime> invoiceDate) {
      this.invoiceDate = invoiceDate;
      return this;
    }

    public Builder invoiceDate(SqlNullTime invoiceDate) {
      this.invoiceDate = Optional.of(invoiceDate);
      return this;
    }

    @JsonSetter(
        value = "invoiceID",
        nulls = Nulls.SKIP
    )
    public Builder invoiceId(Optional<String> invoiceId) {
      this.invoiceId = invoiceId;
      return this;
    }

    public Builder invoiceId(String invoiceId) {
      this.invoiceId = Optional.of(invoiceId);
      return this;
    }

    @JsonSetter(
        value = "offerID",
        nulls = Nulls.SKIP
    )
    public Builder offerId(Optional<String> offerId) {
      this.offerId = offerId;
      return this;
    }

    public Builder offerId(String offerId) {
      this.offerId = Optional.of(offerId);
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
        value = "parentBillingEventID",
        nulls = Nulls.SKIP
    )
    public Builder parentBillingEventId(Optional<String> parentBillingEventId) {
      this.parentBillingEventId = parentBillingEventId;
      return this;
    }

    public Builder parentBillingEventId(String parentBillingEventId) {
      this.parentBillingEventId = Optional.of(parentBillingEventId);
      return this;
    }

    @JsonSetter(
        value = "paymentDueDate",
        nulls = Nulls.SKIP
    )
    public Builder paymentDueDate(Optional<SqlNullTime> paymentDueDate) {
      this.paymentDueDate = paymentDueDate;
      return this;
    }

    public Builder paymentDueDate(SqlNullTime paymentDueDate) {
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
        value = "toAccountID",
        nulls = Nulls.SKIP
    )
    public Builder toAccountId(Optional<String> toAccountId) {
      this.toAccountId = toAccountId;
      return this;
    }

    public Builder toAccountId(String toAccountId) {
      this.toAccountId = Optional.of(toAccountId);
      return this;
    }

    @JsonSetter(
        value = "transactionReferenceID",
        nulls = Nulls.SKIP
    )
    public Builder transactionReferenceId(Optional<String> transactionReferenceId) {
      this.transactionReferenceId = transactionReferenceId;
      return this;
    }

    public Builder transactionReferenceId(String transactionReferenceId) {
      this.transactionReferenceId = Optional.of(transactionReferenceId);
      return this;
    }

    @JsonSetter(
        value = "transactionType",
        nulls = Nulls.SKIP
    )
    public Builder transactionType(Optional<String> transactionType) {
      this.transactionType = transactionType;
      return this;
    }

    public Builder transactionType(String transactionType) {
      this.transactionType = Optional.of(transactionType);
      return this;
    }

    @JsonSetter(
        value = "usagePeriodEndDate",
        nulls = Nulls.SKIP
    )
    public Builder usagePeriodEndDate(Optional<SqlNullTime> usagePeriodEndDate) {
      this.usagePeriodEndDate = usagePeriodEndDate;
      return this;
    }

    public Builder usagePeriodEndDate(SqlNullTime usagePeriodEndDate) {
      this.usagePeriodEndDate = Optional.of(usagePeriodEndDate);
      return this;
    }

    @JsonSetter(
        value = "usagePeriodStartDate",
        nulls = Nulls.SKIP
    )
    public Builder usagePeriodStartDate(Optional<SqlNullTime> usagePeriodStartDate) {
      this.usagePeriodStartDate = usagePeriodStartDate;
      return this;
    }

    public Builder usagePeriodStartDate(SqlNullTime usagePeriodStartDate) {
      this.usagePeriodStartDate = Optional.of(usagePeriodStartDate);
      return this;
    }

    public GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent build() {
      return new GithubComSugerioMarketplaceServiceRdsDbLibBillingAwsBillingEvent(action, agreementId, amount, balanceImpacting, bankTraceId, billingAddressId, brokerId, buyerId, currency, dataFeedProductId, disbursementBillingEventId, endUserAccountId, entitlementId, fromAccountId, id, insertDate, invoiceDate, invoiceId, offerId, organizationId, parentBillingEventId, paymentDueDate, productId, toAccountId, transactionReferenceId, transactionType, usagePeriodEndDate, usagePeriodStartDate);
    }
  }
}
