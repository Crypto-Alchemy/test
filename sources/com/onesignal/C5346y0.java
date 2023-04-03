package com.onesignal;

import com.onesignal.C5355z0;
import com.onesignal.OneSignal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.y0 */
/* compiled from: OneSignalRemoteParams */
public class C5346y0 {

    /* renamed from: a */
    public static int f26579a;

    /* renamed from: com.onesignal.y0$a */
    /* compiled from: OneSignalRemoteParams */
    public class C5347a extends C5355z0.C5362g {

        /* renamed from: a */
        public final /* synthetic */ String f26580a;

        /* renamed from: b */
        public final /* synthetic */ String f26581b;

        /* renamed from: c */
        public final /* synthetic */ C5350c f26582c;

        /* renamed from: com.onesignal.y0$a$a */
        /* compiled from: OneSignalRemoteParams */
        public class C5348a implements Runnable {
            public C5348a() {
            }

            public void run() {
                int a = (C5346y0.f26579a * 10000) + 30000;
                if (a > 90000) {
                    a = 90000;
                }
                OneSignal.m40376a(OneSignal.LOG_LEVEL.INFO, "Failed to get Android parameters, trying again in " + (a / 1000) + " seconds.");
                try {
                    Thread.sleep((long) a);
                    C5346y0.m41416b();
                    C5347a aVar = C5347a.this;
                    C5346y0.m41419e(aVar.f26580a, aVar.f26581b, aVar.f26582c);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public C5347a(String str, String str2, C5350c cVar) {
            this.f26580a = str;
            this.f26581b = str2;
            this.f26582c = cVar;
        }

        /* renamed from: a */
        public void mo38414a(int i, String str, Throwable th) {
            if (i == 403) {
                OneSignal.m40376a(OneSignal.LOG_LEVEL.FATAL, "403 error getting OneSignal params, omitting further retries!");
            } else {
                new Thread(new C5348a(), "OS_PARAMS_REQUEST").start();
            }
        }

        /* renamed from: b */
        public void mo38415b(String str) {
            C5346y0.m41420f(str, this.f26582c);
        }
    }

    /* renamed from: com.onesignal.y0$b */
    /* compiled from: OneSignalRemoteParams */
    public class C5349b extends C5353f {

        /* renamed from: p */
        public final /* synthetic */ JSONObject f26584p;

        public C5349b(JSONObject jSONObject) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            this.f26584p = jSONObject;
            this.f26597b = jSONObject.optBoolean("enterp", false);
            this.f26598c = jSONObject.optBoolean("require_email_auth", false);
            this.f26599d = jSONObject.optBoolean("require_user_id_auth", false);
            this.f26600e = jSONObject.optJSONArray("chnl_lst");
            this.f26601f = jSONObject.optBoolean("fba", false);
            this.f26602g = jSONObject.optBoolean("restore_ttl_filter", true);
            this.f26596a = jSONObject.optString("android_sender_id", (String) null);
            this.f26603h = jSONObject.optBoolean("clear_group_on_summary_click", true);
            this.f26604i = jSONObject.optBoolean("receive_receipts_enable", false);
            if (!jSONObject.has("disable_gms_missing_prompt")) {
                bool = null;
            } else {
                bool = Boolean.valueOf(jSONObject.optBoolean("disable_gms_missing_prompt", false));
            }
            this.f26605j = bool;
            if (!jSONObject.has("unsubscribe_on_notifications_disabled")) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(jSONObject.optBoolean("unsubscribe_on_notifications_disabled", true));
            }
            this.f26606k = bool2;
            if (!jSONObject.has("location_shared")) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(jSONObject.optBoolean("location_shared", true));
            }
            this.f26607l = bool3;
            if (!jSONObject.has("requires_user_privacy_consent")) {
                bool4 = null;
            } else {
                bool4 = Boolean.valueOf(jSONObject.optBoolean("requires_user_privacy_consent", false));
            }
            this.f26608m = bool4;
            this.f26609n = new C5352e();
            if (jSONObject.has("outcomes")) {
                C5346y0.m41421g(jSONObject.optJSONObject("outcomes"), this.f26609n);
            }
            this.f26610o = new C5351d();
            if (jSONObject.has("fcm")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("fcm");
                this.f26610o.f26587c = optJSONObject.optString("api_key", (String) null);
                this.f26610o.f26586b = optJSONObject.optString("app_id", (String) null);
                this.f26610o.f26585a = optJSONObject.optString("project_id", (String) null);
            }
        }
    }

    /* renamed from: com.onesignal.y0$c */
    /* compiled from: OneSignalRemoteParams */
    public interface C5350c {
        /* renamed from: a */
        void mo38586a(C5353f fVar);
    }

    /* renamed from: com.onesignal.y0$d */
    /* compiled from: OneSignalRemoteParams */
    public static class C5351d {

        /* renamed from: a */
        public String f26585a;

        /* renamed from: b */
        public String f26586b;

        /* renamed from: c */
        public String f26587c;
    }

    /* renamed from: com.onesignal.y0$e */
    /* compiled from: OneSignalRemoteParams */
    public static class C5352e {

        /* renamed from: a */
        public int f26588a = 1440;

        /* renamed from: b */
        public int f26589b = 10;

        /* renamed from: c */
        public int f26590c = 1440;

        /* renamed from: d */
        public int f26591d = 10;

        /* renamed from: e */
        public boolean f26592e = false;

        /* renamed from: f */
        public boolean f26593f = false;

        /* renamed from: g */
        public boolean f26594g = false;

        /* renamed from: h */
        public boolean f26595h = false;

        /* renamed from: a */
        public int mo39169a() {
            return this.f26591d;
        }

        /* renamed from: b */
        public int mo39170b() {
            return this.f26590c;
        }

        /* renamed from: c */
        public int mo39171c() {
            return this.f26588a;
        }

        /* renamed from: d */
        public int mo39172d() {
            return this.f26589b;
        }

        /* renamed from: e */
        public boolean mo39173e() {
            return this.f26592e;
        }

        /* renamed from: f */
        public boolean mo39174f() {
            return this.f26593f;
        }

        /* renamed from: g */
        public boolean mo39175g() {
            return this.f26594g;
        }

        public String toString() {
            return "InfluenceParams{indirectNotificationAttributionWindow=" + this.f26588a + ", notificationLimit=" + this.f26589b + ", indirectIAMAttributionWindow=" + this.f26590c + ", iamLimit=" + this.f26591d + ", directEnabled=" + this.f26592e + ", indirectEnabled=" + this.f26593f + ", unattributedEnabled=" + this.f26594g + '}';
        }
    }

    /* renamed from: com.onesignal.y0$f */
    /* compiled from: OneSignalRemoteParams */
    public static class C5353f {

        /* renamed from: a */
        public String f26596a;

        /* renamed from: b */
        public boolean f26597b;

        /* renamed from: c */
        public boolean f26598c;

        /* renamed from: d */
        public boolean f26599d;

        /* renamed from: e */
        public JSONArray f26600e;

        /* renamed from: f */
        public boolean f26601f;

        /* renamed from: g */
        public boolean f26602g;

        /* renamed from: h */
        public boolean f26603h;

        /* renamed from: i */
        public boolean f26604i;

        /* renamed from: j */
        public Boolean f26605j;

        /* renamed from: k */
        public Boolean f26606k;

        /* renamed from: l */
        public Boolean f26607l;

        /* renamed from: m */
        public Boolean f26608m;

        /* renamed from: n */
        public C5352e f26609n;

        /* renamed from: o */
        public C5351d f26610o;
    }

    /* renamed from: b */
    public static /* synthetic */ int m41416b() {
        int i = f26579a;
        f26579a = i + 1;
        return i;
    }

    /* renamed from: e */
    public static void m41419e(String str, String str2, C5350c cVar) {
        C5347a aVar = new C5347a(str, str2, cVar);
        String str3 = "apps/" + str + "/android_params.js";
        if (str2 != null) {
            str3 = str3 + "?player_id=" + str2;
        }
        OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "Starting request to get Android parameters.");
        C5355z0.m41440e(str3, aVar, "CACHE_KEY_REMOTE_PARAMS");
    }

    /* renamed from: f */
    public static void m41420f(String str, C5350c cVar) {
        try {
            cVar.mo38586a(new C5349b(new JSONObject(str)));
        } catch (NullPointerException | JSONException e) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.FATAL;
            OneSignal.m40379b(log_level, "Error parsing android_params!: ", e);
            OneSignal.m40376a(log_level, "Response that errored from android_params!: " + str);
        }
    }

    /* renamed from: g */
    public static void m41421g(JSONObject jSONObject, C5352e eVar) {
        if (jSONObject.has("v2_enabled")) {
            eVar.f26595h = jSONObject.optBoolean("v2_enabled");
        }
        if (jSONObject.has("direct")) {
            eVar.f26592e = jSONObject.optJSONObject("direct").optBoolean("enabled");
        }
        if (jSONObject.has("indirect")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("indirect");
            eVar.f26593f = optJSONObject.optBoolean("enabled");
            if (optJSONObject.has("notification_attribution")) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("notification_attribution");
                eVar.f26588a = optJSONObject2.optInt("minutes_since_displayed", 1440);
                eVar.f26589b = optJSONObject2.optInt("limit", 10);
            }
            if (optJSONObject.has("in_app_message_attribution")) {
                JSONObject optJSONObject3 = optJSONObject.optJSONObject("in_app_message_attribution");
                eVar.f26590c = optJSONObject3.optInt("minutes_since_displayed", 1440);
                eVar.f26591d = optJSONObject3.optInt("limit", 10);
            }
        }
        if (jSONObject.has("unattributed")) {
            eVar.f26594g = jSONObject.optJSONObject("unattributed").optBoolean("enabled");
        }
    }
}
