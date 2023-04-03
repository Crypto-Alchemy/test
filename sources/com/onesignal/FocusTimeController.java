package com.onesignal;

import com.onesignal.C5355z0;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class FocusTimeController {

    /* renamed from: a */
    public Long f25863a;

    /* renamed from: b */
    public C5335v f25864b;

    /* renamed from: c */
    public ld4 f25865c;

    public enum FocusEventType {
        BACKGROUND,
        END_SESSION
    }

    /* renamed from: com.onesignal.FocusTimeController$a */
    public static class C5098a extends C5099b {
        public C5098a() {
            this.f25867a = 1;
            this.f25868b = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
        }

        /* renamed from: h */
        public void mo38397h(JSONObject jSONObject) {
            OneSignal.m40431s0().mo39060b(jSONObject, mo38398j());
        }

        /* renamed from: j */
        public List<id4> mo38398j() {
            ArrayList arrayList = new ArrayList();
            for (String id4 : C5342x0.m41396g(C5342x0.f26571a, "PREFS_OS_ATTRIBUTED_INFLUENCES", new HashSet())) {
                try {
                    arrayList.add(new id4(id4));
                } catch (JSONException e) {
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                    OneSignal.m40376a(log_level, getClass().getSimpleName() + ": error generation OSInfluence from json object: " + e);
                }
            }
            return arrayList;
        }

        /* renamed from: m */
        public void mo38399m(List<id4> list) {
            HashSet hashSet = new HashSet();
            for (id4 g : list) {
                try {
                    hashSet.add(g.mo43570g());
                } catch (JSONException e) {
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                    OneSignal.m40376a(log_level, getClass().getSimpleName() + ": error generation json object OSInfluence: " + e);
                }
            }
            C5342x0.m41403n(C5342x0.f26571a, "PREFS_OS_ATTRIBUTED_INFLUENCES", hashSet);
        }

        /* renamed from: r */
        public void mo38400r(FocusEventType focusEventType) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40387d1(log_level, getClass().getSimpleName() + " sendTime with: " + focusEventType);
            if (focusEventType.equals(FocusEventType.END_SESSION)) {
                mo38411u();
            } else {
                C5312q0.m41240q().mo39082s(OneSignal.f26030e);
            }
        }
    }

    /* renamed from: com.onesignal.FocusTimeController$b */
    public static abstract class C5099b {

        /* renamed from: a */
        public long f25867a;

        /* renamed from: b */
        public String f25868b;

        /* renamed from: c */
        public Long f25869c = null;

        /* renamed from: d */
        public final AtomicBoolean f25870d = new AtomicBoolean();

        /* renamed from: com.onesignal.FocusTimeController$b$a */
        public class C5100a extends C5355z0.C5362g {
            public C5100a() {
            }

            /* renamed from: a */
            public void mo38414a(int i, String str, Throwable th) {
                OneSignal.m40365U0("sending on_focus Failed", i, th, str);
            }

            /* renamed from: b */
            public void mo38415b(String str) {
                C5099b.this.mo38406o(0);
            }
        }

        /* renamed from: g */
        public final void mo38401g(long j, List<id4> list, FocusEventType focusEventType) {
            mo38405n(j, list);
            mo38410t(focusEventType);
        }

        /* renamed from: h */
        public void mo38397h(JSONObject jSONObject) {
        }

        /* renamed from: i */
        public final JSONObject mo38402i(long j) throws JSONException {
            JSONObject put = new JSONObject().put("app_id", OneSignal.m40419o0()).put("type", 1).put("state", "ping").put("active_time", j).put("device_type", new OSUtils().mo38560e());
            OneSignal.m40448y(put);
            return put;
        }

        /* renamed from: j */
        public abstract List<id4> mo38398j();

        /* renamed from: k */
        public final long mo38403k() {
            if (this.f25869c == null) {
                this.f25869c = Long.valueOf(C5342x0.m41393d(C5342x0.f26571a, this.f25868b, 0));
            }
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.f25869c);
            return this.f25869c.longValue();
        }

        /* renamed from: l */
        public final boolean mo38404l() {
            if (mo38403k() >= this.f25867a) {
                return true;
            }
            return false;
        }

        /* renamed from: m */
        public abstract void mo38399m(List<id4> list);

        /* renamed from: n */
        public final void mo38405n(long j, List<id4> list) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, getClass().getSimpleName() + ":saveUnsentActiveData with lastFocusTimeInfluences: " + list.toString());
            mo38399m(list);
            mo38406o(mo38403k() + j);
        }

        /* renamed from: o */
        public final void mo38406o(long j) {
            this.f25869c = Long.valueOf(j);
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.f25869c);
            C5342x0.m41401l(C5342x0.f26571a, this.f25868b, j);
        }

        /* renamed from: p */
        public final void mo38407p(long j) {
            try {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                OneSignal.m40376a(log_level, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j);
                JSONObject i = mo38402i(j);
                mo38397h(i);
                mo38408q(OneSignal.m40452z0(), i);
                if (OneSignal.m40326H0()) {
                    mo38408q(OneSignal.m40372Y(), mo38402i(j));
                }
                if (OneSignal.m40329I0()) {
                    mo38408q(OneSignal.m40413m0(), mo38402i(j));
                }
                mo38399m(new ArrayList());
            } catch (JSONException e) {
                OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Generating on_focus:JSON Failed.", e);
            }
        }

        /* renamed from: q */
        public final void mo38408q(String str, JSONObject jSONObject) {
            C5100a aVar = new C5100a();
            C5355z0.m41446k("players/" + str + "/on_focus", jSONObject, aVar);
        }

        /* renamed from: r */
        public abstract void mo38400r(FocusEventType focusEventType);

        /* renamed from: s */
        public final void mo38409s() {
            List<id4> j = mo38398j();
            long k = mo38403k();
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level, getClass().getSimpleName() + ":sendUnsentTimeNow with time: " + k + " and influences: " + j.toString());
            mo38410t(FocusEventType.BACKGROUND);
        }

        /* renamed from: t */
        public final void mo38410t(FocusEventType focusEventType) {
            if (!OneSignal.m40332J0()) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
                OneSignal.m40376a(log_level, getClass().getSimpleName() + ":sendUnsentTimeNow not possible due to user id null");
                return;
            }
            mo38400r(focusEventType);
        }

        /* renamed from: u */
        public void mo38411u() {
            if (!this.f25870d.get()) {
                synchronized (this.f25870d) {
                    this.f25870d.set(true);
                    if (mo38404l()) {
                        mo38407p(mo38403k());
                    }
                    this.f25870d.set(false);
                }
            }
        }

        /* renamed from: v */
        public final void mo38412v() {
            if (mo38404l()) {
                mo38411u();
            }
        }

        /* renamed from: w */
        public void mo38413w() {
            if (mo38404l()) {
                C5312q0.m41240q().mo39082s(OneSignal.f26030e);
            }
        }
    }

    /* renamed from: com.onesignal.FocusTimeController$c */
    public static class C5101c extends C5099b {
        public C5101c() {
            this.f25867a = 60;
            this.f25868b = "GT_UNSENT_ACTIVE_TIME";
        }

        /* renamed from: j */
        public List<id4> mo38398j() {
            return new ArrayList();
        }

        /* renamed from: m */
        public void mo38399m(List<id4> list) {
        }

        /* renamed from: r */
        public void mo38400r(FocusEventType focusEventType) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40387d1(log_level, getClass().getSimpleName() + " sendTime with: " + focusEventType);
            if (!focusEventType.equals(FocusEventType.END_SESSION)) {
                mo38413w();
            }
        }
    }

    public FocusTimeController(C5335v vVar, ld4 ld4) {
        this.f25864b = vVar;
        this.f25865c = ld4;
    }

    /* renamed from: a */
    public void mo38390a() {
        ld4 ld4 = this.f25865c;
        ld4.debug("Application backgrounded focus time: " + this.f25863a);
        this.f25864b.mo39130b().mo38409s();
        this.f25863a = null;
    }

    /* renamed from: b */
    public void mo38391b() {
        this.f25863a = Long.valueOf(OneSignal.m40443w0().mo46065b());
        ld4 ld4 = this.f25865c;
        ld4.debug("Application foregrounded focus time: " + this.f25863a);
    }

    /* renamed from: c */
    public void mo38392c() {
        Long e = mo38394e();
        ld4 ld4 = this.f25865c;
        ld4.debug("Application stopped focus time: " + this.f25863a + " timeElapsed: " + e);
        if (e != null) {
            List<id4> f = OneSignal.m40431s0().mo39064f();
            this.f25864b.mo39131c(f).mo38405n(e.longValue(), f);
        }
    }

    /* renamed from: d */
    public void mo38393d() {
        if (!OneSignal.m40347O0()) {
            this.f25864b.mo39130b().mo38412v();
        }
    }

    /* renamed from: e */
    public final Long mo38394e() {
        if (this.f25863a == null) {
            return null;
        }
        long b = (long) ((((double) (OneSignal.m40443w0().mo46065b() - this.f25863a.longValue())) / 1000.0d) + 0.5d);
        if (b < 1 || b > 86400) {
            return null;
        }
        return Long.valueOf(b);
    }

    /* renamed from: f */
    public final boolean mo38395f(List<id4> list, FocusEventType focusEventType) {
        Long e = mo38394e();
        if (e == null) {
            return false;
        }
        this.f25864b.mo39131c(list).mo38401g(e.longValue(), list, focusEventType);
        return true;
    }

    /* renamed from: g */
    public void mo38396g(List<id4> list) {
        FocusEventType focusEventType = FocusEventType.END_SESSION;
        if (!mo38395f(list, focusEventType)) {
            this.f25864b.mo39131c(list).mo38410t(focusEventType);
        }
    }
}
