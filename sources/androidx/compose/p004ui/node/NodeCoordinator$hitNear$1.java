package androidx.compose.p004ui.node;

import androidx.compose.p004ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnb1;", "T", "Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.NodeCoordinator$hitNear$1 */
/* compiled from: NodeCoordinator.kt */
public final class NodeCoordinator$hitNear$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ float $distanceFromEdge;
    public final /* synthetic */ em2<T> $hitTestResult;
    public final /* synthetic */ NodeCoordinator.C0393d<T> $hitTestSource;
    public final /* synthetic */ boolean $isInLayer;
    public final /* synthetic */ boolean $isTouchEvent;
    public final /* synthetic */ long $pointerPosition;
    public final /* synthetic */ T $this_hitNear;
    public final /* synthetic */ NodeCoordinator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$hitNear$1(NodeCoordinator nodeCoordinator, T t, NodeCoordinator.C0393d<T> dVar, long j, em2<T> em2, boolean z, boolean z2, float f) {
        super(0);
        this.this$0 = nodeCoordinator;
        this.$this_hitNear = t;
        this.$hitTestSource = dVar;
        this.$pointerPosition = j;
        this.$hitTestResult = em2;
        this.$isTouchEvent = z;
        this.$isInLayer = z2;
        this.$distanceFromEdge = f;
    }

    public final void invoke() {
        this.this$0.mo3597X0((nb1) a84.m129b(this.$this_hitNear, this.$hitTestSource.mo3643a(), g84.f12195a.mo20429e()), this.$hitTestSource, this.$pointerPosition, this.$hitTestResult, this.$isTouchEvent, this.$isInLayer, this.$distanceFromEdge);
    }
}
