package p000;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import p000.fj4;
import p000.t36;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\bS\u0010TJ6\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u001b\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012J\u001b\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0002J3\u0010&\u001a\u00020\u0006*\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001f\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0018\u00104\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u00103R\u0018\u00105\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u00103R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0018\u00108\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u00103R\u0018\u0010:\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u00109R\u0016\u0010<\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010;R\u001f\u0010>\u001a\u00020\u000e8\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b=\u00101R\u001f\u0010@\u001a\u00020\u00168\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b?\u00101R\u0016\u0010B\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010*R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u00103R\u0018\u0010H\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u00103R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0013\u0010N\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010MR\u0011\u0010P\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b0\u0010OR\u0013\u0010R\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b)\u0010Q\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006U"}, mo44877d2 = {"Lgj4;", "", "Lqz5;", "shape", "", "alpha", "", "clipToOutline", "elevation", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ldc1;", "density", "g", "Ltf4;", "position", "e", "(J)Z", "Lxa0;", "canvas", "Lr37;", "a", "Lt36;", "size", "h", "(J)V", "i", "La95;", "rect", "k", "Lyh5;", "roundRect", "l", "Ltm4;", "composePath", "j", "offset", "radius", "f", "(Lyh5;JJF)Z", "Ldc1;", "b", "Z", "isSupportedOutline", "Landroid/graphics/Outline;", "c", "Landroid/graphics/Outline;", "cachedOutline", "d", "J", "Lqz5;", "Ltm4;", "cachedRrectPath", "outlinePath", "cacheIsDirty", "usePathForClip", "tmpPath", "Lyh5;", "tmpRoundRect", "F", "roundedCornerRadius", "m", "rectTopLeft", "n", "rectSize", "o", "outlineNeeded", "p", "Landroidx/compose/ui/unit/LayoutDirection;", "q", "tmpTouchPointPath", "r", "tmpOpPath", "Lfj4;", "s", "Lfj4;", "calculatedOutline", "()Landroid/graphics/Outline;", "outline", "()Z", "outlineClipSupported", "()Ltm4;", "clipPath", "<init>", "(Ldc1;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gj4 */
/* compiled from: OutlineResolver.android.kt */
public final class gj4 {

    /* renamed from: a */
    public dc1 f12357a;

    /* renamed from: b */
    public boolean f12358b = true;

    /* renamed from: c */
    public final Outline f12359c;

    /* renamed from: d */
    public long f12360d;

    /* renamed from: e */
    public qz5 f12361e;

    /* renamed from: f */
    public tm4 f12362f;

    /* renamed from: g */
    public tm4 f12363g;

    /* renamed from: h */
    public boolean f12364h;

    /* renamed from: i */
    public boolean f12365i;

    /* renamed from: j */
    public tm4 f12366j;

    /* renamed from: k */
    public yh5 f12367k;

    /* renamed from: l */
    public float f12368l;

    /* renamed from: m */
    public long f12369m;

    /* renamed from: n */
    public long f12370n;

    /* renamed from: o */
    public boolean f12371o;

    /* renamed from: p */
    public LayoutDirection f12372p;

    /* renamed from: q */
    public tm4 f12373q;

    /* renamed from: r */
    public tm4 f12374r;

    /* renamed from: s */
    public fj4 f12375s;

    public gj4(dc1 dc1) {
        vx2.m53591g(dc1, "density");
        this.f12357a = dc1;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f12359c = outline;
        t36.C3324a aVar = t36.f17886a;
        this.f12360d = aVar.mo26031b();
        this.f12361e = e95.m15986a();
        this.f12369m = tf4.f18145b.mo26446c();
        this.f12370n = aVar.mo26031b();
        this.f12372p = LayoutDirection.Ltr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (mo20606f(r1, r7.f12369m, r7.f12370n, r6) == false) goto L_0x0030;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20601a(p000.xa0 r21) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            java.lang.String r0 = "canvas"
            p000.vx2.m53591g(r8, r0)
            tm4 r0 = r20.mo20602b()
            r9 = 0
            r10 = 0
            r11 = 2
            if (r0 == 0) goto L_0x0017
            p000.wa0.m29431b(r8, r0, r9, r11, r10)
            goto L_0x00a9
        L_0x0017:
            float r6 = r7.f12368l
            r12 = 0
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            tm4 r13 = r7.f12366j
            yh5 r1 = r7.f12367k
            if (r13 == 0) goto L_0x0030
            long r2 = r7.f12369m
            long r4 = r7.f12370n
            r0 = r20
            boolean r0 = r0.mo20606f(r1, r2, r4, r6)
            if (r0 != 0) goto L_0x0074
        L_0x0030:
            long r0 = r7.f12369m
            float r14 = p000.tf4.m27734k(r0)
            long r0 = r7.f12369m
            float r15 = p000.tf4.m27735l(r0)
            long r0 = r7.f12369m
            float r0 = p000.tf4.m27734k(r0)
            long r1 = r7.f12370n
            float r1 = p000.t36.m27272f(r1)
            float r16 = r0 + r1
            long r0 = r7.f12369m
            float r0 = p000.tf4.m27735l(r0)
            long r1 = r7.f12370n
            float r1 = p000.t36.m27271e(r1)
            float r17 = r0 + r1
            float r0 = r7.f12368l
            long r18 = p000.cu0.m14497b(r0, r12, r11, r10)
            yh5 r0 = p000.bi5.m11412b(r14, r15, r16, r17, r18)
            if (r13 != 0) goto L_0x006a
            tm4 r1 = p000.C1636bj.m11414a()
            r13 = r1
            goto L_0x006d
        L_0x006a:
            r13.reset()
        L_0x006d:
            r13.mo313b(r0)
            r7.f12367k = r0
            r7.f12366j = r13
        L_0x0074:
            p000.wa0.m29431b(r8, r13, r9, r11, r10)
            goto L_0x00a9
        L_0x0078:
            long r0 = r7.f12369m
            float r9 = p000.tf4.m27734k(r0)
            long r0 = r7.f12369m
            float r10 = p000.tf4.m27735l(r0)
            long r0 = r7.f12369m
            float r0 = p000.tf4.m27734k(r0)
            long r1 = r7.f12370n
            float r1 = p000.t36.m27272f(r1)
            float r11 = r0 + r1
            long r0 = r7.f12369m
            float r0 = p000.tf4.m27735l(r0)
            long r1 = r7.f12370n
            float r1 = p000.t36.m27271e(r1)
            float r12 = r0 + r1
            r13 = 0
            r14 = 16
            r15 = 0
            r8 = r21
            p000.wa0.m29432c(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gj4.mo20601a(xa0):void");
    }

    /* renamed from: b */
    public final tm4 mo20602b() {
        mo20609i();
        return this.f12363g;
    }

    /* renamed from: c */
    public final Outline mo20603c() {
        mo20609i();
        if (!this.f12371o || !this.f12358b) {
            return null;
        }
        return this.f12359c;
    }

    /* renamed from: d */
    public final boolean mo20604d() {
        return !this.f12365i;
    }

    /* renamed from: e */
    public final boolean mo20605e(long j) {
        fj4 fj4;
        if (this.f12371o && (fj4 = this.f12375s) != null) {
            return tz5.m28009b(fj4, tf4.m27734k(j), tf4.m27735l(j), this.f12373q, this.f12374r);
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo20606f(yh5 yh5, long j, long j2, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (yh5 == null || !bi5.m11413c(yh5)) {
            return false;
        }
        if (yh5.mo28069e() == tf4.m27734k(j)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (yh5.mo28072g() == tf4.m27735l(j)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (yh5.mo28071f() == tf4.m27734k(j) + t36.m27272f(j2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (yh5.mo28065a() == tf4.m27735l(j) + t36.m27271e(j2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (bu0.m11576d(yh5.mo28073h()) == f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo20607g(qz5 qz5, float f, boolean z, float f2, LayoutDirection layoutDirection, dc1 dc1) {
        boolean z2;
        vx2.m53591g(qz5, "shape");
        vx2.m53591g(layoutDirection, "layoutDirection");
        vx2.m53591g(dc1, "density");
        this.f12359c.setAlpha(f);
        boolean z3 = !vx2.m53586b(this.f12361e, qz5);
        if (z3) {
            this.f12361e = qz5;
            this.f12364h = true;
        }
        if (z || f2 > Utils.FLOAT_EPSILON) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f12371o != z2) {
            this.f12371o = z2;
            this.f12364h = true;
        }
        if (this.f12372p != layoutDirection) {
            this.f12372p = layoutDirection;
            this.f12364h = true;
        }
        if (!vx2.m53586b(this.f12357a, dc1)) {
            this.f12357a = dc1;
            this.f12364h = true;
        }
        return z3;
    }

    /* renamed from: h */
    public final void mo20608h(long j) {
        if (!t36.m27270d(this.f12360d, j)) {
            this.f12360d = j;
            this.f12364h = true;
        }
    }

    /* renamed from: i */
    public final void mo20609i() {
        if (this.f12364h) {
            this.f12369m = tf4.f18145b.mo26446c();
            long j = this.f12360d;
            this.f12370n = j;
            this.f12368l = Utils.FLOAT_EPSILON;
            this.f12363g = null;
            this.f12364h = false;
            this.f12365i = false;
            if (!this.f12371o || t36.m27272f(j) <= Utils.FLOAT_EPSILON || t36.m27271e(this.f12360d) <= Utils.FLOAT_EPSILON) {
                this.f12359c.setEmpty();
                return;
            }
            this.f12358b = true;
            fj4 a = this.f12361e.mo19215a(this.f12360d, this.f12372p, this.f12357a);
            this.f12375s = a;
            if (a instanceof fj4.C2295b) {
                mo20611k(((fj4.C2295b) a).mo19925a());
            } else if (a instanceof fj4.C2296c) {
                mo20612l(((fj4.C2296c) a).mo19928a());
            } else if (a instanceof fj4.C2294a) {
                mo20610j(((fj4.C2294a) a).mo19922a());
            }
        }
    }

    /* renamed from: j */
    public final void mo20610j(tm4 tm4) {
        if (Build.VERSION.SDK_INT > 28 || tm4.mo312a()) {
            Outline outline = this.f12359c;
            if (tm4 instanceof C0024aj) {
                outline.setConvexPath(((C0024aj) tm4).mo317f());
                this.f12365i = !this.f12359c.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.f12358b = false;
            this.f12359c.setEmpty();
            this.f12365i = true;
        }
        this.f12363g = tm4;
    }

    /* renamed from: k */
    public final void mo20611k(a95 a95) {
        this.f12369m = wf4.m29550a(a95.mo118f(), a95.mo122i());
        this.f12370n = w36.m29258a(a95.mo123j(), a95.mo116e());
        this.f12359c.setRect(ap3.m31899b(a95.mo118f()), ap3.m31899b(a95.mo122i()), ap3.m31899b(a95.mo119g()), ap3.m31899b(a95.mo114c()));
    }

    /* renamed from: l */
    public final void mo20612l(yh5 yh5) {
        float d = bu0.m11576d(yh5.mo28073h());
        this.f12369m = wf4.m29550a(yh5.mo28069e(), yh5.mo28072g());
        this.f12370n = w36.m29258a(yh5.mo28076j(), yh5.mo28068d());
        if (bi5.m11413c(yh5)) {
            this.f12359c.setRoundRect(ap3.m31899b(yh5.mo28069e()), ap3.m31899b(yh5.mo28072g()), ap3.m31899b(yh5.mo28071f()), ap3.m31899b(yh5.mo28065a()), d);
            this.f12368l = d;
            return;
        }
        tm4 tm4 = this.f12362f;
        if (tm4 == null) {
            tm4 = C1636bj.m11414a();
            this.f12362f = tm4;
        }
        tm4.reset();
        tm4.mo313b(yh5);
        mo20610j(tm4);
    }
}
