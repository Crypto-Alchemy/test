package androidx.compose.p004ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Lr37;", "invoke", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1 */
/* compiled from: NodeCoordinator.kt */
public final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends Lambda implements rc2<NodeCoordinator, r37> {
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 INSTANCE = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1();

    public NodeCoordinator$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NodeCoordinator) obj);
        return r37.f33317a;
    }

    public final void invoke(NodeCoordinator nodeCoordinator) {
        vx2.m53591g(nodeCoordinator, "coordinator");
        if (nodeCoordinator.isValid()) {
            je3 j0 = nodeCoordinator.f1847Y;
            if (j0 == null) {
                nodeCoordinator.mo3638x1();
                return;
            }
            NodeCoordinator.f1831p1.mo21811b(j0);
            nodeCoordinator.mo3638x1();
            if (!NodeCoordinator.f1831p1.mo21812c(j0)) {
                LayoutNode X = nodeCoordinator.mo3596X();
                LayoutNodeLayoutDelegate D = X.mo3399D();
                if (D.mo3505m() > 0) {
                    if (D.mo3506n()) {
                        LayoutNode.m2541N0(X, false, 1, (Object) null);
                    }
                    D.mo3516x().mo3550W();
                }
                nj4 U = X.mo3428U();
                if (U != null) {
                    U.mo3722d(X);
                }
            }
        }
    }
}
