package p000;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

@SuppressLint({"InlinedApi"})
/* renamed from: sb4 */
/* compiled from: NotificationUtil */
public final class sb4 {
    /* renamed from: a */
    public static void m26840a(Context context, String str, int i, int i2, int i3) {
        if (w67.f19021a >= 26) {
            NotificationManager notificationManager = (NotificationManager) C2725kr.m20985e((NotificationManager) context.getSystemService("notification"));
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i), i3);
            if (i2 != 0) {
                notificationChannel.setDescription(context.getString(i2));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
