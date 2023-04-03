package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;
import net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"Lm70;", "ccButton", "Landroid/app/Dialog;", "dialog", "Lr37;", "invoke", "(Lm70;Landroid/app/Dialog;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CryptoPriceAlertFragment.kt */
public final class CryptoPriceAlertFragment$onViewCreated$1$6$1 extends Lambda implements fd2<m70, Dialog, r37> {
    public final /* synthetic */ CryptoPriceAlertFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertFragment$onViewCreated$1$6$1(CryptoPriceAlertFragment cryptoPriceAlertFragment) {
        super(2);
        this.this$0 = cryptoPriceAlertFragment;
    }

    public final void invoke(m70 m70, Dialog dialog) {
        PriceAlertToken value;
        vx2.m53591g(m70, "ccButton");
        vx2.m53591g(dialog, "dialog");
        if (m70.mo56148a() == 104 && (value = this.this$0.mo57192Q().mo61140v().getValue()) != null) {
            CryptoPriceAlertFragment cryptoPriceAlertFragment = this.this$0;
            Integer value2 = cryptoPriceAlertFragment.mo57192Q().mo61139u().getValue();
            if (value2 != null) {
                Integer chainId = value.getChainId();
                if ((chainId != null ? chainId.intValue() : 0) <= 0) {
                    value.setChainId((Integer) null);
                }
                CryptoPriceAlertViewModel L = cryptoPriceAlertFragment.mo57192Q();
                vx2.m53590f(value2, "index");
                L.mo61128j(value, value2.intValue());
                cryptoPriceAlertFragment.f41728U = false;
            }
        }
        dialog.dismiss();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m70) obj, (Dialog) obj2);
        return r37.f33317a;
    }
}
