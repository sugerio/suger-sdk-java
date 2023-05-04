package com.suger.api.resources.report;

import com.suger.api.resources.report.requests.ListRevenueRecordDetailsRequest;
import com.suger.api.resources.report.requests.ListRevenueRecordsRequest;
import com.suger.api.resources.report.requests.SharedGetRevenueReportParams;
import com.suger.api.resources.report.requests.SharedGetUsageReportParams;
import com.suger.api.types.ListRevenueRecordDetailsRequestPartner;
import com.suger.api.types.ListRevenueRecordsRequestPartner;
import com.suger.api.types.SharedListRevenueRecordDetailsResponse;
import com.suger.api.types.SharedListRevenueRecordsResponse;
import com.suger.api.types.SharedRevenueReport;
import com.suger.api.types.SharedUsageReport;
import java.lang.String;

public interface ReportClient {
  SharedListRevenueRecordsResponse listRevenueRecords(String orgId,
      ListRevenueRecordsRequestPartner partner, ListRevenueRecordsRequest request);

  SharedListRevenueRecordDetailsResponse listRevenueRecordDetails(String orgId,
      ListRevenueRecordDetailsRequestPartner partner, ListRevenueRecordDetailsRequest request);

  SharedRevenueReport getRevenueReport(String orgId, SharedGetRevenueReportParams request);

  SharedUsageReport getUsageReport(String orgId, SharedGetUsageReportParams request);
}
