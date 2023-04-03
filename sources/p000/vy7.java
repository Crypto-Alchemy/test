package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.internal.C4028a;
import com.google.android.gms.common.internal.C4033b;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: vy7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class vy7 implements jz7 {

    /* renamed from: a */
    public final mz7 f35193a;

    /* renamed from: b */
    public final Lock f35194b;

    /* renamed from: c */
    public final Context f35195c;

    /* renamed from: d */
    public final zh2 f35196d;

    /* renamed from: e */
    public ConnectionResult f35197e;

    /* renamed from: f */
    public int f35198f;

    /* renamed from: g */
    public int f35199g = 0;

    /* renamed from: h */
    public int f35200h;

    /* renamed from: i */
    public final Bundle f35201i = new Bundle();

    /* renamed from: j */
    public final Set f35202j = new HashSet();

    /* renamed from: k */
    public r18 f35203k;

    /* renamed from: l */
    public boolean f35204l;

    /* renamed from: m */
    public boolean f35205m;

    /* renamed from: n */
    public boolean f35206n;

    /* renamed from: o */
    public C4033b f35207o;

    /* renamed from: p */
    public boolean f35208p;

    /* renamed from: q */
    public boolean f35209q;

    /* renamed from: r */
    public final sg0 f35210r;

    /* renamed from: s */
    public final Map f35211s;

    /* renamed from: t */
    public final C4013a.C4014a f35212t;

    /* renamed from: u */
    public final ArrayList f35213u = new ArrayList();

    public vy7(mz7 mz7, sg0 sg0, Map map, zh2 zh2, C4013a.C4014a aVar, Lock lock, Context context) {
        this.f35193a = mz7;
        this.f35210r = sg0;
        this.f35211s = map;
        this.f35196d = zh2;
        this.f35212t = aVar;
        this.f35194b = lock;
        this.f35195c = context;
    }

    /* renamed from: A */
    public static /* bridge */ /* synthetic */ void m53622A(vy7 vy7, zak zak) {
        if (vy7.mo48867n(0)) {
            ConnectionResult r1 = zak.mo31440r1();
            if (r1.mo30462v1()) {
                zav zav = (zav) cu4.m43221k(zak.mo31441s1());
                ConnectionResult r12 = zav.mo30666r1();
                if (!r12.mo30462v1()) {
                    String valueOf = String.valueOf(r12);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    vy7.mo48864k(r12);
                    return;
                }
                vy7.f35206n = true;
                vy7.f35207o = (C4033b) cu4.m43221k(zav.mo30667s1());
                vy7.f35208p = zav.mo30668t1();
                vy7.f35209q = zav.mo30669u1();
                vy7.mo48866m();
            } else if (vy7.mo48869p(r1)) {
                vy7.mo48861h();
                vy7.mo48866m();
            } else {
                vy7.mo48864k(r1);
            }
        }
    }

    /* renamed from: q */
    public static final String m53630q(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* renamed from: x */
    public static /* bridge */ /* synthetic */ Set m53637x(vy7 vy7) {
        sg0 sg0 = vy7.f35210r;
        if (sg0 == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(sg0.mo47777e());
        Map i = vy7.f35210r.mo47781i();
        for (C4013a aVar : i.keySet()) {
            if (!vy7.f35193a.f31917g.containsKey(aVar.mo30534b())) {
                hashSet.addAll(((yy7) i.get(aVar)).f35959a);
            }
        }
        return hashSet;
    }

    /* renamed from: I */
    public final void mo48860I() {
        ArrayList arrayList = this.f35213u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.f35213u.clear();
    }

    /* renamed from: a */
    public final void mo43974a(Bundle bundle) {
        if (mo48867n(1)) {
            if (bundle != null) {
                this.f35201i.putAll(bundle);
            }
            if (mo48868o()) {
                mo48863j();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.google.android.gms.common.api.a$f, r18] */
    /* renamed from: b */
    public final void mo43975b() {
        boolean z;
        this.f35193a.f31917g.clear();
        this.f35205m = false;
        this.f35197e = null;
        this.f35199g = 0;
        this.f35204l = true;
        this.f35206n = false;
        this.f35208p = false;
        HashMap hashMap = new HashMap();
        boolean z2 = false;
        for (C4013a aVar : this.f35211s.keySet()) {
            C4013a.C4021f fVar = (C4013a.C4021f) cu4.m43221k((C4013a.C4021f) this.f35193a.f31916f.get(aVar.mo30534b()));
            if (aVar.mo30535c().mo30542b() == 1) {
                z = true;
            } else {
                z = false;
            }
            z2 |= z;
            boolean booleanValue = ((Boolean) this.f35211s.get(aVar)).booleanValue();
            if (fVar.mo30551j()) {
                this.f35205m = true;
                if (booleanValue) {
                    this.f35202j.add(aVar.mo30534b());
                } else {
                    this.f35204l = false;
                }
            }
            hashMap.put(fVar, new ky7(this, aVar, booleanValue));
        }
        if (z2) {
            this.f35205m = false;
        }
        if (this.f35205m) {
            cu4.m43221k(this.f35210r);
            cu4.m43221k(this.f35212t);
            this.f35210r.mo47782j(Integer.valueOf(System.identityHashCode(this.f35193a.f31924n)));
            sy7 sy7 = new sy7(this, (ry7) null);
            C4013a.C4014a aVar2 = this.f35212t;
            Context context = this.f35195c;
            Looper f = this.f35193a.f31924n.mo30501f();
            sg0 sg0 = this.f35210r;
            this.f35203k = aVar2.mo30538d(context, f, sg0, sg0.mo47778f(), sy7, sy7);
        }
        this.f35200h = this.f35193a.f31916f.size();
        this.f35213u.add(nz7.m49109a().submit(new ny7(this, hashMap)));
    }

    /* renamed from: c */
    public final void mo43976c() {
    }

    /* renamed from: d */
    public final void mo43977d(ConnectionResult connectionResult, C4013a aVar, boolean z) {
        if (mo48867n(1)) {
            mo48865l(connectionResult, aVar, z);
            if (mo48868o()) {
                mo48863j();
            }
        }
    }

    /* renamed from: e */
    public final void mo43978e(int i) {
        mo48864k(new ConnectionResult(8, (PendingIntent) null));
    }

    /* renamed from: f */
    public final boolean mo43979f() {
        mo48860I();
        mo48862i(true);
        this.f35193a.mo45938k((ConnectionResult) null);
        return true;
    }

    /* renamed from: g */
    public final C4028a mo43980g(C4028a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: h */
    public final void mo48861h() {
        this.f35205m = false;
        this.f35193a.f31924n.f30187p = Collections.emptySet();
        for (C4013a.C4016c cVar : this.f35202j) {
            if (!this.f35193a.f31917g.containsKey(cVar)) {
                this.f35193a.f31917g.put(cVar, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    /* renamed from: i */
    public final void mo48862i(boolean z) {
        r18 r18 = this.f35203k;
        if (r18 != null) {
            if (r18.mo30544b() && z) {
                r18.mo45327i();
            }
            r18.mo30543a();
            sg0 sg0 = (sg0) cu4.m43221k(this.f35210r);
            this.f35207o = null;
        }
    }

    /* renamed from: j */
    public final void mo48863j() {
        Bundle bundle;
        this.f35193a.mo45936i();
        nz7.m49109a().execute(new jy7(this));
        r18 r18 = this.f35203k;
        if (r18 != null) {
            if (this.f35208p) {
                r18.mo45329r((C4033b) cu4.m43221k(this.f35207o), this.f35209q);
            }
            mo48862i(false);
        }
        for (C4013a.C4016c cVar : this.f35193a.f31917g.keySet()) {
            ((C4013a.C4021f) cu4.m43221k((C4013a.C4021f) this.f35193a.f31916f.get(cVar))).mo30543a();
        }
        if (this.f35201i.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f35201i;
        }
        this.f35193a.f31925o.mo28875a(bundle);
    }

    /* renamed from: k */
    public final void mo48864k(ConnectionResult connectionResult) {
        mo48860I();
        mo48862i(!connectionResult.mo30461u1());
        this.f35193a.mo45938k(connectionResult);
        this.f35193a.f31925o.mo28877c(connectionResult);
    }

    /* renamed from: l */
    public final void mo48865l(ConnectionResult connectionResult, C4013a aVar, boolean z) {
        int b = aVar.mo30535c().mo30542b();
        if ((!z || connectionResult.mo30461u1() || this.f35196d.mo49851c(connectionResult.mo30457r1()) != null) && (this.f35197e == null || b < this.f35198f)) {
            this.f35197e = connectionResult;
            this.f35198f = b;
        }
        this.f35193a.f31917g.put(aVar.mo30534b(), connectionResult);
    }

    /* renamed from: m */
    public final void mo48866m() {
        if (this.f35200h == 0) {
            if (!this.f35205m || this.f35206n) {
                ArrayList arrayList = new ArrayList();
                this.f35199g = 1;
                this.f35200h = this.f35193a.f31916f.size();
                for (C4013a.C4016c cVar : this.f35193a.f31916f.keySet()) {
                    if (!this.f35193a.f31917g.containsKey(cVar)) {
                        arrayList.add((C4013a.C4021f) this.f35193a.f31916f.get(cVar));
                    } else if (mo48868o()) {
                        mo48863j();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f35213u.add(nz7.m49109a().submit(new oy7(this, arrayList)));
                }
            }
        }
    }

    /* renamed from: n */
    public final boolean mo48867n(int i) {
        if (this.f35199g == i) {
            return true;
        }
        this.f35193a.f31924n.mo43985m();
        "Unexpected callback in ".concat(toString());
        int i2 = this.f35200h;
        StringBuilder sb = new StringBuilder();
        sb.append("mRemainingConnections=");
        sb.append(i2);
        int i3 = this.f35199g;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(m53630q(i3));
        sb2.append(" but received callback for step ");
        sb2.append(m53630q(i));
        new Exception();
        mo48864k(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }

    /* renamed from: o */
    public final boolean mo48868o() {
        int i = this.f35200h - 1;
        this.f35200h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.f35193a.f31924n.mo43985m();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            mo48864k(new ConnectionResult(8, (PendingIntent) null));
            return false;
        }
        ConnectionResult connectionResult = this.f35197e;
        if (connectionResult == null) {
            return true;
        }
        this.f35193a.f31923m = this.f35198f;
        mo48864k(connectionResult);
        return false;
    }

    /* renamed from: p */
    public final boolean mo48869p(ConnectionResult connectionResult) {
        if (!this.f35204l || connectionResult.mo30461u1()) {
            return false;
        }
        return true;
    }
}
