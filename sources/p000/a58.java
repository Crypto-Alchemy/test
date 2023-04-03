package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p000.us4;

/* renamed from: a58 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class a58 implements us4.C6575a {
    /* renamed from: a */
    public final ScheduledExecutorService mo28880a() {
        ev8.m44101a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
