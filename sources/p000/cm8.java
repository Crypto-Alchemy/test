package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* renamed from: cm8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class cm8 {

    /* renamed from: j */
    public static volatile cm8 f21807j;

    /* renamed from: a */
    public final String f21808a;

    /* renamed from: b */
    public final bh0 f21809b;

    /* renamed from: c */
    public final ExecutorService f21810c;

    /* renamed from: d */
    public final C3966co f21811d;

    /* renamed from: e */
    public final List<Pair<ju8, ik8>> f21812e;

    /* renamed from: f */
    public int f21813f;

    /* renamed from: g */
    public boolean f21814g;

    /* renamed from: h */
    public final String f21815h;

    /* renamed from: i */
    public volatile ef8 f21816i;

    public cm8(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m33093q(str2, str3)) {
            this.f21808a = "FA";
        } else {
            this.f21808a = str;
        }
        this.f21809b = e71.m43806c();
        this.f21810c = od8.m49271a().mo42874a(new fj8(this), 1);
        this.f21811d = new C3966co(this);
        this.f21812e = new ArrayList();
        try {
            if (ry8.m51436a(context, "google_app_id", sq8.m51887a(context)) != null && !m33092m()) {
                this.f21815h = null;
                this.f21814g = true;
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m33093q(str2, str3)) {
            this.f21815h = "fa";
        } else {
            this.f21815h = str2;
        }
        mo30047n(new ah8(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new zl8(this));
        }
    }

    /* renamed from: m */
    public static final boolean m33092m() {
        return true;
    }

    /* renamed from: q */
    public static final boolean m33093q(String str, String str2) {
        if (str2 == null || str == null || m33092m()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static cm8 m33094r(Context context, String str, String str2, String str3, Bundle bundle) {
        cu4.m43221k(context);
        if (f21807j == null) {
            synchronized (cm8.class) {
                if (f21807j == null) {
                    f21807j = new cm8(context, str, str2, str3, bundle);
                }
            }
        }
        return f21807j;
    }

    /* renamed from: A */
    public final List<Bundle> mo30034A(String str, String str2) {
        ud8 ud8 = new ud8();
        mo30047n(new lg8(this, str, str2, ud8));
        List<Bundle> list = (List) ud8.m52790s1(ud8.mo48388r1(5000), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: B */
    public final void mo30035B(Activity activity, String str, String str2) {
        mo30047n(new ng8(this, activity, str, str2));
    }

    /* renamed from: C */
    public final void mo30036C(String str) {
        mo30047n(new dh8(this, str));
    }

    /* renamed from: D */
    public final void mo30037D(String str) {
        mo30047n(new hh8(this, str));
    }

    /* renamed from: E */
    public final String mo30038E() {
        ud8 ud8 = new ud8();
        mo30047n(new fi8(this, ud8));
        return ud8.mo48387q1(500);
    }

    /* renamed from: F */
    public final String mo30039F() {
        ud8 ud8 = new ud8();
        mo30047n(new ji8(this, ud8));
        return ud8.mo48387q1(50);
    }

    /* renamed from: G */
    public final long mo30040G() {
        ud8 ud8 = new ud8();
        mo30047n(new ni8(this, ud8));
        Long l = (Long) ud8.m52790s1(ud8.mo48388r1(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f21809b.mo29580a()).nextLong();
        int i = this.f21813f + 1;
        this.f21813f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: H */
    public final String mo30041H() {
        ud8 ud8 = new ud8();
        mo30047n(new qi8(this, ud8));
        return ud8.mo48387q1(500);
    }

    /* renamed from: a */
    public final String mo30042a() {
        ud8 ud8 = new ud8();
        mo30047n(new ti8(this, ud8));
        return ud8.mo48387q1(500);
    }

    /* renamed from: b */
    public final Map<String, Object> mo30043b(String str, String str2, boolean z) {
        ud8 ud8 = new ud8();
        mo30047n(new wi8(this, str, str2, z, ud8));
        Bundle r1 = ud8.mo48388r1(5000);
        if (r1 == null || r1.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(r1.size());
        for (String next : r1.keySet()) {
            Object obj = r1.get(next);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public final void mo30044c(int i, String str, Object obj, Object obj2, Object obj3) {
        mo30047n(new zi8(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* renamed from: d */
    public final int mo30045d(String str) {
        ud8 ud8 = new ud8();
        mo30047n(new gj8(this, str, ud8));
        Integer num = (Integer) ud8.m52790s1(ud8.mo48388r1(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: e */
    public final void mo30046e(boolean z) {
        mo30047n(new nj8(this, z));
    }

    /* renamed from: n */
    public final void mo30047n(fk8 fk8) {
        this.f21810c.execute(fk8);
    }

    /* renamed from: o */
    public final void mo30048o(Exception exc, boolean z, boolean z2) {
        this.f21814g |= z;
        if (!z && z2) {
            mo30044c(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
    }

    /* renamed from: p */
    public final void mo30049p(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        mo30047n(new ak8(this, l, str, str2, bundle, z, z2));
    }

    /* renamed from: s */
    public final C3966co mo30050s() {
        return this.f21811d;
    }

    /* renamed from: t */
    public final ef8 mo30051t(Context context, boolean z) {
        try {
            return cf8.asInterface(DynamiteModule.m33818d(context, DynamiteModule.f22425g, ModuleDescriptor.MODULE_ID).mo30743c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            mo30048o(e, true, false);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4.f21816i == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f21816i.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        mo30047n(new p000.uj8(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        return;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30052u(p000.ju8 r5) {
        /*
            r4 = this;
            p000.cu4.m43221k(r5)
            java.util.List<android.util.Pair<ju8, ik8>> r0 = r4.f21812e
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List<android.util.Pair<ju8, ik8>> r2 = r4.f21812e     // Catch:{ all -> 0x0047 }
            int r2 = r2.size()     // Catch:{ all -> 0x0047 }
            if (r1 >= r2) goto L_0x0024
            java.util.List<android.util.Pair<ju8, ik8>> r2 = r4.f21812e     // Catch:{ all -> 0x0047 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0047 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0047 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0047 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x0021:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0024:
            ik8 r1 = new ik8     // Catch:{ all -> 0x0047 }
            r1.<init>(r5)     // Catch:{ all -> 0x0047 }
            java.util.List<android.util.Pair<ju8, ik8>> r2 = r4.f21812e     // Catch:{ all -> 0x0047 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0047 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0047 }
            r2.add(r3)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            ef8 r5 = r4.f21816i
            if (r5 == 0) goto L_0x003e
            ef8 r5 = r4.f21816i     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x003e }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x003e }
            return
        L_0x003e:
            uj8 r5 = new uj8
            r5.<init>(r4, r1)
            r4.mo30047n(r5)
            return
        L_0x0047:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cm8.mo30052u(ju8):void");
    }

    /* renamed from: v */
    public final void mo30053v(String str, Bundle bundle) {
        mo30049p((String) null, str, bundle, false, true, (Long) null);
    }

    /* renamed from: w */
    public final void mo30054w(String str, String str2, Bundle bundle) {
        mo30049p(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: x */
    public final void mo30055x(String str, String str2, Object obj, boolean z) {
        mo30047n(new bk8(this, str, str2, obj, z));
    }

    /* renamed from: y */
    public final void mo30056y(Bundle bundle) {
        mo30047n(new fg8(this, bundle));
    }

    /* renamed from: z */
    public final void mo30057z(String str, String str2, Bundle bundle) {
        mo30047n(new jg8(this, str, str2, bundle));
    }
}
