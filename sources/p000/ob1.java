package p000;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import kotlin.Metadata;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001a\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a%\u0010\f\u001a\u00020\u000b*\u00020\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\tH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\f\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0001\u001a\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, mo44877d2 = {"Lnb1;", "", "mask", "Lsw3$c;", "d", "Lv04;", "node", "Lr37;", "b", "Lc84;", "type", "", "c", "(Lnb1;I)Z", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "e", "(Lnb1;I)Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "f", "Lnj4;", "g", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ob1 */
/* compiled from: DelegatableNode.kt */
public final class ob1 {
    /* renamed from: b */
    public static final void m23740b(v04<sw3.C3310c> v04, sw3.C3310c cVar) {
        v04<LayoutNode> b0 = m23744f(cVar).mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            int i = n - 1;
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                v04.mo26953c(((LayoutNode) m[i]).mo3424S().mo28349l());
                i--;
            } while (i >= 0);
        }
    }

    /* renamed from: c */
    public static final boolean m23741c(nb1 nb1, int i) {
        vx2.m53591g(nb1, "$this$has");
        if ((nb1.mo23638l().mo25985t() & i) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final sw3.C3310c m23742d(nb1 nb1, int i) {
        vx2.m53591g(nb1, "<this>");
        sw3.C3310c u = nb1.mo23638l().mo25986u();
        if (u == null || (u.mo25985t() & i) == 0) {
            return null;
        }
        while (u != null) {
            if ((u.mo25988w() & i) != 0) {
                return u;
            }
            u = u.mo25986u();
        }
        return null;
    }

    /* renamed from: e */
    public static final NodeCoordinator m23743e(nb1 nb1, int i) {
        vx2.m53591g(nb1, "$this$requireCoordinator");
        NodeCoordinator v = nb1.mo23638l().mo25987v();
        vx2.m53588d(v);
        if (v.mo3585P0() != nb1 || !d84.m14846c(i)) {
            return v;
        }
        NodeCoordinator Q0 = v.mo3586Q0();
        vx2.m53588d(Q0);
        return Q0;
    }

    /* renamed from: f */
    public static final LayoutNode m23744f(nb1 nb1) {
        vx2.m53591g(nb1, "<this>");
        NodeCoordinator v = nb1.mo23638l().mo25987v();
        vx2.m53588d(v);
        return v.mo3596X();
    }

    /* renamed from: g */
    public static final nj4 m23745g(nb1 nb1) {
        vx2.m53591g(nb1, "<this>");
        nj4 U = m23744f(nb1).mo3428U();
        vx2.m53588d(U);
        return U;
    }
}
