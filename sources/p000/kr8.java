package p000;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.internal.measurement.zzcl;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kr8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class kr8 implements xt8 {

    /* renamed from: I */
    public static volatile kr8 f31013I;

    /* renamed from: A */
    public long f31014A;

    /* renamed from: B */
    public volatile Boolean f31015B;

    /* renamed from: C */
    public Boolean f31016C;

    /* renamed from: D */
    public Boolean f31017D;

    /* renamed from: E */
    public volatile boolean f31018E;

    /* renamed from: F */
    public int f31019F;

    /* renamed from: G */
    public final AtomicInteger f31020G = new AtomicInteger(0);

    /* renamed from: H */
    public final long f31021H;

    /* renamed from: a */
    public final Context f31022a;

    /* renamed from: b */
    public final String f31023b;

    /* renamed from: c */
    public final String f31024c;

    /* renamed from: d */
    public final String f31025d;

    /* renamed from: e */
    public final boolean f31026e;

    /* renamed from: f */
    public final rk9 f31027f;

    /* renamed from: g */
    public final n68 f31028g;

    /* renamed from: h */
    public final lp8 f31029h;

    /* renamed from: i */
    public final bn8 f31030i;

    /* renamed from: j */
    public final cr8 f31031j;

    /* renamed from: k */
    public final v39 f31032k;

    /* renamed from: l */
    public final g69 f31033l;

    /* renamed from: m */
    public final mm8 f31034m;

    /* renamed from: n */
    public final bh0 f31035n;

    /* renamed from: o */
    public final jz8 f31036o;

    /* renamed from: p */
    public final sx8 f31037p;

    /* renamed from: q */
    public final oh8 f31038q;

    /* renamed from: r */
    public final oy8 f31039r;

    /* renamed from: s */
    public final String f31040s;

    /* renamed from: t */
    public jm8 f31041t;

    /* renamed from: u */
    public g29 f31042u;

    /* renamed from: v */
    public g88 f31043v;

    /* renamed from: w */
    public dm8 f31044w;

    /* renamed from: x */
    public wp8 f31045x;

    /* renamed from: y */
    public boolean f31046y = false;

    /* renamed from: z */
    public Boolean f31047z;

    public kr8(lu8 lu8) {
        long j;
        Bundle bundle;
        boolean z = false;
        cu4.m43221k(lu8);
        rk9 rk9 = new rk9(lu8.f31406a);
        this.f31027f = rk9;
        rk8.f33449a = rk9;
        Context context = lu8.f31406a;
        this.f31022a = context;
        this.f31023b = lu8.f31407b;
        this.f31024c = lu8.f31408c;
        this.f31025d = lu8.f31409d;
        this.f31026e = lu8.f31413h;
        this.f31015B = lu8.f31410e;
        this.f31040s = lu8.f31415j;
        this.f31018E = true;
        zzcl zzcl = lu8.f31412g;
        if (!(zzcl == null || (bundle = zzcl.f22627s) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f31016C = (Boolean) obj;
            }
            Object obj2 = zzcl.f22627s.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f31017D = (Boolean) obj2;
            }
        }
        lx8.m47973b(context);
        bh0 c = e71.m43806c();
        this.f31035n = c;
        Long l = lu8.f31414i;
        if (l != null) {
            j = l.longValue();
        } else {
            j = c.mo29580a();
        }
        this.f31021H = j;
        this.f31028g = new n68(this);
        lp8 lp8 = new lp8(this);
        lp8.mo48802j();
        this.f31029h = lp8;
        bn8 bn8 = new bn8(this);
        bn8.mo48802j();
        this.f31030i = bn8;
        g69 g69 = new g69(this);
        g69.mo48802j();
        this.f31033l = g69;
        mm8 mm8 = new mm8(this);
        mm8.mo48802j();
        this.f31034m = mm8;
        this.f31038q = new oh8(this);
        jz8 jz8 = new jz8(this);
        jz8.mo47220h();
        this.f31036o = jz8;
        sx8 sx8 = new sx8(this);
        sx8.mo47220h();
        this.f31037p = sx8;
        v39 v39 = new v39(this);
        v39.mo47220h();
        this.f31032k = v39;
        oy8 oy8 = new oy8(this);
        oy8.mo48802j();
        this.f31039r = oy8;
        cr8 cr8 = new cr8(this);
        cr8.mo48802j();
        this.f31031j = cr8;
        zzcl zzcl2 = lu8.f31412g;
        z = (zzcl2 == null || zzcl2.f22622d == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            sx8 F = mo45242F();
            if (F.f34342a.f31022a.getApplicationContext() instanceof Application) {
                Application application = (Application) F.f34342a.f31022a.getApplicationContext();
                if (F.f34043c == null) {
                    F.f34043c = new qx8(F, (iw8) null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(F.f34043c);
                    application.registerActivityLifecycleCallbacks(F.f34043c);
                    F.f34342a.mo45237A().mo29678v().mo48769a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo45237A().mo29673o().mo48769a("Application context is not an Application");
        }
        cr8.mo41640o(new hr8(this, lu8));
    }

    /* renamed from: e */
    public static kr8 m47470e(Context context, zzcl zzcl, Long l) {
        Bundle bundle;
        if (zzcl != null && (zzcl.f22625k == null || zzcl.f22626r == null)) {
            zzcl = new zzcl(zzcl.f22621a, zzcl.f22622d, zzcl.f22623e, zzcl.f22624g, (String) null, (String) null, zzcl.f22627s, (String) null);
        }
        cu4.m43221k(context);
        cu4.m43221k(context.getApplicationContext());
        if (f31013I == null) {
            synchronized (kr8.class) {
                if (f31013I == null) {
                    f31013I = new kr8(new lu8(context, zzcl, l));
                }
            }
        } else if (!(zzcl == null || (bundle = zzcl.f22627s) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            cu4.m43221k(f31013I);
            f31013I.f31015B = Boolean.valueOf(zzcl.f22627s.getBoolean("dataCollectionDefaultEnabled"));
        }
        cu4.m43221k(f31013I);
        return f31013I;
    }

    /* renamed from: r */
    public static /* synthetic */ void m47471r(kr8 kr8, lu8 lu8) {
        String str;
        kr8.mo45272s().mo29006e();
        kr8.f31028g.mo45986i();
        g88 g88 = new g88(kr8);
        g88.mo48802j();
        kr8.f31043v = g88;
        dm8 dm8 = new dm8(kr8, lu8.f31411f);
        dm8.mo47220h();
        kr8.f31044w = dm8;
        jm8 jm8 = new jm8(kr8);
        jm8.mo47220h();
        kr8.f31041t = jm8;
        g29 g29 = new g29(kr8);
        g29.mo47220h();
        kr8.f31042u = g29;
        kr8.f31033l.mo48803k();
        kr8.f31029h.mo48803k();
        kr8.f31045x = new wp8(kr8);
        kr8.f31044w.mo47221i();
        vm8 t = kr8.mo45237A().mo29676t();
        kr8.f31028g.mo45990m();
        t.mo48770b("App measurement initialized, version", 42004L);
        kr8.mo45237A().mo29676t().mo48769a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m = dm8.mo41979m();
        if (TextUtils.isEmpty(kr8.f31023b)) {
            if (kr8.mo45243G().mo42792H(m)) {
                kr8.mo45237A().mo29676t().mo48769a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                vm8 t2 = kr8.mo45237A().mo29676t();
                String valueOf = String.valueOf(m);
                if (valueOf.length() != 0) {
                    str = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf);
                } else {
                    str = new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                }
                t2.mo48769a(str);
            }
        }
        kr8.mo45237A().mo29677u().mo48769a("Debug-level message logging enabled");
        if (kr8.f31019F != kr8.f31020G.get()) {
            kr8.mo45237A().mo29670l().mo48771c("Not all components initialized", Integer.valueOf(kr8.f31019F), Integer.valueOf(kr8.f31020G.get()));
        }
        kr8.f31046y = true;
    }

    /* renamed from: t */
    public static final void m47472t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    public static final void m47473u(tt8 tt8) {
        if (tt8 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    public static final void m47474v(qo8 qo8) {
        if (qo8 == null) {
            throw new IllegalStateException("Component not created");
        } else if (!qo8.mo47218f()) {
            String valueOf = String.valueOf(qo8.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: w */
    public static final void m47475w(vt8 vt8) {
        if (vt8 == null) {
            throw new IllegalStateException("Component not created");
        } else if (!vt8.mo48800h()) {
            String valueOf = String.valueOf(vt8.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    @Pure
    /* renamed from: A */
    public final bn8 mo45237A() {
        m47475w(this.f31030i);
        return this.f31030i;
    }

    /* renamed from: B */
    public final bn8 mo45238B() {
        bn8 bn8 = this.f31030i;
        if (bn8 == null || !bn8.mo48800h()) {
            return null;
        }
        return this.f31030i;
    }

    @Pure
    /* renamed from: C */
    public final v39 mo45239C() {
        m47474v(this.f31032k);
        return this.f31032k;
    }

    @SideEffectFree
    /* renamed from: D */
    public final wp8 mo45240D() {
        return this.f31045x;
    }

    @SideEffectFree
    /* renamed from: E */
    public final cr8 mo45241E() {
        return this.f31031j;
    }

    @Pure
    /* renamed from: F */
    public final sx8 mo45242F() {
        m47474v(this.f31037p);
        return this.f31037p;
    }

    @Pure
    /* renamed from: G */
    public final g69 mo45243G() {
        m47473u(this.f31033l);
        return this.f31033l;
    }

    @Pure
    /* renamed from: H */
    public final mm8 mo45244H() {
        m47473u(this.f31034m);
        return this.f31034m;
    }

    @Pure
    /* renamed from: I */
    public final jm8 mo45245I() {
        m47474v(this.f31041t);
        return this.f31041t;
    }

    @Pure
    /* renamed from: J */
    public final oy8 mo45246J() {
        m47475w(this.f31039r);
        return this.f31039r;
    }

    @Pure
    /* renamed from: K */
    public final boolean mo45247K() {
        return TextUtils.isEmpty(this.f31023b);
    }

    @Pure
    /* renamed from: L */
    public final String mo45248L() {
        return this.f31023b;
    }

    @Pure
    /* renamed from: M */
    public final String mo45249M() {
        return this.f31024c;
    }

    @Pure
    /* renamed from: N */
    public final String mo45250N() {
        return this.f31025d;
    }

    @Pure
    /* renamed from: O */
    public final boolean mo45251O() {
        return this.f31026e;
    }

    @Pure
    /* renamed from: P */
    public final String mo45252P() {
        return this.f31040s;
    }

    @Pure
    /* renamed from: Q */
    public final jz8 mo45253Q() {
        m47474v(this.f31036o);
        return this.f31036o;
    }

    @Pure
    /* renamed from: R */
    public final g29 mo45254R() {
        m47474v(this.f31042u);
        return this.f31042u;
    }

    @Pure
    /* renamed from: S */
    public final g88 mo45255S() {
        m47475w(this.f31043v);
        return this.f31043v;
    }

    @Pure
    /* renamed from: a */
    public final bh0 mo45256a() {
        return this.f31035n;
    }

    @Pure
    /* renamed from: b */
    public final rk9 mo45257b() {
        return this.f31027f;
    }

    @Pure
    /* renamed from: c */
    public final dm8 mo45258c() {
        m47474v(this.f31044w);
        return this.f31044w;
    }

    @Pure
    /* renamed from: d */
    public final oh8 mo45259d() {
        oh8 oh8 = this.f31038q;
        if (oh8 != null) {
            return oh8;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: f */
    public final void mo45260f(boolean z) {
        this.f31015B = Boolean.valueOf(z);
    }

    /* renamed from: g */
    public final boolean mo45261g() {
        if (this.f31015B == null || !this.f31015B.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo45262h() {
        if (mo45263i() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final int mo45263i() {
        mo45272s().mo29006e();
        if (this.f31028g.mo46001z()) {
            return 1;
        }
        Boolean bool = this.f31017D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo45272s().mo29006e();
        if (!this.f31018E) {
            return 8;
        }
        Boolean o = mo45275z().mo45481o();
        if (o == null) {
            n68 n68 = this.f31028g;
            rk9 rk9 = n68.f34342a.f31027f;
            Boolean x = n68.mo45999x("firebase_analytics_collection_enabled");
            if (x == null) {
                Boolean bool2 = this.f31016C;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (!this.f31028g.mo45997v((String) null, rl8.f33478U) || this.f31015B == null || this.f31015B.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (x.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (o.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* renamed from: j */
    public final void mo45264j(boolean z) {
        mo45272s().mo29006e();
        this.f31018E = z;
    }

    /* renamed from: k */
    public final boolean mo45265k() {
        mo45272s().mo29006e();
        return this.f31018E;
    }

    /* renamed from: l */
    public final void mo45266l() {
        this.f31019F++;
    }

    /* renamed from: m */
    public final void mo45267m() {
        this.f31020G.incrementAndGet();
    }

    /* renamed from: n */
    public final boolean mo45268n() {
        boolean z;
        if (this.f31046y) {
            mo45272s().mo29006e();
            Boolean bool = this.f31047z;
            if (bool == null || this.f31014A == 0 || (!bool.booleanValue() && Math.abs(this.f31035n.mo29581b() - this.f31014A) > 1000)) {
                this.f31014A = this.f31035n.mo29581b();
                boolean z2 = true;
                if (!mo45243G().mo42791E("android.permission.INTERNET") || !mo45243G().mo42791E("android.permission.ACCESS_NETWORK_STATE") || (!tn7.m52384a(this.f31022a).mo45812f() && !this.f31028g.mo45983H() && (!g69.m44581a0(this.f31022a) || !g69.m44576D(this.f31022a, false)))) {
                    z = false;
                } else {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.f31047z = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo45243G().mo42815l(mo45258c().mo41980n(), mo45258c().mo41981o(), mo45258c().mo41982p()) && TextUtils.isEmpty(mo45258c().mo41981o())) {
                        z2 = false;
                    }
                    this.f31047z = Boolean.valueOf(z2);
                }
            }
            return this.f31047z.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    /* renamed from: o */
    public final void mo45269o() {
        mo45272s().mo29006e();
        m47475w(mo45246J());
        String m = mo45258c().mo41979m();
        Pair<String, Boolean> l = mo45275z().mo45478l(m);
        if (!this.f31028g.mo45977B() || ((Boolean) l.second).booleanValue() || TextUtils.isEmpty((CharSequence) l.first)) {
            mo45237A().mo29677u().mo48769a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        oy8 J = mo45246J();
        J.mo48801i();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f34342a.f31022a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo45237A().mo29673o().mo48769a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        g69 G = mo45243G();
        mo45258c().f34342a.f31028g.mo45990m();
        URL Z = G.mo42808Z(42004, m, (String) l.first, mo45275z().f31370s.mo43882a() - 1);
        if (Z != null) {
            oy8 J2 = mo45246J();
            fr8 fr8 = new fr8(this);
            J2.mo29006e();
            J2.mo48801i();
            cu4.m43221k(Z);
            cu4.m43221k(fr8);
            J2.f34342a.mo45272s().mo41643t(new zx8(J2, m, Z, (byte[]) null, (Map) null, fr8, (byte[]) null));
        }
    }

    /* renamed from: p */
    public final /* synthetic */ void mo45270p(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            mo45237A().mo29673o().mo48771c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            mo45275z().f31369r.mo41989b(true);
            if (bArr == null || bArr.length == 0) {
                mo45237A().mo29677u().mo48769a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", Utils.DOUBLE_EPSILON);
                if (TextUtils.isEmpty(optString)) {
                    mo45237A().mo29677u().mo48769a("Deferred Deep Link is empty.");
                    return;
                }
                g69 G = mo45243G();
                kr8 kr8 = G.f34342a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = G.f34342a.f31022a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f31037p.mo47916X("auto", "_cmp", bundle);
                        g69 G2 = mo45243G();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = G2.f34342a.f31022a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    G2.f34342a.f31022a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                G2.f34342a.mo45237A().mo29670l().mo48770b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo45237A().mo29673o().mo48771c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                mo45237A().mo29670l().mo48770b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        mo45237A().mo29673o().mo48771c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    @Pure
    /* renamed from: q */
    public final Context mo45271q() {
        return this.f31022a;
    }

    @Pure
    /* renamed from: s */
    public final cr8 mo45272s() {
        m47475w(this.f31031j);
        return this.f31031j;
    }

    /* renamed from: x */
    public final void mo45273x(zzcl zzcl) {
        u68 u68;
        mo45272s().mo29006e();
        u68 r = mo45275z().mo45483r();
        lp8 z = mo45275z();
        kr8 kr8 = z.f34342a;
        z.mo29006e();
        int i = 100;
        int i2 = z.mo45479m().getInt("consent_source", 100);
        n68 n68 = this.f31028g;
        kr8 kr82 = n68.f34342a;
        Boolean x = n68.mo45999x("google_analytics_default_allow_ad_storage");
        n68 n682 = this.f31028g;
        kr8 kr83 = n682.f34342a;
        Boolean x2 = n682.mo45999x("google_analytics_default_allow_analytics_storage");
        if (!(x == null && x2 == null) && mo45275z().mo45482p(-10)) {
            u68 = new u68(x, x2);
            i = -10;
        } else {
            if (TextUtils.isEmpty(mo45258c().mo41980n()) || !(i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                id9.m45680a();
                if ((!this.f31028g.mo45997v((String) null, rl8.f33459E0) || TextUtils.isEmpty(mo45258c().mo41980n())) && zzcl != null && zzcl.f22627s != null && mo45275z().mo45482p(30)) {
                    u68 = u68.m52647b(zzcl.f22627s);
                    if (!u68.equals(u68.f34472c)) {
                        i = 30;
                    }
                }
            } else {
                mo45242F().mo47914V(u68.f34472c, -10, this.f31021H);
            }
            u68 = null;
        }
        if (u68 != null) {
            mo45242F().mo47914V(u68, i, this.f31021H);
            r = u68;
        }
        mo45242F().mo47915W(r);
        if (mo45275z().f31356e.mo43882a() == 0) {
            mo45237A().mo29678v().mo48770b("Persisting first open", Long.valueOf(this.f31021H));
            mo45275z().f31356e.mo43883b(this.f31021H);
        }
        mo45242F().f34054n.mo29613c();
        if (mo45268n()) {
            if (!TextUtils.isEmpty(mo45258c().mo41980n()) || !TextUtils.isEmpty(mo45258c().mo41981o())) {
                g69 G = mo45243G();
                String n = mo45258c().mo41980n();
                lp8 z2 = mo45275z();
                z2.mo29006e();
                String string = z2.mo45479m().getString("gmp_app_id", (String) null);
                String o = mo45258c().mo41981o();
                lp8 z3 = mo45275z();
                z3.mo29006e();
                if (G.mo42817m(n, string, o, z3.mo45479m().getString("admob_app_id", (String) null))) {
                    mo45237A().mo29676t().mo48769a("Rechecking which service to use due to a GMP App Id change");
                    lp8 z4 = mo45275z();
                    z4.mo29006e();
                    Boolean o2 = z4.mo45481o();
                    SharedPreferences.Editor edit = z4.mo45479m().edit();
                    edit.clear();
                    edit.apply();
                    if (o2 != null) {
                        z4.mo45480n(o2);
                    }
                    mo45245I().mo44514l();
                    this.f31042u.mo42735r();
                    this.f31042u.mo42731m();
                    mo45275z().f31356e.mo43883b(this.f31021H);
                    mo45275z().f31358g.mo43885b((String) null);
                }
                lp8 z5 = mo45275z();
                String n2 = mo45258c().mo41980n();
                z5.mo29006e();
                SharedPreferences.Editor edit2 = z5.mo45479m().edit();
                edit2.putString("gmp_app_id", n2);
                edit2.apply();
                lp8 z6 = mo45275z();
                String o3 = mo45258c().mo41981o();
                z6.mo29006e();
                SharedPreferences.Editor edit3 = z6.mo45479m().edit();
                edit3.putString("admob_app_id", o3);
                edit3.apply();
            }
            if (!mo45275z().mo45483r().mo48331h()) {
                mo45275z().f31358g.mo43885b((String) null);
            }
            mo45242F().mo47926o(mo45275z().f31358g.mo43884a());
            dd9.m43457a();
            if (this.f31028g.mo45997v((String) null, rl8.f33513o0)) {
                try {
                    mo45243G().f34342a.f31022a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(mo45275z().f31371t.mo43884a())) {
                        mo45237A().mo29673o().mo48769a("Remote config removed with active feature rollouts");
                        mo45275z().f31371t.mo43885b((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(mo45258c().mo41980n()) || !TextUtils.isEmpty(mo45258c().mo41981o())) {
                boolean h = mo45262h();
                if (!mo45275z().mo45485u() && !this.f31028g.mo46001z()) {
                    mo45275z().mo45484t(!h);
                }
                if (h) {
                    mo45242F().mo47929t();
                }
                mo45239C().f34828d.mo47625a();
                mo45254R().mo42726T(new AtomicReference());
                mo45254R().mo42730l(mo45275z().f31374w.mo42639a());
            }
        } else if (mo45262h()) {
            if (!mo45243G().mo42791E("android.permission.INTERNET")) {
                mo45237A().mo29670l().mo48769a("App is missing INTERNET permission");
            }
            if (!mo45243G().mo42791E("android.permission.ACCESS_NETWORK_STATE")) {
                mo45237A().mo29670l().mo48769a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!tn7.m52384a(this.f31022a).mo45812f() && !this.f31028g.mo45983H()) {
                if (!g69.m44581a0(this.f31022a)) {
                    mo45237A().mo29670l().mo48769a("AppMeasurementReceiver not registered/enabled");
                }
                if (!g69.m44576D(this.f31022a, false)) {
                    mo45237A().mo29670l().mo48769a("AppMeasurementService not registered/enabled");
                }
            }
            mo45237A().mo29670l().mo48769a("Uploading is not possible. App measurement disabled");
        }
        mo45275z().f31365n.mo41989b(true);
    }

    @Pure
    /* renamed from: y */
    public final n68 mo45274y() {
        return this.f31028g;
    }

    @Pure
    /* renamed from: z */
    public final lp8 mo45275z() {
        m47473u(this.f31029h);
        return this.f31029h;
    }
}
