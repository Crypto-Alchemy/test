package net.safemoon.androidwallet.dialogs;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lad7;", "VM", "Lgd7;", "invoke", "()Lgd7;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: FragmentViewModelLazy.kt */
public final class GraphFragment$special$$inlined$activityViewModels$default$1 extends Lambda implements pc2<gd7> {
    public final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphFragment$special$$inlined$activityViewModels$default$1(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    public final gd7 invoke() {
        gd7 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
        vx2.m53590f(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }
}
