package p000;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: wk8 */
public final class wk8 {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static <T> T m53945a(Callable<T> callable) throws Exception {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
