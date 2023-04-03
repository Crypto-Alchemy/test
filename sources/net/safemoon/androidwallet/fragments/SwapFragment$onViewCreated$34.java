package net.safemoon.androidwallet.fragments;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.common.LoadingState;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/common/LoadingState;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/common/LoadingState;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$onViewCreated$34 extends Lambda implements rc2<LoadingState, r37> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$onViewCreated$34(SwapFragment swapFragment) {
        super(1);
        this.this$0 = swapFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LoadingState) obj);
        return r37.f33317a;
    }

    public final void invoke(LoadingState loadingState) {
        if (loadingState != null) {
            SwapFragment swapFragment = this.this$0;
            LoadingState loadingState2 = LoadingState.Loading;
            swapFragment.mo57719s1(loadingState == loadingState2);
            xa2 u0 = swapFragment.f42150X;
            if (u0 == null) {
                vx2.m53605u("binding");
                u0 = null;
            }
            Chip chip = u0.f35586x;
            vx2.m53590f(chip, "requireGasFee");
            int i = 8;
            chip.setVisibility(8);
            MaterialButton materialButton = u0.f35566d;
            if (loadingState == LoadingState.Normal) {
                i = 0;
            }
            materialButton.setVisibility(i);
            if (loadingState == loadingState2) {
                String string = swapFragment.getString(R.string.swap_loading_title);
                vx2.m53590f(string, "getString(R.string.swap_loading_title)");
                String string2 = swapFragment.getString(R.string.swap_loading_msg);
                vx2.m53590f(string2, "getString(R.string.swap_loading_msg)");
                swapFragment.mo57717n2(false, string, string2);
                return;
            }
            swapFragment.mo57703X0();
        }
    }
}
