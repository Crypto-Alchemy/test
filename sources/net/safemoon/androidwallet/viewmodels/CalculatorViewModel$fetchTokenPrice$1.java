package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CalculatorViewModel$fetchTokenPrice$1", mo48632f = "CalculatorViewModel.kt", mo48633l = {289}, mo48634m = "invokeSuspend")
/* compiled from: CalculatorViewModel.kt */
public final class CalculatorViewModel$fetchTokenPrice$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ pc2<r37> $callBack;
    public final /* synthetic */ Ref$ObjectRef<String> $tokenAddress;
    public final /* synthetic */ String $tokenId;
    public int label;
    public final /* synthetic */ CalculatorViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CalculatorViewModel$fetchTokenPrice$1$1", mo48632f = "CalculatorViewModel.kt", mo48633l = {295, 304}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.CalculatorViewModel$fetchTokenPrice$1$1 */
    /* compiled from: CalculatorViewModel.kt */
    public static final class C86461 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86461(calculatorViewModel, ref$ObjectRef, str, pc2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86461) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00bc A[Catch:{ Exception -> 0x00e3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3 A[Catch:{ Exception -> 0x00e3 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0030
                if (r1 == r3) goto L_0x0024
                if (r1 != r2) goto L_0x001c
                java.lang.Object r0 = r11.L$1
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel r0 = (net.safemoon.androidwallet.viewmodels.CalculatorViewModel) r0
                java.lang.Object r1 = r11.L$0
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel r1 = (net.safemoon.androidwallet.viewmodels.CalculatorViewModel) r1
                p000.hg5.m45199b(r12)     // Catch:{ Exception -> 0x00e3 }
                goto L_0x00aa
            L_0x001c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0024:
                java.lang.Object r1 = r11.L$1
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel r1 = (net.safemoon.androidwallet.viewmodels.CalculatorViewModel) r1
                java.lang.Object r3 = r11.L$0
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel r3 = (net.safemoon.androidwallet.viewmodels.CalculatorViewModel) r3
                p000.hg5.m45199b(r12)     // Catch:{ Exception -> 0x007f }
                goto L_0x005f
            L_0x0030:
                p000.hg5.m45199b(r12)
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel r12 = r4
                r12.mo60992C(r4)
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel r1 = r4
                ho3 r12 = p000.C9384u3.m72571l()     // Catch:{ Exception -> 0x007e }
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r5 = r5     // Catch:{ Exception -> 0x007e }
                T r5 = r5.element     // Catch:{ Exception -> 0x007e }
                r6 = r5
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x007e }
                net.safemoon.androidwallet.utils.Common r7 = net.safemoon.androidwallet.utils.Common.f42577a     // Catch:{ Exception -> 0x007e }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x007e }
                java.lang.String r5 = r7.mo60908o(r5)     // Catch:{ Exception -> 0x007e }
                k90 r12 = r12.mo52280i(r6, r5)     // Catch:{ Exception -> 0x007e }
                r11.L$0 = r1     // Catch:{ Exception -> 0x007e }
                r11.L$1 = r1     // Catch:{ Exception -> 0x007e }
                r11.label = r3     // Catch:{ Exception -> 0x007e }
                java.lang.Object r12 = retrofit2.KotlinExtensions.m71521c(r12, r11)     // Catch:{ Exception -> 0x007e }
                if (r12 != r0) goto L_0x005e
                return r0
            L_0x005e:
                r3 = r1
            L_0x005f:
                bg5 r12 = (p000.bg5) r12     // Catch:{ Exception -> 0x007f }
                java.lang.Object r12 = r12.mo50578a()     // Catch:{ Exception -> 0x007f }
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfoResult r12 = (net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfoResult) r12     // Catch:{ Exception -> 0x007f }
                if (r12 == 0) goto L_0x0080
                net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo r12 = r12.getData()     // Catch:{ Exception -> 0x007f }
                if (r12 == 0) goto L_0x0080
                java.lang.String r12 = r12.getPriceUsd()     // Catch:{ Exception -> 0x007f }
                if (r12 == 0) goto L_0x0080
                double r5 = java.lang.Double.parseDouble(r12)     // Catch:{ Exception -> 0x007f }
                java.lang.Double r12 = p000.a40.m31671b(r5)     // Catch:{ Exception -> 0x007f }
                goto L_0x0081
            L_0x007e:
                r3 = r1
            L_0x007f:
                r1 = r3
            L_0x0080:
                r12 = r4
            L_0x0081:
                r1.mo60992C(r12)
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel r12 = r4
                java.lang.Double r12 = r12.mo61009s()
                if (r12 != 0) goto L_0x00e8
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel r12 = r4
                p70 r1 = p000.C9384u3.m72566g()     // Catch:{ Exception -> 0x00e2 }
                java.lang.String r3 = r6     // Catch:{ Exception -> 0x00e2 }
                java.lang.String r5 = "USD"
                k90 r1 = r1.mo65249a(r3, r5)     // Catch:{ Exception -> 0x00e2 }
                r11.L$0 = r12     // Catch:{ Exception -> 0x00e2 }
                r11.L$1 = r12     // Catch:{ Exception -> 0x00e2 }
                r11.label = r2     // Catch:{ Exception -> 0x00e2 }
                java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r11)     // Catch:{ Exception -> 0x00e2 }
                if (r1 != r0) goto L_0x00a7
                return r0
            L_0x00a7:
                r0 = r12
                r12 = r1
                r1 = r0
            L_0x00aa:
                bg5 r12 = (p000.bg5) r12     // Catch:{ Exception -> 0x00e3 }
                java.lang.Object r12 = r12.mo50578a()     // Catch:{ Exception -> 0x00e3 }
                com.google.gson.JsonObject r12 = (com.google.gson.JsonObject) r12     // Catch:{ Exception -> 0x00e3 }
                if (r12 == 0) goto L_0x00c3
                java.lang.String r2 = "data"
                com.google.gson.JsonObject r12 = r12.getAsJsonObject(r2)     // Catch:{ Exception -> 0x00e3 }
                if (r12 == 0) goto L_0x00c3
                java.lang.String r2 = r6     // Catch:{ Exception -> 0x00e3 }
                com.google.gson.JsonObject r12 = r12.getAsJsonObject(r2)     // Catch:{ Exception -> 0x00e3 }
                goto L_0x00c4
            L_0x00c3:
                r12 = r4
            L_0x00c4:
                com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00e3 }
                r2.<init>()     // Catch:{ Exception -> 0x00e3 }
                java.lang.Class<net.safemoon.androidwallet.model.Coin> r3 = net.safemoon.androidwallet.model.Coin.class
                java.lang.Object r12 = r2.fromJson((com.google.gson.JsonElement) r12, r3)     // Catch:{ Exception -> 0x00e3 }
                net.safemoon.androidwallet.model.Coin r12 = (net.safemoon.androidwallet.model.Coin) r12     // Catch:{ Exception -> 0x00e3 }
                net.safemoon.androidwallet.model.Quote r12 = r12.getQuote()     // Catch:{ Exception -> 0x00e3 }
                if (r12 == 0) goto L_0x00e4
                net.safemoon.androidwallet.model.USDT r12 = r12.getUSD()     // Catch:{ Exception -> 0x00e3 }
                if (r12 == 0) goto L_0x00e4
                java.lang.Double r12 = r12.getPrice()     // Catch:{ Exception -> 0x00e3 }
                goto L_0x00e5
            L_0x00e2:
                r1 = r12
            L_0x00e3:
                r0 = r1
            L_0x00e4:
                r12 = r4
            L_0x00e5:
                r0.mo60992C(r12)
            L_0x00e8:
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel r12 = r4
                hu0 r5 = p000.cd7.m11843a(r12)
                r6 = 0
                r7 = 0
                net.safemoon.androidwallet.viewmodels.CalculatorViewModel$fetchTokenPrice$1$1$1 r8 = new net.safemoon.androidwallet.viewmodels.CalculatorViewModel$fetchTokenPrice$1$1$1
                pc2<r37> r12 = r7
                r8.<init>(r12, r4)
                r9 = 3
                r10 = 0
                p000.y23 unused = p000.d50.m56748b(r5, r6, r7, r8, r9, r10)
                r37 r12 = p000.r37.f33317a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CalculatorViewModel$fetchTokenPrice$1.C86461.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculatorViewModel$fetchTokenPrice$1(CalculatorViewModel calculatorViewModel, Ref$ObjectRef<String> ref$ObjectRef, String str, pc2<r37> pc2, ns0<? super CalculatorViewModel$fetchTokenPrice$1> ns0) {
        super(2, ns0);
        this.this$0 = calculatorViewModel;
        this.$tokenAddress = ref$ObjectRef;
        this.$tokenId = str;
        this.$callBack = pc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CalculatorViewModel$fetchTokenPrice$1(this.this$0, this.$tokenAddress, this.$tokenId, this.$callBack, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CalculatorViewModel$fetchTokenPrice$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final CalculatorViewModel calculatorViewModel = this.this$0;
            final Ref$ObjectRef<String> ref$ObjectRef = this.$tokenAddress;
            final String str = this.$tokenId;
            final pc2<r37> pc2 = this.$callBack;
            C86461 r3 = new C86461((ns0<? super C86461>) null);
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
