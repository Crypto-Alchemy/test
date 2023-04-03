package androidx.compose.p004ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lr37;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1 */
/* compiled from: OwnerSnapshotObserver.kt */
public final class OwnerSnapshotObserver$onCommitAffectingLayout$1 extends Lambda implements rc2<LayoutNode, r37> {
    public static final OwnerSnapshotObserver$onCommitAffectingLayout$1 INSTANCE = new OwnerSnapshotObserver$onCommitAffectingLayout$1();

    public OwnerSnapshotObserver$onCommitAffectingLayout$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return r37.f33317a;
    }

    public final void invoke(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "layoutNode");
        if (layoutNode.isValid()) {
            LayoutNode.m2541N0(layoutNode, false, 1, (Object) null);
        }
    }
}
