package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: w09 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class w09 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ ThreadFactory f35228a;

    public /* synthetic */ w09(ThreadFactory threadFactory) {
        this.f35228a = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f35228a.newThread(new cy8(runnable));
    }
}
