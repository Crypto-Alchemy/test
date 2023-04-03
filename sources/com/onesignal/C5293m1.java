package com.onesignal;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.m1 */
/* compiled from: UserStateSecondaryChannelSynchronizer */
public abstract class C5293m1 extends C5296n1 {
    public C5293m1(OneSignalStateSynchronizer.UserStateSynchronizerType userStateSynchronizerType) {
        super(userStateSynchronizerType);
    }

    /* renamed from: B */
    public abstract String mo38931B();

    /* renamed from: C */
    public OneSignal.LOG_LEVEL mo38952C() {
        return OneSignal.LOG_LEVEL.INFO;
    }

    /* renamed from: P */
    public void mo38953P(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(mo38937i0(), jSONObject.get("identifier"));
                if (jSONObject.has(mo38936h0())) {
                    jSONObject2.put(mo38936h0(), jSONObject.get(mo38936h0()));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            mo38935g0(jSONObject2);
        }
    }

    /* renamed from: U */
    public void mo38954U() {
        boolean z;
        if (mo38931B() == null && mo38997E() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z && OneSignal.m40452z0() != null) {
            mo38996D(0).mo39033c();
        }
    }

    /* renamed from: f0 */
    public abstract void mo38934f0();

    /* renamed from: g0 */
    public abstract void mo38935g0(JSONObject jSONObject);

    /* renamed from: h0 */
    public abstract String mo38936h0();

    /* renamed from: i0 */
    public abstract String mo38937i0();

    /* renamed from: j0 */
    public abstract int mo38938j0();

    /* renamed from: k0 */
    public void mo38993k0() {
        mo38954U();
    }

    /* renamed from: n */
    public void mo38961n(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", mo38938j0());
            jSONObject.putOpt("device_player_id", OneSignal.m40452z0());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: w */
    public void mo38962w(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            mo38934f0();
        }
    }
}
