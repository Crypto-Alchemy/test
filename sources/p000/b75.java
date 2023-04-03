package p000;

import android.net.Uri;

/* renamed from: b75 */
/* compiled from: RangedUri */
public final class b75 {

    /* renamed from: a */
    public final long f7983a;

    /* renamed from: b */
    public final long f7984b;

    /* renamed from: c */
    public final String f7985c;

    /* renamed from: d */
    public int f7986d;

    public b75(String str, long j, long j2) {
        this.f7985c = str == null ? "" : str;
        this.f7983a = j;
        this.f7984b = j2;
    }

    /* renamed from: a */
    public b75 mo11423a(b75 b75, String str) {
        String c = mo11425c(str);
        if (b75 != null && c.equals(b75.mo11425c(str))) {
            long j = this.f7984b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.f7983a;
                if (j3 + j == b75.f7983a) {
                    long j4 = b75.f7984b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new b75(c, j3, j2);
                }
            }
            long j5 = b75.f7984b;
            if (j5 != -1) {
                long j6 = b75.f7983a;
                if (j6 + j5 == this.f7983a) {
                    if (j != -1) {
                        j2 = j5 + j;
                    }
                    return new b75(c, j6, j2);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Uri mo11424b(String str) {
        return j57.m19972e(str, this.f7985c);
    }

    /* renamed from: c */
    public String mo11425c(String str) {
        return j57.m19971d(str, this.f7985c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b75.class != obj.getClass()) {
            return false;
        }
        b75 b75 = (b75) obj;
        if (this.f7983a == b75.f7983a && this.f7984b == b75.f7984b && this.f7985c.equals(b75.f7985c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f7986d == 0) {
            this.f7986d = ((((527 + ((int) this.f7983a)) * 31) + ((int) this.f7984b)) * 31) + this.f7985c.hashCode();
        }
        return this.f7986d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f7985c + ", start=" + this.f7983a + ", length=" + this.f7984b + ")";
    }
}
