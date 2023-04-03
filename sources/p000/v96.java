package p000;

import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: v96 */
/* compiled from: StepCurve */
public class v96 extends ym1 {

    /* renamed from: d */
    public wx3 f18712d;

    public v96(String str) {
        this.f20292a = str;
        double[] dArr = new double[(str.length() / 2)];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.f18712d = m28701d(Arrays.copyOf(dArr, i + 1));
    }

    /* renamed from: d */
    public static wx3 m28701d(double[] dArr) {
        double[] dArr2 = dArr;
        int length = (dArr2.length * 3) - 2;
        int length2 = dArr2.length - 1;
        double d = 1.0d / ((double) length2);
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = length;
        double[][] dArr3 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        double[] dArr4 = new double[length];
        for (int i = 0; i < dArr2.length; i++) {
            double d2 = dArr2[i];
            int i2 = i + length2;
            dArr3[i2][0] = d2;
            double d3 = ((double) i) * d;
            dArr4[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr3[i3][0] = d2 + 1.0d;
                dArr4[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr3[i4][0] = (d2 - 1.0d) - d;
                dArr4[i4] = (d3 - 4.0d) - d;
            }
        }
        wx3 wx3 = new wx3(dArr4, dArr3);
        System.out.println(" 0 " + wx3.mo22300c(Utils.DOUBLE_EPSILON, 0));
        System.out.println(" 1 " + wx3.mo22300c(1.0d, 0));
        return wx3;
    }

    /* renamed from: a */
    public double mo21311a(double d) {
        return this.f18712d.mo22300c(d, 0);
    }

    /* renamed from: b */
    public double mo21312b(double d) {
        return this.f18712d.mo22303f(d, 0);
    }
}
