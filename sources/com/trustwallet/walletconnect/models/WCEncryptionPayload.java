package com.trustwallet.walletconnect.models;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/WCEncryptionPayload;", "", "data", "", "hmac", "iv", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getHmac", "getIv", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCEncryptionPayload.kt */
public final class WCEncryptionPayload {
    private final String data;
    private final String hmac;

    /* renamed from: iv */
    private final String f27002iv;

    public WCEncryptionPayload(String str, String str2, String str3) {
        vx2.m53591g(str, "data");
        vx2.m53591g(str2, "hmac");
        vx2.m53591g(str3, "iv");
        this.data = str;
        this.hmac = str2;
        this.f27002iv = str3;
    }

    public static /* synthetic */ WCEncryptionPayload copy$default(WCEncryptionPayload wCEncryptionPayload, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wCEncryptionPayload.data;
        }
        if ((i & 2) != 0) {
            str2 = wCEncryptionPayload.hmac;
        }
        if ((i & 4) != 0) {
            str3 = wCEncryptionPayload.f27002iv;
        }
        return wCEncryptionPayload.copy(str, str2, str3);
    }

    public final String component1() {
        return this.data;
    }

    public final String component2() {
        return this.hmac;
    }

    public final String component3() {
        return this.f27002iv;
    }

    public final WCEncryptionPayload copy(String str, String str2, String str3) {
        vx2.m53591g(str, "data");
        vx2.m53591g(str2, "hmac");
        vx2.m53591g(str3, "iv");
        return new WCEncryptionPayload(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCEncryptionPayload)) {
            return false;
        }
        WCEncryptionPayload wCEncryptionPayload = (WCEncryptionPayload) obj;
        return vx2.m53586b(this.data, wCEncryptionPayload.data) && vx2.m53586b(this.hmac, wCEncryptionPayload.hmac) && vx2.m53586b(this.f27002iv, wCEncryptionPayload.f27002iv);
    }

    public final String getData() {
        return this.data;
    }

    public final String getHmac() {
        return this.hmac;
    }

    public final String getIv() {
        return this.f27002iv;
    }

    public int hashCode() {
        return (((this.data.hashCode() * 31) + this.hmac.hashCode()) * 31) + this.f27002iv.hashCode();
    }

    public String toString() {
        return "WCEncryptionPayload(data=" + this.data + ", hmac=" + this.hmac + ", iv=" + this.f27002iv + ')';
    }
}
