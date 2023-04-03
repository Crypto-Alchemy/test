package p000;

import java.util.NoSuchElementException;

/* renamed from: wy */
/* compiled from: BaseMediaChunkIterator */
public abstract class C3562wy implements rq3 {

    /* renamed from: b */
    public final long f19249b;

    /* renamed from: c */
    public final long f19250c;

    /* renamed from: d */
    public long f19251d;

    public C3562wy(long j, long j2) {
        this.f19249b = j;
        this.f19250c = j2;
        mo27620f();
    }

    /* renamed from: c */
    public final void mo27617c() {
        long j = this.f19251d;
        if (j < this.f19249b || j > this.f19250c) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d */
    public final long mo27618d() {
        return this.f19251d;
    }

    /* renamed from: e */
    public boolean mo27619e() {
        if (this.f19251d > this.f19250c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo27620f() {
        this.f19251d = this.f19249b - 1;
    }

    public boolean next() {
        this.f19251d++;
        return !mo27619e();
    }
}
