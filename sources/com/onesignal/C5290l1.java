package com.onesignal;

import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONObject;

/* renamed from: com.onesignal.l1 */
/* compiled from: UserStateSMSSynchronizer */
public class C5290l1 extends C5293m1 {
    public C5290l1() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.SMS);
    }

    /* renamed from: B */
    public String mo38931B() {
        return OneSignal.m40413m0();
    }

    /* renamed from: O */
    public C5261i1 mo38932O(String str, boolean z) {
        return new x57(str, z);
    }

    /* renamed from: d0 */
    public void mo38933d0(String str) {
        OneSignal.m40357R1(str);
    }

    /* renamed from: f0 */
    public void mo38934f0() {
        OneSignal.m40337L();
    }

    /* renamed from: g0 */
    public void mo38935g0(JSONObject jSONObject) {
        OneSignal.m40340M(jSONObject);
    }

    /* renamed from: h0 */
    public String mo38936h0() {
        return "sms_auth_hash";
    }

    /* renamed from: i0 */
    public String mo38937i0() {
        return "sms_number";
    }

    /* renamed from: j0 */
    public int mo38938j0() {
        return 14;
    }

    /* renamed from: l0 */
    public void mo38984l0(String str) {
        OneSignal.m40438u1(str);
    }
}
