package p000;

/* renamed from: qo8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public abstract class qo8 extends al8 {

    /* renamed from: b */
    public boolean f33209b;

    public qo8(kr8 kr8) {
        super(kr8);
        this.f34342a.mo45266l();
    }

    /* renamed from: f */
    public final boolean mo47218f() {
        return this.f33209b;
    }

    /* renamed from: g */
    public final void mo47219g() {
        if (!mo47218f()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: h */
    public final void mo47220h() {
        if (this.f33209b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo41976j()) {
            this.f34342a.mo45267m();
            this.f33209b = true;
        }
    }

    /* renamed from: i */
    public final void mo47221i() {
        if (!this.f33209b) {
            mo41977k();
            this.f34342a.mo45267m();
            this.f33209b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: j */
    public abstract boolean mo41976j();

    /* renamed from: k */
    public void mo41977k() {
    }
}
