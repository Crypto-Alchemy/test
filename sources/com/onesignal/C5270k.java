package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.onesignal.C5224f0;
import com.onesignal.OneSignal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: com.onesignal.k */
/* compiled from: NotificationBundleProcessor */
public class C5270k {

    /* renamed from: com.onesignal.k$a */
    /* compiled from: NotificationBundleProcessor */
    public class C5271a implements C5224f0.C5228d {

        /* renamed from: a */
        public final /* synthetic */ boolean f26419a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f26420b;

        /* renamed from: c */
        public final /* synthetic */ Context f26421c;

        /* renamed from: d */
        public final /* synthetic */ int f26422d;

        /* renamed from: e */
        public final /* synthetic */ String f26423e;

        /* renamed from: f */
        public final /* synthetic */ long f26424f;

        public C5271a(boolean z, JSONObject jSONObject, Context context, int i, String str, long j) {
            this.f26419a = z;
            this.f26420b = jSONObject;
            this.f26421c = context;
            this.f26422d = i;
            this.f26423e = str;
            this.f26424f = j;
        }

        /* renamed from: a */
        public void mo38821a(boolean z) {
            if (this.f26419a || !z) {
                OSNotificationWorkManager.m40230b(this.f26421c, C5235g0.m40846b(this.f26420b), this.f26422d, this.f26423e, this.f26424f, this.f26419a, false);
                if (this.f26419a) {
                    OSUtils.m40273V(100);
                }
            }
        }
    }

    /* renamed from: com.onesignal.k$b */
    /* compiled from: NotificationBundleProcessor */
    public class C5272b implements C5274d {

        /* renamed from: a */
        public final /* synthetic */ C5276f f26425a;

        /* renamed from: b */
        public final /* synthetic */ C5275e f26426b;

        public C5272b(C5276f fVar, C5275e eVar) {
            this.f26425a = fVar;
            this.f26426b = eVar;
        }

        /* renamed from: a */
        public void mo38940a(boolean z) {
            if (!z) {
                this.f26425a.mo38944d(true);
            }
            this.f26426b.mo38374a(this.f26425a);
        }
    }

    /* renamed from: com.onesignal.k$c */
    /* compiled from: NotificationBundleProcessor */
    public class C5273c implements C5224f0.C5228d {

        /* renamed from: a */
        public final /* synthetic */ boolean f26427a;

        /* renamed from: b */
        public final /* synthetic */ Context f26428b;

        /* renamed from: c */
        public final /* synthetic */ Bundle f26429c;

        /* renamed from: d */
        public final /* synthetic */ C5274d f26430d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f26431e;

        /* renamed from: f */
        public final /* synthetic */ long f26432f;

        /* renamed from: g */
        public final /* synthetic */ boolean f26433g;

        /* renamed from: h */
        public final /* synthetic */ C5276f f26434h;

        public C5273c(boolean z, Context context, Bundle bundle, C5274d dVar, JSONObject jSONObject, long j, boolean z2, C5276f fVar) {
            this.f26427a = z;
            this.f26428b = context;
            this.f26429c = bundle;
            this.f26430d = dVar;
            this.f26431e = jSONObject;
            this.f26432f = j;
            this.f26433g = z2;
            this.f26434h = fVar;
        }

        /* renamed from: a */
        public void mo38821a(boolean z) {
            int i = 0;
            if (this.f26427a || !z) {
                String b = C5235g0.m40846b(this.f26431e);
                if (this.f26429c.containsKey("android_notif_id")) {
                    i = this.f26429c.getInt("android_notif_id");
                }
                OSNotificationWorkManager.m40230b(this.f26428b, b, i, this.f26431e.toString(), this.f26432f, this.f26427a, this.f26433g);
                this.f26434h.mo38947g(true);
                this.f26430d.mo38940a(true);
                return;
            }
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, "startNotificationProcessing returning, with context: " + this.f26428b + " and bundle: " + this.f26429c);
            this.f26430d.mo38940a(false);
        }
    }

    /* renamed from: com.onesignal.k$d */
    /* compiled from: NotificationBundleProcessor */
    public interface C5274d {
        /* renamed from: a */
        void mo38940a(boolean z);
    }

    /* renamed from: com.onesignal.k$e */
    /* compiled from: NotificationBundleProcessor */
    public interface C5275e {
        /* renamed from: a */
        void mo38374a(C5276f fVar);
    }

    /* renamed from: com.onesignal.k$f */
    /* compiled from: NotificationBundleProcessor */
    public static class C5276f {

        /* renamed from: a */
        public boolean f26435a;

        /* renamed from: b */
        public boolean f26436b;

        /* renamed from: c */
        public boolean f26437c;

        /* renamed from: d */
        public boolean f26438d;

        /* renamed from: a */
        public boolean mo38941a() {
            return this.f26436b;
        }

        /* renamed from: b */
        public boolean mo38942b() {
            return this.f26438d;
        }

        /* renamed from: c */
        public boolean mo38943c() {
            if (!this.f26435a || this.f26436b || this.f26437c || this.f26438d) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public void mo38944d(boolean z) {
            this.f26436b = z;
        }

        /* renamed from: e */
        public void mo38945e(boolean z) {
            this.f26437c = z;
        }

        /* renamed from: f */
        public void mo38946f(boolean z) {
            this.f26435a = z;
        }

        /* renamed from: g */
        public void mo38947g(boolean z) {
            this.f26438d = z;
        }
    }

    /* renamed from: a */
    public static JSONObject m40994a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String next : bundle.keySet()) {
            try {
                jSONObject.put(next, bundle.get(next));
            } catch (JSONException e) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                OneSignal.m40379b(log_level, "bundleAsJSONObject error for key: " + next, e);
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static JSONObject m40995b(JSONObject jSONObject) throws JSONException {
        return new JSONObject(jSONObject.optString("custom"));
    }

    /* renamed from: c */
    public static boolean m40996c(Bundle bundle) {
        if (m40997d(bundle, "licon") || m40997d(bundle, "bicon") || bundle.getString("bg_img", (String) null) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m40997d(Bundle bundle, String str) {
        String trim = bundle.getString(str, "").trim();
        if (trim.startsWith("http://") || trim.startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m40998e(md4 md4) {
        if (md4.mo45755m()) {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "Marking restored or disabled notifications as dismissed: " + md4.toString());
            C5340w0 g = C5340w0.m41369g(md4.mo45746d());
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", 1);
            g.mo39144a("notification", contentValues, "android_notification_id = " + md4.mo45743a(), (String[]) null);
            C5186b.m40596c(g, md4.mo45746d());
        }
    }

    /* renamed from: f */
    public static void m40999f(Bundle bundle) {
        JSONObject jSONObject;
        String str;
        if (bundle.containsKey("o")) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString("custom"));
                if (jSONObject2.has("a")) {
                    jSONObject = jSONObject2.getJSONObject("a");
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString("o"));
                bundle.remove("o");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("n");
                    jSONObject3.remove("n");
                    if (jSONObject3.has("i")) {
                        str = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        str = string;
                    }
                    jSONObject3.put("id", str);
                    jSONObject3.put(PublicResolver.FUNC_TEXT, string);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put("actionId", "__DEFAULT__");
                if (!jSONObject2.has("a")) {
                    jSONObject2.put("a", jSONObject);
                }
                bundle.putString("custom", jSONObject2.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    public static JSONArray m41000g(JSONObject jSONObject) {
        return new JSONArray().put(jSONObject);
    }

    /* renamed from: h */
    public static void m41001h(Context context, Bundle bundle, C5275e eVar) {
        C5276f fVar = new C5276f();
        if (!C5235g0.m40848d(bundle)) {
            eVar.mo38374a(fVar);
            return;
        }
        fVar.mo38946f(true);
        m40999f(bundle);
        if (ed4.m43930c(context, bundle)) {
            fVar.mo38945e(true);
            eVar.mo38374a(fVar);
            return;
        }
        m41010q(context, bundle, fVar, new C5272b(fVar, eVar));
    }

    /* renamed from: i */
    public static void m41002i(md4 md4) {
        if (!md4.mo45756n() && md4.mo45747e().has("collapse_key") && !"do_not_collapse".equals(md4.mo45747e().optString("collapse_key"))) {
            Cursor c = C5340w0.m41369g(md4.mo45746d()).mo39146c("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{md4.mo45747e().optString("collapse_key")}, (String) null, (String) null, (String) null);
            if (c.moveToFirst()) {
                md4.mo45748f().mo38757r(c.getInt(c.getColumnIndex("android_notification_id")));
            }
            c.close();
        }
    }

    /* renamed from: j */
    public static void m41003j(Context context, t50 t50) {
        int i;
        OneSignal.m40338L0(context);
        try {
            String c = t50.mo47986c("json_payload");
            if (c == null) {
                OneSignal.m40376a(OneSignal.LOG_LEVEL.ERROR, "json_payload key is nonexistent from mBundle passed to ProcessFromFCMIntentService: " + t50);
                return;
            }
            JSONObject jSONObject = new JSONObject(c);
            boolean z = t50.getBoolean("is_restoring", false);
            long longValue = t50.mo47984a("timestamp").longValue();
            if (t50.mo47989f("android_notif_id")) {
                i = t50.mo47985b("android_notif_id").intValue();
            } else {
                i = 0;
            }
            OneSignal.m40369W0(context, jSONObject, new C5271a(z, jSONObject, context, i, c, longValue));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    public static int m41004k(md4 md4, boolean z) {
        return m41006m(new C5220e0(md4, md4.mo45756n(), true), false, z);
    }

    /* renamed from: l */
    public static int m41005l(C5220e0 e0Var, boolean z) {
        return m41006m(e0Var, false, z);
    }

    /* renamed from: m */
    public static int m41006m(C5220e0 e0Var, boolean z, boolean z2) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "Starting processJobForDisplay opened: " + z + " fromBackgroundLogic: " + z2);
        md4 b = e0Var.mo38803b();
        m41002i(b);
        int intValue = b.mo45743a().intValue();
        boolean z3 = false;
        if (m41009p(b)) {
            b.mo45758p(true);
            if (!z2 || !OneSignal.m40333J1(b)) {
                z3 = C5217e.m40796n(b);
            } else {
                e0Var.mo38808g(false);
                OneSignal.m40331J(e0Var);
                return intValue;
            }
        }
        if (!b.mo45756n()) {
            m41007n(b, z, z3);
            OSNotificationWorkManager.m40231c(C5235g0.m40846b(e0Var.mo38803b().mo45747e()));
            OneSignal.m40320F0(b);
        }
        return intValue;
    }

    /* renamed from: n */
    public static void m41007n(md4 md4, boolean z, boolean z2) {
        m41008o(md4, z);
        if (!z2) {
            m40998e(md4);
            return;
        }
        String b = md4.mo45744b();
        OSReceiveReceiptController.m40236c().mo38533a(md4.mo45746d(), b);
        OneSignal.m40431s0().mo39070l(b);
    }

    /* renamed from: o */
    public static void m41008o(md4 md4, boolean z) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "Saving Notification job: " + md4.toString());
        Context d = md4.mo45746d();
        JSONObject e = md4.mo45747e();
        try {
            JSONObject b = m40995b(md4.mo45747e());
            C5340w0 g = C5340w0.m41369g(md4.mo45746d());
            int i = 1;
            if (md4.mo45755m()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", 1);
                g.mo39144a("notification", contentValues, "android_notification_id = " + md4.mo45743a(), (String[]) null);
                C5186b.m40596c(g, d);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notification_id", b.optString("i"));
            if (e.has("grp")) {
                contentValues2.put("group_id", e.optString("grp"));
            }
            if (e.has("collapse_key") && !"do_not_collapse".equals(e.optString("collapse_key"))) {
                contentValues2.put("collapse_id", e.optString("collapse_key"));
            }
            if (!z) {
                i = 0;
            }
            contentValues2.put("opened", Integer.valueOf(i));
            if (!z) {
                contentValues2.put("android_notification_id", md4.mo45743a());
            }
            if (md4.mo45753k() != null) {
                contentValues2.put("title", md4.mo45753k().toString());
            }
            if (md4.mo45745c() != null) {
                contentValues2.put(ThrowableDeserializer.PROP_NAME_MESSAGE, md4.mo45745c().toString());
            }
            contentValues2.put("expire_time", Long.valueOf((e.optLong("google.sent_time", OneSignal.m40443w0().mo46064a()) / 1000) + ((long) e.optInt("google.ttl", 259200))));
            contentValues2.put("full_data", e.toString());
            g.mo39151j("notification", (String) null, contentValues2);
            OneSignal.m40376a(log_level, "Notification saved values: " + contentValues2.toString());
            if (!z) {
                C5186b.m40596c(g, d);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: p */
    public static boolean m41009p(md4 md4) {
        if (md4.mo45754l() || OSUtils.m40260I(md4.mo45747e().optString("alert"))) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static void m41010q(Context context, Bundle bundle, C5276f fVar, C5274d dVar) {
        boolean z;
        JSONObject a = m40994a(bundle);
        long a2 = OneSignal.m40443w0().mo46064a() / 1000;
        boolean z2 = bundle.getBoolean("is_restoring", false);
        if (Integer.parseInt(bundle.getString("pri", "0")) > 9) {
            z = true;
        } else {
            z = false;
        }
        OneSignal.m40369W0(context, a, new C5273c(z2, context, bundle, dVar, a, a2, z, fVar));
    }
}
