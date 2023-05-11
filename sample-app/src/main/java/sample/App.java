package sample;

import com.suger.api.types.SharedWorkloadEntitlement;
import java.lang.String;
import com.suger.api.SugerApiClient;

public final class App {

    public static void main(String[] args) {
        SugerApiClient suger = SugerApiClient.builder()
                .clientId(System.getenv("SUGER_CLIENT_ID"))
                .clientSecret(System.getenv("SUGER_CLIENT_SECRET"))
                .build();

        SharedWorkloadEntitlement entitlement =
                suger.entitlement().getEntitlement("orgId", "entitlementId");

        System.out.println("Entitlement has buyer id " + entitlement.getBuyerId());
    }
}
