package com.suger.api.resources.buyer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.suger.api.core.ClientOptions;
import com.suger.api.core.ObjectMappers;
import com.suger.api.resources.buyer.requests.GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams;
import com.suger.api.types.SharedIdentityBuyer;
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

public final class BuyerClientImpl implements BuyerClient {
  private final ClientOptions clientOptions;

  public BuyerClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public List<SharedIdentityBuyer> listBuyersByOrganization(String orgId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/org/")
      .addPathSegment(orgId)
      .addPathSegments("buyer")
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SharedIdentityBuyer>>() {});
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public SharedIdentityBuyer getBuyer(String orgId, String buyerId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/org/")
      .addPathSegment(orgId)
      .addPathSegments("buyer/")
      .addPathSegment(buyerId)
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedIdentityBuyer.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public SharedIdentityBuyer updateBuyerNameDescription(String orgId, String buyerId,
      GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/org/")
      .addPathSegment(orgId)
      .addPathSegments("buyer/")
      .addPathSegment(buyerId)
      ;HttpUrl _httpUrl = _httpUrlBuilder.build()
          ;
      Map<String, Object> _requestBodyProperties = new HashMap<>();
      _requestBodyProperties.put("description", request.getDescription());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedIdentityBuyer.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
