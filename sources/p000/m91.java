package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: m91 */
/* compiled from: DefaultRunnableScheduler */
public class m91 implements li5 {

    /* renamed from: a */
    public final Handler f14889a = rk2.m26266a(Looper.getMainLooper());

    /* renamed from: a */
    public void mo22769a(Runnable runnable) {
        this.f14889a.removeCallbacks(runnable);
    }

    /* renamed from: b */
    public void mo22770b(long j, Runnable runnable) {
        this.f14889a.postDelayed(runnable, j);
    }
}
