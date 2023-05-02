package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedWorkloadOfferStatus {
  public static final SharedWorkloadOfferStatus CREATE_SUCCESS = new SharedWorkloadOfferStatus(Value.CREATE_SUCCESS, "CREATE_SUCCESS");

  public static final SharedWorkloadOfferStatus CANCEL_FAILED = new SharedWorkloadOfferStatus(Value.CANCEL_FAILED, "CANCEL_FAILED");

  public static final SharedWorkloadOfferStatus EXPIRED = new SharedWorkloadOfferStatus(Value.EXPIRED, "EXPIRED");

  public static final SharedWorkloadOfferStatus ACCEPTED = new SharedWorkloadOfferStatus(Value.ACCEPTED, "ACCEPTED");

  public static final SharedWorkloadOfferStatus DRAFT = new SharedWorkloadOfferStatus(Value.DRAFT, "DRAFT");

  public static final SharedWorkloadOfferStatus CREATE_FAILED = new SharedWorkloadOfferStatus(Value.CREATE_FAILED, "CREATE_FAILED");

  public static final SharedWorkloadOfferStatus PENDING_ACCEPTANCE = new SharedWorkloadOfferStatus(Value.PENDING_ACCEPTANCE, "PENDING_ACCEPTANCE");

  public static final SharedWorkloadOfferStatus PENDING_CREATE = new SharedWorkloadOfferStatus(Value.PENDING_CREATE, "PENDING_CREATE");

  public static final SharedWorkloadOfferStatus PENDING_CANCEL = new SharedWorkloadOfferStatus(Value.PENDING_CANCEL, "PENDING_CANCEL");

  public static final SharedWorkloadOfferStatus CANCEL_SUCCESS = new SharedWorkloadOfferStatus(Value.CANCEL_SUCCESS, "CANCEL_SUCCESS");

  private final Value value;

  private final String string;

  SharedWorkloadOfferStatus(Value value, String string) {
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
      || (other instanceof SharedWorkloadOfferStatus && this.string.equals(((SharedWorkloadOfferStatus) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case CREATE_SUCCESS:
        return visitor.visitCreateSuccess();
      case CANCEL_FAILED:
        return visitor.visitCancelFailed();
      case EXPIRED:
        return visitor.visitExpired();
      case ACCEPTED:
        return visitor.visitAccepted();
      case DRAFT:
        return visitor.visitDraft();
      case CREATE_FAILED:
        return visitor.visitCreateFailed();
      case PENDING_ACCEPTANCE:
        return visitor.visitPendingAcceptance();
      case PENDING_CREATE:
        return visitor.visitPendingCreate();
      case PENDING_CANCEL:
        return visitor.visitPendingCancel();
      case CANCEL_SUCCESS:
        return visitor.visitCancelSuccess();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedWorkloadOfferStatus valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "CREATE_SUCCESS":
        return CREATE_SUCCESS;
      case "CANCEL_FAILED":
        return CANCEL_FAILED;
      case "EXPIRED":
        return EXPIRED;
      case "ACCEPTED":
        return ACCEPTED;
      case "DRAFT":
        return DRAFT;
      case "CREATE_FAILED":
        return CREATE_FAILED;
      case "PENDING_ACCEPTANCE":
        return PENDING_ACCEPTANCE;
      case "PENDING_CREATE":
        return PENDING_CREATE;
      case "PENDING_CANCEL":
        return PENDING_CANCEL;
      case "CANCEL_SUCCESS":
        return CANCEL_SUCCESS;
      default:
        return new SharedWorkloadOfferStatus(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACCEPTED,

    PENDING_CREATE,

    CREATE_FAILED,

    CREATE_SUCCESS,

    DRAFT,

    EXPIRED,

    PENDING_ACCEPTANCE,

    PENDING_CANCEL,

    CANCEL_FAILED,

    CANCEL_SUCCESS,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAccepted();

    T visitPendingCreate();

    T visitCreateFailed();

    T visitCreateSuccess();

    T visitDraft();

    T visitExpired();

    T visitPendingAcceptance();

    T visitPendingCancel();

    T visitCancelFailed();

    T visitCancelSuccess();

    T visitUnknown(String unknownType);
  }
}
