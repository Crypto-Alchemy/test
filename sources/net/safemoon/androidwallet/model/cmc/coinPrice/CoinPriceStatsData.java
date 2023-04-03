package net.safemoon.androidwallet.model.cmc.coinPrice;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsData;", "Ljava/io/Serializable;", "id", "", "name", "", "symbol", "quote", "", "Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStatsDataQuoteList;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getQuote", "()Ljava/util/List;", "getSymbol", "setSymbol", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CoinPriceStatsData.kt */
public final class CoinPriceStatsData implements Serializable {
    @SerializedName("id")

    /* renamed from: id */
    private final int f42450id;
    @SerializedName("name")
    private final String name;
    @SerializedName("quotes")
    private final List<CoinPriceStatsDataQuoteList> quote;
    @SerializedName("symbol")
    private String symbol;

    public CoinPriceStatsData(int i, String str, String str2, List<CoinPriceStatsDataQuoteList> list) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "symbol");
        vx2.m53591g(list, "quote");
        this.f42450id = i;
        this.name = str;
        this.symbol = str2;
        this.quote = list;
    }

    public static /* synthetic */ CoinPriceStatsData copy$default(CoinPriceStatsData coinPriceStatsData, int i, String str, String str2, List<CoinPriceStatsDataQuoteList> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = coinPriceStatsData.f42450id;
        }
        if ((i2 & 2) != 0) {
            str = coinPriceStatsData.name;
        }
        if ((i2 & 4) != 0) {
            str2 = coinPriceStatsData.symbol;
        }
        if ((i2 & 8) != 0) {
            list = coinPriceStatsData.quote;
        }
        return coinPriceStatsData.copy(i, str, str2, list);
    }

    public final int component1() {
        return this.f42450id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.symbol;
    }

    public final List<CoinPriceStatsDataQuoteList> component4() {
        return this.quote;
    }

    public final CoinPriceStatsData copy(int i, String str, String str2, List<CoinPriceStatsDataQuoteList> list) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "symbol");
        vx2.m53591g(list, "quote");
        return new CoinPriceStatsData(i, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinPriceStatsData)) {
            return false;
        }
        CoinPriceStatsData coinPriceStatsData = (CoinPriceStatsData) obj;
        return this.f42450id == coinPriceStatsData.f42450id && vx2.m53586b(this.name, coinPriceStatsData.name) && vx2.m53586b(this.symbol, coinPriceStatsData.symbol) && vx2.m53586b(this.quote, coinPriceStatsData.quote);
    }

    public final int getId() {
        return this.f42450id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<CoinPriceStatsDataQuoteList> getQuote() {
        return this.quote;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (((((this.f42450id * 31) + this.name.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.quote.hashCode();
    }

    public final void setSymbol(String str) {
        vx2.m53591g(str, "<set-?>");
        this.symbol = str;
    }

    public String toString() {
        int i = this.f42450id;
        String str = this.name;
        String str2 = this.symbol;
        List<CoinPriceStatsDataQuoteList> list = this.quote;
        return "CoinPriceStatsData(id=" + i + ", name=" + str + ", symbol=" + str2 + ", quote=" + list + ")";
    }
}
