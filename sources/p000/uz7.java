package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.C4023b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p000.ii3;

/* renamed from: uz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class uz7 implements GoogleApiClient.C4011b, GoogleApiClient.C4012c, t38 {

    /* renamed from: a */
    public final Queue f34789a = new LinkedList();
    @NotOnlyInitialized

    /* renamed from: b */
    public final C4013a.C4021f f34790b;

    /* renamed from: c */
    public final C6286nm f34791c;

    /* renamed from: d */
    public final cy7 f34792d;

    /* renamed from: e */
    public final Set f34793e = new HashSet();

    /* renamed from: f */
    public final Map f34794f = new HashMap();

    /* renamed from: g */
    public final int f34795g;

    /* renamed from: h */
    public final w08 f34796h;

    /* renamed from: i */
    public boolean f34797i;

    /* renamed from: j */
    public final List f34798j = new ArrayList();

    /* renamed from: k */
    public ConnectionResult f34799k = null;

    /* renamed from: l */
    public int f34800l = 0;

    /* renamed from: m */
    public final /* synthetic */ bi2 f34801m;

    public uz7(bi2 bi2, C4023b bVar) {
        this.f34801m = bi2;
        C4013a.C4021f l = bVar.mo30568l(bi2.f21334M.getLooper(), this);
        this.f34790b = l;
        this.f34791c = bVar.mo30559c();
        this.f34792d = new cy7();
        this.f34795g = bVar.mo30567k();
        if (l.mo30551j()) {
            this.f34796h = bVar.mo30569m(bi2.f21342s, bi2.f21334M);
        } else {
            this.f34796h = null;
        }
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ void m53135y(uz7 uz7, wz7 wz7) {
        if (!uz7.f34798j.contains(wz7) || uz7.f34797i) {
            return;
        }
        if (!uz7.f34790b.mo30544b()) {
            uz7.mo48591B();
        } else {
            uz7.mo48607f();
        }
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ void m53136z(uz7 uz7, wz7 wz7) {
        Feature[] g;
        if (uz7.f34798j.remove(wz7)) {
            uz7.f34801m.f21334M.removeMessages(15, wz7);
            uz7.f34801m.f21334M.removeMessages(16, wz7);
            Feature a = wz7.f35492b;
            ArrayList arrayList = new ArrayList(uz7.f34789a.size());
            for (i28 i28 : uz7.f34789a) {
                if ((i28 instanceof d08) && (g = ((d08) i28).mo29437g(uz7)) != null && C6441rq.m51220c(g, a)) {
                    arrayList.add(i28);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                i28 i282 = (i28) arrayList.get(i);
                uz7.f34789a.remove(i282);
                i282.mo29428b(new UnsupportedApiCallException(a));
            }
        }
    }

    /* renamed from: A */
    public final void mo48590A() {
        cu4.m43214d(this.f34801m.f21334M);
        this.f34799k = null;
    }

    /* renamed from: B */
    public final void mo48591B() {
        cu4.m43214d(this.f34801m.f21334M);
        if (!this.f34790b.mo30544b() && !this.f34790b.mo30547e()) {
            try {
                bi2 bi2 = this.f34801m;
                int b = bi2.f21344y.mo46302b(bi2.f21342s, this.f34790b);
                if (b != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(b, (PendingIntent) null);
                    String name = this.f34790b.getClass().getName();
                    String obj = connectionResult.toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    mo48594E(connectionResult, (Exception) null);
                    return;
                }
                bi2 bi22 = this.f34801m;
                C4013a.C4021f fVar = this.f34790b;
                yz7 yz7 = new yz7(bi22, fVar, this.f34791c);
                if (fVar.mo30551j()) {
                    ((w08) cu4.m43221k(this.f34796h)).mo48877t1(yz7);
                }
                try {
                    this.f34790b.mo30554n(yz7);
                } catch (SecurityException e) {
                    mo48594E(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                mo48594E(new ConnectionResult(10), e2);
            }
        }
    }

    /* renamed from: C */
    public final void mo48592C(i28 i28) {
        cu4.m43214d(this.f34801m.f21334M);
        if (!this.f34790b.mo30544b()) {
            this.f34789a.add(i28);
            ConnectionResult connectionResult = this.f34799k;
            if (connectionResult == null || !connectionResult.mo30461u1()) {
                mo48591B();
            } else {
                mo48594E(this.f34799k, (Exception) null);
            }
        } else if (mo48613l(i28)) {
            mo48610i();
        } else {
            this.f34789a.add(i28);
        }
    }

    /* renamed from: D */
    public final void mo48593D() {
        this.f34800l++;
    }

    /* renamed from: E */
    public final void mo48594E(ConnectionResult connectionResult, Exception exc) {
        cu4.m43214d(this.f34801m.f21334M);
        w08 w08 = this.f34796h;
        if (w08 != null) {
            w08.mo48878u1();
        }
        mo48590A();
        this.f34801m.f21344y.mo46303c();
        mo48604c(connectionResult);
        if ((this.f34790b instanceof e38) && connectionResult.mo30457r1() != 24) {
            this.f34801m.f21339g = true;
            bi2 bi2 = this.f34801m;
            bi2.f21334M.sendMessageDelayed(bi2.f21334M.obtainMessage(19), 300000);
        }
        if (connectionResult.mo30457r1() == 4) {
            mo48605d(bi2.f21325U);
        } else if (this.f34789a.isEmpty()) {
            this.f34799k = connectionResult;
        } else if (exc != null) {
            cu4.m43214d(this.f34801m.f21334M);
            mo48606e((Status) null, exc, false);
        } else if (this.f34801m.f21335P) {
            mo48606e(bi2.m32549h(this.f34791c, connectionResult), (Exception) null, true);
            if (!this.f34789a.isEmpty() && !mo48614m(connectionResult) && !this.f34801m.mo29602g(connectionResult, this.f34795g)) {
                if (connectionResult.mo30457r1() == 18) {
                    this.f34797i = true;
                }
                if (this.f34797i) {
                    bi2 bi22 = this.f34801m;
                    bi22.f21334M.sendMessageDelayed(Message.obtain(bi22.f21334M, 9, this.f34791c), this.f34801m.f21336a);
                    return;
                }
                mo48605d(bi2.m32549h(this.f34791c, connectionResult));
            }
        } else {
            mo48605d(bi2.m32549h(this.f34791c, connectionResult));
        }
    }

    /* renamed from: E0 */
    public final void mo45935E0(ConnectionResult connectionResult, C4013a aVar, boolean z) {
        throw null;
    }

    /* renamed from: F */
    public final void mo48595F(ConnectionResult connectionResult) {
        cu4.m43214d(this.f34801m.f21334M);
        C4013a.C4021f fVar = this.f34790b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        fVar.mo30546d("onSignInFailed for " + name + " with " + valueOf);
        mo48594E(connectionResult, (Exception) null);
    }

    /* renamed from: G */
    public final void mo48596G(q28 q28) {
        cu4.m43214d(this.f34801m.f21334M);
        this.f34793e.add(q28);
    }

    /* renamed from: H */
    public final void mo48597H() {
        cu4.m43214d(this.f34801m.f21334M);
        if (this.f34797i) {
            mo48591B();
        }
    }

    /* renamed from: I */
    public final void mo48598I() {
        cu4.m43214d(this.f34801m.f21334M);
        mo48605d(bi2.f21324Q);
        this.f34792d.mo41777f();
        for (ii3.C5966a f28 : (ii3.C5966a[]) this.f34794f.keySet().toArray(new ii3.C5966a[0])) {
            mo48592C(new f28(f28, new xl6()));
        }
        mo48604c(new ConnectionResult(4));
        if (this.f34790b.mo30544b()) {
            this.f34790b.mo30550h(new tz7(this));
        }
    }

    /* renamed from: J */
    public final void mo48599J() {
        Status status;
        cu4.m43214d(this.f34801m.f21334M);
        if (this.f34797i) {
            mo48612k();
            bi2 bi2 = this.f34801m;
            if (bi2.f21343x.mo49669i(bi2.f21342s) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            mo48605d(status);
            this.f34790b.mo30546d("Timing out connection while resuming.");
        }
    }

    /* renamed from: L */
    public final boolean mo48600L() {
        return this.f34790b.mo30544b();
    }

    /* renamed from: M */
    public final boolean mo48601M() {
        return this.f34790b.mo30551j();
    }

    /* renamed from: a */
    public final boolean mo48602a() {
        return mo48615n(true);
    }

    /* renamed from: b */
    public final Feature mo48603b(Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] q = this.f34790b.mo30556q();
            if (q == null) {
                q = new Feature[0];
            }
            C2781lq lqVar = new C2781lq(r3);
            for (Feature feature : q) {
                lqVar.put(feature.mo30469r1(), Long.valueOf(feature.mo30470s1()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) lqVar.get(feature2.mo30469r1());
                if (l == null || l.longValue() < feature2.mo30470s1()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo48604c(ConnectionResult connectionResult) {
        String str;
        for (q28 q28 : this.f34793e) {
            if (if4.m45709a(connectionResult, ConnectionResult.f22149k)) {
                str = this.f34790b.mo30548f();
            } else {
                str = null;
            }
            q28.mo46940b(this.f34791c, connectionResult, str);
        }
        this.f34793e.clear();
    }

    /* renamed from: d */
    public final void mo48605d(Status status) {
        cu4.m43214d(this.f34801m.f21334M);
        mo48606e(status, (Exception) null, false);
    }

    /* renamed from: e */
    public final void mo48606e(Status status, Exception exc, boolean z) {
        boolean z2;
        cu4.m43214d(this.f34801m.f21334M);
        boolean z3 = false;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc == null) {
            z3 = true;
        }
        if (z2 != z3) {
            Iterator it = this.f34789a.iterator();
            while (it.hasNext()) {
                i28 i28 = (i28) it.next();
                if (!z || i28.f29788a == 2) {
                    if (status != null) {
                        i28.mo29427a(status);
                    } else {
                        i28.mo29428b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: f */
    public final void mo48607f() {
        ArrayList arrayList = new ArrayList(this.f34789a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            i28 i28 = (i28) arrayList.get(i);
            if (this.f34790b.mo30544b()) {
                if (mo48613l(i28)) {
                    this.f34789a.remove(i28);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo48608g() {
        mo48590A();
        mo48604c(ConnectionResult.f22149k);
        mo48612k();
        Iterator it = this.f34794f.values().iterator();
        if (!it.hasNext()) {
            mo48607f();
            mo48610i();
            return;
        }
        ((r08) it.next()).getClass();
        throw null;
    }

    /* renamed from: h */
    public final void mo48609h(int i) {
        mo48590A();
        this.f34797i = true;
        this.f34792d.mo41776e(i, this.f34790b.mo30557s());
        bi2 bi2 = this.f34801m;
        bi2.f21334M.sendMessageDelayed(Message.obtain(bi2.f21334M, 9, this.f34791c), this.f34801m.f21336a);
        bi2 bi22 = this.f34801m;
        bi22.f21334M.sendMessageDelayed(Message.obtain(bi22.f21334M, 11, this.f34791c), this.f34801m.f21337d);
        this.f34801m.f21344y.mo46303c();
        for (r08 r08 : this.f34794f.values()) {
            r08.f33304a.run();
        }
    }

    /* renamed from: i */
    public final void mo48610i() {
        this.f34801m.f21334M.removeMessages(12, this.f34791c);
        bi2 bi2 = this.f34801m;
        bi2.f21334M.sendMessageDelayed(bi2.f21334M.obtainMessage(12, this.f34791c), this.f34801m.f21338e);
    }

    /* renamed from: j */
    public final void mo48611j(i28 i28) {
        i28.mo29435d(this.f34792d, mo48601M());
        try {
            i28.mo29429c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f34790b.mo30546d("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: k */
    public final void mo48612k() {
        if (this.f34797i) {
            this.f34801m.f21334M.removeMessages(11, this.f34791c);
            this.f34801m.f21334M.removeMessages(9, this.f34791c);
            this.f34797i = false;
        }
    }

    /* renamed from: l */
    public final boolean mo48613l(i28 i28) {
        if (!(i28 instanceof d08)) {
            mo48611j(i28);
            return true;
        }
        d08 d08 = (d08) i28;
        Feature b = mo48603b(d08.mo29437g(this));
        if (b == null) {
            mo48611j(i28);
            return true;
        }
        String name = this.f34790b.getClass().getName();
        String r1 = b.mo30469r1();
        long s1 = b.mo30470s1();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(r1);
        sb.append(", ");
        sb.append(s1);
        sb.append(").");
        if (!this.f34801m.f21335P || !d08.mo29436f(this)) {
            d08.mo29428b(new UnsupportedApiCallException(b));
            return true;
        }
        wz7 wz7 = new wz7(this.f34791c, b, (vz7) null);
        int indexOf = this.f34798j.indexOf(wz7);
        if (indexOf >= 0) {
            wz7 wz72 = (wz7) this.f34798j.get(indexOf);
            this.f34801m.f21334M.removeMessages(15, wz72);
            bi2 bi2 = this.f34801m;
            bi2.f21334M.sendMessageDelayed(Message.obtain(bi2.f21334M, 15, wz72), this.f34801m.f21336a);
            return false;
        }
        this.f34798j.add(wz7);
        bi2 bi22 = this.f34801m;
        bi22.f21334M.sendMessageDelayed(Message.obtain(bi22.f21334M, 15, wz7), this.f34801m.f21336a);
        bi2 bi23 = this.f34801m;
        bi23.f21334M.sendMessageDelayed(Message.obtain(bi23.f21334M, 16, wz7), this.f34801m.f21337d);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (mo48614m(connectionResult)) {
            return false;
        }
        this.f34801m.mo29602g(connectionResult, this.f34795g);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo48614m(com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = p000.bi2.f21326X
            monitor-enter(r0)
            bi2 r1 = r3.f34801m     // Catch:{ all -> 0x002a }
            dy7 r2 = r1.f21331H     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f21332I     // Catch:{ all -> 0x002a }
            nm r2 = r3.f34791c     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            bi2 r1 = r3.f34801m     // Catch:{ all -> 0x002a }
            dy7 r1 = r1.f21331H     // Catch:{ all -> 0x002a }
            int r2 = r3.f34795g     // Catch:{ all -> 0x002a }
            r1.mo43071s(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uz7.mo48614m(com.google.android.gms.common.ConnectionResult):boolean");
    }

    /* renamed from: n */
    public final boolean mo48615n(boolean z) {
        cu4.m43214d(this.f34801m.f21334M);
        if (!this.f34790b.mo30544b() || this.f34794f.size() != 0) {
            return false;
        }
        if (this.f34792d.mo41778g()) {
            if (z) {
                mo48610i();
            }
            return false;
        }
        this.f34790b.mo30546d("Timing out service connection.");
        return true;
    }

    /* renamed from: o */
    public final int mo48616o() {
        return this.f34795g;
    }

    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f34801m.f21334M.getLooper()) {
            mo48608g();
        } else {
            this.f34801m.f21334M.post(new qz7(this));
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        mo48594E(connectionResult, (Exception) null);
    }

    public final void onConnectionSuspended(int i) {
        if (Looper.myLooper() == this.f34801m.f21334M.getLooper()) {
            mo48609h(i);
        } else {
            this.f34801m.f21334M.post(new rz7(this, i));
        }
    }

    /* renamed from: p */
    public final int mo48617p() {
        return this.f34800l;
    }

    /* renamed from: q */
    public final ConnectionResult mo48618q() {
        cu4.m43214d(this.f34801m.f21334M);
        return this.f34799k;
    }

    /* renamed from: s */
    public final C4013a.C4021f mo48619s() {
        return this.f34790b;
    }

    /* renamed from: u */
    public final Map mo48620u() {
        return this.f34794f;
    }
}
