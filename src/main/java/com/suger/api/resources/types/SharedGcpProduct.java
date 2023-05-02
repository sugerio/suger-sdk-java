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
    builder = SharedGcpProduct.Builder.class
)
public final class SharedGcpProduct {
  private final Optional<String> createTime;

  private final Optional<String> id;

  private final Optional<SharedGcpCommerceProducerListingSpec> listingSpec;

  private final Optional<SharedGcpProductMarketplace> marketplace;

  private final Optional<String> name;

  private final Optional<String> service;

  private final Optional<SharedGcpCommerceProducerServiceConfig> serviceConfig;

  private int _cachedHashCode;

  SharedGcpProduct(Optional<String> createTime, Optional<String> id,
      Optional<SharedGcpCommerceProducerListingSpec> listingSpec,
      Optional<SharedGcpProductMarketplace> marketplace, Optional<String> name,
      Optional<String> service, Optional<SharedGcpCommerceProducerServiceConfig> serviceConfig) {
    this.createTime = createTime;
    this.id = id;
    this.listingSpec = listingSpec;
    this.marketplace = marketplace;
    this.name = name;
    this.service = service;
    this.serviceConfig = serviceConfig;
  }

  @JsonProperty("createTime")
  public Optional<String> getCreateTime() {
    return createTime;
  }

  /**
   * @return Nullable, GCP Marketplace Product UUID
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("listingSpec")
  public Optional<SharedGcpCommerceProducerListingSpec> getListingSpec() {
    return listingSpec;
  }

  @JsonProperty("marketplace")
  public Optional<SharedGcpProductMarketplace> getMarketplace() {
    return marketplace;
  }

  /**
   * @return In format of &quot;projects/{project-number}/listings/{product-name}.endpoints.{provider-id}.cloud.goog&quot;
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return In format of &quot;services/{product-name}.endpoints.{provider-id}.cloud.goog&quot;
   */
  @JsonProperty("service")
  public Optional<String> getService() {
    return service;
  }

  @JsonProperty("serviceConfig")
  public Optional<SharedGcpCommerceProducerServiceConfig> getServiceConfig() {
    return serviceConfig;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SharedGcpProduct && equalTo((SharedGcpProduct) other);
  }

  private boolean equalTo(SharedGcpProduct other) {
    return createTime.equals(other.createTime) && id.equals(other.id) && listingSpec.equals(other.listingSpec) && marketplace.equals(other.marketplace) && name.equals(other.name) && service.equals(other.service) && serviceConfig.equals(other.serviceConfig);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.createTime, this.id, this.listingSpec, this.marketplace, this.name, this.service, this.serviceConfig);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SharedGcpProduct{" + "createTime: " + createTime + ", id: " + id + ", listingSpec: " + listingSpec + ", marketplace: " + marketplace + ", name: " + name + ", service: " + service + ", serviceConfig: " + serviceConfig + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> createTime = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<SharedGcpCommerceProducerListingSpec> listingSpec = Optional.empty();

    private Optional<SharedGcpProductMarketplace> marketplace = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> service = Optional.empty();

    private Optional<SharedGcpCommerceProducerServiceConfig> serviceConfig = Optional.empty();

    private Builder() {
    }

    public Builder from(SharedGcpProduct other) {
      createTime(other.getCreateTime());
      id(other.getId());
      listingSpec(other.getListingSpec());
      marketplace(other.getMarketplace());
      name(other.getName());
      service(other.getService());
      serviceConfig(other.getServiceConfig());
      return this;
    }

    @JsonSetter(
        value = "createTime",
        nulls = Nulls.SKIP
    )
    public Builder createTime(Optional<String> createTime) {
      this.createTime = createTime;
      return this;
    }

    public Builder createTime(String createTime) {
      this.createTime = Optional.of(createTime);
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
        value = "listingSpec",
        nulls = Nulls.SKIP
    )
    public Builder listingSpec(Optional<SharedGcpCommerceProducerListingSpec> listingSpec) {
      this.listingSpec = listingSpec;
      return this;
    }

    public Builder listingSpec(SharedGcpCommerceProducerListingSpec listingSpec) {
      this.listingSpec = Optional.of(listingSpec);
      return this;
    }

    @JsonSetter(
        value = "marketplace",
        nulls = Nulls.SKIP
    )
    public Builder marketplace(Optional<SharedGcpProductMarketplace> marketplace) {
      this.marketplace = marketplace;
      return this;
    }

    public Builder marketplace(SharedGcpProductMarketplace marketplace) {
      this.marketplace = Optional.of(marketplace);
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
        value = "service",
        nulls = Nulls.SKIP
    )
    public Builder service(Optional<String> service) {
      this.service = service;
      return this;
    }

    public Builder service(String service) {
      this.service = Optional.of(service);
      return this;
    }

    @JsonSetter(
        value = "serviceConfig",
        nulls = Nulls.SKIP
    )
    public Builder serviceConfig(Optional<SharedGcpCommerceProducerServiceConfig> serviceConfig) {
      this.serviceConfig = serviceConfig;
      return this;
    }

    public Builder serviceConfig(SharedGcpCommerceProducerServiceConfig serviceConfig) {
      this.serviceConfig = Optional.of(serviceConfig);
      return this;
    }

    public SharedGcpProduct build() {
      return new SharedGcpProduct(createTime, id, listingSpec, marketplace, name, service, serviceConfig);
    }
  }
}
