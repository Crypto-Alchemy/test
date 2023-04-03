package p000;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: xr */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C9608xr implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ScheduledExecutorService f46007a;

    public /* synthetic */ C9608xr(ScheduledExecutorService scheduledExecutorService) {
        this.f46007a = scheduledExecutorService;
    }

    public final void run() {
        C9649yr.shutdown(this.f46007a);
    }
}
