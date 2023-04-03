package com.onesignal;

import android.content.Context;
import com.onesignal.OneSignal;
import org.json.JSONObject;

/* renamed from: com.onesignal.e0 */
/* compiled from: OSNotificationController */
public class C5220e0 {

    /* renamed from: a */
    public final md4 f26299a;

    /* renamed from: b */
    public boolean f26300b;

    /* renamed from: c */
    public boolean f26301c;

    public C5220e0(md4 md4, boolean z, boolean z2) {
        this.f26300b = z;
        this.f26301c = z2;
        this.f26299a = md4;
    }

    /* renamed from: h */
    public static void m40809h(Context context) {
        String f = OSUtils.m40275f(context, "com.onesignal.NotificationServiceExtension");
        if (f == null) {
            OneSignal.m40387d1(OneSignal.LOG_LEVEL.VERBOSE, "No class found, not setting up OSRemoteNotificationReceivedHandler");
            return;
        }
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
        OneSignal.m40387d1(log_level, "Found class: " + f + ", attempting to call constructor");
        try {
            Object newInstance = Class.forName(f).newInstance();
            if ((newInstance instanceof OneSignal.C5133d0) && OneSignal.f26052p == null) {
                OneSignal.m40321F1((OneSignal.C5133d0) newInstance);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: a */
    public final md4 mo38802a(Context context, C5211d0 d0Var, JSONObject jSONObject, Long l) {
        md4 md4 = new md4(context);
        md4.mo45759q(jSONObject);
        md4.mo45769z(l);
        md4.mo45768y(this.f26300b);
        md4.mo45760r(d0Var);
        return md4;
    }

    /* renamed from: b */
    public md4 mo38803b() {
        return this.f26299a;
    }

    /* renamed from: c */
    public C5266j0 mo38804c() {
        return new C5266j0(this, this.f26299a.mo45748f());
    }

    /* renamed from: d */
    public boolean mo38805d() {
        if (!OneSignal.m40407k0().mo39046l()) {
            return true;
        }
        if (this.f26299a.mo45748f().mo38747h() + ((long) this.f26299a.mo45748f().mo38751l()) > OneSignal.m40443w0().mo46064a() / 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo38806e(C5211d0 d0Var) {
        this.f26299a.mo45760r(d0Var);
        if (this.f26300b) {
            C5270k.m40998e(this.f26299a);
            return;
        }
        this.f26299a.mo45758p(false);
        C5270k.m41007n(this.f26299a, true, false);
        OneSignal.m40320F0(this.f26299a);
    }

    /* renamed from: f */
    public void mo38807f(C5211d0 d0Var, C5211d0 d0Var2) {
        if (d0Var2 != null) {
            boolean I = OSUtils.m40260I(d0Var2.mo38744e());
            boolean d = mo38805d();
            if (!I || !d) {
                mo38806e(d0Var);
            } else {
                this.f26299a.mo45760r(d0Var2);
                C5270k.m41005l(this, this.f26301c);
            }
            if (this.f26300b) {
                OSUtils.m40273V(100);
                return;
            }
            return;
        }
        mo38806e(d0Var);
    }

    /* renamed from: g */
    public void mo38808g(boolean z) {
        this.f26301c = z;
    }

    public String toString() {
        return "OSNotificationController{notificationJob=" + this.f26299a + ", isRestoring=" + this.f26300b + ", isBackgroundLogic=" + this.f26301c + '}';
    }

    public C5220e0(Context context, C5211d0 d0Var, JSONObject jSONObject, boolean z, boolean z2, Long l) {
        this.f26300b = z;
        this.f26301c = z2;
        this.f26299a = mo38802a(context, d0Var, jSONObject, l);
    }
}
