package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: zv7 */
public final class zv7 implements Executor {

    /* renamed from: a */
    public final Handler f36285a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f36285a.post(runnable);
    }
}
