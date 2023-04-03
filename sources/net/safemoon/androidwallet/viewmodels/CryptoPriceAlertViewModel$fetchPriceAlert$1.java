package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.priceAlert.PAToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$fetchPriceAlert$1", mo48632f = "CryptoPriceAlertViewModel.kt", mo48633l = {64, 69}, mo48634m = "invokeSuspend")
/* compiled from: CryptoPriceAlertViewModel.kt */
public final class CryptoPriceAlertViewModel$fetchPriceAlert$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ PAToken $paToken;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ CryptoPriceAlertViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertViewModel$fetchPriceAlert$1(CryptoPriceAlertViewModel cryptoPriceAlertViewModel, PAToken pAToken, ns0<? super CryptoPriceAlertViewModel$fetchPriceAlert$1> ns0) {
        super(2, ns0);
        this.this$0 = cryptoPriceAlertViewModel;
        this.$paToken = pAToken;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CryptoPriceAlertViewModel$fetchPriceAlert$1(this.this$0, this.$paToken, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CryptoPriceAlertViewModel$fetchPriceAlert$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r14.label
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0034
            if (r1 == r4) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            p000.hg5.m45199b(r15)
            goto L_0x00b5
        L_0x0015:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x001d:
            int r1 = r14.I$0
            java.lang.Object r6 = r14.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r14.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r14.L$0
            java.lang.String r8 = (java.lang.String) r8
            p000.hg5.m45199b(r15)
        L_0x002e:
            r10 = r1
            r9 = r6
            r13 = r8
            r8 = r7
            r7 = r13
            goto L_0x007d
        L_0x0034:
            p000.hg5.m45199b(r15)
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r15 = r14.this$0
            r15.mo61142y()
            net.safemoon.androidwallet.model.priceAlert.PAToken r15 = r14.$paToken
            java.lang.String r15 = r15.getSymbol()
            if (r15 != 0) goto L_0x0046
            java.lang.String r15 = ""
        L_0x0046:
            r8 = r15
            net.safemoon.androidwallet.model.priceAlert.PAToken r15 = r14.$paToken
            java.lang.String r7 = r15.getName()
            net.safemoon.androidwallet.model.priceAlert.PAToken r15 = r14.$paToken
            java.lang.String r15 = r15.getContractAddress()
            if (r15 == 0) goto L_0x0063
            int r1 = r15.length()
            if (r1 != 0) goto L_0x005d
            r1 = r4
            goto L_0x005e
        L_0x005d:
            r1 = r3
        L_0x005e:
            if (r1 == 0) goto L_0x0061
            r15 = r5
        L_0x0061:
            r6 = r15
            goto L_0x0064
        L_0x0063:
            r6 = r5
        L_0x0064:
            net.safemoon.androidwallet.model.priceAlert.PAToken r15 = r14.$paToken
            int r1 = r15.getChainId()
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r15 = r14.this$0
            r14.L$0 = r8
            r14.L$1 = r7
            r14.L$2 = r6
            r14.I$0 = r1
            r14.label = r4
            java.lang.Object r15 = r15.mo61141w(r6, r8, r14)
            if (r15 != r0) goto L_0x002e
            return r0
        L_0x007d:
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            boolean r1 = r15.isEmpty()
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x009d
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r0 = r14.this$0
            k04 r0 = r0.mo61137s()
            r0.postValue(r15)
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r15 = r14.this$0
            k04 r15 = r15.mo61139u()
            java.lang.Integer r0 = p000.a40.m31673d(r3)
            r15.postValue(r0)
            goto L_0x00d1
        L_0x009d:
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r6 = r14.this$0
            net.safemoon.androidwallet.model.priceAlert.PAToken r15 = r14.$paToken
            java.lang.Integer r11 = r15.getCmcId()
            r14.L$0 = r5
            r14.L$1 = r5
            r14.L$2 = r5
            r14.label = r2
            r12 = r14
            java.lang.Object r15 = r6.mo61136r(r7, r8, r9, r10, r11, r12)
            if (r15 != r0) goto L_0x00b5
            return r0
        L_0x00b5:
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r15 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r15
            if (r15 == 0) goto L_0x00d1
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r0 = r14.this$0
            k04 r1 = r0.mo61137s()
            java.util.List r15 = p000.bk0.m32598e(r15)
            r1.postValue(r15)
            k04 r15 = r0.mo61139u()
            java.lang.Integer r0 = p000.a40.m31673d(r3)
            r15.postValue(r0)
        L_0x00d1:
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r15 = r14.this$0
            r15.mo61143z()
            r37 r15 = p000.r37.f33317a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$fetchPriceAlert$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
