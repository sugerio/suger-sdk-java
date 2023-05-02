package com.suger.api.resources.offer;

import com.suger.api.resources.types.ListOffersByPartnerRequestPartner;
import com.suger.api.resources.types.SharedWorkloadOffer;
import java.lang.String;
import java.util.List;

public interface OfferClient {
  SharedWorkloadOffer createOrUpdateDraftOffer(String orgId, SharedWorkloadOffer request);

  List<SharedWorkloadOffer> listOffersByOrganization(String orgId);

  SharedWorkloadOffer createOffer(String orgId, SharedWorkloadOffer request);

  SharedWorkloadOffer getOffer(String orgId, String offerId);

  String deleteOffer(String orgId, String offerId);

  String cancelOffer(String orgId, String offerId);

  List<SharedWorkloadOffer> listOffersByPartner(String orgId,
      ListOffersByPartnerRequestPartner partner);

  List<SharedWorkloadOffer> listOffersByProduct(String orgId, String productId);
}
