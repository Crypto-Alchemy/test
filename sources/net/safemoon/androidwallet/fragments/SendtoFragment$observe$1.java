package net.safemoon.androidwallet.fragments;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendtoFragment.kt */
public final class SendtoFragment$observe$1 extends Lambda implements rc2<Boolean, r37> {
    public final /* synthetic */ SendtoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendtoFragment$observe$1(SendtoFragment sendtoFragment) {
        super(1);
        this.this$0 = sendtoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return r37.f33317a;
    }

    public final void invoke(Boolean bool) {
        ta2 G = this.this$0.f42125y;
        vx2.m53588d(G);
        TextView textView = G.f34175A;
        vx2.m53590f(bool, "it");
        textView.setSelected(bool.booleanValue());
        ta2 G2 = this.this$0.f42125y;
        vx2.m53588d(G2);
        G2.f34200w.setSelected(bool.booleanValue());
        ta2 G3 = this.this$0.f42125y;
        vx2.m53588d(G3);
        G3.f34201x.setSelected(bool.booleanValue());
        ta2 G4 = this.this$0.f42125y;
        vx2.m53588d(G4);
        G4.f34199v.setSelected(!bool.booleanValue());
        this.this$0.mo57684y0();
    }
}
