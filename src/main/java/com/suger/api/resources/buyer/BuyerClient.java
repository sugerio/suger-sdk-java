package com.suger.api.resources.buyer;

import com.suger.api.resources.buyer.requests.GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams;
import com.suger.api.resources.types.SharedIdentityBuyer;
import java.lang.String;
import java.util.List;

public interface BuyerClient {
  List<SharedIdentityBuyer> listBuyersByOrganization(String orgId);

  SharedIdentityBuyer getBuyer(String orgId, String buyerId);

  SharedIdentityBuyer updateBuyerNameDescription(String orgId, String buyerId,
      GithubComSugerioMarketplaceServiceRdsDbLibUpdateBuyerNameDescriptionParams request);
}
