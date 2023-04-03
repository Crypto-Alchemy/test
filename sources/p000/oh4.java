package p000;

import androidx.compose.p004ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Loh4;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "Lr37;", "c", "rootNode", "d", "a", "layoutNode", "b", "Lv04;", "Lv04;", "layoutNodes", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: oh4 */
/* compiled from: OnPositionedDispatcher.kt */
public final class oh4 {

    /* renamed from: b */
    public static final C2956a f15896b = new C2956a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final v04<LayoutNode> f15897a = new v04<>(new LayoutNode[16], 0);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo44877d2 = {"Loh4$a;", "", "<init>", "()V", "a", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: oh4$a */
    /* compiled from: OnPositionedDispatcher.kt */
    public static final class C2956a {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo44877d2 = {"Loh4$a$a;", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "a", "b", "", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: oh4$a$a */
        /* compiled from: OnPositionedDispatcher.kt */
        public static final class C2957a implements Comparator<LayoutNode> {

            /* renamed from: a */
            public static final C2957a f15898a = new C2957a();

            /* renamed from: a */
            public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                vx2.m53591g(layoutNode, "a");
                vx2.m53591g(layoutNode2, "b");
                int i = vx2.m53593i(layoutNode2.mo3483y(), layoutNode.mo3483y());
                if (i != 0) {
                    return i;
                }
                return vx2.m53593i(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }

        public C2956a() {
        }

        public /* synthetic */ C2956a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo23952a() {
        this.f15897a.mo26951E(C2956a.C2957a.f15898a);
        v04<LayoutNode> v04 = this.f15897a;
        int n = v04.mo26963n();
        if (n > 0) {
            int i = n - 1;
            Object[] m = v04.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = (LayoutNode) m[i];
                if (layoutNode.mo3422R()) {
                    mo23953b(layoutNode);
                }
                i--;
            } while (i >= 0);
        }
        this.f15897a.mo26958i();
    }

    /* renamed from: b */
    public final void mo23953b(LayoutNode layoutNode) {
        layoutNode.mo3466q();
        int i = 0;
        layoutNode.mo3442a1(false);
        v04<LayoutNode> b0 = layoutNode.mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                mo23953b((LayoutNode) m[i]);
                i++;
            } while (i < n);
        }
    }

    /* renamed from: c */
    public final void mo23954c(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "node");
        this.f15897a.mo26953c(layoutNode);
        layoutNode.mo3442a1(true);
    }

    /* renamed from: d */
    public final void mo23955d(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "rootNode");
        this.f15897a.mo26958i();
        this.f15897a.mo26953c(layoutNode);
        layoutNode.mo3442a1(true);
    }
}
