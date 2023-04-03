package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.0 */
public class AppMeasurementDynamiteService extends cf8 {

    /* renamed from: a */
    public kr8 f23060a = null;

    /* renamed from: b */
    public final Map<Integer, ju8> f23061b = new C2781lq();

    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45259d().mo46407f(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45242F().mo47897B(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45242F().mo47912T((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45259d().mo46408g(str, j);
    }

    public void generateEventId(lf8 lf8) throws RemoteException {
        mo31393q1();
        long h0 = this.f23060a.mo45243G().mo42812h0();
        mo31393q1();
        this.f23060a.mo45243G().mo42802S(lf8, h0);
    }

    public void getAppInstanceId(lf8 lf8) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45272s().mo41640o(new wu8(this, lf8));
    }

    public void getCachedAppInstanceId(lf8 lf8) throws RemoteException {
        mo31393q1();
        mo31394r1(lf8, this.f23060a.mo45242F().mo47925n());
    }

    public void getConditionalUserProperties(String str, String str2, lf8 lf8) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45272s().mo41640o(new y69(this, lf8, str, str2));
    }

    public void getCurrentScreenClass(lf8 lf8) throws RemoteException {
        mo31393q1();
        mo31394r1(lf8, this.f23060a.mo45242F().mo47901F());
    }

    public void getCurrentScreenName(lf8 lf8) throws RemoteException {
        mo31393q1();
        mo31394r1(lf8, this.f23060a.mo45242F().mo47900E());
    }

    public void getGmpAppId(lf8 lf8) throws RemoteException {
        mo31393q1();
        mo31394r1(lf8, this.f23060a.mo45242F().mo47902G());
    }

    public void getMaxUserProperties(String str, lf8 lf8) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45242F().mo47933x(str);
        mo31393q1();
        this.f23060a.mo45243G().mo42803T(lf8, 25);
    }

    public void getTestFlag(lf8 lf8, int i) throws RemoteException {
        mo31393q1();
        if (i == 0) {
            this.f23060a.mo45243G().mo42801R(lf8, this.f23060a.mo45242F().mo47908P());
        } else if (i == 1) {
            this.f23060a.mo45243G().mo42802S(lf8, this.f23060a.mo45242F().mo47909Q().longValue());
        } else if (i == 2) {
            g69 G = this.f23060a.mo45243G();
            double doubleValue = this.f23060a.mo45242F().mo47911S().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                lf8.mo43180X0(bundle);
            } catch (RemoteException e) {
                G.f34342a.mo45237A().mo29673o().mo48770b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f23060a.mo45243G().mo42803T(lf8, this.f23060a.mo45242F().mo47910R().intValue());
        } else if (i == 4) {
            this.f23060a.mo45243G().mo42805V(lf8, this.f23060a.mo45242F().mo47907O().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, lf8 lf8) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45272s().mo41640o(new e19(this, lf8, str, str2, z));
    }

    public void initForTests(Map map) throws RemoteException {
        mo31393q1();
    }

    public void initialize(ro2 ro2, zzcl zzcl, long j) throws RemoteException {
        kr8 kr8 = this.f23060a;
        if (kr8 == null) {
            this.f23060a = kr8.m47470e((Context) cu4.m43221k((Context) gf4.m44715r1(ro2)), zzcl, Long.valueOf(j));
        } else {
            kr8.mo45237A().mo29673o().mo48769a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(lf8 lf8) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45272s().mo41640o(new i99(this, lf8));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45242F().mo47919a0(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, lf8 lf8, long j) throws RemoteException {
        Bundle bundle2;
        mo31393q1();
        cu4.m43217g(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f23060a.mo45272s().mo41640o(new my8(this, lf8, new zzas(str2, new zzaq(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, ro2 ro2, ro2 ro22, ro2 ro23) throws RemoteException {
        Object obj;
        Object obj2;
        mo31393q1();
        Object obj3 = null;
        if (ro2 == null) {
            obj = null;
        } else {
            obj = gf4.m44715r1(ro2);
        }
        if (ro22 == null) {
            obj2 = null;
        } else {
            obj2 = gf4.m44715r1(ro22);
        }
        if (ro23 != null) {
            obj3 = gf4.m44715r1(ro23);
        }
        this.f23060a.mo45237A().mo29679x(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(ro2 ro2, Bundle bundle, long j) throws RemoteException {
        mo31393q1();
        qx8 qx8 = this.f23060a.mo45242F().f34043c;
        if (qx8 != null) {
            this.f23060a.mo45242F().mo47906N();
            qx8.onActivityCreated((Activity) gf4.m44715r1(ro2), bundle);
        }
    }

    public void onActivityDestroyed(ro2 ro2, long j) throws RemoteException {
        mo31393q1();
        qx8 qx8 = this.f23060a.mo45242F().f34043c;
        if (qx8 != null) {
            this.f23060a.mo45242F().mo47906N();
            qx8.onActivityDestroyed((Activity) gf4.m44715r1(ro2));
        }
    }

    public void onActivityPaused(ro2 ro2, long j) throws RemoteException {
        mo31393q1();
        qx8 qx8 = this.f23060a.mo45242F().f34043c;
        if (qx8 != null) {
            this.f23060a.mo45242F().mo47906N();
            qx8.onActivityPaused((Activity) gf4.m44715r1(ro2));
        }
    }

    public void onActivityResumed(ro2 ro2, long j) throws RemoteException {
        mo31393q1();
        qx8 qx8 = this.f23060a.mo45242F().f34043c;
        if (qx8 != null) {
            this.f23060a.mo45242F().mo47906N();
            qx8.onActivityResumed((Activity) gf4.m44715r1(ro2));
        }
    }

    public void onActivitySaveInstanceState(ro2 ro2, lf8 lf8, long j) throws RemoteException {
        mo31393q1();
        qx8 qx8 = this.f23060a.mo45242F().f34043c;
        Bundle bundle = new Bundle();
        if (qx8 != null) {
            this.f23060a.mo45242F().mo47906N();
            qx8.onActivitySaveInstanceState((Activity) gf4.m44715r1(ro2), bundle);
        }
        try {
            lf8.mo43180X0(bundle);
        } catch (RemoteException e) {
            this.f23060a.mo45237A().mo29673o().mo48770b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(ro2 ro2, long j) throws RemoteException {
        mo31393q1();
        if (this.f23060a.mo45242F().f34043c != null) {
            this.f23060a.mo45242F().mo47906N();
            Activity activity = (Activity) gf4.m44715r1(ro2);
        }
    }

    public void onActivityStopped(ro2 ro2, long j) throws RemoteException {
        mo31393q1();
        if (this.f23060a.mo45242F().f34043c != null) {
            this.f23060a.mo45242F().mo47906N();
            Activity activity = (Activity) gf4.m44715r1(ro2);
        }
    }

    public void performAction(Bundle bundle, lf8 lf8, long j) throws RemoteException {
        mo31393q1();
        lf8.mo43180X0((Bundle) null);
    }

    @EnsuresNonNull({"scion"})
    /* renamed from: q1 */
    public final void mo31393q1() {
        if (this.f23060a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: r1 */
    public final void mo31394r1(lf8 lf8, String str) {
        mo31393q1();
        this.f23060a.mo45243G().mo42801R(lf8, str);
    }

    public void registerOnMeasurementEventListener(tf8 tf8) throws RemoteException {
        ju8 ju8;
        mo31393q1();
        synchronized (this.f23061b) {
            ju8 = this.f23061b.get(Integer.valueOf(tf8.mo43636c()));
            if (ju8 == null) {
                ju8 = new ad9(this, tf8);
                this.f23061b.put(Integer.valueOf(tf8.mo43636c()), ju8);
            }
        }
        this.f23060a.mo45242F().mo47931v(ju8);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45242F().mo47927p(j);
    }

    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        mo31393q1();
        if (bundle == null) {
            this.f23060a.mo45237A().mo29670l().mo48769a("Conditional user property must not be null");
        } else {
            this.f23060a.mo45242F().mo47935z(bundle, j);
        }
    }

    public void setConsent(Bundle bundle, long j) throws RemoteException {
        mo31393q1();
        sx8 F = this.f23060a.mo45242F();
        id9.m45680a();
        if (!F.f34342a.mo45274y().mo45997v((String) null, rl8.f33459E0) || TextUtils.isEmpty(F.f34342a.mo45258c().mo41980n())) {
            F.mo47913U(bundle, 0, j);
        } else {
            F.f34342a.mo45237A().mo29675r().mo48769a("Using developer consent only; google app id found");
        }
    }

    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45242F().mo47913U(bundle, -20, j);
    }

    public void setCurrentScreen(ro2 ro2, String str, String str2, long j) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45253Q().mo44643u((Activity) gf4.m44715r1(ro2), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        mo31393q1();
        sx8 F = this.f23060a.mo45242F();
        F.mo47219g();
        F.f34342a.mo45272s().mo41640o(new uu8(F, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        mo31393q1();
        sx8 F = this.f23060a.mo45242F();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        F.f34342a.mo45272s().mo41640o(new nu8(F, bundle2));
    }

    public void setEventInterceptor(tf8 tf8) throws RemoteException {
        mo31393q1();
        pb9 pb9 = new pb9(this, tf8);
        if (this.f23060a.mo45272s().mo41637l()) {
            this.f23060a.mo45242F().mo47930u(pb9);
        } else {
            this.f23060a.mo45272s().mo41640o(new e49(this, pb9));
        }
    }

    public void setInstanceIdProvider(zf8 zf8) throws RemoteException {
        mo31393q1();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45242F().mo47912T(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        mo31393q1();
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        mo31393q1();
        sx8 F = this.f23060a.mo45242F();
        F.f34342a.mo45272s().mo41640o(new pv8(F, j));
    }

    public void setUserId(String str, long j) throws RemoteException {
        mo31393q1();
        if (!this.f23060a.mo45274y().mo45997v((String) null, rl8.f33455C0) || str == null || str.length() != 0) {
            this.f23060a.mo45242F().mo47922d0((String) null, "_id", str, true, j);
        } else {
            this.f23060a.mo45237A().mo29673o().mo48769a("User ID must be non-empty");
        }
    }

    public void setUserProperty(String str, String str2, ro2 ro2, boolean z, long j) throws RemoteException {
        mo31393q1();
        this.f23060a.mo45242F().mo47922d0(str, str2, gf4.m44715r1(ro2), z, j);
    }

    public void unregisterOnMeasurementEventListener(tf8 tf8) throws RemoteException {
        ju8 remove;
        mo31393q1();
        synchronized (this.f23061b) {
            remove = this.f23061b.remove(Integer.valueOf(tf8.mo43636c()));
        }
        if (remove == null) {
            remove = new ad9(this, tf8);
        }
        this.f23060a.mo45242F().mo47932w(remove);
    }
}
