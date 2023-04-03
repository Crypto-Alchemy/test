package com.trustwallet.walletconnect.models.session;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0003R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/session/WCSession;", "", "topic", "", "version", "bridge", "key", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBridge", "()Ljava/lang/String;", "getKey", "getTopic", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "toUri", "Companion", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSession.kt */
public final class WCSession {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String bridge;
    private final String key;
    private final String topic;
    private final String version;

    @Metadata(mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0005¨\u0006\u0006"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/session/WCSession$Companion;", "", "()V", "from", "Lcom/trustwallet/walletconnect/models/session/WCSession;", "", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCSession.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WCSession from(String str) {
            vx2.m53591g(str, "from");
            if (!yb6.m74336M(str, "wc:", false, 2, (Object) null)) {
                return null;
            }
            Uri parse = Uri.parse(yb6.m74332I(str, "wc:", "wc://", false, 4, (Object) null));
            String queryParameter = parse.getQueryParameter("bridge");
            String queryParameter2 = parse.getQueryParameter("key");
            String userInfo = parse.getUserInfo();
            String host = parse.getHost();
            if (queryParameter == null || queryParameter2 == null || userInfo == null || host == null) {
                return null;
            }
            return new WCSession(userInfo, host, queryParameter, queryParameter2);
        }
    }

    public WCSession(String str, String str2, String str3, String str4) {
        vx2.m53591g(str, "topic");
        vx2.m53591g(str2, "version");
        vx2.m53591g(str3, "bridge");
        vx2.m53591g(str4, "key");
        this.topic = str;
        this.version = str2;
        this.bridge = str3;
        this.key = str4;
    }

    public static /* synthetic */ WCSession copy$default(WCSession wCSession, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wCSession.topic;
        }
        if ((i & 2) != 0) {
            str2 = wCSession.version;
        }
        if ((i & 4) != 0) {
            str3 = wCSession.bridge;
        }
        if ((i & 8) != 0) {
            str4 = wCSession.key;
        }
        return wCSession.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.topic;
    }

    public final String component2() {
        return this.version;
    }

    public final String component3() {
        return this.bridge;
    }

    public final String component4() {
        return this.key;
    }

    public final WCSession copy(String str, String str2, String str3, String str4) {
        vx2.m53591g(str, "topic");
        vx2.m53591g(str2, "version");
        vx2.m53591g(str3, "bridge");
        vx2.m53591g(str4, "key");
        return new WCSession(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCSession)) {
            return false;
        }
        WCSession wCSession = (WCSession) obj;
        return vx2.m53586b(this.topic, wCSession.topic) && vx2.m53586b(this.version, wCSession.version) && vx2.m53586b(this.bridge, wCSession.bridge) && vx2.m53586b(this.key, wCSession.key);
    }

    public final String getBridge() {
        return this.bridge;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((this.topic.hashCode() * 31) + this.version.hashCode()) * 31) + this.bridge.hashCode()) * 31) + this.key.hashCode();
    }

    public String toString() {
        return "WCSession(topic=" + this.topic + ", version=" + this.version + ", bridge=" + this.bridge + ", key=" + this.key + ')';
    }

    public final String toUri() {
        return "wc:" + this.topic + '@' + this.version + "?bridge=" + this.bridge + "&key=" + this.key;
    }
}
