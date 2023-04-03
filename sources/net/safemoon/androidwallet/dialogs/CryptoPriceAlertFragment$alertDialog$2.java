package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lxx0;", "invoke", "()Lxx0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CryptoPriceAlertFragment.kt */
public final class CryptoPriceAlertFragment$alertDialog$2 extends Lambda implements pc2<xx0> {
    public final /* synthetic */ CryptoPriceAlertFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertFragment$alertDialog$2(CryptoPriceAlertFragment cryptoPriceAlertFragment) {
        super(0);
        this.this$0 = cryptoPriceAlertFragment;
    }

    public final xx0 invoke() {
        Context requireContext = this.this$0.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        List<m70> c = yw0.m74666c();
        final CryptoPriceAlertFragment cryptoPriceAlertFragment = this.this$0;
        return xx0.m74124c(new xx0(requireContext, c, new fd2<m70, Dialog, r37>() {
            public final void invoke(m70 m70, Dialog dialog) {
                vx2.m53591g(m70, "ccButton");
                vx2.m53591g(dialog, "dialog");
                if (m70.mo56148a() == 103) {
                    CryptoPriceAlertFragment$alertDialog$2.super.mo22266k();
                }
                dialog.dismiss();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((m70) obj, (Dialog) obj2);
                return r37.f33317a;
            }
        }), false, false, 3, (Object) null);
    }
}
