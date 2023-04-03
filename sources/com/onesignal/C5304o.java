package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.o */
/* compiled from: NotificationPayloadProcessorHMS */
public class C5304o {
    /* renamed from: a */
    public static JSONObject m41181a(Intent intent) {
        if (!C5235g0.m40849e(intent)) {
            return null;
        }
        JSONObject a = C5270k.m40994a(intent.getExtras());
        m41184d(a);
        return a;
    }

    /* renamed from: b */
    public static void m41182b(Activity activity, Intent intent) {
        JSONObject a;
        OneSignal.m40338L0(activity.getApplicationContext());
        if (intent != null && (a = m41181a(intent)) != null) {
            m41183c(activity, a);
        }
    }

    /* renamed from: c */
    public static void m41183c(Activity activity, JSONObject jSONObject) {
        if (!ed4.m43929b(activity, jSONObject)) {
            OneSignal.m40317E0(activity, new JSONArray().put(jSONObject), C5235g0.m40846b(jSONObject));
        }
    }

    /* renamed from: d */
    public static void m41184d(JSONObject jSONObject) {
        try {
            String str = (String) C5270k.m40995b(jSONObject).remove("actionId");
            if (str != null) {
                jSONObject.put("actionId", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
