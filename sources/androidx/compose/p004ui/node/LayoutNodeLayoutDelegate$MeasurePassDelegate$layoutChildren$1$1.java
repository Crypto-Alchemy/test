package androidx.compose.p004ui.node;

import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
public final class LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ LayoutNode $this_with;
    public final /* synthetic */ LayoutNodeLayoutDelegate this$0;
    public final /* synthetic */ LayoutNodeLayoutDelegate.MeasurePassDelegate this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate, LayoutNode layoutNode) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
        this.this$1 = measurePassDelegate;
        this.$this_with = layoutNode;
    }

    public final void invoke() {
        this.this$0.f1787a.mo3456k();
        this.this$1.mo3541p(C03861.INSTANCE);
        this.$this_with.mo3393A().mo3598Y().mo23299a();
        this.this$0.f1787a.mo3454j();
        this.this$1.mo3541p(C03872.INSTANCE);
    }
}
