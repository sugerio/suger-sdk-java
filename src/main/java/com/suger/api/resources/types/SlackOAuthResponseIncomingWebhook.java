package com.suger.api.resources.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = SlackOAuthResponseIncomingWebhook.Builder.class
)
public final class SlackOAuthResponseIncomingWebhook {
  private final Optional<String> channel;

  private final Optional<String> channelId;

  private final Optional<String> configurationUrl;

  private final Optional<String> url;

  private int _cachedHashCode;

  SlackOAuthResponseIncomingWebhook(Optional<String> channel, Optional<String> channelId,
      Optional<String> configurationUrl, Optional<String> url) {
    this.channel = channel;
    this.channelId = channelId;
    this.configurationUrl = configurationUrl;
    this.url = url;
  }

  @JsonProperty("channel")
  public Optional<String> getChannel() {
    return channel;
  }

  @JsonProperty("channel_id")
  public Optional<String> getChannelId() {
    return channelId;
  }

  @JsonProperty("configuration_url")
  public Optional<String> getConfigurationUrl() {
    return configurationUrl;
  }

  @JsonProperty("url")
  public Optional<String> getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SlackOAuthResponseIncomingWebhook && equalTo((SlackOAuthResponseIncomingWebhook) other);
  }

  private boolean equalTo(SlackOAuthResponseIncomingWebhook other) {
    return channel.equals(other.channel) && channelId.equals(other.channelId) && configurationUrl.equals(other.configurationUrl) && url.equals(other.url);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.channel, this.channelId, this.configurationUrl, this.url);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SlackOAuthResponseIncomingWebhook{" + "channel: " + channel + ", channelId: " + channelId + ", configurationUrl: " + configurationUrl + ", url: " + url + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> channel = Optional.empty();

    private Optional<String> channelId = Optional.empty();

    private Optional<String> configurationUrl = Optional.empty();

    private Optional<String> url = Optional.empty();

    private Builder() {
    }

    public Builder from(SlackOAuthResponseIncomingWebhook other) {
      channel(other.getChannel());
      channelId(other.getChannelId());
      configurationUrl(other.getConfigurationUrl());
      url(other.getUrl());
      return this;
    }

    @JsonSetter(
        value = "channel",
        nulls = Nulls.SKIP
    )
    public Builder channel(Optional<String> channel) {
      this.channel = channel;
      return this;
    }

    public Builder channel(String channel) {
      this.channel = Optional.of(channel);
      return this;
    }

    @JsonSetter(
        value = "channel_id",
        nulls = Nulls.SKIP
    )
    public Builder channelId(Optional<String> channelId) {
      this.channelId = channelId;
      return this;
    }

    public Builder channelId(String channelId) {
      this.channelId = Optional.of(channelId);
      return this;
    }

    @JsonSetter(
        value = "configuration_url",
        nulls = Nulls.SKIP
    )
    public Builder configurationUrl(Optional<String> configurationUrl) {
      this.configurationUrl = configurationUrl;
      return this;
    }

    public Builder configurationUrl(String configurationUrl) {
      this.configurationUrl = Optional.of(configurationUrl);
      return this;
    }

    @JsonSetter(
        value = "url",
        nulls = Nulls.SKIP
    )
    public Builder url(Optional<String> url) {
      this.url = url;
      return this;
    }

    public Builder url(String url) {
      this.url = Optional.of(url);
      return this;
    }

    public SlackOAuthResponseIncomingWebhook build() {
      return new SlackOAuthResponseIncomingWebhook(channel, channelId, configurationUrl, url);
    }
  }
}
