package com.suger.api.resources.metering;

import com.suger.api.resources.metering.requests.ListUsageRecordGroupsByEntitlementRequest;
import com.suger.api.resources.metering.requests.ListUsageRecordGroupsByOrganizationRequest;
import com.suger.api.resources.metering.requests.ListUsageRecordGroupsByProductRequest;
import com.suger.api.resources.metering.requests.ListUsageRecordReportsByEntitlementRequest;
import com.suger.api.resources.metering.requests.ListUsageRecordReportsByOrganizationRequest;
import com.suger.api.resources.metering.requests.ListUsageRecordReportsByProductRequest;
import com.suger.api.resources.metering.requests.SharedCreateUsageRecordGroupParams;
import com.suger.api.types.SharedListUsageRecordGroupsResponse;
import com.suger.api.types.SharedListUsageRecordReportsResponse;
import com.suger.api.types.SharedMeteringUsageRecordGroup;
import com.suger.api.types.SharedMeteringUsageRecordReport;
import java.lang.String;

public interface MeteringClient {
  SharedListUsageRecordGroupsResponse listUsageRecordGroupsByEntitlement(String orgId,
      String entitlementId, ListUsageRecordGroupsByEntitlementRequest request);

  SharedMeteringUsageRecordGroup reportUsageRecordGroup(String orgId, String entitlementId,
      SharedCreateUsageRecordGroupParams request);

  SharedListUsageRecordReportsResponse listUsageRecordReportsByEntitlement(String orgId,
      String entitlementId, ListUsageRecordReportsByEntitlementRequest request);

  SharedListUsageRecordGroupsResponse listUsageRecordGroupsByProduct(String orgId, String productId,
      ListUsageRecordGroupsByProductRequest request);

  SharedListUsageRecordReportsResponse listUsageRecordReportsByProduct(String orgId,
      String productId, ListUsageRecordReportsByProductRequest request);

  SharedListUsageRecordGroupsResponse listUsageRecordGroupsByOrganization(String orgId,
      ListUsageRecordGroupsByOrganizationRequest request);

  SharedMeteringUsageRecordGroup getUsageRecordGroup(String orgId, String usageRecordGroupId);

  SharedListUsageRecordReportsResponse listUsageRecordReportsByOrganization(String orgId,
      ListUsageRecordReportsByOrganizationRequest request);

  SharedMeteringUsageRecordReport getUsageRecordReport(String orgId, String usageRecordReportId);
}
