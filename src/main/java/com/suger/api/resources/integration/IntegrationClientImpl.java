package com.suger.api.resources.integration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.suger.api.core.ClientOptions;
import com.suger.api.core.ObjectMappers;
import com.suger.api.resources.integration.requests.SharedCreateIntegrationParams;
import com.suger.api.resources.integration.requests.SharedUpdateIntegrationParams;
import com.suger.api.types.DeleteIntegrationRequestPartner;
import com.suger.api.types.DeleteIntegrationRequestService;
import com.suger.api.types.GetIntegrationRequestPartner;
import com.suger.api.types.GetIntegrationRequestService;
import com.suger.api.types.SharedIdentityIntegration;
import com.suger.api.types.UpdateIntegrationRequestPartner;
import com.suger.api.types.UpdateIntegrationRequestService;
import com.suger.api.types.VerifyIntegrationRequestPartner;
import com.suger.api.types.VerifyIntegrationRequestService;
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

public final class IntegrationClientImpl implements IntegrationClient {
  private final ClientOptions clientOptions;

  public IntegrationClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public List<SharedIdentityIntegration> listIntegrationsByOrganization(String orgId) {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/org/")
      .addPathSegment(orgId)
      .addPathSegments("integration")
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SharedIdentityIntegration>>() {});
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public SharedIdentityIntegration createIntegration(String orgId,
      SharedCreateIntegrationParams request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/org/")
      .addPathSegment(orgId)
      .addPathSegments("integration")
      ;HttpUrl _httpUrl = _httpUrlBuilder.build()
          ;
      Map<String, Object> _requestBodyProperties = new HashMap<>();
      _requestBodyProperties.put("createdBy", request.getCreatedBy());
      _requestBodyProperties.put("info", request.getInfo());
      _requestBodyProperties.put("organizationID", request.getOrganizationId());
      _requestBodyProperties.put("partner", request.getPartner());
      _requestBodyProperties.put("service", request.getService());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedIdentityIntegration.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public SharedIdentityIntegration getIntegration(String orgId,
        GetIntegrationRequestPartner partner, GetIntegrationRequestService service) {
      HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/org/")
        .addPathSegment(orgId)
        .addPathSegments("integration/")
        .addPathSegment(partner.toString())
        .addPathSegment(service.toString())
        .build();Request _request = new Request.Builder()
        .url(_httpUrl)
        .method("GET", null)
        .headers(Headers.of(clientOptions.headers()))
        .addHeader("Content-Type", "application/json")
        .build();
      try {
        Response _response = clientOptions.httpClient().newCall(_request).execute();
        if (_response.isSuccessful()) {
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedIdentityIntegration.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public SharedIdentityIntegration updateIntegration(String orgId,
        UpdateIntegrationRequestPartner partner, UpdateIntegrationRequestService service,
        SharedUpdateIntegrationParams request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/org/")
        .addPathSegment(orgId)
        .addPathSegments("integration/")
        .addPathSegment(partner.toString())
        .addPathSegment(service.toString())
        ;HttpUrl _httpUrl = _httpUrlBuilder.build()
            ;
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("info", request.getInfo());
        _requestBodyProperties.put("organizationID", request.getOrganizationId());
        _requestBodyProperties.put("partner", request.getPartner());
        _requestBodyProperties.put("service", request.getService());
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
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedIdentityIntegration.class);
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public String deleteIntegration(String orgId, DeleteIntegrationRequestPartner partner,
          DeleteIntegrationRequestService service) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment("/org/")
          .addPathSegment(orgId)
          .addPathSegments("integration/")
          .addPathSegment(partner.toString())
          .addPathSegment(service.toString())
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
      public boolean verifyIntegration(String orgId, VerifyIntegrationRequestPartner partner,
          VerifyIntegrationRequestService service) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment("/org/")
          .addPathSegment(orgId)
          .addPathSegments("integration/")
          .addPathSegment(partner.toString())
          .addPathSegment(service.toString())
          .addPathSegments("verify")
          .build();Request _request = new Request.Builder()
          .url(_httpUrl)
          .method("POST", null)
          .headers(Headers.of(clientOptions.headers()))
          .addHeader("Content-Type", "application/json")
          .build();
        try {
          Response _response = clientOptions.httpClient().newCall(_request).execute();
          if (_response.isSuccessful()) {
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), boolean.class);
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }
    }
