package p000;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.github.mikephil.charting.utils.Utils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.sw3;
import p000.vo4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 62\u00020\u0001:\u0003789B\u0017\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00103\u001a\u00020\u001d¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016R*\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u00100\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b.\u0010/\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006:"}, mo44877d2 = {"Lte3;", "Landroidx/compose/ui/node/NodeCoordinator;", "Lsl3;", "scope", "Lol3;", "y0", "Lmq0;", "constraints", "Lvo4;", "t", "(J)Lvo4;", "Lnw2;", "position", "", "zIndex", "Lkotlin/Function1;", "Lnj2;", "Lr37;", "layerBlock", "O", "(JFLrc2;)V", "h1", "Lcf;", "alignmentLine", "", "S", "Lxa0;", "canvas", "l1", "Lse3;", "<set-?>", "t1", "Lse3;", "B1", "()Lse3;", "D1", "(Lse3;)V", "layoutModifierNode", "Llx2;", "u1", "Llx2;", "lookAheadTransientMeasureNode", "Lsw3$c;", "P0", "()Lsw3$c;", "tail", "C1", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "measureNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Lse3;)V", "v1", "a", "b", "c", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: te3 */
/* compiled from: LayoutModifierNodeCoordinator.kt */
public final class te3 extends NodeCoordinator {

    /* renamed from: v1 */
    public static final C3357a f18132v1 = new C3357a((DefaultConstructorMarker) null);

    /* renamed from: w1 */
    public static final gl4 f18133w1;

    /* renamed from: t1 */
    public se3 f18134t1;

    /* renamed from: u1 */
    public lx2 f18135u1;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lte3$a;", "", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: te3$a */
    /* compiled from: LayoutModifierNodeCoordinator.kt */
    public static final class C3357a {
        public C3357a() {
        }

        public /* synthetic */ C3357a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\n0\u0011R\u00060\u0000R\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, mo44877d2 = {"Lte3$b;", "Lol3;", "Lmq0;", "constraints", "Lvo4;", "t", "(J)Lvo4;", "Lcf;", "alignmentLine", "", "S", "Llx2;", "I", "Llx2;", "getIntermediateMeasureNode", "()Llx2;", "intermediateMeasureNode", "Lte3$b$a;", "Lte3;", "L", "Lte3$b$a;", "passThroughMeasureResult", "Lsl3;", "scope", "<init>", "(Lte3;Lsl3;Llx2;)V", "a", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: te3$b */
    /* compiled from: LayoutModifierNodeCoordinator.kt */
    public final class C3358b extends ol3 {

        /* renamed from: I */
        public final lx2 f18136I;

        /* renamed from: L */
        public final C3359a f18137L = new C3359a();

        /* renamed from: M */
        public final /* synthetic */ te3 f18138M;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, mo44877d2 = {"Lte3$b$a;", "Lmq3;", "Lr37;", "a", "", "Lcf;", "", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "alignmentLines", "getWidth", "()I", "width", "getHeight", "height", "<init>", "(Lte3$b;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: te3$b$a */
        /* compiled from: LayoutModifierNodeCoordinator.kt */
        public final class C3359a implements mq3 {

            /* renamed from: a */
            public final Map<C1677cf, Integer> f18139a = C6177b.m47361i();

            public C3359a() {
            }

            /* renamed from: a */
            public void mo23299a() {
                vo4.C3501a.C3502a aVar = vo4.C3501a.f18872a;
                ol3 K0 = C3358b.this.f18138M.mo26433C1().mo3580K0();
                vx2.m53588d(K0);
                vo4.C3501a.m29011n(aVar, K0, 0, 0, Utils.FLOAT_EPSILON, 4, (Object) null);
            }

            /* renamed from: b */
            public Map<C1677cf, Integer> mo23300b() {
                return this.f18139a;
            }

            public int getHeight() {
                ol3 K0 = C3358b.this.f18138M.mo26433C1().mo3580K0();
                vx2.m53588d(K0);
                return K0.mo3598Y().getHeight();
            }

            public int getWidth() {
                ol3 K0 = C3358b.this.f18138M.mo26433C1().mo3580K0();
                vx2.m53588d(K0);
                return K0.mo3598Y().getWidth();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3358b(te3 te3, sl3 sl3, lx2 lx2) {
            super(te3, sl3);
            vx2.m53591g(sl3, "scope");
            vx2.m53591g(lx2, "intermediateMeasureNode");
            this.f18138M = te3;
            this.f18136I = lx2;
        }

        /* renamed from: S */
        public int mo23722S(C1677cf cfVar) {
            vx2.m53591g(cfVar, "alignmentLine");
            int a = ue3.m28204b(this, cfVar);
            mo23995l0().put(cfVar, Integer.valueOf(a));
            return a;
        }

        /* renamed from: t */
        public vo4 mo3544t(long j) {
            lx2 lx2 = this.f18136I;
            te3 te3 = this.f18138M;
            mo27280R(j);
            ol3 K0 = te3.mo26433C1().mo3580K0();
            vx2.m53588d(K0);
            K0.mo3544t(j);
            lx2.mo3366f(tw2.m27948a(K0.mo3598Y().getWidth(), K0.mo3598Y().getHeight()));
            mo24002s0(this.f18137L);
            return this;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo44877d2 = {"Lte3$c;", "Lol3;", "Lmq0;", "constraints", "Lvo4;", "t", "(J)Lvo4;", "Lcf;", "alignmentLine", "", "S", "Lsl3;", "scope", "<init>", "(Lte3;Lsl3;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: te3$c */
    /* compiled from: LayoutModifierNodeCoordinator.kt */
    public final class C3360c extends ol3 {

        /* renamed from: I */
        public final /* synthetic */ te3 f18141I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3360c(te3 te3, sl3 sl3) {
            super(te3, sl3);
            vx2.m53591g(sl3, "scope");
            this.f18141I = te3;
        }

        /* renamed from: S */
        public int mo23722S(C1677cf cfVar) {
            vx2.m53591g(cfVar, "alignmentLine");
            int a = ue3.m28204b(this, cfVar);
            mo23995l0().put(cfVar, Integer.valueOf(a));
            return a;
        }

        /* renamed from: t */
        public vo4 mo3544t(long j) {
            te3 te3 = this.f18141I;
            mo27280R(j);
            se3 B1 = te3.mo26432B1();
            ol3 K0 = te3.mo26433C1().mo3580K0();
            vx2.m53588d(K0);
            mo24002s0(B1.mo3365e(this, K0, j));
            return this;
        }
    }

    static {
        gl4 a = C3729zi.m31240a();
        a.mo20638a(uk0.f18515b.mo26822b());
        a.mo20642e(1.0f);
        a.mo20641d(il4.f13314a.mo21570a());
        f18133w1 = a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public te3(LayoutNode layoutNode, se3 se3) {
        super(layoutNode);
        boolean z;
        lx2 lx2;
        vx2.m53591g(layoutNode, "layoutNode");
        vx2.m53591g(se3, "measureNode");
        this.f18134t1 = se3;
        sw3.C3310c l = se3.mo23638l();
        if ((l.mo25988w() & g84.f12195a.mo20428d()) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(se3 instanceof lx2)) {
            lx2 = null;
        } else {
            lx2 = (lx2) se3;
        }
        this.f18135u1 = lx2;
    }

    /* renamed from: B1 */
    public final se3 mo26432B1() {
        return this.f18134t1;
    }

    /* renamed from: C1 */
    public final NodeCoordinator mo26433C1() {
        NodeCoordinator Q0 = mo3586Q0();
        vx2.m53588d(Q0);
        return Q0;
    }

    /* renamed from: D1 */
    public final void mo26434D1(se3 se3) {
        vx2.m53591g(se3, "<set-?>");
        this.f18134t1 = se3;
    }

    /* renamed from: O */
    public void mo3520O(long j, float f, rc2<? super nj2, r37> rc2) {
        super.mo3520O(j, f, rc2);
        if (!mo23726d0()) {
            mo3618k1();
            vo4.C3501a.C3502a aVar = vo4.C3501a.f18872a;
            int f2 = sw2.m27143f(mo27275K());
            LayoutDirection layoutDirection = getLayoutDirection();
            me3 f3 = vo4.C3501a.f18875d;
            int x = aVar.mo27282l();
            LayoutDirection w = aVar.mo27281k();
            LayoutNodeLayoutDelegate a = vo4.C3501a.f18876e;
            vo4.C3501a.f18874c = f2;
            vo4.C3501a.f18873b = layoutDirection;
            boolean v = aVar.mo27288y(this);
            mo3598Y().mo23299a();
            mo23727f0(v);
            vo4.C3501a.f18874c = x;
            vo4.C3501a.f18873b = w;
            vo4.C3501a.f18875d = f3;
            vo4.C3501a.f18876e = a;
        }
    }

    /* renamed from: P0 */
    public sw3.C3310c mo3585P0() {
        return this.f18134t1.mo23638l();
    }

    /* renamed from: S */
    public int mo23722S(C1677cf cfVar) {
        vx2.m53591g(cfVar, "alignmentLine");
        ol3 K0 = mo3580K0();
        if (K0 != null) {
            return K0.mo23994k0(cfVar);
        }
        return ue3.m28204b(this, cfVar);
    }

    /* renamed from: h1 */
    public void mo3615h1() {
        boolean z;
        super.mo3615h1();
        se3 se3 = this.f18134t1;
        sw3.C3310c l = se3.mo23638l();
        if ((l.mo25988w() & g84.f12195a.mo20428d()) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(se3 instanceof lx2)) {
            this.f18135u1 = null;
            ol3 K0 = mo3580K0();
            if (K0 != null) {
                mo3640y1(new C3360c(this, K0.mo23998o0()));
                return;
            }
            return;
        }
        lx2 lx2 = (lx2) se3;
        this.f18135u1 = lx2;
        ol3 K02 = mo3580K0();
        if (K02 != null) {
            mo3640y1(new C3358b(this, K02.mo23998o0(), lx2));
        }
    }

    /* renamed from: l1 */
    public void mo3619l1(xa0 xa0) {
        vx2.m53591g(xa0, "canvas");
        mo26433C1().mo3570B0(xa0);
        if (ze3.m31152a(mo3596X()).getShowLayoutBounds()) {
            mo3572C0(xa0, f18133w1);
        }
    }

    /* renamed from: t */
    public vo4 mo3544t(long j) {
        mo27280R(j);
        mo3623o1(this.f18134t1.mo3365e(this, mo26433C1(), j));
        lj4 J0 = mo3579J0();
        if (J0 != null) {
            J0.mo3932c(mo27275K());
        }
        mo3617j1();
        return this;
    }

    /* renamed from: y0 */
    public ol3 mo3639y0(sl3 sl3) {
        vx2.m53591g(sl3, "scope");
        lx2 lx2 = this.f18135u1;
        if (lx2 != null) {
            return new C3358b(this, sl3, lx2);
        }
        return new C3360c(this, sl3);
    }
}
