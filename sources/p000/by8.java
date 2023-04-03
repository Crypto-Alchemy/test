package p000;

/* renamed from: by8 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class by8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ tl6 f21517a;

    /* renamed from: d */
    public final /* synthetic */ g19 f21518d;

    public by8(g19 g19, tl6 tl6) {
        this.f21518d = g19;
        this.f21517a = tl6;
    }

    public final void run() {
        synchronized (this.f21518d.f29054b) {
            g19 g19 = this.f21518d;
            if (g19.f29055c != null) {
                g19.f29055c.mo29007a(this.f21517a);
            }
        }
    }
}
