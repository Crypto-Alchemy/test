package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* renamed from: vy1 */
/* compiled from: FadeDrawable */
public class vy1 extends C2415gq {

    /* renamed from: A */
    public final boolean f18930A;

    /* renamed from: B */
    public final int f18931B;

    /* renamed from: C */
    public final int f18932C;

    /* renamed from: H */
    public int f18933H;

    /* renamed from: I */
    public int f18934I;

    /* renamed from: L */
    public long f18935L;

    /* renamed from: M */
    public int[] f18936M;

    /* renamed from: P */
    public int[] f18937P;

    /* renamed from: Q */
    public int f18938Q;

    /* renamed from: U */
    public boolean[] f18939U;

    /* renamed from: X */
    public int f18940X;

    /* renamed from: Y */
    public fh4 f18941Y;

    /* renamed from: Z */
    public boolean f18942Z;

    /* renamed from: e0 */
    public boolean f18943e0;

    /* renamed from: k0 */
    public boolean f18944k0 = true;

    /* renamed from: y */
    public final Drawable[] f18945y;

    public vy1(Drawable[] drawableArr, boolean z, int i) {
        super(drawableArr);
        boolean z2 = true;
        int i2 = 0;
        au4.m10795j(drawableArr.length < 1 ? false : z2, "At least one layer required!");
        this.f18945y = drawableArr;
        this.f18936M = new int[drawableArr.length];
        this.f18937P = new int[drawableArr.length];
        this.f18938Q = 255;
        this.f18939U = new boolean[drawableArr.length];
        this.f18940X = 0;
        this.f18930A = z;
        this.f18931B = z ? 255 : i2;
        this.f18932C = i;
        mo27390t();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[LOOP:0: B:20:0x0051->B:22:0x0056, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[EDGE_INSN: B:26:0x0071->B:23:0x0071 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f18933H
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r3) goto L_0x000a
            goto L_0x0051
        L_0x000a:
            int r0 = r8.f18934I
            if (r0 <= 0) goto L_0x0010
            r0 = r3
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            p000.au4.m10794i(r0)
            long r4 = r8.mo27386p()
            long r6 = r8.f18935L
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.f18934I
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.mo27393w(r0)
            if (r0 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = r3
        L_0x0028:
            r8.f18933H = r1
            goto L_0x0050
        L_0x002b:
            int[] r0 = r8.f18937P
            int[] r4 = r8.f18936M
            android.graphics.drawable.Drawable[] r5 = r8.f18945y
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.mo27386p()
            r8.f18935L = r4
            int r0 = r8.f18934I
            if (r0 != 0) goto L_0x0042
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            boolean r0 = r8.mo27393w(r0)
            r8.mo27388r()
            if (r0 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = r3
        L_0x004e:
            r8.f18933H = r1
        L_0x0050:
            r3 = r0
        L_0x0051:
            android.graphics.drawable.Drawable[] r0 = r8.f18945y
            int r1 = r0.length
            if (r2 >= r1) goto L_0x0071
            r0 = r0[r2]
            int[] r1 = r8.f18937P
            r1 = r1[r2]
            int r4 = r8.f18938Q
            int r1 = r1 * r4
            double r4 = (double) r1
            r6 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r1 = (int) r4
            r8.mo27380j(r9, r0, r1)
            int r2 = r2 + 1
            goto L_0x0051
        L_0x0071:
            if (r3 == 0) goto L_0x007a
            r8.mo27387q()
            r8.mo27389s()
            goto L_0x007d
        L_0x007a:
            r8.invalidateSelf()
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vy1.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        return this.f18938Q;
    }

    /* renamed from: h */
    public void mo27378h() {
        this.f18940X++;
    }

    public void invalidateSelf() {
        if (this.f18940X == 0) {
            super.invalidateSelf();
        }
    }

    /* renamed from: j */
    public final void mo27380j(Canvas canvas, Drawable drawable, int i) {
        if (drawable != null && i > 0) {
            this.f18940X++;
            if (this.f18944k0) {
                drawable.mutate();
            }
            drawable.setAlpha(i);
            this.f18940X--;
            drawable.draw(canvas);
        }
    }

    /* renamed from: k */
    public void mo27381k() {
        this.f18940X--;
        invalidateSelf();
    }

    /* renamed from: l */
    public void mo27382l() {
        this.f18933H = 0;
        Arrays.fill(this.f18939U, true);
        invalidateSelf();
    }

    /* renamed from: m */
    public void mo27383m(int i) {
        this.f18933H = 0;
        this.f18939U[i] = true;
        invalidateSelf();
    }

    /* renamed from: n */
    public void mo27384n(int i) {
        this.f18933H = 0;
        this.f18939U[i] = false;
        invalidateSelf();
    }

    /* renamed from: o */
    public void mo27385o() {
        int i;
        this.f18933H = 2;
        for (int i2 = 0; i2 < this.f18945y.length; i2++) {
            int[] iArr = this.f18937P;
            if (this.f18939U[i2]) {
                i = 255;
            } else {
                i = 0;
            }
            iArr[i2] = i;
        }
        invalidateSelf();
    }

    /* renamed from: p */
    public long mo27386p() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: q */
    public final void mo27387q() {
        if (this.f18942Z) {
            this.f18942Z = false;
            fh4 fh4 = this.f18941Y;
            if (fh4 != null) {
                fh4.mo11416c();
            }
        }
    }

    /* renamed from: r */
    public final void mo27388r() {
        int i;
        if (!this.f18942Z && (i = this.f18932C) >= 0) {
            boolean[] zArr = this.f18939U;
            if (i < zArr.length && zArr[i]) {
                this.f18942Z = true;
                fh4 fh4 = this.f18941Y;
                if (fh4 != null) {
                    fh4.mo11414a();
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo27389s() {
        if (this.f18943e0 && this.f18933H == 2 && this.f18939U[this.f18932C]) {
            fh4 fh4 = this.f18941Y;
            if (fh4 != null) {
                fh4.mo11415b();
            }
            this.f18943e0 = false;
        }
    }

    public void setAlpha(int i) {
        if (this.f18938Q != i) {
            this.f18938Q = i;
            invalidateSelf();
        }
    }

    /* renamed from: t */
    public final void mo27390t() {
        this.f18933H = 2;
        Arrays.fill(this.f18936M, this.f18931B);
        this.f18936M[0] = 255;
        Arrays.fill(this.f18937P, this.f18931B);
        this.f18937P[0] = 255;
        Arrays.fill(this.f18939U, this.f18930A);
        this.f18939U[0] = true;
    }

    /* renamed from: u */
    public void mo27391u(fh4 fh4) {
        this.f18941Y = fh4;
    }

    /* renamed from: v */
    public void mo27392v(int i) {
        this.f18934I = i;
        if (this.f18933H == 1) {
            this.f18933H = 0;
        }
    }

    /* renamed from: w */
    public final boolean mo27393w(float f) {
        int i;
        boolean z = true;
        for (int i2 = 0; i2 < this.f18945y.length; i2++) {
            boolean z2 = this.f18939U[i2];
            if (z2) {
                i = 1;
            } else {
                i = -1;
            }
            int[] iArr = this.f18937P;
            int i3 = (int) (((float) this.f18936M[i2]) + (((float) (i * 255)) * f));
            iArr[i2] = i3;
            if (i3 < 0) {
                iArr[i2] = 0;
            }
            if (iArr[i2] > 255) {
                iArr[i2] = 255;
            }
            if (z2 && iArr[i2] < 255) {
                z = false;
            }
            if (!z2 && iArr[i2] > 0) {
                z = false;
            }
        }
        return z;
    }
}
