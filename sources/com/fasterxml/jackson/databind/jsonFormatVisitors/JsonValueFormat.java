package com.fasterxml.jackson.databind.jsonFormatVisitors;

public enum JsonValueFormat {
    COLOR("color"),
    DATE("date"),
    DATE_TIME("date-time"),
    EMAIL("email"),
    HOST_NAME("host-name"),
    IP_ADDRESS("ip-address"),
    IPV6("ipv6"),
    PHONE("phone"),
    REGEX("regex"),
    STYLE("style"),
    TIME("time"),
    URI("uri"),
    UTC_MILLISEC("utc-millisec"),
    UUID(ZendeskIdentityStorage.UUID_KEY);
    
    private final String _desc;

    /* access modifiers changed from: public */
    JsonValueFormat(String str) {
        this._desc = str;
    }

    @k73
    public String toString() {
        return this._desc;
    }
}
