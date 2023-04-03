package net.safemoon.androidwallet.model.tokensInfo;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfoResult;", "", "data", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;", "(Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;)V", "getData", "()Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CurrencyTokenInfoResult.kt */
public final class CurrencyTokenInfoResult {
    @SerializedName("data")
    private final CurrencyTokenInfo data;

    public CurrencyTokenInfoResult() {
        this((CurrencyTokenInfo) null, 1, (DefaultConstructorMarker) null);
    }

    public CurrencyTokenInfoResult(CurrencyTokenInfo currencyTokenInfo) {
        this.data = currencyTokenInfo;
    }

    public static /* synthetic */ CurrencyTokenInfoResult copy$default(CurrencyTokenInfoResult currencyTokenInfoResult, CurrencyTokenInfo currencyTokenInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            currencyTokenInfo = currencyTokenInfoResult.data;
        }
        return currencyTokenInfoResult.copy(currencyTokenInfo);
    }

    public final CurrencyTokenInfo component1() {
        return this.data;
    }

    public final CurrencyTokenInfoResult copy(CurrencyTokenInfo currencyTokenInfo) {
        return new CurrencyTokenInfoResult(currencyTokenInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CurrencyTokenInfoResult) && vx2.m53586b(this.data, ((CurrencyTokenInfoResult) obj).data);
    }

    public final CurrencyTokenInfo getData() {
        return this.data;
    }

    public int hashCode() {
        CurrencyTokenInfo currencyTokenInfo = this.data;
        if (currencyTokenInfo == null) {
            return 0;
        }
        return currencyTokenInfo.hashCode();
    }

    public String toString() {
        CurrencyTokenInfo currencyTokenInfo = this.data;
        return "CurrencyTokenInfoResult(data=" + currencyTokenInfo + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CurrencyTokenInfoResult(CurrencyTokenInfo currencyTokenInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : currencyTokenInfo);
    }
}
