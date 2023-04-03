package com.onesignal;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import com.onesignal.OneSignal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.n */
/* compiled from: NotificationOpenedProcessor */
public class C5294n {
    /* renamed from: a */
    public static void m41105a(JSONArray jSONArray, String str, C5340w0 w0Var) {
        C5340w0 w0Var2 = w0Var;
        Cursor c = w0Var2.mo39146c("notification", new String[]{"full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, (String) null, (String) null, (String) null);
        if (c.getCount() > 1) {
            c.moveToFirst();
            do {
                try {
                    jSONArray.put(new JSONObject(c.getString(c.getColumnIndex("full_data"))));
                } catch (JSONException unused) {
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                    OneSignal.m40376a(log_level, "Could not parse JSON of sub notification in group: " + str);
                }
            } while (c.moveToNext());
        }
        c.close();
    }

    /* renamed from: b */
    public static void m41106b(Context context, C5340w0 w0Var, String str) {
        if (str != null) {
            C5311q.m41233a(context, w0Var, str);
        } else if (ei4.m43979e(context).intValue() < 1) {
            ei4.m43983i(context).cancel(ei4.m43980f());
        }
    }

    /* renamed from: c */
    public static void m41107c(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            qb4.m25577d(context).mo25050b(intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    /* renamed from: d */
    public static boolean m41108d(Intent intent) {
        if (intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m41109e(Context context, Intent intent, C5340w0 w0Var, boolean z) {
        String str;
        String stringExtra = intent.getStringExtra("summary");
        String[] strArr = null;
        if (stringExtra != null) {
            boolean equals = stringExtra.equals(ei4.m43981g());
            if (equals) {
                str = "group_id IS NULL";
            } else {
                strArr = new String[]{stringExtra};
                str = "group_id = ?";
            }
            if (!z && !OneSignal.m40349P()) {
                String valueOf = String.valueOf(ei4.m43982h(w0Var, stringExtra, equals));
                str = str + " AND android_notification_id = ?";
                strArr = equals ? new String[]{valueOf} : new String[]{stringExtra, valueOf};
            }
        } else {
            str = "android_notification_id = " + intent.getIntExtra("androidNotificationId", 0);
        }
        m41106b(context, w0Var, stringExtra);
        w0Var.mo39144a("notification", m41110f(intent), str, strArr);
        C5186b.m40596c(w0Var, context);
    }

    /* renamed from: f */
    public static ContentValues m41110f(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", 1);
        } else {
            contentValues.put("opened", 1);
        }
        return contentValues;
    }

    /* renamed from: g */
    public static void m41111g(Context context, Intent intent) {
        if (m41108d(intent)) {
            if (context != null) {
                OneSignal.m40338L0(context.getApplicationContext());
            }
            m41107c(context, intent);
            m41112h(context, intent);
        }
    }

    /* renamed from: h */
    public static void m41112h(Context context, Intent intent) {
        nd4 nd4;
        String stringExtra;
        C5340w0 g = C5340w0.m41369g(context);
        String stringExtra2 = intent.getStringExtra("summary");
        boolean booleanExtra = intent.getBooleanExtra("dismissed", false);
        if (!booleanExtra) {
            nd4 = m41113i(context, intent, g, stringExtra2);
            if (nd4 == null) {
                return;
            }
        } else {
            nd4 = null;
        }
        m41109e(context, intent, g, booleanExtra);
        if (stringExtra2 == null && (stringExtra = intent.getStringExtra("grp")) != null) {
            C5311q.m41238f(context, g, stringExtra, booleanExtra);
        }
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40387d1(log_level, "processIntent from context: " + context + " and intent: " + intent);
        if (intent.getExtras() != null) {
            OneSignal.m40387d1(log_level, "processIntent intent extras: " + intent.getExtras().toString());
        }
        if (booleanExtra) {
            return;
        }
        if (!(context instanceof Activity)) {
            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.ERROR;
            OneSignal.m40387d1(log_level2, "NotificationOpenedProcessor processIntent from an non Activity context: " + context);
            return;
        }
        OneSignal.m40317E0((Activity) context, nd4.mo46056a(), C5235g0.m40846b(nd4.mo46057b()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.nd4 m41113i(android.content.Context r7, android.content.Intent r8, com.onesignal.C5340w0 r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "androidNotificationId"
            java.lang.String r1 = "onesignalData"
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r4 = r8.getStringExtra(r1)     // Catch:{ JSONException -> 0x0051 }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x0051 }
            boolean r4 = r7 instanceof android.app.Activity     // Catch:{ JSONException -> 0x004f }
            if (r4 != 0) goto L_0x0029
            com.onesignal.OneSignal$LOG_LEVEL r4 = com.onesignal.OneSignal.LOG_LEVEL.ERROR     // Catch:{ JSONException -> 0x004f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x004f }
            r5.<init>()     // Catch:{ JSONException -> 0x004f }
            java.lang.String r6 = "NotificationOpenedProcessor processIntent from an non Activity context: "
            r5.append(r6)     // Catch:{ JSONException -> 0x004f }
            r5.append(r7)     // Catch:{ JSONException -> 0x004f }
            java.lang.String r7 = r5.toString()     // Catch:{ JSONException -> 0x004f }
            com.onesignal.OneSignal.m40387d1(r4, r7)     // Catch:{ JSONException -> 0x004f }
            goto L_0x0032
        L_0x0029:
            android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ JSONException -> 0x004f }
            boolean r7 = p000.ed4.m43929b(r7, r3)     // Catch:{ JSONException -> 0x004f }
            if (r7 == 0) goto L_0x0032
            return r2
        L_0x0032:
            r7 = 0
            int r7 = r8.getIntExtra(r0, r7)     // Catch:{ JSONException -> 0x004f }
            r3.put(r0, r7)     // Catch:{ JSONException -> 0x004f }
            java.lang.String r7 = r3.toString()     // Catch:{ JSONException -> 0x004f }
            r8.putExtra(r1, r7)     // Catch:{ JSONException -> 0x004f }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004f }
            java.lang.String r8 = r8.getStringExtra(r1)     // Catch:{ JSONException -> 0x004f }
            r7.<init>(r8)     // Catch:{ JSONException -> 0x004f }
            org.json.JSONArray r2 = com.onesignal.C5270k.m41000g(r7)     // Catch:{ JSONException -> 0x004f }
            goto L_0x0056
        L_0x004f:
            r7 = move-exception
            goto L_0x0053
        L_0x0051:
            r7 = move-exception
            r3 = r2
        L_0x0053:
            r7.printStackTrace()
        L_0x0056:
            if (r10 == 0) goto L_0x005b
            m41105a(r2, r10, r9)
        L_0x005b:
            nd4 r7 = new nd4
            r7.<init>(r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5294n.m41113i(android.content.Context, android.content.Intent, com.onesignal.w0, java.lang.String):nd4");
    }
}
