package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: rt8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class rt8 extends xl8 {

    /* renamed from: a */
    public final s59 f33579a;

    /* renamed from: b */
    public Boolean f33580b;

    /* renamed from: c */
    public String f33581c = null;

    public rt8(s59 s59, String str) {
        cu4.m43221k(s59);
        this.f33579a = s59;
    }

    /* renamed from: A */
    public final List<zzkq> mo29008A(String str, String str2, boolean z, zzp zzp) {
        mo47487q1(zzp, false);
        String str3 = zzp.f23098a;
        cu4.m43221k(str3);
        try {
            List<a69> list = (List) this.f33579a.mo45272s().mo41638m(new wr8(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (a69 a69 : list) {
                if (z || !g69.m44577F(a69.f20823c)) {
                    arrayList.add(new zzkq(a69));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f33579a.mo45237A().mo29670l().mo48771c("Failed to query user properties. appId", bn8.m32664w(zzp.f23098a), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: B */
    public final List<zzaa> mo29009B(String str, String str2, String str3) {
        mo47488r1(str, true);
        try {
            return (List) this.f33579a.mo45272s().mo41638m(new vs8(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f33579a.mo45237A().mo29670l().mo48770b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: D0 */
    public final void mo29010D0(zzp zzp) {
        cu4.m43217g(zzp.f23098a);
        mo47488r1(zzp.f23098a, false);
        mo47491u1(new xs8(this, zzp));
    }

    /* renamed from: F */
    public final void mo29011F(zzaa zzaa) {
        cu4.m43221k(zzaa);
        cu4.m43221k(zzaa.f23066e);
        cu4.m43217g(zzaa.f23064a);
        mo47488r1(zzaa.f23064a, true);
        mo47491u1(new sr8(this, new zzaa(zzaa)));
    }

    /* renamed from: F0 */
    public final void mo29012F0(Bundle bundle, zzp zzp) {
        mo47487q1(zzp, false);
        String str = zzp.f23098a;
        cu4.m43221k(str);
        mo47491u1(new mr8(this, str, bundle));
    }

    /* renamed from: G0 */
    public final void mo29013G0(zzas zzas, String str, String str2) {
        cu4.m43221k(zzas);
        cu4.m43217g(str);
        mo47488r1(str, true);
        mo47491u1(new ft8(this, zzas, str));
    }

    /* renamed from: H0 */
    public final byte[] mo29014H0(zzas zzas, String str) {
        cu4.m43217g(str);
        cu4.m43221k(zzas);
        mo47488r1(str, true);
        this.f33579a.mo45237A().mo29677u().mo48770b("Log and bundle. event", this.f33579a.mo47657b0().mo45821m(zzas.f23074a));
        long nanoTime = this.f33579a.mo45256a().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f33579a.mo45272s().mo41639n(new ht8(this, zzas, str)).get();
            if (bArr == null) {
                this.f33579a.mo45237A().mo29670l().mo48770b("Log and bundle returned null. appId", bn8.m32664w(str));
                bArr = new byte[0];
            }
            this.f33579a.mo45237A().mo29677u().mo48772d("Log and bundle processed. event, size, time_ms", this.f33579a.mo47657b0().mo45821m(zzas.f23074a), Integer.valueOf(bArr.length), Long.valueOf((this.f33579a.mo45256a().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f33579a.mo45237A().mo29670l().mo48772d("Failed to log and bundle. appId, event, error", bn8.m32664w(str), this.f33579a.mo47657b0().mo45821m(zzas.f23074a), e);
            return null;
        }
    }

    /* renamed from: T */
    public final void mo29015T(zzkq zzkq, zzp zzp) {
        cu4.m43221k(zzkq);
        mo47487q1(zzp, false);
        mo47491u1(new jt8(this, zzkq, zzp));
    }

    /* renamed from: V0 */
    public final void mo29016V0(zzp zzp) {
        mo47487q1(zzp, false);
        mo47491u1(new zs8(this, zzp));
    }

    /* renamed from: c0 */
    public final void mo29017c0(zzas zzas, zzp zzp) {
        cu4.m43221k(zzas);
        mo47487q1(zzp, false);
        mo47491u1(new dt8(this, zzas, zzp));
    }

    /* renamed from: d */
    public final List<zzaa> mo29018d(String str, String str2, zzp zzp) {
        mo47487q1(zzp, false);
        String str3 = zzp.f23098a;
        cu4.m43221k(str3);
        try {
            return (List) this.f33579a.mo45272s().mo41638m(new ss8(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f33579a.mo45237A().mo29670l().mo48770b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: f0 */
    public final List<zzkq> mo29019f0(String str, String str2, String str3, boolean z) {
        mo47488r1(str, true);
        try {
            List<a69> list = (List) this.f33579a.mo45272s().mo41638m(new zr8(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (a69 a69 : list) {
                if (z || !g69.m44577F(a69.f20823c)) {
                    arrayList.add(new zzkq(a69));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f33579a.mo45237A().mo29670l().mo48771c("Failed to get user properties as. appId", bn8.m32664w(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: g1 */
    public final void mo29020g1(zzp zzp) {
        mo47487q1(zzp, false);
        mo47491u1(new nt8(this, zzp));
    }

    /* renamed from: i */
    public final String mo29021i(zzp zzp) {
        mo47487q1(zzp, false);
        return this.f33579a.mo47687y(zzp);
    }

    /* renamed from: l0 */
    public final void mo29022l0(zzp zzp) {
        cu4.m43217g(zzp.f23098a);
        cu4.m43221k(zzp.f23097Z);
        bt8 bt8 = new bt8(this, zzp);
        cu4.m43221k(bt8);
        if (this.f33579a.mo45272s().mo41637l()) {
            bt8.run();
        } else {
            this.f33579a.mo45272s().mo41642r(bt8);
        }
    }

    /* renamed from: q1 */
    public final void mo47487q1(zzp zzp, boolean z) {
        cu4.m43221k(zzp);
        cu4.m43217g(zzp.f23098a);
        mo47488r1(zzp.f23098a, false);
        this.f33579a.mo47659c0().mo42815l(zzp.f23099d, zzp.f23092P, zzp.f23096Y);
    }

    /* renamed from: r1 */
    public final void mo47488r1(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f33580b == null) {
                        if (!"com.google.android.gms".equals(this.f33581c) && !l37.m47616a(this.f33579a.mo45271q(), Binder.getCallingUid())) {
                            if (!ni2.m48801a(this.f33579a.mo45271q()).mo46097c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f33580b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f33580b = Boolean.valueOf(z2);
                    }
                    if (this.f33580b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f33579a.mo45237A().mo29670l().mo48770b("Measurement Service called with invalid calling package. appId", bn8.m32664w(str));
                    throw e;
                }
            }
            if (this.f33581c == null && mi2.m48316k(this.f33579a.mo45271q(), Binder.getCallingUid(), str)) {
                this.f33581c = str;
            }
            if (!str.equals(this.f33581c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f33579a.mo45237A().mo29670l().mo48769a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: s1 */
    public final void mo47489s1(zzas zzas, zzp zzp) {
        if (!this.f33579a.mo47649T().mo47254o(zzp.f23098a)) {
            mo47493y1(zzas, zzp);
            return;
        }
        this.f33579a.mo45237A().mo29678v().mo48770b("EES config found for", zzp.f23098a);
        qq8 T = this.f33579a.mo47649T();
        String str = zzp.f23098a;
        zf9.m55099a();
        be8 be8 = null;
        if (T.f34342a.mo45274y().mo45997v((String) null, rl8.f33461F0) && !TextUtils.isEmpty(str)) {
            be8 = T.f33248i.mo19372c(str);
        }
        if (be8 != null) {
            try {
                Bundle w1 = zzas.f23075d.mo31419w1();
                HashMap hashMap = new HashMap();
                for (String next : w1.keySet()) {
                    Object obj = w1.get(next);
                    if (obj != null) {
                        hashMap.put(next, obj);
                    }
                }
                String a = cu8.m43237a(zzas.f23074a);
                if (a == null) {
                    a = zzas.f23074a;
                }
                if (be8.mo29562b(new h58(a, zzas.f23077g, hashMap))) {
                    if (be8.mo29563c()) {
                        this.f33579a.mo45237A().mo29678v().mo48770b("EES edited event", zzas.f23074a);
                        mo47493y1(w59.m53715M(be8.mo29565e().mo45972c()), zzp);
                    } else {
                        mo47493y1(zzas, zzp);
                    }
                    if (be8.mo29564d()) {
                        for (h58 next2 : be8.mo29565e().mo45976f()) {
                            this.f33579a.mo45237A().mo29678v().mo48770b("EES logging created event", next2.mo43085b());
                            mo47493y1(w59.m53715M(next2), zzp);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f33579a.mo45237A().mo29670l().mo48771c("EES error. appId, eventName", zzp.f23099d, zzas.f23074a);
            }
            this.f33579a.mo45237A().mo29678v().mo48770b("EES was not applied to event", zzas.f23074a);
            mo47493y1(zzas, zzp);
            return;
        }
        this.f33579a.mo45237A().mo29678v().mo48770b("EES not loaded for", zzp.f23098a);
        mo47493y1(zzas, zzp);
    }

    /* renamed from: t1 */
    public final zzas mo47490t1(zzas zzas, zzp zzp) {
        zzaq zzaq;
        if (!(!"_cmp".equals(zzas.f23074a) || (zzaq = zzas.f23075d) == null || zzaq.mo31418v1() == 0)) {
            String u1 = zzas.f23075d.mo31417u1("_cis");
            if ("referrer broadcast".equals(u1) || "referrer API".equals(u1)) {
                this.f33579a.mo45237A().mo29676t().mo48770b("Event has been filtered ", zzas.toString());
                return new zzas("_cmpx", zzas.f23075d, zzas.f23076e, zzas.f23077g);
            }
        }
        return zzas;
    }

    /* renamed from: u1 */
    public final void mo47491u1(Runnable runnable) {
        cu4.m43221k(runnable);
        if (this.f33579a.mo45272s().mo41637l()) {
            runnable.run();
        } else {
            this.f33579a.mo45272s().mo41640o(runnable);
        }
    }

    /* renamed from: v */
    public final void mo29023v(zzaa zzaa, zzp zzp) {
        cu4.m43221k(zzaa);
        cu4.m43221k(zzaa.f23066e);
        mo47487q1(zzp, false);
        zzaa zzaa2 = new zzaa(zzaa);
        zzaa2.f23064a = zzp.f23098a;
        mo47491u1(new pr8(this, zzaa2, zzp));
    }

    /* renamed from: v0 */
    public final void mo29024v0(long j, String str, String str2, String str3) {
        mo47491u1(new pt8(this, str2, str3, str, j));
    }

    /* renamed from: v1 */
    public final /* synthetic */ void mo47492v1(String str, Bundle bundle) {
        m78 V = this.f33579a.mo47651V();
        V.mo29006e();
        V.mo47982g();
        byte[] c = V.f33321b.mo47655Z().mo48906w(new j88(V.f34342a, "", str, "dep", 0, 0, bundle)).mo30879c();
        V.f34342a.mo45237A().mo29678v().mo48771c("Saving default event parameters, appId, data size", V.f34342a.mo45244H().mo45821m(str), Integer.valueOf(c.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", c);
        try {
            if (V.mo45660P().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                V.f34342a.mo45237A().mo29670l().mo48770b("Failed to insert default event parameters (got -1). appId", bn8.m32664w(str));
            }
        } catch (SQLiteException e) {
            V.f34342a.mo45237A().mo29670l().mo48771c("Error storing default event parameters. appId", bn8.m32664w(str), e);
        }
    }

    /* renamed from: w0 */
    public final List<zzkq> mo29025w0(zzp zzp, boolean z) {
        mo47487q1(zzp, false);
        String str = zzp.f23098a;
        cu4.m43221k(str);
        try {
            List<a69> list = (List) this.f33579a.mo45272s().mo41638m(new lt8(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (a69 a69 : list) {
                if (z || !g69.m44577F(a69.f20823c)) {
                    arrayList.add(new zzkq(a69));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f33579a.mo45237A().mo29670l().mo48771c("Failed to get user properties. appId", bn8.m32664w(zzp.f23098a), e);
            return null;
        }
    }

    /* renamed from: y1 */
    public final void mo47493y1(zzas zzas, zzp zzp) {
        this.f33579a.mo47670i();
        this.f33579a.mo47673j0(zzas, zzp);
    }
}
