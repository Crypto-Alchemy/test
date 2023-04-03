package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: oc4 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class oc4 implements ThreadFactory {

    /* renamed from: a */
    public final String f32354a;

    /* renamed from: d */
    public final AtomicInteger f32355d = new AtomicInteger();

    /* renamed from: e */
    public final ThreadFactory f32356e = Executors.defaultThreadFactory();

    public oc4(String str) {
        cu4.m43222l(str, "Name must not be null");
        this.f32354a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f32356e.newThread(new d58(runnable, 0));
        String str = this.f32354a;
        int andIncrement = this.f32355d.getAndIncrement();
        newThread.setName(str + "[" + andIncrement + "]");
        return newThread;
    }
}
