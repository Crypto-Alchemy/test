package p000;

import androidx.compose.p004ui.focus.FocusModifier;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u000e"}, mo44877d2 = {"Lx62;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusModifier;", "Lkotlin/Comparator;", "focusModifier1", "focusModifier2", "", "a", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lv04;", "b", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: x62 */
/* compiled from: OneDimensionalFocusSearch.kt */
public final class x62 implements Comparator<FocusModifier> {

    /* renamed from: a */
    public static final x62 f19327a = new x62();

    /* renamed from: a */
    public int compare(FocusModifier focusModifier, FocusModifier focusModifier2) {
        LayoutNode layoutNode;
        if (focusModifier == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (focusModifier2 != null) {
            int i = 0;
            if (!w62.m29292g(focusModifier) || !w62.m29292g(focusModifier2)) {
                return 0;
            }
            NodeCoordinator t = focusModifier.mo3226t();
            LayoutNode layoutNode2 = null;
            if (t != null) {
                layoutNode = t.mo3596X();
            } else {
                layoutNode = null;
            }
            if (layoutNode != null) {
                NodeCoordinator t2 = focusModifier2.mo3226t();
                if (t2 != null) {
                    layoutNode2 = t2.mo3596X();
                }
                if (layoutNode2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                } else if (vx2.m53586b(layoutNode, layoutNode2)) {
                    return 0;
                } else {
                    v04<LayoutNode> b = mo27680b(layoutNode);
                    v04<LayoutNode> b2 = mo27680b(layoutNode2);
                    int min = Math.min(b.mo26963n() - 1, b2.mo26963n() - 1);
                    if (min >= 0) {
                        while (vx2.m53586b(b.mo26962m()[i], b2.mo26962m()[i])) {
                            if (i != min) {
                                i++;
                            }
                        }
                        return vx2.m53593i(((LayoutNode) b.mo26962m()[i]).mo3432W(), ((LayoutNode) b2.mo26962m()[i]).mo3432W());
                    }
                    throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: b */
    public final v04<LayoutNode> mo27680b(LayoutNode layoutNode) {
        v04<LayoutNode> v04 = new v04<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            v04.mo26952b(0, layoutNode);
            layoutNode = layoutNode.mo3430V();
        }
        return v04;
    }
}
