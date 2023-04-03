package p000;

/* renamed from: z89 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class z89 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ tl6 f36005a;

    /* renamed from: d */
    public final /* synthetic */ fb9 f36006d;

    public z89(fb9 fb9, tl6 tl6) {
        this.f36006d = fb9;
        this.f36005a = tl6;
    }

    public final void run() {
        synchronized (this.f36006d.f28809b) {
            fb9 fb9 = this.f36006d;
            if (fb9.f28810c != null) {
                fb9.f28810c.onSuccess(this.f36005a.mo48141l());
            }
        }
    }
}
