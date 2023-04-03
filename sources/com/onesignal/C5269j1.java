package com.onesignal;

import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONObject;

/* renamed from: com.onesignal.j1 */
/* compiled from: UserStateEmailSynchronizer */
public class C5269j1 extends C5293m1 {
    public C5269j1() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.EMAIL);
    }

    /* renamed from: B */
    public String mo38931B() {
        return OneSignal.m40372Y();
    }

    /* renamed from: O */
    public C5261i1 mo38932O(String str, boolean z) {
        return new v57(str, z);
    }

    /* renamed from: d0 */
    public void mo38933d0(String str) {
        OneSignal.m40354Q1(str);
    }

    /* renamed from: f0 */
    public void mo38934f0() {
        OneSignal.m40325H();
    }

    /* renamed from: g0 */
    public void mo38935g0(JSONObject jSONObject) {
        OneSignal.m40328I();
    }

    /* renamed from: h0 */
    public String mo38936h0() {
        return "email_auth_hash";
    }

    /* renamed from: i0 */
    public String mo38937i0() {
        return "email";
    }

    /* renamed from: j0 */
    public int mo38938j0() {
        return 11;
    }

    /* renamed from: l0 */
    public void mo38939l0(String str) {
        OneSignal.m40435t1(str);
    }
}
