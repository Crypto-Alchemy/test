package net.safemoon.androidwallet.model.tokensInfo;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokensInfoResult;", "", "data", "", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CurrencyTokensInfoResult.kt */
public final class CurrencyTokensInfoResult {
    @SerializedName("data")
    private final List<CurrencyTokenInfo> data;

    public CurrencyTokensInfoResult() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public CurrencyTokensInfoResult(List<CurrencyTokenInfo> list) {
        this.data = list;
    }

    public static /* synthetic */ CurrencyTokensInfoResult copy$default(CurrencyTokensInfoResult currencyTokensInfoResult, List<CurrencyTokenInfo> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = currencyTokensInfoResult.data;
        }
        return currencyTokensInfoResult.copy(list);
    }

    public final List<CurrencyTokenInfo> component1() {
        return this.data;
    }

    public final CurrencyTokensInfoResult copy(List<CurrencyTokenInfo> list) {
        return new CurrencyTokensInfoResult(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CurrencyTokensInfoResult) && vx2.m53586b(this.data, ((CurrencyTokensInfoResult) obj).data);
    }

    public final List<CurrencyTokenInfo> getData() {
        return this.data;
    }

    public int hashCode() {
        List<CurrencyTokenInfo> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<CurrencyTokenInfo> list = this.data;
        return "CurrencyTokensInfoResult(data=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CurrencyTokensInfoResult(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
