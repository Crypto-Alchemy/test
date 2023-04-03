package com.onesignal;

import com.onesignal.OneSignal;

/* renamed from: com.onesignal.i0 */
/* compiled from: OSNotificationOpenedResult */
public class C5259i0 implements OneSignal.C5156v {

    /* renamed from: a */
    public final C5331t0 f26395a;

    /* renamed from: b */
    public final Runnable f26396b;

    /* renamed from: c */
    public C5211d0 f26397c;

    /* renamed from: d */
    public OSNotificationAction f26398d;

    /* renamed from: e */
    public boolean f26399e = false;

    /* renamed from: com.onesignal.i0$a */
    /* compiled from: OSNotificationOpenedResult */
    public class C5260a implements Runnable {
        public C5260a() {
        }

        public void run() {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "Running complete from OSNotificationOpenedResult timeout runnable!");
            C5259i0.this.mo38881c(false);
        }
    }

    public C5259i0(C5211d0 d0Var, OSNotificationAction oSNotificationAction) {
        this.f26397c = d0Var;
        this.f26398d = oSNotificationAction;
        C5331t0 b = C5331t0.m41330b();
        this.f26395a = b;
        C5260a aVar = new C5260a();
        this.f26396b = aVar;
        b.mo39119c(5000, aVar);
    }

    /* renamed from: a */
    public void mo38593a(OneSignal.AppEntryAction appEntryAction) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40387d1(log_level, "OSNotificationOpenedResult onEntryStateChange called with appEntryState: " + appEntryAction);
        mo38881c(OneSignal.AppEntryAction.APP_CLOSE.equals(appEntryAction));
    }

    /* renamed from: c */
    public final void mo38881c(boolean z) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40387d1(log_level, "OSNotificationOpenedResult complete called with opened: " + z);
        this.f26395a.mo39118a(this.f26396b);
        if (this.f26399e) {
            OneSignal.m40387d1(log_level, "OSNotificationOpenedResult already completed");
            return;
        }
        this.f26399e = true;
        if (z) {
            OneSignal.m40451z(this.f26397c.mo38746g());
        }
        OneSignal.m40417n1(this);
    }

    /* renamed from: d */
    public C5211d0 mo38882d() {
        return this.f26397c;
    }

    public String toString() {
        return "OSNotificationOpenedResult{notification=" + this.f26397c + ", action=" + this.f26398d + ", isComplete=" + this.f26399e + '}';
    }
}
