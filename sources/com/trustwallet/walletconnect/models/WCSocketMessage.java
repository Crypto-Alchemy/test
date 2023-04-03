package com.trustwallet.walletconnect.models;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/WCSocketMessage;", "", "topic", "", "type", "Lcom/trustwallet/walletconnect/models/MessageType;", "payload", "(Ljava/lang/String;Lcom/trustwallet/walletconnect/models/MessageType;Ljava/lang/String;)V", "getPayload", "()Ljava/lang/String;", "getTopic", "getType", "()Lcom/trustwallet/walletconnect/models/MessageType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSocketMessage.kt */
public final class WCSocketMessage {
    private final String payload;
    private final String topic;
    private final MessageType type;

    public WCSocketMessage(String str, MessageType messageType, String str2) {
        vx2.m53591g(str, "topic");
        vx2.m53591g(messageType, "type");
        vx2.m53591g(str2, "payload");
        this.topic = str;
        this.type = messageType;
        this.payload = str2;
    }

    public static /* synthetic */ WCSocketMessage copy$default(WCSocketMessage wCSocketMessage, String str, MessageType messageType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wCSocketMessage.topic;
        }
        if ((i & 2) != 0) {
            messageType = wCSocketMessage.type;
        }
        if ((i & 4) != 0) {
            str2 = wCSocketMessage.payload;
        }
        return wCSocketMessage.copy(str, messageType, str2);
    }

    public final String component1() {
        return this.topic;
    }

    public final MessageType component2() {
        return this.type;
    }

    public final String component3() {
        return this.payload;
    }

    public final WCSocketMessage copy(String str, MessageType messageType, String str2) {
        vx2.m53591g(str, "topic");
        vx2.m53591g(messageType, "type");
        vx2.m53591g(str2, "payload");
        return new WCSocketMessage(str, messageType, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCSocketMessage)) {
            return false;
        }
        WCSocketMessage wCSocketMessage = (WCSocketMessage) obj;
        return vx2.m53586b(this.topic, wCSocketMessage.topic) && this.type == wCSocketMessage.type && vx2.m53586b(this.payload, wCSocketMessage.payload);
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final MessageType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.topic.hashCode() * 31) + this.type.hashCode()) * 31) + this.payload.hashCode();
    }

    public String toString() {
        return "WCSocketMessage(topic=" + this.topic + ", type=" + this.type + ", payload=" + this.payload + ')';
    }
}
