package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.semantics.NodeLocationHolder$compareTo$child2$1 */
/* compiled from: SemanticsSort.kt */
public final class NodeLocationHolder$compareTo$child2$1 extends Lambda implements rc2<LayoutNode, Boolean> {
    public final /* synthetic */ a95 $view2Bounds;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeLocationHolder$compareTo$child2$1(a95 a95) {
        super(1);
        this.$view2Bounds = a95;
    }

    public final Boolean invoke(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "it");
        NodeCoordinator a = fu5.m17414a(layoutNode);
        return Boolean.valueOf(a.mo3607e() && !vx2.m53586b(this.$view2Bounds, ne3.m23129b(a)));
    }
}
