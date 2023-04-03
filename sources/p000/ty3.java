package p000;

import android.view.View;
import androidx.constraintlayout.widget.C0532a;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: ty3 */
/* compiled from: MotionPaths */
public class ty3 implements Comparable<ty3> {

    /* renamed from: X */
    public static String[] f18312X = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: A */
    public float f18313A = Float.NaN;

    /* renamed from: B */
    public int f18314B;

    /* renamed from: C */
    public int f18315C;

    /* renamed from: H */
    public float f18316H;

    /* renamed from: I */
    public jy3 f18317I;

    /* renamed from: L */
    public LinkedHashMap<String, ConstraintAttribute> f18318L;

    /* renamed from: M */
    public int f18319M;

    /* renamed from: P */
    public int f18320P;

    /* renamed from: Q */
    public double[] f18321Q;

    /* renamed from: U */
    public double[] f18322U;

    /* renamed from: a */
    public ym1 f18323a;

    /* renamed from: d */
    public int f18324d = 0;

    /* renamed from: e */
    public float f18325e;

    /* renamed from: g */
    public float f18326g;

    /* renamed from: k */
    public float f18327k;

    /* renamed from: r */
    public float f18328r;

    /* renamed from: s */
    public float f18329s;

    /* renamed from: x */
    public float f18330x;

    /* renamed from: y */
    public float f18331y = Float.NaN;

    public ty3() {
        int i = y93.f20099f;
        this.f18314B = i;
        this.f18315C = i;
        this.f18316H = Float.NaN;
        this.f18317I = null;
        this.f18318L = new LinkedHashMap<>();
        this.f18319M = 0;
        this.f18321Q = new double[18];
        this.f18322U = new double[18];
    }

    /* renamed from: a */
    public void mo26596a(C0532a.C0533a aVar) {
        this.f18323a = ym1.m30704c(aVar.f3223d.f3313d);
        C0532a.C0536c cVar = aVar.f3223d;
        this.f18314B = cVar.f3314e;
        this.f18315C = cVar.f3311b;
        this.f18331y = cVar.f3318i;
        this.f18324d = cVar.f3315f;
        this.f18320P = cVar.f3312c;
        this.f18313A = aVar.f3222c.f3328e;
        this.f18316H = aVar.f3224e.f3243C;
        for (String next : aVar.f3226g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f3226g.get(next);
            if (constraintAttribute != null && constraintAttribute.mo5041g()) {
                this.f18318L.put(next, constraintAttribute);
            }
        }
    }

    /* renamed from: d */
    public int compareTo(ty3 ty3) {
        return Float.compare(this.f18326g, ty3.f18326g);
    }

    /* renamed from: e */
    public final boolean mo26599e(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) != Float.isNaN(f2)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f2) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public void mo26600f(ty3 ty3, boolean[] zArr, String[] strArr, boolean z) {
        boolean e = mo26599e(this.f18327k, ty3.f18327k);
        boolean e2 = mo26599e(this.f18328r, ty3.f18328r);
        zArr[0] = zArr[0] | mo26599e(this.f18326g, ty3.f18326g);
        boolean z2 = e | e2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | mo26599e(this.f18329s, ty3.f18329s);
        zArr[4] = mo26599e(this.f18330x, ty3.f18330x) | zArr[4];
    }

    /* renamed from: g */
    public void mo26601g(double[] dArr, int[] iArr) {
        float[] fArr = {this.f18326g, this.f18327k, this.f18328r, this.f18329s, this.f18330x, this.f18331y};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = (double) fArr[i2];
                i++;
            }
        }
    }

    /* renamed from: h */
    public void mo26602h(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f18327k;
        float f2 = this.f18328r;
        float f3 = this.f18329s;
        float f4 = this.f18330x;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        jy3 jy3 = this.f18317I;
        if (jy3 != null) {
            float[] fArr2 = new float[2];
            jy3.mo22120i(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = (double) f6;
            double d3 = (double) f;
            double d4 = (double) f2;
            f = (float) ((d2 + (Math.sin(d4) * d3)) - ((double) (f3 / 2.0f)));
            f2 = (float) ((((double) f7) - (d3 * Math.cos(d4))) - ((double) (f4 / 2.0f)));
        }
        fArr[i] = f + (f3 / 2.0f) + Utils.FLOAT_EPSILON;
        fArr[i + 1] = f2 + (f4 / 2.0f) + Utils.FLOAT_EPSILON;
    }

    /* renamed from: i */
    public void mo26603i(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        int[] iArr2 = iArr;
        float f2 = this.f18327k;
        float f3 = this.f18328r;
        float f4 = this.f18329s;
        float f5 = this.f18330x;
        float f6 = Utils.FLOAT_EPSILON;
        float f7 = Utils.FLOAT_EPSILON;
        float f8 = Utils.FLOAT_EPSILON;
        float f9 = Utils.FLOAT_EPSILON;
        for (int i = 0; i < iArr2.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f2 = f10;
                f6 = f11;
            } else if (i2 == 2) {
                f3 = f10;
                f8 = f11;
            } else if (i2 == 3) {
                f4 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float f14 = (f9 / 2.0f) + f8;
        jy3 jy3 = this.f18317I;
        if (jy3 != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            jy3.mo22120i(d, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            double d2 = (double) f2;
            float f18 = fArr4[1];
            double d3 = (double) f3;
            f = f4;
            double d4 = (double) f6;
            double d5 = (double) f8;
            float sin = (float) (((double) f17) + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            f14 = (float) ((((double) f18) - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f13 = sin;
            f2 = (float) ((((double) f15) + (Math.sin(d3) * d2)) - ((double) (f4 / 2.0f)));
            f3 = (float) ((((double) f16) - (d2 * Math.cos(d3))) - ((double) (f5 / 2.0f)));
            f12 = 2.0f;
        } else {
            f = f4;
        }
        fArr[0] = f2 + (f / f12) + Utils.FLOAT_EPSILON;
        fArr[1] = f3 + (f5 / f12) + Utils.FLOAT_EPSILON;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    /* renamed from: l */
    public int mo26604l(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.f18318L.get(str);
        int i2 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.mo5042h() == 1) {
            dArr[i] = (double) constraintAttribute.mo5039e();
            return 1;
        }
        int h = constraintAttribute.mo5042h();
        float[] fArr = new float[h];
        constraintAttribute.mo5040f(fArr);
        while (i2 < h) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return h;
    }

    /* renamed from: m */
    public int mo26605m(String str) {
        ConstraintAttribute constraintAttribute = this.f18318L.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.mo5042h();
    }

    /* renamed from: o */
    public void mo26606o(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f18327k;
        float f2 = this.f18328r;
        float f3 = this.f18329s;
        float f4 = this.f18330x;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        jy3 jy3 = this.f18317I;
        if (jy3 != null) {
            float j = jy3.mo22121j();
            double d = (double) f;
            double d2 = (double) f2;
            f2 = (float) ((((double) this.f18317I.mo22122k()) - (d * Math.cos(d2))) - ((double) (f4 / 2.0f)));
            f = (float) ((((double) j) + (Math.sin(d2) * d)) - ((double) (f3 / 2.0f)));
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f8 = f + Utils.FLOAT_EPSILON;
        float f9 = f2 + Utils.FLOAT_EPSILON;
        float f10 = f6 + Utils.FLOAT_EPSILON;
        float f11 = f2 + Utils.FLOAT_EPSILON;
        float f12 = f6 + Utils.FLOAT_EPSILON;
        float f13 = f7 + Utils.FLOAT_EPSILON;
        float f14 = f + Utils.FLOAT_EPSILON;
        float f15 = f7 + Utils.FLOAT_EPSILON;
        int i4 = i + 1;
        fArr[i] = f8;
        int i5 = i4 + 1;
        fArr[i4] = f9;
        int i6 = i5 + 1;
        fArr[i5] = f10;
        int i7 = i6 + 1;
        fArr[i6] = f11;
        int i8 = i7 + 1;
        fArr[i7] = f12;
        int i9 = i8 + 1;
        fArr[i8] = f13;
        fArr[i9] = f14;
        fArr[i9 + 1] = f15;
    }

    /* renamed from: p */
    public boolean mo26607p(String str) {
        return this.f18318L.containsKey(str);
    }

    /* renamed from: r */
    public void mo26608r(xa3 xa3, ty3 ty3, ty3 ty32) {
        float f;
        float f2;
        float f3;
        float f4;
        xa3 xa32 = xa3;
        ty3 ty33 = ty3;
        ty3 ty34 = ty32;
        float f5 = ((float) xa32.f20100a) / 100.0f;
        this.f18325e = f5;
        this.f18324d = xa32.f19791j;
        if (Float.isNaN(xa32.f19792k)) {
            f = f5;
        } else {
            f = xa32.f19792k;
        }
        if (Float.isNaN(xa32.f19793l)) {
            f2 = f5;
        } else {
            f2 = xa32.f19793l;
        }
        float f6 = ty34.f18329s;
        float f7 = ty33.f18329s;
        float f8 = ty34.f18330x;
        float f9 = ty33.f18330x;
        this.f18326g = this.f18325e;
        float f10 = ty33.f18327k;
        float f11 = ty33.f18328r;
        float f12 = (ty34.f18327k + (f6 / 2.0f)) - ((f7 / 2.0f) + f10);
        float f13 = (ty34.f18328r + (f8 / 2.0f)) - (f11 + (f9 / 2.0f));
        float f14 = (f6 - f7) * f;
        float f15 = f14 / 2.0f;
        this.f18327k = (float) ((int) ((f10 + (f12 * f5)) - f15));
        float f16 = (f8 - f9) * f2;
        float f17 = f16 / 2.0f;
        this.f18328r = (float) ((int) ((f11 + (f13 * f5)) - f17));
        this.f18329s = (float) ((int) (f7 + f14));
        this.f18330x = (float) ((int) (f9 + f16));
        xa3 xa33 = xa3;
        if (Float.isNaN(xa33.f19794m)) {
            f3 = f5;
        } else {
            f3 = xa33.f19794m;
        }
        boolean isNaN = Float.isNaN(xa33.f19797p);
        float f18 = Utils.FLOAT_EPSILON;
        if (isNaN) {
            f4 = 0.0f;
        } else {
            f4 = xa33.f19797p;
        }
        if (!Float.isNaN(xa33.f19795n)) {
            f5 = xa33.f19795n;
        }
        if (!Float.isNaN(xa33.f19796o)) {
            f18 = xa33.f19796o;
        }
        this.f18319M = 0;
        ty3 ty35 = ty3;
        this.f18327k = (float) ((int) (((ty35.f18327k + (f3 * f12)) + (f18 * f13)) - f15));
        this.f18328r = (float) ((int) (((ty35.f18328r + (f12 * f4)) + (f13 * f5)) - f17));
        this.f18323a = ym1.m30704c(xa33.f19789h);
        this.f18314B = xa33.f19790i;
    }

    /* renamed from: t */
    public void mo26609t(xa3 xa3, ty3 ty3, ty3 ty32) {
        float f;
        float f2;
        float f3;
        xa3 xa32 = xa3;
        ty3 ty33 = ty3;
        ty3 ty34 = ty32;
        float f4 = ((float) xa32.f20100a) / 100.0f;
        this.f18325e = f4;
        this.f18324d = xa32.f19791j;
        if (Float.isNaN(xa32.f19792k)) {
            f = f4;
        } else {
            f = xa32.f19792k;
        }
        if (Float.isNaN(xa32.f19793l)) {
            f2 = f4;
        } else {
            f2 = xa32.f19793l;
        }
        float f5 = ty34.f18329s - ty33.f18329s;
        float f6 = ty34.f18330x - ty33.f18330x;
        this.f18326g = this.f18325e;
        if (!Float.isNaN(xa32.f19794m)) {
            f4 = xa32.f19794m;
        }
        float f7 = ty33.f18327k;
        float f8 = ty33.f18329s;
        float f9 = ty33.f18328r;
        float f10 = ty33.f18330x;
        float f11 = ty34.f18327k + (ty34.f18329s / 2.0f);
        float f12 = f11 - ((f8 / 2.0f) + f7);
        float f13 = (ty34.f18328r + (ty34.f18330x / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = f12 * f4;
        float f15 = f5 * f;
        float f16 = f15 / 2.0f;
        this.f18327k = (float) ((int) ((f7 + f14) - f16));
        float f17 = f4 * f13;
        float f18 = f6 * f2;
        float f19 = f18 / 2.0f;
        this.f18328r = (float) ((int) ((f9 + f17) - f19));
        this.f18329s = (float) ((int) (f8 + f15));
        this.f18330x = (float) ((int) (f10 + f18));
        xa3 xa33 = xa3;
        if (Float.isNaN(xa33.f19795n)) {
            f3 = Utils.FLOAT_EPSILON;
        } else {
            f3 = xa33.f19795n;
        }
        float f20 = (-f13) * f3;
        float f21 = f12 * f3;
        this.f18319M = 1;
        ty3 ty35 = ty3;
        this.f18327k = ((float) ((int) ((ty35.f18327k + f14) - f16))) + f20;
        this.f18328r = ((float) ((int) ((ty35.f18328r + f17) - f19))) + f21;
        this.f18315C = this.f18315C;
        this.f18323a = ym1.m30704c(xa33.f19789h);
        this.f18314B = xa33.f19790i;
    }

    /* renamed from: u */
    public void mo26610u(int i, int i2, xa3 xa3, ty3 ty3, ty3 ty32) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = ((float) xa3.f20100a) / 100.0f;
        this.f18325e = f7;
        this.f18324d = xa3.f19791j;
        this.f18319M = xa3.f19798q;
        if (Float.isNaN(xa3.f19792k)) {
            f = f7;
        } else {
            f = xa3.f19792k;
        }
        if (Float.isNaN(xa3.f19793l)) {
            f2 = f7;
        } else {
            f2 = xa3.f19793l;
        }
        float f8 = ty32.f18329s;
        float f9 = ty3.f18329s;
        float f10 = ty32.f18330x;
        float f11 = ty3.f18330x;
        this.f18326g = this.f18325e;
        this.f18329s = (float) ((int) (f9 + ((f8 - f9) * f)));
        this.f18330x = (float) ((int) (f11 + ((f10 - f11) * f2)));
        int i3 = xa3.f19798q;
        if (i3 == 1) {
            if (Float.isNaN(xa3.f19794m)) {
                f3 = f7;
            } else {
                f3 = xa3.f19794m;
            }
            float f12 = ty32.f18327k;
            float f13 = ty3.f18327k;
            this.f18327k = (f3 * (f12 - f13)) + f13;
            if (!Float.isNaN(xa3.f19795n)) {
                f7 = xa3.f19795n;
            }
            float f14 = ty32.f18328r;
            float f15 = ty3.f18328r;
            this.f18328r = (f7 * (f14 - f15)) + f15;
        } else if (i3 != 2) {
            if (Float.isNaN(xa3.f19794m)) {
                f6 = f7;
            } else {
                f6 = xa3.f19794m;
            }
            float f16 = ty32.f18327k;
            float f17 = ty3.f18327k;
            this.f18327k = (f6 * (f16 - f17)) + f17;
            if (!Float.isNaN(xa3.f19795n)) {
                f7 = xa3.f19795n;
            }
            float f18 = ty32.f18328r;
            float f19 = ty3.f18328r;
            this.f18328r = (f7 * (f18 - f19)) + f19;
        } else {
            if (Float.isNaN(xa3.f19794m)) {
                float f20 = ty32.f18327k;
                float f21 = ty3.f18327k;
                f4 = ((f20 - f21) * f7) + f21;
            } else {
                f4 = Math.min(f2, f) * xa3.f19794m;
            }
            this.f18327k = f4;
            if (Float.isNaN(xa3.f19795n)) {
                float f22 = ty32.f18328r;
                float f23 = ty3.f18328r;
                f5 = (f7 * (f22 - f23)) + f23;
            } else {
                f5 = xa3.f19795n;
            }
            this.f18328r = f5;
        }
        this.f18315C = ty3.f18315C;
        this.f18323a = ym1.m30704c(xa3.f19789h);
        this.f18314B = xa3.f19790i;
    }

    /* renamed from: v */
    public void mo26611v(int i, int i2, xa3 xa3, ty3 ty3, ty3 ty32) {
        float f;
        float f2;
        xa3 xa32 = xa3;
        ty3 ty33 = ty3;
        ty3 ty34 = ty32;
        float f3 = ((float) xa32.f20100a) / 100.0f;
        this.f18325e = f3;
        this.f18324d = xa32.f19791j;
        if (Float.isNaN(xa32.f19792k)) {
            f = f3;
        } else {
            f = xa32.f19792k;
        }
        if (Float.isNaN(xa32.f19793l)) {
            f2 = f3;
        } else {
            f2 = xa32.f19793l;
        }
        float f4 = ty34.f18329s;
        float f5 = ty33.f18329s;
        float f6 = ty34.f18330x;
        float f7 = ty33.f18330x;
        this.f18326g = this.f18325e;
        float f8 = ty33.f18327k;
        float f9 = ty33.f18328r;
        float f10 = ty34.f18327k + (f4 / 2.0f);
        float f11 = ty34.f18328r + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.f18327k = (float) ((int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f3)) - (f12 / 2.0f)));
        float f13 = (f6 - f7) * f2;
        this.f18328r = (float) ((int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f)));
        this.f18329s = (float) ((int) (f5 + f12));
        this.f18330x = (float) ((int) (f7 + f13));
        this.f18319M = 2;
        xa3 xa33 = xa3;
        if (!Float.isNaN(xa33.f19794m)) {
            this.f18327k = (float) ((int) (xa33.f19794m * ((float) ((int) (((float) i) - this.f18329s)))));
        }
        if (!Float.isNaN(xa33.f19795n)) {
            this.f18328r = (float) ((int) (xa33.f19795n * ((float) ((int) (((float) i2) - this.f18330x)))));
        }
        this.f18315C = this.f18315C;
        this.f18323a = ym1.m30704c(xa33.f19789h);
        this.f18314B = xa33.f19790i;
    }

    /* renamed from: w */
    public void mo26612w(float f, float f2, float f3, float f4) {
        this.f18327k = f;
        this.f18328r = f2;
        this.f18329s = f3;
        this.f18330x = f4;
    }

    /* renamed from: x */
    public void mo26613x(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((Utils.FLOAT_EPSILON * f4) / 2.0f);
        float f9 = f5 - ((Utils.FLOAT_EPSILON * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + Utils.FLOAT_EPSILON;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + Utils.FLOAT_EPSILON;
    }

    /* renamed from: y */
    public void mo26614y(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f2;
        boolean z;
        boolean z2;
        float f3;
        View view2 = view;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f4 = this.f18327k;
        float f5 = this.f18328r;
        float f6 = this.f18329s;
        float f7 = this.f18330x;
        if (iArr2.length != 0 && this.f18321Q.length <= iArr2[iArr2.length - 1]) {
            int i = iArr2[iArr2.length - 1] + 1;
            this.f18321Q = new double[i];
            this.f18322U = new double[i];
        }
        Arrays.fill(this.f18321Q, Double.NaN);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            double[] dArr5 = this.f18321Q;
            int i3 = iArr2[i2];
            dArr5[i3] = dArr[i2];
            this.f18322U[i3] = dArr4[i2];
        }
        float f8 = Float.NaN;
        int i4 = 0;
        float f9 = Utils.FLOAT_EPSILON;
        float f10 = Utils.FLOAT_EPSILON;
        float f11 = Utils.FLOAT_EPSILON;
        float f12 = Utils.FLOAT_EPSILON;
        while (true) {
            double[] dArr6 = this.f18321Q;
            if (i4 >= dArr6.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr6[i4]);
            double d = Utils.DOUBLE_EPSILON;
            if (!isNaN || !(dArr3 == null || dArr3[i4] == Utils.DOUBLE_EPSILON)) {
                if (dArr3 != null) {
                    d = dArr3[i4];
                }
                if (!Double.isNaN(this.f18321Q[i4])) {
                    d = this.f18321Q[i4] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f18322U[i4];
                if (i4 == 1) {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                } else if (i4 == 2) {
                    f8 = f3;
                    f10 = f14;
                    f5 = f13;
                } else if (i4 == 3) {
                    f8 = f3;
                    f11 = f14;
                    f6 = f13;
                } else if (i4 == 4) {
                    f8 = f3;
                    f12 = f14;
                    f7 = f13;
                } else if (i4 == 5) {
                    f8 = f13;
                }
                i4++;
                double[] dArr7 = dArr2;
            } else {
                f3 = f8;
            }
            f8 = f3;
            i4++;
            double[] dArr72 = dArr2;
        }
        float f15 = f8;
        jy3 jy3 = this.f18317I;
        if (jy3 != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            jy3.mo22120i((double) f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = (double) f4;
            double d3 = (double) f5;
            double sin = ((double) f16) + (Math.sin(d3) * d2);
            f2 = f7;
            float f20 = (float) (sin - ((double) (f6 / 2.0f)));
            float cos = (float) ((((double) f17) - (Math.cos(d3) * d2)) - ((double) (f7 / 2.0f)));
            double d4 = (double) f9;
            double d5 = (double) f10;
            float sin2 = (float) (((double) f18) + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float f21 = f20;
            float cos2 = (float) ((((double) f19) - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            double[] dArr8 = dArr2;
            if (dArr8.length >= 2) {
                z2 = false;
                dArr8[0] = (double) sin2;
                z = true;
                dArr8[1] = (double) cos2;
            } else {
                z2 = false;
                z = true;
            }
            if (!Float.isNaN(f15)) {
                view2.setRotation((float) (((double) f15) + Math.toDegrees(Math.atan2((double) cos2, (double) sin2))));
            }
            f4 = f21;
            f5 = cos;
        } else {
            float f22 = f15;
            f2 = f7;
            z2 = false;
            z = true;
            if (!Float.isNaN(f22)) {
                view2.setRotation((float) (((double) Utils.FLOAT_EPSILON) + ((double) f22) + Math.toDegrees(Math.atan2((double) (f10 + (f12 / 2.0f)), (double) (f9 + (f11 / 2.0f))))));
            }
        }
        if (view2 instanceof r42) {
            ((r42) view2).mo4980a(f4, f5, f6 + f4, f5 + f2);
            return;
        }
        float f23 = f4 + 0.5f;
        int i5 = (int) f23;
        float f24 = f5 + 0.5f;
        int i6 = (int) f24;
        int i7 = (int) (f23 + f6);
        int i8 = (int) (f24 + f2);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (!(i9 == view.getMeasuredWidth() && i10 == view.getMeasuredHeight())) {
            z2 = z;
        }
        if (z2) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view2.layout(i5, i6, i7, i8);
    }

    /* renamed from: z */
    public void mo26615z(jy3 jy3, ty3 ty3) {
        double d = (double) (((this.f18327k + (this.f18329s / 2.0f)) - ty3.f18327k) - (ty3.f18329s / 2.0f));
        double d2 = (double) (((this.f18328r + (this.f18330x / 2.0f)) - ty3.f18328r) - (ty3.f18330x / 2.0f));
        this.f18317I = jy3;
        this.f18327k = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f18316H)) {
            this.f18328r = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f18328r = (float) Math.toRadians((double) this.f18316H);
        }
    }

    public ty3(int i, int i2, xa3 xa3, ty3 ty3, ty3 ty32) {
        int i3 = y93.f20099f;
        this.f18314B = i3;
        this.f18315C = i3;
        this.f18316H = Float.NaN;
        this.f18317I = null;
        this.f18318L = new LinkedHashMap<>();
        this.f18319M = 0;
        this.f18321Q = new double[18];
        this.f18322U = new double[18];
        if (ty3.f18315C != y93.f20099f) {
            mo26610u(i, i2, xa3, ty3, ty32);
            return;
        }
        int i4 = xa3.f19798q;
        if (i4 == 1) {
            mo26609t(xa3, ty3, ty32);
        } else if (i4 != 2) {
            mo26608r(xa3, ty3, ty32);
        } else {
            mo26611v(i, i2, xa3, ty3, ty32);
        }
    }
}
