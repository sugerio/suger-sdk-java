package com.suger.api.resources.types;

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
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AzureMarketplacePrice.Builder.class
)
public final class AzureMarketplacePrice {
  private final Optional<String> currency;

  private final Optional<List<String>> markets;

  private final Optional<Double> price;

  private final Object prices;

  private int _cachedHashCode;

  AzureMarketplacePrice(Optional<String> currency, Optional<List<String>> markets,
      Optional<Double> price, Object prices) {
    this.currency = currency;
    this.markets = markets;
    this.price = price;
    this.prices = prices;
  }

  /**
   * @return ISO 4217 currency code
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  @JsonProperty("markets")
  public Optional<List<String>> getMarkets() {
    return markets;
  }

  /**
   * @return default 0
   */
  @JsonProperty("price")
  public Optional<Double> getPrice() {
    return price;
  }

  @JsonProperty("prices")
  public Object getPrices() {
    return prices;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AzureMarketplacePrice && equalTo((AzureMarketplacePrice) other);
  }

  private boolean equalTo(AzureMarketplacePrice other) {
    return currency.equals(other.currency) && markets.equals(other.markets) && price.equals(other.price) && prices.equals(other.prices);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.currency, this.markets, this.price, this.prices);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AzureMarketplacePrice{" + "currency: " + currency + ", markets: " + markets + ", price: " + price + ", prices: " + prices + "}";
  }

  public static PricesStage builder() {
    return new Builder();
  }

  public interface PricesStage {
    _FinalStage prices(Object prices);

    Builder from(AzureMarketplacePrice other);
  }

  public interface _FinalStage {
    AzureMarketplacePrice build();

    _FinalStage currency(Optional<String> currency);

    _FinalStage currency(String currency);

    _FinalStage markets(Optional<List<String>> markets);

    _FinalStage markets(List<String> markets);

    _FinalStage price(Optional<Double> price);

    _FinalStage price(Double price);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements PricesStage, _FinalStage {
    private Object prices;

    private Optional<Double> price = Optional.empty();

    private Optional<List<String>> markets = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(AzureMarketplacePrice other) {
      currency(other.getCurrency());
      markets(other.getMarkets());
      price(other.getPrice());
      prices(other.getPrices());
      return this;
    }

    @Override
    @JsonSetter("prices")
    public _FinalStage prices(Object prices) {
      this.prices = prices;
      return this;
    }

    /**
     * <p>default 0</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage price(Double price) {
      this.price = Optional.of(price);
      return this;
    }

    @Override
    @JsonSetter(
        value = "price",
        nulls = Nulls.SKIP
    )
    public _FinalStage price(Optional<Double> price) {
      this.price = price;
      return this;
    }

    @Override
    public _FinalStage markets(List<String> markets) {
      this.markets = Optional.of(markets);
      return this;
    }

    @Override
    @JsonSetter(
        value = "markets",
        nulls = Nulls.SKIP
    )
    public _FinalStage markets(Optional<List<String>> markets) {
      this.markets = markets;
      return this;
    }

    /**
     * <p>ISO 4217 currency code</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage currency(String currency) {
      this.currency = Optional.of(currency);
      return this;
    }

    @Override
    @JsonSetter(
        value = "currency",
        nulls = Nulls.SKIP
    )
    public _FinalStage currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    @Override
    public AzureMarketplacePrice build() {
      return new AzureMarketplacePrice(currency, markets, price, prices);
    }
  }
}
