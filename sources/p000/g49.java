package p000;

/* renamed from: g49 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class g49 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ tl6 f29073a;

    /* renamed from: d */
    public final /* synthetic */ a79 f29074d;

    public g49(a79 a79, tl6 tl6) {
        this.f29074d = a79;
        this.f29073a = tl6;
    }

    public final void run() {
        synchronized (this.f29074d.f20828b) {
            a79 a79 = this.f29074d;
            if (a79.f20829c != null) {
                a79.f20829c.mo42787a((Exception) cu4.m43221k(this.f29073a.mo48140k()));
            }
        }
    }
}
