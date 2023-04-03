package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import net.safemoon.androidwallet.viewmodels.ContactViewModel;
import p000.gw5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendtoFragment.kt */
public final class SendtoFragment$sendingFragment$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ String $sendingAmount;
    public final /* synthetic */ SendtoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendtoFragment$sendingFragment$1(SendtoFragment sendtoFragment, String str) {
        super(0);
        this.this$0 = sendtoFragment;
        this.$sendingAmount = str;
    }

    public final void invoke() {
        ContactViewModel H = this.this$0.f42113H;
        vx2.m53588d(H);
        H.mo61110t();
        SendtoFragment sendtoFragment = this.this$0;
        ta2 G = sendtoFragment.f42125y;
        vx2.m53588d(G);
        String obj = G.f34187j.getText().toString();
        String str = this.$sendingAmount;
        UserTokenItemDisplayModel I = this.this$0.f42110A;
        vx2.m53588d(I);
        gw5.C7147a b = gw5.m58275b(obj, str, I);
        vx2.m53590f(b, "actionSendtoFragmentToSe…n!!\n                    )");
        sendtoFragment.mo50753j(b);
    }
}
