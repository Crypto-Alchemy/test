package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: bs7 */
public final class bs7 implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
