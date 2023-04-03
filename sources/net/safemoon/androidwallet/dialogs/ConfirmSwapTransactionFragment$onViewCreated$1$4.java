package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import net.safemoon.androidwallet.provider.AskAuthorizeProvider;
import net.safemoon.androidwallet.views.slidetoact.SlideToActView;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/ConfirmSwapTransactionFragment$onViewCreated$1$4", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$b;", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView;", "view", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ConfirmSwapTransactionFragment.kt */
public final class ConfirmSwapTransactionFragment$onViewCreated$1$4 implements SlideToActView.C8967b {

    /* renamed from: a */
    public final /* synthetic */ ConfirmSwapTransactionFragment f41725a;

    public ConfirmSwapTransactionFragment$onViewCreated$1$4(ConfirmSwapTransactionFragment confirmSwapTransactionFragment) {
        this.f41725a = confirmSwapTransactionFragment;
    }

    /* renamed from: a */
    public void mo57189a(SlideToActView slideToActView) {
        ho2 ho2;
        vx2.m53591g(slideToActView, "view");
        if (this.f41725a.requireActivity() instanceof ho2) {
            FragmentActivity requireActivity = this.f41725a.requireActivity();
            vx2.m53589e(requireActivity, "null cannot be cast to non-null type net.safemoon.androidwallet.interfaces.IHomeActivity");
            ho2 = (ho2) requireActivity;
        } else {
            ho2 = null;
        }
        Context requireContext = this.f41725a.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        new AskAuthorizeProvider(requireContext, ho2).mo60705a(new C8286x513eaf2c(this.f41725a), C8287x513eaf2d.INSTANCE);
    }
}
