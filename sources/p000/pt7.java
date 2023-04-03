package p000;

/* renamed from: pt7 */
public final class pt7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ul6 f32812a;

    /* renamed from: d */
    public final /* synthetic */ ru7 f32813d;

    public pt7(ru7 ru7, ul6 ul6) {
        this.f32813d = ru7;
        this.f32812a = ul6;
    }

    public final void run() {
        synchronized (this.f32813d.f33601b) {
            if (this.f32813d.f33602c != null) {
                this.f32813d.f33602c.mo42680a(this.f32812a.mo41742c());
            }
        }
    }
}
