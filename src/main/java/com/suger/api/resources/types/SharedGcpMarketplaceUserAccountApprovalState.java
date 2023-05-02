package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedGcpMarketplaceUserAccountApprovalState {
  public static final SharedGcpMarketplaceUserAccountApprovalState PENDING = new SharedGcpMarketplaceUserAccountApprovalState(Value.PENDING, "PENDING");

  public static final SharedGcpMarketplaceUserAccountApprovalState REJECTED = new SharedGcpMarketplaceUserAccountApprovalState(Value.REJECTED, "REJECTED");

  public static final SharedGcpMarketplaceUserAccountApprovalState APPROVED = new SharedGcpMarketplaceUserAccountApprovalState(Value.APPROVED, "APPROVED");

  public static final SharedGcpMarketplaceUserAccountApprovalState STATE_UNSPECIFIED = new SharedGcpMarketplaceUserAccountApprovalState(Value.STATE_UNSPECIFIED, "STATE_UNSPECIFIED");

  private final Value value;

  private final String string;

  SharedGcpMarketplaceUserAccountApprovalState(Value value, String string) {
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
      || (other instanceof SharedGcpMarketplaceUserAccountApprovalState && this.string.equals(((SharedGcpMarketplaceUserAccountApprovalState) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case PENDING:
        return visitor.visitPending();
      case REJECTED:
        return visitor.visitRejected();
      case APPROVED:
        return visitor.visitApproved();
      case STATE_UNSPECIFIED:
        return visitor.visitStateUnspecified();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedGcpMarketplaceUserAccountApprovalState valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "PENDING":
        return PENDING;
      case "REJECTED":
        return REJECTED;
      case "APPROVED":
        return APPROVED;
      case "STATE_UNSPECIFIED":
        return STATE_UNSPECIFIED;
      default:
        return new SharedGcpMarketplaceUserAccountApprovalState(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    STATE_UNSPECIFIED,

    PENDING,

    APPROVED,

    REJECTED,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitStateUnspecified();

    T visitPending();

    T visitApproved();

    T visitRejected();

    T visitUnknown(String unknownType);
  }
}
