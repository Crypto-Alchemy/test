package p000;

import java.util.concurrent.Callable;

/* renamed from: sk9 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class sk9 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ uj9 f33928a;

    /* renamed from: d */
    public final /* synthetic */ Callable f33929d;

    public sk9(uj9 uj9, Callable callable) {
        this.f33928a = uj9;
        this.f33929d = callable;
    }

    public final void run() {
        try {
            this.f33928a.mo48403t(this.f33929d.call());
        } catch (Exception e) {
            this.f33928a.mo48402s(e);
        } catch (Throwable th) {
            this.f33928a.mo48402s(new RuntimeException(th));
        }
    }
}
