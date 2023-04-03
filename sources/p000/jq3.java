package p000;

import androidx.compose.p004ui.node.AlignmentLines;
import androidx.compose.p004ui.node.DepthSortedSet;
import androidx.compose.p004ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p000.nj4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010KJ'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0006J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0006J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0006J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0019\u001a\u00020\u00062\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017J\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010 \u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0002R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001b0/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R$\u00108\u001a\u0002032\u0006\u00104\u001a\u0002038F@BX\u000e¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090/8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u00101R!\u0010<\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u0016\u0010@\u001a\u0004\u0018\u00010=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u00020\u0006*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0018\u0010D\u001a\u00020\u0006*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010BR\u0018\u0010F\u001a\u00020\u0006*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010BR\u0011\u0010I\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bG\u0010H\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006L"}, mo44877d2 = {"Ljq3;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lmq0;", "constraints", "", "f", "(Landroidx/compose/ui/node/LayoutNode;Lmq0;)Z", "g", "Lr37;", "q", "c", "s", "t", "D", "(J)V", "forced", "w", "B", "u", "z", "y", "Lkotlin/Function0;", "onLayout", "n", "o", "Lnj4$b;", "listener", "r", "h", "forceDispatch", "d", "node", "p", "a", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/DepthSortedSet;", "b", "Landroidx/compose/ui/node/DepthSortedSet;", "relayoutNodes", "Z", "duringMeasureLayout", "Loh4;", "Loh4;", "onPositionedDispatcher", "Lv04;", "e", "Lv04;", "onLayoutCompletedListeners", "", "<set-?>", "J", "m", "()J", "measureIteration", "Ljq3$a;", "postponedMeasureRequests", "Lmq0;", "rootConstraints", "Ldf3;", "i", "Ldf3;", "consistencyChecker", "l", "(Landroidx/compose/ui/node/LayoutNode;)Z", "measureAffectsParent", "canAffectParent", "j", "canAffectParentInLookahead", "k", "()Z", "hasPendingMeasureOrLayout", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: jq3 */
/* compiled from: MeasureAndLayoutDelegate.kt */
public final class jq3 {

    /* renamed from: a */
    public final LayoutNode f13810a;

    /* renamed from: b */
    public final DepthSortedSet f13811b;

    /* renamed from: c */
    public boolean f13812c;

    /* renamed from: d */
    public final oh4 f13813d = new oh4();

    /* renamed from: e */
    public final v04<nj4.C2902b> f13814e = new v04<>(new nj4.C2902b[16], 0);

    /* renamed from: f */
    public long f13815f = 1;

    /* renamed from: g */
    public final v04<C2630a> f13816g;

    /* renamed from: h */
    public mq0 f13817h;

    /* renamed from: i */
    public final df3 f13818i;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\u0010"}, mo44877d2 = {"Ljq3$a;", "", "Landroidx/compose/ui/node/LayoutNode;", "a", "Landroidx/compose/ui/node/LayoutNode;", "()Landroidx/compose/ui/node/LayoutNode;", "node", "", "b", "Z", "c", "()Z", "isLookahead", "isForced", "<init>", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: jq3$a */
    /* compiled from: MeasureAndLayoutDelegate.kt */
    public static final class C2630a {

        /* renamed from: a */
        public final LayoutNode f13819a;

        /* renamed from: b */
        public final boolean f13820b;

        /* renamed from: c */
        public final boolean f13821c;

        public C2630a(LayoutNode layoutNode, boolean z, boolean z2) {
            vx2.m53591g(layoutNode, "node");
            this.f13819a = layoutNode;
            this.f13820b = z;
            this.f13821c = z2;
        }

        /* renamed from: a */
        public final LayoutNode mo22070a() {
            return this.f13819a;
        }

        /* renamed from: b */
        public final boolean mo22071b() {
            return this.f13821c;
        }

        /* renamed from: c */
        public final boolean mo22072c() {
            return this.f13820b;
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: jq3$b */
    /* compiled from: MeasureAndLayoutDelegate.kt */
    public /* synthetic */ class C2631b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13822a;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            f13822a = iArr;
        }
    }

    public jq3(LayoutNode layoutNode) {
        df3 df3;
        vx2.m53591g(layoutNode, "root");
        this.f13810a = layoutNode;
        nj4.C2901a aVar = nj4.f15566p;
        DepthSortedSet depthSortedSet = new DepthSortedSet(aVar.mo23706a());
        this.f13811b = depthSortedSet;
        v04<C2630a> v04 = new v04<>(new C2630a[16], 0);
        this.f13816g = v04;
        if (aVar.mo23706a()) {
            df3 = new df3(layoutNode, depthSortedSet, v04.mo26957h());
        } else {
            df3 = null;
        }
        this.f13818i = df3;
    }

    /* renamed from: A */
    public static /* synthetic */ boolean m20347A(jq3 jq3, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return jq3.mo22069z(layoutNode, z);
    }

    /* renamed from: C */
    public static /* synthetic */ boolean m20348C(jq3 jq3, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return jq3.mo22047B(layoutNode, z);
    }

    /* renamed from: e */
    public static /* synthetic */ void m20351e(jq3 jq3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        jq3.mo22050d(z);
    }

    /* renamed from: v */
    public static /* synthetic */ boolean m20352v(jq3 jq3, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return jq3.mo22066u(layoutNode, z);
    }

    /* renamed from: x */
    public static /* synthetic */ boolean m20353x(jq3 jq3, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return jq3.mo22067w(layoutNode, z);
    }

    /* renamed from: B */
    public final boolean mo22047B(LayoutNode layoutNode, boolean z) {
        boolean z2;
        vx2.m53591g(layoutNode, "layoutNode");
        int i = C2631b.f13822a[layoutNode.mo3402F().ordinal()];
        if (!(i == 1 || i == 2)) {
            if (i == 3 || i == 4) {
                this.f13816g.mo26953c(new C2630a(layoutNode, false, z));
                df3 df3 = this.f13818i;
                if (df3 != null) {
                    df3.mo18748a();
                }
            } else if (i != 5) {
                throw new NoWhenBranchMatchedException();
            } else if (!layoutNode.mo3414M() || z) {
                layoutNode.mo3473t0();
                if (layoutNode.mo3440a() || mo22054i(layoutNode)) {
                    LayoutNode V = layoutNode.mo3430V();
                    if (V == null || !V.mo3414M()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        this.f13811b.mo3384a(layoutNode);
                    }
                }
                if (!this.f13812c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    public final void mo22048D(long j) {
        boolean z;
        mq0 mq0 = this.f13817h;
        if (mq0 == null) {
            z = false;
        } else {
            z = mq0.m22474e(mq0.mo23282m(), j);
        }
        if (z) {
            return;
        }
        if (!this.f13812c) {
            this.f13817h = mq0.m22471b(j);
            this.f13810a.mo3473t0();
            this.f13811b.mo3384a(this.f13810a);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: c */
    public final void mo22049c() {
        v04<nj4.C2902b> v04 = this.f13814e;
        int n = v04.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = v04.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                ((nj4.C2902b) m[i]).mo3379b();
                i++;
            } while (i < n);
        }
        this.f13814e.mo26958i();
    }

    /* renamed from: d */
    public final void mo22050d(boolean z) {
        if (z) {
            this.f13813d.mo23955d(this.f13810a);
        }
        this.f13813d.mo23952a();
    }

    /* renamed from: f */
    public final boolean mo22051f(LayoutNode layoutNode, mq0 mq0) {
        boolean z;
        if (layoutNode.mo3411K() == null) {
            return false;
        }
        if (mq0 != null) {
            z = layoutNode.mo3463n0(mq0);
        } else {
            z = LayoutNode.m2549o0(layoutNode, (mq0) null, 1, (Object) null);
        }
        LayoutNode V = layoutNode.mo3430V();
        if (z && V != null) {
            if (V.mo3411K() == null) {
                m20348C(this, V, false, 2, (Object) null);
            } else if (layoutNode.mo3419P() == LayoutNode.UsageByParent.InMeasureBlock) {
                m20353x(this, V, false, 2, (Object) null);
            } else if (layoutNode.mo3419P() == LayoutNode.UsageByParent.InLayoutBlock) {
                m20352v(this, V, false, 2, (Object) null);
            }
        }
        return z;
    }

    /* renamed from: g */
    public final boolean mo22052g(LayoutNode layoutNode, mq0 mq0) {
        boolean z;
        if (mq0 != null) {
            z = layoutNode.mo3400D0(mq0);
        } else {
            z = LayoutNode.m2538E0(layoutNode, (mq0) null, 1, (Object) null);
        }
        LayoutNode V = layoutNode.mo3430V();
        if (z && V != null) {
            if (layoutNode.mo3417O() == LayoutNode.UsageByParent.InMeasureBlock) {
                m20348C(this, V, false, 2, (Object) null);
            } else if (layoutNode.mo3417O() == LayoutNode.UsageByParent.InLayoutBlock) {
                m20347A(this, V, false, 2, (Object) null);
            }
        }
        return z;
    }

    /* renamed from: h */
    public final void mo22053h(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "layoutNode");
        if (!this.f13811b.mo3387d()) {
            if (!this.f13812c) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!layoutNode.mo3414M()) {
                v04<LayoutNode> b0 = layoutNode.mo3443b0();
                int n = b0.mo26963n();
                if (n > 0) {
                    int i = 0;
                    Object[] m = b0.mo26962m();
                    vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        LayoutNode layoutNode2 = (LayoutNode) m[i];
                        if (layoutNode2.mo3414M() && this.f13811b.mo3389f(layoutNode2)) {
                            mo22064s(layoutNode2);
                        }
                        if (!layoutNode2.mo3414M()) {
                            mo22053h(layoutNode2);
                        }
                        i++;
                    } while (i < n);
                }
                if (layoutNode.mo3414M() && this.f13811b.mo3389f(layoutNode)) {
                    mo22064s(layoutNode);
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    /* renamed from: i */
    public final boolean mo22054i(LayoutNode layoutNode) {
        if (!layoutNode.mo3414M() || !mo22057l(layoutNode)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo22055j(LayoutNode layoutNode) {
        boolean z;
        AlignmentLines b;
        if (layoutNode.mo3404G()) {
            if (layoutNode.mo3419P() == LayoutNode.UsageByParent.InMeasureBlock) {
                return true;
            }
            C2164df t = layoutNode.mo3399D().mo3512t();
            if (t == null || (b = t.mo3529b()) == null || !b.mo3338k()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo22056k() {
        return !this.f13811b.mo3387d();
    }

    /* renamed from: l */
    public final boolean mo22057l(LayoutNode layoutNode) {
        if (layoutNode.mo3417O() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.mo3399D().mo3504l().mo3529b().mo3338k()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final long mo22058m() {
        if (this.f13812c) {
            return this.f13815f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: n */
    public final boolean mo22059n(pc2<r37> pc2) {
        boolean z;
        if (!this.f13810a.mo3459l0()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f13810a.mo3440a()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f13812c) {
            boolean z2 = false;
            if (this.f13817h != null) {
                this.f13812c = true;
                try {
                    if (!this.f13811b.mo3387d()) {
                        DepthSortedSet depthSortedSet = this.f13811b;
                        z = false;
                        while (!depthSortedSet.mo3387d()) {
                            LayoutNode e = depthSortedSet.mo3388e();
                            boolean b = mo22064s(e);
                            if (e == this.f13810a && b) {
                                z = true;
                            }
                        }
                        if (pc2 != null) {
                            pc2.invoke();
                        }
                    } else {
                        z = false;
                    }
                    this.f13812c = false;
                    df3 df3 = this.f13818i;
                    if (df3 != null) {
                        df3.mo18748a();
                    }
                    z2 = z;
                } catch (Throwable th) {
                    this.f13812c = false;
                    throw th;
                }
            }
            mo22049c();
            return z2;
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: o */
    public final void mo22060o() {
        if (!this.f13810a.mo3459l0()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f13810a.mo3440a()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!this.f13812c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (this.f13817h != null) {
            this.f13812c = true;
            try {
                mo22062q(this.f13810a);
                this.f13812c = false;
                df3 df3 = this.f13818i;
                if (df3 != null) {
                    df3.mo18748a();
                }
            } catch (Throwable th) {
                this.f13812c = false;
                throw th;
            }
        }
    }

    /* renamed from: p */
    public final void mo22061p(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "node");
        this.f13811b.mo3389f(layoutNode);
    }

    /* renamed from: q */
    public final void mo22062q(LayoutNode layoutNode) {
        mo22065t(layoutNode);
        v04<LayoutNode> b0 = layoutNode.mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode2 = (LayoutNode) m[i];
                if (mo22057l(layoutNode2)) {
                    mo22062q(layoutNode2);
                }
                i++;
            } while (i < n);
        }
        mo22065t(layoutNode);
    }

    /* renamed from: r */
    public final void mo22063r(nj4.C2902b bVar) {
        vx2.m53591g(bVar, "listener");
        this.f13814e.mo26953c(bVar);
    }

    /* renamed from: s */
    public final boolean mo22064s(LayoutNode layoutNode) {
        boolean z;
        boolean z2;
        mq0 mq0;
        int i = 0;
        if (!layoutNode.mo3440a() && !mo22054i(layoutNode) && !vx2.m53586b(layoutNode.mo3461m0(), Boolean.TRUE) && !mo22055j(layoutNode) && !layoutNode.mo3470s()) {
            return false;
        }
        if (layoutNode.mo3406H() || layoutNode.mo3414M()) {
            if (layoutNode == this.f13810a) {
                mq0 = this.f13817h;
                vx2.m53588d(mq0);
            } else {
                mq0 = null;
            }
            if (layoutNode.mo3406H()) {
                z = mo22051f(layoutNode, mq0);
            } else {
                z = false;
            }
            z2 = mo22052g(layoutNode, mq0);
        } else {
            z2 = false;
            z = false;
        }
        if ((z || layoutNode.mo3404G()) && vx2.m53586b(layoutNode.mo3461m0(), Boolean.TRUE)) {
            layoutNode.mo3465p0();
        }
        if (layoutNode.mo3401E() && layoutNode.mo3440a()) {
            if (layoutNode == this.f13810a) {
                layoutNode.mo3396B0(0, 0);
            } else {
                layoutNode.mo3407H0();
            }
            this.f13813d.mo23954c(layoutNode);
            df3 df3 = this.f13818i;
            if (df3 != null) {
                df3.mo18748a();
            }
        }
        if (this.f13816g.mo26966r()) {
            v04<C2630a> v04 = this.f13816g;
            int n = v04.mo26963n();
            if (n > 0) {
                Object[] m = v04.mo26962m();
                vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    C2630a aVar = (C2630a) m[i];
                    if (aVar.mo22070a().mo3459l0()) {
                        if (!aVar.mo22072c()) {
                            mo22047B(aVar.mo22070a(), aVar.mo22071b());
                        } else {
                            mo22067w(aVar.mo22070a(), aVar.mo22071b());
                        }
                    }
                    i++;
                } while (i < n);
            }
            this.f13816g.mo26958i();
        }
        return z2;
    }

    /* renamed from: t */
    public final void mo22065t(LayoutNode layoutNode) {
        mq0 mq0;
        if (layoutNode.mo3414M() || layoutNode.mo3406H()) {
            if (layoutNode == this.f13810a) {
                mq0 = this.f13817h;
                vx2.m53588d(mq0);
            } else {
                mq0 = null;
            }
            if (layoutNode.mo3406H()) {
                mo22051f(layoutNode, mq0);
            }
            mo22052g(layoutNode, mq0);
        }
    }

    /* renamed from: u */
    public final boolean mo22066u(LayoutNode layoutNode, boolean z) {
        boolean z2;
        boolean z3;
        vx2.m53591g(layoutNode, "layoutNode");
        int i = C2631b.f13822a[layoutNode.mo3402F().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (!(i == 4 || i == 5)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.mo3406H() || layoutNode.mo3404G()) && !z) {
                df3 df3 = this.f13818i;
                if (df3 != null) {
                    df3.mo18748a();
                }
                return false;
            }
            layoutNode.mo3469r0();
            layoutNode.mo3467q0();
            if (vx2.m53586b(layoutNode.mo3461m0(), Boolean.TRUE)) {
                LayoutNode V = layoutNode.mo3430V();
                if (V == null || !V.mo3406H()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    if (V == null || !V.mo3404G()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        this.f13811b.mo3384a(layoutNode);
                    }
                }
            }
            if (!this.f13812c) {
                return true;
            }
            return false;
        }
        df3 df32 = this.f13818i;
        if (df32 != null) {
            df32.mo18748a();
        }
        return false;
    }

    /* renamed from: w */
    public final boolean mo22067w(LayoutNode layoutNode, boolean z) {
        boolean z2;
        boolean z3;
        vx2.m53591g(layoutNode, "layoutNode");
        if (layoutNode.mo3411K() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i = C2631b.f13822a[layoutNode.mo3402F().ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    this.f13816g.mo26953c(new C2630a(layoutNode, true, z));
                    df3 df3 = this.f13818i;
                    if (df3 != null) {
                        df3.mo18748a();
                    }
                } else if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                } else if (!layoutNode.mo3406H() || z) {
                    layoutNode.mo3471s0();
                    layoutNode.mo3473t0();
                    if (vx2.m53586b(layoutNode.mo3461m0(), Boolean.TRUE) || mo22055j(layoutNode)) {
                        LayoutNode V = layoutNode.mo3430V();
                        if (V == null || !V.mo3406H()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            this.f13811b.mo3384a(layoutNode);
                        }
                    }
                    if (!this.f13812c) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }

    /* renamed from: y */
    public final void mo22068y(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "layoutNode");
        this.f13813d.mo23954c(layoutNode);
    }

    /* renamed from: z */
    public final boolean mo22069z(LayoutNode layoutNode, boolean z) {
        boolean z2;
        boolean z3;
        vx2.m53591g(layoutNode, "layoutNode");
        int i = C2631b.f13822a[layoutNode.mo3402F().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            df3 df3 = this.f13818i;
            if (df3 != null) {
                df3.mo18748a();
            }
        } else if (i != 5) {
            throw new NoWhenBranchMatchedException();
        } else if (z || (!layoutNode.mo3414M() && !layoutNode.mo3401E())) {
            layoutNode.mo3467q0();
            if (layoutNode.mo3440a()) {
                LayoutNode V = layoutNode.mo3430V();
                if (V == null || !V.mo3401E()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    if (V == null || !V.mo3414M()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        this.f13811b.mo3384a(layoutNode);
                    }
                }
            }
            if (!this.f13812c) {
                return true;
            }
        } else {
            df3 df32 = this.f13818i;
            if (df32 != null) {
                df32.mo18748a();
            }
        }
        return false;
    }
}
