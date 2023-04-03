package p000;

import java.util.ArrayList;
import java.util.zip.Inflater;
import p000.yw4;

/* renamed from: zw4 */
/* compiled from: ProjectionDecoder */
public final class zw4 {
    /* renamed from: a */
    public static yw4 m31556a(byte[] bArr, int i) {
        ArrayList<yw4.C3698a> arrayList;
        gm4 gm4 = new gm4(bArr);
        try {
            if (m31558c(gm4)) {
                arrayList = m31561f(gm4);
            } else {
                arrayList = m31560e(gm4);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new yw4(arrayList.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new yw4(arrayList.get(0), arrayList.get(1), i);
    }

    /* renamed from: b */
    public static int m31557b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    /* renamed from: c */
    public static boolean m31558c(gm4 gm4) {
        gm4.mo20675Q(4);
        int n = gm4.mo20689n();
        gm4.mo20674P(0);
        if (n == 1886547818) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static yw4.C3698a m31559d(gm4 gm4) {
        int n = gm4.mo20689n();
        if (n > 10000) {
            return null;
        }
        float[] fArr = new float[n];
        for (int i = 0; i < n; i++) {
            fArr[i] = gm4.mo20688m();
        }
        int n2 = gm4.mo20689n();
        if (n2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(((double) n) * 2.0d) / log);
        fm4 fm4 = new fm4(gm4.mo20679d());
        int i2 = 8;
        fm4.mo20012p(gm4.mo20680e() * 8);
        float[] fArr2 = new float[(n2 * 5)];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < n2) {
            int i6 = 0;
            while (i6 < i3) {
                int b = iArr[i6] + m31557b(fm4.mo20004h(ceil));
                if (b >= n || b < 0) {
                    return null;
                }
                fArr2[i5] = fArr[b];
                iArr[i6] = b;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        fm4.mo20012p((fm4.mo20001e() + 7) & -8);
        int i7 = 32;
        int h = fm4.mo20004h(32);
        yw4.C3699b[] bVarArr = new yw4.C3699b[h];
        int i8 = 0;
        while (i8 < h) {
            int h2 = fm4.mo20004h(i2);
            int h3 = fm4.mo20004h(i2);
            int h4 = fm4.mo20004h(i7);
            if (h4 > 128000) {
                return null;
            }
            int i9 = h2;
            int ceil2 = (int) Math.ceil(Math.log(((double) n2) * d) / log);
            float[] fArr3 = new float[(h4 * 3)];
            float[] fArr4 = new float[(h4 * 2)];
            int i10 = 0;
            for (int i11 = 0; i11 < h4; i11++) {
                i10 += m31557b(fm4.mo20004h(ceil2));
                if (i10 < 0 || i10 >= n2) {
                    return null;
                }
                int i12 = i11 * 3;
                int i13 = i10 * 5;
                fArr3[i12] = fArr2[i13];
                fArr3[i12 + 1] = fArr2[i13 + 1];
                fArr3[i12 + 2] = fArr2[i13 + 2];
                int i14 = i11 * 2;
                fArr4[i14] = fArr2[i13 + 3];
                fArr4[i14 + 1] = fArr2[i13 + 4];
            }
            bVarArr[i8] = new yw4.C3699b(i9, fArr3, fArr4, h3);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new yw4.C3698a(bVarArr);
    }

    /* renamed from: e */
    public static ArrayList<yw4.C3698a> m31560e(gm4 gm4) {
        if (gm4.mo20662D() != 0) {
            return null;
        }
        gm4.mo20675Q(7);
        int n = gm4.mo20689n();
        if (n == 1684433976) {
            gm4 gm42 = new gm4();
            Inflater inflater = new Inflater(true);
            try {
                if (!w67.m29369n0(gm4, gm42, inflater)) {
                    return null;
                }
                inflater.end();
                gm4 = gm42;
            } finally {
                inflater.end();
            }
        } else if (n != 1918990112) {
            return null;
        }
        return m31562g(gm4);
    }

    /* renamed from: f */
    public static ArrayList<yw4.C3698a> m31561f(gm4 gm4) {
        int n;
        gm4.mo20675Q(8);
        int e = gm4.mo20680e();
        int f = gm4.mo20681f();
        while (e < f && (n = gm4.mo20689n() + e) > e && n <= f) {
            int n2 = gm4.mo20689n();
            if (n2 == 2037673328 || n2 == 1836279920) {
                gm4.mo20673O(n);
                return m31560e(gm4);
            }
            gm4.mo20674P(n);
            e = n;
        }
        return null;
    }

    /* renamed from: g */
    public static ArrayList<yw4.C3698a> m31562g(gm4 gm4) {
        ArrayList<yw4.C3698a> arrayList = new ArrayList<>();
        int e = gm4.mo20680e();
        int f = gm4.mo20681f();
        while (e < f) {
            int n = gm4.mo20689n() + e;
            if (n <= e || n > f) {
                return null;
            }
            if (gm4.mo20689n() == 1835365224) {
                yw4.C3698a d = m31559d(gm4);
                if (d == null) {
                    return null;
                }
                arrayList.add(d);
            }
            gm4.mo20674P(n);
            e = n;
        }
        return arrayList;
    }
}
