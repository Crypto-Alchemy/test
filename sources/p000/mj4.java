package p000;

import androidx.compose.p004ui.node.LayoutNode;
import p000.nj4;

/* renamed from: mj4 */
/* compiled from: Owner.kt */
public final /* synthetic */ class mj4 {
    static {
        nj4.C2901a aVar = nj4.f15566p;
    }

    /* renamed from: a */
    public static /* synthetic */ void m22324a(nj4 nj4, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            nj4.mo3713a(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
    }

    /* renamed from: b */
    public static /* synthetic */ void m22325b(nj4 nj4, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            nj4.mo3716b(layoutNode, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
    }

    /* renamed from: c */
    public static /* synthetic */ void m22326c(nj4 nj4, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            nj4.mo3718c(layoutNode, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
    }
}
