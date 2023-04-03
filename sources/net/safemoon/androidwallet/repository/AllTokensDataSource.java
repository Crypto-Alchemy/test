package net.safemoon.androidwallet.repository;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.model.AllCryptoList;
import net.safemoon.androidwallet.model.Coin;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b)\u0010*J#\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R,\u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/AllTokensDataSource;", "Ldl4;", "", "Lnet/safemoon/androidwallet/model/Coin;", "Lfl4;", "state", "k", "(Lfl4;)Ljava/lang/Integer;", "Ldl4$a;", "params", "Ldl4$b;", "f", "(Ldl4$a;Lns0;)Ljava/lang/Object;", "j", "Lnet/safemoon/androidwallet/model/AllCryptoList;", "origin", "i", "Lho3;", "c", "Lho3;", "apiService", "Lbo2;", "d", "Lbo2;", "getValueSortParamUseCase", "e", "getValueSortDirParamUseCase", "getActiveTabParamUseCase", "g", "getActiveTabSearchParamUseCase", "", "h", "Ljava/lang/String;", "latestActiveTabValue", "Lk90;", "Lk90;", "getCall", "()Lk90;", "setCall", "(Lk90;)V", "call", "<init>", "(Lho3;Lbo2;Lbo2;Lbo2;Lbo2;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AllTokensDataSource.kt */
public final class AllTokensDataSource extends dl4<Integer, Coin> {

    /* renamed from: c */
    public final ho3 f42504c;

    /* renamed from: d */
    public final bo2 f42505d;

    /* renamed from: e */
    public final bo2 f42506e;

    /* renamed from: f */
    public final bo2 f42507f;

    /* renamed from: g */
    public final bo2 f42508g;

    /* renamed from: h */
    public String f42509h;

    /* renamed from: i */
    public k90<AllCryptoList> f42510i;

    public AllTokensDataSource(ho3 ho3, bo2 bo2, bo2 bo22, bo2 bo23, bo2 bo24) {
        vx2.m53591g(ho3, "apiService");
        vx2.m53591g(bo2, "getValueSortParamUseCase");
        vx2.m53591g(bo22, "getValueSortDirParamUseCase");
        vx2.m53591g(bo23, "getActiveTabParamUseCase");
        vx2.m53591g(bo24, "getActiveTabSearchParamUseCase");
        this.f42504c = ho3;
        this.f42505d = bo2;
        this.f42506e = bo22;
        this.f42507f = bo23;
        this.f42508g = bo24;
        this.f42509h = bo23.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0123 A[Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0132 A[Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0140 A[Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }, LOOP:0: B:47:0x013a->B:49:0x0140, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0166 A[Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0168 A[Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo8656f(p000.dl4.C2171a<java.lang.Integer> r12, p000.ns0<? super p000.dl4.C2176b<java.lang.Integer, net.safemoon.androidwallet.model.Coin>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof net.safemoon.androidwallet.repository.AllTokensDataSource$load$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            net.safemoon.androidwallet.repository.AllTokensDataSource$load$1 r0 = (net.safemoon.androidwallet.repository.AllTokensDataSource$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.AllTokensDataSource$load$1 r0 = new net.safemoon.androidwallet.repository.AllTokensDataSource$load$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 != r4) goto L_0x003b
            int r12 = r0.I$0
            java.lang.Object r1 = r0.L$1
            net.safemoon.androidwallet.repository.AllTokensDataSource r1 = (net.safemoon.androidwallet.repository.AllTokensDataSource) r1
            java.lang.Object r0 = r0.L$0
            net.safemoon.androidwallet.repository.AllTokensDataSource r0 = (net.safemoon.androidwallet.repository.AllTokensDataSource) r0
            p000.hg5.m45199b(r13)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            goto L_0x0119
        L_0x0035:
            r12 = move-exception
            goto L_0x0173
        L_0x0038:
            r12 = move-exception
            goto L_0x017c
        L_0x003b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0043:
            p000.hg5.m45199b(r13)
            java.lang.String r13 = r11.f42509h
            bo2 r2 = r11.f42507f
            java.lang.String r2 = r2.get()
            boolean r13 = p000.vx2.m53586b(r13, r2)
            if (r13 == 0) goto L_0x0061
            java.lang.Object r12 = r12.mo18814a()
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 == 0) goto L_0x0061
            int r12 = r12.intValue()
            goto L_0x0062
        L_0x0061:
            r12 = r4
        L_0x0062:
            k90<net.safemoon.androidwallet.model.AllCryptoList> r13 = r11.f42510i
            if (r13 == 0) goto L_0x0069
            r13.cancel()
        L_0x0069:
            bo2 r13 = r11.f42507f     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r13 = r13.get()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            net.safemoon.androidwallet.common.ActiveTokenListMode r2 = net.safemoon.androidwallet.common.ActiveTokenListMode.RECENT     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r2 = r2.getValue()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            boolean r2 = p000.vx2.m53586b(r13, r2)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            if (r2 == 0) goto L_0x00a0
            ho3 r5 = r11.f42504c     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.Integer r6 = p000.a40.m31673d(r12)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            int r13 = r11.mo60722j()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.Integer r7 = p000.a40.m31673d(r13)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            net.safemoon.androidwallet.common.CurrencyConvertType r13 = net.safemoon.androidwallet.common.CurrencyConvertType.USD     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r8 = r13.getValue()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            bo2 r13 = r11.f42505d     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r9 = r13.get()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            bo2 r13 = r11.f42506e     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r10 = r13.get()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            k90 r13 = r5.mo52287p(r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            goto L_0x0103
        L_0x00a0:
            net.safemoon.androidwallet.common.ActiveTokenListMode r2 = net.safemoon.androidwallet.common.ActiveTokenListMode.GAINER     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r2 = r2.getValue()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            boolean r2 = p000.vx2.m53586b(r13, r2)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            if (r2 == 0) goto L_0x00d1
            ho3 r5 = r11.f42504c     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.Integer r6 = p000.a40.m31673d(r12)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            int r13 = r11.mo60722j()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.Integer r7 = p000.a40.m31673d(r13)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            net.safemoon.androidwallet.common.CurrencyConvertType r13 = net.safemoon.androidwallet.common.CurrencyConvertType.USD     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r8 = r13.getValue()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            bo2 r13 = r11.f42505d     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r9 = r13.get()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            bo2 r13 = r11.f42506e     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r10 = r13.get()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            k90 r13 = r5.mo52282k(r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            goto L_0x0103
        L_0x00d1:
            net.safemoon.androidwallet.common.ActiveTokenListMode r2 = net.safemoon.androidwallet.common.ActiveTokenListMode.LOSER     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r2 = r2.getValue()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            boolean r13 = p000.vx2.m53586b(r13, r2)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            if (r13 == 0) goto L_0x0102
            ho3 r5 = r11.f42504c     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.Integer r6 = p000.a40.m31673d(r12)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            int r13 = r11.mo60722j()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.Integer r7 = p000.a40.m31673d(r13)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            net.safemoon.androidwallet.common.CurrencyConvertType r13 = net.safemoon.androidwallet.common.CurrencyConvertType.USD     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r8 = r13.getValue()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            bo2 r13 = r11.f42505d     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r9 = r13.get()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            bo2 r13 = r11.f42506e     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r10 = r13.get()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            k90 r13 = r5.mo52275d(r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            goto L_0x0103
        L_0x0102:
            r13 = r3
        L_0x0103:
            r11.f42510i = r13     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            p000.vx2.m53588d(r13)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            r0.L$0 = r11     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            r0.L$1 = r11     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            r0.I$0 = r12     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            r0.label = r4     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.Object r13 = retrofit2.KotlinExtensions.m71521c(r13, r0)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            if (r13 != r1) goto L_0x0117
            return r1
        L_0x0117:
            r0 = r11
            r1 = r0
        L_0x0119:
            bg5 r13 = (p000.bg5) r13     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.Object r13 = r13.mo50578a()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            net.safemoon.androidwallet.model.AllCryptoList r13 = (net.safemoon.androidwallet.model.AllCryptoList) r13     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            if (r13 != 0) goto L_0x0128
            net.safemoon.androidwallet.model.AllCryptoList r13 = new net.safemoon.androidwallet.model.AllCryptoList     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            r13.<init>()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
        L_0x0128:
            net.safemoon.androidwallet.model.AllCryptoList r13 = r1.mo60721i(r13)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.util.List r1 = r13.getData()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            if (r1 != 0) goto L_0x0136
            java.util.List r1 = p000.ck0.m33062j()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
        L_0x0136:
            java.util.Iterator r2 = r1.iterator()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
        L_0x013a:
            boolean r5 = r2.hasNext()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            if (r5 == 0) goto L_0x015c
            java.lang.Object r5 = r2.next()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            net.safemoon.androidwallet.model.Coin r5 = (net.safemoon.androidwallet.model.Coin) r5     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r6 = "it"
            p000.vx2.m53590f(r5, r6)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r6 = p000.q70.m71188d(r5)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            r5.setName(r6)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            bo2 r6 = r0.f42505d     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            java.lang.String r6 = r6.get()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            r5.setSortType(r6)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            goto L_0x013a
        L_0x015c:
            java.util.List r13 = r13.getData()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            int r13 = r13.size()     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            if (r13 != 0) goto L_0x0168
            r12 = r3
            goto L_0x016d
        L_0x0168:
            int r12 = r12 + r4
            java.lang.Integer r12 = p000.a40.m31673d(r12)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
        L_0x016d:
            dl4$b$b r13 = new dl4$b$b     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            r13.<init>(r1, r3, r12)     // Catch:{ IOException -> 0x0038, HttpException -> 0x0035 }
            goto L_0x0184
        L_0x0173:
            r12.printStackTrace()
            dl4$b$a r13 = new dl4$b$a
            r13.<init>(r12)
            goto L_0x0184
        L_0x017c:
            r12.printStackTrace()
            dl4$b$a r13 = new dl4$b$a
            r13.<init>(r12)
        L_0x0184:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.AllTokensDataSource.mo8656f(dl4$a, ns0):java.lang.Object");
    }

    /* renamed from: i */
    public final AllCryptoList mo60721i(AllCryptoList allCryptoList) {
        boolean z;
        String str;
        String str2 = this.f42508g.get();
        boolean B = yb6.m74325B(str2);
        List<Coin> data = allCryptoList.getData();
        if (data == null || data.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (B || z) {
            return allCryptoList;
        }
        ArrayList arrayList = new ArrayList();
        for (Coin next : allCryptoList.getData()) {
            if (next != null) {
                str = next.getName();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (StringsKt__StringsKt.m63077P(str, str2, true)) {
                vx2.m53590f(next, "coin");
                arrayList.add(next);
            }
        }
        return new AllCryptoList(arrayList);
    }

    /* renamed from: j */
    public final int mo60722j() {
        if (yb6.m74325B(this.f42508g.get())) {
            return 100;
        }
        return 1000;
    }

    /* renamed from: k */
    public Integer mo8655d(fl4<Integer, Coin> fl4) {
        vx2.m53591g(fl4, "state");
        return 1;
    }
}
