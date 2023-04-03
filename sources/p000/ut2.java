package p000;

import p000.xs5;

/* renamed from: ut2 */
/* compiled from: IndexSeeker */
public final class ut2 implements at5 {

    /* renamed from: a */
    public final long f18574a;

    /* renamed from: b */
    public final cl3 f18575b;

    /* renamed from: c */
    public final cl3 f18576c;

    /* renamed from: d */
    public long f18577d;

    public ut2(long j, long j2, long j3) {
        this.f18577d = j;
        this.f18574a = j3;
        cl3 cl3 = new cl3();
        this.f18575b = cl3;
        cl3 cl32 = new cl3();
        this.f18576c = cl32;
        cl3.mo12103a(0);
        cl32.mo12103a(j2);
    }

    /* renamed from: a */
    public boolean mo26867a(long j) {
        cl3 cl3 = this.f18575b;
        if (j - cl3.mo12104b(cl3.mo12105c() - 1) < 100000) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo26868b(long j, long j2) {
        if (!mo26867a(j)) {
            this.f18575b.mo12103a(j);
            this.f18576c.mo12103a(j2);
        }
    }

    /* renamed from: c */
    public long mo11141c(long j) {
        return this.f18575b.mo12104b(w67.m29352f(this.f18576c, j, true, true));
    }

    /* renamed from: d */
    public void mo26869d(long j) {
        this.f18577d = j;
    }

    /* renamed from: f */
    public xs5.C3641a mo11155f(long j) {
        int f = w67.m29352f(this.f18575b, j, true, true);
        zs5 zs5 = new zs5(this.f18575b.mo12104b(f), this.f18576c.mo12104b(f));
        if (zs5.f20675a == j || f == this.f18575b.mo12105c() - 1) {
            return new xs5.C3641a(zs5);
        }
        int i = f + 1;
        return new xs5.C3641a(zs5, new zs5(this.f18575b.mo12104b(i), this.f18576c.mo12104b(i)));
    }

    /* renamed from: g */
    public long mo11142g() {
        return this.f18574a;
    }

    /* renamed from: h */
    public boolean mo11156h() {
        return true;
    }

    /* renamed from: i */
    public long mo11157i() {
        return this.f18577d;
    }
}
