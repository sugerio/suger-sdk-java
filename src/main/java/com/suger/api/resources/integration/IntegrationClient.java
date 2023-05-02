package com.suger.api.resources.integration;

import com.suger.api.resources.integration.requests.SharedCreateIntegrationParams;
import com.suger.api.resources.integration.requests.SharedUpdateIntegrationParams;
import com.suger.api.resources.types.DeleteIntegrationRequestPartner;
import com.suger.api.resources.types.DeleteIntegrationRequestService;
import com.suger.api.resources.types.GetIntegrationRequestPartner;
import com.suger.api.resources.types.GetIntegrationRequestService;
import com.suger.api.resources.types.SharedIdentityIntegration;
import com.suger.api.resources.types.UpdateIntegrationRequestPartner;
import com.suger.api.resources.types.UpdateIntegrationRequestService;
import com.suger.api.resources.types.VerifyIntegrationRequestPartner;
import com.suger.api.resources.types.VerifyIntegrationRequestService;
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
