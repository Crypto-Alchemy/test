package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: z24 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class z24 implements ThreadFactory {

    /* renamed from: a */
    public final String f35983a;

    /* renamed from: d */
    public final ThreadFactory f35984d = Executors.defaultThreadFactory();

    public z24(String str) {
        cu4.m43222l(str, "Name must not be null");
        this.f35983a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f35984d.newThread(new d58(runnable, 0));
        newThread.setName(this.f35983a);
        return newThread;
    }
}
