package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g29 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class g29 extends qo8 {

    /* renamed from: c */
    public final e29 f29059c;

    /* renamed from: d */
    public am8 f29060d;

    /* renamed from: e */
    public volatile Boolean f29061e;

    /* renamed from: f */
    public final b88 f29062f;

    /* renamed from: g */
    public final j49 f29063g;

    /* renamed from: h */
    public final List<Runnable> f29064h = new ArrayList();

    /* renamed from: i */
    public final b88 f29065i;

    public g29(kr8 kr8) {
        super(kr8);
        this.f29063g = new j49(kr8.mo45256a());
        this.f29059c = new e29(this);
        this.f29062f = new j09(this, kr8);
        this.f29065i = new o09(this, kr8);
    }

    /* renamed from: w */
    public static /* synthetic */ void m44472w(g29 g29, ComponentName componentName) {
        g29.mo29006e();
        if (g29.f29060d != null) {
            g29.f29060d = null;
            g29.f34342a.mo45237A().mo29678v().mo48770b("Disconnected from device MeasurementService", componentName);
            g29.mo29006e();
            g29.mo42731m();
        }
    }

    /* renamed from: C */
    public final boolean mo42709C() {
        this.f34342a.mo45257b();
        return true;
    }

    /* renamed from: D */
    public final void mo42710D() {
        mo29006e();
        this.f29063g.mo44051a();
        b88 b88 = this.f29062f;
        this.f34342a.mo45274y();
        b88.mo29494b(rl8.f33468K.mo48412b(null).longValue());
    }

    /* renamed from: E */
    public final void mo42711E(Runnable runnable) throws IllegalStateException {
        mo29006e();
        if (mo42714H()) {
            runnable.run();
            return;
        }
        int size = this.f29064h.size();
        this.f34342a.mo45274y();
        if (((long) size) >= 1000) {
            this.f34342a.mo45237A().mo29670l().mo48769a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f29064h.add(runnable);
        this.f29065i.mo29494b(60000);
        mo42731m();
    }

    /* renamed from: F */
    public final void mo42712F() {
        mo29006e();
        this.f34342a.mo45237A().mo29678v().mo48770b("Processing queued up service tasks", Integer.valueOf(this.f29064h.size()));
        for (Runnable run : this.f29064h) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.f34342a.mo45237A().mo29670l().mo48770b("Task exception while flushing queue", e);
            }
        }
        this.f29064h.clear();
        this.f29065i.mo29496d();
    }

    /* renamed from: G */
    public final zzp mo42713G(boolean z) {
        Pair<String, Long> b;
        this.f34342a.mo45257b();
        dm8 c = this.f34342a.mo45258c();
        String str = null;
        if (z) {
            bn8 A = this.f34342a.mo45237A();
            if (!(A.f34342a.mo45275z().f31355d == null || (b = A.f34342a.mo45275z().f31355d.mo45475b()) == null || b == lp8.f31353x)) {
                String valueOf = String.valueOf(b.second);
                String str2 = (String) b.first;
                StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str2);
                str = sb.toString();
            }
        }
        return c.mo41978l(str);
    }

    /* renamed from: H */
    public final boolean mo42714H() {
        mo29006e();
        mo47219g();
        if (this.f29060d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final void mo42715I() {
        mo29006e();
        mo47219g();
        mo42711E(new q09(this, mo42713G(true)));
    }

    /* renamed from: J */
    public final void mo42716J(boolean z) {
        mo29006e();
        mo47219g();
        if (z) {
            mo42709C();
            this.f34342a.mo45245I().mo44514l();
        }
        if (mo42737u()) {
            mo42711E(new s09(this, mo42713G(false)));
        }
    }

    /* renamed from: K */
    public final void mo42717K(am8 am8, AbstractSafeParcelable abstractSafeParcelable, zzp zzp) {
        int i;
        mo29006e();
        mo47219g();
        mo42709C();
        this.f34342a.mo45274y();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> p = this.f34342a.mo45245I().mo44518p(100);
            if (p != null) {
                arrayList.addAll(p);
                i = p.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzas) {
                    try {
                        am8.mo29017c0((zzas) abstractSafeParcelable2, zzp);
                    } catch (RemoteException e) {
                        this.f34342a.mo45237A().mo29670l().mo48770b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkq) {
                    try {
                        am8.mo29015T((zzkq) abstractSafeParcelable2, zzp);
                    } catch (RemoteException e2) {
                        this.f34342a.mo45237A().mo29670l().mo48770b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzaa) {
                    try {
                        am8.mo29023v((zzaa) abstractSafeParcelable2, zzp);
                    } catch (RemoteException e3) {
                        this.f34342a.mo45237A().mo29670l().mo48770b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.f34342a.mo45237A().mo29670l().mo48769a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* renamed from: L */
    public final void mo42718L(zzas zzas, String str) {
        cu4.m43221k(zzas);
        mo29006e();
        mo47219g();
        mo42709C();
        mo42711E(new u09(this, true, mo42713G(true), this.f34342a.mo45245I().mo44515m(zzas), zzas, str));
    }

    /* renamed from: M */
    public final void mo42719M(zzaa zzaa) {
        cu4.m43221k(zzaa);
        mo29006e();
        mo47219g();
        this.f34342a.mo45257b();
        mo42711E(new i19(this, true, mo42713G(true), this.f34342a.mo45245I().mo44517o(zzaa), new zzaa(zzaa), zzaa));
    }

    /* renamed from: N */
    public final void mo42720N(AtomicReference<List<zzaa>> atomicReference, String str, String str2, String str3) {
        mo29006e();
        mo47219g();
        mo42711E(new k19(this, atomicReference, (String) null, str2, str3, mo42713G(false)));
    }

    /* renamed from: O */
    public final void mo42721O(lf8 lf8, String str, String str2) {
        mo29006e();
        mo47219g();
        mo42711E(new m19(this, str, str2, mo42713G(false), lf8));
    }

    /* renamed from: P */
    public final void mo42722P(AtomicReference<List<zzkq>> atomicReference, String str, String str2, String str3, boolean z) {
        mo29006e();
        mo47219g();
        mo42711E(new o19(this, atomicReference, (String) null, str2, str3, mo42713G(false), z));
    }

    /* renamed from: Q */
    public final void mo42723Q(lf8 lf8, String str, String str2, boolean z) {
        mo29006e();
        mo47219g();
        mo42711E(new mz8(this, str, str2, mo42713G(false), z, lf8));
    }

    /* renamed from: R */
    public final void mo42724R(zzkq zzkq) {
        mo29006e();
        mo47219g();
        mo42709C();
        mo42711E(new pz8(this, mo42713G(true), this.f34342a.mo45245I().mo44516n(zzkq), zzkq));
    }

    /* renamed from: S */
    public final void mo42725S() {
        mo29006e();
        mo47219g();
        zzp G = mo42713G(false);
        mo42709C();
        this.f34342a.mo45245I().mo44514l();
        mo42711E(new tz8(this, G));
    }

    /* renamed from: T */
    public final void mo42726T(AtomicReference<String> atomicReference) {
        mo29006e();
        mo47219g();
        mo42711E(new uz8(this, atomicReference, mo42713G(false)));
    }

    /* renamed from: U */
    public final void mo42727U(lf8 lf8) {
        mo29006e();
        mo47219g();
        mo42711E(new xz8(this, mo42713G(false), lf8));
    }

    /* renamed from: V */
    public final void mo42728V() {
        mo29006e();
        mo47219g();
        zzp G = mo42713G(true);
        this.f34342a.mo45245I().mo44519r();
        mo42711E(new a09(this, G));
    }

    /* renamed from: W */
    public final void mo42729W(ty8 ty8) {
        mo29006e();
        mo47219g();
        mo42711E(new d09(this, ty8));
    }

    /* renamed from: j */
    public final boolean mo41976j() {
        return false;
    }

    /* renamed from: l */
    public final void mo42730l(Bundle bundle) {
        mo29006e();
        mo47219g();
        mo42711E(new g09(this, mo42713G(false), bundle));
    }

    /* renamed from: m */
    public final void mo42731m() {
        mo29006e();
        mo47219g();
        if (!mo42714H()) {
            if (mo42733o()) {
                this.f29059c.mo42123c();
            } else if (!this.f34342a.mo45274y().mo45983H()) {
                this.f34342a.mo45257b();
                List<ResolveInfo> queryIntentServices = this.f34342a.mo45271q().getPackageManager().queryIntentServices(new Intent().setClassName(this.f34342a.mo45271q(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    this.f34342a.mo45237A().mo29670l().mo48769a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context q = this.f34342a.mo45271q();
                this.f34342a.mo45257b();
                intent.setComponent(new ComponentName(q, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f29059c.mo42121a(intent);
            }
        }
    }

    /* renamed from: n */
    public final Boolean mo42732n() {
        return this.f29061e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012b  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42733o() {
        /*
            r7 = this;
            r7.mo29006e()
            r7.mo47219g()
            java.lang.Boolean r0 = r7.f29061e
            if (r0 != 0) goto L_0x014b
            r7.mo29006e()
            r7.mo47219g()
            kr8 r0 = r7.f34342a
            lp8 r0 = r0.mo45275z()
            r0.mo29006e()
            android.content.SharedPreferences r1 = r0.mo45479m()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo45479m()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x0145
        L_0x003f:
            kr8 r4 = r7.f34342a
            r4.mo45257b()
            kr8 r4 = r7.f34342a
            dm8 r4 = r4.mo45258c()
            int r4 = r4.mo41984t()
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = r1
            goto L_0x010d
        L_0x0053:
            kr8 r4 = r7.f34342a
            bn8 r4 = r4.mo45237A()
            vm8 r4 = r4.mo29678v()
            java.lang.String r5 = "Checking service availability"
            r4.mo48769a(r5)
            kr8 r4 = r7.f34342a
            g69 r4 = r4.mo45243G()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.mo42798O(r5)
            if (r4 == 0) goto L_0x00fc
            if (r4 == r1) goto L_0x00ec
            r5 = 2
            if (r4 == r5) goto L_0x00c6
            r0 = 3
            if (r4 == r0) goto L_0x00b5
            r0 = 9
            if (r4 == r0) goto L_0x00a5
            r0 = 18
            if (r4 == r0) goto L_0x0095
            kr8 r0 = r7.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29673o()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.mo48770b(r4, r1)
            goto L_0x00c4
        L_0x0095:
            kr8 r0 = r7.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29673o()
            java.lang.String r3 = "Service updating"
            r0.mo48769a(r3)
            goto L_0x0050
        L_0x00a5:
            kr8 r0 = r7.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29673o()
            java.lang.String r1 = "Service invalid"
            r0.mo48769a(r1)
            goto L_0x00c4
        L_0x00b5:
            kr8 r0 = r7.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29673o()
            java.lang.String r1 = "Service disabled"
            r0.mo48769a(r1)
        L_0x00c4:
            r1 = r3
            goto L_0x010d
        L_0x00c6:
            kr8 r4 = r7.f34342a
            bn8 r4 = r4.mo45237A()
            vm8 r4 = r4.mo29677u()
            java.lang.String r5 = "Service container out of date"
            r4.mo48769a(r5)
            kr8 r4 = r7.f34342a
            g69 r4 = r4.mo45243G()
            int r4 = r4.mo42797N()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00e4
            goto L_0x010d
        L_0x00e4:
            if (r0 != 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r1 = r3
        L_0x00e8:
            r6 = r3
            r3 = r1
            r1 = r6
            goto L_0x010d
        L_0x00ec:
            kr8 r0 = r7.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29678v()
            java.lang.String r4 = "Service missing"
            r0.mo48769a(r4)
            goto L_0x010d
        L_0x00fc:
            kr8 r0 = r7.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29678v()
            java.lang.String r3 = "Service available"
            r0.mo48769a(r3)
            goto L_0x0050
        L_0x010d:
            if (r3 != 0) goto L_0x012b
            kr8 r0 = r7.f34342a
            n68 r0 = r0.mo45274y()
            boolean r0 = r0.mo45983H()
            if (r0 == 0) goto L_0x012b
            kr8 r0 = r7.f34342a
            bn8 r0 = r0.mo45237A()
            vm8 r0 = r0.mo29670l()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo48769a(r1)
            goto L_0x0144
        L_0x012b:
            if (r1 == 0) goto L_0x0144
            kr8 r0 = r7.f34342a
            lp8 r0 = r0.mo45275z()
            r0.mo29006e()
            android.content.SharedPreferences r0 = r0.mo45479m()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0144:
            r1 = r3
        L_0x0145:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.f29061e = r0
        L_0x014b:
            java.lang.Boolean r0 = r7.f29061e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g29.mo42733o():boolean");
    }

    /* renamed from: p */
    public final void mo42734p(am8 am8) {
        mo29006e();
        cu4.m43221k(am8);
        this.f29060d = am8;
        mo42710D();
        mo42712F();
    }

    /* renamed from: r */
    public final void mo42735r() {
        mo29006e();
        mo47219g();
        this.f29059c.mo42122b();
        try {
            rp0.m51209b().mo47467c(this.f34342a.mo45271q(), this.f29059c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f29060d = null;
    }

    /* renamed from: t */
    public final void mo42736t(lf8 lf8, zzas zzas, String str) {
        mo29006e();
        mo47219g();
        if (this.f34342a.mo45243G().mo42798O(mi2.f31711a) != 0) {
            this.f34342a.mo45237A().mo29673o().mo48769a("Not bundling data. Service unavailable or out of date");
            this.f34342a.mo45243G().mo42804U(lf8, new byte[0]);
            return;
        }
        mo42711E(new l09(this, zzas, str, lf8));
    }

    /* renamed from: u */
    public final boolean mo42737u() {
        mo29006e();
        mo47219g();
        if (!mo42733o() || this.f34342a.mo45243G().mo42797N() >= rl8.f33529w0.mo48412b(null).intValue()) {
            return true;
        }
        return false;
    }
}
