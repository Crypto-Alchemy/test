package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: fj8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class fj8 implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f28887a = Executors.defaultThreadFactory();

    public fj8(cm8 cm8) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f28887a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
