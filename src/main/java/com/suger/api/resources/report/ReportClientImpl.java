package com.suger.api.resources.report;

import com.suger.api.core.ClientOptions;
import com.suger.api.core.ObjectMappers;
import com.suger.api.resources.report.requests.ListRevenueRecordDetailsRequest;
import com.suger.api.resources.report.requests.ListRevenueRecordsRequest;
import com.suger.api.resources.report.requests.SharedGetRevenueReportParams;
import com.suger.api.resources.report.requests.SharedGetUsageReportParams;
import com.suger.api.resources.types.ListRevenueRecordDetailsRequestPartner;
import com.suger.api.resources.types.ListRevenueRecordsRequestPartner;
import com.suger.api.resources.types.SharedListRevenueRecordDetailsResponse;
import com.suger.api.resources.types.SharedListRevenueRecordsResponse;
import com.suger.api.resources.types.SharedRevenueReport;
import com.suger.api.resources.types.SharedUsageReport;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class ReportClientImpl implements ReportClient {
  private final ClientOptions clientOptions;

  public ReportClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public SharedListRevenueRecordsResponse listRevenueRecords(String orgId,
      ListRevenueRecordsRequestPartner partner, ListRevenueRecordsRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment(orgId)
      .addPathSegments("partner/")
      .addPathSegment(partner.toString())
      .addPathSegments("revenueRecord")
      ;if (request.getProductId().isPresent()) {
        _httpUrlBuilder.addQueryParameter("productId", request.getProductId().get());
      }
      if (request.getEntitlementId().isPresent()) {
        _httpUrlBuilder.addQueryParameter("entitlementId", request.getEntitlementId().get());
      }
      if (request.getBuyerId().isPresent()) {
        _httpUrlBuilder.addQueryParameter("buyerId", request.getBuyerId().get());
      }
      if (request.getStartDate().isPresent()) {
        _httpUrlBuilder.addQueryParameter("startDate", request.getStartDate().get());
      }
      if (request.getEndDate().isPresent()) {
        _httpUrlBuilder.addQueryParameter("endDate", request.getEndDate().get());
      }
      if (request.getLimit().isPresent()) {
        _httpUrlBuilder.addQueryParameter("limit", request.getLimit().get().toString());
      }
      if (request.getOffset().isPresent()) {
        _httpUrlBuilder.addQueryParameter("offset", request.getOffset().get().toString());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedListRevenueRecordsResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public SharedListRevenueRecordDetailsResponse listRevenueRecordDetails(String orgId,
        ListRevenueRecordDetailsRequestPartner partner, ListRevenueRecordDetailsRequest request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment(orgId)
        .addPathSegments("partner/")
        .addPathSegment(partner.toString())
        .addPathSegments("revenueRecordDetail")
        ;if (request.getProductId().isPresent()) {
          _httpUrlBuilder.addQueryParameter("productId", request.getProductId().get());
        }
        if (request.getEntitlementId().isPresent()) {
          _httpUrlBuilder.addQueryParameter("entitlementId", request.getEntitlementId().get());
        }
        if (request.getBuyerId().isPresent()) {
          _httpUrlBuilder.addQueryParameter("buyerId", request.getBuyerId().get());
        }
        if (request.getStartDate().isPresent()) {
          _httpUrlBuilder.addQueryParameter("startDate", request.getStartDate().get());
        }
        if (request.getEndDate().isPresent()) {
          _httpUrlBuilder.addQueryParameter("endDate", request.getEndDate().get());
        }
        if (request.getLimit().isPresent()) {
          _httpUrlBuilder.addQueryParameter("limit", request.getLimit().get().toString());
        }
        if (request.getOffset().isPresent()) {
          _httpUrlBuilder.addQueryParameter("offset", request.getOffset().get().toString());
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
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedListRevenueRecordDetailsResponse.class);
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public SharedRevenueReport getRevenueReport(String orgId,
          SharedGetRevenueReportParams request) {
        HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment(orgId)
          .addPathSegments("revenueReport")
          ;HttpUrl _httpUrl = _httpUrlBuilder.build()
              ;
          Map<String, Object> _requestBodyProperties = new HashMap<>();
          _requestBodyProperties.put("buyerID", request.getBuyerId());
          _requestBodyProperties.put("entitlementID", request.getEntitlementId());
          _requestBodyProperties.put("organizationID", request.getOrganizationId());
          _requestBodyProperties.put("partner", request.getPartner());
          _requestBodyProperties.put("productID", request.getProductId());
          _requestBodyProperties.put("reportType", request.getReportType());
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
              return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedRevenueReport.class);
            }
            throw new RuntimeException();
          }
          catch (Exception e) {
            throw new RuntimeException(e);
          }
        }

        @Override
        public SharedUsageReport getUsageReport(String orgId, SharedGetUsageReportParams request) {
          HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
            .addPathSegment(orgId)
            .addPathSegments("usageReport")
            ;HttpUrl _httpUrl = _httpUrlBuilder.build()
                ;
            Map<String, Object> _requestBodyProperties = new HashMap<>();
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SharedUsageReport.class);
              }
              throw new RuntimeException();
            }
            catch (Exception e) {
              throw new RuntimeException(e);
            }
          }
        }
