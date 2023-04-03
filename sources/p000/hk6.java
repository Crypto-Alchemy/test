package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: hk6 */
/* compiled from: SystemClock */
public class hk6 implements dh0 {
    /* renamed from: a */
    public long mo18769a() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    public long mo18770b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public xk2 mo18771c(Looper looper, Handler.Callback callback) {
        return new lk6(new Handler(looper, callback));
    }

    /* renamed from: d */
    public void mo18772d() {
    }
}
