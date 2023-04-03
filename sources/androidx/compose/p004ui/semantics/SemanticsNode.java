package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\b\b\u0002\u0010*\u001a\u00020&¢\u0006\u0004\bX\u0010YJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0002J3\u0010\u0016\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u001d8\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010%\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020&8\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b(\u0010)R\"\u0010.\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u001a\u0004\b+\u0010$\"\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00106\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010;\u001a\u0002078\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010$R\u0011\u0010A\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010E\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010I\u001a\u00020F8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010J\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\b2\u0010DR\u001a\u0010M\u001a\u00020K8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bL\u0010HR\u0011\u0010O\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bN\u00105R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00000\n8@X\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00000\n8@X\u0004¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0013\u0010W\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bU\u0010V\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006Z"}, mo44877d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Lvt5;", "mergedConfig", "Lr37;", "v", "", "sortByBounds", "includeReplacedSemantics", "includeFakeNodes", "", "g", "", "list", "d", "unmergedChildren", "a", "Lhh5;", "role", "Lkotlin/Function1;", "Leu5;", "properties", "b", "(Lhh5;Lrc2;)Landroidx/compose/ui/semantics/SemanticsNode;", "w", "(ZZ)Ljava/util/List;", "Landroidx/compose/ui/node/NodeCoordinator;", "c", "()Landroidx/compose/ui/node/NodeCoordinator;", "Lyt5;", "Lyt5;", "l", "()Lyt5;", "outerSemanticsNode", "Z", "getMergingEnabled", "()Z", "mergingEnabled", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LayoutNode;", "k", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "t", "setFake$ui_release", "(Z)V", "isFake", "e", "Landroidx/compose/ui/semantics/SemanticsNode;", "fakeNodeParent", "f", "Lvt5;", "s", "()Lvt5;", "unmergedConfig", "", "I", "i", "()I", "id", "u", "isMergingSemanticsOfDescendants", "Lqe3;", "j", "()Lqe3;", "layoutInfo", "La95;", "r", "()La95;", "touchBoundsInRoot", "Lsw2;", "q", "()J", "size", "boundsInRoot", "Ltf4;", "n", "positionInRoot", "h", "config", "o", "()Ljava/util/List;", "replacedChildren", "p", "replacedChildrenSortedByBounds", "m", "()Landroidx/compose/ui/semantics/SemanticsNode;", "parent", "<init>", "(Lyt5;ZLandroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.semantics.SemanticsNode */
/* compiled from: SemanticsNode.kt */
public final class SemanticsNode {

    /* renamed from: a */
    public final yt5 f2115a;

    /* renamed from: b */
    public final boolean f2116b;

    /* renamed from: c */
    public final LayoutNode f2117c;

    /* renamed from: d */
    public boolean f2118d;

    /* renamed from: e */
    public SemanticsNode f2119e;

    /* renamed from: f */
    public final vt5 f2120f;

    /* renamed from: g */
    public final int f2121g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, mo44877d2 = {"androidx/compose/ui/semantics/SemanticsNode$a", "Lyt5;", "Lsw3$c;", "Lvt5;", "x", "Lvt5;", "h", "()Lvt5;", "semanticsConfiguration", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.semantics.SemanticsNode$a */
    /* compiled from: SemanticsNode.kt */
    public static final class C0453a extends sw3.C3310c implements yt5 {

        /* renamed from: x */
        public final vt5 f2122x;

        public C0453a(rc2<? super eu5, r37> rc2) {
            vt5 vt5 = new vt5();
            vt5.mo27314B(false);
            vt5.mo27313A(false);
            rc2.invoke(vt5);
            this.f2122x = vt5;
        }

        /* renamed from: h */
        public vt5 mo3368h() {
            return this.f2122x;
        }
    }

    public SemanticsNode(yt5 yt5, boolean z, LayoutNode layoutNode) {
        vx2.m53591g(yt5, "outerSemanticsNode");
        vx2.m53591g(layoutNode, "layoutNode");
        this.f2115a = yt5;
        this.f2116b = z;
        this.f2117c = layoutNode;
        this.f2120f = zt5.m31502a(yt5);
        this.f2121g = layoutNode.mo3434X();
    }

    /* renamed from: e */
    public static /* synthetic */ List m3169e(SemanticsNode semanticsNode, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return semanticsNode.mo3999d(list, z);
    }

    /* renamed from: x */
    public static /* synthetic */ List m3170x(SemanticsNode semanticsNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return semanticsNode.mo4017w(z, z2);
    }

    /* renamed from: a */
    public final void mo3996a(List<SemanticsNode> list) {
        String str;
        hh5 c = au5.m10807k(this);
        if (c != null && this.f2120f.mo27326u() && (!list.isEmpty())) {
            list.add(mo3997b(c, new SemanticsNode$emitFakeNodes$fakeNode$1(c)));
        }
        vt5 vt5 = this.f2120f;
        SemanticsProperties semanticsProperties = SemanticsProperties.f2125a;
        if (vt5.mo27319k(semanticsProperties.mo4024c()) && (!list.isEmpty()) && this.f2120f.mo27326u()) {
            List list2 = (List) SemanticsConfigurationKt.m3168a(this.f2120f, semanticsProperties.mo4024c());
            if (list2 != null) {
                str = (String) CollectionsKt___CollectionsKt.m47331b0(list2);
            } else {
                str = null;
            }
            if (str != null) {
                list.add(0, mo3997b((hh5) null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
            }
        }
    }

    /* renamed from: b */
    public final SemanticsNode mo3997b(hh5 hh5, rc2<? super eu5, r37> rc2) {
        int i;
        C0453a aVar = new C0453a(rc2);
        if (hh5 != null) {
            i = au5.m10808l(this);
        } else {
            i = au5.m10801e(this);
        }
        SemanticsNode semanticsNode = new SemanticsNode(aVar, false, new LayoutNode(true, i));
        semanticsNode.f2118d = true;
        semanticsNode.f2119e = this;
        return semanticsNode;
    }

    /* renamed from: c */
    public final NodeCoordinator mo3998c() {
        if (!this.f2120f.mo27326u()) {
            return ob1.m23743e(this.f2115a, g84.f12195a.mo20434j());
        }
        yt5 i = au5.m10805i(this.f2117c);
        if (i == null) {
            i = this.f2115a;
        }
        return ob1.m23743e(i, g84.f12195a.mo20434j());
    }

    /* renamed from: d */
    public final List<SemanticsNode> mo3999d(List<SemanticsNode> list, boolean z) {
        List x = m3170x(this, z, false, 2, (Object) null);
        int size = x.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) x.get(i);
            if (semanticsNode.mo4015u()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.f2120f.mo27324t()) {
                m3169e(semanticsNode, list, false, 2, (Object) null);
            }
        }
        return list;
    }

    /* renamed from: f */
    public final a95 mo4000f() {
        if (!this.f2117c.mo3459l0()) {
            return a95.f70e.mo127a();
        }
        return ne3.m23129b(mo3998c());
    }

    /* renamed from: g */
    public final List<SemanticsNode> mo4001g(boolean z, boolean z2, boolean z3) {
        if (!z2 && this.f2120f.mo27324t()) {
            return ck0.m33062j();
        }
        if (mo4015u()) {
            return m3169e(this, (List) null, z, 1, (Object) null);
        }
        return mo4017w(z, z3);
    }

    /* renamed from: h */
    public final vt5 mo4002h() {
        if (!mo4015u()) {
            return this.f2120f;
        }
        vt5 n = this.f2120f.mo27320n();
        mo4016v(n);
        return n;
    }

    /* renamed from: i */
    public final int mo4003i() {
        return this.f2121g;
    }

    /* renamed from: j */
    public final qe3 mo4004j() {
        return this.f2117c;
    }

    /* renamed from: k */
    public final LayoutNode mo4005k() {
        return this.f2117c;
    }

    /* renamed from: l */
    public final yt5 mo4006l() {
        return this.f2115a;
    }

    /* renamed from: m */
    public final SemanticsNode mo4007m() {
        LayoutNode layoutNode;
        yt5 yt5;
        SemanticsNode semanticsNode = this.f2119e;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (this.f2116b) {
            layoutNode = au5.m10802f(this.f2117c, SemanticsNode$parent$1.INSTANCE);
        } else {
            layoutNode = null;
        }
        if (layoutNode == null) {
            layoutNode = au5.m10802f(this.f2117c, SemanticsNode$parent$2.INSTANCE);
        }
        if (layoutNode != null) {
            yt5 = au5.m10806j(layoutNode);
        } else {
            yt5 = null;
        }
        if (yt5 == null) {
            return null;
        }
        return new SemanticsNode(yt5, this.f2116b, (LayoutNode) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: n */
    public final long mo4008n() {
        if (!this.f2117c.mo3459l0()) {
            return tf4.f18145b.mo26446c();
        }
        return ne3.m23131d(mo3998c());
    }

    /* renamed from: o */
    public final List<SemanticsNode> mo4009o() {
        return mo4001g(false, false, true);
    }

    /* renamed from: p */
    public final List<SemanticsNode> mo4010p() {
        return mo4001g(true, false, true);
    }

    /* renamed from: q */
    public final long mo4011q() {
        return mo3998c().mo3611g();
    }

    /* renamed from: r */
    public final a95 mo4012r() {
        yt5 yt5;
        if (this.f2120f.mo27326u()) {
            yt5 = au5.m10805i(this.f2117c);
            if (yt5 == null) {
                yt5 = this.f2115a;
            }
        } else {
            yt5 = this.f2115a;
        }
        return zt5.m31504c(yt5);
    }

    /* renamed from: s */
    public final vt5 mo4013s() {
        return this.f2120f;
    }

    /* renamed from: t */
    public final boolean mo4014t() {
        return this.f2118d;
    }

    /* renamed from: u */
    public final boolean mo4015u() {
        if (!this.f2116b || !this.f2120f.mo27326u()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final void mo4016v(vt5 vt5) {
        if (!this.f2120f.mo27324t()) {
            List x = m3170x(this, false, false, 3, (Object) null);
            int size = x.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode = (SemanticsNode) x.get(i);
                if (!semanticsNode.mo4015u()) {
                    vt5.mo27327w(semanticsNode.f2120f);
                    semanticsNode.mo4016v(vt5);
                }
            }
        }
    }

    /* renamed from: w */
    public final List<SemanticsNode> mo4017w(boolean z, boolean z2) {
        List list;
        if (this.f2118d) {
            return ck0.m33062j();
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            list = fu5.m17417d(this.f2117c, (List) null, 1, (Object) null);
        } else {
            list = au5.m10804h(this.f2117c, (List) null, 1, (Object) null);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new SemanticsNode((yt5) list.get(i), this.f2116b, (LayoutNode) null, 4, (DefaultConstructorMarker) null));
        }
        if (z2) {
            mo3996a(arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SemanticsNode(yt5 yt5, boolean z, LayoutNode layoutNode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yt5, z, (i & 4) != 0 ? ob1.m23744f(yt5) : layoutNode);
    }
}
