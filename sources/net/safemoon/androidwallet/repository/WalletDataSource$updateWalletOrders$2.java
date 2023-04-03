package net.safemoon.androidwallet.repository;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.repository.WalletDataSource$updateWalletOrders$2", mo48632f = "WalletDataSource.kt", mo48633l = {70}, mo48634m = "invokeSuspend")
/* compiled from: WalletDataSource.kt */
public final class WalletDataSource$updateWalletOrders$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Pair<Long, Integer>[] $orders;
    public int label;
    public final /* synthetic */ WalletDataSource this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.repository.WalletDataSource$updateWalletOrders$2$1", mo48632f = "WalletDataSource.kt", mo48633l = {72}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.repository.WalletDataSource$updateWalletOrders$2$1 */
    /* compiled from: WalletDataSource.kt */
    public static final class C86141 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86141(pairArr, walletDataSource, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86141) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L_0x0024
                if (r1 != r2) goto L_0x001c
                int r1 = r11.I$1
                int r3 = r11.I$0
                java.lang.Object r4 = r11.L$1
                net.safemoon.androidwallet.repository.WalletDataSource r4 = (net.safemoon.androidwallet.repository.WalletDataSource) r4
                java.lang.Object r5 = r11.L$0
                kotlin.Pair[] r5 = (kotlin.Pair[]) r5
                p000.hg5.m45199b(r12)
                r12 = r11
                goto L_0x005f
            L_0x001c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0024:
                p000.hg5.m45199b(r12)
                kotlin.Pair<java.lang.Long, java.lang.Integer>[] r12 = r3
                net.safemoon.androidwallet.repository.WalletDataSource r1 = r4
                r3 = 0
                int r4 = r12.length
                r5 = r12
                r12 = r11
                r10 = r4
                r4 = r1
                r1 = r10
            L_0x0032:
                if (r3 >= r1) goto L_0x0061
                r6 = r5[r3]
                ih7 r7 = r4.f42536a
                java.lang.Object r8 = r6.getFirst()
                java.lang.Number r8 = (java.lang.Number) r8
                long r8 = r8.longValue()
                java.lang.Object r6 = r6.getSecond()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r12.L$0 = r5
                r12.L$1 = r4
                r12.I$0 = r3
                r12.I$1 = r1
                r12.label = r2
                java.lang.Object r6 = r7.mo52474a(r8, r6, r12)
                if (r6 != r0) goto L_0x005f
                return r0
            L_0x005f:
                int r3 = r3 + r2
                goto L_0x0032
            L_0x0061:
                r37 r12 = p000.r37.f33317a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.WalletDataSource$updateWalletOrders$2.C86141.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletDataSource$updateWalletOrders$2(Pair<Long, Integer>[] pairArr, WalletDataSource walletDataSource, ns0<? super WalletDataSource$updateWalletOrders$2> ns0) {
        super(2, ns0);
        this.$orders = pairArr;
        this.this$0 = walletDataSource;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new WalletDataSource$updateWalletOrders$2(this.$orders, this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((WalletDataSource$updateWalletOrders$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final Pair<Long, Integer>[] pairArr = this.$orders;
            final WalletDataSource walletDataSource = this.this$0;
            C86141 r1 = new C86141((ns0<? super C86141>) null);
            this.label = 1;
            if (b50.m55768e(b, r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
