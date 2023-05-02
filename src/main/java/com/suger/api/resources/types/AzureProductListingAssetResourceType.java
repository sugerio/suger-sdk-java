package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class AzureProductListingAssetResourceType {
  public static final AzureProductListingAssetResourceType LISTING_IMAGE = new AzureProductListingAssetResourceType(Value.LISTING_IMAGE, "ListingImage");

  public static final AzureProductListingAssetResourceType LISTING_ASSET = new AzureProductListingAssetResourceType(Value.LISTING_ASSET, "ListingAsset");

  public static final AzureProductListingAssetResourceType LISTING_VIDEO = new AzureProductListingAssetResourceType(Value.LISTING_VIDEO, "ListingVideo");

  private final Value value;

  private final String string;

  AzureProductListingAssetResourceType(Value value, String string) {
    this.value = value;
    this.string = string;
  }

  public Value getEnumValue() {
    return value;
  }

  @Override
  @JsonValue
  public String toString() {
    return this.string;
  }

  @Override
  public boolean equals(Object other) {
    return (this == other) 
      || (other instanceof AzureProductListingAssetResourceType && this.string.equals(((AzureProductListingAssetResourceType) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case LISTING_IMAGE:
        return visitor.visitListingImage();
      case LISTING_ASSET:
        return visitor.visitListingAsset();
      case LISTING_VIDEO:
        return visitor.visitListingVideo();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static AzureProductListingAssetResourceType valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "ListingImage":
        return LISTING_IMAGE;
      case "ListingAsset":
        return LISTING_ASSET;
      case "ListingVideo":
        return LISTING_VIDEO;
      default:
        return new AzureProductListingAssetResourceType(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    LISTING_ASSET,

    LISTING_IMAGE,

    LISTING_VIDEO,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitListingAsset();

    T visitListingImage();

    T visitListingVideo();

    T visitUnknown(String unknownType);
  }
}
