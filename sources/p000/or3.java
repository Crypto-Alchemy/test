package p000;

import androidx.media3.exoplayer.source.C0973i;

/* renamed from: or3 */
/* compiled from: MediaPeriodInfo */
public final class or3 {

    /* renamed from: a */
    public final C0973i.C0975b f16038a;

    /* renamed from: b */
    public final long f16039b;

    /* renamed from: c */
    public final long f16040c;

    /* renamed from: d */
    public final long f16041d;

    /* renamed from: e */
    public final long f16042e;

    /* renamed from: f */
    public final boolean f16043f;

    /* renamed from: g */
    public final boolean f16044g;

    /* renamed from: h */
    public final boolean f16045h;

    /* renamed from: i */
    public final boolean f16046i;

    public or3(C0973i.C0975b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7 = z;
        boolean z8 = z2;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = false;
        if (!z10 || z8) {
            z5 = true;
        } else {
            z5 = false;
        }
        C2725kr.m20981a(z5);
        if (!z9 || z8) {
            z6 = true;
        } else {
            z6 = false;
        }
        C2725kr.m20981a(z6);
        if (!z7 || (!z8 && !z9 && !z10)) {
            z11 = true;
        }
        C2725kr.m20981a(z11);
        this.f16038a = bVar;
        this.f16039b = j;
        this.f16040c = j2;
        this.f16041d = j3;
        this.f16042e = j4;
        this.f16043f = z7;
        this.f16044g = z8;
        this.f16045h = z9;
        this.f16046i = z10;
    }

    /* renamed from: a */
    public or3 mo24082a(long j) {
        if (j == this.f16040c) {
            return this;
        }
        return new or3(this.f16038a, this.f16039b, j, this.f16041d, this.f16042e, this.f16043f, this.f16044g, this.f16045h, this.f16046i);
    }

    /* renamed from: b */
    public or3 mo24083b(long j) {
        if (j == this.f16039b) {
            return this;
        }
        return new or3(this.f16038a, j, this.f16040c, this.f16041d, this.f16042e, this.f16043f, this.f16044g, this.f16045h, this.f16046i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || or3.class != obj.getClass()) {
            return false;
        }
        or3 or3 = (or3) obj;
        if (this.f16039b == or3.f16039b && this.f16040c == or3.f16040c && this.f16041d == or3.f16041d && this.f16042e == or3.f16042e && this.f16043f == or3.f16043f && this.f16044g == or3.f16044g && this.f16045h == or3.f16045h && this.f16046i == or3.f16046i && w67.m29346c(this.f16038a, or3.f16038a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f16038a.hashCode()) * 31) + ((int) this.f16039b)) * 31) + ((int) this.f16040c)) * 31) + ((int) this.f16041d)) * 31) + ((int) this.f16042e)) * 31) + (this.f16043f ? 1 : 0)) * 31) + (this.f16044g ? 1 : 0)) * 31) + (this.f16045h ? 1 : 0)) * 31) + (this.f16046i ? 1 : 0);
    }
}
