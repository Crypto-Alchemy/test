package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0006\u0017B\u0019\b\u0000\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002R\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, mo44877d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder;", "", "other", "", "d", "Landroidx/compose/ui/node/LayoutNode;", "a", "Landroidx/compose/ui/node/LayoutNode;", "getSubtreeRoot$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "subtreeRoot", "e", "node", "La95;", "La95;", "location", "Landroidx/compose/ui/unit/LayoutDirection;", "g", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)V", "k", "ComparisonStrategy", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.semantics.NodeLocationHolder */
/* compiled from: SemanticsSort.kt */
public final class NodeLocationHolder implements Comparable<NodeLocationHolder> {

    /* renamed from: k */
    public static final C0452a f2108k = new C0452a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static ComparisonStrategy f2109r = ComparisonStrategy.Stripe;

    /* renamed from: a */
    public final LayoutNode f2110a;

    /* renamed from: d */
    public final LayoutNode f2111d;

    /* renamed from: e */
    public final a95 f2112e;

    /* renamed from: g */
    public final LayoutDirection f2113g;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo44877d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "", "(Ljava/lang/String;I)V", "Stripe", "Location", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.semantics.NodeLocationHolder$ComparisonStrategy */
    /* compiled from: SemanticsSort.kt */
    public enum ComparisonStrategy {
        Stripe,
        Location
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo44877d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$a;", "", "Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "comparisonStrategy", "Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "getComparisonStrategy$ui_release", "()Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "a", "(Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;)V", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.semantics.NodeLocationHolder$a */
    /* compiled from: SemanticsSort.kt */
    public static final class C0452a {
        public C0452a() {
        }

        public /* synthetic */ C0452a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo3993a(ComparisonStrategy comparisonStrategy) {
            vx2.m53591g(comparisonStrategy, "<set-?>");
            NodeLocationHolder.f2109r = comparisonStrategy;
        }
    }

    public NodeLocationHolder(LayoutNode layoutNode, LayoutNode layoutNode2) {
        vx2.m53591g(layoutNode, "subtreeRoot");
        vx2.m53591g(layoutNode2, "node");
        this.f2110a = layoutNode;
        this.f2111d = layoutNode2;
        this.f2113g = layoutNode.getLayoutDirection();
        NodeCoordinator A = layoutNode.mo3393A();
        NodeCoordinator a = fu5.m17414a(layoutNode2);
        a95 a95 = null;
        if (A.mo3607e() && a.mo3607e()) {
            a95 = le3.m21426a(A, a, false, 2, (Object) null);
        }
        this.f2112e = a95;
    }

    /* renamed from: d */
    public int compareTo(NodeLocationHolder nodeLocationHolder) {
        boolean z;
        boolean z2;
        vx2.m53591g(nodeLocationHolder, "other");
        a95 a95 = this.f2112e;
        if (a95 == null) {
            return 1;
        }
        if (nodeLocationHolder.f2112e == null) {
            return -1;
        }
        if (f2109r == ComparisonStrategy.Stripe) {
            if (a95.mo114c() - nodeLocationHolder.f2112e.mo122i() <= Utils.FLOAT_EPSILON) {
                return -1;
            }
            if (this.f2112e.mo122i() - nodeLocationHolder.f2112e.mo114c() >= Utils.FLOAT_EPSILON) {
                return 1;
            }
        }
        boolean z3 = false;
        if (this.f2113g == LayoutDirection.Ltr) {
            int i = ((this.f2112e.mo118f() - nodeLocationHolder.f2112e.mo118f()) > Utils.FLOAT_EPSILON ? 1 : ((this.f2112e.mo118f() - nodeLocationHolder.f2112e.mo118f()) == Utils.FLOAT_EPSILON ? 0 : -1));
            if (i == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (i < 0) {
                    return -1;
                }
                return 1;
            }
        } else {
            int i2 = ((this.f2112e.mo119g() - nodeLocationHolder.f2112e.mo119g()) > Utils.FLOAT_EPSILON ? 1 : ((this.f2112e.mo119g() - nodeLocationHolder.f2112e.mo119g()) == Utils.FLOAT_EPSILON ? 0 : -1));
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (i2 < 0) {
                    return 1;
                }
                return -1;
            }
        }
        int i3 = ((this.f2112e.mo122i() - nodeLocationHolder.f2112e.mo122i()) > Utils.FLOAT_EPSILON ? 1 : ((this.f2112e.mo122i() - nodeLocationHolder.f2112e.mo122i()) == Utils.FLOAT_EPSILON ? 0 : -1));
        if (i3 == 0) {
            z3 = true;
        }
        if (z3) {
            a95 b = ne3.m23129b(fu5.m17414a(this.f2111d));
            a95 b2 = ne3.m23129b(fu5.m17414a(nodeLocationHolder.f2111d));
            LayoutNode b3 = fu5.m17415b(this.f2111d, new NodeLocationHolder$compareTo$child1$1(b));
            LayoutNode b4 = fu5.m17415b(nodeLocationHolder.f2111d, new NodeLocationHolder$compareTo$child2$1(b2));
            if (b3 != null && b4 != null) {
                return new NodeLocationHolder(this.f2110a, b3).compareTo(new NodeLocationHolder(nodeLocationHolder.f2110a, b4));
            }
            if (b3 != null) {
                return 1;
            }
            if (b4 != null) {
                return -1;
            }
            int compare = LayoutNode.f1744z1.mo3489a().compare(this.f2111d, nodeLocationHolder.f2111d);
            if (compare != 0) {
                return -compare;
            }
            return this.f2111d.mo3434X() - nodeLocationHolder.f2111d.mo3434X();
        } else if (i3 < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    /* renamed from: e */
    public final LayoutNode mo3992e() {
        return this.f2111d;
    }
}
