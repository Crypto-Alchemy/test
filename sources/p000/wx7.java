package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4028a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: wx7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class wx7 implements l08 {

    /* renamed from: a */
    public final Context f35468a;

    /* renamed from: b */
    public final iz7 f35469b;

    /* renamed from: c */
    public final Looper f35470c;

    /* renamed from: d */
    public final mz7 f35471d;

    /* renamed from: e */
    public final mz7 f35472e;

    /* renamed from: f */
    public final Map f35473f;

    /* renamed from: g */
    public final Set f35474g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: h */
    public final C4013a.C4021f f35475h;

    /* renamed from: i */
    public Bundle f35476i;

    /* renamed from: j */
    public ConnectionResult f35477j = null;

    /* renamed from: k */
    public ConnectionResult f35478k = null;

    /* renamed from: l */
    public boolean f35479l = false;

    /* renamed from: m */
    public final Lock f35480m;

    /* renamed from: n */
    public int f35481n = 0;

    public wx7(Context context, iz7 iz7, Lock lock, Looper looper, zh2 zh2, Map map, Map map2, sg0 sg0, C4013a.C4014a aVar, C4013a.C4021f fVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f35468a = context;
        this.f35469b = iz7;
        this.f35480m = lock;
        this.f35470c = looper;
        this.f35475h = fVar;
        Context context2 = context;
        iz7 iz72 = iz7;
        Lock lock2 = lock;
        Looper looper2 = looper;
        zh2 zh22 = zh2;
        mz7 mz7 = r3;
        mz7 mz72 = new mz7(context2, iz72, lock2, looper2, zh22, map2, (sg0) null, map4, (C4013a.C4014a) null, arrayList2, new w38(this, (v38) null));
        this.f35471d = mz7;
        this.f35472e = new mz7(context2, iz72, lock2, looper2, zh22, map, sg0, map3, aVar, arrayList, new a48(this, (y38) null));
        C2781lq lqVar = new C2781lq();
        for (C4013a.C4016c put : map2.keySet()) {
            lqVar.put(put, this.f35471d);
        }
        for (C4013a.C4016c put2 : map.keySet()) {
            lqVar.put(put2, this.f35472e);
        }
        this.f35473f = Collections.unmodifiableMap(lqVar);
    }

    /* renamed from: k */
    public static boolean m54108k(ConnectionResult connectionResult) {
        if (connectionResult == null || !connectionResult.mo30462v1()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static wx7 m54110m(Context context, iz7 iz7, Lock lock, Looper looper, zh2 zh2, Map map, sg0 sg0, Map map2, C4013a.C4014a aVar, ArrayList arrayList) {
        Map map3 = map2;
        C2781lq lqVar = new C2781lq();
        C2781lq lqVar2 = new C2781lq();
        C4013a.C4021f fVar = null;
        for (Map.Entry entry : map.entrySet()) {
            C4013a.C4021f fVar2 = (C4013a.C4021f) entry.getValue();
            if (true == fVar2.mo30545c()) {
                fVar = fVar2;
            }
            if (fVar2.mo30551j()) {
                lqVar.put((C4013a.C4016c) entry.getKey(), fVar2);
            } else {
                lqVar2.put((C4013a.C4016c) entry.getKey(), fVar2);
            }
        }
        cu4.m43226p(!lqVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C2781lq lqVar3 = new C2781lq();
        C2781lq lqVar4 = new C2781lq();
        for (C4013a aVar2 : map2.keySet()) {
            C4013a.C4016c b = aVar2.mo30534b();
            if (lqVar.containsKey(b)) {
                lqVar3.put(aVar2, (Boolean) map3.get(aVar2));
            } else if (lqVar2.containsKey(b)) {
                lqVar4.put(aVar2, (Boolean) map3.get(aVar2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q38 q38 = (q38) arrayList.get(i);
            if (lqVar3.containsKey(q38.f32911a)) {
                arrayList2.add(q38);
            } else if (lqVar4.containsKey(q38.f32911a)) {
                arrayList3.add(q38);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new wx7(context, iz7, lock, looper, zh2, lqVar, lqVar2, sg0, aVar, fVar, arrayList2, arrayList3, lqVar3, lqVar4);
    }

    /* renamed from: t */
    public static /* bridge */ /* synthetic */ void m54117t(wx7 wx7, int i, boolean z) {
        wx7.f35469b.mo28876b(i, z);
        wx7.f35478k = null;
        wx7.f35477j = null;
    }

    /* renamed from: u */
    public static /* bridge */ /* synthetic */ void m54118u(wx7 wx7, Bundle bundle) {
        Bundle bundle2 = wx7.f35476i;
        if (bundle2 == null) {
            wx7.f35476i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: v */
    public static /* bridge */ /* synthetic */ void m54119v(wx7 wx7) {
        ConnectionResult connectionResult;
        if (m54108k(wx7.f35477j)) {
            if (m54108k(wx7.f35478k) || wx7.mo49316i()) {
                int i = wx7.f35481n;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        wx7.f35481n = 0;
                        return;
                    }
                    ((iz7) cu4.m43221k(wx7.f35469b)).mo28875a(wx7.f35476i);
                }
                wx7.mo49315h();
                wx7.f35481n = 0;
                return;
            }
            ConnectionResult connectionResult2 = wx7.f35478k;
            if (connectionResult2 == null) {
                return;
            }
            if (wx7.f35481n == 1) {
                wx7.mo49315h();
                return;
            }
            wx7.mo49314g(connectionResult2);
            wx7.f35471d.mo45321c();
        } else if (wx7.f35477j == null || !m54108k(wx7.f35478k)) {
            ConnectionResult connectionResult3 = wx7.f35477j;
            if (connectionResult3 != null && (connectionResult = wx7.f35478k) != null) {
                if (wx7.f35472e.f31923m < wx7.f35471d.f31923m) {
                    connectionResult3 = connectionResult;
                }
                wx7.mo49314g(connectionResult3);
            }
        } else {
            wx7.f35472e.mo45321c();
            wx7.mo49314g((ConnectionResult) cu4.m43221k(wx7.f35477j));
        }
    }

    /* renamed from: a */
    public final void mo45319a() {
        this.f35481n = 2;
        this.f35479l = false;
        this.f35478k = null;
        this.f35477j = null;
        this.f35471d.mo45319a();
        this.f35472e.mo45319a();
    }

    /* renamed from: b */
    public final void mo45320b() {
        this.f35471d.mo45320b();
        this.f35472e.mo45320b();
    }

    /* renamed from: c */
    public final void mo45321c() {
        this.f35478k = null;
        this.f35477j = null;
        this.f35481n = 0;
        this.f35471d.mo45321c();
        this.f35472e.mo45321c();
        mo49315h();
    }

    /* renamed from: d */
    public final void mo45322d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f35472e.mo45322d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f35471d.mo45322d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e */
    public final boolean mo45323e() {
        this.f35480m.lock();
        try {
            boolean z = false;
            if (this.f35471d.mo45323e() && (this.f35472e.mo45323e() || mo49316i() || this.f35481n == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.f35480m.unlock();
        }
    }

    /* renamed from: f */
    public final C4028a mo45324f(C4028a aVar) {
        if (!mo49317j(aVar)) {
            return this.f35471d.mo45324f(aVar);
        }
        if (!mo49316i()) {
            return this.f35472e.mo45324f(aVar);
        }
        aVar.mo30603u(new Status(4, (String) null, mo49318x()));
        return aVar;
    }

    /* renamed from: g */
    public final void mo49314g(ConnectionResult connectionResult) {
        int i = this.f35481n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f35481n = 0;
            }
            this.f35469b.mo28877c(connectionResult);
        }
        mo49315h();
        this.f35481n = 0;
    }

    /* renamed from: h */
    public final void mo49315h() {
        for (m16 onComplete : this.f35474g) {
            onComplete.onComplete();
        }
        this.f35474g.clear();
    }

    /* renamed from: i */
    public final boolean mo49316i() {
        ConnectionResult connectionResult = this.f35478k;
        if (connectionResult == null || connectionResult.mo30457r1() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo49317j(C4028a aVar) {
        mz7 mz7 = (mz7) this.f35473f.get(aVar.mo30599q());
        cu4.m43222l(mz7, "GoogleApiClient is not configured to use the API required for this call.");
        return mz7.equals(this.f35472e);
    }

    /* renamed from: x */
    public final PendingIntent mo49318x() {
        if (this.f35475h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f35468a, System.identityHashCode(this.f35469b), this.f35475h.mo30558t(), g38.f29068a | 134217728);
    }
}
