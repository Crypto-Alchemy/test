package p000;

import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.dialogs.GraphFragment;
import net.safemoon.androidwallet.dialogs.GraphTradingViewFragment;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.model.graph.TradingViewSymbol;
import net.safemoon.androidwallet.utils.ChartParameter;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J \u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001c\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002XD¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0002XD¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00178\u0002XD¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006!"}, mo44877d2 = {"Lce0;", "", "Lnet/safemoon/androidwallet/utils/ChartParameter;", "chartParameter", "Lkotlin/Function0;", "Lr37;", "onDone", "g", "Lnet/safemoon/androidwallet/model/graph/TradingViewSymbol;", "tradingSymbolToken", "i", "Lnet/safemoon/androidwallet/model/Coin;", "a", "Lnet/safemoon/androidwallet/model/Coin;", "f", "()Lnet/safemoon/androidwallet/model/Coin;", "coin", "Landroidx/fragment/app/FragmentManager;", "b", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "c", "Ljava/lang/String;", "USDT", "d", "BUSD", "e", "USDTUSD", "<init>", "(Lnet/safemoon/androidwallet/model/Coin;Landroidx/fragment/app/FragmentManager;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ce0 */
/* compiled from: ChartProvider.kt */
public final class ce0 {

    /* renamed from: f */
    public static final C6936a f37106f = new C6936a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static boolean f37107g;

    /* renamed from: a */
    public final Coin f37108a;

    /* renamed from: b */
    public final FragmentManager f37109b;

    /* renamed from: c */
    public final String f37110c = "USDT";

    /* renamed from: d */
    public final String f37111d = "BUSD";

    /* renamed from: e */
    public final String f37112e = "USDTUSD";

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Lce0$a;", "", "", "isLoading", "Z", "()Z", "a", "(Z)V", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ce0$a */
    /* compiled from: ChartProvider.kt */
    public static final class C6936a {
        public C6936a() {
        }

        public /* synthetic */ C6936a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo50873a(boolean z) {
            ce0.f37107g = z;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J0\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0006H\u0016J$\u0010\f\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\r"}, mo44877d2 = {"ce0$b", "Lp90;", "", "Lnet/safemoon/androidwallet/model/graph/TradingViewSymbol;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ce0$b */
    /* compiled from: ChartProvider.kt */
    public static final class C6937b implements p90<List<? extends TradingViewSymbol>> {

        /* renamed from: a */
        public final /* synthetic */ pc2<r37> f37113a;

        /* renamed from: b */
        public final /* synthetic */ ce0 f37114b;

        /* renamed from: c */
        public final /* synthetic */ ChartParameter f37115c;

        public C6937b(pc2<r37> pc2, ce0 ce0, ChartParameter chartParameter) {
            this.f37113a = pc2;
            this.f37114b = ce0;
            this.f37115c = chartParameter;
        }

        /* renamed from: a */
        public void mo47103a(k90<List<TradingViewSymbol>> k90, Throwable th) {
            vx2.m53591g(k90, "call");
            vx2.m53591g(th, "t");
            ce0.f37106f.mo50873a(false);
            pc2<r37> pc2 = this.f37113a;
            if (pc2 != null) {
                pc2.invoke();
            }
            this.f37114b.mo50872i((TradingViewSymbol) null, this.f37115c);
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3 A[EDGE_INSN: B:32:0x00b3->B:24:0x00b3 ?: BREAK  , SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo47104b(p000.k90<java.util.List<net.safemoon.androidwallet.model.graph.TradingViewSymbol>> r10, p000.bg5<java.util.List<net.safemoon.androidwallet.model.graph.TradingViewSymbol>> r11) {
            /*
                r9 = this;
                java.lang.String r0 = "call"
                p000.vx2.m53591g(r10, r0)
                java.lang.String r10 = "response"
                p000.vx2.m53591g(r11, r10)
                ce0$a r10 = p000.ce0.f37106f
                r0 = 0
                r10.mo50873a(r0)
                pc2<r37> r10 = r9.f37113a
                if (r10 == 0) goto L_0x0017
                r10.invoke()
            L_0x0017:
                ce0 r10 = r9.f37114b
                net.safemoon.androidwallet.model.Coin r10 = r10.mo50870f()
                java.lang.String r10 = r10.getSymbol()
                ce0 r1 = r9.f37114b
                java.lang.String r1 = r1.f37110c
                boolean r10 = r10.equals(r1)
                if (r10 == 0) goto L_0x0042
                net.safemoon.androidwallet.model.graph.TradingViewSymbol r10 = new net.safemoon.androidwallet.model.graph.TradingViewSymbol
                r10.<init>()
                ce0 r11 = r9.f37114b
                java.lang.String r11 = r11.f37112e
                r10.symbol = r11
                ce0 r11 = r9.f37114b
                net.safemoon.androidwallet.utils.ChartParameter r0 = r9.f37115c
                r11.mo50872i(r10, r0)
                return
            L_0x0042:
                ce0 r10 = r9.f37114b
                net.safemoon.androidwallet.model.Coin r10 = r10.mo50870f()
                java.lang.String r10 = r10.getSymbol()
                java.lang.String r1 = "coin.symbol"
                p000.vx2.m53590f(r10, r1)
                java.util.Locale r1 = java.util.Locale.ROOT
                java.lang.String r10 = r10.toLowerCase(r1)
                java.lang.String r1 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
                p000.vx2.m53590f(r10, r1)
                java.lang.String r1 = "safemoon"
                boolean r10 = p000.vx2.m53586b(r10, r1)
                r1 = 0
                if (r10 == 0) goto L_0x006d
                ce0 r10 = r9.f37114b
                net.safemoon.androidwallet.utils.ChartParameter r11 = r9.f37115c
                r10.mo50872i(r1, r11)
                return
            L_0x006d:
                ce0 r10 = r9.f37114b
                java.lang.Object r11 = r11.mo50578a()
                java.util.List r11 = (java.util.List) r11
                if (r11 == 0) goto L_0x00c1
                ce0 r2 = r9.f37114b
                java.util.Iterator r11 = r11.iterator()
            L_0x007d:
                boolean r3 = r11.hasNext()
                if (r3 == 0) goto L_0x00b2
                java.lang.Object r3 = r11.next()
                r4 = r3
                net.safemoon.androidwallet.model.graph.TradingViewSymbol r4 = (net.safemoon.androidwallet.model.graph.TradingViewSymbol) r4
                java.lang.String r5 = r4.symbol
                java.lang.String r6 = "it.symbol"
                p000.vx2.m53590f(r5, r6)
                java.lang.String r7 = r2.f37110c
                r8 = 2
                boolean r5 = p000.yb6.m74343x(r5, r7, r0, r8, r1)
                if (r5 != 0) goto L_0x00ae
                java.lang.String r4 = r4.symbol
                p000.vx2.m53590f(r4, r6)
                java.lang.String r5 = r2.f37111d
                boolean r4 = p000.yb6.m74343x(r4, r5, r0, r8, r1)
                if (r4 == 0) goto L_0x00ac
                goto L_0x00ae
            L_0x00ac:
                r4 = r0
                goto L_0x00af
            L_0x00ae:
                r4 = 1
            L_0x00af:
                if (r4 == 0) goto L_0x007d
                goto L_0x00b3
            L_0x00b2:
                r3 = r1
            L_0x00b3:
                net.safemoon.androidwallet.model.graph.TradingViewSymbol r3 = (net.safemoon.androidwallet.model.graph.TradingViewSymbol) r3
                if (r3 == 0) goto L_0x00c1
                java.lang.String r11 = r3.symbol
                if (r11 == 0) goto L_0x00c1
                java.lang.String r0 = "symbol"
                p000.vx2.m53590f(r11, r0)
                r1 = r3
            L_0x00c1:
                net.safemoon.androidwallet.utils.ChartParameter r11 = r9.f37115c
                r10.mo50872i(r1, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ce0.C6937b.mo47104b(k90, bg5):void");
        }
    }

    public ce0(Coin coin, FragmentManager fragmentManager) {
        vx2.m53591g(coin, "coin");
        vx2.m53591g(fragmentManager, "fragmentManager");
        this.f37108a = coin;
        this.f37109b = fragmentManager;
    }

    /* renamed from: h */
    public static /* synthetic */ void m56388h(ce0 ce0, ChartParameter chartParameter, pc2 pc2, int i, Object obj) {
        if ((i & 1) != 0) {
            chartParameter = null;
        }
        ce0.mo50871g(chartParameter, pc2);
    }

    /* renamed from: f */
    public final Coin mo50870f() {
        return this.f37108a;
    }

    /* renamed from: g */
    public final void mo50871g(ChartParameter chartParameter, pc2<r37> pc2) {
        vx2.m53591g(pc2, "onDone");
        if (!f37107g) {
            f37107g = true;
            String symbol = this.f37108a.getSymbol();
            if (symbol != null) {
                C9384u3.m72577r().mo55980a(symbol).mo50512X(new C6937b(pc2, this, chartParameter));
            }
        }
    }

    /* renamed from: i */
    public final void mo50872i(TradingViewSymbol tradingViewSymbol, ChartParameter chartParameter) {
        int i;
        if (this.f37109b.mo5947R0()) {
            return;
        }
        if (tradingViewSymbol != null) {
            GraphTradingViewFragment.f41779X.mo57291a(this.f37108a, tradingViewSymbol).mo57290P(this.f37109b);
            return;
        }
        GraphFragment.C8304b bVar = GraphFragment.f41756u1;
        String name = this.f37108a.getName();
        vx2.m53590f(name, "coin.name");
        String symbol = this.f37108a.getSymbol();
        vx2.m53590f(symbol, "coin.symbol");
        String valueOf = String.valueOf(this.f37108a.getId());
        String slug = this.f37108a.getSlug();
        vx2.m53590f(slug, "coin.slug");
        if (chartParameter != null) {
            i = chartParameter.getDefaultInterval();
        } else {
            i = 0;
        }
        GraphFragment.C8304b.m66166e(bVar, name, symbol, valueOf, slug, (String) null, i, (String) null, 0, false, (String) null, 976, (Object) null).mo57247M0(this.f37109b);
    }
}
