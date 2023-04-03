package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$getAmountOut$1", mo48632f = "SwapMigrationViewModel.kt", mo48633l = {133}, mo48634m = "invokeSuspend")
/* compiled from: SwapMigrationViewModel.kt */
public final class SwapMigrationViewModel$getAmountOut$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ SwapMigrationViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$getAmountOut$1$1", mo48632f = "SwapMigrationViewModel.kt", mo48633l = {135, 141, 147, 149, 155}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$getAmountOut$1$1 */
    /* compiled from: SwapMigrationViewModel.kt */
    public static final class C87491 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87491(swapMigrationViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87491) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0099 A[Catch:{ Exception -> 0x003d, all -> 0x003a }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6 A[Catch:{ Exception -> 0x003d, all -> 0x003a }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0131 A[Catch:{ Exception -> 0x003d, all -> 0x003a }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x013a A[Catch:{ Exception -> 0x003d, all -> 0x003a }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0149 A[Catch:{ Exception -> 0x003d, all -> 0x003a }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x016c A[Catch:{ Exception -> 0x003d, all -> 0x003a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.String r0 = "estimateGas.amountUsed"
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r10.label
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 0
                r8 = 1
                r9 = 0
                if (r2 == 0) goto L_0x0040
                if (r2 == r8) goto L_0x0036
                if (r2 == r6) goto L_0x0032
                if (r2 == r5) goto L_0x002d
                if (r2 == r4) goto L_0x0028
                if (r2 != r3) goto L_0x0020
                p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x003d }
                goto L_0x0168
            L_0x0020:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0028:
                p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x003d }
                goto L_0x0132
            L_0x002d:
                p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x003d }
                goto L_0x00fe
            L_0x0032:
                p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x003d }
                goto L_0x008c
            L_0x0036:
                p000.hg5.m45199b(r11)     // Catch:{ Exception -> 0x003d }
                goto L_0x0055
            L_0x003a:
                r11 = move-exception
                goto L_0x0236
            L_0x003d:
                r11 = move-exception
                goto L_0x021d
            L_0x0040:
                p000.hg5.m45199b(r11)
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2 r11 = r11.f42873w     // Catch:{ Exception -> 0x003d }
                p000.vx2.m53588d(r11)     // Catch:{ Exception -> 0x003d }
                r10.label = r8     // Catch:{ Exception -> 0x003d }
                java.lang.Object r11 = r11.mo61829t(r10)     // Catch:{ Exception -> 0x003d }
                if (r11 != r1) goto L_0x0055
                return r1
            L_0x0055:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ Exception -> 0x003d }
                boolean r11 = r11.booleanValue()     // Catch:{ Exception -> 0x003d }
                if (r11 != 0) goto L_0x007a
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                k04 r11 = r11.mo61466f0()     // Catch:{ Exception -> 0x003d }
                r11.postValue(r7)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                k04 r11 = r11.mo61465e0()     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r0 = r3     // Catch:{ Exception -> 0x003d }
                r1 = 2131952630(0x7f1303f6, float:1.9541708E38)
                java.lang.String r0 = r0.mo61462b0(r1)     // Catch:{ Exception -> 0x003d }
                r11.postValue(r0)     // Catch:{ Exception -> 0x003d }
                goto L_0x0226
            L_0x007a:
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2 r11 = r11.f42873w     // Catch:{ Exception -> 0x003d }
                p000.vx2.m53588d(r11)     // Catch:{ Exception -> 0x003d }
                r10.label = r6     // Catch:{ Exception -> 0x003d }
                java.lang.Object r11 = r11.mo61828s(r10)     // Catch:{ Exception -> 0x003d }
                if (r11 != r1) goto L_0x008c
                return r1
            L_0x008c:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ Exception -> 0x003d }
                java.lang.String r2 = "isLocked"
                p000.vx2.m53590f(r11, r2)     // Catch:{ Exception -> 0x003d }
                boolean r11 = r11.booleanValue()     // Catch:{ Exception -> 0x003d }
                if (r11 == 0) goto L_0x00b6
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                k04 r11 = r11.mo61466f0()     // Catch:{ Exception -> 0x003d }
                r11.postValue(r7)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                k04 r11 = r11.mo61465e0()     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r0 = r3     // Catch:{ Exception -> 0x003d }
                r1 = 2131952631(0x7f1303f7, float:1.954171E38)
                java.lang.String r0 = r0.mo61462b0(r1)     // Catch:{ Exception -> 0x003d }
                r11.postValue(r0)     // Catch:{ Exception -> 0x003d }
                goto L_0x0226
            L_0x00b6:
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                k04 r11 = r11.mo61464d0()     // Catch:{ Exception -> 0x003d }
                java.lang.Object r11 = r11.getValue()     // Catch:{ Exception -> 0x003d }
                if (r11 == 0) goto L_0x020d
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                k04 r11 = r11.mo61464d0()     // Catch:{ Exception -> 0x003d }
                java.lang.Object r11 = r11.getValue()     // Catch:{ Exception -> 0x003d }
                p000.vx2.m53588d(r11)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$a r11 = (net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel.C8738a) r11     // Catch:{ Exception -> 0x003d }
                java.math.BigDecimal r11 = r11.mo61484a()     // Catch:{ Exception -> 0x003d }
                java.math.BigDecimal r2 = java.math.BigDecimal.ZERO     // Catch:{ Exception -> 0x003d }
                int r11 = r11.compareTo(r2)     // Catch:{ Exception -> 0x003d }
                if (r11 <= 0) goto L_0x020d
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2 r11 = r11.f42873w     // Catch:{ Exception -> 0x003d }
                p000.vx2.m53588d(r11)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r2 = r3     // Catch:{ Exception -> 0x003d }
                k04 r2 = r2.mo61464d0()     // Catch:{ Exception -> 0x003d }
                java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x003d }
                p000.vx2.m53588d(r2)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$a r2 = (net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel.C8738a) r2     // Catch:{ Exception -> 0x003d }
                r10.label = r5     // Catch:{ Exception -> 0x003d }
                java.lang.Object r11 = r11.mo61818i(r2, r10)     // Catch:{ Exception -> 0x003d }
                if (r11 != r1) goto L_0x00fe
                return r1
            L_0x00fe:
                java.math.BigDecimal r11 = (java.math.BigDecimal) r11     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r2 = r3     // Catch:{ Exception -> 0x003d }
                k04 r2 = r2.mo61437C()     // Catch:{ Exception -> 0x003d }
                double r5 = r11.doubleValue()     // Catch:{ Exception -> 0x003d }
                java.lang.Double r11 = p000.a40.m31671b(r5)     // Catch:{ Exception -> 0x003d }
                r2.postValue(r11)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2 r11 = r11.f42873w     // Catch:{ Exception -> 0x003d }
                p000.vx2.m53588d(r11)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r2 = r3     // Catch:{ Exception -> 0x003d }
                k04 r2 = r2.mo61464d0()     // Catch:{ Exception -> 0x003d }
                java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x003d }
                p000.vx2.m53588d(r2)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$a r2 = (net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel.C8738a) r2     // Catch:{ Exception -> 0x003d }
                r10.label = r4     // Catch:{ Exception -> 0x003d }
                java.lang.Object r11 = r11.mo61826q(r2, r10)     // Catch:{ Exception -> 0x003d }
                if (r11 != r1) goto L_0x0132
                return r1
            L_0x0132:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ Exception -> 0x003d }
                boolean r11 = r11.booleanValue()     // Catch:{ Exception -> 0x003d }
                if (r11 != 0) goto L_0x0149
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                k04 r11 = r11.mo61441G()     // Catch:{ Exception -> 0x003d }
                java.lang.Integer r0 = p000.a40.m31673d(r8)     // Catch:{ Exception -> 0x003d }
                r11.postValue(r0)     // Catch:{ Exception -> 0x003d }
                goto L_0x0226
            L_0x0149:
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                k04 r11 = r11.mo61441G()     // Catch:{ Exception -> 0x003d }
                java.lang.Integer r2 = p000.a40.m31673d(r9)     // Catch:{ Exception -> 0x003d }
                r11.postValue(r2)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2 r11 = r11.f42873w     // Catch:{ Exception -> 0x003d }
                p000.vx2.m53588d(r11)     // Catch:{ Exception -> 0x003d }
                r10.label = r3     // Catch:{ Exception -> 0x003d }
                java.lang.Object r11 = r11.mo61820k(r10)     // Catch:{ Exception -> 0x003d }
                if (r11 != r1) goto L_0x0168
                return r1
            L_0x0168:
                zr1 r11 = (p000.zr1) r11     // Catch:{ Exception -> 0x003d }
                if (r11 == 0) goto L_0x01ec
                ag5$a r1 = r11.getError()     // Catch:{ Exception -> 0x003d }
                if (r1 == 0) goto L_0x0174
                goto L_0x01ec
            L_0x0174:
                r1 = 18
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r2 = r3     // Catch:{ Exception -> 0x003d }
                java.math.BigInteger r2 = r2.mo61451Q()     // Catch:{ Exception -> 0x003d }
                java.lang.String r3 = "getGasPrice()"
                p000.vx2.m53590f(r2, r3)     // Catch:{ Exception -> 0x003d }
                java.math.BigInteger r3 = r11.getAmountUsed()     // Catch:{ Exception -> 0x003d }
                p000.vx2.m53590f(r3, r0)     // Catch:{ Exception -> 0x003d }
                java.math.BigInteger r2 = r2.multiply(r3)     // Catch:{ Exception -> 0x003d }
                java.lang.String r3 = "this.multiply(other)"
                p000.vx2.m53590f(r2, r3)     // Catch:{ Exception -> 0x003d }
                java.math.BigDecimal r1 = p000.ol0.m70376r(r2, r1)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r2 = r3     // Catch:{ Exception -> 0x003d }
                k04 r2 = r2.mo61465e0()     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r3 = r3     // Catch:{ Exception -> 0x003d }
                r4 = 2131952629(0x7f1303f5, float:1.9541706E38)
                java.lang.String r3 = r3.mo61462b0(r4)     // Catch:{ Exception -> 0x003d }
                java.lang.String r4 = "amount"
                p000.vx2.m53590f(r1, r4)     // Catch:{ Exception -> 0x003d }
                java.lang.String r1 = p000.ol0.m70360g0(r1, r9, r8, r7)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r4 = r3     // Catch:{ Exception -> 0x003d }
                boolean r4 = r4.mo61468h0()     // Catch:{ Exception -> 0x003d }
                if (r4 == 0) goto L_0x01b8
                java.lang.String r4 = " ETH"
                goto L_0x01ba
            L_0x01b8:
                java.lang.String r4 = " BNB"
            L_0x01ba:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003d }
                r5.<init>()     // Catch:{ Exception -> 0x003d }
                r5.append(r3)     // Catch:{ Exception -> 0x003d }
                java.lang.String r3 = " "
                r5.append(r3)     // Catch:{ Exception -> 0x003d }
                r5.append(r1)     // Catch:{ Exception -> 0x003d }
                r5.append(r4)     // Catch:{ Exception -> 0x003d }
                java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x003d }
                r2.postValue(r1)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r1 = r3     // Catch:{ Exception -> 0x003d }
                k04 r1 = r1.mo61466f0()     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$c r2 = new net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$c     // Catch:{ Exception -> 0x003d }
                java.math.BigInteger r11 = r11.getAmountUsed()     // Catch:{ Exception -> 0x003d }
                p000.vx2.m53590f(r11, r0)     // Catch:{ Exception -> 0x003d }
                java.lang.String r0 = "swapExactTokensForTokens"
                r2.<init>(r11, r0)     // Catch:{ Exception -> 0x003d }
                r1.postValue(r2)     // Catch:{ Exception -> 0x003d }
                goto L_0x0226
            L_0x01ec:
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                k04 r11 = r11.mo61466f0()     // Catch:{ Exception -> 0x003d }
                r11.postValue(r7)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                k04 r11 = r11.mo61465e0()     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r0 = r3     // Catch:{ Exception -> 0x003d }
                r1 = 2131952617(0x7f1303e9, float:1.9541682E38)
                java.lang.String r0 = r0.mo61462b0(r1)     // Catch:{ Exception -> 0x003d }
                r11.postValue(r0)     // Catch:{ Exception -> 0x003d }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                r11.mo61477u0()     // Catch:{ Exception -> 0x003d }
                goto L_0x0226
            L_0x020d:
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3     // Catch:{ Exception -> 0x003d }
                k04 r11 = r11.mo61437C()     // Catch:{ Exception -> 0x003d }
                r0 = 0
                java.lang.Double r0 = p000.a40.m31671b(r0)     // Catch:{ Exception -> 0x003d }
                r11.postValue(r0)     // Catch:{ Exception -> 0x003d }
                goto L_0x0226
            L_0x021d:
                java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x003a }
                java.lang.String r0 = "Error"
                p000.ol0.m70350b0(r11, r0)     // Catch:{ all -> 0x003a }
            L_0x0226:
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r11 = r3
                k04 r11 = r11.mo61442H()
                java.lang.Boolean r0 = p000.a40.m31670a(r9)
                r11.postValue(r0)
                r37 r11 = p000.r37.f33317a
                return r11
            L_0x0236:
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r0 = r3
                k04 r0 = r0.mo61442H()
                java.lang.Boolean r1 = p000.a40.m31670a(r9)
                r0.postValue(r1)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$getAmountOut$1.C87491.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationViewModel$getAmountOut$1(SwapMigrationViewModel swapMigrationViewModel, ns0<? super SwapMigrationViewModel$getAmountOut$1> ns0) {
        super(2, ns0);
        this.this$0 = swapMigrationViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new SwapMigrationViewModel$getAmountOut$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((SwapMigrationViewModel$getAmountOut$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final SwapMigrationViewModel swapMigrationViewModel = this.this$0;
            C87491 r1 = new C87491((ns0<? super C87491>) null);
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
