package net.safemoon.androidwallet.common;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/ActiveTokenListMode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "RECENT", "GAINER", "LOSER", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: ActiveTokenListMode.kt */
public enum ActiveTokenListMode {
    RECENT("recent"),
    GAINER("gainer"),
    LOSER("loser");
    
    private final String value;

    /* access modifiers changed from: public */
    ActiveTokenListMode(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
