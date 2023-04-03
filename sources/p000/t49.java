package p000;

/* renamed from: t49 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public abstract class t49 extends r49 {

    /* renamed from: c */
    public boolean f34113c;

    public t49(s59 s59) {
        super(s59);
        this.f33321b.mo47678n();
    }

    /* renamed from: f */
    public final boolean mo47981f() {
        return this.f34113c;
    }

    /* renamed from: g */
    public final void mo47982g() {
        if (!mo47981f()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: h */
    public abstract boolean mo43450h();

    /* renamed from: i */
    public final void mo47983i() {
        if (!this.f34113c) {
            mo43450h();
            this.f33321b.mo47679o();
            this.f34113c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
