package p000;

import android.os.Looper;

/* renamed from: wa8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class wa8 {
    /* renamed from: a */
    public static boolean m53784a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }
}
