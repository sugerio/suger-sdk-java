package com.suger.api.resources.entitlementterm;

import com.suger.api.types.SharedWorkloadEntitlementTerm;
import java.lang.String;
import java.util.List;

public interface EntitlementTermClient {
  List<SharedWorkloadEntitlementTerm> listEntitlementTerms(String orgId, String entitlementId);

  SharedWorkloadEntitlementTerm getEntitlementTerm(String orgId, String entitlementId,
      String entitlementTermId);
}
