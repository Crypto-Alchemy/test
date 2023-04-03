package p000;

import android.app.KeyguardManager;
import android.content.Context;

/* renamed from: pb3 */
/* compiled from: KeyguardUtils */
public class pb3 {

    /* renamed from: pb3$a */
    /* compiled from: KeyguardUtils */
    public static class C3050a {
        /* renamed from: a */
        public static KeyguardManager m24813a(Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        /* renamed from: b */
        public static boolean m24814b(KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    /* renamed from: a */
    public static KeyguardManager m24811a(Context context) {
        return C3050a.m24813a(context);
    }

    /* renamed from: b */
    public static boolean m24812b(Context context) {
        KeyguardManager a = m24811a(context);
        if (a == null) {
            return false;
        }
        return C3050a.m24814b(a);
    }
}
