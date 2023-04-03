package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Ljp2;", "invoke", "()Ljp2;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Google2FAVerfiedAuthFragment.kt */
public final class Google2FAVerfiedAuthFragment$iVerfied$2 extends Lambda implements pc2<jp2> {
    public final /* synthetic */ Google2FAVerfiedAuthFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Google2FAVerfiedAuthFragment$iVerfied$2(Google2FAVerfiedAuthFragment google2FAVerfiedAuthFragment) {
        super(0);
        this.this$0 = google2FAVerfiedAuthFragment;
    }

    public final jp2 invoke() {
        if (this.this$0.getParentFragment() instanceof jp2) {
            Fragment parentFragment = this.this$0.getParentFragment();
            vx2.m53589e(parentFragment, "null cannot be cast to non-null type net.safemoon.androidwallet.interfaces.IVerfied");
            return (jp2) parentFragment;
        } else if (!(this.this$0.requireContext() instanceof jp2)) {
            return null;
        } else {
            Context requireContext = this.this$0.requireContext();
            vx2.m53589e(requireContext, "null cannot be cast to non-null type net.safemoon.androidwallet.interfaces.IVerfied");
            return (jp2) requireContext;
        }
    }
}
