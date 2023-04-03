package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.fragments.SwapFragment;
import net.safemoon.androidwallet.model.token.room.RoomToken;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$c;", "kotlin.jvm.PlatformType", "param", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$c;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$2 extends Lambda implements rc2<SwapViewModel.C8788c, r37> {
    public final /* synthetic */ k04<SwapFragment.C8460b> $btnV2LiveData;
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$2(k04<SwapFragment.C8460b> k04, SwapFragment swapFragment) {
        super(1);
        this.$btnV2LiveData = k04;
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SwapViewModel.C8788c) obj);
        return r37.f33317a;
    }

    public final void invoke(SwapViewModel.C8788c cVar) {
        k04<SwapFragment.C8460b> k04 = this.$btnV2LiveData;
        SwapFragment.C8460b value = k04.getValue();
        xa2 xa2 = null;
        if (value == null) {
            value = new SwapFragment.C8460b((RoomToken) null, (SwapViewModel.C8788c) null);
        }
        value.mo57724d(cVar);
        k04.setValue(value);
        SwapViewModel I0 = this.this$0.mo57712g1();
        vx2.m53590f(cVar, "param");
        I0.mo61568K(cVar);
        TokenType a = cVar.mo61639a();
        SwapFragment swapFragment = this.this$0;
        xa2 u0 = swapFragment.f42150X;
        if (u0 == null) {
            vx2.m53605u("binding");
            u0 = null;
        }
        u0.f35581s.f21731f.setText(a.getPlaneName());
        xa2 u02 = swapFragment.f42150X;
        if (u02 == null) {
            vx2.m53605u("binding");
        } else {
            xa2 = u02;
        }
        xa2.f35581s.f21730e.setImageResource(a.getIcon());
        if (swapFragment.f42147P) {
            swapFragment.mo57708c1().mo61306T(a);
            swapFragment.mo57705Z0().mo61236r(a);
        }
        swapFragment.mo57708c1().mo61305S(a);
    }
}
