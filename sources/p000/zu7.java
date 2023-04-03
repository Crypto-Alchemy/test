package p000;

/* renamed from: zu7 */
public final class zu7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ul6 f36282a;

    /* renamed from: d */
    public final /* synthetic */ dv7 f36283d;

    public zu7(dv7 dv7, ul6 ul6) {
        this.f36283d = dv7;
        this.f36282a = ul6;
    }

    public final void run() {
        synchronized (this.f36283d.f28323b) {
            if (this.f36283d.f28324c != null) {
                this.f36283d.f28324c.onSuccess(this.f36282a.mo41743d());
            }
        }
    }
}
