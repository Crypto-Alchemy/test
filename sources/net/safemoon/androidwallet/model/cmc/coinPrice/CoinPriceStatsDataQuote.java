package net.safemoon.androidwallet.model.cmc.coinPrice;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsDataQuote;", "Ljava/io/Serializable;", "usd", "Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsUsd;", "(Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsUsd;)V", "getUsd", "()Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsUsd;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CoinPriceStatsDataQuote.kt */
public final class CoinPriceStatsDataQuote implements Serializable {
    @SerializedName("USD")
    private final CoinPriceStatsUsd usd;

    public CoinPriceStatsDataQuote(CoinPriceStatsUsd coinPriceStatsUsd) {
        vx2.m53591g(coinPriceStatsUsd, "usd");
        this.usd = coinPriceStatsUsd;
    }

    public static /* synthetic */ CoinPriceStatsDataQuote copy$default(CoinPriceStatsDataQuote coinPriceStatsDataQuote, CoinPriceStatsUsd coinPriceStatsUsd, int i, Object obj) {
        if ((i & 1) != 0) {
            coinPriceStatsUsd = coinPriceStatsDataQuote.usd;
        }
        return coinPriceStatsDataQuote.copy(coinPriceStatsUsd);
    }

    public final CoinPriceStatsUsd component1() {
        return this.usd;
    }

    public final CoinPriceStatsDataQuote copy(CoinPriceStatsUsd coinPriceStatsUsd) {
        vx2.m53591g(coinPriceStatsUsd, "usd");
        return new CoinPriceStatsDataQuote(coinPriceStatsUsd);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoinPriceStatsDataQuote) && vx2.m53586b(this.usd, ((CoinPriceStatsDataQuote) obj).usd);
    }

    public final CoinPriceStatsUsd getUsd() {
        return this.usd;
    }

    public int hashCode() {
        return this.usd.hashCode();
    }

    public String toString() {
        CoinPriceStatsUsd coinPriceStatsUsd = this.usd;
        return "CoinPriceStatsDataQuote(usd=" + coinPriceStatsUsd + ")";
    }
}
