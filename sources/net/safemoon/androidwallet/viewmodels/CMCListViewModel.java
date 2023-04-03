package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.repository.TokenListDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\u001e\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u001b0\u001b0\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R1\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001f \t*\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00040\u00040\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R.\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \t*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0017R#\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00040%8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0002\u0004\n\u0002\b\u0019¨\u00060"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/CMCListViewModel;", "Lwj;", "Lr37;", "m", "", "Lnet/safemoon/androidwallet/model/Coin;", "n", "(Lns0;)Ljava/lang/Object;", "Lho3;", "kotlin.jvm.PlatformType", "b", "Lef3;", "q", "()Lho3;", "marketClient", "Lnet/safemoon/androidwallet/repository/TokenListDataSource;", "c", "t", "()Lnet/safemoon/androidwallet/repository/TokenListDataSource;", "tokenListDataSource", "Lk04;", "", "d", "Lk04;", "p", "()Lk04;", "hasExcludeAppToken", "", "e", "r", "searchCoin", "", "f", "s", "selectedCoinIds", "g", "coinList", "Lls3;", "Lqx1;", "h", "Lls3;", "o", "()Lls3;", "coinMediatorLiveData", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CMCListViewModel.kt */
public final class CMCListViewModel extends C3552wj {

    /* renamed from: b */
    public final ef3 f42618b = C6169a.m47232a(CMCListViewModel$marketClient$2.INSTANCE);

    /* renamed from: c */
    public final ef3 f42619c;

    /* renamed from: d */
    public final k04<Boolean> f42620d;

    /* renamed from: e */
    public final k04<String> f42621e;

    /* renamed from: f */
    public final k04<List<Integer>> f42622f;

    /* renamed from: g */
    public final k04<List<Coin>> f42623g;

    /* renamed from: h */
    public final ls3<List<qx1>> f42624h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CMCListViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        this.f42619c = C6169a.m47232a(new CMCListViewModel$tokenListDataSource$2(application));
        this.f42620d = new k04<>(Boolean.TRUE);
        k04<String> k04 = new k04<>("");
        this.f42621e = k04;
        k04<List<Integer>> k042 = new k04<>(ck0.m33062j());
        this.f42622f = k042;
        k04<List<Coin>> k043 = new k04<>(ck0.m33062j());
        this.f42623g = k043;
        ls3<List<qx1>> ls3 = new ls3<>();
        ls3.mo22951a(k042, new t70(new CMCListViewModel$coinMediatorLiveData$1$1(this, ls3)));
        ls3.mo22951a(k043, new u70(new CMCListViewModel$coinMediatorLiveData$1$2(this, ls3)));
        ls3.mo22951a(k04, new v70(new CMCListViewModel$coinMediatorLiveData$1$3(this, ls3)));
        m68392l(this, ls3);
        this.f42624h = ls3;
    }

    /* renamed from: i */
    public static final void m68389i(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: j */
    public static final void m68390j(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: k */
    public static final void m68391k(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005a A[SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m68392l(net.safemoon.androidwallet.viewmodels.CMCListViewModel r11, p000.ls3<java.util.List<p000.qx1>> r12) {
        /*
            k04<java.lang.String> r0 = r11.f42621e
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = ""
        L_0x000c:
            k04<java.util.List<net.safemoon.androidwallet.model.Coin>> r1 = r11.f42623g
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 == 0) goto L_0x00b6
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.dk0.m43495u(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0026:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0051
            java.lang.Object r4 = r1.next()
            net.safemoon.androidwallet.model.Coin r4 = (net.safemoon.androidwallet.model.Coin) r4
            qx1 r5 = new qx1
            k04<java.util.List<java.lang.Integer>> r6 = r11.f42622f
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x0042
            java.util.List r6 = p000.ck0.m33062j()
        L_0x0042:
            java.lang.Integer r7 = r4.getId()
            boolean r6 = r6.contains(r7)
            r5.<init>(r4, r6)
            r3.add(r5)
            goto L_0x0026
        L_0x0051:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r1 = r3.iterator()
        L_0x005a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00b5
            java.lang.Object r3 = r1.next()
            r4 = r3
            qx1 r4 = (p000.qx1) r4
            net.safemoon.androidwallet.model.Coin r5 = r4.mo65538c()
            java.lang.String r5 = r5.getSymbol()
            r6 = 2
            java.lang.String r7 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x008e
            java.lang.String r10 = "symbol"
            p000.vx2.m53590f(r5, r10)
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r10)
            p000.vx2.m53590f(r5, r7)
            if (r5 == 0) goto L_0x008e
            boolean r5 = kotlin.text.StringsKt__StringsKt.m63081R(r5, r0, r9, r6, r2)
            if (r5 != r8) goto L_0x008e
            r5 = r8
            goto L_0x008f
        L_0x008e:
            r5 = r9
        L_0x008f:
            if (r5 != 0) goto L_0x00af
            net.safemoon.androidwallet.model.Coin r4 = r4.mo65538c()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "it.coin.name"
            p000.vx2.m53590f(r4, r5)
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            p000.vx2.m53590f(r4, r7)
            boolean r4 = kotlin.text.StringsKt__StringsKt.m63081R(r4, r0, r9, r6, r2)
            if (r4 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r8 = r9
        L_0x00af:
            if (r8 == 0) goto L_0x005a
            r11.add(r3)
            goto L_0x005a
        L_0x00b5:
            r2 = r11
        L_0x00b6:
            r12.postValue(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CMCListViewModel.m68392l(net.safemoon.androidwallet.viewmodels.CMCListViewModel, ls3):void");
    }

    /* renamed from: m */
    public final void mo60978m() {
        y23 unused = d50.m56748b(ih2.f38385a, qh1.m71265b(), (CoroutineStart) null, new CMCListViewModel$fetchCmcToken$1(this, (ns0<? super CMCListViewModel$fetchCmcToken$1>) null), 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r11 != null) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f A[Catch:{ Exception -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A[Catch:{ Exception -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be A[Catch:{ Exception -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f5 A[Catch:{ Exception -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x012e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60979n(p000.ns0<? super java.util.List<? extends net.safemoon.androidwallet.model.Coin>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof net.safemoon.androidwallet.viewmodels.CMCListViewModel$getCMCCoin$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            net.safemoon.androidwallet.viewmodels.CMCListViewModel$getCMCCoin$1 r0 = (net.safemoon.androidwallet.viewmodels.CMCListViewModel$getCMCCoin$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.CMCListViewModel$getCMCCoin$1 r0 = new net.safemoon.androidwallet.viewmodels.CMCListViewModel$getCMCCoin$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r5) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x0138 }
            goto L_0x00ad
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x003a:
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.viewmodels.CMCListViewModel r2 = (net.safemoon.androidwallet.viewmodels.CMCListViewModel) r2
            p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0069
        L_0x0042:
            p000.hg5.m45199b(r11)
            ho3 r11 = r10.mo60982q()     // Catch:{ Exception -> 0x0138 }
            java.lang.Integer r2 = p000.a40.m31673d(r5)     // Catch:{ Exception -> 0x0138 }
            r6 = 100
            java.lang.Integer r6 = p000.a40.m31673d(r6)     // Catch:{ Exception -> 0x0138 }
            net.safemoon.androidwallet.common.CurrencyConvertType r7 = net.safemoon.androidwallet.common.CurrencyConvertType.USD     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = r7.getValue()     // Catch:{ Exception -> 0x0138 }
            k90 r11 = r11.mo52278g(r2, r6, r7)     // Catch:{ Exception -> 0x0138 }
            r0.L$0 = r10     // Catch:{ Exception -> 0x0138 }
            r0.label = r5     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r11 = retrofit2.KotlinExtensions.m71521c(r11, r0)     // Catch:{ Exception -> 0x0138 }
            if (r11 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r2 = r10
        L_0x0069:
            bg5 r11 = (p000.bg5) r11     // Catch:{ Exception -> 0x0138 }
            boolean r6 = r11.mo50581e()     // Catch:{ Exception -> 0x0138 }
            if (r6 == 0) goto L_0x0087
            java.lang.Object r6 = r11.mo50578a()     // Catch:{ Exception -> 0x0138 }
            if (r6 == 0) goto L_0x0087
            java.lang.Object r11 = r11.mo50578a()     // Catch:{ Exception -> 0x0138 }
            net.safemoon.androidwallet.model.AllCryptoList r11 = (net.safemoon.androidwallet.model.AllCryptoList) r11     // Catch:{ Exception -> 0x0138 }
            if (r11 == 0) goto L_0x0084
            java.util.List r11 = r11.getData()     // Catch:{ Exception -> 0x0138 }
            goto L_0x0085
        L_0x0084:
            r11 = r4
        L_0x0085:
            if (r11 != 0) goto L_0x008b
        L_0x0087:
            java.util.List r11 = p000.ck0.m33062j()     // Catch:{ Exception -> 0x0138 }
        L_0x008b:
            k04<java.lang.Boolean> r6 = r2.f42620d     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ Exception -> 0x0138 }
            java.lang.Boolean r7 = p000.a40.m31670a(r5)     // Catch:{ Exception -> 0x0138 }
            boolean r6 = p000.vx2.m53586b(r6, r7)     // Catch:{ Exception -> 0x0138 }
            if (r6 == 0) goto L_0x00e2
            net.safemoon.androidwallet.repository.TokenListDataSource r2 = r2.mo60985t()     // Catch:{ Exception -> 0x0138 }
            r0.L$0 = r11     // Catch:{ Exception -> 0x0138 }
            r0.label = r3     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r0 = r2.mo60763g(r4, r0)     // Catch:{ Exception -> 0x0138 }
            if (r0 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x00ad:
            java.util.List r11 = (java.util.List) r11     // Catch:{ Exception -> 0x0138 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0138 }
            r1.<init>()     // Catch:{ Exception -> 0x0138 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x0138 }
        L_0x00b8:
            boolean r2 = r11.hasNext()     // Catch:{ Exception -> 0x0138 }
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r11.next()     // Catch:{ Exception -> 0x0138 }
            net.safemoon.androidwallet.model.priceAlert.PAToken r2 = (net.safemoon.androidwallet.model.priceAlert.PAToken) r2     // Catch:{ Exception -> 0x0138 }
            java.lang.String r6 = r2.getContractAddress()     // Catch:{ Exception -> 0x0138 }
            if (r6 == 0) goto L_0x00d9
            java.lang.String r2 = r2.getSymbol()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = p000.q70.m71187c(r6, r2, r4, r3, r4)     // Catch:{ Exception -> 0x0138 }
            if (r2 == 0) goto L_0x00d9
            java.lang.Integer r2 = p000.xb6.m73916n(r2)     // Catch:{ Exception -> 0x0138 }
            goto L_0x00da
        L_0x00d9:
            r2 = r4
        L_0x00da:
            if (r2 == 0) goto L_0x00b8
            r1.add(r2)     // Catch:{ Exception -> 0x0138 }
            goto L_0x00b8
        L_0x00e0:
            r11 = r0
            goto L_0x00e6
        L_0x00e2:
            java.util.List r1 = p000.ck0.m33062j()     // Catch:{ Exception -> 0x0138 }
        L_0x00e6:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0138 }
            r0.<init>()     // Catch:{ Exception -> 0x0138 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x0138 }
        L_0x00ef:
            boolean r2 = r11.hasNext()     // Catch:{ Exception -> 0x0138 }
            if (r2 == 0) goto L_0x0137
            java.lang.Object r2 = r11.next()     // Catch:{ Exception -> 0x0138 }
            r3 = r2
            net.safemoon.androidwallet.model.Coin r3 = (net.safemoon.androidwallet.model.Coin) r3     // Catch:{ Exception -> 0x0138 }
            boolean r4 = r1 instanceof java.util.Collection     // Catch:{ Exception -> 0x0138 }
            r6 = 0
            if (r4 == 0) goto L_0x0108
            boolean r4 = r1.isEmpty()     // Catch:{ Exception -> 0x0138 }
            if (r4 == 0) goto L_0x0108
            goto L_0x012f
        L_0x0108:
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x0138 }
        L_0x010c:
            boolean r7 = r4.hasNext()     // Catch:{ Exception -> 0x0138 }
            if (r7 == 0) goto L_0x012f
            java.lang.Object r7 = r4.next()     // Catch:{ Exception -> 0x0138 }
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ Exception -> 0x0138 }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x0138 }
            java.lang.Integer r8 = r3.getId()     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x0123
            goto L_0x012b
        L_0x0123:
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x0138 }
            if (r8 != r7) goto L_0x012b
            r7 = r5
            goto L_0x012c
        L_0x012b:
            r7 = r6
        L_0x012c:
            if (r7 == 0) goto L_0x010c
            r6 = r5
        L_0x012f:
            r3 = r6 ^ 1
            if (r3 == 0) goto L_0x00ef
            r0.add(r2)     // Catch:{ Exception -> 0x0138 }
            goto L_0x00ef
        L_0x0137:
            return r0
        L_0x0138:
            java.util.List r11 = p000.ck0.m33062j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CMCListViewModel.mo60979n(ns0):java.lang.Object");
    }

    /* renamed from: o */
    public final ls3<List<qx1>> mo60980o() {
        return this.f42624h;
    }

    /* renamed from: p */
    public final k04<Boolean> mo60981p() {
        return this.f42620d;
    }

    /* renamed from: q */
    public final ho3 mo60982q() {
        return (ho3) this.f42618b.getValue();
    }

    /* renamed from: r */
    public final k04<String> mo60983r() {
        return this.f42621e;
    }

    /* renamed from: s */
    public final k04<List<Integer>> mo60984s() {
        return this.f42622f;
    }

    /* renamed from: t */
    public final TokenListDataSource mo60985t() {
        return (TokenListDataSource) this.f42619c.getValue();
    }
}
