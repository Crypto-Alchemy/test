package p000;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* renamed from: v66 */
/* compiled from: SplineSet */
public abstract class v66 {

    /* renamed from: a */
    public ux0 f18690a;

    /* renamed from: b */
    public int[] f18691b = new int[10];

    /* renamed from: c */
    public float[] f18692c = new float[10];

    /* renamed from: d */
    public int f18693d;

    /* renamed from: e */
    public String f18694e;

    /* renamed from: v66$a */
    /* compiled from: SplineSet */
    public static class C3466a {
        /* renamed from: a */
        public static void m28672a(int[] iArr, float[] fArr, int i, int i2) {
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
                    int b = m28673b(iArr, fArr, i5, i6);
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
        public static int m28673b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m28674c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m28674c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        public static void m28674c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* renamed from: a */
    public float mo27074a(float f) {
        return (float) this.f18690a.mo22300c((double) f, 0);
    }

    /* renamed from: b */
    public float mo27075b(float f) {
        return (float) this.f18690a.mo22303f((double) f, 0);
    }

    /* renamed from: c */
    public void mo18740c(int i, float f) {
        int[] iArr = this.f18691b;
        if (iArr.length < this.f18693d + 1) {
            this.f18691b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f18692c;
            this.f18692c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f18691b;
        int i2 = this.f18693d;
        iArr2[i2] = i;
        this.f18692c[i2] = f;
        this.f18693d = i2 + 1;
    }

    /* renamed from: d */
    public void mo27076d(String str) {
        this.f18694e = str;
    }

    /* renamed from: e */
    public void mo18741e(int i) {
        int i2 = this.f18693d;
        if (i2 != 0) {
            C3466a.m28672a(this.f18691b, this.f18692c, 0, i2 - 1);
            int i3 = 1;
            for (int i4 = 1; i4 < this.f18693d; i4++) {
                int[] iArr = this.f18691b;
                if (iArr[i4 - 1] != iArr[i4]) {
                    i3++;
                }
            }
            double[] dArr = new double[i3];
            int[] iArr2 = new int[2];
            iArr2[1] = 1;
            iArr2[0] = i3;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
            int i5 = 0;
            for (int i6 = 0; i6 < this.f18693d; i6++) {
                if (i6 > 0) {
                    int[] iArr3 = this.f18691b;
                    if (iArr3[i6] == iArr3[i6 - 1]) {
                    }
                }
                dArr[i5] = ((double) this.f18691b[i6]) * 0.01d;
                dArr2[i5][0] = (double) this.f18692c[i6];
                i5++;
            }
            this.f18690a = ux0.m28444a(i, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.f18694e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f18693d; i++) {
            str = str + "[" + this.f18691b[i] + " , " + decimalFormat.format((double) this.f18692c[i]) + "] ";
        }
        return str;
    }
}
