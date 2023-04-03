package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.q */
/* compiled from: NotificationSummaryManager */
public class C5311q {
    /* renamed from: a */
    public static void m41233a(Context context, C5340w0 w0Var, String str) {
        Integer b = m41234b(w0Var, str);
        boolean equals = str.equals(ei4.m43981g());
        NotificationManager i = ei4.m43983i(context);
        Integer h = ei4.m43982h(w0Var, str, equals);
        if (h == null) {
            return;
        }
        if (OneSignal.m40349P()) {
            if (equals) {
                b = Integer.valueOf(ei4.m43980f());
            }
            if (b != null) {
                i.cancel(b.intValue());
                return;
            }
            return;
        }
        OneSignal.m40420o1(h.intValue());
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer m41234b(p000.di4 r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "android_notification_id"
            java.lang.String r4 = "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1"
            r1 = 1
            java.lang.String[] r5 = new java.lang.String[r1]
            r1 = 0
            r5[r1] = r12
            r9 = 0
            java.lang.String r2 = "notification"
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch:{ all -> 0x004a }
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r11
            android.database.Cursor r11 = r1.mo39146c(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004a }
            boolean r1 = r11.moveToFirst()     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x002c
            r11.close()     // Catch:{ all -> 0x0045 }
            boolean r12 = r11.isClosed()
            if (r12 != 0) goto L_0x002b
            r11.close()
        L_0x002b:
            return r9
        L_0x002c:
            int r0 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0045 }
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x0045 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0045 }
            r11.close()     // Catch:{ all -> 0x0045 }
            boolean r12 = r11.isClosed()
            if (r12 != 0) goto L_0x006e
            r11.close()
            goto L_0x006e
        L_0x0045:
            r0 = move-exception
            r10 = r9
            r9 = r11
            r11 = r10
            goto L_0x004c
        L_0x004a:
            r0 = move-exception
            r11 = r9
        L_0x004c:
            com.onesignal.OneSignal$LOG_LEVEL r1 = com.onesignal.OneSignal.LOG_LEVEL.ERROR     // Catch:{ all -> 0x006f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r2.<init>()     // Catch:{ all -> 0x006f }
            java.lang.String r3 = "Error getting android notification id for summary notification group: "
            r2.append(r3)     // Catch:{ all -> 0x006f }
            r2.append(r12)     // Catch:{ all -> 0x006f }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x006f }
            com.onesignal.OneSignal.m40379b(r1, r12, r0)     // Catch:{ all -> 0x006f }
            if (r9 == 0) goto L_0x006d
            boolean r12 = r9.isClosed()
            if (r12 != 0) goto L_0x006d
            r9.close()
        L_0x006d:
            r9 = r11
        L_0x006e:
            return r9
        L_0x006f:
            r11 = move-exception
            if (r9 == 0) goto L_0x007b
            boolean r12 = r9.isClosed()
            if (r12 != 0) goto L_0x007b
            r9.close()
        L_0x007b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5311q.m41234b(di4, java.lang.String):java.lang.Integer");
    }

    /* renamed from: c */
    public static Cursor m41235c(Context context, di4 di4, String str, boolean z) {
        String str2;
        di4 di42 = di4;
        Cursor c = di42.mo39146c("notification", new String[]{"android_notification_id", "created_time", "full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, (String) null, (String) null, "_id DESC");
        int count = c.getCount();
        if (count == 0 && !str.equals(ei4.m43981g())) {
            c.close();
            Integer b = m41234b(di4, str);
            if (b == null) {
                return c;
            }
            ei4.m43983i(context).cancel(b.intValue());
            ContentValues contentValues = new ContentValues();
            if (z) {
                str2 = "dismissed";
            } else {
                str2 = "opened";
            }
            contentValues.put(str2, 1);
            di4.mo39144a("notification", contentValues, "android_notification_id = " + b, (String[]) null);
            return c;
        } else if (count == 1) {
            c.close();
            if (m41234b(di4, str) == null) {
                return c;
            }
            m41236d(context, str);
            return c;
        } else {
            try {
                c.moveToFirst();
                Long valueOf = Long.valueOf(c.getLong(c.getColumnIndex("created_time")));
                String string = c.getString(c.getColumnIndex("full_data"));
                c.close();
                if (m41234b(di4, str) == null) {
                    return c;
                }
                md4 md4 = new md4(context);
                md4.mo45768y(true);
                md4.mo45769z(valueOf);
                md4.mo45759q(new JSONObject(string));
                C5217e.m40782M(md4);
                return c;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static void m41236d(Context context, String str) {
        String[] strArr = {str};
        Cursor cursor = null;
        try {
            cursor = C5340w0.m41369g(context).mo39146c("notification", OSNotificationRestoreWorkManager.f25970a, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", strArr, (String) null, (String) null, (String) null);
            OSNotificationRestoreWorkManager.m40226e(context, cursor, 0);
            if (cursor == null || cursor.isClosed()) {
                return;
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
    }

    /* renamed from: e */
    public static void m41237e(Context context, di4 di4, int i) {
        Cursor c = di4.mo39146c("notification", new String[]{"group_id"}, "android_notification_id = " + i, (String[]) null, (String) null, (String) null, (String) null);
        if (c.moveToFirst()) {
            String string = c.getString(c.getColumnIndex("group_id"));
            c.close();
            if (string != null) {
                m41238f(context, di4, string, true);
                return;
            }
            return;
        }
        c.close();
    }

    /* renamed from: f */
    public static void m41238f(Context context, di4 di4, String str, boolean z) {
        try {
            Cursor c = m41235c(context, di4, str, z);
            if (c != null && !c.isClosed()) {
                c.close();
            }
        } catch (Throwable th) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Error running updateSummaryNotificationAfterChildRemoved!", th);
        }
    }
}
