package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: n68 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class n68 extends tt8 {

    /* renamed from: b */
    public Boolean f31974b;

    /* renamed from: c */
    public f68 f31975c = y58.f35772a;

    /* renamed from: d */
    public Boolean f31976d;

    public n68(kr8 kr8) {
        super(kr8);
    }

    /* renamed from: I */
    public static final long m48616I() {
        return rl8.f33492e.mo48412b(null).longValue();
    }

    /* renamed from: f */
    public static final long m48617f() {
        return rl8.f33458E.mo48412b(null).longValue();
    }

    /* renamed from: B */
    public final boolean mo45977B() {
        Boolean x = mo45999x("google_analytics_adid_collection_enabled");
        if (x == null || x.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final boolean mo45978C() {
        Boolean x;
        jf9.m46498a();
        if (mo45997v((String) null, rl8.f33521s0) && (x = mo45999x("google_analytics_automatic_screen_reporting_enabled")) != null && !x.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final String mo45979D() {
        return mo45984g("debug.firebase.analytics.app", "");
    }

    /* renamed from: E */
    public final String mo45980E() {
        return mo45984g("debug.deferred.deeplink", "");
    }

    /* renamed from: F */
    public final boolean mo45981F(String str) {
        return "1".equals(this.f31975c.mo42530c(str, "gaia_collection_enabled"));
    }

    /* renamed from: G */
    public final boolean mo45982G(String str) {
        return "1".equals(this.f31975c.mo42530c(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: H */
    public final boolean mo45983H() {
        if (this.f31974b == null) {
            Boolean x = mo45999x("app_measurement_lite");
            this.f31974b = x;
            if (x == null) {
                this.f31974b = Boolean.FALSE;
            }
        }
        if (this.f31974b.booleanValue() || !this.f34342a.mo45251O()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final String mo45984g(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            cu4.m43221k(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.f34342a.mo45237A().mo29670l().mo48770b("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            this.f34342a.mo45237A().mo29670l().mo48770b("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            this.f34342a.mo45237A().mo29670l().mo48770b("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.f34342a.mo45237A().mo29670l().mo48770b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: h */
    public final void mo45985h(f68 f68) {
        this.f31975c = f68;
    }

    /* renamed from: i */
    public final String mo45986i() {
        this.f34342a.mo45257b();
        return "FA";
    }

    /* renamed from: j */
    public final int mo45987j() {
        g69 G = this.f34342a.mo45243G();
        Boolean n = G.f34342a.mo45254R().mo42732n();
        if (G.mo42797N() >= 201500) {
            return 100;
        }
        if (n == null || n.booleanValue()) {
            return 25;
        }
        return 100;
    }

    /* renamed from: k */
    public final int mo45988k(String str) {
        return mo45995t(str, rl8.f33467J, 25, 100);
    }

    /* renamed from: l */
    public final int mo45989l(String str) {
        return mo45995t(str, rl8.f33466I, 500, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
    }

    /* renamed from: m */
    public final long mo45990m() {
        this.f34342a.mo45257b();
        return 42004;
    }

    @EnsuresNonNull({"this.isMainProcess"})
    /* renamed from: n */
    public final boolean mo45991n() {
        if (this.f31976d == null) {
            synchronized (this) {
                if (this.f31976d == null) {
                    ApplicationInfo applicationInfo = this.f34342a.mo45271q().getApplicationInfo();
                    String a = rv4.m51347a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.f31976d = Boolean.valueOf(z);
                    }
                    if (this.f31976d == null) {
                        this.f31976d = Boolean.TRUE;
                        this.f34342a.mo45237A().mo29670l().mo48769a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f31976d.booleanValue();
    }

    /* renamed from: o */
    public final String mo45992o(String str, uk8<String> uk8) {
        if (str == null) {
            return uk8.mo48412b(null);
        }
        return uk8.mo48412b(this.f31975c.mo42530c(str, uk8.mo48411a()));
    }

    /* renamed from: p */
    public final long mo45993p(String str, uk8<Long> uk8) {
        if (str == null) {
            return uk8.mo48412b(null).longValue();
        }
        String c = this.f31975c.mo42530c(str, uk8.mo48411a());
        if (TextUtils.isEmpty(c)) {
            return uk8.mo48412b(null).longValue();
        }
        try {
            return uk8.mo48412b(Long.valueOf(Long.parseLong(c))).longValue();
        } catch (NumberFormatException unused) {
            return uk8.mo48412b(null).longValue();
        }
    }

    /* renamed from: r */
    public final int mo45994r(String str, uk8<Integer> uk8) {
        if (str == null) {
            return uk8.mo48412b(null).intValue();
        }
        String c = this.f31975c.mo42530c(str, uk8.mo48411a());
        if (TextUtils.isEmpty(c)) {
            return uk8.mo48412b(null).intValue();
        }
        try {
            return uk8.mo48412b(Integer.valueOf(Integer.parseInt(c))).intValue();
        } catch (NumberFormatException unused) {
            return uk8.mo48412b(null).intValue();
        }
    }

    /* renamed from: t */
    public final int mo45995t(String str, uk8<Integer> uk8, int i, int i2) {
        return Math.max(Math.min(mo45994r(str, uk8), i2), i);
    }

    /* renamed from: u */
    public final double mo45996u(String str, uk8<Double> uk8) {
        if (str == null) {
            return uk8.mo48412b(null).doubleValue();
        }
        String c = this.f31975c.mo42530c(str, uk8.mo48411a());
        if (TextUtils.isEmpty(c)) {
            return uk8.mo48412b(null).doubleValue();
        }
        try {
            return uk8.mo48412b(Double.valueOf(Double.parseDouble(c))).doubleValue();
        } catch (NumberFormatException unused) {
            return uk8.mo48412b(null).doubleValue();
        }
    }

    /* renamed from: v */
    public final boolean mo45997v(String str, uk8<Boolean> uk8) {
        if (str == null) {
            return uk8.mo48412b(null).booleanValue();
        }
        String c = this.f31975c.mo42530c(str, uk8.mo48411a());
        if (TextUtils.isEmpty(c)) {
            return uk8.mo48412b(null).booleanValue();
        }
        return uk8.mo48412b(Boolean.valueOf(Boolean.parseBoolean(c))).booleanValue();
    }

    /* renamed from: w */
    public final Bundle mo45998w() {
        try {
            if (this.f34342a.mo45271q().getPackageManager() == null) {
                this.f34342a.mo45237A().mo29670l().mo48769a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = tn7.m52384a(this.f34342a.mo45271q()).mo45809c(this.f34342a.mo45271q().getPackageName(), 128);
            if (c != null) {
                return c.metaData;
            }
            this.f34342a.mo45237A().mo29670l().mo48769a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f34342a.mo45237A().mo29670l().mo48770b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: x */
    public final Boolean mo45999x(String str) {
        cu4.m43217g(str);
        Bundle w = mo45998w();
        if (w == null) {
            this.f34342a.mo45237A().mo29670l().mo48769a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!w.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(w.getBoolean(str));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo46000y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            p000.cu4.m43217g(r4)
            android.os.Bundle r0 = r3.mo45998w()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            kr8 r4 = r3.f34342a
            bn8 r4 = r4.mo45237A()
            vm8 r4 = r4.mo29670l()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo48769a(r0)
        L_0x001b:
            r4 = r1
            goto L_0x002c
        L_0x001d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x002c:
            if (r4 == 0) goto L_0x0058
            kr8 r0 = r3.f34342a     // Catch:{ NotFoundException -> 0x0048 }
            android.content.Context r0 = r0.mo45271q()     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0048 }
            if (r4 != 0) goto L_0x0043
            return r1
        L_0x0043:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0048 }
            return r4
        L_0x0048:
            r4 = move-exception
            kr8 r0 = r3.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29670l()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo48770b(r2, r4)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.n68.mo46000y(java.lang.String):java.util.List");
    }

    /* renamed from: z */
    public final boolean mo46001z() {
        this.f34342a.mo45257b();
        Boolean x = mo45999x("firebase_analytics_collection_deactivated");
        if (x == null || !x.booleanValue()) {
            return false;
        }
        return true;
    }
}
