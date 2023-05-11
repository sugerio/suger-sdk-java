package com.suger.api;

import com.suger.api.core.ClientOptions;
import com.suger.api.core.Environment;
import com.suger.api.utils.TokenSupplier;
import java.lang.String;

public final class SugerApiClientBuilder {
  private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

  private Environment environment = Environment.DEFAULT;

  private String clientId = null;

  private String clientSecret = null;

  public SugerApiClientBuilder clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public SugerApiClientBuilder clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  public SugerApiClientBuilder environment(Environment environment) {
    this.environment = environment;
    return this;
  }

  public SugerApiClientBuilder url(String url) {
    this.environment = Environment.custom(url);
    return this;
  }

  public SugerApiClient build() {
    clientOptionsBuilder.environment(this.environment);
    clientOptionsBuilder.addHeader("Authorization", new TokenSupplier(clientId, clientSecret));
    return new SugerApiClientImpl(clientOptionsBuilder.build());
  }
}
