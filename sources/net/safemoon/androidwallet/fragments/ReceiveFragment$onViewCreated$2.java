package net.safemoon.androidwallet.fragments;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import p000.f85;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "<name for destructuring parameter 0>", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ReceiveFragment.kt */
public final class ReceiveFragment$onViewCreated$2 extends Lambda implements rc2<UserTokenItemDisplayModel, r37> {
    public final /* synthetic */ ReceiveFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReceiveFragment$onViewCreated$2(ReceiveFragment receiveFragment) {
        super(1);
        this.this$0 = receiveFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((UserTokenItemDisplayModel) obj);
        return r37.f33317a;
    }

    public final void invoke(UserTokenItemDisplayModel userTokenItemDisplayModel) {
        vx2.m53591g(userTokenItemDisplayModel, "<name for destructuring parameter 0>");
        String component1 = userTokenItemDisplayModel.component1();
        int component7 = userTokenItemDisplayModel.component7();
        if (ap2.m55613a(component1).mo67354b()) {
            ReceiveFragment receiveFragment = this.this$0;
            Context requireContext = receiveFragment.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            Wallet c = ol0.m70351c(requireContext);
            String address = c != null ? c.getAddress(TokenType.Companion.mo57099b(component7).getCoinType().getValue()) : null;
            vx2.m53588d(address);
            f85.C7071a a = f85.m57636a(component7, address);
            vx2.m53590f(a, "actionReceiveFragmentToQ…)!!\n                    )");
            receiveFragment.mo50753j(a);
        }
    }
}
