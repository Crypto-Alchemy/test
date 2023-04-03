package com.onesignal;

import com.onesignal.C5355z0;
import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.n0 */
/* compiled from: OSReceiveReceiptRepository */
public class C5295n0 {
    /* renamed from: a */
    public void mo38994a(String str, String str2, Integer num, String str3, C5355z0.C5362g gVar) {
        try {
            JSONObject put = new JSONObject().put("app_id", str).put("player_id", str2);
            if (num != null) {
                put.put("device_type", num);
            }
            C5355z0.m41447l("notifications/" + str3 + "/report_received", put, gVar);
        } catch (JSONException e) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Generating direct receive receipt:JSON Failed.", e);
        }
    }
}
