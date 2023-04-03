package androidx.compose.p004ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u00016B1\u0012\u0006\u0010B\u001a\u00020>\u0012\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001d07\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001d09¢\u0006\u0004\bc\u0010dJ§\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020(H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010'J\b\u0010*\u001a\u00020\u001dH\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020\u001dH\u0016J\b\u0010/\u001a\u00020\u001dH\u0016J%\u00102\u001a\u00020 2\u0006\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\u0018\u00106\u001a\u00020\u001d2\u0006\u00105\u001a\u0002042\u0006\u00101\u001a\u00020\u0012H\u0016J*\u0010;\u001a\u00020\u001d2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001d072\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001d09H\u0016J\b\u0010<\u001a\u00020\u001dH\u0002J\u0010\u0010=\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020+H\u0002R\u0017\u0010B\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b6\u0010?\u001a\u0004\b@\u0010AR$\u00108\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001d\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010CR\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010DR$\u0010I\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00128\u0002@BX\u000e¢\u0006\f\n\u0004\b-\u0010F\"\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010KR\u0016\u0010N\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010FR\u0016\u0010P\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010FR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0U8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001f\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020V8\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010a\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006f"}, mo44877d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Llj4;", "", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Liw6;", "transformOrigin", "Lqz5;", "shape", "", "clip", "Lbd5;", "renderEffect", "Luk0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ldc1;", "density", "Lr37;", "e", "(FFFFFFFFFFJLqz5;ZLbd5;JJLandroidx/compose/ui/unit/LayoutDirection;Ldc1;)V", "Ltf4;", "position", "f", "(J)Z", "Lsw2;", "size", "c", "(J)V", "Lnw2;", "h", "invalidate", "Lxa0;", "canvas", "g", "i", "destroy", "point", "inverse", "b", "(JZ)J", "Lo04;", "rect", "a", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "d", "l", "j", "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lrc2;", "Lpc2;", "value", "Z", "k", "(Z)V", "isDirty", "Lgj4;", "Lgj4;", "outlineResolver", "r", "isDestroyed", "s", "drawnWithZ", "Lgl4;", "x", "Lgl4;", "softwareLayerPaint", "Lie3;", "Lme1;", "y", "Lie3;", "matrixCache", "Lbb0;", "A", "Lbb0;", "canvasHolder", "B", "J", "C", "Lme1;", "renderNode", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lrc2;Lpc2;)V", "H", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.RenderNodeLayer */
/* compiled from: RenderNodeLayer.android.kt */
public final class RenderNodeLayer implements lj4 {

    /* renamed from: H */
    public static final C0429a f2046H = new C0429a((DefaultConstructorMarker) null);

    /* renamed from: I */
    public static final fd2<me1, Matrix, r37> f2047I = RenderNodeLayer$Companion$getMatrix$1.INSTANCE;

    /* renamed from: A */
    public final bb0 f2048A = new bb0();

    /* renamed from: B */
    public long f2049B = iw6.f13402a.mo21645a();

    /* renamed from: C */
    public final me1 f2050C;

    /* renamed from: a */
    public final AndroidComposeView f2051a;

    /* renamed from: d */
    public rc2<? super xa0, r37> f2052d;

    /* renamed from: e */
    public pc2<r37> f2053e;

    /* renamed from: g */
    public boolean f2054g;

    /* renamed from: k */
    public final gj4 f2055k;

    /* renamed from: r */
    public boolean f2056r;

    /* renamed from: s */
    public boolean f2057s;

    /* renamed from: x */
    public gl4 f2058x;

    /* renamed from: y */
    public final ie3<me1> f2059y = new ie3<>(f2047I);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$a;", "", "Lkotlin/Function2;", "Lme1;", "Landroid/graphics/Matrix;", "Lr37;", "getMatrix", "Lfd2;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.RenderNodeLayer$a */
    /* compiled from: RenderNodeLayer.android.kt */
    public static final class C0429a {
        public C0429a() {
        }

        public /* synthetic */ C0429a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, rc2<? super xa0, r37> rc2, pc2<r37> pc2) {
        me1 me1;
        vx2.m53591g(androidComposeView, "ownerView");
        vx2.m53591g(rc2, "drawBlock");
        vx2.m53591g(pc2, "invalidateParentLayer");
        this.f2051a = androidComposeView;
        this.f2052d = rc2;
        this.f2053e = pc2;
        this.f2055k = new gj4(androidComposeView.getDensity());
        if (Build.VERSION.SDK_INT >= 29) {
            me1 = new fd5(androidComposeView);
        } else {
            me1 = new dd5(androidComposeView);
        }
        me1.mo18723t(true);
        this.f2050C = me1;
    }

    /* renamed from: a */
    public void mo3930a(o04 o04, boolean z) {
        vx2.m53591g(o04, "rect");
        if (z) {
            float[] a = this.f2059y.mo21516a(this.f2050C);
            if (a == null) {
                o04.mo23881g(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            } else {
                fp3.m17172d(a, o04);
            }
        } else {
            fp3.m17172d(this.f2059y.mo21517b(this.f2050C), o04);
        }
    }

    /* renamed from: b */
    public long mo3931b(long j, boolean z) {
        if (!z) {
            return fp3.m17171c(this.f2059y.mo21517b(this.f2050C), j);
        }
        float[] a = this.f2059y.mo21516a(this.f2050C);
        if (a != null) {
            return fp3.m17171c(a, j);
        }
        return tf4.f18145b.mo26444a();
    }

    /* renamed from: c */
    public void mo3932c(long j) {
        int f = sw2.m27143f(j);
        int e = sw2.m27142e(j);
        float f2 = (float) f;
        this.f2050C.mo18687A(iw6.m19835d(this.f2049B) * f2);
        float f3 = (float) e;
        this.f2050C.mo18688B(iw6.m19836e(this.f2049B) * f3);
        me1 me1 = this.f2050C;
        if (me1.mo18712i(me1.mo18702a(), this.f2050C.mo18718o(), this.f2050C.mo18702a() + f, this.f2050C.mo18718o() + e)) {
            this.f2055k.mo20608h(w36.m29258a(f2, f3));
            this.f2050C.mo18690D(this.f2055k.mo20603c());
            invalidate();
            this.f2059y.mo21518c();
        }
    }

    /* renamed from: d */
    public void mo3933d(rc2<? super xa0, r37> rc2, pc2<r37> pc2) {
        vx2.m53591g(rc2, "drawBlock");
        vx2.m53591g(pc2, "invalidateParentLayer");
        mo3942k(false);
        this.f2056r = false;
        this.f2057s = false;
        this.f2049B = iw6.f13402a.mo21645a();
        this.f2052d = rc2;
        this.f2053e = pc2;
    }

    public void destroy() {
        if (this.f2050C.mo18716m()) {
            this.f2050C.mo18713j();
        }
        this.f2052d = null;
        this.f2053e = null;
        this.f2056r = true;
        mo3942k(false);
        this.f2051a.mo3767h0();
        this.f2051a.mo3734g0(this);
    }

    /* renamed from: e */
    public void mo3935e(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, qz5 qz5, boolean z, bd5 bd5, long j2, long j3, LayoutDirection layoutDirection, dc1 dc1) {
        pc2<r37> pc2;
        qz5 qz52 = qz5;
        vx2.m53591g(qz52, "shape");
        vx2.m53591g(layoutDirection, "layoutDirection");
        vx2.m53591g(dc1, "density");
        this.f2049B = j;
        boolean z2 = true;
        boolean z3 = this.f2050C.mo18721r() && !this.f2055k.mo20604d();
        float f11 = f;
        this.f2050C.mo18720q(f);
        float f12 = f2;
        this.f2050C.mo18689C(f2);
        float f13 = f3;
        this.f2050C.mo18704c(f3);
        this.f2050C.mo18692F(f4);
        this.f2050C.mo18707f(f5);
        this.f2050C.mo18714k(f6);
        this.f2050C.mo18691E(zk0.m31347e(j2));
        this.f2050C.mo18694H(zk0.m31347e(j3));
        this.f2050C.mo18729z(f9);
        this.f2050C.mo18724u(f7);
        this.f2050C.mo18726w(f8);
        this.f2050C.mo18722s(f10);
        this.f2050C.mo18687A(iw6.m19835d(j) * ((float) this.f2050C.getWidth()));
        this.f2050C.mo18688B(iw6.m19836e(j) * ((float) this.f2050C.getHeight()));
        this.f2050C.mo18693G(z && qz52 != e95.m15986a());
        this.f2050C.mo18711h(z && qz52 == e95.m15986a());
        this.f2050C.mo18708g(bd5);
        boolean g = this.f2055k.mo20607g(qz5, this.f2050C.mo18703b(), this.f2050C.mo18721r(), this.f2050C.mo18695I(), layoutDirection, dc1);
        this.f2050C.mo18690D(this.f2055k.mo20603c());
        if (!this.f2050C.mo18721r() || this.f2055k.mo20604d()) {
            z2 = false;
        }
        if (z3 != z2 || (z2 && g)) {
            invalidate();
        } else {
            mo3943l();
        }
        if (!this.f2057s && this.f2050C.mo18695I() > Utils.FLOAT_EPSILON && (pc2 = this.f2053e) != null) {
            pc2.invoke();
        }
        this.f2059y.mo21518c();
    }

    /* renamed from: f */
    public boolean mo3936f(long j) {
        float k = tf4.m27734k(j);
        float l = tf4.m27735l(j);
        if (this.f2050C.mo18717n()) {
            if (Utils.FLOAT_EPSILON > k || k >= ((float) this.f2050C.getWidth()) || Utils.FLOAT_EPSILON > l || l >= ((float) this.f2050C.getHeight())) {
                return false;
            }
            return true;
        } else if (this.f2050C.mo18721r()) {
            return this.f2055k.mo20605e(j);
        } else {
            return true;
        }
    }

    /* renamed from: g */
    public void mo3937g(xa0 xa0) {
        vx2.m53591g(xa0, "canvas");
        Canvas b = C2601jh.m20133b(xa0);
        boolean z = false;
        if (b.isHardwareAccelerated()) {
            mo3939i();
            if (this.f2050C.mo18695I() > Utils.FLOAT_EPSILON) {
                z = true;
            }
            this.f2057s = z;
            if (z) {
                xa0.mo21528d();
            }
            this.f2050C.mo18706e(b);
            if (this.f2057s) {
                xa0.mo21532h();
                return;
            }
            return;
        }
        float a = (float) this.f2050C.mo18702a();
        float o = (float) this.f2050C.mo18718o();
        float d = (float) this.f2050C.mo18705d();
        float y = (float) this.f2050C.mo18728y();
        if (this.f2050C.mo18703b() < 1.0f) {
            gl4 gl4 = this.f2058x;
            if (gl4 == null) {
                gl4 = C3729zi.m31240a();
                this.f2058x = gl4;
            }
            gl4.mo20640c(this.f2050C.mo18703b());
            b.saveLayer(a, o, d, y, gl4.mo20639b());
        } else {
            xa0.mo21531g();
        }
        xa0.mo21526b(a, o);
        xa0.mo21533i(this.f2059y.mo21517b(this.f2050C));
        mo3941j(xa0);
        rc2<? super xa0, r37> rc2 = this.f2052d;
        if (rc2 != null) {
            rc2.invoke(xa0);
        }
        xa0.mo21527c();
        mo3942k(false);
    }

    /* renamed from: h */
    public void mo3938h(long j) {
        int a = this.f2050C.mo18702a();
        int o = this.f2050C.mo18718o();
        int f = nw2.m23481f(j);
        int g = nw2.m23482g(j);
        if (a != f || o != g) {
            this.f2050C.mo18727x(f - a);
            this.f2050C.mo18715l(g - o);
            mo3943l();
            this.f2059y.mo21518c();
        }
    }

    /* renamed from: i */
    public void mo3939i() {
        tm4 tm4;
        if (this.f2054g || !this.f2050C.mo18716m()) {
            mo3942k(false);
            if (!this.f2050C.mo18721r() || this.f2055k.mo20604d()) {
                tm4 = null;
            } else {
                tm4 = this.f2055k.mo20602b();
            }
            rc2<? super xa0, r37> rc2 = this.f2052d;
            if (rc2 != null) {
                this.f2050C.mo18719p(this.f2048A, tm4, rc2);
            }
        }
    }

    public void invalidate() {
        if (!this.f2054g && !this.f2056r) {
            this.f2051a.invalidate();
            mo3942k(true);
        }
    }

    /* renamed from: j */
    public final void mo3941j(xa0 xa0) {
        if (this.f2050C.mo18721r() || this.f2050C.mo18717n()) {
            this.f2055k.mo20601a(xa0);
        }
    }

    /* renamed from: k */
    public final void mo3942k(boolean z) {
        if (z != this.f2054g) {
            this.f2054g = z;
            this.f2051a.mo3719c0(this, z);
        }
    }

    /* renamed from: l */
    public final void mo3943l() {
        if (Build.VERSION.SDK_INT >= 26) {
            qn7.f16995a.mo25186a(this.f2051a);
        } else {
            this.f2051a.invalidate();
        }
    }
}
