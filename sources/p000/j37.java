package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: j37 */
/* compiled from: UiThreadImmediateExecutorService */
public class j37 extends vk2 {

    /* renamed from: d */
    public static j37 f13504d;

    public j37() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: g */
    public static j37 m19948g() {
        if (f13504d == null) {
            f13504d = new j37();
        }
        return f13504d;
    }

    public void execute(Runnable runnable) {
        if (mo27157a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
