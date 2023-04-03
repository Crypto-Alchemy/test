package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: w91 */
/* compiled from: DefaultSettingsJsonTransform */
public class w91 implements jz5 {
    /* renamed from: b */
    public static C5845fo m53757b(JSONObject jSONObject) throws JSONException {
        return new C5845fo(jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    /* renamed from: c */
    public static pz1 m53758c(JSONObject jSONObject) {
        return new pz1(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: d */
    public static xx5 m53759d(JSONObject jSONObject) {
        return new xx5(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: e */
    public static xy5 m53760e(mx0 mx0) {
        JSONObject jSONObject = new JSONObject();
        return new zy5(m53761f(mx0, 3600, jSONObject), (C5845fo) null, m53759d(jSONObject), m53758c(jSONObject), 0, 3600);
    }

    /* renamed from: f */
    public static long m53761f(mx0 mx0, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return mx0.mo43635a() + (j * 1000);
    }

    /* renamed from: a */
    public zy5 mo44632a(mx0 mx0, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new zy5(m53761f(mx0, (long) optInt2, jSONObject), m53757b(jSONObject.getJSONObject("app")), m53759d(jSONObject.getJSONObject("session")), m53758c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
