package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$deletePriceAlert$1", mo48632f = "CryptoPriceAlertViewModel.kt", mo48633l = {129, 142}, mo48634m = "invokeSuspend")
/* compiled from: CryptoPriceAlertViewModel.kt */
public final class CryptoPriceAlertViewModel$deletePriceAlert$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ int $position;
    public final /* synthetic */ PriceAlertToken $priceAlertData;
    public int label;
    public final /* synthetic */ CryptoPriceAlertViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertViewModel$deletePriceAlert$1(CryptoPriceAlertViewModel cryptoPriceAlertViewModel, PriceAlertToken priceAlertToken, int i, ns0<? super CryptoPriceAlertViewModel$deletePriceAlert$1> ns0) {
        super(2, ns0);
        this.this$0 = cryptoPriceAlertViewModel;
        this.$priceAlertData = priceAlertToken;
        this.$position = i;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CryptoPriceAlertViewModel$deletePriceAlert$1(this.this$0, this.$priceAlertData, this.$position, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CryptoPriceAlertViewModel$deletePriceAlert$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ee A[Catch:{ Exception -> 0x0127 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ef A[Catch:{ Exception -> 0x0127 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0105 A[Catch:{ Exception -> 0x0127 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0118 A[Catch:{ Exception -> 0x0127 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r14.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r4) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x0127 }
            goto L_0x00e0
        L_0x0014:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x001c:
            p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x0127 }
            goto L_0x0042
        L_0x0020:
            p000.hg5.m45199b(r15)
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r15 = r14.this$0
            r15.mo61142y()
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r15 = r14.this$0     // Catch:{ Exception -> 0x0127 }
            tk5 r15 = r15.mo61135q()     // Catch:{ Exception -> 0x0127 }
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r1 = r14.$priceAlertData     // Catch:{ Exception -> 0x0127 }
            k90 r15 = r15.mo66085d(r1)     // Catch:{ Exception -> 0x0127 }
            java.lang.String r1 = "mainNetApiInterface.dele…riceAlert(priceAlertData)"
            p000.vx2.m53590f(r15, r1)     // Catch:{ Exception -> 0x0127 }
            r14.label = r4     // Catch:{ Exception -> 0x0127 }
            java.lang.Object r15 = retrofit2.KotlinExtensions.m71521c(r15, r14)     // Catch:{ Exception -> 0x0127 }
            if (r15 != r0) goto L_0x0042
            return r0
        L_0x0042:
            bg5 r15 = (p000.bg5) r15     // Catch:{ Exception -> 0x0127 }
            boolean r1 = r15.mo50581e()     // Catch:{ Exception -> 0x0127 }
            if (r1 == 0) goto L_0x0127
            java.lang.Object r15 = r15.mo50578a()     // Catch:{ Exception -> 0x0127 }
            if (r15 == 0) goto L_0x0127
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r15 = r14.this$0     // Catch:{ Exception -> 0x0127 }
            k04 r15 = r15.mo61137s()     // Catch:{ Exception -> 0x0127 }
            java.lang.Object r15 = r15.getValue()     // Catch:{ Exception -> 0x0127 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ Exception -> 0x0127 }
            r1 = 0
            if (r15 == 0) goto L_0x008a
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r5 = r14.$priceAlertData     // Catch:{ Exception -> 0x0127 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0127 }
            r6.<init>()     // Catch:{ Exception -> 0x0127 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ Exception -> 0x0127 }
        L_0x006a:
            boolean r7 = r15.hasNext()     // Catch:{ Exception -> 0x0127 }
            if (r7 == 0) goto L_0x008b
            java.lang.Object r7 = r15.next()     // Catch:{ Exception -> 0x0127 }
            r8 = r7
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r8 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r8     // Catch:{ Exception -> 0x0127 }
            java.lang.Integer r8 = r8.getId()     // Catch:{ Exception -> 0x0127 }
            java.lang.Integer r9 = r5.getId()     // Catch:{ Exception -> 0x0127 }
            boolean r8 = p000.vx2.m53586b(r8, r9)     // Catch:{ Exception -> 0x0127 }
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x006a
            r6.add(r7)     // Catch:{ Exception -> 0x0127 }
            goto L_0x006a
        L_0x008a:
            r6 = r1
        L_0x008b:
            if (r6 != 0) goto L_0x0091
            java.util.List r6 = p000.ck0.m33062j()     // Catch:{ Exception -> 0x0127 }
        L_0x0091:
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r15 = r14.$priceAlertData     // Catch:{ Exception -> 0x0127 }
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r7 = r14.this$0     // Catch:{ Exception -> 0x0127 }
            boolean r5 = r6.isEmpty()     // Catch:{ Exception -> 0x0127 }
            if (r5 == 0) goto L_0x00f4
            java.lang.String r8 = r15.getTokenSymbol()     // Catch:{ Exception -> 0x0127 }
            p000.vx2.m53588d(r8)     // Catch:{ Exception -> 0x0127 }
            java.lang.String r9 = r15.getTokenName()     // Catch:{ Exception -> 0x0127 }
            p000.vx2.m53588d(r9)     // Catch:{ Exception -> 0x0127 }
            java.lang.String r5 = r15.getTokenAddress()     // Catch:{ Exception -> 0x0127 }
            if (r5 == 0) goto L_0x00bd
            int r6 = r5.length()     // Catch:{ Exception -> 0x0127 }
            if (r6 != 0) goto L_0x00b7
            r6 = r4
            goto L_0x00b8
        L_0x00b7:
            r6 = r2
        L_0x00b8:
            if (r6 == 0) goto L_0x00bb
            r5 = r1
        L_0x00bb:
            r10 = r5
            goto L_0x00be
        L_0x00bd:
            r10 = r1
        L_0x00be:
            java.lang.Integer r5 = r15.getChainId()     // Catch:{ Exception -> 0x0127 }
            if (r5 == 0) goto L_0x00c9
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0127 }
            goto L_0x00ca
        L_0x00c9:
            r5 = -1
        L_0x00ca:
            r11 = r5
            java.lang.String r15 = r15.getTokenId()     // Catch:{ Exception -> 0x0127 }
            if (r15 == 0) goto L_0x00d5
            java.lang.Integer r1 = p000.xb6.m73916n(r15)     // Catch:{ Exception -> 0x0127 }
        L_0x00d5:
            r12 = r1
            r14.label = r3     // Catch:{ Exception -> 0x0127 }
            r13 = r14
            java.lang.Object r15 = r7.mo61136r(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0127 }
            if (r15 != r0) goto L_0x00e0
            return r0
        L_0x00e0:
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r15 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r15     // Catch:{ Exception -> 0x0127 }
            if (r15 == 0) goto L_0x00ef
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken[] r0 = new net.safemoon.androidwallet.model.priceAlert.PriceAlertToken[r4]     // Catch:{ Exception -> 0x0127 }
            r0[r2] = r15     // Catch:{ Exception -> 0x0127 }
            java.util.ArrayList r15 = p000.ck0.m33058f(r0)     // Catch:{ Exception -> 0x0127 }
            if (r15 == 0) goto L_0x00ef
            goto L_0x00f3
        L_0x00ef:
            java.util.List r15 = p000.ck0.m33062j()     // Catch:{ Exception -> 0x0127 }
        L_0x00f3:
            r6 = r15
        L_0x00f4:
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r15 = r14.this$0     // Catch:{ Exception -> 0x0127 }
            k04 r15 = r15.mo61137s()     // Catch:{ Exception -> 0x0127 }
            r15.postValue(r6)     // Catch:{ Exception -> 0x0127 }
            int r15 = r14.$position     // Catch:{ Exception -> 0x0127 }
            int r0 = r6.size()     // Catch:{ Exception -> 0x0127 }
            if (r15 < r0) goto L_0x0118
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r15 = r14.this$0     // Catch:{ Exception -> 0x0127 }
            k04 r15 = r15.mo61139u()     // Catch:{ Exception -> 0x0127 }
            int r0 = r6.size()     // Catch:{ Exception -> 0x0127 }
            int r0 = r0 - r4
            java.lang.Integer r0 = p000.a40.m31673d(r0)     // Catch:{ Exception -> 0x0127 }
            r15.postValue(r0)     // Catch:{ Exception -> 0x0127 }
            goto L_0x0127
        L_0x0118:
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r15 = r14.this$0     // Catch:{ Exception -> 0x0127 }
            k04 r15 = r15.mo61139u()     // Catch:{ Exception -> 0x0127 }
            int r0 = r14.$position     // Catch:{ Exception -> 0x0127 }
            java.lang.Integer r0 = p000.a40.m31673d(r0)     // Catch:{ Exception -> 0x0127 }
            r15.postValue(r0)     // Catch:{ Exception -> 0x0127 }
        L_0x0127:
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r15 = r14.this$0
            r15.mo61143z()
            r37 r15 = p000.r37.f33317a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$deletePriceAlert$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
