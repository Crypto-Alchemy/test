package net.safemoon.androidwallet.fragments;

import androidx.lifecycle.C0729l;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.viewmodels.factory.MyViewModelFactory;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Landroidx/lifecycle/l$b;", "invoke", "()Landroidx/lifecycle/l$b;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SwapFragment.kt */
public final class SwapFragment$myTokenListViewModel$2 extends Lambda implements pc2<C0729l.C0733b> {
    public final /* synthetic */ SwapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapFragment$myTokenListViewModel$2(SwapFragment swapFragment) {
        super(0);
        this.this$0 = swapFragment;
    }

    public final C0729l.C0733b invoke() {
        return new MyViewModelFactory(new WeakReference(this.this$0.requireActivity()));
    }
}
