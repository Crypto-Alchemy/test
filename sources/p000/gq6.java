package p000;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* renamed from: gq6 */
/* compiled from: TimeCycleSplineSet */
public abstract class gq6 {

    /* renamed from: k */
    public static float f12567k = 6.2831855f;

    /* renamed from: a */
    public ux0 f12568a;

    /* renamed from: b */
    public int f12569b = 0;

    /* renamed from: c */
    public int[] f12570c = new int[10];

    /* renamed from: d */
    public float[][] f12571d = ((float[][]) Array.newInstance(Float.TYPE, new int[]{10, 3}));

    /* renamed from: e */
    public int f12572e;

    /* renamed from: f */
    public String f12573f;

    /* renamed from: g */
    public float[] f12574g = new float[3];

    /* renamed from: h */
    public boolean f12575h = false;

    /* renamed from: i */
    public long f12576i;

    /* renamed from: j */
    public float f12577j = Float.NaN;

    /* renamed from: gq6$a */
    /* compiled from: TimeCycleSplineSet */
    public static class C2419a {
        /* renamed from: a */
        public static void m18362a(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int b = m18363b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = b + 1;
                }
            }
        }

        /* renamed from: b */
        public static int m18363b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m18364c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m18364c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        public static void m18364c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* renamed from: a */
    public float mo20811a(float f) {
        float abs;
        switch (this.f12569b) {
            case 1:
                return Math.signum(f * f12567k);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * f12567k));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * f12567k));
        }
        return 1.0f - abs;
    }

    /* renamed from: b */
    public void mo20812b(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f12570c;
        int i3 = this.f12572e;
        iArr[i3] = i;
        float[] fArr = this.f12571d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f12569b = Math.max(this.f12569b, i2);
        this.f12572e++;
    }

    /* renamed from: c */
    public void mo20813c(long j) {
        this.f12576i = j;
    }

    /* renamed from: d */
    public void mo20814d(String str) {
        this.f12573f = str;
    }

    /* renamed from: e */
    public void mo20815e(int i) {
        int i2 = this.f12572e;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f12573f);
            return;
        }
        C2419a.m18362a(this.f12570c, this.f12571d, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f12570c;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        int[] iArr2 = new int[2];
        iArr2[1] = 3;
        iArr2[0] = i4;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f12572e; i6++) {
            if (i6 > 0) {
                int[] iArr3 = this.f12570c;
                if (iArr3[i6] == iArr3[i6 - 1]) {
                }
            }
            dArr[i5] = ((double) this.f12570c[i6]) * 0.01d;
            double[] dArr3 = dArr2[i5];
            float[] fArr = this.f12571d[i6];
            dArr3[0] = (double) fArr[0];
            dArr3[1] = (double) fArr[1];
            dArr3[2] = (double) fArr[2];
            i5++;
        }
        this.f12568a = ux0.m28444a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f12573f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f12572e; i++) {
            str = str + "[" + this.f12570c[i] + " , " + decimalFormat.format(this.f12571d[i]) + "] ";
        }
        return str;
    }
}
