package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$createUpdatePriceAlert$1", mo48632f = "CryptoPriceAlertViewModel.kt", mo48633l = {111, 113}, mo48634m = "invokeSuspend")
/* compiled from: CryptoPriceAlertViewModel.kt */
public final class CryptoPriceAlertViewModel$createUpdatePriceAlert$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ int $position;
    public final /* synthetic */ PriceAlertToken $priceAlertData;
    public int label;
    public final /* synthetic */ CryptoPriceAlertViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertViewModel$createUpdatePriceAlert$1(CryptoPriceAlertViewModel cryptoPriceAlertViewModel, PriceAlertToken priceAlertToken, int i, ns0<? super CryptoPriceAlertViewModel$createUpdatePriceAlert$1> ns0) {
        super(2, ns0);
        this.this$0 = cryptoPriceAlertViewModel;
        this.$priceAlertData = priceAlertToken;
        this.$position = i;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CryptoPriceAlertViewModel$createUpdatePriceAlert$1(this.this$0, this.$priceAlertData, this.$position, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CryptoPriceAlertViewModel$createUpdatePriceAlert$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d A[Catch:{ Exception -> 0x00b2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            p000.hg5.m45199b(r5)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0065
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001a:
            p000.hg5.m45199b(r5)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0048
        L_0x001e:
            p000.hg5.m45199b(r5)
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r5 = r4.this$0
            r5.mo61142y()
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r5 = r4.$priceAlertData     // Catch:{ Exception -> 0x00b2 }
            java.lang.Integer r5 = r5.getId()     // Catch:{ Exception -> 0x00b2 }
            if (r5 != 0) goto L_0x004b
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r5 = r4.this$0     // Catch:{ Exception -> 0x00b2 }
            tk5 r5 = r5.mo61135q()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r1 = r4.$priceAlertData     // Catch:{ Exception -> 0x00b2 }
            k90 r5 = r5.mo66087f(r1)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r1 = "mainNetApiInterface.crea…riceAlert(priceAlertData)"
            p000.vx2.m53590f(r5, r1)     // Catch:{ Exception -> 0x00b2 }
            r4.label = r3     // Catch:{ Exception -> 0x00b2 }
            java.lang.Object r5 = retrofit2.KotlinExtensions.m71521c(r5, r4)     // Catch:{ Exception -> 0x00b2 }
            if (r5 != r0) goto L_0x0048
            return r0
        L_0x0048:
            bg5 r5 = (p000.bg5) r5     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0067
        L_0x004b:
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r5 = r4.this$0     // Catch:{ Exception -> 0x00b2 }
            tk5 r5 = r5.mo61135q()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r1 = r4.$priceAlertData     // Catch:{ Exception -> 0x00b2 }
            k90 r5 = r5.mo66095n(r1)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r1 = "mainNetApiInterface.upda…riceAlert(priceAlertData)"
            p000.vx2.m53590f(r5, r1)     // Catch:{ Exception -> 0x00b2 }
            r4.label = r2     // Catch:{ Exception -> 0x00b2 }
            java.lang.Object r5 = retrofit2.KotlinExtensions.m71521c(r5, r4)     // Catch:{ Exception -> 0x00b2 }
            if (r5 != r0) goto L_0x0065
            return r0
        L_0x0065:
            bg5 r5 = (p000.bg5) r5     // Catch:{ Exception -> 0x00b2 }
        L_0x0067:
            boolean r0 = r5.mo50581e()     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r5.mo50578a()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenData r0 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenData) r0     // Catch:{ Exception -> 0x00b2 }
            r1 = 0
            if (r0 == 0) goto L_0x007b
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r0 = r0.getResult()     // Catch:{ Exception -> 0x00b2 }
            goto L_0x007c
        L_0x007b:
            r0 = r1
        L_0x007c:
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r5.mo50578a()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenData r0 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenData) r0     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0091
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r0 = r0.getResult()     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0091
            java.lang.Integer r0 = r0.getId()     // Catch:{ Exception -> 0x00b2 }
            goto L_0x0092
        L_0x0091:
            r0 = r1
        L_0x0092:
            if (r0 != 0) goto L_0x0097
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r5 = r4.$priceAlertData     // Catch:{ Exception -> 0x00b2 }
            goto L_0x00a7
        L_0x0097:
            java.lang.Object r5 = r5.mo50578a()     // Catch:{ Exception -> 0x00b2 }
            net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenData r5 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenData) r5     // Catch:{ Exception -> 0x00b2 }
            if (r5 == 0) goto L_0x00a3
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r1 = r5.getResult()     // Catch:{ Exception -> 0x00b2 }
        L_0x00a3:
            p000.vx2.m53588d(r1)     // Catch:{ Exception -> 0x00b2 }
            r5 = r1
        L_0x00a7:
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r0 = r4.this$0     // Catch:{ Exception -> 0x00b2 }
            int r1 = r4.$position     // Catch:{ Exception -> 0x00b2 }
            java.lang.Integer r1 = p000.a40.m31673d(r1)     // Catch:{ Exception -> 0x00b2 }
            r0.mo61126A(r5, r1)     // Catch:{ Exception -> 0x00b2 }
        L_0x00b2:
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r5 = r4.this$0
            r5.mo61143z()
            r37 r5 = p000.r37.f33317a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$createUpdatePriceAlert$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
