package net.safemoon.androidwallet.repository.dataSource.token.user;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource$updateOrders$1", mo48632f = "LocalUserTokenDataSource.kt", mo48633l = {104}, mo48634m = "invokeSuspend")
/* compiled from: LocalUserTokenDataSource.kt */
public final class LocalUserTokenDataSource$updateOrders$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Pair<String, Integer>[] $orders;
    public int label;
    public final /* synthetic */ LocalUserTokenDataSource this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource$updateOrders$1$1", mo48632f = "LocalUserTokenDataSource.kt", mo48633l = {106}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource$updateOrders$1$1 */
    /* compiled from: LocalUserTokenDataSource.kt */
    public static final class C86201 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86201(pairArr, localUserTokenDataSource, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86201) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r10.label
                r2 = 1
                if (r1 == 0) goto L_0x0024
                if (r1 != r2) goto L_0x001c
                int r1 = r10.I$1
                int r3 = r10.I$0
                java.lang.Object r4 = r10.L$1
                net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource r4 = (net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource) r4
                java.lang.Object r5 = r10.L$0
                kotlin.Pair[] r5 = (kotlin.Pair[]) r5
                p000.hg5.m45199b(r11)
                r11 = r10
                goto L_0x005b
            L_0x001c:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0024:
                p000.hg5.m45199b(r11)
                kotlin.Pair<java.lang.String, java.lang.Integer>[] r11 = r3
                net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource r1 = r4
                r3 = 0
                int r4 = r11.length
                r5 = r11
                r11 = r10
                r9 = r4
                r4 = r1
                r1 = r9
            L_0x0032:
                if (r3 >= r1) goto L_0x005d
                r6 = r5[r3]
                z57 r7 = r4.f42543a
                java.lang.Object r8 = r6.getFirst()
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r6 = r6.getSecond()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r11.L$0 = r5
                r11.L$1 = r4
                r11.I$0 = r3
                r11.I$1 = r1
                r11.label = r2
                java.lang.Object r6 = r7.mo50086m(r8, r6, r11)
                if (r6 != r0) goto L_0x005b
                return r0
            L_0x005b:
                int r3 = r3 + r2
                goto L_0x0032
            L_0x005d:
                r37 r11 = p000.r37.f33317a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.dataSource.token.user.LocalUserTokenDataSource$updateOrders$1.C86201.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalUserTokenDataSource$updateOrders$1(Pair<String, Integer>[] pairArr, LocalUserTokenDataSource localUserTokenDataSource, ns0<? super LocalUserTokenDataSource$updateOrders$1> ns0) {
        super(2, ns0);
        this.$orders = pairArr;
        this.this$0 = localUserTokenDataSource;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new LocalUserTokenDataSource$updateOrders$1(this.$orders, this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((LocalUserTokenDataSource$updateOrders$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final Pair<String, Integer>[] pairArr = this.$orders;
            final LocalUserTokenDataSource localUserTokenDataSource = this.this$0;
            C86201 r1 = new C86201((ns0<? super C86201>) null);
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
