package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

public class OSSubscriptionState implements Cloneable {

    /* renamed from: a */
    public C5277k0<Object, OSSubscriptionState> f25980a = new C5277k0<>("changed", false);

    /* renamed from: d */
    public String f25981d;

    /* renamed from: e */
    public String f25982e;

    /* renamed from: g */
    public boolean f25983g;

    /* renamed from: k */
    public boolean f25984k;

    public OSSubscriptionState(boolean z, boolean z2) {
        if (z) {
            String str = C5342x0.f26571a;
            this.f25984k = C5342x0.m41391b(str, "ONESIGNAL_SUBSCRIPTION_LAST", true);
            this.f25981d = C5342x0.m41395f(str, "ONESIGNAL_PLAYER_ID_LAST", (String) null);
            this.f25982e = C5342x0.m41395f(str, "ONESIGNAL_PUSH_TOKEN_LAST", (String) null);
            this.f25983g = C5342x0.m41391b(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", false);
            return;
        }
        this.f25984k = !OneSignalStateSynchronizer.m40485j();
        this.f25981d = OneSignal.m40452z0();
        this.f25982e = OneSignalStateSynchronizer.m40480e();
        this.f25983g = z2;
    }

    /* renamed from: a */
    public C5277k0<Object, OSSubscriptionState> mo38538a() {
        return this.f25980a;
    }

    /* renamed from: b */
    public boolean mo38539b() {
        return this.f25984k;
    }

    public void changed(C5292m0 m0Var) {
        mo38544g(m0Var.mo38985a());
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo38542d() {
        if (this.f25981d == null || this.f25982e == null || this.f25984k || !this.f25983g) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo38543f() {
        String str = C5342x0.f26571a;
        C5342x0.m41399j(str, "ONESIGNAL_SUBSCRIPTION_LAST", this.f25984k);
        C5342x0.m41402m(str, "ONESIGNAL_PLAYER_ID_LAST", this.f25981d);
        C5342x0.m41402m(str, "ONESIGNAL_PUSH_TOKEN_LAST", this.f25982e);
        C5342x0.m41399j(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", this.f25983g);
    }

    /* renamed from: g */
    public final void mo38544g(boolean z) {
        boolean d = mo38542d();
        this.f25983g = z;
        if (d != mo38542d()) {
            this.f25980a.mo38950c(this);
        }
    }

    /* renamed from: h */
    public void mo38545h(String str) {
        if (str != null) {
            boolean z = !str.equals(this.f25982e);
            this.f25982e = str;
            if (z) {
                this.f25980a.mo38950c(this);
            }
        }
    }

    /* renamed from: i */
    public void mo38546i(String str) {
        boolean z = true;
        if (str != null ? str.equals(this.f25981d) : this.f25981d == null) {
            z = false;
        }
        this.f25981d = str;
        if (z) {
            this.f25980a.mo38950c(this);
        }
    }

    /* renamed from: j */
    public JSONObject mo38547j() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f25981d;
            if (str != null) {
                jSONObject.put("userId", str);
            } else {
                jSONObject.put("userId", JSONObject.NULL);
            }
            String str2 = this.f25982e;
            if (str2 != null) {
                jSONObject.put("pushToken", str2);
            } else {
                jSONObject.put("pushToken", JSONObject.NULL);
            }
            jSONObject.put("isPushDisabled", mo38539b());
            jSONObject.put("isSubscribed", mo38542d());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo38547j().toString();
    }
}
