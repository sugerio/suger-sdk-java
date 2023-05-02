package com.suger.api.resources.offer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.suger.api.core.ClientOptions;
import com.suger.api.core.ObjectMappers;
import com.suger.api.resources.types.ListOffersByPartnerRequestPartner;
import com.suger.api.resources.types.SharedWorkloadOffer;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class OfferClientImpl implements OfferClient {
  private final ClientOptions clientOptions;

  public OfferClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public SharedWorkloadOffer createOrUpdateDraftOffer(String orgId, SharedWorkloadOffer request) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("draftOffer")
      .build();
    RequestBody _requestBody;
    try {
      _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
    }
    catch(Exception e) {
      throw new RuntimeException(e);
    }
    Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("POST", _requestBody)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedWorkloadOffer.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<SharedWorkloadOffer> listOffersByOrganization(String orgId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("offer")
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SharedWorkloadOffer>>() {});
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public SharedWorkloadOffer createOffer(String orgId, SharedWorkloadOffer request) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("offer")
      .build();
    RequestBody _requestBody;
    try {
      _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
    }
    catch(Exception e) {
      throw new RuntimeException(e);
    }
    Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("POST", _requestBody)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedWorkloadOffer.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public SharedWorkloadOffer getOffer(String orgId, String offerId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("offer/")
      .addPathSegment(offerId)
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedWorkloadOffer.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String deleteOffer(String orgId, String offerId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("offer/")
      .addPathSegment(offerId)
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("PATCH", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), String.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String cancelOffer(String orgId, String offerId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("offer/")
      .addPathSegment(offerId)
      .addPathSegments("cancel")
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("POST", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), String.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<SharedWorkloadOffer> listOffersByPartner(String orgId,
      ListOffersByPartnerRequestPartner partner) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("partner/")
      .addPathSegment(partner.toString())
      .addPathSegments("offer")
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SharedWorkloadOffer>>() {});
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<SharedWorkloadOffer> listOffersByProduct(String orgId, String productId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("product/")
      .addPathSegment(productId)
      .addPathSegments("offer")
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SharedWorkloadOffer>>() {});
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
