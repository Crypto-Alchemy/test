package p000;

import android.graphics.Matrix;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: p86 */
/* compiled from: State */
public class p86 {

    /* renamed from: a */
    public final Matrix f16356a = new Matrix();

    /* renamed from: b */
    public final float[] f16357b = new float[9];

    /* renamed from: c */
    public float f16358c;

    /* renamed from: d */
    public float f16359d;

    /* renamed from: e */
    public float f16360e = 1.0f;

    /* renamed from: f */
    public float f16361f;

    /* renamed from: a */
    public static int m24754a(float f, float f2) {
        if (f > f2 + 0.001f) {
            return 1;
        }
        return f < f2 - 0.001f ? -1 : 0;
    }

    /* renamed from: c */
    public static boolean m24755c(float f, float f2) {
        return f >= f2 - 0.001f && f <= f2 + 0.001f;
    }

    /* renamed from: i */
    public static float m24756i(float f) {
        if (!Float.isNaN(f)) {
            return f;
        }
        throw new IllegalArgumentException("Provided float is NaN");
    }

    /* renamed from: b */
    public p86 mo24479b() {
        p86 p86 = new p86();
        p86.mo24490m(this);
        return p86;
    }

    /* renamed from: d */
    public void mo24480d(Matrix matrix) {
        matrix.set(this.f16356a);
    }

    /* renamed from: e */
    public float mo24481e() {
        return this.f16361f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p86 p86 = (p86) obj;
        if (!m24755c(p86.f16358c, this.f16358c) || !m24755c(p86.f16359d, this.f16359d) || !m24755c(p86.f16360e, this.f16360e) || !m24755c(p86.f16361f, this.f16361f)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public float mo24483f() {
        return this.f16358c;
    }

    /* renamed from: g */
    public float mo24484g() {
        return this.f16359d;
    }

    /* renamed from: h */
    public float mo24485h() {
        return this.f16360e;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        float f = this.f16358c;
        int i4 = 0;
        if (f != Utils.FLOAT_EPSILON) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i5 = i * 31;
        float f2 = this.f16359d;
        if (f2 != Utils.FLOAT_EPSILON) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        float f3 = this.f16360e;
        if (f3 != Utils.FLOAT_EPSILON) {
            i3 = Float.floatToIntBits(f3);
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        float f4 = this.f16361f;
        if (f4 != Utils.FLOAT_EPSILON) {
            i4 = Float.floatToIntBits(f4);
        }
        return i7 + i4;
    }

    /* renamed from: j */
    public void mo24487j(float f, float f2, float f3) {
        this.f16356a.postRotate(m24756i(f), m24756i(f2), m24756i(f3));
        mo24493p(false, true);
    }

    /* renamed from: k */
    public void mo24488k(float f, float f2, float f3) {
        this.f16356a.postRotate((-this.f16361f) + m24756i(f), m24756i(f2), m24756i(f3));
        mo24493p(false, true);
    }

    /* renamed from: l */
    public void mo24489l(float f, float f2, float f3, float f4) {
        while (f4 < -180.0f) {
            f4 += 360.0f;
        }
        while (f4 > 180.0f) {
            f4 -= 360.0f;
        }
        this.f16358c = m24756i(f);
        this.f16359d = m24756i(f2);
        this.f16360e = m24756i(f3);
        this.f16361f = m24756i(f4);
        this.f16356a.reset();
        if (f3 != 1.0f) {
            this.f16356a.postScale(f3, f3);
        }
        if (f4 != Utils.FLOAT_EPSILON) {
            this.f16356a.postRotate(f4);
        }
        this.f16356a.postTranslate(f, f2);
    }

    /* renamed from: m */
    public void mo24490m(p86 p86) {
        this.f16358c = p86.f16358c;
        this.f16359d = p86.f16359d;
        this.f16360e = p86.f16360e;
        this.f16361f = p86.f16361f;
        this.f16356a.set(p86.f16356a);
    }

    /* renamed from: n */
    public void mo24491n(float f, float f2) {
        this.f16356a.postTranslate(m24756i(f), m24756i(f2));
        mo24493p(false, false);
    }

    /* renamed from: o */
    public void mo24492o(float f, float f2) {
        this.f16356a.postTranslate((-this.f16358c) + m24756i(f), (-this.f16359d) + m24756i(f2));
        mo24493p(false, false);
    }

    /* renamed from: p */
    public final void mo24493p(boolean z, boolean z2) {
        this.f16356a.getValues(this.f16357b);
        this.f16358c = m24756i(this.f16357b[2]);
        this.f16359d = m24756i(this.f16357b[5]);
        if (z) {
            float[] fArr = this.f16357b;
            this.f16360e = m24756i((float) Math.hypot((double) fArr[1], (double) fArr[4]));
        }
        if (z2) {
            float[] fArr2 = this.f16357b;
            this.f16361f = m24756i((float) Math.toDegrees(Math.atan2((double) fArr2[3], (double) fArr2[4])));
        }
    }

    /* renamed from: q */
    public void mo24494q(float f, float f2, float f3) {
        m24756i(f);
        this.f16356a.postScale(f, f, m24756i(f2), m24756i(f3));
        mo24493p(true, false);
    }

    /* renamed from: r */
    public void mo24495r(float f, float f2, float f3) {
        m24756i(f);
        Matrix matrix = this.f16356a;
        float f4 = this.f16360e;
        matrix.postScale(f / f4, f / f4, m24756i(f2), m24756i(f3));
        mo24493p(true, false);
    }

    public String toString() {
        return "{x=" + this.f16358c + ",y=" + this.f16359d + ",zoom=" + this.f16360e + ",rotation=" + this.f16361f + "}";
    }
}
