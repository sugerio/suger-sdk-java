package com.suger.api.utils;

import java.util.function.Supplier;

public final class TokenSupplier implements Supplier<String> {

    private String token = null;

    private final String clientId;

    private final String clientSecret;

    public TokenSupplier(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    @Override
    public String get() {
        if (token == null) { // or if token is expired
          // fetch token using client id and client secret
        }
        return token;
    }
}
