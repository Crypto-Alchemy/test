package p000;

/* renamed from: x19 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class x19 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ am8 f35494a;

    /* renamed from: d */
    public final /* synthetic */ e29 f35495d;

    public x19(e29 e29, am8 am8) {
        this.f35495d = e29;
        this.f35494a = am8;
    }

    public final void run() {
        synchronized (this.f35495d) {
            boolean unused = this.f35495d.f28372a = false;
            if (!this.f35495d.f28374e.mo42714H()) {
                this.f35495d.f28374e.f34342a.mo45237A().mo29677u().mo48769a("Connected to remote service");
                this.f35495d.f28374e.mo42734p(this.f35494a);
            }
        }
    }
}
