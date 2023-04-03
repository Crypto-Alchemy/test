package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzas;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ht8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class ht8 implements Callable<byte[]> {

    /* renamed from: a */
    public final /* synthetic */ zzas f29728a;

    /* renamed from: d */
    public final /* synthetic */ String f29729d;

    /* renamed from: e */
    public final /* synthetic */ rt8 f29730e;

    public ht8(rt8 rt8, zzas zzas, String str) {
        this.f29730e = rt8;
        this.f29728a = zzas;
        this.f29729d = str;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        s59 s59;
        a69 a69;
        Bundle bundle;
        ir8 ir8;
        nr8 nr8;
        String str;
        Object obj;
        cs8 cs8;
        long j;
        m88 m88;
        this.f29730e.f33579a.mo47670i();
        py8 Y = this.f29730e.f33579a.mo47654Y();
        zzas zzas = this.f29728a;
        String str2 = this.f29729d;
        Y.mo29006e();
        kr8.m47472t();
        cu4.m43221k(zzas);
        cu4.m43217g(str2);
        if (!Y.f34342a.mo45274y().mo45997v(str2, rl8.f33480W)) {
            Y.f34342a.mo45237A().mo29677u().mo48770b("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(zzas.f23074a) || "_iapx".equals(zzas.f23074a)) {
            ir8 z = jr8.m46712z();
            Y.f33321b.mo47651V().mo45657M();
            cs8 c0 = Y.f33321b.mo47651V().mo45673c0(str2);
            if (c0 == null) {
                Y.f34342a.mo45237A().mo29677u().mo48770b("Log and bundle not available. package_name", str2);
                bArr = new byte[0];
                s59 = Y.f33321b;
            } else if (!c0.mo41686f()) {
                Y.f34342a.mo45237A().mo29677u().mo48770b("Log and bundle disabled. package_name", str2);
                bArr = new byte[0];
                s59 = Y.f33321b;
            } else {
                nr8 K0 = or8.m49408K0();
                K0.mo46180a0(1);
                K0.mo46201w("android");
                if (!TextUtils.isEmpty(c0.mo41663N())) {
                    K0.mo46146E(c0.mo41663N());
                }
                if (!TextUtils.isEmpty(c0.mo41693i0())) {
                    K0.mo46143C((String) cu4.m43221k(c0.mo41693i0()));
                }
                if (!TextUtils.isEmpty(c0.mo41685e0())) {
                    K0.mo46147F((String) cu4.m43221k(c0.mo41685e0()));
                }
                if (c0.mo41689g0() != -2147483648L) {
                    K0.mo46182d0((int) c0.mo41689g0());
                }
                K0.mo46149G(c0.mo41697k0());
                K0.mo46192n0(c0.mo41682d());
                String Q = c0.mo41666Q();
                String S = c0.mo41668S();
                le9.m47797a();
                if (Y.f34342a.mo45274y().mo45997v(c0.mo41663N(), rl8.f33501i0)) {
                    String U = c0.mo41670U();
                    if (!TextUtils.isEmpty(Q)) {
                        K0.mo46176U(Q);
                    } else if (!TextUtils.isEmpty(U)) {
                        K0.mo46195q0(U);
                    } else if (!TextUtils.isEmpty(S)) {
                        K0.mo46189k0(S);
                    }
                } else if (!TextUtils.isEmpty(Q)) {
                    K0.mo46176U(Q);
                } else if (!TextUtils.isEmpty(S)) {
                    K0.mo46189k0(S);
                }
                u68 f0 = Y.f33321b.mo47665f0(str2);
                K0.mo46165O(c0.mo41678b());
                if (Y.f34342a.mo45262h() && Y.f34342a.mo45274y().mo45981F(K0.mo46145D()) && f0.mo48329f() && !TextUtils.isEmpty((CharSequence) null)) {
                    K0.mo46186h0((String) null);
                }
                K0.mo46196r0(f0.mo48326d());
                if (f0.mo48329f()) {
                    Pair<String, Boolean> j2 = Y.f33321b.mo47656a0().mo43451j(c0.mo41663N(), f0);
                    if (c0.mo41656G() && !TextUtils.isEmpty((CharSequence) j2.first)) {
                        try {
                            K0.mo46153I(py8.m50203j((String) j2.first, Long.toString(zzas.f23077g)));
                            Object obj2 = j2.second;
                            if (obj2 != null) {
                                K0.mo46157K(((Boolean) obj2).booleanValue());
                            }
                        } catch (SecurityException e) {
                            Y.f34342a.mo45237A().mo29677u().mo48770b("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            s59 = Y.f33321b;
                        } catch (Throwable th) {
                            Y.f33321b.mo47651V().mo45659O();
                            throw th;
                        }
                    }
                }
                Y.f34342a.mo45255S().mo48801i();
                K0.mo46205y(Build.MODEL);
                Y.f34342a.mo45255S().mo48801i();
                K0.mo46203x(Build.VERSION.RELEASE);
                K0.mo46141B((int) Y.f34342a.mo45255S().mo42850l());
                K0.mo46206z(Y.f34342a.mo45255S().mo42851m());
                try {
                    if (f0.mo48331h() && c0.mo41664O() != null) {
                        K0.mo46161M(py8.m50203j((String) cu4.m43221k(c0.mo41664O()), Long.toString(zzas.f23077g)));
                    }
                    if (!TextUtils.isEmpty(c0.mo41674Y())) {
                        K0.mo46181c0((String) cu4.m43221k(c0.mo41674Y()));
                    }
                    String N = c0.mo41663N();
                    List<a69> V = Y.f33321b.mo47651V().mo45666V(N);
                    Iterator<a69> it = V.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            a69 = null;
                            break;
                        }
                        a69 = it.next();
                        if ("_lte".equals(a69.f20823c)) {
                            break;
                        }
                    }
                    if (a69 == null || a69.f20825e == null) {
                        a69 a692 = new a69(N, "auto", "_lte", Y.f34342a.mo45256a().mo29580a(), 0L);
                        V.add(a692);
                        Y.f33321b.mo47651V().mo45664T(a692);
                    }
                    w59 Z = Y.f33321b.mo47655Z();
                    Z.f34342a.mo45237A().mo29678v().mo48769a("Checking account type status for ad personalization signals");
                    if (Z.f34342a.mo45255S().mo42854p()) {
                        String N2 = c0.mo41663N();
                        cu4.m43221k(N2);
                        if (c0.mo41656G() && Z.f33321b.mo47649T().mo47253n(N2)) {
                            Z.f34342a.mo45237A().mo29677u().mo48769a("Turning off ad personalization due to account type");
                            Iterator<a69> it2 = V.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if ("_npa".equals(it2.next().f20823c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            V.add(new a69(N2, "auto", "_npa", Z.f34342a.mo45256a().mo29580a(), 1L));
                        }
                    }
                    it8[] it8Arr = new it8[V.size()];
                    for (int i = 0; i < V.size(); i++) {
                        gt8 H = it8.m45961H();
                        H.mo42977x(V.get(i).f20823c);
                        H.mo42976w(V.get(i).f20824d);
                        Y.f33321b.mo47655Z().mo48904u(H, V.get(i).f20825e);
                        it8Arr[i] = (it8) H.mo48885o();
                    }
                    K0.mo46156J0(Arrays.asList(it8Arr));
                    en8 a = en8.m43994a(zzas);
                    Y.f34342a.mo45243G().mo42831u(a.f28641d, Y.f33321b.mo47651V().mo45691v(str2));
                    Y.f34342a.mo45243G().mo42829t(a, Y.f34342a.mo45274y().mo45988k(str2));
                    Bundle bundle2 = a.f28641d;
                    bundle2.putLong("_c", 1);
                    Y.f34342a.mo45237A().mo29677u().mo48769a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", zzas.f23076e);
                    if (Y.f34342a.mo45243G().mo42792H(K0.mo46145D())) {
                        Y.f34342a.mo45243G().mo42837y(bundle2, "_dbg", 1L);
                        Y.f34342a.mo45243G().mo42837y(bundle2, "_r", 1L);
                    }
                    m88 Q2 = Y.f33321b.mo47651V().mo45661Q(str2, zzas.f23074a);
                    if (Q2 == null) {
                        nr8 = K0;
                        cs8 = c0;
                        ir8 = z;
                        str = str2;
                        bundle = bundle2;
                        obj = null;
                        m88 = new m88(str2, zzas.f23074a, 0, 0, 0, zzas.f23077g, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j = 0;
                    } else {
                        cs8 = c0;
                        ir8 = z;
                        str = str2;
                        bundle = bundle2;
                        nr8 = K0;
                        obj = null;
                        long j3 = Q2.f31543f;
                        m88 = Q2.mo45700a(zzas.f23077g);
                        j = j3;
                    }
                    Y.f33321b.mo47651V().mo45662R(m88);
                    j88 j88 = new j88(Y.f34342a, zzas.f23076e, str, zzas.f23074a, zzas.f23077g, j, bundle);
                    uq8 I = wq8.m54013I();
                    I.mo48496L(j88.f30243d);
                    I.mo48493I(j88.f30241b);
                    I.mo48498N(j88.f30244e);
                    q88 q88 = new q88(j88.f30245f);
                    while (q88.hasNext()) {
                        String a2 = q88.next();
                        br8 K = er8.m44025K();
                        K.mo29705w(a2);
                        Object r1 = j88.f30245f.mo31413r1(a2);
                        if (r1 != null) {
                            Y.f33321b.mo47655Z().mo48905v(K, r1);
                            I.mo48488D(K);
                        }
                    }
                    nr8 nr82 = nr8;
                    nr82.mo46202w0(I);
                    rr8 x = us8.m52995x();
                    yq8 x2 = ar8.m31913x();
                    x2.mo49733x(m88.f31540c);
                    x2.mo49732w(zzas.f23074a);
                    x.mo47474w(x2);
                    nr82.mo46190l0(x);
                    nr82.mo46178Y(Y.f33321b.mo47653X().mo44820j(cs8.mo41663N(), Collections.emptyList(), nr82.mo46142B0(), Long.valueOf(I.mo48495K()), Long.valueOf(I.mo48495K())));
                    if (I.mo48494J()) {
                        nr82.mo46164N0(I.mo48495K());
                        nr82.mo46168P0(I.mo48495K());
                    }
                    long c02 = cs8.mo41681c0();
                    int i2 = (c02 > 0 ? 1 : (c02 == 0 ? 0 : -1));
                    if (i2 != 0) {
                        nr82.mo46173S0(c02);
                    }
                    long a0 = cs8.mo41677a0();
                    if (a0 != 0) {
                        nr82.mo46169Q0(a0);
                    } else if (i2 != 0) {
                        nr82.mo46169Q0(c02);
                    }
                    cs8.mo41700n();
                    nr82.mo46167P((int) cs8.mo41692i());
                    Y.f34342a.mo45274y().mo45990m();
                    nr82.mo46151H(42004);
                    nr82.mo46160L0(Y.f34342a.mo45256a().mo29580a());
                    nr82.mo46177V(true);
                    ir8 ir82 = ir8;
                    ir82.mo43904x(nr82);
                    cs8 cs82 = cs8;
                    cs82.mo41679b0(nr82.mo46162M0());
                    cs82.mo41683d0(nr82.mo46166O0());
                    Y.f33321b.mo47651V().mo45674d0(cs82);
                    Y.f33321b.mo47651V().mo45658N();
                    Y.f33321b.mo47651V().mo45659O();
                    try {
                        return Y.f33321b.mo47655Z().mo48901I(((jr8) ir82.mo48885o()).mo30879c());
                    } catch (IOException e2) {
                        Y.f34342a.mo45237A().mo29670l().mo48771c("Data loss. Failed to bundle and serialize. appId", bn8.m32664w(str), e2);
                        return obj;
                    }
                } catch (SecurityException e3) {
                    Y.f34342a.mo45237A().mo29677u().mo48770b("app instance id encryption failed", e3.getMessage());
                    bArr = new byte[0];
                    s59 = Y.f33321b;
                }
            }
            s59.mo47651V().mo45659O();
            return bArr;
        } else {
            Y.f34342a.mo45237A().mo29677u().mo48771c("Generating a payload for this event is not available. package_name, event_name", str2, zzas.f23074a);
            return null;
        }
    }
}
