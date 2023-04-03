package com.bumptech.glide.load.engine;

/* renamed from: com.bumptech.glide.load.engine.h */
/* compiled from: EngineResource */
public class C1774h<Z> implements bf5<Z> {

    /* renamed from: a */
    public final boolean f8886a;

    /* renamed from: d */
    public final boolean f8887d;

    /* renamed from: e */
    public final bf5<Z> f8888e;

    /* renamed from: g */
    public final C1775a f8889g;

    /* renamed from: k */
    public final z93 f8890k;

    /* renamed from: r */
    public int f8891r;

    /* renamed from: s */
    public boolean f8892s;

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    /* compiled from: EngineResource */
    public interface C1775a {
        /* renamed from: c */
        void mo12519c(z93 z93, C1774h<?> hVar);
    }

    public C1774h(bf5<Z> bf5, boolean z, boolean z2, z93 z93, C1775a aVar) {
        this.f8888e = (bf5) zt4.m31500d(bf5);
        this.f8886a = z;
        this.f8887d = z2;
        this.f8890k = z93;
        this.f8889g = (C1775a) zt4.m31500d(aVar);
    }

    /* renamed from: a */
    public synchronized void mo11634a() {
        if (this.f8891r > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f8892s) {
            this.f8892s = true;
            if (this.f8887d) {
                this.f8888e.mo11634a();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* renamed from: b */
    public synchronized void mo12562b() {
        if (!this.f8892s) {
            this.f8891r++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: c */
    public Class<Z> mo11635c() {
        return this.f8888e.mo11635c();
    }

    /* renamed from: d */
    public bf5<Z> mo12563d() {
        return this.f8888e;
    }

    /* renamed from: e */
    public boolean mo12564e() {
        return this.f8886a;
    }

    /* renamed from: f */
    public void mo12565f() {
        boolean z;
        synchronized (this) {
            int i = this.f8891r;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f8891r = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f8889g.mo12519c(this.f8890k, this);
        }
    }

    public Z get() {
        return this.f8888e.get();
    }

    public int getSize() {
        return this.f8888e.getSize();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f8886a + ", listener=" + this.f8889g + ", key=" + this.f8890k + ", acquired=" + this.f8891r + ", isRecycled=" + this.f8892s + ", resource=" + this.f8888e + '}';
    }
}
