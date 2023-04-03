package com.onesignal;

import com.onesignal.C5296n1;
import com.onesignal.C5355z0;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.k1 */
/* compiled from: UserStatePushSynchronizer */
public class C5279k1 extends C5296n1 {

    /* renamed from: m */
    public static boolean f26446m;

    /* renamed from: com.onesignal.k1$a */
    /* compiled from: UserStatePushSynchronizer */
    public class C5280a extends C5355z0.C5362g {
        public C5280a() {
        }

        /* renamed from: b */
        public void mo38415b(String str) {
            boolean unused = C5279k1.f26446m = true;
            if (str == null || str.isEmpty()) {
                str = "{}";
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("tags")) {
                    synchronized (C5279k1.this.f26469a) {
                        C5279k1 k1Var = C5279k1.this;
                        JSONObject y = k1Var.mo39029y(k1Var.mo38995A().mo38895l().mo45509e("tags"), C5279k1.this.mo38999G().mo38895l().mo45509e("tags"), (JSONObject) null, (Set<String>) null);
                        C5279k1.this.mo38995A().mo38903t("tags", jSONObject.optJSONObject("tags"));
                        C5279k1.this.mo38995A().mo38900q();
                        C5279k1.this.mo38999G().mo38898o(jSONObject, y);
                        C5279k1.this.mo38999G().mo38900q();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public C5279k1() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.PUSH);
    }

    /* renamed from: B */
    public String mo38931B() {
        return OneSignal.m40452z0();
    }

    /* renamed from: C */
    public OneSignal.LOG_LEVEL mo38952C() {
        return OneSignal.LOG_LEVEL.ERROR;
    }

    /* renamed from: O */
    public C5261i1 mo38932O(String str, boolean z) {
        return new w57(str, z);
    }

    /* renamed from: P */
    public void mo38953P(JSONObject jSONObject) {
    }

    /* renamed from: U */
    public void mo38954U() {
        mo38996D(0).mo39033c();
    }

    /* renamed from: d0 */
    public void mo38933d0(String str) {
        OneSignal.m40360S1(str);
    }

    /* renamed from: g0 */
    public String mo38955g0() {
        return mo38999G().mo38892i().mo45511g("language", (String) null);
    }

    /* renamed from: h0 */
    public C5296n1.C5301e mo38956h0(boolean z) {
        C5296n1.C5301e eVar;
        if (z) {
            String z0 = OneSignal.m40452z0();
            String o0 = OneSignal.m40419o0();
            C5355z0.m41441f("players/" + z0 + "?app_id=" + o0, new C5280a(), "CACHE_KEY_GET_TAGS");
        }
        synchronized (this.f26469a) {
            eVar = new C5296n1.C5301e(f26446m, vz2.m53659c(mo38999G().mo38895l(), "tags"));
        }
        return eVar;
    }

    /* renamed from: i0 */
    public boolean mo38957i0() {
        return mo38999G().mo38892i().mo45507c("userSubscribePref", true);
    }

    /* renamed from: j0 */
    public void mo38958j0(String str) {
        OneSignal.m40441v1(str);
    }

    /* renamed from: k0 */
    public void mo38959k0(boolean z) {
        try {
            mo39000H().mo38902s("androidPermission", Boolean.valueOf(z));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: l0 */
    public void mo38960l0(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", (String) null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", (String) null));
            mo39000H().mo38891h(jSONObject2, (Set<String>) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject3.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject3.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            mo39000H().mo38890g(jSONObject3, (Set<String>) null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: n */
    public void mo38961n(JSONObject jSONObject) {
    }

    /* renamed from: w */
    public void mo38962w(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            OneSignal.m40325H();
        }
        if (jSONObject.has("sms_number")) {
            OneSignal.m40337L();
        }
    }
}
