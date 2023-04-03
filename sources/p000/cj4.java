package p000;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: cj4 */
/* compiled from: Oscillator */
public class cj4 {

    /* renamed from: a */
    public float[] f8439a = new float[0];

    /* renamed from: b */
    public double[] f8440b = new double[0];

    /* renamed from: c */
    public double[] f8441c;

    /* renamed from: d */
    public String f8442d;

    /* renamed from: e */
    public wx3 f8443e;

    /* renamed from: f */
    public int f8444f;

    /* renamed from: g */
    public double f8445g = 6.283185307179586d;

    /* renamed from: h */
    public boolean f8446h = false;

    /* renamed from: a */
    public void mo12069a(double d, float f) {
        int length = this.f8439a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f8440b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f8440b = Arrays.copyOf(this.f8440b, length);
        this.f8439a = Arrays.copyOf(this.f8439a, length);
        this.f8441c = new double[length];
        double[] dArr = this.f8440b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f8440b[binarySearch] = d;
        this.f8439a[binarySearch] = f;
        this.f8446h = false;
    }

    /* renamed from: b */
    public double mo12070b(double d) {
        if (d <= Utils.DOUBLE_EPSILON) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f8440b, d);
        if (binarySearch > 0 || binarySearch == 0) {
            return Utils.DOUBLE_EPSILON;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f8439a;
        float f = fArr[i];
        int i2 = i - 1;
        float f2 = fArr[i2];
        double d2 = (double) (f - f2);
        double[] dArr = this.f8440b;
        double d3 = dArr[i];
        double d4 = dArr[i2];
        double d5 = d2 / (d3 - d4);
        return (((double) f2) - (d5 * d4)) + (d * d5);
    }

    /* renamed from: c */
    public double mo12071c(double d) {
        if (d < Utils.DOUBLE_EPSILON) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f8440b, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return Utils.DOUBLE_EPSILON;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f8439a;
        float f = fArr[i];
        int i2 = i - 1;
        float f2 = fArr[i2];
        double d2 = (double) (f - f2);
        double[] dArr = this.f8440b;
        double d3 = dArr[i];
        double d4 = dArr[i2];
        double d5 = d2 / (d3 - d4);
        return this.f8441c[i2] + ((((double) f2) - (d5 * d4)) * (d - d4)) + ((d5 * ((d * d) - (d4 * d4))) / 2.0d);
    }

    /* renamed from: d */
    public double mo12072d(double d, double d2, double d3) {
        double c = d2 + mo12071c(d);
        double b = mo12070b(d) + d3;
        switch (this.f8444f) {
            case 1:
                return Utils.DOUBLE_EPSILON;
            case 2:
                return b * 4.0d * Math.signum((((c * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return b * 2.0d;
            case 4:
                return (-b) * 2.0d;
            case 5:
                double d4 = this.f8445g;
                return (-d4) * b * Math.sin(d4 * c);
            case 6:
                return b * 4.0d * ((((c * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f8443e.mo22303f(c % 1.0d, 0);
            default:
                double d5 = this.f8445g;
                return b * d5 * Math.cos(d5 * c);
        }
    }

    /* renamed from: e */
    public double mo12073e(double d, double d2) {
        double abs;
        double c = mo12071c(d) + d2;
        switch (this.f8444f) {
            case 1:
                return Math.signum(0.5d - (c % 1.0d));
            case 2:
                abs = Math.abs((((c * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f8445g * (d2 + c));
            case 6:
                double abs2 = 1.0d - Math.abs(((c * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f8443e.mo22300c(c % 1.0d, 0);
            default:
                return Math.sin(this.f8445g * c);
        }
        return 1.0d - abs;
    }

    /* renamed from: f */
    public void mo12074f() {
        int i = 0;
        double d = 0.0d;
        while (true) {
            float[] fArr = this.f8439a;
            if (i >= fArr.length) {
                break;
            }
            d += (double) fArr[i];
            i++;
        }
        double d2 = 0.0d;
        int i2 = 1;
        while (true) {
            float[] fArr2 = this.f8439a;
            if (i2 >= fArr2.length) {
                break;
            }
            int i3 = i2 - 1;
            double[] dArr = this.f8440b;
            d2 += (dArr[i2] - dArr[i3]) * ((double) ((fArr2[i3] + fArr2[i2]) / 2.0f));
            i2++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr3 = this.f8439a;
            if (i4 >= fArr3.length) {
                break;
            }
            fArr3[i4] = (float) (((double) fArr3[i4]) * (d / d2));
            i4++;
        }
        this.f8441c[0] = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr4 = this.f8439a;
            if (i5 < fArr4.length) {
                int i6 = i5 - 1;
                double[] dArr2 = this.f8440b;
                double d3 = dArr2[i5] - dArr2[i6];
                double[] dArr3 = this.f8441c;
                dArr3[i5] = dArr3[i6] + (d3 * ((double) ((fArr4[i6] + fArr4[i5]) / 2.0f)));
                i5++;
            } else {
                this.f8446h = true;
                return;
            }
        }
    }

    /* renamed from: g */
    public void mo12075g(int i, String str) {
        this.f8444f = i;
        this.f8442d = str;
        if (str != null) {
            this.f8443e = wx3.m29740i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f8440b) + " period=" + Arrays.toString(this.f8439a);
    }
}
