package com.suger.api.resources.entitlement;

import com.suger.api.resources.entitlement.requests.GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams;
import com.suger.api.resources.entitlement.requests.SharedAddEntitlementCreditParams;
import com.suger.api.types.ListEntitlementsByPartnerRequestPartner;
import com.suger.api.types.SharedAddEntitlementCreditResponse;
import com.suger.api.types.SharedWorkloadEntitlement;
import java.lang.String;
import java.util.List;

public interface EntitlementClient {
  List<SharedWorkloadEntitlement> listEntitlementsByBuyer(String orgId, String buyerId);

  List<SharedWorkloadEntitlement> listEntitlements(String orgId);

  SharedWorkloadEntitlement getEntitlement(String orgId, String entitlementId);

  SharedAddEntitlementCreditResponse addEntitlementCredit(String orgId, String entitlementId,
      SharedAddEntitlementCreditParams request);

  SharedWorkloadEntitlement updateEntitlementName(String orgId, String entitlementId,
      GithubComSugerioMarketplaceServiceRdsDbLibUpdateEntitlementNameParams request);

  List<SharedWorkloadEntitlement> listEntitlementsByOffer(String orgId, String offerId);

  List<SharedWorkloadEntitlement> listEntitlementsByPartner(String orgId,
      ListEntitlementsByPartnerRequestPartner partner);

  List<SharedWorkloadEntitlement> listEntitlementsByProduct(String orgId, String productId);
}
