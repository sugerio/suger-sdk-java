package com.suger.api.resources.entitlement;

import com.fasterxml.jackson.core.type.TypeReference;
import com.suger.api.core.ClientOptions;
import com.suger.api.core.ObjectMappers;
import com.suger.api.resources.entitlement.requests.GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams;
import com.suger.api.resources.entitlement.requests.SharedAddEntitlementCreditParams;
import com.suger.api.types.ListEntitlementsByPartnerRequestPartner;
import com.suger.api.types.SharedAddEntitlementCreditResponse;
import com.suger.api.types.SharedWorkloadEntitlement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class EntitlementClientImpl implements EntitlementClient {
  private final ClientOptions clientOptions;

  public EntitlementClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public List<SharedWorkloadEntitlement> listEntitlementsByBuyer(String orgId, String buyerId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("buyer/")
      .addPathSegment(buyerId)
      .addPathSegments("entitlement")
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SharedWorkloadEntitlement>>() {});
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<SharedWorkloadEntitlement> listEntitlements(String orgId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("entitlement")
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SharedWorkloadEntitlement>>() {});
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public SharedWorkloadEntitlement getEntitlement(String orgId, String entitlementId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("entitlement/")
      .addPathSegment(entitlementId)
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedWorkloadEntitlement.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public SharedAddEntitlementCreditResponse addEntitlementCredit(String orgId, String entitlementId,
      SharedAddEntitlementCreditParams request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("entitlement/")
      .addPathSegment(entitlementId)
      .addPathSegments("addCredit")
      ;HttpUrl _httpUrl = _httpUrlBuilder.build()
          ;
      Map<String, Object> _requestBodyProperties = new HashMap<>();
      _requestBodyProperties.put("creditAmountIncrement", request.getCreditAmountIncrement());
      _requestBodyProperties.put("entitlementID", request.getEntitlementId());
      _requestBodyProperties.put("organizationID", request.getOrganizationId());
      RequestBody _requestBody;
      try {
        _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties), MediaType.parse("application/json"));
      }
      catch(Exception e) {
        throw new RuntimeException(e);
      }
      Request.Builder _requestBuilder = new Request.Builder()
        .url(_httpUrl)
        .method("POST", _requestBody)
        .headers(Headers.of(clientOptions.headers()))
        .addHeader("Content-Type", "application/json");
      Request _request = _requestBuilder.build();
      try {
        Response _response = clientOptions.httpClient().newCall(_request).execute();
        if (_response.isSuccessful()) {
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedAddEntitlementCreditResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public SharedWorkloadEntitlement updateEntitlementName(String orgId, String entitlementId,
        GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment(orgId)
        .addPathSegments("entitlement/")
        .addPathSegment(entitlementId)
        .addPathSegments("entitlementName")
        ;HttpUrl _httpUrl = _httpUrlBuilder.build()
            ;
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("id", request.getId());
        _requestBodyProperties.put("name", request.getName());
        _requestBodyProperties.put("organizationID", request.getOrganizationId());
        RequestBody _requestBody;
        try {
          _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties), MediaType.parse("application/json"));
        }
        catch(Exception e) {
          throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
          .url(_httpUrl)
          .method("PATCH", _requestBody)
          .headers(Headers.of(clientOptions.headers()))
          .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
          Response _response = clientOptions.httpClient().newCall(_request).execute();
          if (_response.isSuccessful()) {
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedWorkloadEntitlement.class);
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public List<SharedWorkloadEntitlement> listEntitlementsByOffer(String orgId, String offerId) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment(orgId)
          .addPathSegments("offer/")
          .addPathSegment(offerId)
          .addPathSegments("entitlement")
          .build();Request _request = new Request.Builder()
          .url(_httpUrl)
          .method("GET", null)
          .headers(Headers.of(clientOptions.headers()))
          .addHeader("Content-Type", "application/json")
          .build();
        try {
          Response _response = clientOptions.httpClient().newCall(_request).execute();
          if (_response.isSuccessful()) {
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SharedWorkloadEntitlement>>() {});
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public List<SharedWorkloadEntitlement> listEntitlementsByPartner(String orgId,
          ListEntitlementsByPartnerRequestPartner partner) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment(orgId)
          .addPathSegments("partner/")
          .addPathSegment(partner.toString())
          .addPathSegments("entitlement")
          .build();Request _request = new Request.Builder()
          .url(_httpUrl)
          .method("GET", null)
          .headers(Headers.of(clientOptions.headers()))
          .addHeader("Content-Type", "application/json")
          .build();
        try {
          Response _response = clientOptions.httpClient().newCall(_request).execute();
          if (_response.isSuccessful()) {
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SharedWorkloadEntitlement>>() {});
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public List<SharedWorkloadEntitlement> listEntitlementsByProduct(String orgId,
          String productId) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment(orgId)
          .addPathSegments("product/")
          .addPathSegment(productId)
          .addPathSegments("entitlement")
          .build();Request _request = new Request.Builder()
          .url(_httpUrl)
          .method("GET", null)
          .headers(Headers.of(clientOptions.headers()))
          .addHeader("Content-Type", "application/json")
          .build();
        try {
          Response _response = clientOptions.httpClient().newCall(_request).execute();
          if (_response.isSuccessful()) {
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SharedWorkloadEntitlement>>() {});
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }
    }
