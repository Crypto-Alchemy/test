package p000;

/* renamed from: r19 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class r19 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ am8 f33309a;

    /* renamed from: d */
    public final /* synthetic */ e29 f33310d;

    public r19(e29 e29, am8 am8) {
        this.f33310d = e29;
        this.f33309a = am8;
    }

    public final void run() {
        synchronized (this.f33310d) {
            boolean unused = this.f33310d.f28372a = false;
            if (!this.f33310d.f28374e.mo42714H()) {
                this.f33310d.f28374e.f34342a.mo45237A().mo29678v().mo48769a("Connected to service");
                this.f33310d.f28374e.mo42734p(this.f33309a);
            }
        }
    }
}
