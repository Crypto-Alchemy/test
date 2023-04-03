package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.g0 */
/* compiled from: OSNotificationFormatHelper */
public class C5235g0 {
    /* renamed from: a */
    public static String m40845a(Bundle bundle) {
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("custom", (String) null);
            if (string != null) {
                return m40847c(string);
            }
            OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.");
        }
        return null;
    }

    /* renamed from: b */
    public static String m40846b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return m40847c(jSONObject.optString("custom", (String) null));
    }

    /* renamed from: c */
    public static String m40847c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("i")) {
                return jSONObject.optString("i", (String) null);
            }
            OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted JSON string. No 'i' field in custom.");
            return null;
        } catch (JSONException unused) {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted JSON String, error parsing string as JSON.");
        }
    }

    /* renamed from: d */
    public static boolean m40848d(Bundle bundle) {
        if (m40845a(bundle) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m40849e(Intent intent) {
        if (intent == null) {
            return false;
        }
        return m40848d(intent.getExtras());
    }
}
