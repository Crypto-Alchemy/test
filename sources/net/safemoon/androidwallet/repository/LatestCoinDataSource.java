package net.safemoon.androidwallet.repository;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.AllCryptoList;
import net.safemoon.androidwallet.model.Coin;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J#\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028\u0002XD¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002XD¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00028\u0002XD¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/LatestCoinDataSource;", "Ldl4;", "", "Lnet/safemoon/androidwallet/model/Coin;", "Lfl4;", "state", "i", "(Lfl4;)Ljava/lang/Integer;", "Ldl4$a;", "params", "Ldl4$b;", "f", "(Ldl4$a;Lns0;)Ljava/lang/Object;", "Lho3;", "c", "Lho3;", "apiService", "Lnet/safemoon/androidwallet/repository/LatestCoinDataSource$a;", "d", "Lnet/safemoon/androidwallet/repository/LatestCoinDataSource$a;", "onCoinDataLoadedListener", "e", "I", "START_PAGE", "NEXT_PAGE_COUNT", "g", "PAGING_PER_ITEM_COUNT", "Lk90;", "Lnet/safemoon/androidwallet/model/AllCryptoList;", "h", "Lk90;", "call", "<init>", "(Lho3;Lnet/safemoon/androidwallet/repository/LatestCoinDataSource$a;)V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: LatestCoinDataSource.kt */
public final class LatestCoinDataSource extends dl4<Integer, Coin> {

    /* renamed from: c */
    public final ho3 f42513c;

    /* renamed from: d */
    public final C8609a f42514d;

    /* renamed from: e */
    public final int f42515e = 1;

    /* renamed from: f */
    public final int f42516f = 1;

    /* renamed from: g */
    public final int f42517g = 10;

    /* renamed from: h */
    public k90<AllCryptoList> f42518h;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/LatestCoinDataSource$a;", "", "Lnet/safemoon/androidwallet/model/AllCryptoList;", "newData", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.repository.LatestCoinDataSource$a */
    /* compiled from: LatestCoinDataSource.kt */
    public interface C8609a {
        /* renamed from: a */
        void mo60733a(AllCryptoList allCryptoList);
    }

    public LatestCoinDataSource(ho3 ho3, C8609a aVar) {
        vx2.m53591g(ho3, "apiService");
        vx2.m53591g(aVar, "onCoinDataLoadedListener");
        this.f42513c = ho3;
        this.f42514d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e A[Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098 A[Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6 A[Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }, LOOP:0: B:41:0x00a0->B:43:0x00a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c4 A[Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6 A[Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo8656f(p000.dl4.C2171a<java.lang.Integer> r7, p000.ns0<? super p000.dl4.C2176b<java.lang.Integer, net.safemoon.androidwallet.model.Coin>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof net.safemoon.androidwallet.repository.LatestCoinDataSource$load$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            net.safemoon.androidwallet.repository.LatestCoinDataSource$load$1 r0 = (net.safemoon.androidwallet.repository.LatestCoinDataSource$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.LatestCoinDataSource$load$1 r0 = new net.safemoon.androidwallet.repository.LatestCoinDataSource$load$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            int r7 = r0.I$0
            java.lang.Object r0 = r0.L$0
            net.safemoon.androidwallet.repository.LatestCoinDataSource r0 = (net.safemoon.androidwallet.repository.LatestCoinDataSource) r0
            p000.hg5.m45199b(r8)     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            goto L_0x007a
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            p000.hg5.m45199b(r8)
            java.lang.Object r7 = r7.mo18814a()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            if (r7 == 0) goto L_0x0047
            int r7 = r7.intValue()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            goto L_0x0049
        L_0x0047:
            int r7 = r6.f42515e     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
        L_0x0049:
            k90<net.safemoon.androidwallet.model.AllCryptoList> r8 = r6.f42518h     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            if (r8 == 0) goto L_0x0052
            if (r8 == 0) goto L_0x0052
            r8.cancel()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
        L_0x0052:
            ho3 r8 = r6.f42513c     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            java.lang.Integer r2 = p000.a40.m31673d(r7)     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            int r4 = r6.f42517g     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            java.lang.Integer r4 = p000.a40.m31673d(r4)     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            net.safemoon.androidwallet.common.CurrencyConvertType r5 = net.safemoon.androidwallet.common.CurrencyConvertType.USD     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            java.lang.String r5 = r5.getValue()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            k90 r8 = r8.mo52278g(r2, r4, r5)     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            r6.f42518h = r8     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            if (r8 == 0) goto L_0x0087
            r0.L$0 = r6     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            r0.I$0 = r7     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            r0.label = r3     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            java.lang.Object r8 = retrofit2.KotlinExtensions.m71521c(r8, r0)     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            if (r8 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r0 = r6
        L_0x007a:
            bg5 r8 = (p000.bg5) r8     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            if (r8 == 0) goto L_0x0088
            java.lang.Object r8 = r8.mo50578a()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            net.safemoon.androidwallet.model.AllCryptoList r8 = (net.safemoon.androidwallet.model.AllCryptoList) r8     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            if (r8 != 0) goto L_0x008d
            goto L_0x0088
        L_0x0087:
            r0 = r6
        L_0x0088:
            net.safemoon.androidwallet.model.AllCryptoList r8 = new net.safemoon.androidwallet.model.AllCryptoList     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            r8.<init>()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
        L_0x008d:
            net.safemoon.androidwallet.repository.LatestCoinDataSource$a r1 = r0.f42514d     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            r1.mo60733a(r8)     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            java.util.List r1 = r8.getData()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            if (r1 != 0) goto L_0x009c
            java.util.List r1 = p000.ck0.m33062j()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
        L_0x009c:
            java.util.Iterator r2 = r1.iterator()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
        L_0x00a0:
            boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            if (r3 == 0) goto L_0x00b9
            java.lang.Object r3 = r2.next()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            net.safemoon.androidwallet.model.Coin r3 = (net.safemoon.androidwallet.model.Coin) r3     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            java.lang.String r4 = "it"
            p000.vx2.m53590f(r3, r4)     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            java.lang.String r4 = p000.q70.m71188d(r3)     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            r3.setName(r4)     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            goto L_0x00a0
        L_0x00b9:
            java.util.List r8 = r8.getData()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            int r8 = r8.size()     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            r2 = 0
            if (r8 != 0) goto L_0x00c6
            r7 = r2
            goto L_0x00cd
        L_0x00c6:
            int r8 = r0.f42516f     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            int r7 = r7 + r8
            java.lang.Integer r7 = p000.a40.m31673d(r7)     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
        L_0x00cd:
            dl4$b$b r8 = new dl4$b$b     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            r8.<init>(r1, r2, r7)     // Catch:{ IOException -> 0x00dd, HttpException -> 0x00d3 }
            goto L_0x00e6
        L_0x00d3:
            r7 = move-exception
            r7.printStackTrace()
            dl4$b$a r8 = new dl4$b$a
            r8.<init>(r7)
            goto L_0x00e6
        L_0x00dd:
            r7 = move-exception
            r7.printStackTrace()
            dl4$b$a r8 = new dl4$b$a
            r8.<init>(r7)
        L_0x00e6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.LatestCoinDataSource.mo8656f(dl4$a, ns0):java.lang.Object");
    }

    /* renamed from: i */
    public Integer mo8655d(fl4<Integer, Coin> fl4) {
        vx2.m53591g(fl4, "state");
        return 1;
    }
}
