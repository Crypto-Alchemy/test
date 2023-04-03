package p000;

import android.content.Context;
import android.os.Looper;

/* renamed from: rk9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class rk9 {
    public rk9(Context context) {
    }

    /* renamed from: a */
    public static final boolean m51151a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
