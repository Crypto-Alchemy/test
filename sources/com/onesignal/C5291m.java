package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.onesignal.m */
/* compiled from: NotificationLimitManager */
public class C5291m {

    /* renamed from: a */
    public static final String f26466a = Integer.toString(49);

    /* renamed from: a */
    public static void m41081a(Context context, int i) {
        try {
            m41083c(context, i);
        } catch (Throwable unused) {
            m41082b(context, i);
        }
    }

    /* renamed from: b */
    public static void m41082b(Context context, int i) {
        C5340w0 g = C5340w0.m41369g(context);
        Cursor cursor = null;
        try {
            cursor = g.mo39145b("notification", new String[]{"android_notification_id"}, C5340w0.m41370l().toString(), (String[]) null, (String) null, (String) null, "_id", m41085e() + i);
            int count = (cursor.getCount() - m41084d()) + i;
            if (count >= 1) {
                do {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    OneSignal.m40420o1(cursor.getInt(cursor.getColumnIndex("android_notification_id")));
                    count--;
                } while (count > 0);
                if (cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } else if (!cursor.isClosed()) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static void m41083c(Context context, int i) throws Throwable {
        StatusBarNotification[] d = ei4.m43978d(context);
        int length = (d.length - m41084d()) + i;
        if (length >= 1) {
            TreeMap treeMap = new TreeMap();
            for (StatusBarNotification statusBarNotification : d) {
                if (!m41086f(statusBarNotification)) {
                    treeMap.put(Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(statusBarNotification.getId()));
                }
            }
            for (Map.Entry value : treeMap.entrySet()) {
                OneSignal.m40420o1(((Integer) value.getValue()).intValue());
                length--;
                if (length <= 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public static int m41084d() {
        return 49;
    }

    /* renamed from: e */
    public static String m41085e() {
        return f26466a;
    }

    /* renamed from: f */
    public static boolean m41086f(StatusBarNotification statusBarNotification) {
        if ((statusBarNotification.getNotification().flags & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0) {
            return true;
        }
        return false;
    }
}
