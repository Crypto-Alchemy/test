package p000;

import androidx.compose.p004ui.node.LayoutNode;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¨\u0006\b"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lv04;", "Liq3;", "destination", "Lkotlin/Function1;", "transform", "Lr37;", "b", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: af3 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
public final class af3 {
    /* renamed from: b */
    public static final void m228b(LayoutNode layoutNode, v04<iq3> v04, rc2<? super LayoutNode, ? extends iq3> rc2) {
        v04<LayoutNode> b0 = layoutNode.mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode2 = (LayoutNode) m[i];
                if (v04.mo26963n() <= i) {
                    v04.mo26953c(rc2.invoke(layoutNode2));
                } else {
                    v04.mo26950D(i, rc2.invoke(layoutNode2));
                }
                i++;
            } while (i < n);
        }
        v04.mo26948A(layoutNode.mo3479w().size(), v04.mo26963n());
    }
}
