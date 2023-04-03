package p000;

import p000.uy1;

/* renamed from: fk3 */
/* compiled from: LockedResource */
public final class fk3<Z> implements bf5<Z>, uy1.C3446f {

    /* renamed from: k */
    public static final ys4<fk3<?>> f11892k = uy1.m28526d(20, new C2301a());

    /* renamed from: a */
    public final d96 f11893a = d96.m14869a();

    /* renamed from: d */
    public bf5<Z> f11894d;

    /* renamed from: e */
    public boolean f11895e;

    /* renamed from: g */
    public boolean f11896g;

    /* renamed from: fk3$a */
    /* compiled from: LockedResource */
    public class C2301a implements uy1.C3444d<fk3<?>> {
        /* renamed from: b */
        public fk3<?> mo12529a() {
            return new fk3<>();
        }
    }

    /* renamed from: e */
    public static <Z> fk3<Z> m17041e(bf5<Z> bf5) {
        fk3<Z> fk3 = (fk3) zt4.m31500d(f11892k.mo11139b());
        fk3.mo19948b(bf5);
        return fk3;
    }

    /* renamed from: a */
    public synchronized void mo11634a() {
        this.f11893a.mo18594c();
        this.f11896g = true;
        if (!this.f11895e) {
            this.f11894d.mo11634a();
            mo19949f();
        }
    }

    /* renamed from: b */
    public final void mo19948b(bf5<Z> bf5) {
        this.f11896g = false;
        this.f11895e = true;
        this.f11894d = bf5;
    }

    /* renamed from: c */
    public Class<Z> mo11635c() {
        return this.f11894d.mo11635c();
    }

    /* renamed from: d */
    public d96 mo12421d() {
        return this.f11893a;
    }

    /* renamed from: f */
    public final void mo19949f() {
        this.f11894d = null;
        f11892k.mo11138a(this);
    }

    /* renamed from: g */
    public synchronized void mo19950g() {
        this.f11893a.mo18594c();
        if (this.f11895e) {
            this.f11895e = false;
            if (this.f11896g) {
                mo11634a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public Z get() {
        return this.f11894d.get();
    }

    public int getSize() {
        return this.f11894d.getSize();
    }
}
