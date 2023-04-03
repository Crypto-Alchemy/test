package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lgo2;", "invoke", "()Lgo2;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: GoogleAuthPairFragment.kt */
public final class GoogleAuthPairFragment$iGoogleAuthPair$2 extends Lambda implements pc2<go2> {
    public final /* synthetic */ GoogleAuthPairFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GoogleAuthPairFragment$iGoogleAuthPair$2(GoogleAuthPairFragment googleAuthPairFragment) {
        super(0);
        this.this$0 = googleAuthPairFragment;
    }

    public final go2 invoke() {
        if (this.this$0.getParentFragment() instanceof go2) {
            Fragment parentFragment = this.this$0.getParentFragment();
            vx2.m53589e(parentFragment, "null cannot be cast to non-null type net.safemoon.androidwallet.interfaces.IGoogleAuthPair");
            return (go2) parentFragment;
        } else if (!(this.this$0.requireContext() instanceof go2)) {
            return null;
        } else {
            Context requireContext = this.this$0.requireContext();
            vx2.m53589e(requireContext, "null cannot be cast to non-null type net.safemoon.androidwallet.interfaces.IGoogleAuthPair");
            return (go2) requireContext;
        }
    }
}
