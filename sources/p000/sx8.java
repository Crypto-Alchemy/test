package p000;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzkq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: sx8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class sx8 extends qo8 {

    /* renamed from: c */
    public qx8 f34043c;

    /* renamed from: d */
    public hu8 f34044d;

    /* renamed from: e */
    public final Set<ju8> f34045e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public boolean f34046f;

    /* renamed from: g */
    public final AtomicReference<String> f34047g = new AtomicReference<>();

    /* renamed from: h */
    public final Object f34048h = new Object();

    /* renamed from: i */
    public u68 f34049i = new u68((Boolean) null, (Boolean) null);

    /* renamed from: j */
    public int f34050j = 100;

    /* renamed from: k */
    public final AtomicLong f34051k = new AtomicLong(0);

    /* renamed from: l */
    public long f34052l = -1;

    /* renamed from: m */
    public int f34053m = 100;

    /* renamed from: n */
    public final bi9 f34054n;

    /* renamed from: o */
    public boolean f34055o = true;

    /* renamed from: p */
    public final d69 f34056p = new qw8(this);

    public sx8(kr8 kr8) {
        super(kr8);
        this.f34054n = new bi9(kr8);
    }

    /* renamed from: J */
    public static /* synthetic */ void m51956J(sx8 sx8, u68 u68, int i, long j, boolean z, boolean z2) {
        sx8.mo29006e();
        sx8.mo47219g();
        if (j > sx8.f34052l || !u68.m52650m(sx8.f34053m, i)) {
            lp8 z3 = sx8.f34342a.mo45275z();
            kr8 kr8 = z3.f34342a;
            z3.mo29006e();
            if (z3.mo45482p(i)) {
                SharedPreferences.Editor edit = z3.mo45479m().edit();
                edit.putString("consent_settings", u68.mo48326d());
                edit.putInt("consent_source", i);
                edit.apply();
                sx8.f34052l = j;
                sx8.f34053m = i;
                sx8.f34342a.mo45254R().mo42716J(z);
                if (z2) {
                    sx8.f34342a.mo45254R().mo42726T(new AtomicReference());
                    return;
                }
                return;
            }
            sx8.f34342a.mo45237A().mo29676t().mo48770b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        sx8.f34342a.mo45237A().mo29676t().mo48770b("Dropped out-of-date consent setting, proposed settings", u68);
    }

    /* renamed from: B */
    public final void mo47897B(String str, String str2, Bundle bundle) {
        long a = this.f34342a.mo45256a().mo29580a();
        cu4.m43217g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(PublicResolver.FUNC_NAME, str);
        bundle2.putLong("creation_timestamp", a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f34342a.mo45272s().mo41640o(new fw8(this, bundle2));
    }

    /* renamed from: C */
    public final ArrayList<Bundle> mo47898C(String str, String str2) {
        if (this.f34342a.mo45272s().mo41637l()) {
            this.f34342a.mo45237A().mo29670l().mo48769a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        this.f34342a.mo45257b();
        if (rk9.m51151a()) {
            this.f34342a.mo45237A().mo29670l().mo48769a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f34342a.mo45272s().mo41641p(atomicReference, 5000, "get conditional user properties", new lw8(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return g69.m44580Y(list);
        }
        this.f34342a.mo45237A().mo29670l().mo48770b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList<>();
    }

    /* renamed from: D */
    public final Map<String, Object> mo47899D(String str, String str2, boolean z) {
        if (this.f34342a.mo45272s().mo41637l()) {
            this.f34342a.mo45237A().mo29670l().mo48769a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f34342a.mo45257b();
        if (rk9.m51151a()) {
            this.f34342a.mo45237A().mo29670l().mo48769a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f34342a.mo45272s().mo41641p(atomicReference, 5000, "get user properties", new ow8(this, atomicReference, (String) null, str, str2, z));
        List<zzkq> list = (List) atomicReference.get();
        if (list == null) {
            this.f34342a.mo45237A().mo29670l().mo48770b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        C2781lq lqVar = new C2781lq(list.size());
        for (zzkq zzkq : list) {
            Object r1 = zzkq.mo31423r1();
            if (r1 != null) {
                lqVar.put(zzkq.f23079d, r1);
            }
        }
        return lqVar;
    }

    /* renamed from: E */
    public final String mo47900E() {
        ty8 v = this.f34342a.mo45253Q().mo44644v();
        if (v != null) {
            return v.f34422a;
        }
        return null;
    }

    /* renamed from: F */
    public final String mo47901F() {
        ty8 v = this.f34342a.mo45253Q().mo44644v();
        if (v != null) {
            return v.f34423b;
        }
        return null;
    }

    /* renamed from: G */
    public final String mo47902G() {
        if (this.f34342a.mo45248L() != null) {
            return this.f34342a.mo45248L();
        }
        try {
            return ry8.m51436a(this.f34342a.mo45271q(), "google_app_id", this.f34342a.mo45252P());
        } catch (IllegalStateException e) {
            this.f34342a.mo45237A().mo29670l().mo48770b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: H */
    public final /* synthetic */ void mo47903H(Bundle bundle) {
        if (bundle == null) {
            this.f34342a.mo45275z().f31374w.mo42640b(new Bundle());
            return;
        }
        Bundle a = this.f34342a.mo45275z().f31374w.mo42639a();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f34342a.mo45243G().mo42830t0(obj)) {
                    this.f34342a.mo45243G().mo42838z(this.f34056p, (String) null, 27, (String) null, (String) null, 0, this.f34342a.mo45274y().mo45997v((String) null, rl8.f33533y0));
                }
                this.f34342a.mo45237A().mo29675r().mo48771c("Invalid default event parameter type. Name, value", next, obj);
            } else if (g69.m44577F(next)) {
                this.f34342a.mo45237A().mo29675r().mo48770b("Invalid default event parameter name. Name", next);
            } else if (obj == null) {
                a.remove(next);
            } else {
                g69 G = this.f34342a.mo45243G();
                this.f34342a.mo45274y();
                if (G.mo42832u0("param", next, 100, obj)) {
                    this.f34342a.mo45243G().mo42837y(a, next, obj);
                }
            }
        }
        this.f34342a.mo45243G();
        int j = this.f34342a.mo45274y().mo45987j();
        if (a.size() > j) {
            int i = 0;
            for (String str : new TreeSet(a.keySet())) {
                i++;
                if (i > j) {
                    a.remove(str);
                }
            }
            this.f34342a.mo45243G().mo42838z(this.f34056p, (String) null, 26, (String) null, (String) null, 0, this.f34342a.mo45274y().mo45997v((String) null, rl8.f33533y0));
            this.f34342a.mo45237A().mo29675r().mo48769a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f34342a.mo45275z().f31374w.mo42640b(a);
        this.f34342a.mo45254R().mo42730l(a);
    }

    /* renamed from: L */
    public final void mo47904L(Boolean bool, boolean z) {
        mo29006e();
        mo47219g();
        this.f34342a.mo45237A().mo29677u().mo48770b("Setting app measurement enabled (FE)", bool);
        this.f34342a.mo45275z().mo45480n(bool);
        if (z) {
            lp8 z2 = this.f34342a.mo45275z();
            kr8 kr8 = z2.f34342a;
            z2.mo29006e();
            SharedPreferences.Editor edit = z2.mo45479m().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f34342a.mo45265k() || (bool != null && !bool.booleanValue())) {
            mo47905M();
        }
    }

    /* renamed from: M */
    public final void mo47905M() {
        long j;
        mo29006e();
        String a = this.f34342a.mo45275z().f31364m.mo43884a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo47924m("app", "_npa", (Object) null, this.f34342a.mo45256a().mo29580a());
            } else {
                if (true != "true".equals(a)) {
                    j = 0;
                } else {
                    j = 1;
                }
                mo47924m("app", "_npa", Long.valueOf(j), this.f34342a.mo45256a().mo29580a());
            }
        }
        if (!this.f34342a.mo45262h() || !this.f34055o) {
            this.f34342a.mo45237A().mo29677u().mo48769a("Updating Scion state (FE)");
            this.f34342a.mo45254R().mo42715I();
            return;
        }
        this.f34342a.mo45237A().mo29677u().mo48769a("Recording app launch after enabling measurement for the first time (FE)");
        mo47929t();
        xd9.m54379a();
        if (this.f34342a.mo45274y().mo45997v((String) null, rl8.f33515p0)) {
            this.f34342a.mo45239C().f34828d.mo47625a();
        }
        this.f34342a.mo45272s().mo41640o(new lv8(this));
    }

    /* renamed from: N */
    public final void mo47906N() {
        if ((this.f34342a.mo45271q().getApplicationContext() instanceof Application) && this.f34043c != null) {
            ((Application) this.f34342a.mo45271q().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f34043c);
        }
    }

    /* renamed from: O */
    public final Boolean mo47907O() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f34342a.mo45272s().mo41641p(atomicReference, yt6.DEFAULT_POLLING_FREQUENCY, "boolean test flag value", new iw8(this, atomicReference));
    }

    /* renamed from: P */
    public final String mo47908P() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f34342a.mo45272s().mo41641p(atomicReference, yt6.DEFAULT_POLLING_FREQUENCY, "String test flag value", new sw8(this, atomicReference));
    }

    /* renamed from: Q */
    public final Long mo47909Q() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f34342a.mo45272s().mo41641p(atomicReference, yt6.DEFAULT_POLLING_FREQUENCY, "long test flag value", new vw8(this, atomicReference));
    }

    /* renamed from: R */
    public final Integer mo47910R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f34342a.mo45272s().mo41641p(atomicReference, yt6.DEFAULT_POLLING_FREQUENCY, "int test flag value", new xw8(this, atomicReference));
    }

    /* renamed from: S */
    public final Double mo47911S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f34342a.mo45272s().mo41641p(atomicReference, yt6.DEFAULT_POLLING_FREQUENCY, "double test flag value", new zw8(this, atomicReference));
    }

    /* renamed from: T */
    public final void mo47912T(Boolean bool) {
        mo47219g();
        this.f34342a.mo45272s().mo41640o(new cx8(this, bool));
    }

    /* renamed from: U */
    public final void mo47913U(Bundle bundle, int i, long j) {
        mo47219g();
        String a = u68.m52646a(bundle);
        if (a != null) {
            this.f34342a.mo45237A().mo29675r().mo48770b("Ignoring invalid consent setting", a);
            this.f34342a.mo45237A().mo29675r().mo48769a("Valid consent values are 'granted', 'denied'");
        }
        mo47914V(u68.m52647b(bundle), i, j);
    }

    /* renamed from: V */
    public final void mo47914V(u68 u68, int i, long j) {
        boolean z;
        boolean z2;
        u68 u682;
        boolean z3;
        u68 u683 = u68;
        int i2 = i;
        mo47219g();
        if (i2 != -10 && u68.mo48327e() == null && u68.mo48330g() == null) {
            this.f34342a.mo45237A().mo29675r().mo48769a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f34048h) {
            z = true;
            z2 = false;
            if (u68.m52650m(i2, this.f34050j)) {
                boolean i3 = u68.mo48333i(this.f34049i);
                if (u68.mo48331h() && !this.f34049i.mo48331h()) {
                    z2 = true;
                }
                u68 l = u68.mo48335l(this.f34049i);
                this.f34049i = l;
                this.f34050j = i2;
                boolean z4 = i3;
                u682 = l;
                z3 = z2;
                z2 = z4;
            } else {
                u682 = u683;
                z3 = false;
                z = false;
            }
        }
        if (!z) {
            this.f34342a.mo45237A().mo29676t().mo48770b("Ignoring lower-priority consent settings, proposed settings", u682);
            return;
        }
        long andIncrement = this.f34051k.getAndIncrement();
        if (z2) {
            this.f34047g.set((Object) null);
            this.f34342a.mo45272s().mo41642r(new fx8(this, u682, j, i, andIncrement, z3));
        } else if (i2 == 30 || i2 == -10) {
            this.f34342a.mo45272s().mo41642r(new ix8(this, u682, i, andIncrement, z3));
        } else {
            this.f34342a.mo45272s().mo41640o(new kx8(this, u682, i, andIncrement, z3));
        }
    }

    /* renamed from: W */
    public final void mo47915W(u68 u68) {
        boolean z;
        Boolean bool;
        mo29006e();
        if ((!u68.mo48331h() || !u68.mo48329f()) && !this.f34342a.mo45254R().mo42737u()) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.f34342a.mo45265k()) {
            this.f34342a.mo45264j(z);
            lp8 z2 = this.f34342a.mo45275z();
            kr8 kr8 = z2.f34342a;
            z2.mo29006e();
            if (z2.mo45479m().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(z2.mo45479m().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z || bool == null || bool.booleanValue()) {
                mo47904L(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: X */
    public final void mo47916X(String str, String str2, Bundle bundle) {
        mo47919a0(str, str2, bundle, true, true, this.f34342a.mo45256a().mo29580a());
    }

    /* renamed from: Y */
    public final void mo47917Y(String str, String str2, long j, Bundle bundle) {
        boolean z;
        mo29006e();
        if (this.f34044d == null || g69.m44577F(str2)) {
            z = true;
        } else {
            z = false;
        }
        mo47918Z(str, str2, j, bundle, true, z, false, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47918Z(java.lang.String r21, java.lang.String r22, long r23, android.os.Bundle r25, boolean r26, boolean r27, boolean r28, java.lang.String r29) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r12 = r25
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            p000.cu4.m43217g(r21)
            p000.cu4.m43221k(r25)
            r20.mo29006e()
            r20.mo47219g()
            kr8 r1 = r7.f34342a
            boolean r1 = r1.mo45262h()
            if (r1 == 0) goto L_0x0536
            kr8 r1 = r7.f34342a
            dm8 r1 = r1.mo45258c()
            java.util.List r1 = r1.mo41985u()
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0033
            goto L_0x0043
        L_0x0033:
            kr8 r0 = r7.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29677u()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo48771c(r1, r9, r8)
            return
        L_0x0043:
            boolean r1 = r7.f34046f
            r13 = 0
            r14 = 0
            r15 = 1
            if (r1 != 0) goto L_0x00a1
            r7.f34046f = r15
            kr8 r1 = r7.f34342a     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r1 = r1.mo45251O()     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r1 != 0) goto L_0x0063
            kr8 r1 = r7.f34342a     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r1 = r1.mo45271q()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            kr8 r2 = r7.f34342a     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.mo45271q()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            kr8 r1 = r7.f34342a     // Catch:{ ClassNotFoundException -> 0x0092 }
            bn8 r1 = r1.mo45237A()     // Catch:{ ClassNotFoundException -> 0x0092 }
            vm8 r1 = r1.mo29673o()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo48770b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            kr8 r0 = r7.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29676t()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo48769a(r1)
        L_0x00a1:
            kr8 r0 = r7.f34342a
            n68 r0 = r0.mo45274y()
            uk8<java.lang.Boolean> r1 = p000.rl8.f33491d0
            boolean r0 = r0.mo45997v(r13, r1)
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00db
            kr8 r1 = r7.f34342a
            r1.mo45257b()
            java.lang.String r4 = r12.getString(r0)
            kr8 r0 = r7.f34342a
            bh0 r0 = r0.mo45256a()
            long r5 = r0.mo29580a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r20
            r1.mo47924m(r2, r3, r4, r5)
        L_0x00db:
            kr8 r0 = r7.f34342a
            r0.mo45257b()
            if (r26 == 0) goto L_0x00fd
            boolean r0 = p000.g69.m44579M(r22)
            if (r0 == 0) goto L_0x00fd
            kr8 r0 = r7.f34342a
            g69 r0 = r0.mo45243G()
            kr8 r1 = r7.f34342a
            lp8 r1 = r1.mo45275z()
            fo8 r1 = r1.f31374w
            android.os.Bundle r1 = r1.mo42639a()
            r0.mo42831u(r12, r1)
        L_0x00fd:
            r0 = 40
            if (r28 == 0) goto L_0x0193
            kr8 r1 = r7.f34342a
            r1.mo45257b()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0193
            kr8 r1 = r7.f34342a
            g69 r1 = r1.mo45243G()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo42816l0(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x011e
            goto L_0x0138
        L_0x011e:
            java.lang.String[] r3 = p000.cu8.f27953a
            java.lang.String[] r5 = p000.cu8.f27954b
            boolean r3 = r1.mo42820n0(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x012b
            r4 = 13
            goto L_0x0138
        L_0x012b:
            kr8 r3 = r1.f34342a
            r3.mo45274y()
            boolean r1 = r1.mo42822o0(r2, r0, r9)
            if (r1 != 0) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r4 = r14
        L_0x0138:
            if (r4 == 0) goto L_0x0193
            kr8 r1 = r7.f34342a
            bn8 r1 = r1.mo45237A()
            vm8 r1 = r1.mo29672n()
            kr8 r2 = r7.f34342a
            mm8 r2 = r2.mo45244H()
            java.lang.String r2 = r2.mo45821m(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo48770b(r3, r2)
            kr8 r1 = r7.f34342a
            g69 r1 = r1.mo45243G()
            kr8 r2 = r7.f34342a
            r2.mo45274y()
            java.lang.String r0 = r1.mo42819n(r9, r0, r15)
            if (r9 == 0) goto L_0x0168
            int r14 = r22.length()
        L_0x0168:
            kr8 r1 = r7.f34342a
            g69 r1 = r1.mo45243G()
            d69 r2 = r7.f34056p
            r3 = 0
            kr8 r5 = r7.f34342a
            n68 r5 = r5.mo45274y()
            uk8<java.lang.Boolean> r6 = p000.rl8.f33533y0
            boolean r5 = r5.mo45997v(r13, r6)
            java.lang.String r6 = "_ev"
            r21 = r1
            r22 = r2
            r23 = r3
            r24 = r4
            r25 = r6
            r26 = r0
            r27 = r14
            r28 = r5
            r21.mo42838z(r22, r23, r24, r25, r26, r27, r28)
            return
        L_0x0193:
            kr8 r1 = r7.f34342a
            r1.mo45257b()
            kr8 r1 = r7.f34342a
            jz8 r1 = r1.mo45253Q()
            ty8 r1 = r1.mo44640p(r14)
            java.lang.String r6 = "_sc"
            if (r1 == 0) goto L_0x01ae
            boolean r2 = r12.containsKey(r6)
            if (r2 != 0) goto L_0x01ae
            r1.f34425d = r15
        L_0x01ae:
            if (r26 == 0) goto L_0x01b4
            if (r28 == 0) goto L_0x01b4
            r2 = r15
            goto L_0x01b5
        L_0x01b4:
            r2 = r14
        L_0x01b5:
            p000.jz8.m46827w(r1, r12, r2)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r2 = p000.g69.m44577F(r22)
            if (r26 == 0) goto L_0x0205
            hu8 r3 = r7.f34044d
            if (r3 == 0) goto L_0x0205
            if (r2 != 0) goto L_0x0205
            if (r1 == 0) goto L_0x01cf
            r16 = r15
            goto L_0x0207
        L_0x01cf:
            kr8 r0 = r7.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29677u()
            kr8 r1 = r7.f34342a
            mm8 r1 = r1.mo45244H()
            java.lang.String r1 = r1.mo45821m(r9)
            kr8 r2 = r7.f34342a
            mm8 r2 = r2.mo45244H()
            java.lang.String r2 = r2.mo45824p(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo48771c(r3, r1, r2)
            hu8 r0 = r7.f34044d
            p000.cu4.m43221k(r0)
            hu8 r1 = r7.f34044d
            r2 = r21
            r3 = r22
            r4 = r25
            r5 = r23
            r1.mo43396a(r2, r3, r4, r5)
            return
        L_0x0205:
            r16 = r1
        L_0x0207:
            kr8 r1 = r7.f34342a
            boolean r1 = r1.mo45268n()
            if (r1 == 0) goto L_0x0535
            kr8 r1 = r7.f34342a
            g69 r1 = r1.mo45243G()
            int r1 = r1.mo42824p0(r9)
            if (r1 == 0) goto L_0x0273
            kr8 r2 = r7.f34342a
            bn8 r2 = r2.mo45237A()
            vm8 r2 = r2.mo29672n()
            kr8 r3 = r7.f34342a
            mm8 r3 = r3.mo45244H()
            java.lang.String r3 = r3.mo45821m(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.mo48770b(r4, r3)
            kr8 r2 = r7.f34342a
            g69 r2 = r2.mo45243G()
            kr8 r3 = r7.f34342a
            r3.mo45274y()
            java.lang.String r0 = r2.mo42819n(r9, r0, r15)
            if (r9 == 0) goto L_0x0249
            int r14 = r22.length()
        L_0x0249:
            kr8 r2 = r7.f34342a
            g69 r2 = r2.mo45243G()
            d69 r3 = r7.f34056p
            kr8 r4 = r7.f34342a
            n68 r4 = r4.mo45274y()
            uk8<java.lang.Boolean> r5 = p000.rl8.f33533y0
            boolean r4 = r4.mo45997v(r13, r5)
            java.lang.String r5 = "_ev"
            r21 = r2
            r22 = r3
            r23 = r29
            r24 = r1
            r25 = r5
            r26 = r0
            r27 = r14
            r28 = r4
            r21.mo42838z(r22, r23, r24, r25, r26, r27, r28)
            return
        L_0x0273:
            java.lang.String r0 = "_o"
            java.lang.String r5 = "_sn"
            java.lang.String r4 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r5, r6, r4}
            java.util.List r17 = p000.lj0.m47829c(r1)
            kr8 r1 = r7.f34342a
            g69 r1 = r1.mo45243G()
            r2 = r29
            r3 = r22
            r15 = r4
            r4 = r25
            r12 = r5
            r5 = r17
            r13 = r6
            r6 = r28
            android.os.Bundle r5 = r1.mo42826r(r2, r3, r4, r5, r6)
            p000.cu4.m43221k(r5)
            boolean r1 = r5.containsKey(r13)
            if (r1 == 0) goto L_0x02b8
            boolean r1 = r5.containsKey(r15)
            if (r1 == 0) goto L_0x02b8
            java.lang.String r1 = r5.getString(r12)
            java.lang.String r2 = r5.getString(r13)
            long r3 = r5.getLong(r15)
            ty8 r6 = new ty8
            r6.<init>(r1, r2, r3)
        L_0x02b8:
            kr8 r1 = r7.f34342a
            r1.mo45257b()
            kr8 r1 = r7.f34342a
            jz8 r1 = r1.mo45253Q()
            ty8 r1 = r1.mo44640p(r14)
            r12 = 0
            java.lang.String r15 = "_ae"
            if (r1 == 0) goto L_0x02fd
            boolean r1 = r15.equals(r9)
            if (r1 == 0) goto L_0x02fd
            kr8 r1 = r7.f34342a
            v39 r1 = r1.mo45239C()
            p39 r1 = r1.f34829e
            v39 r2 = r1.f32551d
            kr8 r2 = r2.f34342a
            bh0 r2 = r2.mo45256a()
            long r2 = r2.mo29581b()
            r25 = r15
            long r14 = r1.f32549b
            long r14 = r2 - r14
            r1.f32549b = r2
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ff
            kr8 r1 = r7.f34342a
            g69 r1 = r1.mo45243G()
            r1.mo42800Q(r5, r14)
            goto L_0x02ff
        L_0x02fd:
            r25 = r15
        L_0x02ff:
            p000.dd9.m43457a()
            kr8 r1 = r7.f34342a
            n68 r1 = r1.mo45274y()
            uk8<java.lang.Boolean> r2 = p000.rl8.f33513o0
            r14 = 0
            boolean r1 = r1.mo45997v(r14, r2)
            if (r1 == 0) goto L_0x038d
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0369
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0369
            kr8 r1 = r7.f34342a
            g69 r1 = r1.mo45243G()
            java.lang.String r2 = r5.getString(r2)
            boolean r3 = p000.qb6.m50490a(r2)
            if (r3 == 0) goto L_0x0335
            r2 = r14
            goto L_0x033b
        L_0x0335:
            if (r2 == 0) goto L_0x033b
            java.lang.String r2 = r2.trim()
        L_0x033b:
            kr8 r3 = r1.f34342a
            lp8 r3 = r3.mo45275z()
            ip8 r3 = r3.f31371t
            java.lang.String r3 = r3.mo43884a()
            boolean r3 = p000.g69.m44578G(r2, r3)
            if (r3 != 0) goto L_0x0359
            kr8 r1 = r1.f34342a
            lp8 r1 = r1.mo45275z()
            ip8 r1 = r1.f31371t
            r1.mo43885b(r2)
            goto L_0x038d
        L_0x0359:
            kr8 r0 = r1.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29677u()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo48769a(r1)
            return
        L_0x0369:
            r15 = r25
            boolean r1 = r15.equals(r9)
            if (r1 == 0) goto L_0x038f
            kr8 r1 = r7.f34342a
            g69 r1 = r1.mo45243G()
            kr8 r1 = r1.f34342a
            lp8 r1 = r1.mo45275z()
            ip8 r1 = r1.f31371t
            java.lang.String r1 = r1.mo43884a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x038f
            r5.putString(r2, r1)
            goto L_0x038f
        L_0x038d:
            r15 = r25
        L_0x038f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r5)
            kr8 r1 = r7.f34342a
            lp8 r1 = r1.mo45275z()
            io8 r1 = r1.f31366o
            long r1 = r1.mo43882a()
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0410
            kr8 r1 = r7.f34342a
            lp8 r1 = r1.mo45275z()
            boolean r1 = r1.mo45486v(r10)
            if (r1 == 0) goto L_0x0410
            kr8 r1 = r7.f34342a
            lp8 r1 = r1.mo45275z()
            do8 r1 = r1.f31368q
            boolean r1 = r1.mo41988a()
            if (r1 == 0) goto L_0x0410
            kr8 r1 = r7.f34342a
            bn8 r1 = r1.mo45237A()
            vm8 r1 = r1.mo29678v()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo48769a(r2)
            r4 = 0
            kr8 r1 = r7.f34342a
            bh0 r1 = r1.mo45256a()
            long r18 = r1.mo29580a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sid"
            r1 = r20
            r14 = r5
            r25 = r6
            r5 = r18
            r1.mo47924m(r2, r3, r4, r5)
            kr8 r1 = r7.f34342a
            bh0 r1 = r1.mo45256a()
            long r5 = r1.mo29580a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r20
            r1.mo47924m(r2, r3, r4, r5)
            kr8 r1 = r7.f34342a
            bh0 r1 = r1.mo45256a()
            long r5 = r1.mo29580a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r20
            r1.mo47924m(r2, r3, r4, r5)
            goto L_0x0413
        L_0x0410:
            r14 = r5
            r25 = r6
        L_0x0413:
            java.lang.String r1 = "extend_session"
            long r1 = r14.getLong(r1, r12)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x043a
            kr8 r1 = r7.f34342a
            bn8 r1 = r1.mo45237A()
            vm8 r1 = r1.mo29678v()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo48769a(r2)
            kr8 r1 = r7.f34342a
            v39 r1 = r1.mo45239C()
            s39 r1 = r1.f34828d
            r2 = 1
            r1.mo47626b(r10, r2)
        L_0x043a:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r14.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x044b:
            if (r3 >= r2) goto L_0x0499
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0496
            kr8 r5 = r7.f34342a
            r5.mo45243G()
            java.lang.Object r5 = r14.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x046b
            r6 = 1
            android.os.Bundle[] r12 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r12[r6] = r5
            goto L_0x0491
        L_0x046b:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x047c
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r12 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r12)
            r12 = r5
            android.os.Bundle[] r12 = (android.os.Bundle[]) r12
            goto L_0x0491
        L_0x047c:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x0490
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r12 = r5
            android.os.Bundle[] r12 = (android.os.Bundle[]) r12
            goto L_0x0491
        L_0x0490:
            r12 = 0
        L_0x0491:
            if (r12 == 0) goto L_0x0496
            r14.putParcelableArray(r4, r12)
        L_0x0496:
            int r3 = r3 + 1
            goto L_0x044b
        L_0x0499:
            r12 = 0
        L_0x049a:
            int r1 = r25.size()
            if (r12 >= r1) goto L_0x0507
            r13 = r25
            java.lang.Object r1 = r13.get(r12)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r12 == 0) goto L_0x04ad
            java.lang.String r2 = "_ep"
            goto L_0x04ae
        L_0x04ad:
            r2 = r9
        L_0x04ae:
            r1.putString(r0, r8)
            if (r27 == 0) goto L_0x04bd
            kr8 r3 = r7.f34342a
            g69 r3 = r3.mo45243G()
            android.os.Bundle r1 = r3.mo42793I(r1)
        L_0x04bd:
            r14 = r1
            com.google.android.gms.measurement.internal.zzas r5 = new com.google.android.gms.measurement.internal.zzas
            com.google.android.gms.measurement.internal.zzaq r3 = new com.google.android.gms.measurement.internal.zzaq
            r3.<init>(r14)
            r1 = r5
            r4 = r21
            r26 = r0
            r0 = r5
            r5 = r23
            r1.<init>(r2, r3, r4, r5)
            kr8 r1 = r7.f34342a
            g29 r1 = r1.mo45254R()
            r5 = r29
            r1.mo42718L(r0, r5)
            if (r16 != 0) goto L_0x0500
            java.util.Set<ju8> r0 = r7.f34045e
            java.util.Iterator r0 = r0.iterator()
        L_0x04e3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0500
            java.lang.Object r1 = r0.next()
            ju8 r1 = (p000.ju8) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r14)
            r2 = r21
            r3 = r22
            r5 = r23
            r1.mo28920a(r2, r3, r4, r5)
            r5 = r29
            goto L_0x04e3
        L_0x0500:
            int r12 = r12 + 1
            r0 = r26
            r25 = r13
            goto L_0x049a
        L_0x0507:
            kr8 r0 = r7.f34342a
            r0.mo45257b()
            kr8 r0 = r7.f34342a
            jz8 r0 = r0.mo45253Q()
            r1 = 0
            ty8 r0 = r0.mo44640p(r1)
            if (r0 == 0) goto L_0x0535
            boolean r0 = r15.equals(r9)
            if (r0 == 0) goto L_0x0535
            kr8 r0 = r7.f34342a
            v39 r0 = r0.mo45239C()
            kr8 r1 = r7.f34342a
            bh0 r1 = r1.mo45256a()
            long r1 = r1.mo29581b()
            p39 r0 = r0.f34829e
            r3 = 1
            r0.mo46626d(r3, r3, r1)
        L_0x0535:
            return
        L_0x0536:
            kr8 r0 = r7.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29677u()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo48769a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sx8.mo47918Z(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: a0 */
    public final void mo47919a0(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3;
        Bundle bundle2;
        boolean z3;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (this.f34342a.mo45274y().mo45997v((String) null, rl8.f33523t0)) {
            String str4 = str2;
            if (g69.m44578G(str2, "screen_view")) {
                this.f34342a.mo45253Q().mo44642t(bundle2, j);
                return;
            }
        } else {
            String str5 = str2;
        }
        long j2 = j;
        if (!z2 || this.f34044d == null || g69.m44577F(str2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        mo47920b0(str3, str2, j, bundle2, z2, z3, !z, (String) null);
    }

    /* renamed from: b0 */
    public final void mo47920b0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle2.keySet()) {
            Object obj = bundle2.get(next);
            if (obj instanceof Bundle) {
                bundle2.putBundle(next, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f34342a.mo45272s().mo41640o(new sv8(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* renamed from: c0 */
    public final void mo47921c0(String str, String str2, Object obj, boolean z) {
        mo47922d0("auto", str2, obj, true, this.f34342a.mo45256a().mo29580a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47922d0(java.lang.String r18, java.lang.String r19, java.lang.Object r20, boolean r21, long r22) {
        /*
            r17 = this;
            r6 = r17
            r2 = r19
            r0 = r20
            if (r18 != 0) goto L_0x000b
            java.lang.String r1 = "app"
            goto L_0x000d
        L_0x000b:
            r1 = r18
        L_0x000d:
            r3 = 6
            r4 = 0
            r5 = 24
            r7 = 0
            if (r21 == 0) goto L_0x0020
            kr8 r3 = r6.f34342a
            g69 r3 = r3.mo45243G()
            int r3 = r3.mo42825q0(r2)
        L_0x001e:
            r12 = r3
            goto L_0x0047
        L_0x0020:
            kr8 r8 = r6.f34342a
            g69 r8 = r8.mo45243G()
            java.lang.String r9 = "user property"
            boolean r10 = r8.mo42816l0(r9, r2)
            if (r10 != 0) goto L_0x002f
        L_0x002e:
            goto L_0x001e
        L_0x002f:
            java.lang.String[] r10 = p000.fu8.f28992a
            boolean r10 = r8.mo42820n0(r9, r10, r7, r2)
            if (r10 != 0) goto L_0x003a
            r3 = 15
            goto L_0x001e
        L_0x003a:
            kr8 r10 = r8.f34342a
            r10.mo45274y()
            boolean r8 = r8.mo42822o0(r9, r5, r2)
            if (r8 != 0) goto L_0x0046
            goto L_0x002e
        L_0x0046:
            r12 = r4
        L_0x0047:
            r3 = 1
            if (r12 == 0) goto L_0x007b
            kr8 r0 = r6.f34342a
            g69 r0 = r0.mo45243G()
            kr8 r1 = r6.f34342a
            r1.mo45274y()
            java.lang.String r14 = r0.mo42819n(r2, r5, r3)
            if (r2 == 0) goto L_0x005f
            int r4 = r19.length()
        L_0x005f:
            r15 = r4
            kr8 r0 = r6.f34342a
            g69 r9 = r0.mo45243G()
            d69 r10 = r6.f34056p
            r11 = 0
            kr8 r0 = r6.f34342a
            n68 r0 = r0.mo45274y()
            uk8<java.lang.Boolean> r1 = p000.rl8.f33533y0
            boolean r16 = r0.mo45997v(r7, r1)
            java.lang.String r13 = "_ev"
            r9.mo42838z(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x007b:
            if (r0 == 0) goto L_0x00da
            kr8 r8 = r6.f34342a
            g69 r8 = r8.mo45243G()
            int r12 = r8.mo42835w(r2, r0)
            if (r12 == 0) goto L_0x00c4
            kr8 r1 = r6.f34342a
            g69 r1 = r1.mo45243G()
            kr8 r8 = r6.f34342a
            r8.mo45274y()
            java.lang.String r14 = r1.mo42819n(r2, r5, r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x00a0
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L_0x00a8
        L_0x00a0:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            int r4 = r0.length()
        L_0x00a8:
            r15 = r4
            kr8 r0 = r6.f34342a
            g69 r9 = r0.mo45243G()
            d69 r10 = r6.f34056p
            r11 = 0
            kr8 r0 = r6.f34342a
            n68 r0 = r0.mo45274y()
            uk8<java.lang.Boolean> r1 = p000.rl8.f33533y0
            boolean r16 = r0.mo45997v(r7, r1)
            java.lang.String r13 = "_ev"
            r9.mo42838z(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x00c4:
            kr8 r3 = r6.f34342a
            g69 r3 = r3.mo45243G()
            java.lang.Object r5 = r3.mo42836x(r2, r0)
            if (r5 == 0) goto L_0x00d9
            r0 = r17
            r2 = r19
            r3 = r22
            r0.mo47923l(r1, r2, r3, r5)
        L_0x00d9:
            return
        L_0x00da:
            r5 = 0
            r0 = r17
            r2 = r19
            r3 = r22
            r0.mo47923l(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sx8.mo47922d0(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* renamed from: j */
    public final boolean mo41976j() {
        return false;
    }

    /* renamed from: l */
    public final void mo47923l(String str, String str2, long j, Object obj) {
        this.f34342a.mo45272s().mo41640o(new vv8(this, str, str2, obj, j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47924m(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            p000.cu4.m43217g(r9)
            p000.cu4.m43217g(r10)
            r8.mo29006e()
            r8.mo47219g()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0064
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0052
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0052
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L_0x0037
            r10 = 0
            goto L_0x0038
        L_0x0037:
            r10 = r2
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            kr8 r10 = r8.f34342a
            lp8 r10 = r10.mo45275z()
            ip8 r10 = r10.f31364m
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x004e
            java.lang.String r0 = "true"
        L_0x004e:
            r10.mo43885b(r0)
            goto L_0x0061
        L_0x0052:
            if (r11 != 0) goto L_0x0064
            kr8 r10 = r8.f34342a
            lp8 r10 = r10.mo45275z()
            ip8 r10 = r10.f31364m
            java.lang.String r0 = "unset"
            r10.mo43885b(r0)
        L_0x0061:
            r6 = r11
            r3 = r1
            goto L_0x0066
        L_0x0064:
            r3 = r10
            r6 = r11
        L_0x0066:
            kr8 r10 = r8.f34342a
            boolean r10 = r10.mo45262h()
            if (r10 != 0) goto L_0x007e
            kr8 r9 = r8.f34342a
            bn8 r9 = r9.mo45237A()
            vm8 r9 = r9.mo29678v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo48769a(r10)
            return
        L_0x007e:
            kr8 r10 = r8.f34342a
            boolean r10 = r10.mo45268n()
            if (r10 != 0) goto L_0x0087
            return
        L_0x0087:
            com.google.android.gms.measurement.internal.zzkq r10 = new com.google.android.gms.measurement.internal.zzkq
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            kr8 r9 = r8.f34342a
            g29 r9 = r9.mo45254R()
            r9.mo42724R(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sx8.mo47924m(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: n */
    public final String mo47925n() {
        return this.f34047g.get();
    }

    /* renamed from: o */
    public final void mo47926o(String str) {
        this.f34047g.set(str);
    }

    /* renamed from: p */
    public final void mo47927p(long j) {
        this.f34047g.set((Object) null);
        this.f34342a.mo45272s().mo41640o(new zv8(this, j));
    }

    /* renamed from: r */
    public final void mo47928r(long j, boolean z) {
        mo29006e();
        mo47219g();
        this.f34342a.mo45237A().mo29677u().mo48769a("Resetting analytics data (FE)");
        v39 C = this.f34342a.mo45239C();
        C.mo29006e();
        C.f34829e.mo46625c();
        boolean h = this.f34342a.mo45262h();
        lp8 z2 = this.f34342a.mo45275z();
        z2.f31356e.mo43883b(j);
        if (!TextUtils.isEmpty(z2.f34342a.mo45275z().f31371t.mo43884a())) {
            z2.f31371t.mo43885b((String) null);
        }
        xd9.m54379a();
        n68 y = z2.f34342a.mo45274y();
        uk8<Boolean> uk8 = rl8.f33515p0;
        if (y.mo45997v((String) null, uk8)) {
            z2.f31366o.mo43883b(0);
        }
        if (!z2.f34342a.mo45274y().mo46001z()) {
            z2.mo45484t(!h);
        }
        z2.f31372u.mo43885b((String) null);
        z2.f31373v.mo43883b(0);
        z2.f31374w.mo42640b((Bundle) null);
        if (z) {
            this.f34342a.mo45254R().mo42725S();
        }
        xd9.m54379a();
        if (this.f34342a.mo45274y().mo45997v((String) null, uk8)) {
            this.f34342a.mo45239C().f34828d.mo47625a();
        }
        this.f34055o = !h;
    }

    /* renamed from: t */
    public final void mo47929t() {
        mo29006e();
        mo47219g();
        if (this.f34342a.mo45268n()) {
            if (this.f34342a.mo45274y().mo45997v((String) null, rl8.f33489c0)) {
                n68 y = this.f34342a.mo45274y();
                y.f34342a.mo45257b();
                Boolean x = y.mo45999x("google_analytics_deferred_deep_link_enabled");
                if (x != null && x.booleanValue()) {
                    this.f34342a.mo45237A().mo29677u().mo48769a("Deferred Deep Link feature enabled.");
                    this.f34342a.mo45272s().mo41640o(new ru8(this));
                }
            }
            this.f34342a.mo45254R().mo42728V();
            this.f34055o = false;
            lp8 z = this.f34342a.mo45275z();
            z.mo29006e();
            String string = z.mo45479m().getString("previous_os_version", (String) null);
            z.f34342a.mo45255S().mo48801i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = z.mo45479m().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f34342a.mo45255S().mo48801i();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo47916X("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: u */
    public final void mo47930u(hu8 hu8) {
        hu8 hu82;
        boolean z;
        mo29006e();
        mo47219g();
        if (!(hu8 == null || hu8 == (hu82 = this.f34044d))) {
            if (hu82 == null) {
                z = true;
            } else {
                z = false;
            }
            cu4.m43226p(z, "EventInterceptor already set.");
        }
        this.f34044d = hu8;
    }

    /* renamed from: v */
    public final void mo47931v(ju8 ju8) {
        mo47219g();
        cu4.m43221k(ju8);
        if (!this.f34045e.add(ju8)) {
            this.f34342a.mo45237A().mo29673o().mo48769a("OnEventListener already registered");
        }
    }

    /* renamed from: w */
    public final void mo47932w(ju8 ju8) {
        mo47219g();
        cu4.m43221k(ju8);
        if (!this.f34045e.remove(ju8)) {
            this.f34342a.mo45237A().mo29673o().mo48769a("OnEventListener had not been registered");
        }
    }

    /* renamed from: x */
    public final int mo47933x(String str) {
        cu4.m43217g(str);
        this.f34342a.mo45274y();
        return 25;
    }

    /* renamed from: y */
    public final void mo47934y(Bundle bundle) {
        mo47935z(bundle, this.f34342a.mo45256a().mo29580a());
    }

    /* renamed from: z */
    public final void mo47935z(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        cu4.m43221k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f34342a.mo45237A().mo29673o().mo48769a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        cu4.m43221k(bundle2);
        zt8.m55252b(bundle2, "app_id", cls2, null);
        zt8.m55252b(bundle2, "origin", cls2, null);
        zt8.m55252b(bundle2, PublicResolver.FUNC_NAME, cls2, null);
        zt8.m55252b(bundle2, "value", Object.class, null);
        zt8.m55252b(bundle2, "trigger_event_name", cls2, null);
        zt8.m55252b(bundle2, "trigger_timeout", cls, 0L);
        zt8.m55252b(bundle2, "timed_out_event_name", cls2, null);
        zt8.m55252b(bundle2, "timed_out_event_params", Bundle.class, null);
        zt8.m55252b(bundle2, "triggered_event_name", cls2, null);
        zt8.m55252b(bundle2, "triggered_event_params", Bundle.class, null);
        zt8.m55252b(bundle2, "time_to_live", cls, 0L);
        zt8.m55252b(bundle2, "expired_event_name", cls2, null);
        zt8.m55252b(bundle2, "expired_event_params", Bundle.class, null);
        cu4.m43217g(bundle2.getString(PublicResolver.FUNC_NAME));
        cu4.m43217g(bundle2.getString("origin"));
        cu4.m43221k(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString(PublicResolver.FUNC_NAME);
        Object obj = bundle2.get("value");
        if (this.f34342a.mo45243G().mo42825q0(string) != 0) {
            this.f34342a.mo45237A().mo29670l().mo48770b("Invalid conditional user property name", this.f34342a.mo45244H().mo45823o(string));
        } else if (this.f34342a.mo45243G().mo42835w(string, obj) == 0) {
            Object x = this.f34342a.mo45243G().mo42836x(string, obj);
            if (x == null) {
                this.f34342a.mo45237A().mo29670l().mo48771c("Unable to normalize conditional user property value", this.f34342a.mo45244H().mo45823o(string), obj);
                return;
            }
            zt8.m55251a(bundle2, x);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f34342a.mo45274y();
                if (j2 > 15552000000L || j2 < 1) {
                    this.f34342a.mo45237A().mo29670l().mo48771c("Invalid conditional user property timeout", this.f34342a.mo45244H().mo45823o(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            this.f34342a.mo45274y();
            if (j3 > 15552000000L || j3 < 1) {
                this.f34342a.mo45237A().mo29670l().mo48771c("Invalid conditional user property time to live", this.f34342a.mo45244H().mo45823o(string), Long.valueOf(j3));
            } else {
                this.f34342a.mo45272s().mo41640o(new cw8(this, bundle2));
            }
        } else {
            this.f34342a.mo45237A().mo29670l().mo48771c("Invalid conditional user property value", this.f34342a.mo45244H().mo45823o(string), obj);
        }
    }
}
