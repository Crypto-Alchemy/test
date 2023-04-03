package com.onesignal;

import android.content.Context;
import androidx.work.C1519b;
import androidx.work.C1521c;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class OSNotificationWorkManager {

    /* renamed from: a */
    public static Set<String> f25973a = OSUtils.m40262K();

    public static class NotificationWorker extends Worker {
        public NotificationWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        /* renamed from: r */
        public ListenableWorker.C1509a mo10897r() {
            C1519b g = mo10872g();
            try {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                OneSignal.m40387d1(log_level, "NotificationWorker running doWork with data: " + g);
                int i = g.mo10924i("android_notif_id", 0);
                JSONObject jSONObject = new JSONObject(g.mo10927l("json_payload"));
                long k = g.mo10926k("timestamp", System.currentTimeMillis() / 1000);
                boolean h = g.mo10922h("is_restoring", false);
                mo38531s(mo10869a(), i, jSONObject, h, Long.valueOf(k));
                return ListenableWorker.C1509a.m10434c();
            } catch (JSONException e) {
                OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.ERROR;
                OneSignal.m40387d1(log_level2, "Error occurred doing work for job with id: " + mo10871e().toString());
                e.printStackTrace();
                return ListenableWorker.C1509a.m10432a();
            }
        }

        /* renamed from: s */
        public final void mo38531s(Context context, int i, JSONObject jSONObject, boolean z, Long l) {
            C5211d0 d0Var = new C5211d0((List<C5211d0>) null, jSONObject, i);
            C5266j0 j0Var = new C5266j0(new C5220e0(context, d0Var, jSONObject, z, true, l), d0Var);
            OneSignal.C5133d0 d0Var2 = OneSignal.f26052p;
            if (d0Var2 != null) {
                try {
                    d0Var2.mo38574a(context, j0Var);
                } catch (Throwable th) {
                    OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "remoteNotificationReceived throw an exception. Displaying normal OneSignal notification.", th);
                    j0Var.mo38925b(d0Var);
                    throw th;
                }
            } else {
                OneSignal.m40376a(OneSignal.LOG_LEVEL.WARN, "remoteNotificationReceivedHandler not setup, displaying normal OneSignal notification");
                j0Var.mo38925b(d0Var);
            }
        }
    }

    /* renamed from: a */
    public static boolean m40229a(String str) {
        if (!OSUtils.m40260I(str)) {
            return true;
        }
        if (f25973a.contains(str)) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, "OSNotificationWorkManager notification with notificationId: " + str + " already queued");
            return false;
        }
        f25973a.add(str);
        return true;
    }

    /* renamed from: b */
    public static void m40230b(Context context, String str, int i, String str2, long j, boolean z, boolean z2) {
        C1519b a = new C1519b.C1520a().mo10935f("android_notif_id", i).mo10937h("json_payload", str2).mo10936g("timestamp", j).mo10934e("is_restoring", z).mo10930a();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "OSNotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + str2);
        te4.m52273a(context).mo23238d(str, ExistingWorkPolicy.KEEP, (C1521c) ((C1521c.C1522a) new C1521c.C1522a(NotificationWorker.class).mo10949g(a)).mo10946b());
    }

    /* renamed from: c */
    public static void m40231c(String str) {
        if (OSUtils.m40260I(str)) {
            f25973a.remove(str);
        }
    }
}
