package net.safemoon.androidwallet.model.cmc.coinPrice;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.Status;

@Metadata(mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStats;", "Ljava/io/Serializable;", "data", "Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsData;", "status", "Lnet/safemoon/androidwallet/model/Status;", "(Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsData;Lnet/safemoon/androidwallet/model/Status;)V", "getData", "()Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsData;", "getStatus", "()Lnet/safemoon/androidwallet/model/Status;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CoinPriceStats.kt */
public final class CoinPriceStats implements Serializable {
    @SerializedName("data")
    private final CoinPriceStatsData data;
    @SerializedName("status")
    private final Status status;

    public CoinPriceStats(CoinPriceStatsData coinPriceStatsData, Status status2) {
        vx2.m53591g(status2, "status");
        this.data = coinPriceStatsData;
        this.status = status2;
    }

    public static /* synthetic */ CoinPriceStats copy$default(CoinPriceStats coinPriceStats, CoinPriceStatsData coinPriceStatsData, Status status2, int i, Object obj) {
        if ((i & 1) != 0) {
            coinPriceStatsData = coinPriceStats.data;
        }
        if ((i & 2) != 0) {
            status2 = coinPriceStats.status;
        }
        return coinPriceStats.copy(coinPriceStatsData, status2);
    }

    public final CoinPriceStatsData component1() {
        return this.data;
    }

    public final Status component2() {
        return this.status;
    }

    public final CoinPriceStats copy(CoinPriceStatsData coinPriceStatsData, Status status2) {
        vx2.m53591g(status2, "status");
        return new CoinPriceStats(coinPriceStatsData, status2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinPriceStats)) {
            return false;
        }
        CoinPriceStats coinPriceStats = (CoinPriceStats) obj;
        return vx2.m53586b(this.data, coinPriceStats.data) && vx2.m53586b(this.status, coinPriceStats.status);
    }

    public final CoinPriceStatsData getData() {
        return this.data;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        CoinPriceStatsData coinPriceStatsData = this.data;
        return ((coinPriceStatsData == null ? 0 : coinPriceStatsData.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        CoinPriceStatsData coinPriceStatsData = this.data;
        Status status2 = this.status;
        return "CoinPriceStats(data=" + coinPriceStatsData + ", status=" + status2 + ")";
    }
}
