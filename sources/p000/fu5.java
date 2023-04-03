package p000;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.semantics.NodeLocationHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\"\u0010\t\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¨\u0006\f"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "Lyt5;", "list", "", "c", "Lkotlin/Function1;", "", "predicate", "b", "Landroidx/compose/ui/node/NodeCoordinator;", "a", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: fu5 */
/* compiled from: SemanticsSort.kt */
public final class fu5 {
    /* renamed from: a */
    public static final NodeCoordinator m17414a(LayoutNode layoutNode) {
        sw3.C3310c l;
        NodeCoordinator v;
        vx2.m53591g(layoutNode, "<this>");
        yt5 i = au5.m10805i(layoutNode);
        if (i == null) {
            i = au5.m10806j(layoutNode);
        }
        if (i == null || (l = i.mo23638l()) == null || (v = l.mo25987v()) == null) {
            return layoutNode.mo3393A();
        }
        return v;
    }

    /* renamed from: b */
    public static final LayoutNode m17415b(LayoutNode layoutNode, rc2<? super LayoutNode, Boolean> rc2) {
        vx2.m53591g(layoutNode, "<this>");
        vx2.m53591g(rc2, "predicate");
        if (rc2.invoke(layoutNode).booleanValue()) {
            return layoutNode;
        }
        List<LayoutNode> w = layoutNode.mo3479w();
        int size = w.size();
        for (int i = 0; i < size; i++) {
            LayoutNode b = m17415b(w.get(i), rc2);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final List<yt5> m17416c(LayoutNode layoutNode, List<yt5> list) {
        vx2.m53591g(layoutNode, "<this>");
        vx2.m53591g(list, "list");
        if (!layoutNode.mo3459l0()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        List<LayoutNode> w = layoutNode.mo3479w();
        int size = w.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = w.get(i);
            if (layoutNode2.mo3459l0()) {
                arrayList.add(new NodeLocationHolder(layoutNode, layoutNode2));
            }
        }
        List<NodeLocationHolder> e = m17418e(arrayList);
        ArrayList arrayList2 = new ArrayList(e.size());
        int size2 = e.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(e.get(i2).mo3992e());
        }
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            LayoutNode layoutNode3 = (LayoutNode) arrayList2.get(i3);
            yt5 j = au5.m10806j(layoutNode3);
            if (j != null) {
                list.add(j);
            } else {
                m17416c(layoutNode3, list);
            }
        }
        return list;
    }

    /* renamed from: d */
    public static /* synthetic */ List m17417d(LayoutNode layoutNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return m17416c(layoutNode, list);
    }

    /* renamed from: e */
    public static final List<NodeLocationHolder> m17418e(List<NodeLocationHolder> list) {
        try {
            NodeLocationHolder.f2108k.mo3993a(NodeLocationHolder.ComparisonStrategy.Stripe);
            List<NodeLocationHolder> M0 = CollectionsKt___CollectionsKt.m47313M0(list);
            gk0.m44737x(M0);
            return M0;
        } catch (IllegalArgumentException unused) {
            NodeLocationHolder.f2108k.mo3993a(NodeLocationHolder.ComparisonStrategy.Location);
            List<NodeLocationHolder> M02 = CollectionsKt___CollectionsKt.m47313M0(list);
            gk0.m44737x(M02);
            return M02;
        }
    }
}
