package net.safemoon.androidwallet.fragments;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.fragments.SwapFragment;
import net.safemoon.androidwallet.model.token.room.RoomToken;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/SwapFragment$b;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/fragments/SwapFragment$b;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$3 extends Lambda implements rc2<SwapFragment.C8460b, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$3(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SwapFragment.C8460b) obj);
        return r37.f33317a;
    }

    public final void invoke(SwapFragment.C8460b bVar) {
        boolean z;
        if (bVar != null) {
            xa2 u0 = this.this$0.f42150X;
            if (u0 == null) {
                vx2.m53605u("binding");
                u0 = null;
            }
            MaterialButton materialButton = u0.f35567e;
            if (bVar.mo57721a() != null) {
                RoomToken a = bVar.mo57721a();
                vx2.m53588d(a);
                if (a.getNativeBalance() > Utils.DOUBLE_EPSILON && bVar.mo57722b() != null) {
                    SwapViewModel.C8788c b = bVar.mo57722b();
                    vx2.m53588d(b);
                    if (b.mo61639a() == TokenType.BEP_20) {
                        z = true;
                        materialButton.setVisibility(ol0.m70370l0(z));
                    }
                }
            }
            z = false;
            materialButton.setVisibility(ol0.m70370l0(z));
        }
    }
}
