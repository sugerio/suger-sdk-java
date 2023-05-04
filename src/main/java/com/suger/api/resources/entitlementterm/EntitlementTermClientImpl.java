package com.suger.api.resources.entitlementterm;

import com.fasterxml.jackson.core.type.TypeReference;
import com.suger.api.core.ClientOptions;
import com.suger.api.core.ObjectMappers;
import com.suger.api.types.SharedWorkloadEntitlementTerm;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public final class EntitlementTermClientImpl implements EntitlementTermClient {
  private final ClientOptions clientOptions;

  public EntitlementTermClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public List<SharedWorkloadEntitlementTerm> listEntitlementTerms(String orgId,
      String entitlementId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("entitlement/")
      .addPathSegment(entitlementId)
      .addPathSegments("entitlementTerm")
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SharedWorkloadEntitlementTerm>>() {});
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public SharedWorkloadEntitlementTerm getEntitlementTerm(String orgId, String entitlementId,
      String entitlementTermId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("entitlement/")
      .addPathSegment(entitlementId)
      .addPathSegments("entitlementTerm/")
      .addPathSegment(entitlementTermId)
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedWorkloadEntitlementTerm.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
