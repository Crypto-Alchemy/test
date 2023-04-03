package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.work.C1521c;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.mlkit.common.MlKitException;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class OSNotificationRestoreWorkManager {

    /* renamed from: a */
    public static final String[] f25970a = {"notification_id", "android_notification_id", "full_data", "created_time"};

    /* renamed from: b */
    public static final String f25971b = NotificationRestoreWorker.class.getCanonicalName();

    /* renamed from: c */
    public static boolean f25972c;

    public static class NotificationRestoreWorker extends Worker {
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        /* renamed from: r */
        public ListenableWorker.C1509a mo10897r() {
            Context a = mo10869a();
            if (OneSignal.f26030e == null) {
                OneSignal.m40338L0(a);
            }
            if (!OSUtils.m40274a(a)) {
                return ListenableWorker.C1509a.m10432a();
            }
            if (OSNotificationRestoreWorkManager.f25972c) {
                return ListenableWorker.C1509a.m10432a();
            }
            OSNotificationRestoreWorkManager.f25972c = true;
            OneSignal.m40376a(OneSignal.LOG_LEVEL.INFO, "Restoring notifications");
            C5340w0 g = C5340w0.m41369g(a);
            StringBuilder l = C5340w0.m41370l();
            OSNotificationRestoreWorkManager.m40227f(a, l);
            OSNotificationRestoreWorkManager.m40225d(a, g, l);
            return ListenableWorker.C1509a.m10434c();
        }
    }

    /* renamed from: c */
    public static void m40224c(Context context, boolean z) {
        int i;
        if (z) {
            i = 15;
        } else {
            i = 0;
        }
        te4.m52273a(context).mo23238d(f25971b, ExistingWorkPolicy.KEEP, (C1521c) ((C1521c.C1522a) new C1521c.C1522a(NotificationRestoreWorker.class).mo10948f((long) i, TimeUnit.SECONDS)).mo10946b());
    }

    /* renamed from: d */
    public static void m40225d(Context context, C5340w0 w0Var, StringBuilder sb) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        OneSignal.m40376a(log_level, "Querying DB for notifications to restore: " + sb.toString());
        Cursor cursor = null;
        try {
            cursor = w0Var.mo39145b("notification", f25970a, sb.toString(), (String[]) null, (String) null, (String) null, "_id DESC", C5291m.f26466a);
            m40226e(context, cursor, MlKitException.CODE_SCANNER_UNAVAILABLE);
            C5186b.m40596c(w0Var, context);
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
    public static void m40226e(Context context, Cursor cursor, int i) {
        if (cursor.moveToFirst()) {
            do {
                OSNotificationWorkManager.m40230b(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex("android_notification_id")), cursor.getString(cursor.getColumnIndex("full_data")), cursor.getLong(cursor.getColumnIndex("created_time")), true, false);
                if (i > 0) {
                    OSUtils.m40273V(i);
                }
            } while (cursor.moveToNext());
        }
    }

    /* renamed from: f */
    public static void m40227f(Context context, StringBuilder sb) {
        StatusBarNotification[] d = ei4.m43978d(context);
        if (d.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification id : d) {
                arrayList.add(Integer.valueOf(id.getId()));
            }
            sb.append(" AND android_notification_id NOT IN (");
            sb.append(TextUtils.join(",", arrayList));
            sb.append(")");
        }
    }
}
