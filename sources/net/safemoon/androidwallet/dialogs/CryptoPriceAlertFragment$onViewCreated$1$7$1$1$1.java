package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;
import net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"Lm70;", "ccButton", "Landroid/app/Dialog;", "dialog", "Lr37;", "invoke", "(Lm70;Landroid/app/Dialog;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CryptoPriceAlertFragment.kt */
public final class CryptoPriceAlertFragment$onViewCreated$1$7$1$1$1 extends Lambda implements fd2<m70, Dialog, r37> {
    public final /* synthetic */ Integer $index;
    public final /* synthetic */ PriceAlertToken $it;
    public final /* synthetic */ CryptoPriceAlertFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertFragment$onViewCreated$1$7$1$1$1(CryptoPriceAlertFragment cryptoPriceAlertFragment, PriceAlertToken priceAlertToken, Integer num) {
        super(2);
        this.this$0 = cryptoPriceAlertFragment;
        this.$it = priceAlertToken;
        this.$index = num;
    }

    public final void invoke(m70 m70, Dialog dialog) {
        vx2.m53591g(m70, "ccButton");
        vx2.m53591g(dialog, "dialog");
        int a = m70.mo56148a();
        if (a == 100) {
            CryptoPriceAlertViewModel L = this.this$0.mo57192Q();
            PriceAlertToken priceAlertToken = this.$it;
            vx2.m53590f(priceAlertToken, "it");
            Integer num = this.$index;
            vx2.m53590f(num, "index");
            L.mo61130l(priceAlertToken, num.intValue());
        } else if (a == 101) {
            CryptoPriceAlertViewModel L2 = this.this$0.mo57192Q();
            PriceAlertToken priceAlertToken2 = this.$it;
            vx2.m53590f(priceAlertToken2, "it");
            L2.mo61129k(priceAlertToken2);
        }
        dialog.dismiss();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m70) obj, (Dialog) obj2);
        return r37.f33317a;
    }
}
