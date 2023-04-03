package p000;

import androidx.compose.p004ui.layout.PlaceableKt;
import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b)\u0010*J;\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\bH\u0002R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0010\u0010\u0012R3\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0004@DX\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR3\u0010#\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u001f8\u0004@DX\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR\u0014\u0010%\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0012R\u0014\u0010&\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012R\u001d\u0010(\u001a\u00020\u00028DX\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b'\u0010\u001b\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006+"}, mo44877d2 = {"Lvo4;", "", "Lnw2;", "position", "", "zIndex", "Lkotlin/Function1;", "Lnj2;", "Lr37;", "layerBlock", "O", "(JFLrc2;)V", "P", "", "<set-?>", "a", "I", "N", "()I", "width", "d", "height", "Lsw2;", "value", "e", "J", "K", "()J", "Q", "(J)V", "measuredSize", "Lmq0;", "g", "M", "R", "measurementConstraints", "L", "measuredWidth", "measuredHeight", "H", "apparentToRealOffset", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vo4 */
/* compiled from: Placeable.kt */
public abstract class vo4 {

    /* renamed from: a */
    public int f18868a;

    /* renamed from: d */
    public int f18869d;

    /* renamed from: e */
    public long f18870e = tw2.m27948a(0, 0);

    /* renamed from: g */
    public long f18871g = PlaceableKt.f1709b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006J$\u0010\n\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006J)\u0010\r\u001a\u00020\b*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0012\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000fJ?\u0010\u0013\u001a\u00020\b*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, mo44877d2 = {"Lvo4$a;", "", "Lvo4;", "", "x", "y", "", "zIndex", "Lr37;", "q", "m", "Lnw2;", "position", "o", "(Lvo4;JF)V", "Lkotlin/Function1;", "Lnj2;", "layerBlock", "s", "u", "(Lvo4;JFLrc2;)V", "l", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "k", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "<init>", "()V", "a", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: vo4$a */
    /* compiled from: Placeable.kt */
    public static abstract class C3501a {

        /* renamed from: a */
        public static final C3502a f18872a = new C3502a((DefaultConstructorMarker) null);

        /* renamed from: b */
        public static LayoutDirection f18873b = LayoutDirection.Ltr;

        /* renamed from: c */
        public static int f18874c;

        /* renamed from: d */
        public static me3 f18875d;

        /* renamed from: e */
        public static LayoutNodeLayoutDelegate f18876e;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0014@RX\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f8\u0014@RX\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo44877d2 = {"Lvo4$a$a;", "Lvo4$a;", "Lnl3;", "scope", "", "y", "Landroidx/compose/ui/unit/LayoutDirection;", "<set-?>", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "k", "()Landroidx/compose/ui/unit/LayoutDirection;", "", "parentWidth", "I", "l", "()I", "Lme3;", "_coordinates", "Lme3;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: vo4$a$a */
        /* compiled from: Placeable.kt */
        public static final class C3502a extends C3501a {
            public C3502a() {
            }

            public /* synthetic */ C3502a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: k */
            public LayoutDirection mo27281k() {
                return C3501a.f18873b;
            }

            /* renamed from: l */
            public int mo27282l() {
                return C3501a.f18874c;
            }

            /* renamed from: y */
            public final boolean mo27288y(nl3 nl3) {
                boolean z = false;
                if (nl3 == null) {
                    C3501a.f18875d = null;
                    C3501a.f18876e = null;
                    return false;
                }
                boolean c0 = nl3.mo23725c0();
                nl3 Z = nl3.mo3600Z();
                if (Z != null && Z.mo23725c0()) {
                    z = true;
                }
                if (z) {
                    nl3.mo23727f0(true);
                }
                C3501a.f18876e = nl3.mo3596X().mo3399D();
                if (nl3.mo23725c0() || nl3.mo23726d0()) {
                    C3501a.f18875d = null;
                } else {
                    C3501a.f18875d = nl3.mo3592V();
                }
                return c0;
            }
        }

        /* renamed from: n */
        public static /* synthetic */ void m29011n(C3501a aVar, vo4 vo4, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = Utils.FLOAT_EPSILON;
                }
                aVar.mo27283m(vo4, i, i2, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        /* renamed from: p */
        public static /* synthetic */ void m29012p(C3501a aVar, vo4 vo4, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = Utils.FLOAT_EPSILON;
                }
                aVar.mo27284o(vo4, j, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        /* renamed from: r */
        public static /* synthetic */ void m29013r(C3501a aVar, vo4 vo4, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = Utils.FLOAT_EPSILON;
                }
                aVar.mo27285q(vo4, i, i2, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        /* renamed from: t */
        public static /* synthetic */ void m29014t(C3501a aVar, vo4 vo4, int i, int i2, float f, rc2 rc2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = Utils.FLOAT_EPSILON;
                }
                float f2 = f;
                if ((i3 & 8) != 0) {
                    rc2 = PlaceableKt.f1708a;
                }
                aVar.mo27286s(vo4, i, i2, f2, rc2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        /* renamed from: k */
        public abstract LayoutDirection mo27281k();

        /* renamed from: l */
        public abstract int mo27282l();

        /* renamed from: m */
        public final void mo27283m(vo4 vo4, int i, int i2, float f) {
            vx2.m53591g(vo4, "<this>");
            long a = ow2.m24292a(i, i2);
            long F = vo4.mo27272H();
            vo4.mo3520O(ow2.m24292a(nw2.m23481f(a) + nw2.m23481f(F), nw2.m23482g(a) + nw2.m23482g(F)), f, (rc2<? super nj2, r37>) null);
        }

        /* renamed from: o */
        public final void mo27284o(vo4 vo4, long j, float f) {
            vx2.m53591g(vo4, "$this$place");
            long F = vo4.mo27272H();
            vo4.mo3520O(ow2.m24292a(nw2.m23481f(j) + nw2.m23481f(F), nw2.m23482g(j) + nw2.m23482g(F)), f, (rc2<? super nj2, r37>) null);
        }

        /* renamed from: q */
        public final void mo27285q(vo4 vo4, int i, int i2, float f) {
            vx2.m53591g(vo4, "<this>");
            long a = ow2.m24292a(i, i2);
            if (mo27281k() == LayoutDirection.Ltr || mo27282l() == 0) {
                long F = vo4.mo27272H();
                vo4.mo3520O(ow2.m24292a(nw2.m23481f(a) + nw2.m23481f(F), nw2.m23482g(a) + nw2.m23482g(F)), f, (rc2<? super nj2, r37>) null);
                return;
            }
            long a2 = ow2.m24292a((mo27282l() - vo4.mo27277N()) - nw2.m23481f(a), nw2.m23482g(a));
            long F2 = vo4.mo27272H();
            vo4.mo3520O(ow2.m24292a(nw2.m23481f(a2) + nw2.m23481f(F2), nw2.m23482g(a2) + nw2.m23482g(F2)), f, (rc2<? super nj2, r37>) null);
        }

        /* renamed from: s */
        public final void mo27286s(vo4 vo4, int i, int i2, float f, rc2<? super nj2, r37> rc2) {
            vx2.m53591g(vo4, "<this>");
            vx2.m53591g(rc2, "layerBlock");
            long a = ow2.m24292a(i, i2);
            if (mo27281k() == LayoutDirection.Ltr || mo27282l() == 0) {
                long F = vo4.mo27272H();
                vo4.mo3520O(ow2.m24292a(nw2.m23481f(a) + nw2.m23481f(F), nw2.m23482g(a) + nw2.m23482g(F)), f, rc2);
                return;
            }
            long a2 = ow2.m24292a((mo27282l() - vo4.mo27277N()) - nw2.m23481f(a), nw2.m23482g(a));
            long F2 = vo4.mo27272H();
            vo4.mo3520O(ow2.m24292a(nw2.m23481f(a2) + nw2.m23481f(F2), nw2.m23482g(a2) + nw2.m23482g(F2)), f, rc2);
        }

        /* renamed from: u */
        public final void mo27287u(vo4 vo4, long j, float f, rc2<? super nj2, r37> rc2) {
            vx2.m53591g(vo4, "$this$placeWithLayer");
            vx2.m53591g(rc2, "layerBlock");
            long F = vo4.mo27272H();
            vo4.mo3520O(ow2.m24292a(nw2.m23481f(j) + nw2.m23481f(F), nw2.m23482g(j) + nw2.m23482g(F)), f, rc2);
        }
    }

    /* renamed from: H */
    public final long mo27272H() {
        return ow2.m24292a((this.f18868a - sw2.m27143f(this.f18870e)) / 2, (this.f18869d - sw2.m27142e(this.f18870e)) / 2);
    }

    /* renamed from: I */
    public final int mo27273I() {
        return this.f18869d;
    }

    /* renamed from: J */
    public int mo27274J() {
        return sw2.m27142e(this.f18870e);
    }

    /* renamed from: K */
    public final long mo27275K() {
        return this.f18870e;
    }

    /* renamed from: L */
    public int mo3545L() {
        return sw2.m27143f(this.f18870e);
    }

    /* renamed from: M */
    public final long mo27276M() {
        return this.f18871g;
    }

    /* renamed from: N */
    public final int mo27277N() {
        return this.f18868a;
    }

    /* renamed from: O */
    public abstract void mo3520O(long j, float f, rc2<? super nj2, r37> rc2);

    /* renamed from: P */
    public final void mo27278P() {
        this.f18868a = d75.m43389k(sw2.m27143f(this.f18870e), mq0.m22479j(this.f18871g), mq0.m22477h(this.f18871g));
        this.f18869d = d75.m43389k(sw2.m27142e(this.f18870e), mq0.m22478i(this.f18871g), mq0.m22476g(this.f18871g));
    }

    /* renamed from: Q */
    public final void mo27279Q(long j) {
        if (!sw2.m27141d(this.f18870e, j)) {
            this.f18870e = j;
            mo27278P();
        }
    }

    /* renamed from: R */
    public final void mo27280R(long j) {
        if (!mq0.m22474e(this.f18871g, j)) {
            this.f18871g = j;
            mo27278P();
        }
    }
}
