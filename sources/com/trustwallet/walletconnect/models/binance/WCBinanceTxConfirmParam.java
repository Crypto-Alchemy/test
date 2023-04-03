package com.trustwallet.walletconnect.models.binance;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/binance/WCBinanceTxConfirmParam;", "", "ok", "", "errorMsg", "", "(ZLjava/lang/String;)V", "getErrorMsg", "()Ljava/lang/String;", "getOk", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCBinanceOrder.kt */
public final class WCBinanceTxConfirmParam {
    private final String errorMsg;

    /* renamed from: ok */
    private final boolean f27006ok;

    public WCBinanceTxConfirmParam(boolean z, String str) {
        this.f27006ok = z;
        this.errorMsg = str;
    }

    public static /* synthetic */ WCBinanceTxConfirmParam copy$default(WCBinanceTxConfirmParam wCBinanceTxConfirmParam, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wCBinanceTxConfirmParam.f27006ok;
        }
        if ((i & 2) != 0) {
            str = wCBinanceTxConfirmParam.errorMsg;
        }
        return wCBinanceTxConfirmParam.copy(z, str);
    }

    public final boolean component1() {
        return this.f27006ok;
    }

    public final String component2() {
        return this.errorMsg;
    }

    public final WCBinanceTxConfirmParam copy(boolean z, String str) {
        return new WCBinanceTxConfirmParam(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCBinanceTxConfirmParam)) {
            return false;
        }
        WCBinanceTxConfirmParam wCBinanceTxConfirmParam = (WCBinanceTxConfirmParam) obj;
        return this.f27006ok == wCBinanceTxConfirmParam.f27006ok && vx2.m53586b(this.errorMsg, wCBinanceTxConfirmParam.errorMsg);
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final boolean getOk() {
        return this.f27006ok;
    }

    public int hashCode() {
        boolean z = this.f27006ok;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.errorMsg;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "WCBinanceTxConfirmParam(ok=" + this.f27006ok + ", errorMsg=" + this.errorMsg + ')';
    }
}
