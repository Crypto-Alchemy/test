package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.C5355z0;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.n1 */
/* compiled from: UserStateSynchronizer */
public abstract class C5296n1 {

    /* renamed from: a */
    public final Object f26469a = new Object();

    /* renamed from: b */
    public OneSignalStateSynchronizer.UserStateSynchronizerType f26470b;

    /* renamed from: c */
    public boolean f26471c;

    /* renamed from: d */
    public AtomicBoolean f26472d = new AtomicBoolean();

    /* renamed from: e */
    public final Queue<OneSignal.C5153s> f26473e = new ConcurrentLinkedQueue();

    /* renamed from: f */
    public final Queue<OneSignal.C5160z> f26474f = new ConcurrentLinkedQueue();

    /* renamed from: g */
    public final Queue<OneSignalStateSynchronizer.C5161a> f26475g = new ConcurrentLinkedQueue();

    /* renamed from: h */
    public HashMap<Integer, C5302f> f26476h = new HashMap<>();

    /* renamed from: i */
    public final Object f26477i = new C5297a();

    /* renamed from: j */
    public boolean f26478j = false;

    /* renamed from: k */
    public C5261i1 f26479k;

    /* renamed from: l */
    public C5261i1 f26480l;

    /* renamed from: com.onesignal.n1$a */
    /* compiled from: UserStateSynchronizer */
    public class C5297a {
        public C5297a() {
        }
    }

    /* renamed from: com.onesignal.n1$b */
    /* compiled from: UserStateSynchronizer */
    public class C5298b extends C5355z0.C5362g {
        public C5298b() {
        }

        /* renamed from: a */
        public void mo38414a(int i, String str, Throwable th) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
            OneSignal.m40376a(log_level, "Failed last request. statusCode: " + i + "\nresponse: " + str);
            if (C5296n1.this.mo39010T(i, str, "already logged out of email")) {
                C5296n1.this.mo39006N();
            } else if (C5296n1.this.mo39010T(i, str, "not a valid device_type")) {
                C5296n1.this.mo39002J();
            } else {
                C5296n1.this.mo39001I(i);
            }
        }

        /* renamed from: b */
        public void mo38415b(String str) {
            C5296n1.this.mo39006N();
        }
    }

    /* renamed from: com.onesignal.n1$c */
    /* compiled from: UserStateSynchronizer */
    public class C5299c extends C5355z0.C5362g {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f26483a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f26484b;

        public C5299c(JSONObject jSONObject, JSONObject jSONObject2) {
            this.f26483a = jSONObject;
            this.f26484b = jSONObject2;
        }

        /* renamed from: a */
        public void mo38414a(int i, String str, Throwable th) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
            OneSignal.m40376a(log_level, "Failed PUT sync request with status code: " + i + " and response: " + str);
            synchronized (C5296n1.this.f26469a) {
                if (C5296n1.this.mo39010T(i, str, "No user with this id found")) {
                    C5296n1.this.mo39002J();
                } else {
                    C5296n1.this.mo39001I(i);
                }
            }
            if (this.f26483a.has("tags")) {
                C5296n1.this.mo39013X(new OneSignal.C5143i0(i, str));
            }
            if (this.f26483a.has("external_user_id")) {
                OneSignal.m40387d1(log_level, "Error setting external user id for push with status code: " + i + " and message: " + str);
                C5296n1.this.mo39026u();
            }
            if (this.f26483a.has("language")) {
                C5296n1.this.mo39021p(new OneSignalStateSynchronizer.C5162b(i, str));
            }
        }

        /* renamed from: b */
        public void mo38415b(String str) {
            synchronized (C5296n1.this.f26469a) {
                C5296n1.this.mo38995A().mo38901r(this.f26484b, this.f26483a);
                C5296n1.this.mo38953P(this.f26483a);
            }
            if (this.f26483a.has("tags")) {
                C5296n1.this.mo39014Y();
            }
            if (this.f26483a.has("external_user_id")) {
                C5296n1.this.mo39027v();
            }
            if (this.f26483a.has("language")) {
                C5296n1.this.mo39022q();
            }
        }
    }

    /* renamed from: com.onesignal.n1$d */
    /* compiled from: UserStateSynchronizer */
    public class C5300d extends C5355z0.C5362g {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f26486a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f26487b;

        /* renamed from: c */
        public final /* synthetic */ String f26488c;

        public C5300d(JSONObject jSONObject, JSONObject jSONObject2, String str) {
            this.f26486a = jSONObject;
            this.f26487b = jSONObject2;
            this.f26488c = str;
        }

        /* renamed from: a */
        public void mo38414a(int i, String str, Throwable th) {
            synchronized (C5296n1.this.f26469a) {
                C5296n1.this.f26478j = false;
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
                OneSignal.m40376a(log_level, "Failed last request. statusCode: " + i + "\nresponse: " + str);
                if (C5296n1.this.mo39010T(i, str, "not a valid device_type")) {
                    C5296n1.this.mo39002J();
                } else {
                    C5296n1.this.mo39001I(i);
                }
            }
        }

        /* renamed from: b */
        public void mo38415b(String str) {
            synchronized (C5296n1.this.f26469a) {
                C5296n1 n1Var = C5296n1.this;
                n1Var.f26478j = false;
                n1Var.mo38995A().mo38901r(this.f26486a, this.f26487b);
                try {
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                    OneSignal.m40387d1(log_level, "doCreateOrNewSession:response: " + str);
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("id")) {
                        String optString = jSONObject.optString("id");
                        C5296n1.this.mo38933d0(optString);
                        OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.INFO;
                        OneSignal.m40376a(log_level2, "Device registered, UserId = " + optString);
                    } else {
                        OneSignal.LOG_LEVEL log_level3 = OneSignal.LOG_LEVEL.INFO;
                        OneSignal.m40376a(log_level3, "session sent, UserId = " + this.f26488c);
                    }
                    C5296n1.this.mo39000H().mo38902s("session", Boolean.FALSE);
                    C5296n1.this.mo39000H().mo38900q();
                    if (jSONObject.has("in_app_messages")) {
                        OneSignal.m40383c0().mo38512l0(jSONObject.getJSONArray("in_app_messages"));
                    }
                    C5296n1.this.mo38953P(this.f26487b);
                } catch (JSONException e) {
                    OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "ERROR parsing on_session or create JSON Response.", e);
                }
            }
        }
    }

    /* renamed from: com.onesignal.n1$e */
    /* compiled from: UserStateSynchronizer */
    public static class C5301e {

        /* renamed from: a */
        public boolean f26490a;

        /* renamed from: b */
        public JSONObject f26491b;

        public C5301e(boolean z, JSONObject jSONObject) {
            this.f26490a = z;
            this.f26491b = jSONObject;
        }
    }

    /* renamed from: com.onesignal.n1$f */
    /* compiled from: UserStateSynchronizer */
    public class C5302f extends HandlerThread {

        /* renamed from: a */
        public int f26492a;

        /* renamed from: d */
        public Handler f26493d = new Handler(getLooper());

        /* renamed from: e */
        public int f26494e;

        /* renamed from: com.onesignal.n1$f$a */
        /* compiled from: UserStateSynchronizer */
        public class C5303a implements Runnable {
            public C5303a() {
            }

            public void run() {
                if (!C5296n1.this.f26472d.get()) {
                    C5296n1.this.mo39017b0(false);
                }
            }
        }

        public C5302f(int i) {
            super("OSH_NetworkHandlerThread_" + C5296n1.this.f26470b);
            this.f26492a = i;
            start();
        }

        /* renamed from: a */
        public boolean mo39031a() {
            boolean z;
            boolean hasMessages;
            synchronized (this.f26493d) {
                if (this.f26494e < 3) {
                    z = true;
                } else {
                    z = false;
                }
                boolean hasMessages2 = this.f26493d.hasMessages(0);
                if (z && !hasMessages2) {
                    this.f26494e++;
                    this.f26493d.postDelayed(mo39032b(), (long) (this.f26494e * n63.DEFAULT_BLOCK_TIME));
                }
                hasMessages = this.f26493d.hasMessages(0);
            }
            return hasMessages;
        }

        /* renamed from: b */
        public final Runnable mo39032b() {
            if (this.f26492a != 0) {
                return null;
            }
            return new C5303a();
        }

        /* renamed from: c */
        public void mo39033c() {
            if (C5296n1.this.f26471c) {
                synchronized (this.f26493d) {
                    this.f26494e = 0;
                    this.f26493d.removeCallbacksAndMessages((Object) null);
                    this.f26493d.postDelayed(mo39032b(), 5000);
                }
            }
        }
    }

    public C5296n1(OneSignalStateSynchronizer.UserStateSynchronizerType userStateSynchronizerType) {
        this.f26470b = userStateSynchronizerType;
    }

    /* renamed from: A */
    public C5261i1 mo38995A() {
        if (this.f26479k == null) {
            synchronized (this.f26469a) {
                if (this.f26479k == null) {
                    this.f26479k = mo38932O("CURRENT_STATE", true);
                }
            }
        }
        return this.f26479k;
    }

    /* renamed from: B */
    public abstract String mo38931B();

    /* renamed from: C */
    public abstract OneSignal.LOG_LEVEL mo38952C();

    /* renamed from: D */
    public C5302f mo38996D(Integer num) {
        C5302f fVar;
        synchronized (this.f26477i) {
            if (!this.f26476h.containsKey(num)) {
                this.f26476h.put(num, new C5302f(num.intValue()));
            }
            fVar = this.f26476h.get(num);
        }
        return fVar;
    }

    /* renamed from: E */
    public String mo38997E() {
        return mo38999G().mo38895l().mo45511g("identifier", (String) null);
    }

    /* renamed from: F */
    public boolean mo38998F() {
        return mo39000H().mo38892i().mo45506b("session");
    }

    /* renamed from: G */
    public C5261i1 mo38999G() {
        if (this.f26480l == null) {
            synchronized (this.f26469a) {
                if (this.f26480l == null) {
                    this.f26480l = mo38932O("TOSYNC_STATE", true);
                }
            }
        }
        return this.f26480l;
    }

    /* renamed from: H */
    public C5261i1 mo39000H() {
        if (this.f26480l == null) {
            this.f26480l = mo38995A().mo38887c("TOSYNC_STATE");
        }
        mo38954U();
        return this.f26480l;
    }

    /* renamed from: I */
    public final void mo39001I(int i) {
        if (i == 403) {
            OneSignal.m40376a(OneSignal.LOG_LEVEL.FATAL, "403 error updating player, omitting further retries!");
            mo39028x();
        } else if (!mo38996D(0).mo39031a()) {
            mo39028x();
        }
    }

    /* renamed from: J */
    public final void mo39002J() {
        OneSignal.m40376a(OneSignal.LOG_LEVEL.WARN, "Creating new player based on missing player_id noted above.");
        OneSignal.m40323G0();
        mo39009S();
        mo38933d0((String) null);
        mo38954U();
    }

    /* renamed from: K */
    public void mo39003K() {
        if (this.f26479k == null) {
            synchronized (this.f26469a) {
                if (this.f26479k == null) {
                    this.f26479k = mo38932O("CURRENT_STATE", true);
                }
            }
        }
        mo38999G();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r9 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        mo39025t(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        mo39023r(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39004L(boolean r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.mo38931B()
            boolean r1 = r8.mo39016a0()
            if (r1 == 0) goto L_0x0010
            if (r0 == 0) goto L_0x0010
            r8.mo39024s(r0)
            return
        L_0x0010:
            com.onesignal.i1 r1 = r8.f26479k
            if (r1 != 0) goto L_0x0017
            r8.mo39003K()
        L_0x0017:
            if (r9 != 0) goto L_0x0021
            boolean r9 = r8.mo39005M()
            if (r9 == 0) goto L_0x0021
            r9 = 1
            goto L_0x0022
        L_0x0021:
            r9 = 0
        L_0x0022:
            java.lang.Object r1 = r8.f26469a
            monitor-enter(r1)
            com.onesignal.i1 r2 = r8.mo38995A()     // Catch:{ all -> 0x0082 }
            com.onesignal.i1 r3 = r8.mo38999G()     // Catch:{ all -> 0x0082 }
            org.json.JSONObject r2 = r2.mo38888d(r3, r9)     // Catch:{ all -> 0x0082 }
            com.onesignal.i1 r3 = r8.mo38999G()     // Catch:{ all -> 0x0082 }
            com.onesignal.i1 r4 = r8.mo38995A()     // Catch:{ all -> 0x0082 }
            r5 = 0
            org.json.JSONObject r3 = r4.mo38889f(r3, r5)     // Catch:{ all -> 0x0082 }
            com.onesignal.OneSignal$LOG_LEVEL r4 = com.onesignal.OneSignal.LOG_LEVEL.DEBUG     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r6.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = "UserStateSynchronizer internalSyncUserState from session call: "
            r6.append(r7)     // Catch:{ all -> 0x0082 }
            r6.append(r9)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = " jsonBody: "
            r6.append(r7)     // Catch:{ all -> 0x0082 }
            r6.append(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0082 }
            com.onesignal.OneSignal.m40387d1(r4, r6)     // Catch:{ all -> 0x0082 }
            if (r2 != 0) goto L_0x0070
            com.onesignal.i1 r9 = r8.mo38995A()     // Catch:{ all -> 0x0082 }
            r9.mo38901r(r3, r5)     // Catch:{ all -> 0x0082 }
            r8.mo39014Y()     // Catch:{ all -> 0x0082 }
            r8.mo39027v()     // Catch:{ all -> 0x0082 }
            r8.mo39022q()     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            return
        L_0x0070:
            com.onesignal.i1 r4 = r8.mo38999G()     // Catch:{ all -> 0x0082 }
            r4.mo38900q()     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            if (r9 != 0) goto L_0x007e
            r8.mo39025t(r0, r2, r3)
            goto L_0x0081
        L_0x007e:
            r8.mo39023r(r0, r2, r3)
        L_0x0081:
            return
        L_0x0082:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5296n1.mo39004L(boolean):void");
    }

    /* renamed from: M */
    public final boolean mo39005M() {
        if ((mo38999G().mo38892i().mo45506b("session") || mo38931B() == null) && !this.f26478j) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final void mo39006N() {
        mo38999G().mo38906v("logoutEmail");
        this.f26480l.mo38906v("email_auth_hash");
        this.f26480l.mo38907w("parent_player_id");
        this.f26480l.mo38907w("email");
        this.f26480l.mo38900q();
        mo38995A().mo38906v("email_auth_hash");
        mo38995A().mo38907w("parent_player_id");
        String f = mo38995A().mo38895l().mo45510f("email");
        mo38995A().mo38907w("email");
        OneSignalStateSynchronizer.m40494s();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        OneSignal.m40376a(log_level, "Device successfully logged out of email: " + f);
        OneSignal.m40323G0();
    }

    /* renamed from: O */
    public abstract C5261i1 mo38932O(String str, boolean z);

    /* renamed from: P */
    public abstract void mo38953P(JSONObject jSONObject);

    /* renamed from: Q */
    public boolean mo39007Q() {
        boolean z = false;
        if (this.f26480l == null) {
            return false;
        }
        synchronized (this.f26469a) {
            if (mo38995A().mo38888d(this.f26480l, mo39005M()) != null) {
                z = true;
            }
            this.f26480l.mo38900q();
        }
        return z;
    }

    /* renamed from: R */
    public void mo39008R(boolean z) {
        boolean z2;
        if (this.f26471c != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f26471c = z;
        if (z2 && z) {
            mo38954U();
        }
    }

    /* renamed from: S */
    public void mo39009S() {
        mo38995A().mo38910z(new JSONObject());
        mo38995A().mo38900q();
    }

    /* renamed from: T */
    public final boolean mo39010T(int i, String str, String str2) {
        if (i == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("errors") || !jSONObject.optString("errors").contains(str2)) {
                    return false;
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: U */
    public abstract void mo38954U();

    /* renamed from: V */
    public void mo39011V(JSONObject jSONObject, C5355z0.C5362g gVar) {
        C5355z0.m41445j("players/" + mo38931B() + "/on_purchase", jSONObject, gVar);
    }

    /* renamed from: W */
    public void mo39012W(JSONObject jSONObject, OneSignal.C5153s sVar) {
        if (sVar != null) {
            this.f26473e.add(sVar);
        }
        mo39000H().mo38891h(jSONObject, (Set<String>) null);
    }

    /* renamed from: X */
    public final void mo39013X(OneSignal.C5143i0 i0Var) {
        while (true) {
            OneSignal.C5153s poll = this.f26473e.poll();
            if (poll != null) {
                poll.mo38590b(i0Var);
            } else {
                return;
            }
        }
    }

    /* renamed from: Y */
    public final void mo39014Y() {
        JSONObject jSONObject = OneSignalStateSynchronizer.m40483h(false).f26491b;
        while (true) {
            OneSignal.C5153s poll = this.f26473e.poll();
            if (poll != null) {
                poll.mo38589a(jSONObject);
            } else {
                return;
            }
        }
    }

    /* renamed from: Z */
    public void mo39015Z() {
        try {
            synchronized (this.f26469a) {
                mo39000H().mo38902s("session", Boolean.TRUE);
                mo39000H().mo38900q();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a0 */
    public final boolean mo39016a0() {
        return mo38999G().mo38892i().mo45507c("logoutEmail", false);
    }

    /* renamed from: b0 */
    public void mo39017b0(boolean z) {
        this.f26472d.set(true);
        mo39004L(z);
        this.f26472d.set(false);
    }

    /* renamed from: c0 */
    public void mo39018c0(JSONObject jSONObject, OneSignalStateSynchronizer.C5161a aVar) {
        if (aVar != null) {
            this.f26475g.add(aVar);
        }
        mo39000H().mo38891h(jSONObject, (Set<String>) null);
    }

    /* renamed from: d0 */
    public abstract void mo38933d0(String str);

    /* renamed from: e0 */
    public void mo39019e0(LocationController.C5105d dVar) {
        mo39000H().mo38909y(dVar);
    }

    /* renamed from: n */
    public abstract void mo38961n(JSONObject jSONObject);

    /* renamed from: o */
    public void mo39020o() {
        mo38999G().mo38886b();
        mo38999G().mo38900q();
    }

    /* renamed from: p */
    public final void mo39021p(OneSignalStateSynchronizer.C5162b bVar) {
        while (true) {
            OneSignalStateSynchronizer.C5161a poll = this.f26475g.poll();
            if (poll != null) {
                poll.mo38600b(bVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: q */
    public final void mo39022q() {
        String c = OneSignalStateSynchronizer.m40478c();
        while (true) {
            OneSignalStateSynchronizer.C5161a poll = this.f26475g.poll();
            if (poll != null) {
                poll.mo38599a(c);
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    public final void mo39023r(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        if (str == null) {
            str2 = "players";
        } else {
            str2 = "players/" + str + "/on_session";
        }
        this.f26478j = true;
        mo38961n(jSONObject);
        C5355z0.m41446k(str2, jSONObject, new C5300d(jSONObject2, jSONObject, str));
    }

    /* renamed from: s */
    public final void mo39024s(String str) {
        String str2 = "players/" + str + "/email_logout";
        JSONObject jSONObject = new JSONObject();
        try {
            ls2 i = mo38995A().mo38892i();
            if (i.mo45505a("email_auth_hash")) {
                jSONObject.put("email_auth_hash", i.mo45510f("email_auth_hash"));
            }
            ls2 l = mo38995A().mo38895l();
            if (l.mo45505a("parent_player_id")) {
                jSONObject.put("parent_player_id", l.mo45510f("parent_player_id"));
            }
            jSONObject.put("app_id", l.mo45510f("app_id"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C5355z0.m41446k(str2, jSONObject, new C5298b());
    }

    /* renamed from: t */
    public final void mo39025t(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (str == null) {
            OneSignal.m40387d1(mo38952C(), "Error updating the user record because of the null user id");
            mo39013X(new OneSignal.C5143i0(-1, "Unable to update tags: the current user is not registered with OneSignal"));
            mo39026u();
            mo39021p(new OneSignalStateSynchronizer.C5162b(-1, "Unable to set Language: the current user is not registered with OneSignal"));
            return;
        }
        C5355z0.m41448m("players/" + str, jSONObject, new C5299c(jSONObject, jSONObject2));
    }

    /* renamed from: u */
    public final void mo39026u() {
        while (true) {
            OneSignal.C5160z poll = this.f26474f.poll();
            if (poll != null) {
                poll.mo38595a(mo39030z(), false);
            } else {
                return;
            }
        }
    }

    /* renamed from: v */
    public final void mo39027v() {
        while (true) {
            OneSignal.C5160z poll = this.f26474f.poll();
            if (poll != null) {
                poll.mo38595a(mo39030z(), true);
            } else {
                return;
            }
        }
    }

    /* renamed from: w */
    public abstract void mo38962w(JSONObject jSONObject);

    /* renamed from: x */
    public final void mo39028x() {
        JSONObject d = mo38995A().mo38888d(this.f26480l, false);
        if (d != null) {
            mo38962w(d);
        }
        if (mo38999G().mo38892i().mo45507c("logoutEmail", false)) {
            OneSignal.m40314D0();
        }
    }

    /* renamed from: y */
    public JSONObject mo39029y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject b;
        synchronized (this.f26469a) {
            b = vz2.m53658b(jSONObject, jSONObject2, jSONObject3, set);
        }
        return b;
    }

    /* renamed from: z */
    public String mo39030z() {
        return this.f26470b.name().toLowerCase();
    }
}
