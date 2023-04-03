package net.safemoon.androidwallet.model.cmc.coinPrice;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsDataQuoteList;", "", "openTimestamp", "", "closeTimestamp", "lowTimestamp", "highTimestamp", "quote", "Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsDataQuote;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsDataQuote;)V", "getCloseTimestamp", "()Ljava/lang/String;", "getHighTimestamp", "getLowTimestamp", "getOpenTimestamp", "getQuote", "()Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsDataQuote;", "setQuote", "(Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsDataQuote;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CoinPriceStatsDataQuoteList.kt */
public final class CoinPriceStatsDataQuoteList {
    @SerializedName("time_close")
    private final String closeTimestamp;
    @SerializedName("time_high")
    private final String highTimestamp;
    @SerializedName("time_low")
    private final String lowTimestamp;
    @SerializedName("time_open")
    private final String openTimestamp;
    @SerializedName("quote")
    private CoinPriceStatsDataQuote quote;

    public CoinPriceStatsDataQuoteList(String str, String str2, String str3, String str4, CoinPriceStatsDataQuote coinPriceStatsDataQuote) {
        vx2.m53591g(str, "openTimestamp");
        vx2.m53591g(str2, "closeTimestamp");
        vx2.m53591g(str3, "lowTimestamp");
        vx2.m53591g(str4, "highTimestamp");
        vx2.m53591g(coinPriceStatsDataQuote, "quote");
        this.openTimestamp = str;
        this.closeTimestamp = str2;
        this.lowTimestamp = str3;
        this.highTimestamp = str4;
        this.quote = coinPriceStatsDataQuote;
    }

    public static /* synthetic */ CoinPriceStatsDataQuoteList copy$default(CoinPriceStatsDataQuoteList coinPriceStatsDataQuoteList, String str, String str2, String str3, String str4, CoinPriceStatsDataQuote coinPriceStatsDataQuote, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coinPriceStatsDataQuoteList.openTimestamp;
        }
        if ((i & 2) != 0) {
            str2 = coinPriceStatsDataQuoteList.closeTimestamp;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = coinPriceStatsDataQuoteList.lowTimestamp;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = coinPriceStatsDataQuoteList.highTimestamp;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            coinPriceStatsDataQuote = coinPriceStatsDataQuoteList.quote;
        }
        return coinPriceStatsDataQuoteList.copy(str, str5, str6, str7, coinPriceStatsDataQuote);
    }

    public final String component1() {
        return this.openTimestamp;
    }

    public final String component2() {
        return this.closeTimestamp;
    }

    public final String component3() {
        return this.lowTimestamp;
    }

    public final String component4() {
        return this.highTimestamp;
    }

    public final CoinPriceStatsDataQuote component5() {
        return this.quote;
    }

    public final CoinPriceStatsDataQuoteList copy(String str, String str2, String str3, String str4, CoinPriceStatsDataQuote coinPriceStatsDataQuote) {
        vx2.m53591g(str, "openTimestamp");
        vx2.m53591g(str2, "closeTimestamp");
        vx2.m53591g(str3, "lowTimestamp");
        vx2.m53591g(str4, "highTimestamp");
        vx2.m53591g(coinPriceStatsDataQuote, "quote");
        return new CoinPriceStatsDataQuoteList(str, str2, str3, str4, coinPriceStatsDataQuote);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinPriceStatsDataQuoteList)) {
            return false;
        }
        CoinPriceStatsDataQuoteList coinPriceStatsDataQuoteList = (CoinPriceStatsDataQuoteList) obj;
        return vx2.m53586b(this.openTimestamp, coinPriceStatsDataQuoteList.openTimestamp) && vx2.m53586b(this.closeTimestamp, coinPriceStatsDataQuoteList.closeTimestamp) && vx2.m53586b(this.lowTimestamp, coinPriceStatsDataQuoteList.lowTimestamp) && vx2.m53586b(this.highTimestamp, coinPriceStatsDataQuoteList.highTimestamp) && vx2.m53586b(this.quote, coinPriceStatsDataQuoteList.quote);
    }

    public final String getCloseTimestamp() {
        return this.closeTimestamp;
    }

    public final String getHighTimestamp() {
        return this.highTimestamp;
    }

    public final String getLowTimestamp() {
        return this.lowTimestamp;
    }

    public final String getOpenTimestamp() {
        return this.openTimestamp;
    }

    public final CoinPriceStatsDataQuote getQuote() {
        return this.quote;
    }

    public int hashCode() {
        return (((((((this.openTimestamp.hashCode() * 31) + this.closeTimestamp.hashCode()) * 31) + this.lowTimestamp.hashCode()) * 31) + this.highTimestamp.hashCode()) * 31) + this.quote.hashCode();
    }

    public final void setQuote(CoinPriceStatsDataQuote coinPriceStatsDataQuote) {
        vx2.m53591g(coinPriceStatsDataQuote, "<set-?>");
        this.quote = coinPriceStatsDataQuote;
    }

    public String toString() {
        String str = this.openTimestamp;
        String str2 = this.closeTimestamp;
        String str3 = this.lowTimestamp;
        String str4 = this.highTimestamp;
        CoinPriceStatsDataQuote coinPriceStatsDataQuote = this.quote;
        return "CoinPriceStatsDataQuoteList(openTimestamp=" + str + ", closeTimestamp=" + str2 + ", lowTimestamp=" + str3 + ", highTimestamp=" + str4 + ", quote=" + coinPriceStatsDataQuote + ")";
    }
}
