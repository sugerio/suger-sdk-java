package com.suger.api;

import com.suger.api.core.ClientOptions;
import com.suger.api.core.Environment;
import java.lang.String;

public final class SugerApiClientBuilder {
  private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

  private Environment environment = Environment.DEFAULT;

  public SugerApiClientBuilder apiKey(String apiKey) {
    this.clientOptionsBuilder.addHeader("Authorization", apiKey);
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
    return new SugerApiClientImpl(clientOptionsBuilder.build());
  }
}
