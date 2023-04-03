package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.input.key.KeyInputModifierKt;
import androidx.compose.p004ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.p004ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 z2\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001{B%\u0012\u0006\u0010t\u001a\u00020\u001d\u0012\u0014\b\u0002\u0010w\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\b0u¢\u0006\u0004\bx\u0010yJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R$\u0010\u0016\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR*\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010)\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00106\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001028\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u001a\u00103\u0012\u0004\b4\u00105R\"\u0010<\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010B\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010>\u001a\u0004\b+\u0010?\"\u0004\b@\u0010AR$\u0010J\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0017\u0010O\u001a\u00020K8\u0006¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010NR$\u0010W\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010^\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010e\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR(\u0010k\u001a\u0004\u0018\u00010f2\b\u0010g\u001a\u0004\u0018\u00010f8\u0006@BX\u000e¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bD\u0010jR\u001d\u0010n\u001a\b\u0012\u0004\u0012\u00020f0\u00178\u0006¢\u0006\f\n\u0004\bl\u0010\u0019\u001a\u0004\bm\u0010\u001bR\u0014\u0010o\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\bo\u0010bR\u001c\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000p8VX\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010\u001e\u001a\u00020\u00008VX\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0013¨\u0006|"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Lvw3;", "Lax3;", "Loj4;", "Lnh4;", "Ltv2;", "Lbx3;", "scope", "Lr37;", "i", "Lvh5;", "event", "", "D", "Lme3;", "coordinates", "d", "Landroidx/compose/ui/focus/FocusModifier;", "B", "()Landroidx/compose/ui/focus/FocusModifier;", "setParent", "(Landroidx/compose/ui/focus/FocusModifier;)V", "parent", "Lv04;", "e", "Lv04;", "s", "()Lv04;", "children", "Landroidx/compose/ui/focus/FocusStateImpl;", "value", "g", "Landroidx/compose/ui/focus/FocusStateImpl;", "x", "()Landroidx/compose/ui/focus/FocusStateImpl;", "F", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "focusState", "k", "y", "G", "focusedChild", "Lk62;", "r", "Lk62;", "u", "()Lk62;", "setFocusEventListener", "(Lk62;)V", "focusEventListener", "Lh62;", "Lh62;", "getRotaryScrollParent$annotations", "()V", "rotaryScrollParent", "Lbx3;", "getModifierLocalReadScope", "()Lbx3;", "H", "(Lbx3;)V", "modifierLocalReadScope", "Lz00;", "Lz00;", "()Lz00;", "setBeyondBoundsLayoutParent", "(Lz00;)V", "beyondBoundsLayoutParent", "Lt62;", "A", "Lt62;", "w", "()Lt62;", "setFocusPropertiesModifier", "(Lt62;)V", "focusPropertiesModifier", "Ls62;", "Ls62;", "v", "()Ls62;", "focusProperties", "Lu62;", "C", "Lu62;", "getFocusRequester", "()Lu62;", "setFocusRequester", "(Lu62;)V", "focusRequester", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "t", "()Landroidx/compose/ui/node/NodeCoordinator;", "setCoordinator", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "coordinator", "I", "Z", "getFocusRequestedOnPlaced", "()Z", "E", "(Z)V", "focusRequestedOnPlaced", "Lqa3;", "<set-?>", "L", "Lqa3;", "()Lqa3;", "keyInputModifier", "M", "z", "keyInputChildren", "isValid", "Liy4;", "getKey", "()Liy4;", "key", "initialFocus", "Lkotlin/Function1;", "Lsv2;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/focus/FocusStateImpl;Lrc2;)V", "P", "a", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.focus.FocusModifier */
/* compiled from: FocusModifier.kt */
public final class FocusModifier extends tv2 implements vw3, ax3<FocusModifier>, oj4, nh4 {

    /* renamed from: P */
    public static final C0354a f1620P = new C0354a((DefaultConstructorMarker) null);

    /* renamed from: Q */
    public static final rc2<FocusModifier, r37> f1621Q = FocusModifier$Companion$RefreshFocusProperties$1.INSTANCE;

    /* renamed from: A */
    public t62 f1622A;

    /* renamed from: B */
    public final s62 f1623B;

    /* renamed from: C */
    public u62 f1624C;

    /* renamed from: H */
    public NodeCoordinator f1625H;

    /* renamed from: I */
    public boolean f1626I;

    /* renamed from: L */
    public qa3 f1627L;

    /* renamed from: M */
    public final v04<qa3> f1628M;

    /* renamed from: d */
    public FocusModifier f1629d;

    /* renamed from: e */
    public final v04<FocusModifier> f1630e;

    /* renamed from: g */
    public FocusStateImpl f1631g;

    /* renamed from: k */
    public FocusModifier f1632k;

    /* renamed from: r */
    public k62 f1633r;

    /* renamed from: s */
    public h62<vh5> f1634s;

    /* renamed from: x */
    public bx3 f1635x;

    /* renamed from: y */
    public z00 f1636y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusModifier$a;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusModifier;", "Lr37;", "RefreshFocusProperties", "Lrc2;", "a", "()Lrc2;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.focus.FocusModifier$a */
    /* compiled from: FocusModifier.kt */
    public static final class C0354a {
        public C0354a() {
        }

        public /* synthetic */ C0354a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final rc2<FocusModifier, r37> mo3233a() {
            return FocusModifier.f1621Q;
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusModifier$b */
    /* compiled from: FocusModifier.kt */
    public /* synthetic */ class C0355b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1637a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f1637a = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FocusModifier(FocusStateImpl focusStateImpl, rc2<sv2, r37> rc2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(focusStateImpl, (i & 2) != 0 ? InspectableValueKt.m3087a() : rc2);
    }

    /* renamed from: A */
    public final qa3 mo3211A() {
        return this.f1627L;
    }

    /* renamed from: B */
    public final FocusModifier mo3212B() {
        return this.f1629d;
    }

    /* renamed from: C */
    public FocusModifier getValue() {
        return this;
    }

    /* renamed from: D */
    public final boolean mo3214D(vh5 vh5) {
        vx2.m53591g(vh5, "event");
        h62<vh5> h62 = this.f1634s;
        if (h62 != null) {
            return h62.mo20965s(vh5);
        }
        return false;
    }

    /* renamed from: E */
    public final void mo3215E(boolean z) {
        this.f1626I = z;
    }

    /* renamed from: F */
    public final void mo3216F(FocusStateImpl focusStateImpl) {
        vx2.m53591g(focusStateImpl, "value");
        this.f1631g = focusStateImpl;
        FocusTransactionsKt.m2398k(this);
    }

    /* renamed from: G */
    public final void mo3217G(FocusModifier focusModifier) {
        this.f1632k = focusModifier;
    }

    /* renamed from: H */
    public final void mo3218H(bx3 bx3) {
        vx2.m53591g(bx3, "<set-?>");
        this.f1635x = bx3;
    }

    /* renamed from: d */
    public void mo3219d(me3 me3) {
        boolean z;
        vx2.m53591g(me3, "coordinates");
        if (this.f1625H == null) {
            z = true;
        } else {
            z = false;
        }
        this.f1625H = (NodeCoordinator) me3;
        if (z) {
            FocusPropertiesKt.m2377c(this);
        }
        if (this.f1626I) {
            this.f1626I = false;
            FocusTransactionsKt.m2395h(this);
        }
    }

    public iy4<FocusModifier> getKey() {
        return FocusModifierKt.m2340b();
    }

    /* renamed from: i */
    public void mo3222i(bx3 bx3) {
        v04<FocusModifier> v04;
        v04<FocusModifier> v042;
        NodeCoordinator nodeCoordinator;
        LayoutNode X;
        nj4 U;
        m62 focusManager;
        vx2.m53591g(bx3, "scope");
        mo3218H(bx3);
        FocusModifier focusModifier = (FocusModifier) bx3.mo3371k(FocusModifierKt.m2340b());
        if (!vx2.m53586b(focusModifier, this.f1629d)) {
            if (focusModifier == null) {
                int i = C0355b.f1637a[this.f1631g.ordinal()];
                if (!((i != 1 && i != 2) || (nodeCoordinator = this.f1625H) == null || (X = nodeCoordinator.mo3596X()) == null || (U = X.mo3428U()) == null || (focusManager = U.getFocusManager()) == null)) {
                    focusManager.mo3201b(true);
                }
            }
            FocusModifier focusModifier2 = this.f1629d;
            if (!(focusModifier2 == null || (v042 = focusModifier2.f1630e) == null)) {
                v042.mo26968t(this);
            }
            if (!(focusModifier == null || (v04 = focusModifier.f1630e) == null)) {
                v04.mo26953c(this);
            }
        }
        this.f1629d = focusModifier;
        k62 k62 = (k62) bx3.mo3371k(FocusEventModifierKt.m2304a());
        if (!vx2.m53586b(k62, this.f1633r)) {
            k62 k622 = this.f1633r;
            if (k622 != null) {
                k622.mo22194u(this);
            }
            if (k62 != null) {
                k62.mo22190q(this);
            }
        }
        this.f1633r = k62;
        u62 u62 = (u62) bx3.mo3371k(FocusRequesterModifierKt.m2386a());
        if (!vx2.m53586b(u62, this.f1624C)) {
            u62 u622 = this.f1624C;
            if (u622 != null) {
                u622.mo26662u(this);
            }
            if (u62 != null) {
                u62.mo26658q(this);
            }
        }
        this.f1624C = u62;
        this.f1634s = (h62) bx3.mo3371k(RotaryInputModifierKt.m2461b());
        this.f1636y = (z00) bx3.mo3371k(BeyondBoundsLayoutKt.m2464a());
        this.f1627L = (qa3) bx3.mo3371k(KeyInputModifierKt.m2458a());
        this.f1622A = (t62) bx3.mo3371k(FocusPropertiesKt.m2376b());
        FocusPropertiesKt.m2377c(this);
    }

    public boolean isValid() {
        if (this.f1629d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public /* synthetic */ sw3 mo3193k(sw3 sw3) {
        return rw3.m26445a(this, sw3);
    }

    /* renamed from: l */
    public /* synthetic */ boolean mo3194l(rc2 rc2) {
        return tw3.m27950a(this, rc2);
    }

    /* renamed from: n */
    public /* synthetic */ Object mo3195n(Object obj, fd2 fd2) {
        return tw3.m27951b(this, obj, fd2);
    }

    /* renamed from: r */
    public final z00 mo3224r() {
        return this.f1636y;
    }

    /* renamed from: s */
    public final v04<FocusModifier> mo3225s() {
        return this.f1630e;
    }

    /* renamed from: t */
    public final NodeCoordinator mo3226t() {
        return this.f1625H;
    }

    /* renamed from: u */
    public final k62 mo3227u() {
        return this.f1633r;
    }

    /* renamed from: v */
    public final s62 mo3228v() {
        return this.f1623B;
    }

    /* renamed from: w */
    public final t62 mo3229w() {
        return this.f1622A;
    }

    /* renamed from: x */
    public final FocusStateImpl mo3230x() {
        return this.f1631g;
    }

    /* renamed from: y */
    public final FocusModifier mo3231y() {
        return this.f1632k;
    }

    /* renamed from: z */
    public final v04<qa3> mo3232z() {
        return this.f1628M;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusModifier(FocusStateImpl focusStateImpl, rc2<? super sv2, r37> rc2) {
        super(rc2);
        vx2.m53591g(focusStateImpl, "initialFocus");
        vx2.m53591g(rc2, "inspectorInfo");
        this.f1630e = new v04<>(new FocusModifier[16], 0);
        this.f1631g = focusStateImpl;
        this.f1623B = new FocusPropertiesImpl();
        this.f1628M = new v04<>(new qa3[16], 0);
    }
}
