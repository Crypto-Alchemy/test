package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.onesignal.C5291m;
import com.onesignal.C5340w0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ei4 */
/* compiled from: OneSignalNotificationManager */
public class ei4 {
    /* renamed from: a */
    public static boolean m43975a(Context context, String str) {
        if (!qb4.m25577d(context).mo25049a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        NotificationChannel a = m43983i(context).getNotificationChannel(str);
        if (a == null || a.getImportance() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m43976b(Context context, ArrayList<StatusBarNotification> arrayList) {
        Iterator<StatusBarNotification> it = arrayList.iterator();
        while (it.hasNext()) {
            StatusBarNotification next = it.next();
            qb4.m25577d(context).mo25052f(next.getId(), Notification.Builder.recoverBuilder(context, next.getNotification()).setGroup("os_group_undefined").setOnlyAlertOnce(true).build());
        }
    }

    /* renamed from: c */
    public static ArrayList<StatusBarNotification> m43977c(Context context) {
        boolean z;
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : m43978d(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean f = C5291m.m41086f(statusBarNotification);
            if (notification.getGroup() == null || notification.getGroup().equals(m43981g())) {
                z = true;
            } else {
                z = false;
            }
            if (!f && z) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static StatusBarNotification[] m43978d(Context context) {
        try {
            return m43983i(context).getActiveNotifications();
        } catch (Throwable unused) {
            return new StatusBarNotification[0];
        }
    }

    /* renamed from: e */
    public static Integer m43979e(Context context) {
        int i = 0;
        for (StatusBarNotification statusBarNotification : m43978d(context)) {
            if (!f94.m16674b(statusBarNotification.getNotification()) && "os_group_undefined".equals(statusBarNotification.getNotification().getGroup())) {
                i++;
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: f */
    public static int m43980f() {
        return -718463522;
    }

    /* renamed from: g */
    public static String m43981g() {
        return "os_group_undefined";
    }

    /* renamed from: h */
    public static Integer m43982h(C5340w0 w0Var, String str, boolean z) {
        String str2;
        String[] strArr;
        if (z) {
            str2 = "group_id IS NULL";
        } else {
            str2 = "group_id = ?";
        }
        String str3 = str2 + " AND dismissed = 0 AND opened = 0 AND is_summary = 0";
        if (z) {
            strArr = null;
        } else {
            strArr = new String[]{str};
        }
        Cursor b = w0Var.mo39145b("notification", (String[]) null, str3, strArr, (String) null, (String) null, "created_time DESC", "1");
        if (!b.moveToFirst()) {
            b.close();
            return null;
        }
        Integer valueOf = Integer.valueOf(b.getInt(b.getColumnIndex("android_notification_id")));
        b.close();
        return valueOf;
    }

    /* renamed from: i */
    public static NotificationManager m43983i(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }
}
