package com.suger.api.resources.operation;

import com.fasterxml.jackson.core.type.TypeReference;
import com.suger.api.core.ClientOptions;
import com.suger.api.core.ObjectMappers;
import com.suger.api.resources.operation.requests.ListOperationsRequest;
import com.suger.api.resources.types.SharedOperation;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class OperationClientImpl implements OperationClient {
  private final ClientOptions clientOptions;

  public OperationClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public List<SharedOperation> listOperations(String orgId, ListOperationsRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("operation")
      ;if (request.getOfferId().isPresent()) {
        _httpUrlBuilder.addQueryParameter("offerId", request.getOfferId().get());
      }
      if (request.getEntitlementId().isPresent()) {
        _httpUrlBuilder.addQueryParameter("entitlementId", request.getEntitlementId().get());
      }
      if (request.getCrmOpportunityId().isPresent()) {
        _httpUrlBuilder.addQueryParameter("crmOpportunityId", request.getCrmOpportunityId().get());
      }
      if (request.getPartnerOpportunityId().isPresent()) {
        _httpUrlBuilder.addQueryParameter("partnerOpportunityId", request.getPartnerOpportunityId().get());
      }
      HttpUrl _httpUrl = _httpUrlBuilder.build()
          ;
      RequestBody _requestBody = null;
      Request.Builder _requestBuilder = new Request.Builder()
        .url(_httpUrl)
        .method("GET", _requestBody)
        .headers(Headers.of(clientOptions.headers()))
        .addHeader("Content-Type", "application/json");
      Request _request = _requestBuilder.build();
      try {
        Response _response = clientOptions.httpClient().newCall(_request).execute();
        if (_response.isSuccessful()) {
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SharedOperation>>() {});
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
