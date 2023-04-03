package com.trustwallet.walletconnect.models.binance;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceTradePair;", "", "from", "", "to", "(Ljava/lang/String;Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "getTo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCBinanceTradePair.kt */
public final class WCBinanceTradePair {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String from;

    /* renamed from: to */
    private final String f27005to;

    @Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceTradePair$Companion;", "", "()V", "from", "Lcom/trustwallet/walletconnect/models/binance/WCBinanceTradePair;", "symbol", "", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCBinanceTradePair.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WCBinanceTradePair from(String str) {
            vx2.m53591g(str, "symbol");
            List B0 = StringsKt__StringsKt.m63061B0(str, new String[]{"_"}, false, 0, 6, (Object) null);
            if (B0.size() <= 1) {
                return null;
            }
            return new WCBinanceTradePair((String) StringsKt__StringsKt.m63061B0((CharSequence) B0.get(0), new String[]{"-"}, false, 0, 6, (Object) null).get(0), (String) StringsKt__StringsKt.m63061B0((CharSequence) B0.get(1), new String[]{"-"}, false, 0, 6, (Object) null).get(0));
        }
    }

    public WCBinanceTradePair(String str, String str2) {
        vx2.m53591g(str, "from");
        vx2.m53591g(str2, "to");
        this.from = str;
        this.f27005to = str2;
    }

    public static /* synthetic */ WCBinanceTradePair copy$default(WCBinanceTradePair wCBinanceTradePair, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wCBinanceTradePair.from;
        }
        if ((i & 2) != 0) {
            str2 = wCBinanceTradePair.f27005to;
        }
        return wCBinanceTradePair.copy(str, str2);
    }

    public final String component1() {
        return this.from;
    }

    public final String component2() {
        return this.f27005to;
    }

    public final WCBinanceTradePair copy(String str, String str2) {
        vx2.m53591g(str, "from");
        vx2.m53591g(str2, "to");
        return new WCBinanceTradePair(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCBinanceTradePair)) {
            return false;
        }
        WCBinanceTradePair wCBinanceTradePair = (WCBinanceTradePair) obj;
        return vx2.m53586b(this.from, wCBinanceTradePair.from) && vx2.m53586b(this.f27005to, wCBinanceTradePair.f27005to);
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getTo() {
        return this.f27005to;
    }

    public int hashCode() {
        return (this.from.hashCode() * 31) + this.f27005to.hashCode();
    }

    public String toString() {
        return "WCBinanceTradePair(from=" + this.from + ", to=" + this.f27005to + ')';
    }
}
