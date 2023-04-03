package p000;

import p000.xs5;

/* renamed from: nj7 */
/* compiled from: WavSeekMap */
public final class nj7 implements xs5 {

    /* renamed from: a */
    public final lj7 f15569a;

    /* renamed from: b */
    public final int f15570b;

    /* renamed from: c */
    public final long f15571c;

    /* renamed from: d */
    public final long f15572d;

    /* renamed from: e */
    public final long f15573e;

    public nj7(lj7 lj7, int i, long j, long j2) {
        this.f15569a = lj7;
        this.f15570b = i;
        this.f15571c = j;
        long j3 = (j2 - j) / ((long) lj7.f14534e);
        this.f15572d = j3;
        this.f15573e = mo23707a(j3);
    }

    /* renamed from: a */
    public final long mo23707a(long j) {
        return w67.m29313J0(j * ((long) this.f15570b), 1000000, (long) this.f15569a.f14532c);
    }

    /* renamed from: f */
    public xs5.C3641a mo11155f(long j) {
        long r = w67.m29376r((((long) this.f15569a.f14532c) * j) / (((long) this.f15570b) * 1000000), 0, this.f15572d - 1);
        long j2 = this.f15571c + (((long) this.f15569a.f14534e) * r);
        long a = mo23707a(r);
        zs5 zs5 = new zs5(a, j2);
        if (a >= j || r == this.f15572d - 1) {
            return new xs5.C3641a(zs5);
        }
        long j3 = r + 1;
        return new xs5.C3641a(zs5, new zs5(mo23707a(j3), this.f15571c + (((long) this.f15569a.f14534e) * j3)));
    }

    /* renamed from: h */
    public boolean mo11156h() {
        return true;
    }

    /* renamed from: i */
    public long mo11157i() {
        return this.f15573e;
    }
}
