package androidx.compose.p004ui.node;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
public final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ ol3 $lookaheadDelegate;
    public final /* synthetic */ LayoutNodeLayoutDelegate.LookaheadPassDelegate this$0;
    public final /* synthetic */ LayoutNodeLayoutDelegate this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, ol3 ol3) {
        super(0);
        this.this$0 = lookaheadPassDelegate;
        this.this$1 = layoutNodeLayoutDelegate;
        this.$lookaheadDelegate = ol3;
    }

    public final void invoke() {
        v04<LayoutNode> b0 = this.this$0.f1806P.f1787a.mo3443b0();
        int n = b0.mo26963n();
        int i = 0;
        if (n > 0) {
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                LayoutNodeLayoutDelegate.LookaheadPassDelegate w = ((LayoutNode) m[i2]).mo3399D().mo3515w();
                vx2.m53588d(w);
                w.f1801C = w.mo3527a();
                w.mo3537g0(false);
                i2++;
            } while (i2 < n);
        }
        v04<LayoutNode> b02 = this.this$1.f1787a.mo3443b0();
        int n2 = b02.mo26963n();
        if (n2 > 0) {
            Object[] m2 = b02.mo26962m();
            vx2.m53589e(m2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i3 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) m2[i3];
                if (layoutNode.mo3419P() == LayoutNode.UsageByParent.InLayoutBlock) {
                    layoutNode.mo3437Y0(LayoutNode.UsageByParent.NotUsed);
                }
                i3++;
            } while (i3 < n2);
        }
        this.this$0.mo3541p(C03843.INSTANCE);
        this.$lookaheadDelegate.mo3598Y().mo23299a();
        this.this$0.mo3541p(C03854.INSTANCE);
        v04<LayoutNode> b03 = this.this$0.f1806P.f1787a.mo3443b0();
        int n3 = b03.mo26963n();
        if (n3 > 0) {
            Object[] m3 = b03.mo26962m();
            vx2.m53589e(m3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNodeLayoutDelegate.LookaheadPassDelegate w2 = ((LayoutNode) m3[i]).mo3399D().mo3515w();
                vx2.m53588d(w2);
                if (!w2.mo3527a()) {
                    w2.mo3525Y();
                }
                i++;
            } while (i < n3);
        }
    }
}
