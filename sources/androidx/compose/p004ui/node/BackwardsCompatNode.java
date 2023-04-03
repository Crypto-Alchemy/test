package androidx.compose.p004ui.node;

import androidx.compose.p004ui.input.pointer.PointerEventPass;
import androidx.compose.p004ui.platform.InspectableValueKt;
import java.util.HashSet;
import kotlin.Metadata;
import p000.nj4;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\rB\u000f\u0012\u0006\u0010\u001c\u001a\u00020B¢\u0006\u0004\bs\u0010IJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u000eJ\u0012\u0010\u001d\u001a\u00020\u000e2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bJ)\u0010$\u001a\u00020#*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\f\u0010'\u001a\u00020\u000e*\u00020&H\u0016J-\u0010.\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\b\u00100\u001a\u00020\u000eH\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\b\u00102\u001a\u00020\u0010H\u0016J\u0018\u00106\u001a\u0004\u0018\u000104*\u0002032\b\u00105\u001a\u0004\u0018\u000104H\u0016J\u0010\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u000207H\u0016J\u0010\u0010;\u001a\u00020\u000e2\u0006\u00108\u001a\u00020:H\u0016J\u001d\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020,H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u000e2\u0006\u00108\u001a\u000207H\u0016J\b\u0010A\u001a\u00020@H\u0016R*\u0010\u001c\u001a\u00020B2\u0006\u0010C\u001a\u00020B8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR:\u0010]\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030U0Tj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030U`V8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8VX\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR$\u0010h\u001a\u00028\u0000\"\u0004\b\u0000\u0010e*\b\u0012\u0004\u0012\u00028\u00000U8VX\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR-\u0010n\u001a\u00020,2\u0006\u0010C\u001a\u00020,8V@VX\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010>R\u0014\u0010r\u001a\u00020o8VX\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006t"}, mo44877d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "Lse3;", "Llx2;", "Ldj1;", "Lyt5;", "Lvr4;", "Lyw3;", "Lbx3;", "Ldm4;", "Lke3;", "Lgh2;", "Loj4;", "La50;", "Lsw3$c;", "Lr37;", "O", "", "duringAttach", "L", "P", "z", "A", "o", "M", "()V", "R", "Q", "Lax3;", "element", "S", "Loq3;", "Liq3;", "measurable", "Lmq0;", "constraints", "Lmq3;", "e", "(Loq3;Liq3;J)Lmq3;", "Lqr0;", "g", "Lfr4;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lsw2;", "bounds", "m", "(Lfr4;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "n", "q", "i", "Ldc1;", "", "parentData", "b", "Lme3;", "coordinates", "c", "Lpl3;", "p", "size", "a", "(J)V", "d", "", "toString", "Lsw3$b;", "value", "x", "Lsw3$b;", "J", "()Lsw3$b;", "N", "(Lsw3$b;)V", "y", "Z", "invalidateCache", "Lt62;", "Lt62;", "focusOrderElement", "Lbx;", "B", "Lbx;", "_providedValues", "Ljava/util/HashSet;", "Luw3;", "Lkotlin/collections/HashSet;", "C", "Ljava/util/HashSet;", "K", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "readValues", "H", "Lme3;", "lastOnPlacedCoordinates", "Lxw3;", "j", "()Lxw3;", "providedValues", "T", "k", "(Luw3;)Ljava/lang/Object;", "current", "isValid", "()Z", "getTargetSize-YbymL2g", "()J", "f", "targetSize", "Lvt5;", "h", "()Lvt5;", "semanticsConfiguration", "<init>", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.BackwardsCompatNode */
/* compiled from: BackwardsCompatNode.kt */
public final class BackwardsCompatNode extends sw3.C3310c implements se3, lx2, dj1, yt5, vr4, yw3, bx3, dm4, ke3, gh2, oj4, a50 {

    /* renamed from: A */
    public t62 f1725A;

    /* renamed from: B */
    public C1658bx f1726B;

    /* renamed from: C */
    public HashSet<uw3<?>> f1727C = new HashSet<>();

    /* renamed from: H */
    public me3 f1728H;

    /* renamed from: x */
    public sw3.C3309b f1729x;

    /* renamed from: y */
    public boolean f1730y = true;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"androidx/compose/ui/node/BackwardsCompatNode$a", "Lnj4$b;", "Lr37;", "b", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.BackwardsCompatNode$a */
    /* compiled from: BackwardsCompatNode.kt */
    public static final class C0372a implements nj4.C2902b {

        /* renamed from: a */
        public final /* synthetic */ BackwardsCompatNode f1731a;

        public C0372a(BackwardsCompatNode backwardsCompatNode) {
            this.f1731a = backwardsCompatNode;
        }

        /* renamed from: b */
        public void mo3379b() {
            if (this.f1731a.f1728H == null) {
                BackwardsCompatNode backwardsCompatNode = this.f1731a;
                backwardsCompatNode.mo3364d(ob1.m23743e(backwardsCompatNode, g84.f12195a.mo20430f()));
            }
        }
    }

    public BackwardsCompatNode(sw3.C3309b bVar) {
        vx2.m53591g(bVar, "element");
        mo25979D(d84.m14844a(bVar));
        this.f1729x = bVar;
    }

    /* renamed from: A */
    public void mo3350A() {
        mo3356O();
    }

    /* renamed from: J */
    public final sw3.C3309b mo3351J() {
        return this.f1729x;
    }

    /* renamed from: K */
    public final HashSet<uw3<?>> mo3352K() {
        return this.f1727C;
    }

    /* renamed from: L */
    public final void mo3353L(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        rc2 rc2;
        if (mo25990y()) {
            sw3.C3309b bVar = this.f1729x;
            g84 g84 = g84.f12195a;
            boolean z8 = false;
            if ((g84.mo20431g() & mo25988w()) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (bVar instanceof ax3) {
                    mo3360S((ax3) bVar);
                }
                if (bVar instanceof vw3) {
                    if (z) {
                        mo3359R();
                    } else {
                        mo25981F(new BackwardsCompatNode$initializeModifier$1(this));
                    }
                }
                if (bVar instanceof p62) {
                    r62 r62 = new r62((p62) bVar);
                    if (InspectableValueKt.m3089c()) {
                        rc2 = new C0373x5394e4af(r62);
                    } else {
                        rc2 = InspectableValueKt.m3087a();
                    }
                    t62 t62 = new t62(r62, rc2);
                    this.f1725A = t62;
                    vx2.m53588d(t62);
                    mo3360S(t62);
                    if (z) {
                        mo3358Q();
                    } else {
                        mo25981F(new BackwardsCompatNode$initializeModifier$3(this));
                    }
                }
            }
            if ((g84.mo20426b() & mo25988w()) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (bVar instanceof yi1) {
                    this.f1730y = true;
                }
                ve3.m28759a(this);
            }
            if ((g84.mo20429e() & mo25988w()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (ob1.m23744f(this).mo3424S().mo28352o().mo25990y()) {
                    NodeCoordinator v = mo25987v();
                    vx2.m53588d(v);
                    ((te3) v).mo26434D1(this);
                    v.mo3615h1();
                }
                ve3.m28759a(this);
                ob1.m23744f(this).mo3455j0();
            }
            if (bVar instanceof lc5) {
                ((lc5) bVar).mo22718m(this);
            }
            if ((g84.mo20430f() & mo25988w()) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if ((bVar instanceof rh4) && ob1.m23744f(this).mo3424S().mo28352o().mo25990y()) {
                    ob1.m23744f(this).mo3455j0();
                }
                if (bVar instanceof nh4) {
                    this.f1728H = null;
                    if (ob1.m23744f(this).mo3424S().mo28352o().mo25990y()) {
                        ob1.m23745g(this).mo3768i(new C0372a(this));
                    }
                }
            }
            if ((g84.mo20427c() & mo25988w()) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 && (bVar instanceof ih4) && ob1.m23744f(this).mo3424S().mo28352o().mo25990y()) {
                ob1.m23744f(this).mo3455j0();
            }
            if ((g84.mo20433i() & mo25988w()) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7 || !(bVar instanceof ur4)) {
                if ((g84.mo20434j() & mo25988w()) != 0) {
                    z8 = true;
                }
                if (z8) {
                    ob1.m23745g(this).mo3802u();
                    return;
                }
                return;
            }
            ((ur4) bVar).mo26849p();
            mo25987v();
            throw null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: M */
    public final void mo3354M() {
        this.f1730y = true;
        ej1.m16116a(this);
    }

    /* renamed from: N */
    public final void mo3355N(sw3.C3309b bVar) {
        vx2.m53591g(bVar, "value");
        if (mo25990y()) {
            mo3356O();
        }
        this.f1729x = bVar;
        mo25979D(d84.m14844a(bVar));
        if (mo25990y()) {
            mo3353L(false);
        }
    }

    /* renamed from: O */
    public final void mo3356O() {
        boolean z;
        t62 t62;
        if (mo25990y()) {
            sw3.C3309b bVar = this.f1729x;
            g84 g84 = g84.f12195a;
            boolean z2 = true;
            if ((g84.mo20431g() & mo25988w()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (bVar instanceof ax3) {
                    ob1.m23745g(this).getModifierLocalManager().mo3327d(this, ((ax3) bVar).getKey());
                }
                if (bVar instanceof vw3) {
                    ((vw3) bVar).mo3222i(BackwardsCompatNodeKt.f1732a);
                }
                if ((bVar instanceof p62) && (t62 = this.f1725A) != null) {
                    ob1.m23745g(this).getModifierLocalManager().mo3327d(this, t62.getKey());
                }
            }
            if ((g84.mo20434j() & mo25988w()) == 0) {
                z2 = false;
            }
            if (z2) {
                ob1.m23745g(this).mo3802u();
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: P */
    public final void mo3357P() {
        sw3.C3309b bVar = this.f1729x;
        if (bVar instanceof yi1) {
            ob1.m23745g(this).getSnapshotObserver().mo3657h(this, BackwardsCompatNodeKt.f1733b, new BackwardsCompatNode$updateDrawCache$1(bVar, this));
        }
        this.f1730y = false;
    }

    /* renamed from: Q */
    public final void mo3358Q() {
        if (mo25990y()) {
            ob1.m23745g(this).getSnapshotObserver().mo3657h(this, BackwardsCompatNodeKt.f1735d, new BackwardsCompatNode$updateFocusOrderModifierLocalConsumer$1(this));
        }
    }

    /* renamed from: R */
    public final void mo3359R() {
        if (mo25990y()) {
            this.f1727C.clear();
            ob1.m23745g(this).getSnapshotObserver().mo3657h(this, BackwardsCompatNodeKt.f1734c, new BackwardsCompatNode$updateModifierLocalConsumer$1(this));
        }
    }

    /* renamed from: S */
    public final void mo3360S(ax3<?> ax3) {
        vx2.m53591g(ax3, "element");
        C1658bx bxVar = this.f1726B;
        if (bxVar == null || !bxVar.mo11920a(ax3.getKey())) {
            this.f1726B = new C1658bx(ax3);
            if (ob1.m23744f(this).mo3424S().mo28352o().mo25990y()) {
                ob1.m23745g(this).getModifierLocalManager().mo3324a(this, ax3.getKey());
                return;
            }
            return;
        }
        bxVar.mo11922c(ax3);
        ob1.m23745g(this).getModifierLocalManager().mo3329f(this, ax3.getKey());
    }

    /* renamed from: a */
    public void mo3361a(long j) {
        sw3.C3309b bVar = this.f1729x;
        if (bVar instanceof rh4) {
            ((rh4) bVar).mo25385a(j);
        }
    }

    /* renamed from: b */
    public Object mo3362b(dc1 dc1, Object obj) {
        vx2.m53591g(dc1, "<this>");
        sw3.C3309b bVar = this.f1729x;
        vx2.m53589e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((cm4) bVar).mo12123b(dc1, obj);
    }

    /* renamed from: c */
    public void mo3363c(me3 me3) {
        vx2.m53591g(me3, "coordinates");
        sw3.C3309b bVar = this.f1729x;
        vx2.m53589e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((ih4) bVar).mo21540c(me3);
    }

    /* renamed from: d */
    public void mo3364d(me3 me3) {
        vx2.m53591g(me3, "coordinates");
        this.f1728H = me3;
        sw3.C3309b bVar = this.f1729x;
        if (bVar instanceof nh4) {
            ((nh4) bVar).mo3219d(me3);
        }
    }

    /* renamed from: e */
    public mq3 mo3365e(oq3 oq3, iq3 iq3, long j) {
        vx2.m53591g(oq3, "$this$measure");
        vx2.m53591g(iq3, "measurable");
        sw3.C3309b bVar = this.f1729x;
        vx2.m53589e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((re3) bVar).mo25360e(oq3, iq3, j);
    }

    /* renamed from: f */
    public void mo3366f(long j) {
        sw3.C3309b bVar = this.f1729x;
        vx2.m53589e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        ((kx2) bVar).mo22546f(j);
    }

    /* renamed from: g */
    public void mo3367g(qr0 qr0) {
        vx2.m53591g(qr0, "<this>");
        sw3.C3309b bVar = this.f1729x;
        vx2.m53589e(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        cj1 cj1 = (cj1) bVar;
        if (this.f1730y && (bVar instanceof yi1)) {
            mo3357P();
        }
        cj1.mo12068g(qr0);
    }

    /* renamed from: h */
    public vt5 mo3368h() {
        sw3.C3309b bVar = this.f1729x;
        vx2.m53589e(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((wt5) bVar).mo27600h();
    }

    /* renamed from: i */
    public boolean mo3369i() {
        sw3.C3309b bVar = this.f1729x;
        vx2.m53589e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((ur4) bVar).mo26849p();
        throw null;
    }

    public boolean isValid() {
        return mo25990y();
    }

    /* renamed from: j */
    public xw3 mo3370j() {
        C1658bx bxVar = this.f1726B;
        if (bxVar != null) {
            return bxVar;
        }
        return zw3.m31555a();
    }

    /* renamed from: k */
    public <T> T mo3371k(uw3<T> uw3) {
        z74 S;
        vx2.m53591g(uw3, "<this>");
        this.f1727C.add(uw3);
        int g = g84.f12195a.mo20431g();
        if (mo23638l().mo25990y()) {
            sw3.C3310c x = mo23638l().mo25989x();
            LayoutNode f = ob1.m23744f(this);
            while (f != null) {
                if ((f.mo3424S().mo28349l().mo25985t() & g) != 0) {
                    while (x != null) {
                        if ((x.mo25988w() & g) != 0 && (x instanceof yw3)) {
                            yw3 yw3 = (yw3) x;
                            if (yw3.mo3370j().mo11920a(uw3)) {
                                return yw3.mo3370j().mo11921b(uw3);
                            }
                        }
                        x = x.mo25989x();
                    }
                }
                f = f.mo3430V();
                if (f == null || (S = f.mo3424S()) == null) {
                    x = null;
                } else {
                    x = S.mo28352o();
                }
            }
            return uw3.mo26884a().invoke();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: m */
    public void mo3372m(fr4 fr4, PointerEventPass pointerEventPass, long j) {
        vx2.m53591g(fr4, "pointerEvent");
        vx2.m53591g(pointerEventPass, "pass");
        sw3.C3309b bVar = this.f1729x;
        vx2.m53589e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((ur4) bVar).mo26849p();
        throw null;
    }

    /* renamed from: n */
    public void mo3373n() {
        sw3.C3309b bVar = this.f1729x;
        vx2.m53589e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((ur4) bVar).mo26849p();
        throw null;
    }

    /* renamed from: o */
    public void mo3374o() {
        this.f1730y = true;
        ej1.m16116a(this);
    }

    /* renamed from: p */
    public void mo3375p(pl3 pl3) {
        vx2.m53591g(pl3, "coordinates");
        sw3.C3309b bVar = this.f1729x;
        if (bVar instanceof rl3) {
            ((rl3) bVar).mo25451q(pl3);
        }
    }

    /* renamed from: q */
    public boolean mo3376q() {
        sw3.C3309b bVar = this.f1729x;
        vx2.m53589e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((ur4) bVar).mo26849p();
        throw null;
    }

    public String toString() {
        return this.f1729x.toString();
    }

    /* renamed from: z */
    public void mo3378z() {
        mo3353L(true);
    }
}
