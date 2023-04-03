package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.alexvasilkov.gestures.Settings;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: s86 */
/* compiled from: StateController */
public class s86 {

    /* renamed from: f */
    public static final p86 f17519f = new p86();

    /* renamed from: g */
    public static final Rect f17520g = new Rect();

    /* renamed from: h */
    public static final RectF f17521h = new RectF();

    /* renamed from: i */
    public static final PointF f17522i = new PointF();

    /* renamed from: a */
    public final Settings f17523a;

    /* renamed from: b */
    public final rp7 f17524b;

    /* renamed from: c */
    public final az3 f17525c;

    /* renamed from: d */
    public boolean f17526d = true;

    /* renamed from: e */
    public float f17527e;

    public s86(Settings settings) {
        this.f17523a = settings;
        this.f17524b = new rp7(settings);
        this.f17525c = new az3(settings);
    }

    /* renamed from: a */
    public final float mo25660a(float f, float f2, float f3, float f4, float f5) {
        float f6;
        if (f5 == Utils.FLOAT_EPSILON) {
            return f;
        }
        float f7 = (f + f2) * 0.5f;
        if (f7 < f3 && f < f2) {
            f6 = (f3 - f7) / f5;
        } else if (f7 <= f4 || f <= f2) {
            f6 = 0.0f;
        } else {
            f6 = (f7 - f4) / f5;
        }
        if (f6 == Utils.FLOAT_EPSILON) {
            return f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        return f - (((float) Math.sqrt((double) f6)) * (f - f2));
    }

    /* renamed from: b */
    public float mo25661b(float f) {
        float f2 = this.f17527e;
        if (f2 > Utils.FLOAT_EPSILON) {
            return f * f2;
        }
        return f;
    }

    /* renamed from: c */
    public void mo25662c(p86 p86) {
        if (this.f17527e > Utils.FLOAT_EPSILON) {
            p86.mo24489l(p86.mo24483f(), p86.mo24484g(), p86.mo24485h() * this.f17527e, p86.mo24481e());
        }
    }

    /* renamed from: d */
    public final float mo25663d(float f, float f2, float f3, float f4, float f5) {
        float f6;
        if (f5 == 1.0f) {
            return f;
        }
        float f7 = f3 / f5;
        float f8 = f5 * f4;
        if (f < f3 && f < f2) {
            f6 = (f3 - f) / (f3 - f7);
        } else if (f <= f4 || f <= f2) {
            f6 = 0.0f;
        } else {
            f6 = (f - f4) / (f8 - f4);
        }
        if (f6 == Utils.FLOAT_EPSILON) {
            return f;
        }
        return f + (((float) Math.sqrt((double) f6)) * (f2 - f));
    }

    /* renamed from: e */
    public float mo25664e(p86 p86) {
        return this.f17524b.mo25496e(p86).mo25492a();
    }

    /* renamed from: f */
    public float mo25665f(p86 p86) {
        return this.f17524b.mo25496e(p86).mo25494c();
    }

    /* renamed from: g */
    public void mo25666g(p86 p86, RectF rectF) {
        this.f17525c.mo11311i(p86).mo11308f(rectF);
    }

    /* renamed from: h */
    public boolean mo25667h(p86 p86) {
        this.f17526d = true;
        return mo25672m(p86);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0136  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25668i(p000.p86 r22, p000.p86 r23, float r24, float r25, boolean r26, boolean r27, boolean r28) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            com.alexvasilkov.gestures.Settings r0 = r6.f17523a
            boolean r0 = r0.mo12240F()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            boolean r0 = java.lang.Float.isNaN(r24)
            if (r0 != 0) goto L_0x0020
            boolean r0 = java.lang.Float.isNaN(r25)
            if (r0 == 0) goto L_0x001b
            goto L_0x0020
        L_0x001b:
            r8 = r24
            r9 = r25
            goto L_0x002a
        L_0x0020:
            float r0 = r22.mo24483f()
            float r2 = r22.mo24484g()
            r8 = r0
            r9 = r2
        L_0x002a:
            r10 = 1
            if (r28 == 0) goto L_0x0051
            com.alexvasilkov.gestures.Settings r0 = r6.f17523a
            boolean r0 = r0.mo12241G()
            if (r0 == 0) goto L_0x0051
            float r0 = r22.mo24481e()
            r2 = 1119092736(0x42b40000, float:90.0)
            float r0 = r0 / r2
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r0 = r0 * r2
            float r2 = r22.mo24481e()
            boolean r2 = p000.p86.m24755c(r0, r2)
            if (r2 != 0) goto L_0x0051
            r7.mo24488k(r0, r8, r9)
            r11 = r10
            goto L_0x0052
        L_0x0051:
            r11 = r1
        L_0x0052:
            rp7 r0 = r6.f17524b
            r0.mo25496e(r7)
            rp7 r0 = r6.f17524b
            float r12 = r0.mo25494c()
            rp7 r0 = r6.f17524b
            float r4 = r0.mo25493b()
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r27 == 0) goto L_0x006f
            com.alexvasilkov.gestures.Settings r0 = r6.f17523a
            float r0 = r0.mo12268s()
            r14 = r0
            goto L_0x0070
        L_0x006f:
            r14 = r13
        L_0x0070:
            rp7 r0 = r6.f17524b
            float r1 = r22.mo24485h()
            float r1 = r0.mo25495d(r1, r14)
            if (r23 == 0) goto L_0x0088
            float r2 = r23.mo24485h()
            r0 = r21
            r3 = r12
            r5 = r14
            float r1 = r0.mo25663d(r1, r2, r3, r4, r5)
        L_0x0088:
            float r0 = r22.mo24485h()
            boolean r0 = p000.p86.m24755c(r1, r0)
            if (r0 != 0) goto L_0x0096
            r7.mo24495r(r1, r8, r9)
            r11 = r10
        L_0x0096:
            r0 = 0
            if (r26 == 0) goto L_0x00a1
            com.alexvasilkov.gestures.Settings r2 = r6.f17523a
            float r2 = r2.mo12266q()
            r5 = r2
            goto L_0x00a2
        L_0x00a1:
            r5 = r0
        L_0x00a2:
            if (r26 == 0) goto L_0x00aa
            com.alexvasilkov.gestures.Settings r0 = r6.f17523a
            float r0 = r0.mo12267r()
        L_0x00aa:
            r8 = r0
            az3 r0 = r6.f17525c
            r0.mo11311i(r7)
            az3 r15 = r6.f17525c
            float r16 = r22.mo24483f()
            float r17 = r22.mo24484g()
            android.graphics.PointF r0 = f17522i
            r18 = r5
            r19 = r8
            r20 = r0
            r15.mo11309g(r16, r17, r18, r19, r20)
            float r2 = r0.x
            float r3 = r0.y
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ee
            int r4 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ee
            float r1 = r1 * r14
            float r1 = r1 / r12
            float r1 = r1 - r13
            float r14 = r14 - r13
            float r1 = r1 / r14
            double r12 = (double) r1
            double r12 = java.lang.Math.sqrt(r12)
            float r1 = (float) r12
            az3 r4 = r6.f17525c
            r4.mo11310h(r2, r3, r0)
            float r4 = r0.x
            float r0 = r0.y
            float r2 = r2 - r4
            float r2 = r2 * r1
            float r4 = r4 + r2
            float r3 = r3 - r0
            float r1 = r1 * r3
            float r0 = r0 + r1
            r9 = r0
            r1 = r4
            goto L_0x00f0
        L_0x00ee:
            r1 = r2
            r9 = r3
        L_0x00f0:
            if (r23 == 0) goto L_0x011f
            az3 r0 = r6.f17525c
            android.graphics.RectF r12 = f17521h
            r0.mo11308f(r12)
            float r2 = r23.mo24483f()
            float r3 = r12.left
            float r4 = r12.right
            r0 = r21
            float r1 = r0.mo25660a(r1, r2, r3, r4, r5)
            float r0 = r23.mo24484g()
            float r2 = r12.top
            float r3 = r12.bottom
            r23 = r21
            r24 = r9
            r25 = r0
            r26 = r2
            r27 = r3
            r28 = r8
            float r9 = r23.mo25660a(r24, r25, r26, r27, r28)
        L_0x011f:
            float r0 = r22.mo24483f()
            boolean r0 = p000.p86.m24755c(r1, r0)
            if (r0 == 0) goto L_0x0136
            float r0 = r22.mo24484g()
            boolean r0 = p000.p86.m24755c(r9, r0)
            if (r0 != 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r10 = r11
            goto L_0x0139
        L_0x0136:
            r7.mo24492o(r1, r9)
        L_0x0139:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s86.mo25668i(p86, p86, float, float, boolean, boolean, boolean):boolean");
    }

    /* renamed from: j */
    public p86 mo25669j(p86 p86, p86 p862, float f, float f2, boolean z, boolean z2, boolean z3) {
        p86 p863 = f17519f;
        p86 p864 = p86;
        p863.mo24490m(p86);
        if (mo25668i(p863, p862, f, f2, z, z2, z3)) {
            return p863.mo24479b();
        }
        return null;
    }

    /* renamed from: k */
    public void mo25670k(float f) {
        this.f17527e = f;
    }

    /* renamed from: l */
    public p86 mo25671l(p86 p86, float f, float f2) {
        float f3;
        this.f17524b.mo25496e(p86);
        float a = this.f17524b.mo25492a();
        if (this.f17523a.mo12256g() > Utils.FLOAT_EPSILON) {
            f3 = this.f17523a.mo12256g();
        } else {
            f3 = this.f17524b.mo25493b();
        }
        if (p86.mo24485h() < (a + f3) * 0.5f) {
            a = f3;
        }
        p86 b = p86.mo24479b();
        b.mo24495r(a, f, f2);
        return b;
    }

    /* renamed from: m */
    public boolean mo25672m(p86 p86) {
        boolean z = false;
        if (this.f17526d) {
            p86.mo24489l(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, this.f17524b.mo25496e(p86).mo25492a(), Utils.FLOAT_EPSILON);
            Settings settings = this.f17523a;
            Rect rect = f17520g;
            qj2.m25709b(p86, settings, rect);
            p86.mo24492o((float) rect.left, (float) rect.top);
            if (!this.f17523a.mo12271v() || !this.f17523a.mo12272w()) {
                z = true;
            }
            this.f17526d = z;
            return !z;
        }
        mo25668i(p86, p86, Float.NaN, Float.NaN, false, false, true);
        return false;
    }
}
