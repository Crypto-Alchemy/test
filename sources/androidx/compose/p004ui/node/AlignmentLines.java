package androidx.compose.p004ui.node;

import androidx.compose.p004ui.layout.AlignmentLineKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b>\u0010?J\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u0014\u0010\n\u001a\u00020\u0006*\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H$J\u0006\u0010\u000b\u001a\u00020\u0002J\u000f\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u0002J!\u0010\u0011\u001a\u00020\u000f*\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0002R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010)\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\"\u0010-\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\"\u00100\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R\"\u00103\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u0018\u00104\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006058\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0014\u00109\u001a\u00020\u001c8@X\u0004¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0014\u0010;\u001a\u00020\u001c8@X\u0004¢\u0006\u0006\u001a\u0004\b:\u0010 R$\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\u00020\b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b*\u0010<\u0001\u0002@A\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, mo44877d2 = {"Landroidx/compose/ui/node/AlignmentLines;", "", "Lr37;", "o", "", "Lcf;", "", "h", "Landroidx/compose/ui/node/NodeCoordinator;", "alignmentLine", "i", "n", "p", "()V", "m", "Ltf4;", "position", "d", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "initialPosition", "initialCoordinator", "c", "Ldf;", "a", "Ldf;", "f", "()Ldf;", "alignmentLinesOwner", "", "b", "Z", "g", "()Z", "setDirty$ui_release", "(Z)V", "dirty", "getUsedDuringParentMeasurement$ui_release", "u", "usedDuringParentMeasurement", "l", "t", "usedDuringParentLayout", "e", "getPreviousUsedDuringParentLayout$ui_release", "q", "previousUsedDuringParentLayout", "getUsedByModifierMeasurement$ui_release", "s", "usedByModifierMeasurement", "getUsedByModifierLayout$ui_release", "r", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "j", "queried", "k", "required", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "<init>", "(Ldf;)V", "Lxe3;", "Lml3;", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.AlignmentLines */
/* compiled from: LayoutNodeAlignmentLines.kt */
public abstract class AlignmentLines {

    /* renamed from: a */
    public final C2164df f1716a;

    /* renamed from: b */
    public boolean f1717b;

    /* renamed from: c */
    public boolean f1718c;

    /* renamed from: d */
    public boolean f1719d;

    /* renamed from: e */
    public boolean f1720e;

    /* renamed from: f */
    public boolean f1721f;

    /* renamed from: g */
    public boolean f1722g;

    /* renamed from: h */
    public C2164df f1723h;

    /* renamed from: i */
    public final Map<C1677cf, Integer> f1724i;

    public AlignmentLines(C2164df dfVar) {
        this.f1716a = dfVar;
        this.f1717b = true;
        this.f1724i = new HashMap();
    }

    public /* synthetic */ AlignmentLines(C2164df dfVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dfVar);
    }

    /* renamed from: c */
    public final void mo3330c(C1677cf cfVar, int i, NodeCoordinator nodeCoordinator) {
        int i2;
        float f = (float) i;
        long a = wf4.m29550a(f, f);
        while (true) {
            a = mo3331d(nodeCoordinator, a);
            nodeCoordinator = nodeCoordinator.mo3587R0();
            vx2.m53588d(nodeCoordinator);
            if (vx2.m53586b(nodeCoordinator, this.f1716a.mo3543s())) {
                break;
            } else if (mo3332e(nodeCoordinator).containsKey(cfVar)) {
                float i3 = (float) mo3336i(nodeCoordinator, cfVar);
                a = wf4.m29550a(i3, i3);
            }
        }
        if (cfVar instanceof um2) {
            i2 = ap3.m31899b(tf4.m27735l(a));
        } else {
            i2 = ap3.m31899b(tf4.m27734k(a));
        }
        Map<C1677cf, Integer> map = this.f1724i;
        if (map.containsKey(cfVar)) {
            i2 = AlignmentLineKt.m2463a(cfVar, ((Number) C6177b.m47362j(this.f1724i, cfVar)).intValue(), i2);
        }
        map.put(cfVar, Integer.valueOf(i2));
    }

    /* renamed from: d */
    public abstract long mo3331d(NodeCoordinator nodeCoordinator, long j);

    /* renamed from: e */
    public abstract Map<C1677cf, Integer> mo3332e(NodeCoordinator nodeCoordinator);

    /* renamed from: f */
    public final C2164df mo3333f() {
        return this.f1716a;
    }

    /* renamed from: g */
    public final boolean mo3334g() {
        return this.f1717b;
    }

    /* renamed from: h */
    public final Map<C1677cf, Integer> mo3335h() {
        return this.f1724i;
    }

    /* renamed from: i */
    public abstract int mo3336i(NodeCoordinator nodeCoordinator, C1677cf cfVar);

    /* renamed from: j */
    public final boolean mo3337j() {
        if (this.f1718c || this.f1720e || this.f1721f || this.f1722g) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo3338k() {
        mo3342o();
        if (this.f1723h != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo3339l() {
        return this.f1719d;
    }

    /* renamed from: m */
    public final void mo3340m() {
        this.f1717b = true;
        C2164df d = this.f1716a.mo3533d();
        if (d != null) {
            if (this.f1718c) {
                d.mo3519E();
            } else if (this.f1720e || this.f1719d) {
                d.requestLayout();
            }
            if (this.f1721f) {
                this.f1716a.mo3519E();
            }
            if (this.f1722g) {
                d.requestLayout();
            }
            d.mo3529b().mo3340m();
        }
    }

    /* renamed from: n */
    public final void mo3341n() {
        this.f1724i.clear();
        this.f1716a.mo3541p(new AlignmentLines$recalculate$1(this));
        this.f1724i.putAll(mo3332e(this.f1716a.mo3543s()));
        this.f1717b = false;
    }

    /* renamed from: o */
    public final void mo3342o() {
        C2164df dfVar;
        AlignmentLines b;
        AlignmentLines b2;
        if (mo3337j()) {
            dfVar = this.f1716a;
        } else {
            C2164df d = this.f1716a.mo3533d();
            if (d != null) {
                dfVar = d.mo3529b().f1723h;
                if (dfVar == null || !dfVar.mo3529b().mo3337j()) {
                    C2164df dfVar2 = this.f1723h;
                    if (dfVar2 != null && !dfVar2.mo3529b().mo3337j()) {
                        C2164df d2 = dfVar2.mo3533d();
                        if (!(d2 == null || (b2 = d2.mo3529b()) == null)) {
                            b2.mo3342o();
                        }
                        C2164df d3 = dfVar2.mo3533d();
                        if (d3 == null || (b = d3.mo3529b()) == null) {
                            dfVar = null;
                        } else {
                            dfVar = b.f1723h;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.f1723h = dfVar;
    }

    /* renamed from: p */
    public final void mo3343p() {
        this.f1717b = true;
        this.f1718c = false;
        this.f1720e = false;
        this.f1719d = false;
        this.f1721f = false;
        this.f1722g = false;
        this.f1723h = null;
    }

    /* renamed from: q */
    public final void mo3344q(boolean z) {
        this.f1720e = z;
    }

    /* renamed from: r */
    public final void mo3345r(boolean z) {
        this.f1722g = z;
    }

    /* renamed from: s */
    public final void mo3346s(boolean z) {
        this.f1721f = z;
    }

    /* renamed from: t */
    public final void mo3347t(boolean z) {
        this.f1719d = z;
    }

    /* renamed from: u */
    public final void mo3348u(boolean z) {
        this.f1718c = z;
    }
}
