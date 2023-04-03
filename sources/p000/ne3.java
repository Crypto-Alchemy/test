package p000;

import androidx.compose.p004ui.node.NodeCoordinator;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0000*\u00020\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, mo44877d2 = {"Lme3;", "Ltf4;", "d", "(Lme3;)J", "La95;", "b", "a", "c", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ne3 */
/* compiled from: LayoutCoordinates.kt */
public final class ne3 {
    /* renamed from: a */
    public static final a95 m23128a(me3 me3) {
        a95 a;
        vx2.m53591g(me3, "<this>");
        me3 x = me3.mo3636x();
        if (x == null || (a = le3.m21426a(x, me3, false, 2, (Object) null)) == null) {
            return new a95(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) sw2.m27143f(me3.mo3611g()), (float) sw2.m27142e(me3.mo3611g()));
        }
        return a;
    }

    /* renamed from: b */
    public static final a95 m23129b(me3 me3) {
        vx2.m53591g(me3, "<this>");
        return le3.m21426a(m23130c(me3), me3, false, 2, (Object) null);
    }

    /* renamed from: c */
    public static final me3 m23130c(me3 me3) {
        me3 me32;
        NodeCoordinator nodeCoordinator;
        vx2.m53591g(me3, "<this>");
        me3 x = me3.mo3636x();
        while (true) {
            me3 me33 = x;
            me32 = me3;
            me3 = me33;
            if (me3 == null) {
                break;
            }
            x = me3.mo3636x();
        }
        if (me32 instanceof NodeCoordinator) {
            nodeCoordinator = (NodeCoordinator) me32;
        } else {
            nodeCoordinator = null;
        }
        if (nodeCoordinator == null) {
            return me32;
        }
        NodeCoordinator R0 = nodeCoordinator.mo3587R0();
        while (true) {
            NodeCoordinator nodeCoordinator2 = R0;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            R0 = nodeCoordinator.mo3587R0();
        }
    }

    /* renamed from: d */
    public static final long m23131d(me3 me3) {
        vx2.m53591g(me3, "<this>");
        return me3.mo3571C(tf4.f18145b.mo26446c());
    }
}
