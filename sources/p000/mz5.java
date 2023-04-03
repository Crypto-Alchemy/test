package p000;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mz5 */
/* compiled from: SettingsV3JsonTransform */
public class mz5 implements jz5 {
    /* renamed from: b */
    public static C5845fo m48558b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String str;
        String string = jSONObject2.getString("status");
        boolean equals = "new".equals(string);
        String string2 = jSONObject.getString("bundle_id");
        String string3 = jSONObject.getString("org_id");
        if (equals) {
            str = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
        } else {
            str = String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", new Object[]{string2});
        }
        String str2 = str;
        Locale locale = Locale.US;
        return new C5845fo(string, str2, String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", new Object[]{string2}), String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", new Object[]{string2}), string2, string3, jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    /* renamed from: c */
    public static pz1 m48559c(JSONObject jSONObject) {
        return new pz1(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: d */
    public static xx5 m48560d() {
        return new xx5(8, 4);
    }

    /* renamed from: e */
    public static long m48561e(mx0 mx0, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return mx0.mo43635a() + (j * 1000);
    }

    /* renamed from: a */
    public zy5 mo44632a(mx0 mx0, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new zy5(m48561e(mx0, (long) optInt2, jSONObject), m48558b(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject("app")), m48560d(), m48559c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
