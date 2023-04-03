package net.safemoon.androidwallet.fragments;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wyre.CheckoutPage;
import p000.py0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/wyre/CheckoutPage;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/wyre/CheckoutPage;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferHistoryFragment.kt */
public final class TransferHistoryFragment$getCheckoutUrl$1 extends Lambda implements rc2<CheckoutPage, r37> {
    public final /* synthetic */ TransferHistoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferHistoryFragment$getCheckoutUrl$1(TransferHistoryFragment transferHistoryFragment) {
        super(1);
        this.this$0 = transferHistoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CheckoutPage) obj);
        return r37.f33317a;
    }

    public final void invoke(CheckoutPage checkoutPage) {
        this.this$0.f42257P = false;
        if ((checkoutPage != null ? checkoutPage.getUrl() : null) != null) {
            py0 a = new py0.C3103a().mo24794a();
            vx2.m53590f(a, "builder.build()");
            a.mo24793a(this.this$0.requireContext(), Uri.parse(checkoutPage.getUrl()));
            a77.m55424b(this.this$0.requireActivity(), Boolean.TRUE);
            this.this$0.f42256M = true;
        }
    }
}
