package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ej9 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class ej9 implements Executor {

    /* renamed from: a */
    public final Handler f28626a = new o48(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f28626a.post(runnable);
    }
}
