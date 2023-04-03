package androidx.compose.p004ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.NodeCoordinator$invoke$1 */
/* compiled from: NodeCoordinator.kt */
public final class NodeCoordinator$invoke$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ xa0 $canvas;
    public final /* synthetic */ NodeCoordinator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$invoke$1(NodeCoordinator nodeCoordinator, xa0 xa0) {
        super(0);
        this.this$0 = nodeCoordinator;
        this.$canvas = xa0;
    }

    public final void invoke() {
        this.this$0.mo3573D0(this.$canvas);
    }
}
