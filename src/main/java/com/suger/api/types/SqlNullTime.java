package com.suger.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SqlNullTime.Builder.class
)
public final class SqlNullTime {
  private final Optional<String> time;

  private final Optional<Boolean> valid;

  private int _cachedHashCode;

  SqlNullTime(Optional<String> time, Optional<Boolean> valid) {
    this.time = time;
    this.valid = valid;
  }

  @JsonProperty("time")
  public Optional<String> getTime() {
    return time;
  }

  /**
   * @return Valid is true if Time is not NULL
   */
  @JsonProperty("valid")
  public Optional<Boolean> getValid() {
    return valid;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SqlNullTime && equalTo((SqlNullTime) other);
  }

  private boolean equalTo(SqlNullTime other) {
    return time.equals(other.time) && valid.equals(other.valid);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.time, this.valid);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SqlNullTime{" + "time: " + time + ", valid: " + valid + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> time = Optional.empty();

    private Optional<Boolean> valid = Optional.empty();

    private Builder() {
    }

    public Builder from(SqlNullTime other) {
      time(other.getTime());
      valid(other.getValid());
      return this;
    }

    @JsonSetter(
        value = "time",
        nulls = Nulls.SKIP
    )
    public Builder time(Optional<String> time) {
      this.time = time;
      return this;
    }

    public Builder time(String time) {
      this.time = Optional.of(time);
      return this;
    }

    @JsonSetter(
        value = "valid",
        nulls = Nulls.SKIP
    )
    public Builder valid(Optional<Boolean> valid) {
      this.valid = valid;
      return this;
    }

    public Builder valid(Boolean valid) {
      this.valid = Optional.of(valid);
      return this;
    }

    public SqlNullTime build() {
      return new SqlNullTime(time, valid);
    }
  }
}
