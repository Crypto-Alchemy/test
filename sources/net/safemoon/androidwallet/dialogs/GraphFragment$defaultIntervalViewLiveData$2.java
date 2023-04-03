package net.safemoon.androidwallet.dialogs;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lk04;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke", "()Lk04;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: GraphFragment.kt */
public final class GraphFragment$defaultIntervalViewLiveData$2 extends Lambda implements pc2<k04<View>> {
    public final /* synthetic */ GraphFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphFragment$defaultIntervalViewLiveData$2(GraphFragment graphFragment) {
        super(0);
        this.this$0 = graphFragment;
    }

    public final k04<View> invoke() {
        return new k04<>(this.this$0.requireView().findViewById(this.this$0.requireArguments().getInt("DEFAULT_VIEW", 0)));
    }
}
