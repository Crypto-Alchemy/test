package com.onesignal;

import com.onesignal.C5346y0;

/* renamed from: com.onesignal.o0 */
/* compiled from: OSRemoteParamController */
public class C5305o0 {

    /* renamed from: a */
    public C5346y0.C5353f f26497a = null;

    /* renamed from: a */
    public void mo39035a() {
        this.f26497a = null;
    }

    /* renamed from: b */
    public boolean mo39036b() {
        return C5342x0.m41391b(C5342x0.f26571a, "OS_CLEAR_GROUP_SUMMARY_CLICK", true);
    }

    /* renamed from: c */
    public boolean mo39037c() {
        return C5342x0.m41391b(C5342x0.f26571a, "GT_FIREBASE_TRACKING_ENABLED", false);
    }

    /* renamed from: d */
    public C5346y0.C5353f mo39038d() {
        return this.f26497a;
    }

    /* renamed from: e */
    public boolean mo39039e() {
        return C5342x0.m41391b(C5342x0.f26571a, "ONESIGNAL_USER_PROVIDED_CONSENT", false);
    }

    /* renamed from: f */
    public boolean mo39040f() {
        C5346y0.C5353f fVar = this.f26497a;
        if (fVar == null || fVar.f26608m == null) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo39041g() {
        return C5342x0.m41391b(C5342x0.f26571a, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", false);
    }

    /* renamed from: h */
    public boolean mo39042h() {
        return C5342x0.m41391b(C5342x0.f26571a, "PREFS_OS_LOCATION_SHARED", true);
    }

    /* renamed from: i */
    public boolean mo39043i() {
        return C5342x0.m41391b(C5342x0.f26571a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", false);
    }

    /* renamed from: j */
    public boolean mo39044j() {
        return C5342x0.m41391b(C5342x0.f26571a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", false);
    }

    /* renamed from: k */
    public boolean mo39045k() {
        if (this.f26497a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo39046l() {
        return C5342x0.m41391b(C5342x0.f26571a, "OS_RESTORE_TTL_FILTER", true);
    }

    /* renamed from: m */
    public void mo39047m(boolean z) {
        C5342x0.m41399j(C5342x0.f26571a, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", z);
    }

    /* renamed from: n */
    public void mo39048n(boolean z) {
        C5342x0.m41399j(C5342x0.f26571a, "PREFS_OS_LOCATION_SHARED", z);
    }

    /* renamed from: o */
    public void mo39049o(boolean z) {
        C5342x0.m41399j(C5342x0.f26571a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", z);
    }

    /* renamed from: p */
    public final void mo39050p(boolean z) {
        C5342x0.m41399j(C5342x0.f26571a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", z);
    }

    /* renamed from: q */
    public void mo39051q(C5346y0.C5353f fVar, qe4 qe4, je4 je4, ld4 ld4) {
        this.f26497a = fVar;
        String str = C5342x0.f26571a;
        C5342x0.m41399j(str, "GT_FIREBASE_TRACKING_ENABLED", fVar.f26601f);
        mo39052r(fVar.f26602g);
        C5342x0.m41399j(str, "OS_CLEAR_GROUP_SUMMARY_CLICK", fVar.f26603h);
        C5342x0.m41399j(str, je4.mo44445j(), fVar.f26609n.f26595h);
        mo39050p(fVar.f26604i);
        ld4.debug("OneSignal saveInfluenceParams: " + fVar.f26609n.toString());
        qe4.mo47088j(fVar.f26609n);
        Boolean bool = fVar.f26605j;
        if (bool != null) {
            mo39047m(bool.booleanValue());
        }
        Boolean bool2 = fVar.f26606k;
        if (bool2 != null) {
            mo39053s(bool2.booleanValue());
        }
        Boolean bool3 = fVar.f26607l;
        if (bool3 != null) {
            OneSignal.m40345N1(bool3.booleanValue());
        }
        Boolean bool4 = fVar.f26608m;
        if (bool4 != null) {
            mo39049o(bool4.booleanValue());
        }
    }

    /* renamed from: r */
    public final void mo39052r(boolean z) {
        C5342x0.m41399j(C5342x0.f26571a, "OS_RESTORE_TTL_FILTER", this.f26497a.f26602g);
    }

    /* renamed from: s */
    public void mo39053s(boolean z) {
        C5342x0.m41399j(C5342x0.f26571a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", z);
    }

    /* renamed from: t */
    public boolean mo39054t() {
        return C5342x0.m41391b(C5342x0.f26571a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true);
    }
}
