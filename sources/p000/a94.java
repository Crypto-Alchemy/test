package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* renamed from: a94 */
/* compiled from: NotificationApiHelperForO */
public class a94 {
    /* renamed from: a */
    public static Notification m138a(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        notificationManager.createNotificationChannel(new NotificationChannel(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        Notification.Builder a = Notification.Builder.recoverBuilder(context, notification);
        Notification.Builder unused = a.setChannelId(str);
        return a.build();
    }

    /* renamed from: b */
    public static boolean m139b(NotificationManager notificationManager, String str) {
        NotificationChannel a = notificationManager.getNotificationChannel(str);
        if (a == null || a.getImportance() != 0) {
            return true;
        }
        return false;
    }
}
