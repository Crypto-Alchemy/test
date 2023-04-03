package net.safemoon.androidwallet.dialogs;

import android.text.Editable;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/text/Editable;", "it", "Lr37;", "invoke", "(Landroid/text/Editable;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CryptoPriceAlertFragment.kt */
public final class CryptoPriceAlertFragment$onViewCreated$1$1$3 extends Lambda implements rc2<Editable, r37> {
    public final /* synthetic */ CryptoPriceAlertFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertFragment$onViewCreated$1$1$3(CryptoPriceAlertFragment cryptoPriceAlertFragment) {
        super(1);
        this.this$0 = cryptoPriceAlertFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Editable) obj);
        return r37.f33317a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r3 = p000.xb6.m73916n((r3 = r3.toString()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(android.text.Editable r3) {
        /*
            r2 = this;
            net.safemoon.androidwallet.dialogs.CryptoPriceAlertFragment r0 = r2.this$0
            r1 = 1
            r0.f41728U = r1
            net.safemoon.androidwallet.dialogs.CryptoPriceAlertFragment r0 = r2.this$0
            net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel r0 = r0.mo57192Q()
            androidx.lifecycle.LiveData r0 = r0.mo61140v()
            java.lang.Object r0 = r0.getValue()
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r0 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r0
            if (r0 == 0) goto L_0x002f
            if (r3 == 0) goto L_0x002b
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L_0x002b
            java.lang.Integer r3 = p000.xb6.m73916n(r3)
            if (r3 == 0) goto L_0x002b
            int r3 = r3.intValue()
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            r0.setRepeat(r3)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.dialogs.CryptoPriceAlertFragment$onViewCreated$1$1$3.invoke(android.text.Editable):void");
    }
}
