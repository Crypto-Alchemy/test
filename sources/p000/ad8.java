package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: ad8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class ad8 {

    /* renamed from: a */
    public static final int f20915a;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            String str = Build.VERSION.CODENAME;
            if (str.length() == 1 && str.charAt(0) >= 'S' && str.charAt(0) <= 'Z') {
                i = 33554432;
            }
        }
        f20915a = i;
    }

    /* renamed from: a */
    public static PendingIntent m31778a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
