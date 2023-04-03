package androidx.compose.p004ui.node;

import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNode;", "it", "Liq3;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Liq3;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$childMeasurables$2 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
public final class C0383xc4ae5339 extends Lambda implements rc2<LayoutNode, iq3> {
    public static final C0383xc4ae5339 INSTANCE = new C0383xc4ae5339();

    public C0383xc4ae5339() {
        super(1);
    }

    public final iq3 invoke(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "it");
        LayoutNodeLayoutDelegate.LookaheadPassDelegate w = layoutNode.mo3399D().mo3515w();
        vx2.m53588d(w);
        return w;
    }
}
