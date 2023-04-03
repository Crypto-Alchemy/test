package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.m0 */
/* compiled from: OSPermissionState */
public class C5292m0 implements Cloneable {

    /* renamed from: a */
    public C5277k0<Object, C5292m0> f26467a = new C5277k0<>("changed", false);

    /* renamed from: d */
    public boolean f26468d;

    public C5292m0(boolean z) {
        if (z) {
            this.f26468d = C5342x0.m41391b(C5342x0.f26571a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", false);
        } else {
            mo38989f();
        }
    }

    /* renamed from: a */
    public boolean mo38985a() {
        return this.f26468d;
    }

    /* renamed from: b */
    public C5277k0<Object, C5292m0> mo38986b() {
        return this.f26467a;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public void mo38988d() {
        C5342x0.m41399j(C5342x0.f26571a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", this.f26468d);
    }

    /* renamed from: f */
    public void mo38989f() {
        mo38990g(OSUtils.m40274a(OneSignal.f26030e));
    }

    /* renamed from: g */
    public final void mo38990g(boolean z) {
        boolean z2;
        if (this.f26468d != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f26468d = z;
        if (z2) {
            this.f26467a.mo38950c(this);
        }
    }

    /* renamed from: h */
    public JSONObject mo38991h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("areNotificationsEnabled", this.f26468d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo38991h().toString();
    }
}
