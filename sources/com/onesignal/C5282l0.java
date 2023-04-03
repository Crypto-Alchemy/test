package com.onesignal;

import com.github.mikephil.charting.utils.Utils;
import com.onesignal.OneSignal;
import com.onesignal.influence.domain.OSInfluenceType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.onesignal.l0 */
/* compiled from: OSOutcomeEventsController */
public class C5282l0 {

    /* renamed from: a */
    public Set<String> f26449a;

    /* renamed from: b */
    public final vd4 f26450b;

    /* renamed from: c */
    public final C5308p0 f26451c;

    /* renamed from: com.onesignal.l0$a */
    /* compiled from: OSOutcomeEventsController */
    public class C5283a implements Runnable {
        public C5283a() {
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            C5282l0.this.f26450b.mo48733b().mo49183e("notification", "notification_id");
        }
    }

    /* renamed from: com.onesignal.l0$b */
    /* compiled from: OSOutcomeEventsController */
    public class C5284b implements Runnable {
        public C5284b() {
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            for (rd4 b : C5282l0.this.f26450b.mo48733b().mo49181c()) {
                C5282l0.this.mo38975p(b);
            }
        }
    }

    /* renamed from: com.onesignal.l0$c */
    /* compiled from: OSOutcomeEventsController */
    public class C5285c implements ai4 {

        /* renamed from: a */
        public final /* synthetic */ rd4 f26454a;

        public C5285c(rd4 rd4) {
            this.f26454a = rd4;
        }

        /* renamed from: a */
        public void mo28985a(String str) {
            C5282l0.this.f26450b.mo48733b().mo49182d(this.f26454a);
        }

        /* renamed from: b */
        public void mo28986b(int i, String str, Throwable th) {
        }
    }

    /* renamed from: com.onesignal.l0$d */
    /* compiled from: OSOutcomeEventsController */
    public class C5286d implements ai4 {

        /* renamed from: a */
        public final /* synthetic */ rd4 f26456a;

        /* renamed from: b */
        public final /* synthetic */ OneSignal.C5139g0 f26457b;

        /* renamed from: c */
        public final /* synthetic */ long f26458c;

        /* renamed from: d */
        public final /* synthetic */ String f26459d;

        /* renamed from: com.onesignal.l0$d$a */
        /* compiled from: OSOutcomeEventsController */
        public class C5287a implements Runnable {
            public C5287a() {
            }

            public void run() {
                Thread.currentThread().setPriority(10);
                C5286d dVar = C5286d.this;
                dVar.f26456a.mo47387f(dVar.f26458c);
                C5282l0.this.f26450b.mo48733b().mo49180b(C5286d.this.f26456a);
            }
        }

        public C5286d(rd4 rd4, OneSignal.C5139g0 g0Var, long j, String str) {
            this.f26456a = rd4;
            this.f26457b = g0Var;
            this.f26458c = j;
            this.f26459d = str;
        }

        /* renamed from: a */
        public void mo28985a(String str) {
            C5282l0.this.mo38970k(this.f26456a);
            OneSignal.C5139g0 g0Var = this.f26457b;
            if (g0Var != null) {
                g0Var.mo38580a(qd4.m50522a(this.f26456a));
            }
        }

        /* renamed from: b */
        public void mo28986b(int i, String str, Throwable th) {
            new Thread(new C5287a(), "OS_SAVE_OUTCOMES").start();
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
            OneSignal.m40387d1(log_level, "Sending outcome with name: " + this.f26459d + " failed with status code: " + i + " and response: " + str + "\nOutcome event was cached and will be reattempted on app cold start");
            OneSignal.C5139g0 g0Var = this.f26457b;
            if (g0Var != null) {
                g0Var.mo38580a((qd4) null);
            }
        }
    }

    /* renamed from: com.onesignal.l0$e */
    /* compiled from: OSOutcomeEventsController */
    public class C5288e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ rd4 f26462a;

        public C5288e(rd4 rd4) {
            this.f26462a = rd4;
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            C5282l0.this.f26450b.mo48733b().mo49186i(this.f26462a);
        }
    }

    /* renamed from: com.onesignal.l0$f */
    /* compiled from: OSOutcomeEventsController */
    public static /* synthetic */ class C5289f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26464a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f26465b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                com.onesignal.influence.domain.OSInfluenceChannel[] r0 = com.onesignal.influence.domain.OSInfluenceChannel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26465b = r0
                r1 = 1
                com.onesignal.influence.domain.OSInfluenceChannel r2 = com.onesignal.influence.domain.OSInfluenceChannel.IAM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f26465b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.influence.domain.OSInfluenceChannel r3 = com.onesignal.influence.domain.OSInfluenceChannel.NOTIFICATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.onesignal.influence.domain.OSInfluenceType[] r2 = com.onesignal.influence.domain.OSInfluenceType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f26464a = r2
                com.onesignal.influence.domain.OSInfluenceType r3 = com.onesignal.influence.domain.OSInfluenceType.DIRECT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f26464a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.onesignal.influence.domain.OSInfluenceType r2 = com.onesignal.influence.domain.OSInfluenceType.INDIRECT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f26464a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.onesignal.influence.domain.OSInfluenceType r1 = com.onesignal.influence.domain.OSInfluenceType.UNATTRIBUTED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f26464a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.onesignal.influence.domain.OSInfluenceType r1 = com.onesignal.influence.domain.OSInfluenceType.DISABLED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5282l0.C5289f.<clinit>():void");
        }
    }

    public C5282l0(C5308p0 p0Var, vd4 vd4) {
        this.f26451c = p0Var;
        this.f26450b = vd4;
        mo38966g();
    }

    /* renamed from: d */
    public void mo38963d() {
        new Thread(new C5283a(), "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD").start();
    }

    /* renamed from: e */
    public void mo38964e() {
        OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "OneSignal cleanOutcomes for session");
        this.f26449a = OSUtils.m40262K();
        mo38969j();
    }

    /* renamed from: f */
    public final List<id4> mo38965f(String str, List<id4> list) {
        List<id4> a = this.f26450b.mo48733b().mo49179a(str, list);
        if (a.size() > 0) {
            return a;
        }
        return null;
    }

    /* renamed from: g */
    public final void mo38966g() {
        this.f26449a = OSUtils.m40262K();
        Set<String> h = this.f26450b.mo48733b().mo49185h();
        if (h != null) {
            this.f26449a = h;
        }
    }

    /* renamed from: h */
    public final List<id4> mo38967h(List<id4> list) {
        ArrayList arrayList = new ArrayList(list);
        for (id4 next : list) {
            if (next.mo43566d().isDisabled()) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                OneSignal.m40387d1(log_level, "Outcomes disabled for channel: " + next.mo43565c().toString());
                arrayList.remove(next);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public final void mo38968i(rd4 rd4) {
        new Thread(new C5288e(rd4), "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
    }

    /* renamed from: j */
    public final void mo38969j() {
        this.f26450b.mo48733b().mo49184g(this.f26449a);
    }

    /* renamed from: k */
    public final void mo38970k(rd4 rd4) {
        if (rd4.mo47386e()) {
            mo38969j();
        } else {
            mo38968i(rd4);
        }
    }

    /* renamed from: l */
    public final void mo38971l(String str, float f, List<id4> list, OneSignal.C5139g0 g0Var) {
        OneSignal.C5139g0 g0Var2 = g0Var;
        long a = OneSignal.m40443w0().mo46064a() / 1000;
        int e = new OSUtils().mo38560e();
        String str2 = OneSignal.f26034g;
        boolean z = false;
        ee4 ee4 = null;
        ee4 ee42 = null;
        for (id4 next : list) {
            int i = C5289f.f26464a[next.mo43566d().ordinal()];
            if (i == 1) {
                if (ee4 == null) {
                    ee4 = new ee4();
                }
                ee4 = mo38979t(next, ee4);
            } else if (i == 2) {
                if (ee42 == null) {
                    ee42 = new ee4();
                }
                ee42 = mo38979t(next, ee42);
            } else if (i == 3) {
                z = true;
            } else if (i == 4) {
                OneSignal.m40376a(OneSignal.LOG_LEVEL.VERBOSE, "Outcomes disabled for channel: " + next.mo43565c());
                if (g0Var2 != null) {
                    g0Var2.mo38580a((qd4) null);
                    return;
                }
                return;
            }
        }
        if (ee4 == null && ee42 == null && !z) {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.VERBOSE, "Outcomes disabled for all channels");
            if (g0Var2 != null) {
                g0Var2.mo38580a((qd4) null);
                return;
            }
            return;
        }
        rd4 rd4 = new rd4(str, new de4(ee4, ee42), f, 0);
        this.f26450b.mo48733b().mo29560f(str2, e, rd4, new C5286d(rd4, g0Var, a, str));
    }

    /* renamed from: m */
    public void mo38972m(List<cd4> list) {
        for (cd4 next : list) {
            String a = next.mo29940a();
            if (next.mo29942c()) {
                mo38977r(a, (OneSignal.C5139g0) null);
            } else if (next.mo29941b() > Utils.FLOAT_EPSILON) {
                mo38974o(a, next.mo29941b(), (OneSignal.C5139g0) null);
            } else {
                mo38973n(a, (OneSignal.C5139g0) null);
            }
        }
    }

    /* renamed from: n */
    public void mo38973n(String str, OneSignal.C5139g0 g0Var) {
        mo38971l(str, Utils.FLOAT_EPSILON, this.f26451c.mo39063e(), g0Var);
    }

    /* renamed from: o */
    public void mo38974o(String str, float f, OneSignal.C5139g0 g0Var) {
        mo38971l(str, f, this.f26451c.mo39063e(), g0Var);
    }

    /* renamed from: p */
    public final void mo38975p(rd4 rd4) {
        int e = new OSUtils().mo38560e();
        this.f26450b.mo48733b().mo29560f(OneSignal.f26034g, e, rd4, new C5285c(rd4));
    }

    /* renamed from: q */
    public void mo38976q() {
        new Thread(new C5284b(), "OS_SEND_SAVED_OUTCOMES").start();
    }

    /* renamed from: r */
    public void mo38977r(String str, OneSignal.C5139g0 g0Var) {
        mo38978s(str, this.f26451c.mo39063e(), g0Var);
    }

    /* renamed from: s */
    public final void mo38978s(String str, List<id4> list, OneSignal.C5139g0 g0Var) {
        List<id4> h = mo38967h(list);
        if (h.isEmpty()) {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.DEBUG, "Unique Outcome disabled for current session");
            return;
        }
        boolean z = false;
        Iterator<id4> it = h.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo43566d().isAttributed()) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            List<id4> f = mo38965f(str, h);
            if (f == null) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                OneSignal.m40376a(log_level, "Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: " + h.toString() + "\nOutcome name: " + str);
                if (g0Var != null) {
                    g0Var.mo38580a((qd4) null);
                    return;
                }
                return;
            }
            mo38971l(str, Utils.FLOAT_EPSILON, f, g0Var);
        } else if (this.f26449a.contains(str)) {
            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.m40376a(log_level2, "Measure endpoint will not send because unique outcome already sent for: \nSession: " + OSInfluenceType.UNATTRIBUTED + "\nOutcome name: " + str);
            if (g0Var != null) {
                g0Var.mo38580a((qd4) null);
            }
        } else {
            this.f26449a.add(str);
            mo38971l(str, Utils.FLOAT_EPSILON, h, g0Var);
        }
    }

    /* renamed from: t */
    public final ee4 mo38979t(id4 id4, ee4 ee4) {
        int i = C5289f.f26465b[id4.mo43565c().ordinal()];
        if (i == 1) {
            ee4.mo42305c(id4.mo43564b());
        } else if (i == 2) {
            ee4.mo42306d(id4.mo43564b());
        }
        return ee4;
    }
}
