package p000;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;

@Deprecated
/* renamed from: p96 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class p96 {
    /* renamed from: a */
    public static String m49833a(PowerManager.WakeLock wakeLock, String str) {
        String valueOf = String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock)));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(valueOf).concat(String.valueOf(str));
    }
}
