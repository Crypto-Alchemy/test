package androidx.compose.p004ui.node;

import java.util.Comparator;
import java.util.Map;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR'\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "b", "Lr37;", "a", "f", "e", "d", "", "toString", "Z", "extraAssertions", "", "", "Lef3;", "c", "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Ljava/util/Comparator;", "DepthComparator", "Landroidx/compose/ui/node/TreeSet;", "Landroidx/compose/ui/node/TreeSet;", "set", "<init>", "(Z)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.DepthSortedSet */
/* compiled from: DepthSortedSet.kt */
public final class DepthSortedSet {

    /* renamed from: a */
    public final boolean f1736a;

    /* renamed from: b */
    public final ef3 f1737b = C6169a.m47233b(LazyThreadSafetyMode.NONE, DepthSortedSet$mapOfOriginalDepth$2.INSTANCE);

    /* renamed from: c */
    public final Comparator<LayoutNode> f1738c;

    /* renamed from: d */
    public final TreeSet<LayoutNode> f1739d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo44877d2 = {"androidx/compose/ui/node/DepthSortedSet$a", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "l1", "l2", "", "a", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.DepthSortedSet$a */
    /* compiled from: DepthSortedSet.kt */
    public static final class C0375a implements Comparator<LayoutNode> {
        /* renamed from: a */
        public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            vx2.m53591g(layoutNode, "l1");
            vx2.m53591g(layoutNode2, "l2");
            int i = vx2.m53593i(layoutNode.mo3483y(), layoutNode2.mo3483y());
            if (i != 0) {
                return i;
            }
            return vx2.m53593i(layoutNode.hashCode(), layoutNode2.hashCode());
        }
    }

    public DepthSortedSet(boolean z) {
        this.f1736a = z;
        C0375a aVar = new C0375a();
        this.f1738c = aVar;
        this.f1739d = new TreeSet<>(aVar);
    }

    /* renamed from: a */
    public final void mo3384a(LayoutNode layoutNode) {
        boolean z;
        vx2.m53591g(layoutNode, "node");
        if (layoutNode.mo3459l0()) {
            if (this.f1736a) {
                Integer num = mo3386c().get(layoutNode);
                if (num == null) {
                    mo3386c().put(layoutNode, Integer.valueOf(layoutNode.mo3483y()));
                } else {
                    if (num.intValue() == layoutNode.mo3483y()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.f1739d.add(layoutNode);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public final boolean mo3385b(LayoutNode layoutNode) {
        boolean z;
        vx2.m53591g(layoutNode, "node");
        boolean contains = this.f1739d.contains(layoutNode);
        if (this.f1736a) {
            if (contains == mo3386c().containsKey(layoutNode)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return contains;
    }

    /* renamed from: c */
    public final Map<LayoutNode, Integer> mo3386c() {
        return (Map) this.f1737b.getValue();
    }

    /* renamed from: d */
    public final boolean mo3387d() {
        return this.f1739d.isEmpty();
    }

    /* renamed from: e */
    public final LayoutNode mo3388e() {
        LayoutNode first = this.f1739d.first();
        vx2.m53590f(first, "node");
        mo3389f(first);
        return first;
    }

    /* renamed from: f */
    public final boolean mo3389f(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "node");
        if (layoutNode.mo3459l0()) {
            boolean remove = this.f1739d.remove(layoutNode);
            if (this.f1736a) {
                Integer remove2 = mo3386c().remove(layoutNode);
                boolean z = true;
                if (remove) {
                    int y = layoutNode.mo3483y();
                    if (remove2 == null || remove2.intValue() != y) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (remove2 != null) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public String toString() {
        String obj = this.f1739d.toString();
        vx2.m53590f(obj, "set.toString()");
        return obj;
    }
}
