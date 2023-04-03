package p000;

import android.os.Process;

/* renamed from: xw */
/* compiled from: BackgroundPriorityRunnable */
public abstract class C6711xw implements Runnable {
    /* renamed from: a */
    public abstract void mo49558a();

    public final void run() {
        Process.setThreadPriority(10);
        mo49558a();
    }
}
