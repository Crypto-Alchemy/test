package net.safemoon.androidwallet.viewmodels;

import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.Data;
import net.safemoon.androidwallet.model.HistoricalDatum;
import net.safemoon.androidwallet.model.HistoricalList;
import net.safemoon.androidwallet.model.USDT;
import net.safemoon.androidwallet.model.cmc.coinPrice.CoinPriceStats;
import net.safemoon.androidwallet.model.cmc.coinPrice.CoinPriceStatsData;
import net.safemoon.androidwallet.model.cmc.coinPrice.CoinPriceStatsDataQuoteList;
import net.safemoon.androidwallet.model.cmc.coinPrice.CoinPriceStatsUsd;
import net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo;
import org.web3j.abi.datatypes.Address;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b,\u0010-J0\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J0\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R%\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010 \u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001f\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00168\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00168\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001f\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00168\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\"\u0010\u001cR0\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020(j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`)8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010*¨\u0006."}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/GraphViewModel;", "Lad7;", "", "symbol", "cmcId", "startDate", "_endDate", "timeperiod", "Lr37;", "f", "interval", "g", "address", "h", "Lp70;", "a", "Lp70;", "cmcApiInterface", "Lho3;", "b", "Lho3;", "marketApiInterface", "Lk04;", "", "kotlin.jvm.PlatformType", "c", "Lk04;", "j", "()Lk04;", "isDecimalsVisibleForLineData", "d", "i", "isDecimalsVisibleForCandleData", "Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStats;", "e", "coinPriceStatsCandleGraphData", "Lnet/safemoon/androidwallet/model/HistoricalList;", "coinPriceStatsLineGraphData", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;", "currencyTokenInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "mapHistory", "<init>", "(Lp70;Lho3;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: GraphViewModel.kt */
public final class GraphViewModel extends ad7 {

    /* renamed from: a */
    public final p70 f42727a;

    /* renamed from: b */
    public final ho3 f42728b;

    /* renamed from: c */
    public final k04<Boolean> f42729c;

    /* renamed from: d */
    public final k04<Boolean> f42730d;

    /* renamed from: e */
    public final k04<CoinPriceStats> f42731e = new k04<>();

    /* renamed from: f */
    public final k04<HistoricalList> f42732f = new k04<>();

    /* renamed from: g */
    public final k04<CurrencyTokenInfo> f42733g = new k04<>(null);

    /* renamed from: h */
    public final HashMap<String, String> f42734h = new HashMap<>();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/GraphViewModel$a", "Lig5;", "Lnet/safemoon/androidwallet/model/cmc/coinPrice/CoinPriceStats;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.GraphViewModel$a */
    /* compiled from: GraphViewModel.kt */
    public static final class C8688a extends ig5<CoinPriceStats> {

        /* renamed from: a */
        public final /* synthetic */ GraphViewModel f42735a;

        /* renamed from: b */
        public final /* synthetic */ String f42736b;

        public C8688a(GraphViewModel graphViewModel, String str) {
            this.f42735a = graphViewModel;
            this.f42736b = str;
        }

        /* renamed from: a */
        public void mo47103a(k90<CoinPriceStats> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            super.mo47103a(k90, th);
            this.f42735a.mo61213c().setValue(null);
        }

        /* renamed from: b */
        public void mo47104b(k90<CoinPriceStats> k90, bg5<CoinPriceStats> bg5) {
            List<CoinPriceStatsDataQuoteList> quote;
            CoinPriceStatsData data;
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            CoinPriceStats a = bg5.mo50578a();
            if (!(a == null || (data = a.getData()) == null)) {
                data.setSymbol(q70.m71191g(data.getSymbol(), this.f42736b));
            }
            k04<CoinPriceStats> c = this.f42735a.mo61213c();
            if (a != null) {
                CoinPriceStatsData data2 = a.getData();
                if (!(data2 == null || (quote = data2.getQuote()) == null)) {
                    for (CoinPriceStatsDataQuoteList quote2 : quote) {
                        CoinPriceStatsUsd usd = quote2.getQuote().getUsd();
                        usd.setOpenValue((float) sz1.m72124a((double) usd.getOpenValue()));
                        usd.setCloseValue((float) sz1.m72124a((double) usd.getCloseValue()));
                        usd.setHighValue((float) sz1.m72124a((double) usd.getHighValue()));
                        usd.setLowValue((float) sz1.m72124a((double) usd.getLowValue()));
                    }
                }
            } else {
                a = null;
            }
            c.setValue(a);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/GraphViewModel$b", "Lig5;", "Lnet/safemoon/androidwallet/model/HistoricalList;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.GraphViewModel$b */
    /* compiled from: GraphViewModel.kt */
    public static final class C8689b extends ig5<HistoricalList> {

        /* renamed from: a */
        public final /* synthetic */ GraphViewModel f42737a;

        /* renamed from: b */
        public final /* synthetic */ String f42738b;

        public C8689b(GraphViewModel graphViewModel, String str) {
            this.f42737a = graphViewModel;
            this.f42738b = str;
        }

        /* renamed from: a */
        public void mo47103a(k90<HistoricalList> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            super.mo47103a(k90, th);
            this.f42737a.mo61214d().setValue(null);
        }

        /* renamed from: b */
        public void mo47104b(k90<HistoricalList> k90, bg5<HistoricalList> bg5) {
            List<HistoricalDatum> quotes;
            Data data;
            vx2.m53591g(k90, "call");
            vx2.m53591g(bg5, "response");
            HistoricalList a = bg5.mo50578a();
            if (!(a == null || (data = a.getData()) == null)) {
                String str = this.f42738b;
                String symbol = data.getSymbol();
                vx2.m53590f(symbol, "this.symbol");
                data.setSymbol(q70.m71191g(symbol, str));
            }
            k04<HistoricalList> d = this.f42737a.mo61214d();
            if (a != null) {
                Data data2 = a.getData();
                if (!(data2 == null || (quotes = data2.getQuotes()) == null)) {
                    vx2.m53590f(quotes, "quotes");
                    for (HistoricalDatum quote : quotes) {
                        USDT usd = quote.getQuote().getUSD();
                        Double price = usd.getPrice();
                        vx2.m53590f(price, "price");
                        usd.setPrice(Double.valueOf(sz1.m72124a(price.doubleValue())));
                    }
                }
            } else {
                a = null;
            }
            d.setValue(a);
        }
    }

    public GraphViewModel(p70 p70, ho3 ho3) {
        vx2.m53591g(p70, "cmcApiInterface");
        vx2.m53591g(ho3, "marketApiInterface");
        this.f42727a = p70;
        this.f42728b = ho3;
        Boolean bool = Boolean.FALSE;
        this.f42729c = new k04<>(bool);
        this.f42730d = new k04<>(bool);
    }

    /* renamed from: c */
    public final k04<CoinPriceStats> mo61213c() {
        return this.f42731e;
    }

    /* renamed from: d */
    public final k04<HistoricalList> mo61214d() {
        return this.f42732f;
    }

    /* renamed from: e */
    public final k04<CurrencyTokenInfo> mo61215e() {
        return this.f42733g;
    }

    /* renamed from: f */
    public final void mo61216f(String str, String str2, String str3, String str4, String str5) {
        k90<CoinPriceStats> k90;
        vx2.m53591g(str, "symbol");
        vx2.m53591g(str3, "startDate");
        vx2.m53591g(str4, "_endDate");
        vx2.m53591g(str5, "timeperiod");
        String str6 = str + "-" + str2 + "-" + str3 + "-" + str5;
        if (this.f42734h.containsKey(str6)) {
            str4 = this.f42734h.get(str6);
        } else {
            this.f42734h.put(str6, str4);
        }
        String str7 = str4;
        if (str2 == null) {
            k90 = this.f42727a.mo65255g(q70.m71189e(str), str3, str7, "USD", str5, "1h");
        } else {
            k90 = this.f42727a.mo65253e(str2, str3, str7, "USD", str5, "1h");
        }
        k90.mo50512X(new C8688a(this, str));
    }

    /* renamed from: g */
    public final void mo61217g(String str, String str2, String str3, String str4, String str5) {
        k90<HistoricalList> k90;
        int i;
        vx2.m53591g(str, "symbol");
        vx2.m53591g(str3, "startDate");
        vx2.m53591g(str4, "_endDate");
        vx2.m53591g(str5, "interval");
        String str6 = str + "-" + str2 + "-" + str3 + "-" + str5;
        if (this.f42734h.containsKey(str6)) {
            str4 = this.f42734h.get(str6);
        } else {
            this.f42734h.put(str6, str4);
        }
        String str7 = str4;
        if (str2 != null) {
            Integer n = xb6.m73916n(str2);
            if (n != null) {
                i = n.intValue();
            } else {
                i = 0;
            }
            if (i != 0) {
                k90 = this.f42727a.mo65256h(str2, str5, str3, str7, "USD");
                k90.mo50512X(new C8689b(this, str));
            }
        }
        k90 = this.f42727a.mo65251c(q70.m71189e(str), str5, str3, str7, "USD");
        k90.mo50512X(new C8689b(this, str));
    }

    /* renamed from: h */
    public final void mo61218h(String str) {
        vx2.m53591g(str, Address.TYPE_NAME);
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new GraphViewModel$getPriceByAddress$1(this, str, (ns0<? super GraphViewModel$getPriceByAddress$1>) null), 3, (Object) null);
    }

    /* renamed from: i */
    public final k04<Boolean> mo61219i() {
        return this.f42730d;
    }

    /* renamed from: j */
    public final k04<Boolean> mo61220j() {
        return this.f42729c;
    }
}
