package p000;

import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.za0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#J\u001a\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b*\u00020\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00048\u0016X\u0005¢\u0006\u0006\u001a\u0004\b \u0010\u001e\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, mo44877d2 = {"Lye3;", "", "Lqr0;", "Lvi1;", "", "y", "(F)F", "Lgo6;", "n", "(J)F", "Lxi1;", "Lt36;", "B", "(J)J", "Lxa0;", "canvas", "size", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Ldj1;", "drawNode", "Lr37;", "a", "(Lxa0;JLandroidx/compose/ui/node/NodeCoordinator;Ldj1;)V", "Lza0;", "Lza0;", "canvasDrawScope", "d", "Ldj1;", "getDensity", "()F", "density", "v", "fontScale", "<init>", "(Lza0;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ye3 */
/* compiled from: LayoutNodeDrawScope.kt */
public final class ye3 implements dc1, qr0 {

    /* renamed from: a */
    public final za0 f20193a;

    /* renamed from: d */
    public dj1 f20194d;

    public ye3(za0 za0) {
        vx2.m53591g(za0, "canvasDrawScope");
        this.f20193a = za0;
    }

    /* renamed from: B */
    public long mo18678B(long j) {
        return this.f20193a.mo18678B(j);
    }

    /* renamed from: a */
    public final void mo28054a(xa0 xa0, long j, NodeCoordinator nodeCoordinator, dj1 dj1) {
        vx2.m53591g(xa0, "canvas");
        vx2.m53591g(nodeCoordinator, "coordinator");
        vx2.m53591g(dj1, "drawNode");
        dj1 dj12 = this.f20194d;
        this.f20194d = dj1;
        za0 za0 = this.f20193a;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        za0.C3722a a = za0.mo28405a();
        dc1 a2 = a.mo28406a();
        LayoutDirection b = a.mo28407b();
        xa0 c = a.mo28408c();
        long d = a.mo28409d();
        za0.C3722a a3 = za0.mo28405a();
        a3.mo28413g(nodeCoordinator);
        a3.mo28414h(layoutDirection);
        a3.mo28412f(xa0);
        a3.mo28416i(j);
        xa0.mo21531g();
        dj1.mo3367g(this);
        xa0.mo21527c();
        za0.C3722a a4 = za0.mo28405a();
        a4.mo28413g(a2);
        a4.mo28414h(b);
        a4.mo28412f(c);
        a4.mo28416i(d);
        this.f20194d = dj12;
    }

    public float getDensity() {
        return this.f20193a.getDensity();
    }

    /* renamed from: n */
    public float mo18679n(long j) {
        return this.f20193a.mo18679n(j);
    }

    /* renamed from: v */
    public float mo3631v() {
        return this.f20193a.mo3631v();
    }

    /* renamed from: y */
    public float mo18680y(float f) {
        return this.f20193a.mo18680y(f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye3(za0 za0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new za0() : za0);
    }
}
