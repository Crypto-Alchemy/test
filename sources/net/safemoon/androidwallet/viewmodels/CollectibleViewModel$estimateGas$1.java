package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel$estimateGas$1", mo48632f = "CollectibleViewModel.kt", mo48633l = {408}, mo48634m = "invokeSuspend")
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$estimateGas$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ no2 $iNFTWeb;
    public final /* synthetic */ String $toAddress;
    public final /* synthetic */ String $tokenId;
    public int label;
    public final /* synthetic */ CollectibleViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel$estimateGas$1$1", mo48632f = "CollectibleViewModel.kt", mo48633l = {411, 417}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.CollectibleViewModel$estimateGas$1$1 */
    /* compiled from: CollectibleViewModel.kt */
    public static final class C86491 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86491(no2, str, str2, collectibleViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86491) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2 A[Catch:{ Exception -> 0x017a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r14.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002f
                if (r1 == r3) goto L_0x0027
                if (r1 != r2) goto L_0x001f
                java.lang.Object r0 = r14.L$2
                java.math.BigInteger r0 = (java.math.BigInteger) r0
                java.lang.Object r1 = r14.L$1
                java.math.BigInteger r1 = (java.math.BigInteger) r1
                java.lang.Object r2 = r14.L$0
                net.safemoon.androidwallet.common.TokenType r2 = (net.safemoon.androidwallet.common.TokenType) r2
                p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x017a }
                goto L_0x009e
            L_0x001f:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0027:
                java.lang.Object r1 = r14.L$0
                net.safemoon.androidwallet.common.TokenType r1 = (net.safemoon.androidwallet.common.TokenType) r1
                p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x017a }
                goto L_0x0074
            L_0x002f:
                p000.hg5.m45199b(r15)
                net.safemoon.androidwallet.common.TokenType$a r15 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x017a }
                no2 r1 = r4     // Catch:{ Exception -> 0x017a }
                if (r1 == 0) goto L_0x0041
                int r1 = r1.getChain()     // Catch:{ Exception -> 0x017a }
                java.lang.Integer r1 = p000.a40.m31673d(r1)     // Catch:{ Exception -> 0x017a }
                goto L_0x0042
            L_0x0041:
                r1 = 0
            L_0x0042:
                p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x017a }
                int r1 = r1.intValue()     // Catch:{ Exception -> 0x017a }
                net.safemoon.androidwallet.common.TokenType r15 = r15.mo57099b(r1)     // Catch:{ Exception -> 0x017a }
                no2 r4 = r4     // Catch:{ Exception -> 0x017a }
                java.lang.String r5 = r5     // Catch:{ Exception -> 0x017a }
                java.lang.String r1 = r6     // Catch:{ Exception -> 0x017a }
                java.math.BigInteger r1 = p000.wb6.m73528j(r1)     // Catch:{ Exception -> 0x017a }
                if (r1 != 0) goto L_0x005b
                java.math.BigInteger r1 = java.math.BigInteger.ZERO     // Catch:{ Exception -> 0x017a }
            L_0x005b:
                r6 = r1
                java.lang.String r1 = "tokenId.toBigIntegerOrNull() ?: BigInteger.ZERO"
                p000.vx2.m53590f(r6, r1)     // Catch:{ Exception -> 0x017a }
                r7 = 0
                r8 = 1
                r10 = 4
                r11 = 0
                r14.L$0 = r15     // Catch:{ Exception -> 0x017a }
                r14.label = r3     // Catch:{ Exception -> 0x017a }
                r9 = r14
                java.lang.Object r1 = p000.no2.C8998a.m69887a(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x017a }
                if (r1 != r0) goto L_0x0071
                return r0
            L_0x0071:
                r13 = r1
                r1 = r15
                r15 = r13
            L_0x0074:
                zr1 r15 = (p000.zr1) r15     // Catch:{ Exception -> 0x017a }
                java.math.BigInteger r15 = r15.getAmountUsed()     // Catch:{ Exception -> 0x017a }
                no2 r3 = r4     // Catch:{ Exception -> 0x017a }
                java.math.BigInteger r3 = r3.getGasPrice()     // Catch:{ Exception -> 0x017a }
                net.safemoon.androidwallet.viewmodels.CollectibleViewModel r4 = r7     // Catch:{ Exception -> 0x017a }
                z57 r4 = r4.mo61048Q()     // Catch:{ Exception -> 0x017a }
                java.lang.String r5 = r1.getSymbolWithType()     // Catch:{ Exception -> 0x017a }
                r14.L$0 = r1     // Catch:{ Exception -> 0x017a }
                r14.L$1 = r15     // Catch:{ Exception -> 0x017a }
                r14.L$2 = r3     // Catch:{ Exception -> 0x017a }
                r14.label = r2     // Catch:{ Exception -> 0x017a }
                java.lang.Object r2 = r4.mo50079f(r5, r14)     // Catch:{ Exception -> 0x017a }
                if (r2 != r0) goto L_0x0099
                return r0
            L_0x0099:
                r0 = r3
                r13 = r1
                r1 = r15
                r15 = r2
                r2 = r13
            L_0x009e:
                net.safemoon.androidwallet.model.token.room.RoomToken r15 = (net.safemoon.androidwallet.model.token.room.RoomToken) r15     // Catch:{ Exception -> 0x017a }
                if (r15 == 0) goto L_0x017a
                net.safemoon.androidwallet.viewmodels.CollectibleViewModel r3 = r7     // Catch:{ Exception -> 0x017a }
                java.math.BigInteger r0 = r1.multiply(r0)     // Catch:{ Exception -> 0x017a }
                java.lang.String r1 = "gasLimit.multiply(gasPrice)"
                p000.vx2.m53590f(r0, r1)     // Catch:{ Exception -> 0x017a }
                r1 = 18
                java.math.BigDecimal r0 = p000.ol0.m70376r(r0, r1)     // Catch:{ Exception -> 0x017a }
                double r0 = r0.doubleValue()     // Catch:{ Exception -> 0x017a }
                java.lang.Double r0 = p000.a40.m31671b(r0)     // Catch:{ Exception -> 0x017a }
                r3.mo61055f0(r0)     // Catch:{ Exception -> 0x017a }
                double r0 = r15.getNativeBalance()     // Catch:{ Exception -> 0x017a }
                java.lang.Double r0 = p000.a40.m31671b(r0)     // Catch:{ Exception -> 0x017a }
                r3.mo61054e0(r0)     // Catch:{ Exception -> 0x017a }
                k04 r0 = r3.mo61037F()     // Catch:{ Exception -> 0x017a }
                java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x017a }
                net.safemoon.androidwallet.model.common.LoadingState r0 = (net.safemoon.androidwallet.model.common.LoadingState) r0     // Catch:{ Exception -> 0x017a }
                k04 r1 = r3.mo61037F()     // Catch:{ Exception -> 0x017a }
                r1.postValue(r0)     // Catch:{ Exception -> 0x017a }
                double r0 = r15.getPriceInUsdt()     // Catch:{ Exception -> 0x017a }
                java.lang.Double r15 = r3.mo61038G()     // Catch:{ Exception -> 0x017a }
                p000.vx2.m53588d(r15)     // Catch:{ Exception -> 0x017a }
                double r4 = r15.doubleValue()     // Catch:{ Exception -> 0x017a }
                double r0 = r0 * r4
                rz1$a r15 = p000.rz1.f44501a     // Catch:{ Exception -> 0x017a }
                java.lang.String r15 = r15.mo65772b()     // Catch:{ Exception -> 0x017a }
                java.lang.String r4 = "$"
                boolean r4 = p000.vx2.m53586b(r15, r4)     // Catch:{ Exception -> 0x017a }
                java.lang.String r5 = " "
                if (r4 != 0) goto L_0x0109
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017a }
                r4.<init>()     // Catch:{ Exception -> 0x017a }
                r4.append(r15)     // Catch:{ Exception -> 0x017a }
                r4.append(r5)     // Catch:{ Exception -> 0x017a }
                java.lang.String r15 = r4.toString()     // Catch:{ Exception -> 0x017a }
            L_0x0109:
                java.lang.Double r4 = r3.mo61038G()     // Catch:{ Exception -> 0x017a }
                p000.vx2.m53588d(r4)     // Catch:{ Exception -> 0x017a }
                double r6 = r4.doubleValue()     // Catch:{ Exception -> 0x017a }
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                java.lang.String r4 = p000.ol0.m70374p(r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x017a }
                java.lang.String r2 = r2.getNativeToken()     // Catch:{ Exception -> 0x017a }
                double r6 = p000.sz1.m72124a(r0)     // Catch:{ Exception -> 0x017a }
                r8 = 2
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                java.lang.String r6 = p000.ol0.m70374p(r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x017a }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017a }
                r7.<init>()     // Catch:{ Exception -> 0x017a }
                r7.append(r4)     // Catch:{ Exception -> 0x017a }
                r7.append(r5)     // Catch:{ Exception -> 0x017a }
                r7.append(r2)     // Catch:{ Exception -> 0x017a }
                java.lang.String r2 = " ("
                r7.append(r2)     // Catch:{ Exception -> 0x017a }
                r7.append(r15)     // Catch:{ Exception -> 0x017a }
                r7.append(r6)     // Catch:{ Exception -> 0x017a }
                java.lang.String r2 = ")"
                r7.append(r2)     // Catch:{ Exception -> 0x017a }
                java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x017a }
                k04 r4 = r3.mo61036E()     // Catch:{ Exception -> 0x017a }
                r4.postValue(r2)     // Catch:{ Exception -> 0x017a }
                k04 r2 = r3.mo61043L()     // Catch:{ Exception -> 0x017a }
                double r3 = p000.sz1.m72124a(r0)     // Catch:{ Exception -> 0x017a }
                r5 = 2
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                java.lang.String r0 = p000.ol0.m70374p(r3, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x017a }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017a }
                r1.<init>()     // Catch:{ Exception -> 0x017a }
                r1.append(r15)     // Catch:{ Exception -> 0x017a }
                r1.append(r0)     // Catch:{ Exception -> 0x017a }
                java.lang.String r15 = r1.toString()     // Catch:{ Exception -> 0x017a }
                r2.postValue(r15)     // Catch:{ Exception -> 0x017a }
            L_0x017a:
                r37 r15 = p000.r37.f33317a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CollectibleViewModel$estimateGas$1.C86491.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$estimateGas$1(no2 no2, String str, String str2, CollectibleViewModel collectibleViewModel, ns0<? super CollectibleViewModel$estimateGas$1> ns0) {
        super(2, ns0);
        this.$iNFTWeb = no2;
        this.$toAddress = str;
        this.$tokenId = str2;
        this.this$0 = collectibleViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CollectibleViewModel$estimateGas$1(this.$iNFTWeb, this.$toAddress, this.$tokenId, this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CollectibleViewModel$estimateGas$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final no2 no2 = this.$iNFTWeb;
            final String str = this.$toAddress;
            final String str2 = this.$tokenId;
            final CollectibleViewModel collectibleViewModel = this.this$0;
            C86491 r3 = new C86491((ns0<? super C86491>) null);
            this.label = 1;
            if (b50.m55768e(b, r3, this) == d) {
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
