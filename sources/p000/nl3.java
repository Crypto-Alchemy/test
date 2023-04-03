package p000;

import androidx.compose.p004ui.node.AlignmentLines;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b/\u0010\nJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u000f\u0010\t\u001a\u00020\bH ¢\u0006\u0004\b\t\u0010\nJ\f\u0010\f\u001a\u00020\b*\u00020\u000bH\u0004R\"\u0010\u0014\u001a\u00020\r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001d\u0010\u001c\u001a\u00020\u00198&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001eR\u0014\u0010\"\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0011R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8 X \u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, mo44877d2 = {"Lnl3;", "Lvo4;", "", "Lcf;", "alignmentLine", "", "T", "S", "Lr37;", "e0", "()V", "Landroidx/compose/ui/node/NodeCoordinator;", "b0", "", "k", "Z", "d0", "()Z", "g0", "(Z)V", "isShallowPlacing", "r", "c0", "f0", "isPlacingForAlignment", "Lnw2;", "a0", "()J", "position", "U", "()Lnl3;", "child", "parent", "W", "hasMeasureResult", "Landroidx/compose/ui/node/LayoutNode;", "X", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lme3;", "V", "()Lme3;", "coordinates", "Lmq3;", "Y", "()Lmq3;", "measureResult", "<init>", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: nl3 */
/* compiled from: LookaheadDelegate.kt */
public abstract class nl3 extends vo4 implements oq3 {

    /* renamed from: k */
    public boolean f15608k;

    /* renamed from: r */
    public boolean f15609r;

    /* renamed from: B */
    public /* synthetic */ long mo18678B(long j) {
        return cc1.m11824c(this, j);
    }

    /* renamed from: S */
    public abstract int mo23722S(C1677cf cfVar);

    /* renamed from: T */
    public final int mo23723T(C1677cf cfVar) {
        int S;
        vx2.m53591g(cfVar, "alignmentLine");
        if (mo3594W() && (S = mo23722S(cfVar)) != Integer.MIN_VALUE) {
            return S + nw2.m23482g(mo27272H());
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: U */
    public abstract nl3 mo3590U();

    /* renamed from: V */
    public abstract me3 mo3592V();

    /* renamed from: W */
    public abstract boolean mo3594W();

    /* renamed from: X */
    public abstract LayoutNode mo3596X();

    /* renamed from: Y */
    public abstract mq3 mo3598Y();

    /* renamed from: Z */
    public abstract nl3 mo3600Z();

    /* renamed from: a0 */
    public abstract long mo3602a0();

    /* renamed from: b0 */
    public final void mo23724b0(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode;
        AlignmentLines b;
        vx2.m53591g(nodeCoordinator, "<this>");
        NodeCoordinator Q0 = nodeCoordinator.mo3586Q0();
        if (Q0 != null) {
            layoutNode = Q0.mo3596X();
        } else {
            layoutNode = null;
        }
        if (!vx2.m53586b(layoutNode, nodeCoordinator.mo3596X())) {
            nodeCoordinator.mo3577H0().mo3529b().mo3340m();
            return;
        }
        C2164df d = nodeCoordinator.mo3577H0().mo3533d();
        if (d != null && (b = d.mo3529b()) != null) {
            b.mo3340m();
        }
    }

    /* renamed from: c0 */
    public final boolean mo23725c0() {
        return this.f15609r;
    }

    /* renamed from: d0 */
    public final boolean mo23726d0() {
        return this.f15608k;
    }

    /* renamed from: e0 */
    public abstract void mo3608e0();

    /* renamed from: f0 */
    public final void mo23727f0(boolean z) {
        this.f15609r = z;
    }

    /* renamed from: g0 */
    public final void mo23728g0(boolean z) {
        this.f15608k = z;
    }

    /* renamed from: h */
    public /* synthetic */ mq3 mo23729h(int i, int i2, Map map, rc2 rc2) {
        return nq3.m23394a(this, i, i2, map, rc2);
    }

    /* renamed from: n */
    public /* synthetic */ float mo18679n(long j) {
        return cc1.m11822a(this, j);
    }

    /* renamed from: y */
    public /* synthetic */ float mo18680y(float f) {
        return cc1.m11823b(this, f);
    }
}
