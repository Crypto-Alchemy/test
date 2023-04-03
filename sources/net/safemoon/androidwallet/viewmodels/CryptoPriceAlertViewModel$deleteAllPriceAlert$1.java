package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$deleteAllPriceAlert$1", mo48632f = "CryptoPriceAlertViewModel.kt", mo48633l = {183, 186, 189}, mo48634m = "invokeSuspend")
/* compiled from: CryptoPriceAlertViewModel.kt */
public final class CryptoPriceAlertViewModel$deleteAllPriceAlert$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ PriceAlertToken $paToken;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ CryptoPriceAlertViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertViewModel$deleteAllPriceAlert$1(CryptoPriceAlertViewModel cryptoPriceAlertViewModel, PriceAlertToken priceAlertToken, ns0<? super CryptoPriceAlertViewModel$deleteAllPriceAlert$1> ns0) {
        super(2, ns0);
        this.this$0 = cryptoPriceAlertViewModel;
        this.$paToken = priceAlertToken;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CryptoPriceAlertViewModel$deleteAllPriceAlert$1(this.this$0, this.$paToken, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CryptoPriceAlertViewModel$deleteAllPriceAlert$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00dc A[Catch:{ Exception -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0125 A[Catch:{ Exception -> 0x013e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            r33 = this;
            r7 = r33
            java.lang.Object r8 = p000.wx2.m54101d()
            int r0 = r7.label
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0040
            if (r0 == r3) goto L_0x002a
            if (r0 == r2) goto L_0x0023
            if (r0 != r1) goto L_0x001b
            p000.hg5.m45199b(r34)     // Catch:{ Exception -> 0x013e }
            r0 = r34
            goto L_0x0121
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            p000.hg5.m45199b(r34)     // Catch:{ Exception -> 0x013e }
            r0 = r34
            goto L_0x00d4
        L_0x002a:
            java.lang.Object r0 = r7.L$2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r7.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r7.L$0
            java.lang.String r5 = (java.lang.String) r5
            p000.hg5.m45199b(r34)
            r16 = r0
            r12 = r3
            r14 = r5
            r3 = r34
            goto L_0x0073
        L_0x0040:
            p000.hg5.m45199b(r34)
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r0 = r7.this$0
            r0.mo61142y()
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r0 = r7.$paToken
            java.lang.String r5 = r0.getTokenAddress()
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r0 = r7.$paToken
            java.lang.String r0 = r0.getTokenSymbol()
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r6 = r7.$paToken
            java.lang.String r6 = r6.getTokenId()
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r9 = r7.this$0
            net.safemoon.androidwallet.repository.FcmDataSource r9 = r9.mo61133o()
            r7.L$0 = r5
            r7.L$1 = r0
            r7.L$2 = r6
            r7.label = r3
            java.lang.Object r3 = r9.mo60724c(r7)
            if (r3 != r8) goto L_0x006f
            return r8
        L_0x006f:
            r12 = r0
            r14 = r5
            r16 = r6
        L_0x0073:
            r17 = r3
            java.lang.String r17 = (java.lang.String) r17
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r0 = r7.this$0
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r0.mo61132n()
            p000.vx2.m53588d(r0)
            net.safemoon.androidwallet.common.MyCoinType r3 = net.safemoon.androidwallet.common.MyCoinType.ETHEREUM
            int r3 = r3.getValue()
            java.lang.String r11 = r0.getAddress(r3)
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r9 = new net.safemoon.androidwallet.model.priceAlert.PriceAlertToken
            r10 = 0
            r13 = 0
            r15 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 2096937(0x1fff29, float:2.938435E-39)
            r32 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r0 = r7.this$0     // Catch:{ Exception -> 0x013e }
            tk5 r0 = r0.mo61135q()     // Catch:{ Exception -> 0x013e }
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r3 = r7.$paToken     // Catch:{ Exception -> 0x013e }
            r3.setId(r4)     // Catch:{ Exception -> 0x013e }
            k90 r0 = r0.mo66093l(r3)     // Catch:{ Exception -> 0x013e }
            java.lang.String r3 = "mainNetApiInterface.dele…oken.apply { id = null })"
            p000.vx2.m53590f(r0, r3)     // Catch:{ Exception -> 0x013e }
            r7.L$0 = r4     // Catch:{ Exception -> 0x013e }
            r7.L$1 = r4     // Catch:{ Exception -> 0x013e }
            r7.L$2 = r4     // Catch:{ Exception -> 0x013e }
            r7.label = r2     // Catch:{ Exception -> 0x013e }
            java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r7)     // Catch:{ Exception -> 0x013e }
            if (r0 != r8) goto L_0x00d4
            return r8
        L_0x00d4:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x013e }
            boolean r0 = r0.mo50581e()     // Catch:{ Exception -> 0x013e }
            if (r0 == 0) goto L_0x013e
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r0 = r7.this$0     // Catch:{ Exception -> 0x013e }
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r2 = r7.$paToken     // Catch:{ Exception -> 0x013e }
            java.lang.String r2 = r2.getTokenSymbol()     // Catch:{ Exception -> 0x013e }
            p000.vx2.m53588d(r2)     // Catch:{ Exception -> 0x013e }
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r3 = r7.$paToken     // Catch:{ Exception -> 0x013e }
            java.lang.String r3 = r3.getTokenName()     // Catch:{ Exception -> 0x013e }
            p000.vx2.m53588d(r3)     // Catch:{ Exception -> 0x013e }
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r5 = r7.$paToken     // Catch:{ Exception -> 0x013e }
            java.lang.String r5 = r5.getTokenAddress()     // Catch:{ Exception -> 0x013e }
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r6 = r7.$paToken     // Catch:{ Exception -> 0x013e }
            java.lang.Integer r6 = r6.getChainId()     // Catch:{ Exception -> 0x013e }
            if (r6 == 0) goto L_0x0103
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x013e }
            goto L_0x0104
        L_0x0103:
            r6 = -1
        L_0x0104:
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r9 = r7.$paToken     // Catch:{ Exception -> 0x013e }
            java.lang.String r9 = r9.getTokenId()     // Catch:{ Exception -> 0x013e }
            if (r9 == 0) goto L_0x0110
            java.lang.Integer r4 = p000.xb6.m73916n(r9)     // Catch:{ Exception -> 0x013e }
        L_0x0110:
            r9 = r4
            r7.label = r1     // Catch:{ Exception -> 0x013e }
            r1 = r2
            r2 = r3
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r33
            java.lang.Object r0 = r0.mo61136r(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x013e }
            if (r0 != r8) goto L_0x0121
            return r8
        L_0x0121:
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r0 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r0     // Catch:{ Exception -> 0x013e }
            if (r0 == 0) goto L_0x013e
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r1 = r7.this$0     // Catch:{ Exception -> 0x013e }
            k04 r2 = r1.mo61137s()     // Catch:{ Exception -> 0x013e }
            java.util.List r0 = p000.bk0.m32598e(r0)     // Catch:{ Exception -> 0x013e }
            r2.postValue(r0)     // Catch:{ Exception -> 0x013e }
            k04 r0 = r1.mo61139u()     // Catch:{ Exception -> 0x013e }
            r1 = 0
            java.lang.Integer r1 = p000.a40.m31673d(r1)     // Catch:{ Exception -> 0x013e }
            r0.postValue(r1)     // Catch:{ Exception -> 0x013e }
        L_0x013e:
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r0 = r7.this$0
            r0.mo61143z()
            r37 r0 = p000.r37.f33317a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$deleteAllPriceAlert$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
