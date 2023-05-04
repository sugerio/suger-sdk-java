package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum AzureProductListingAssetResourceType {
  LISTING_ASSET("ListingAsset"),

  LISTING_IMAGE("ListingImage"),

  LISTING_VIDEO("ListingVideo");

  private final String value;

  AzureProductListingAssetResourceType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
