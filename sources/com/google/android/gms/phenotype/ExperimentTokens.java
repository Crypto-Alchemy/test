package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExperimentTokens extends AbstractSafeParcelable {

    /* renamed from: A */
    public static final ExperimentTokens f23111A;

    /* renamed from: B */
    public static final C4150a f23112B = new C4151a();

    /* renamed from: C */
    public static final C4150a f23113C = new C4152b();
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new xu8();

    /* renamed from: H */
    public static final C4150a f23114H = new C4153c();

    /* renamed from: I */
    public static final C4150a f23115I = new C4154d();

    /* renamed from: y */
    public static final byte[][] f23116y;

    /* renamed from: a */
    public final String f23117a;

    /* renamed from: d */
    public final byte[] f23118d;

    /* renamed from: e */
    public final byte[][] f23119e;

    /* renamed from: g */
    public final byte[][] f23120g;

    /* renamed from: k */
    public final byte[][] f23121k;

    /* renamed from: r */
    public final byte[][] f23122r;

    /* renamed from: s */
    public final int[] f23123s;

    /* renamed from: x */
    public final byte[][] f23124x;

    /* renamed from: com.google.android.gms.phenotype.ExperimentTokens$a */
    public interface C4150a {
    }

    static {
        byte[][] bArr = new byte[0][];
        f23116y = bArr;
        f23111A = new ExperimentTokens("", (byte[]) null, bArr, bArr, bArr, bArr, (int[]) null, (byte[][]) null);
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f23117a = str;
        this.f23118d = bArr;
        this.f23119e = bArr2;
        this.f23120g = bArr3;
        this.f23121k = bArr4;
        this.f23122r = bArr5;
        this.f23123s = iArr;
        this.f23124x = bArr6;
    }

    /* renamed from: r1 */
    public static List<Integer> m34504r1(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: s1 */
    public static List<String> m34505s1(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: t1 */
    public static void m34506t1(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            return eb9.m43890a(this.f23117a, experimentTokens.f23117a) && Arrays.equals(this.f23118d, experimentTokens.f23118d) && eb9.m43890a(m34505s1(this.f23119e), m34505s1(experimentTokens.f23119e)) && eb9.m43890a(m34505s1(this.f23120g), m34505s1(experimentTokens.f23120g)) && eb9.m43890a(m34505s1(this.f23121k), m34505s1(experimentTokens.f23121k)) && eb9.m43890a(m34505s1(this.f23122r), m34505s1(experimentTokens.f23122r)) && eb9.m43890a(m34504r1(this.f23123s), m34504r1(experimentTokens.f23123s)) && eb9.m43890a(m34505s1(this.f23124x), m34505s1(experimentTokens.f23124x));
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.f23117a;
        if (str2 == null) {
            str = "null";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2);
            sb2.append("'");
            sb2.append(str2);
            sb2.append("'");
            str = sb2.toString();
        }
        sb.append(str);
        sb.append(", ");
        byte[] bArr = this.f23118d;
        sb.append("direct");
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        m34506t1(sb, "GAIA", this.f23119e);
        sb.append(", ");
        m34506t1(sb, "PSEUDO", this.f23120g);
        sb.append(", ");
        m34506t1(sb, "ALWAYS", this.f23121k);
        sb.append(", ");
        m34506t1(sb, "OTHER", this.f23122r);
        sb.append(", ");
        int[] iArr = this.f23123s;
        sb.append("weak");
        sb.append("=");
        if (iArr == null) {
            sb.append("null");
        } else {
            sb.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append(")");
        }
        sb.append(", ");
        m34506t1(sb, "directs", this.f23124x);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 2, this.f23117a, false);
        rk5.m51130f(parcel, 3, this.f23118d, false);
        rk5.m51131g(parcel, 4, this.f23119e, false);
        rk5.m51131g(parcel, 5, this.f23120g, false);
        rk5.m51131g(parcel, 6, this.f23121k, false);
        rk5.m51131g(parcel, 7, this.f23122r, false);
        rk5.m51138n(parcel, 8, this.f23123s, false);
        rk5.m51131g(parcel, 9, this.f23124x, false);
        rk5.m51126b(parcel, a);
    }
}
