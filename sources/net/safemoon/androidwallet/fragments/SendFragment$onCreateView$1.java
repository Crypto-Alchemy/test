package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.viewmodels.MyTokensListViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendFragment.kt */
public final class SendFragment$onCreateView$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ SendFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendFragment$onCreateView$1(SendFragment sendFragment) {
        super(0);
        this.this$0 = sendFragment;
    }

    public final void invoke() {
        MyTokensListViewModel w = this.this$0.f42089k;
        vx2.m53588d(w);
        w.mo61314d0();
        MyTokensListViewModel w2 = this.this$0.f42089k;
        vx2.m53588d(w2);
        w2.mo61313c0();
    }
}
