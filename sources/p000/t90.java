package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: t90 */
/* compiled from: CalleeHandler */
public class t90 {
    /* renamed from: a */
    public static Handler m27646a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
