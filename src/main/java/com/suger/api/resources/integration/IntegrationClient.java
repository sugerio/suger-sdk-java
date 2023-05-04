package com.suger.api.resources.integration;

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
import java.lang.String;
import java.util.List;

public interface IntegrationClient {
  List<SharedIdentityIntegration> listIntegrationsByOrganization(String orgId);

  SharedIdentityIntegration createIntegration(String orgId, SharedCreateIntegrationParams request);

  SharedIdentityIntegration getIntegration(String orgId, GetIntegrationRequestPartner partner,
      GetIntegrationRequestService service);

  SharedIdentityIntegration updateIntegration(String orgId, UpdateIntegrationRequestPartner partner,
      UpdateIntegrationRequestService service, SharedUpdateIntegrationParams request);

  String deleteIntegration(String orgId, DeleteIntegrationRequestPartner partner,
      DeleteIntegrationRequestService service);

  boolean verifyIntegration(String orgId, VerifyIntegrationRequestPartner partner,
      VerifyIntegrationRequestService service);
}
