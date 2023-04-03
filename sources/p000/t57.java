package p000;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: t57 */
/* compiled from: UserManagerCompat */
public class t57 {

    /* renamed from: t57$a */
    /* compiled from: UserManagerCompat */
    public static class C3332a {
        /* renamed from: a */
        public static boolean m27456a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m27455a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3332a.m27456a(context);
        }
        return true;
    }
}
