package p000;

/* renamed from: vt8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public abstract class vt8 extends tt8 {

    /* renamed from: b */
    public boolean f35125b;

    public vt8(kr8 kr8) {
        super(kr8);
        this.f34342a.mo45266l();
    }

    /* renamed from: f */
    public abstract boolean mo29669f();

    /* renamed from: g */
    public void mo42811g() {
    }

    /* renamed from: h */
    public final boolean mo48800h() {
        return this.f35125b;
    }

    /* renamed from: i */
    public final void mo48801i() {
        if (!mo48800h()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo48802j() {
        if (this.f35125b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo29669f()) {
            this.f34342a.mo45267m();
            this.f35125b = true;
        }
    }

    /* renamed from: k */
    public final void mo48803k() {
        if (!this.f35125b) {
            mo42811g();
            this.f34342a.mo45267m();
            this.f35125b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
