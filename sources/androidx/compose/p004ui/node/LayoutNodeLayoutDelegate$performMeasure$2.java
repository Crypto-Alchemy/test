package androidx.compose.p004ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performMeasure$2 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
public final class LayoutNodeLayoutDelegate$performMeasure$2 extends Lambda implements pc2<r37> {
    public final /* synthetic */ long $constraints;
    public final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$performMeasure$2(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
        this.$constraints = j;
    }

    public final void invoke() {
        this.this$0.mo3518z().mo3544t(this.$constraints);
    }
}
