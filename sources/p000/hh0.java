package p000;

/* renamed from: hh0 */
/* compiled from: CloseableAnimatedImage */
public class hh0 extends kh0 {

    /* renamed from: e */
    public C3078pk f12883e;

    /* renamed from: g */
    public boolean f12884g;

    public hh0(C3078pk pkVar) {
        this(pkVar, true);
    }

    /* renamed from: b */
    public synchronized int mo21175b() {
        int i;
        C3078pk pkVar = this.f12883e;
        if (pkVar == null) {
            i = 0;
        } else {
            i = pkVar.mo24625d().mo13076g();
        }
        return i;
    }

    /* renamed from: c */
    public boolean mo21176c() {
        return this.f12884g;
    }

    public void close() {
        synchronized (this) {
            C3078pk pkVar = this.f12883e;
            if (pkVar != null) {
                this.f12883e = null;
                pkVar.mo24623a();
            }
        }
    }

    /* renamed from: f */
    public synchronized C2687kk mo21178f() {
        C2687kk kkVar;
        C3078pk pkVar = this.f12883e;
        if (pkVar == null) {
            kkVar = null;
        } else {
            kkVar = pkVar.mo24625d();
        }
        return kkVar;
    }

    /* renamed from: g */
    public synchronized C3078pk mo21179g() {
        return this.f12883e;
    }

    public synchronized int getHeight() {
        int i;
        C3078pk pkVar = this.f12883e;
        if (pkVar == null) {
            i = 0;
        } else {
            i = pkVar.mo24625d().getHeight();
        }
        return i;
    }

    public synchronized int getWidth() {
        int i;
        C3078pk pkVar = this.f12883e;
        if (pkVar == null) {
            i = 0;
        } else {
            i = pkVar.mo24625d().getWidth();
        }
        return i;
    }

    public synchronized boolean isClosed() {
        boolean z;
        if (this.f12883e == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public hh0(C3078pk pkVar, boolean z) {
        this.f12883e = pkVar;
        this.f12884g = z;
    }
}
