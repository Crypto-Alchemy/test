package p000;

import java.io.IOException;

/* renamed from: su8 */
public final class su8 extends lr8<su8> implements Cloneable {

    /* renamed from: e */
    public String[] f34014e;

    /* renamed from: g */
    public String[] f34015g;

    /* renamed from: k */
    public int[] f34016k = ws8.f35419a;

    /* renamed from: r */
    public long[] f34017r;

    /* renamed from: s */
    public long[] f34018s;

    public su8() {
        String[] strArr = ws8.f35424f;
        this.f34014e = strArr;
        this.f34015g = strArr;
        long[] jArr = ws8.f35420b;
        this.f34017r = jArr;
        this.f34018s = jArr;
        this.f31388d = null;
        this.f20992a = -1;
    }

    /* renamed from: a */
    public final void mo29047a(gr8 gr8) throws IOException {
        String[] strArr = this.f34014e;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f34014e;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    gr8.mo42957b(1, str);
                }
                i2++;
            }
        }
        String[] strArr3 = this.f34015g;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.f34015g;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    gr8.mo42957b(2, str2);
                }
                i3++;
            }
        }
        int[] iArr = this.f34016k;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f34016k;
                if (i4 >= iArr2.length) {
                    break;
                }
                gr8.mo42964l(3, iArr2[i4]);
                i4++;
            }
        }
        long[] jArr = this.f34017r;
        if (jArr != null && jArr.length > 0) {
            int i5 = 0;
            while (true) {
                long[] jArr2 = this.f34017r;
                if (i5 >= jArr2.length) {
                    break;
                }
                gr8.mo42967u(4, jArr2[i5]);
                i5++;
            }
        }
        long[] jArr3 = this.f34018s;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.f34018s;
                if (i >= jArr4.length) {
                    break;
                }
                gr8.mo42967u(5, jArr4[i]);
                i++;
            }
        }
        super.mo29047a(gr8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof su8)) {
            return false;
        }
        su8 su8 = (su8) obj;
        if (!xr8.m54526c(this.f34014e, su8.f34014e) || !xr8.m54526c(this.f34015g, su8.f34015g) || !xr8.m54524a(this.f34016k, su8.f34016k) || !xr8.m54525b(this.f34017r, su8.f34017r) || !xr8.m54525b(this.f34018s, su8.f34018s)) {
            return false;
        }
        qr8 qr8 = this.f31388d;
        if (qr8 != null && !qr8.mo47262a()) {
            return this.f31388d.equals(su8.f31388d);
        }
        qr8 qr82 = su8.f31388d;
        return qr82 == null || qr82.mo47262a();
    }

    /* renamed from: f */
    public final int mo29050f() {
        long[] jArr;
        int[] iArr;
        int f = super.mo29050f();
        String[] strArr = this.f34014e;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f34014e;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    i3 += gr8.m44869r(str);
                }
                i2++;
            }
            f = f + i3 + (i4 * 1);
        }
        String[] strArr3 = this.f34015g;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr4 = this.f34015g;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    i7++;
                    i6 += gr8.m44869r(str2);
                }
                i5++;
            }
            f = f + i6 + (i7 * 1);
        }
        int[] iArr2 = this.f34016k;
        if (iArr2 != null && iArr2.length > 0) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                iArr = this.f34016k;
                if (i8 >= iArr.length) {
                    break;
                }
                i9 += gr8.m44875z(iArr[i8]);
                i8++;
            }
            f = f + i9 + (iArr.length * 1);
        }
        long[] jArr2 = this.f34017r;
        if (jArr2 != null && jArr2.length > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                jArr = this.f34017r;
                if (i10 >= jArr.length) {
                    break;
                }
                i11 += gr8.m44873x(jArr[i10]);
                i10++;
            }
            f = f + i11 + (jArr.length * 1);
        }
        long[] jArr3 = this.f34018s;
        if (jArr3 == null || jArr3.length <= 0) {
            return f;
        }
        int i12 = 0;
        while (true) {
            long[] jArr4 = this.f34018s;
            if (i >= jArr4.length) {
                return f + i12 + (jArr4.length * 1);
            }
            i12 += gr8.m44873x(jArr4[i]);
            i++;
        }
    }

    /* renamed from: g */
    public final /* synthetic */ as8 mo29051g() throws CloneNotSupportedException {
        return (su8) clone();
    }

    /* renamed from: h */
    public final /* synthetic */ lr8 mo45497h() throws CloneNotSupportedException {
        return (su8) clone();
    }

    public final int hashCode() {
        int hashCode = (((((((((((su8.class.getName().hashCode() + 527) * 31) + xr8.m54529f(this.f34014e)) * 31) + xr8.m54529f(this.f34015g)) * 31) + xr8.m54527d(this.f34016k)) * 31) + xr8.m54528e(this.f34017r)) * 31) + xr8.m54528e(this.f34018s)) * 31;
        qr8 qr8 = this.f31388d;
        return hashCode + ((qr8 == null || qr8.mo47262a()) ? 0 : this.f31388d.hashCode());
    }

    /* renamed from: i */
    public final su8 clone() {
        try {
            su8 su8 = (su8) super.clone();
            String[] strArr = this.f34014e;
            if (strArr != null && strArr.length > 0) {
                su8.f34014e = (String[]) strArr.clone();
            }
            String[] strArr2 = this.f34015g;
            if (strArr2 != null && strArr2.length > 0) {
                su8.f34015g = (String[]) strArr2.clone();
            }
            int[] iArr = this.f34016k;
            if (iArr != null && iArr.length > 0) {
                su8.f34016k = (int[]) iArr.clone();
            }
            long[] jArr = this.f34017r;
            if (jArr != null && jArr.length > 0) {
                su8.f34017r = (long[]) jArr.clone();
            }
            long[] jArr2 = this.f34018s;
            if (jArr2 != null && jArr2.length > 0) {
                su8.f34018s = (long[]) jArr2.clone();
            }
            return su8;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
