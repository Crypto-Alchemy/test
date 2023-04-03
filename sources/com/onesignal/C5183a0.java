package com.onesignal;

import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.a0 */
/* compiled from: OSInAppMessageRedisplayStats */
public class C5183a0 {

    /* renamed from: a */
    public long f26154a;

    /* renamed from: b */
    public int f26155b;

    /* renamed from: c */
    public int f26156c;

    /* renamed from: d */
    public long f26157d;

    /* renamed from: e */
    public boolean f26158e;

    public C5183a0() {
        this.f26154a = -1;
        this.f26155b = 0;
        this.f26156c = 1;
        this.f26157d = 0;
        this.f26158e = false;
    }

    /* renamed from: a */
    public int mo38670a() {
        return this.f26155b;
    }

    /* renamed from: b */
    public long mo38671b() {
        return this.f26154a;
    }

    /* renamed from: c */
    public void mo38672c() {
        this.f26155b++;
    }

    /* renamed from: d */
    public boolean mo38673d() {
        if (this.f26154a < 0) {
            return true;
        }
        long a = OneSignal.m40443w0().mo46064a() / 1000;
        long j = a - this.f26154a;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "OSInAppMessage lastDisplayTime: " + this.f26154a + " currentTimeInSeconds: " + a + " diffInSeconds: " + j + " displayDelay: " + this.f26157d);
        if (j >= this.f26157d) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo38674e() {
        return this.f26158e;
    }

    /* renamed from: f */
    public void mo38675f(int i) {
        this.f26155b = i;
    }

    /* renamed from: g */
    public void mo38676g(C5183a0 a0Var) {
        mo38677h(a0Var.mo38671b());
        mo38675f(a0Var.mo38670a());
    }

    /* renamed from: h */
    public void mo38677h(long j) {
        this.f26154a = j;
    }

    /* renamed from: i */
    public boolean mo38678i() {
        boolean z;
        if (this.f26155b < this.f26156c) {
            z = true;
        } else {
            z = false;
        }
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "OSInAppMessage shouldDisplayAgain: " + z);
        return z;
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.f26154a + ", displayQuantity=" + this.f26155b + ", displayLimit=" + this.f26156c + ", displayDelay=" + this.f26157d + '}';
    }

    public C5183a0(int i, long j) {
        this.f26156c = 1;
        this.f26157d = 0;
        this.f26158e = false;
        this.f26155b = i;
        this.f26154a = j;
    }

    public C5183a0(JSONObject jSONObject) throws JSONException {
        this.f26154a = -1;
        this.f26155b = 0;
        this.f26156c = 1;
        this.f26157d = 0;
        this.f26158e = true;
        Object obj = jSONObject.get("limit");
        Object obj2 = jSONObject.get("delay");
        if (obj instanceof Integer) {
            this.f26156c = ((Integer) obj).intValue();
        }
        if (obj2 instanceof Long) {
            this.f26157d = ((Long) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            this.f26157d = (long) ((Integer) obj2).intValue();
        }
    }
}
