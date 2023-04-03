package com.onesignal;

import com.onesignal.OneSignal;
import com.onesignal.influence.domain.OSInfluenceType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.onesignal.p0 */
/* compiled from: OSSessionManager */
public class C5308p0 {

    /* renamed from: a */
    public qe4 f26503a;

    /* renamed from: b */
    public C5310b f26504b;

    /* renamed from: c */
    public ld4 f26505c;

    /* renamed from: com.onesignal.p0$a */
    /* compiled from: OSSessionManager */
    public class C5309a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f26506a;

        public C5309a(List list) {
            this.f26506a = list;
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            C5308p0.this.f26504b.mo38572a(this.f26506a);
        }
    }

    /* renamed from: com.onesignal.p0$b */
    /* compiled from: OSSessionManager */
    public interface C5310b {
        /* renamed from: a */
        void mo38572a(List<id4> list);
    }

    public C5308p0(C5310b bVar, qe4 qe4, ld4 ld4) {
        this.f26504b = bVar;
        this.f26503a = qe4;
        this.f26505c = ld4;
    }

    /* renamed from: b */
    public void mo39060b(JSONObject jSONObject, List<id4> list) {
        ld4 ld4 = this.f26505c;
        ld4.debug("OneSignal SessionManager addSessionData with influences: " + list.toString());
        this.f26503a.mo47079a(jSONObject, list);
        ld4 ld42 = this.f26505c;
        ld42.debug("OneSignal SessionManager addSessionIds on jsonObject: " + jSONObject);
    }

    /* renamed from: c */
    public void mo39061c(OneSignal.AppEntryAction appEntryAction) {
        mo39062d(appEntryAction, (String) null);
    }

    /* renamed from: d */
    public final void mo39062d(OneSignal.AppEntryAction appEntryAction, String str) {
        boolean z;
        id4 id4;
        this.f26505c.debug("OneSignal SessionManager attemptSessionUpgrade with entryAction: " + appEntryAction);
        wc4 b = this.f26503a.mo47080b(appEntryAction);
        List<wc4> d = this.f26503a.mo47082d(appEntryAction);
        ArrayList arrayList = new ArrayList();
        if (b != null) {
            id4 = b.mo49149e();
            OSInfluenceType oSInfluenceType = OSInfluenceType.DIRECT;
            if (str == null) {
                str = b.mo49152g();
            }
            z = mo39073o(b, oSInfluenceType, str, (JSONArray) null);
        } else {
            z = false;
            id4 = null;
        }
        if (z) {
            this.f26505c.debug("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + d);
            arrayList.add(id4);
            for (wc4 next : d) {
                if (next.mo49155k().isDirect()) {
                    arrayList.add(next.mo49149e());
                    next.mo49161t();
                }
            }
        }
        this.f26505c.debug("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        for (wc4 next2 : d) {
            if (next2.mo49155k().isUnattributed()) {
                JSONArray n = next2.mo49156n();
                if (n.length() > 0 && !appEntryAction.isAppClose()) {
                    id4 e = next2.mo49149e();
                    if (mo39073o(next2, OSInfluenceType.INDIRECT, (String) null, n)) {
                        arrayList.add(e);
                    }
                }
            }
        }
        OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "Trackers after update attempt: " + this.f26503a.mo47081c().toString());
        mo39072n(arrayList);
    }

    /* renamed from: e */
    public List<id4> mo39063e() {
        return this.f26503a.mo47084f();
    }

    /* renamed from: f */
    public List<id4> mo39064f() {
        return this.f26503a.mo47086h();
    }

    /* renamed from: g */
    public void mo39065g() {
        this.f26503a.mo47087i();
    }

    /* renamed from: h */
    public void mo39066h(String str) {
        ld4 ld4 = this.f26505c;
        ld4.debug("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: " + str);
        mo39073o(this.f26503a.mo47083e(), OSInfluenceType.DIRECT, str, (JSONArray) null);
    }

    /* renamed from: i */
    public void mo39067i() {
        this.f26505c.debug("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        this.f26503a.mo47083e().mo49161t();
    }

    /* renamed from: j */
    public void mo39068j(OneSignal.AppEntryAction appEntryAction, String str) {
        ld4 ld4 = this.f26505c;
        ld4.debug("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: " + str);
        if (str != null && !str.isEmpty()) {
            mo39062d(appEntryAction, str);
        }
    }

    /* renamed from: k */
    public void mo39069k(String str) {
        ld4 ld4 = this.f26505c;
        ld4.debug("OneSignal SessionManager onInAppMessageReceived messageId: " + str);
        wc4 e = this.f26503a.mo47083e();
        e.mo49163v(str);
        e.mo49161t();
    }

    /* renamed from: l */
    public void mo39070l(String str) {
        ld4 ld4 = this.f26505c;
        ld4.debug("OneSignal SessionManager onNotificationReceived notificationId: " + str);
        if (str != null && !str.isEmpty()) {
            this.f26503a.mo47085g().mo49163v(str);
        }
    }

    /* renamed from: m */
    public void mo39071m(OneSignal.AppEntryAction appEntryAction) {
        boolean z;
        List<wc4> d = this.f26503a.mo47082d(appEntryAction);
        ArrayList arrayList = new ArrayList();
        ld4 ld4 = this.f26505c;
        ld4.debug("OneSignal SessionManager restartSessionIfNeeded with entryAction: " + appEntryAction + "\n channelTrackers: " + d.toString());
        for (wc4 next : d) {
            JSONArray n = next.mo49156n();
            ld4 ld42 = this.f26505c;
            ld42.debug("OneSignal SessionManager restartSessionIfNeeded lastIds: " + n);
            id4 e = next.mo49149e();
            if (n.length() > 0) {
                z = mo39073o(next, OSInfluenceType.INDIRECT, (String) null, n);
            } else {
                z = mo39073o(next, OSInfluenceType.UNATTRIBUTED, (String) null, (JSONArray) null);
            }
            if (z) {
                arrayList.add(e);
            }
        }
        mo39072n(arrayList);
    }

    /* renamed from: n */
    public final void mo39072n(List<id4> list) {
        ld4 ld4 = this.f26505c;
        ld4.debug("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + list);
        if (list.size() > 0) {
            new Thread(new C5309a(list), "OS_END_CURRENT_SESSION").start();
        }
    }

    /* renamed from: o */
    public final boolean mo39073o(wc4 wc4, OSInfluenceType oSInfluenceType, String str, JSONArray jSONArray) {
        if (!mo39074p(wc4, oSInfluenceType, str, jSONArray)) {
            return false;
        }
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40376a(log_level, "OSChannelTracker changed: " + wc4.mo43156h() + "\nfrom:\ninfluenceType: " + wc4.mo49155k() + ", directNotificationId: " + wc4.mo49152g() + ", indirectNotificationIds: " + wc4.mo49154j() + "\nto:\ninfluenceType: " + oSInfluenceType + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray);
        wc4.mo49166y(oSInfluenceType);
        wc4.mo49164w(str);
        wc4.mo49165x(jSONArray);
        wc4.mo43153b();
        StringBuilder sb = new StringBuilder();
        sb.append("Trackers changed to: ");
        sb.append(this.f26503a.mo47081c().toString());
        OneSignal.m40376a(log_level, sb.toString());
        return true;
    }

    /* renamed from: p */
    public final boolean mo39074p(wc4 wc4, OSInfluenceType oSInfluenceType, String str, JSONArray jSONArray) {
        if (!oSInfluenceType.equals(wc4.mo49155k())) {
            return true;
        }
        OSInfluenceType k = wc4.mo49155k();
        if (k.isDirect() && wc4.mo49152g() != null && !wc4.mo49152g().equals(str)) {
            return true;
        }
        if (!k.isIndirect() || wc4.mo49154j() == null || wc4.mo49154j().length() <= 0 || vz2.m53657a(wc4.mo49154j(), jSONArray)) {
            return false;
        }
        return true;
    }
}
