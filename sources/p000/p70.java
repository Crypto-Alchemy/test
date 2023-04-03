package p000;

import com.google.gson.JsonObject;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.HistoricalList;
import net.safemoon.androidwallet.model.cmc.coinPrice.CoinPriceStats;
import net.safemoon.androidwallet.model.cmcTokenInfo.CmcTokenInfo;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JV\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H'JJ\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'JV\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H'JJ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\t2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'J\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\b\b\u0001\u0010\u000e\u001a\u00020\u0018H'¨\u0006\u001a"}, mo44877d2 = {"Lp70;", "", "", "symbol", "time_start", "time_end", "convert", "time_period", "interval", "Lk90;", "Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStats;", "g", "Lnet/safemoon/androidwallet/model/HistoricalList;", "c", "id", "e", "h", "symbols", "Lcom/google/gson/JsonObject;", "b", "a", "address", "Lnet/safemoon/androidwallet/model/cmcTokenInfo/CmcTokenInfo;", "d", "", "f", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: p70 */
/* compiled from: CMCApiInterface.kt */
public interface p70 {
    @le2("/v1/cryptocurrency/quotes/latest?")
    @rl2({"Cache-Control: no-cache"})
    /* renamed from: a */
    k90<JsonObject> mo65249a(@sz4("id") String str, @sz4("convert") String str2);

    @le2("/v1/cryptocurrency/quotes/latest?")
    @rl2({"Cache-Control: no-cache"})
    /* renamed from: b */
    k90<JsonObject> mo65250b(@sz4("symbol") String str, @sz4("convert") String str2);

    @le2("/v1/cryptocurrency/quotes/historical?")
    /* renamed from: c */
    k90<HistoricalList> mo65251c(@sz4("symbol") String str, @sz4("interval") String str2, @sz4("time_start") String str3, @sz4("time_end") String str4, @sz4("convert") String str5);

    @le2("/v1/cryptocurrency/info")
    @rl2({"Cache-Control:max-age=600"})
    /* renamed from: d */
    k90<CmcTokenInfo> mo65252d(@sz4("address") String str);

    @le2("/v1/cryptocurrency/ohlcv/historical")
    /* renamed from: e */
    k90<CoinPriceStats> mo65253e(@sz4("id") String str, @sz4("time_start") String str2, @sz4("time_end") String str3, @sz4("convert") String str4, @sz4("time_period") String str5, @sz4("interval") String str6);

    @le2("/v1/cryptocurrency/info")
    @rl2({"Cache-Control:max-age=600"})
    /* renamed from: f */
    k90<CmcTokenInfo> mo65254f(@sz4("id") int i);

    @le2("/v1/cryptocurrency/ohlcv/historical")
    /* renamed from: g */
    k90<CoinPriceStats> mo65255g(@sz4("symbol") String str, @sz4("time_start") String str2, @sz4("time_end") String str3, @sz4("convert") String str4, @sz4("time_period") String str5, @sz4("interval") String str6);

    @le2("/v1/cryptocurrency/quotes/historical?")
    /* renamed from: h */
    k90<HistoricalList> mo65256h(@sz4("id") String str, @sz4("interval") String str2, @sz4("time_start") String str3, @sz4("time_end") String str4, @sz4("convert") String str5);
}
