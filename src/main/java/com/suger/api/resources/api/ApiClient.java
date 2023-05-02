package com.suger.api.resources.api;

import com.suger.api.resources.api.requests.SharedGetApiClientAccessTokenParams;
import com.suger.api.resources.types.SharedApiClientAccessToken;

public interface ApiClient {
  SharedApiClientAccessToken getApiClientAccessToken(SharedGetApiClientAccessTokenParams request);
}
