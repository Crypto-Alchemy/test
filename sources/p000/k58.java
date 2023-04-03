package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: k58 */
public class k58 {

    /* renamed from: a */
    public static volatile UserManager f30716a;

    /* renamed from: b */
    public static volatile boolean f30717b = (!m46867b());

    /* renamed from: a */
    public static boolean m46866a(Context context) {
        return m46867b() && !m46868c(context);
    }

    /* renamed from: b */
    public static boolean m46867b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @TargetApi(24)
    /* renamed from: c */
    public static boolean m46868c(Context context) {
        boolean z = f30717b;
        if (!z) {
            UserManager userManager = f30716a;
            if (userManager == null) {
                synchronized (k58.class) {
                    userManager = f30716a;
                    if (userManager == null) {
                        UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                        f30716a = userManager2;
                        if (userManager2 == null) {
                            f30717b = true;
                            return true;
                        }
                        userManager = userManager2;
                    }
                }
            }
            z = userManager.isUserUnlocked();
            f30717b = z;
            if (z) {
                f30716a = null;
            }
        }
        return z;
    }
}
