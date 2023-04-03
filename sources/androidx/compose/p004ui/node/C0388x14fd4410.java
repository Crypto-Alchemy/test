package androidx.compose.p004ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.vo4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
public final class C0388x14fd4410 extends Lambda implements pc2<r37> {
    public final /* synthetic */ rc2<nj2, r37> $layerBlock;
    public final /* synthetic */ long $position;
    public final /* synthetic */ float $zIndex;
    public final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0388x14fd4410(rc2<? super nj2, r37> rc2, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j, float f) {
        super(0);
        this.$layerBlock = rc2;
        this.this$0 = layoutNodeLayoutDelegate;
        this.$position = j;
        this.$zIndex = f;
    }

    public final void invoke() {
        vo4.C3501a.C3502a aVar = vo4.C3501a.f18872a;
        rc2<nj2, r37> rc2 = this.$layerBlock;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.this$0;
        long j = this.$position;
        float f = this.$zIndex;
        if (rc2 == null) {
            aVar.mo27284o(layoutNodeLayoutDelegate.mo3518z(), j, f);
        } else {
            aVar.mo27287u(layoutNodeLayoutDelegate.mo3518z(), j, f, rc2);
        }
    }
}
