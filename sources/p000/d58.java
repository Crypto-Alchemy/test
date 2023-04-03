package p000;

import android.os.Process;

/* renamed from: d58 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class d58 implements Runnable {

    /* renamed from: a */
    public final Runnable f28038a;

    public d58(Runnable runnable, int i) {
        this.f28038a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f28038a.run();
    }
}
