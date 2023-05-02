package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Locale;

public final class SharedNotificationEventAction {
  public static final SharedNotificationEventAction EXPIRE = new SharedNotificationEventAction(Value.EXPIRE, "EXPIRE");

  public static final SharedNotificationEventAction REINSTATE = new SharedNotificationEventAction(Value.REINSTATE, "REINSTATE");

  public static final SharedNotificationEventAction UPDATE = new SharedNotificationEventAction(Value.UPDATE, "UPDATE");

  public static final SharedNotificationEventAction ACCEPT = new SharedNotificationEventAction(Value.ACCEPT, "ACCEPT");

  public static final SharedNotificationEventAction SUSPEND = new SharedNotificationEventAction(Value.SUSPEND, "SUSPEND");

  public static final SharedNotificationEventAction DELETE = new SharedNotificationEventAction(Value.DELETE, "DELETE");

  public static final SharedNotificationEventAction TEST = new SharedNotificationEventAction(Value.TEST, "TEST");

  public static final SharedNotificationEventAction CREATE = new SharedNotificationEventAction(Value.CREATE, "CREATE");

  public static final SharedNotificationEventAction CANCEL = new SharedNotificationEventAction(Value.CANCEL, "CANCEL");

  public static final SharedNotificationEventAction NOTIFY_CONTACTS = new SharedNotificationEventAction(Value.NOTIFY_CONTACTS, "NOTIFY_CONTACTS");

  public static final SharedNotificationEventAction PENDING_CANCEL = new SharedNotificationEventAction(Value.PENDING_CANCEL, "PENDING_CANCEL");

  private final Value value;

  private final String string;

  SharedNotificationEventAction(Value value, String string) {
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
      || (other instanceof SharedNotificationEventAction && this.string.equals(((SharedNotificationEventAction) other).string));
  }

  @Override
  public int hashCode() {
    return this.string.hashCode();
  }

  public <T> T visit(Visitor<T> visitor) {
    switch (value) {
      case EXPIRE:
        return visitor.visitExpire();
      case REINSTATE:
        return visitor.visitReinstate();
      case UPDATE:
        return visitor.visitUpdate();
      case ACCEPT:
        return visitor.visitAccept();
      case SUSPEND:
        return visitor.visitSuspend();
      case DELETE:
        return visitor.visitDelete();
      case TEST:
        return visitor.visitTest();
      case CREATE:
        return visitor.visitCreate();
      case CANCEL:
        return visitor.visitCancel();
      case NOTIFY_CONTACTS:
        return visitor.visitNotifyContacts();
      case PENDING_CANCEL:
        return visitor.visitPendingCancel();
      case UNKNOWN:
      default:
        return visitor.visitUnknown(string);
    }
  }

  @JsonCreator(
      mode = JsonCreator.Mode.DELEGATING
  )
  public static SharedNotificationEventAction valueOf(String value) {
    String upperCasedValue = value.toUpperCase(Locale.ROOT);
    switch (upperCasedValue) {
      case "EXPIRE":
        return EXPIRE;
      case "REINSTATE":
        return REINSTATE;
      case "UPDATE":
        return UPDATE;
      case "ACCEPT":
        return ACCEPT;
      case "SUSPEND":
        return SUSPEND;
      case "DELETE":
        return DELETE;
      case "TEST":
        return TEST;
      case "CREATE":
        return CREATE;
      case "CANCEL":
        return CANCEL;
      case "NOTIFY_CONTACTS":
        return NOTIFY_CONTACTS;
      case "PENDING_CANCEL":
        return PENDING_CANCEL;
      default:
        return new SharedNotificationEventAction(Value.UNKNOWN, upperCasedValue);
    }
  }

  public enum Value {
    ACCEPT,

    CREATE,

    DELETE,

    CANCEL,

    PENDING_CANCEL,

    EXPIRE,

    REINSTATE,

    SUSPEND,

    UPDATE,

    NOTIFY_CONTACTS,

    TEST,

    UNKNOWN
  }

  public interface Visitor<T> {
    T visitAccept();

    T visitCreate();

    T visitDelete();

    T visitCancel();

    T visitPendingCancel();

    T visitExpire();

    T visitReinstate();

    T visitSuspend();

    T visitUpdate();

    T visitNotifyContacts();

    T visitTest();

    T visitUnknown(String unknownType);
  }
}
