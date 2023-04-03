package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import p000.qu5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "userTokenItemDisplayModel", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendFragment.kt */
public final class SendFragment$onViewCreated$2 extends Lambda implements rc2<UserTokenItemDisplayModel, r37> {
    public final /* synthetic */ SendFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendFragment$onViewCreated$2(SendFragment sendFragment) {
        super(1);
        this.this$0 = sendFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((UserTokenItemDisplayModel) obj);
        return r37.f33317a;
    }

    public final void invoke(UserTokenItemDisplayModel userTokenItemDisplayModel) {
        vx2.m53591g(userTokenItemDisplayModel, "userTokenItemDisplayModel");
        if (ap2.m55613a(userTokenItemDisplayModel.getSymbolWithType()).mo67354b()) {
            SendFragment sendFragment = this.this$0;
            qu5.C9221a a = qu5.m71356a(userTokenItemDisplayModel);
            vx2.m53590f(a, "actionSendFragmentToSend…serTokenItemDisplayModel)");
            sendFragment.mo50753j(a);
        }
    }
}
