package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C4028a;
import com.google.android.gms.common.api.internal.zabx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: iz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class iz7 extends GoogleApiClient implements b08 {

    /* renamed from: b */
    public final Lock f30173b;

    /* renamed from: c */
    public final m28 f30174c;

    /* renamed from: d */
    public l08 f30175d = null;

    /* renamed from: e */
    public final int f30176e;

    /* renamed from: f */
    public final Context f30177f;

    /* renamed from: g */
    public final Looper f30178g;

    /* renamed from: h */
    public final Queue f30179h = new LinkedList();

    /* renamed from: i */
    public volatile boolean f30180i;

    /* renamed from: j */
    public long f30181j;

    /* renamed from: k */
    public long f30182k;

    /* renamed from: l */
    public final gz7 f30183l;

    /* renamed from: m */
    public final yh2 f30184m;

    /* renamed from: n */
    public zabx f30185n;

    /* renamed from: o */
    public final Map f30186o;

    /* renamed from: p */
    public Set f30187p;

    /* renamed from: q */
    public final sg0 f30188q;

    /* renamed from: r */
    public final Map f30189r;

    /* renamed from: s */
    public final C4013a.C4014a f30190s;

    /* renamed from: t */
    public final ji3 f30191t;

    /* renamed from: u */
    public final ArrayList f30192u;

    /* renamed from: v */
    public Integer f30193v;

    /* renamed from: w */
    public Set f30194w;

    /* renamed from: x */
    public final l18 f30195x;

    /* renamed from: y */
    public final j28 f30196y;

    public iz7(Context context, Lock lock, Looper looper, sg0 sg0, yh2 yh2, C4013a.C4014a aVar, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        long j;
        Looper looper2 = looper;
        int i3 = i;
        if (true != ng0.m48763a()) {
            j = 120000;
        } else {
            j = 10000;
        }
        this.f30181j = j;
        this.f30182k = 5000;
        this.f30187p = new HashSet();
        this.f30191t = new ji3();
        this.f30193v = null;
        this.f30194w = null;
        xy7 xy7 = new xy7(this);
        this.f30196y = xy7;
        this.f30177f = context;
        this.f30173b = lock;
        this.f30174c = new m28(looper, xy7);
        this.f30178g = looper2;
        this.f30183l = new gz7(this, looper);
        this.f30184m = yh2;
        this.f30176e = i3;
        if (i3 >= 0) {
            this.f30193v = Integer.valueOf(i2);
        }
        this.f30189r = map;
        this.f30186o = map2;
        this.f30192u = arrayList;
        this.f30195x = new l18();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f30174c.mo45611f((GoogleApiClient.C4011b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f30174c.mo45612g((GoogleApiClient.C4012c) it2.next());
        }
        this.f30188q = sg0;
        this.f30190s = aVar;
    }

    /* renamed from: l */
    public static int m46066l(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            C4013a.C4021f fVar = (C4013a.C4021f) it.next();
            z2 |= fVar.mo30551j();
            z3 |= fVar.mo30545c();
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    /* renamed from: n */
    public static String m46067n(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m46068o(iz7 iz7) {
        iz7.f30173b.lock();
        try {
            if (iz7.f30180i) {
                iz7.mo43988s();
            }
        } finally {
            iz7.f30173b.unlock();
        }
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ void m46069p(iz7 iz7) {
        iz7.f30173b.lock();
        try {
            if (iz7.mo43986q()) {
                iz7.mo43988s();
            }
        } finally {
            iz7.f30173b.unlock();
        }
    }

    /* renamed from: a */
    public final void mo28875a(Bundle bundle) {
        while (!this.f30179h.isEmpty()) {
            mo30500e((C4028a) this.f30179h.remove());
        }
        this.f30174c.mo45609d(bundle);
    }

    /* renamed from: b */
    public final void mo28876b(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.f30180i) {
                this.f30180i = true;
                if (this.f30185n == null && !ng0.m48763a()) {
                    try {
                        this.f30185n = this.f30184m.mo49678u(this.f30177f.getApplicationContext(), new hz7(this));
                    } catch (SecurityException unused) {
                    }
                }
                gz7 gz7 = this.f30183l;
                gz7.sendMessageDelayed(gz7.obtainMessage(1), this.f30181j);
                gz7 gz72 = this.f30183l;
                gz72.sendMessageDelayed(gz72.obtainMessage(2), this.f30182k);
            }
            i = 1;
        }
        for (BasePendingResult d : (BasePendingResult[]) this.f30195x.f31154a.toArray(new BasePendingResult[0])) {
            d.mo30577d(l18.f31153c);
        }
        this.f30174c.mo45610e(i);
        this.f30174c.mo45606a();
        if (i == 2) {
            mo43988s();
        }
    }

    /* renamed from: c */
    public final void mo28877c(ConnectionResult connectionResult) {
        if (!this.f30184m.mo49853k(this.f30177f, connectionResult.mo30457r1())) {
            mo43986q();
        }
        if (!this.f30180i) {
            this.f30174c.mo45608c(connectionResult);
            this.f30174c.mo45606a();
        }
    }

    public final void connect() {
        boolean z;
        this.f30173b.lock();
        try {
            int i = 2;
            boolean z2 = false;
            if (this.f30176e >= 0) {
                if (this.f30193v != null) {
                    z = true;
                } else {
                    z = false;
                }
                cu4.m43226p(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f30193v;
                if (num == null) {
                    this.f30193v = Integer.valueOf(m46066l(this.f30186o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) cu4.m43221k(this.f30193v)).intValue();
            this.f30173b.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                cu4.m43212b(z2, "Illegal sign-in mode: " + i);
                mo43987r(i);
                mo43988s();
            }
            z2 = true;
            cu4.m43212b(z2, "Illegal sign-in mode: " + i);
            mo43987r(i);
            mo43988s();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f30173b.unlock();
        }
    }

    /* renamed from: d */
    public final void mo30498d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f30177f);
        printWriter.append(str).append("mResuming=").print(this.f30180i);
        printWriter.append(" mWorkQueue.size()=").print(this.f30179h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f30195x.f31154a.size());
        l08 l08 = this.f30175d;
        if (l08 != null) {
            l08.mo45322d(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void disconnect() {
        Lock lock;
        this.f30173b.lock();
        try {
            this.f30195x.mo45332b();
            l08 l08 = this.f30175d;
            if (l08 != null) {
                l08.mo45321c();
            }
            this.f30191t.mo44472a();
            for (C4028a aVar : this.f30179h) {
                aVar.mo30585n((k18) null);
                aVar.mo30575b();
            }
            this.f30179h.clear();
            if (this.f30175d == null) {
                lock = this.f30173b;
            } else {
                mo43986q();
                this.f30174c.mo45606a();
                lock = this.f30173b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f30173b.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public final <A extends C4013a.C4015b, T extends C4028a<? extends eg5, A>> T mo30500e(T t) {
        String str;
        Lock lock;
        C4013a<?> p = t.mo30598p();
        boolean containsKey = this.f30186o.containsKey(t.mo30599q());
        if (p != null) {
            str = p.mo30536d();
        } else {
            str = "the API";
        }
        cu4.m43212b(containsKey, "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.f30173b.lock();
        try {
            l08 l08 = this.f30175d;
            if (l08 != null) {
                if (this.f30180i) {
                    this.f30179h.add(t);
                    while (!this.f30179h.isEmpty()) {
                        C4028a aVar = (C4028a) this.f30179h.remove();
                        this.f30195x.mo45331a(aVar);
                        aVar.mo30603u(Status.f22193y);
                    }
                    lock = this.f30173b;
                } else {
                    t = l08.mo45324f(t);
                    lock = this.f30173b;
                }
                lock.unlock();
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f30173b.unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public final Looper mo30501f() {
        return this.f30178g;
    }

    /* renamed from: g */
    public final boolean mo30502g() {
        l08 l08 = this.f30175d;
        if (l08 == null || !l08.mo45323e()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo30503h(GoogleApiClient.C4012c cVar) {
        this.f30174c.mo45612g(cVar);
    }

    /* renamed from: i */
    public final void mo30504i(GoogleApiClient.C4012c cVar) {
        this.f30174c.mo45613h(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30505j(p000.j18 r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f30173b
            r0.lock()
            java.util.Set r0 = r2.f30194w     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L_0x0016
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0016:
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x0027
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0027:
            java.util.concurrent.locks.Lock r3 = r2.f30173b     // Catch:{ all -> 0x0057 }
            r3.lock()     // Catch:{ all -> 0x0057 }
            java.util.Set r3 = r2.f30194w     // Catch:{ all -> 0x0050 }
            if (r3 != 0) goto L_0x0036
            java.util.concurrent.locks.Lock r3 = r2.f30173b     // Catch:{ all -> 0x0057 }
            r3.unlock()     // Catch:{ all -> 0x0057 }
            goto L_0x0043
        L_0x0036:
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0050 }
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.f30173b     // Catch:{ all -> 0x0057 }
            r0.unlock()     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x004a
        L_0x0043:
            l08 r3 = r2.f30175d     // Catch:{ all -> 0x0057 }
            if (r3 == 0) goto L_0x004a
            r3.mo45320b()     // Catch:{ all -> 0x0057 }
        L_0x004a:
            java.util.concurrent.locks.Lock r3 = r2.f30173b
            r3.unlock()
            return
        L_0x0050:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f30173b     // Catch:{ all -> 0x0057 }
            r0.unlock()     // Catch:{ all -> 0x0057 }
            throw r3     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f30173b
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.iz7.mo30505j(j18):void");
    }

    /* renamed from: m */
    public final String mo43985m() {
        StringWriter stringWriter = new StringWriter();
        mo30498d("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    /* renamed from: q */
    public final boolean mo43986q() {
        if (!this.f30180i) {
            return false;
        }
        this.f30180i = false;
        this.f30183l.removeMessages(2);
        this.f30183l.removeMessages(1);
        zabx zabx = this.f30185n;
        if (zabx != null) {
            zabx.mo30605b();
            this.f30185n = null;
        }
        return true;
    }

    /* renamed from: r */
    public final void mo43987r(int i) {
        Integer num = this.f30193v;
        if (num == null) {
            this.f30193v = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            int intValue = this.f30193v.intValue();
            throw new IllegalStateException("Cannot use sign-in mode: " + m46067n(i) + ". Mode was already set to " + m46067n(intValue));
        }
        if (this.f30175d == null) {
            boolean z = false;
            boolean z2 = false;
            for (C4013a.C4021f fVar : this.f30186o.values()) {
                z |= fVar.mo30551j();
                z2 |= fVar.mo30545c();
            }
            int intValue2 = this.f30193v.intValue();
            if (intValue2 != 1) {
                if (intValue2 == 2 && z) {
                    this.f30175d = wx7.m54110m(this.f30177f, this, this.f30173b, this.f30178g, this.f30184m, this.f30186o, this.f30188q, this.f30189r, this.f30190s, this.f30192u);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.f30175d = new mz7(this.f30177f, this, this.f30173b, this.f30178g, this.f30184m, this.f30186o, this.f30188q, this.f30189r, this.f30190s, this.f30192u, this);
        }
    }

    /* renamed from: s */
    public final void mo43988s() {
        this.f30174c.mo45607b();
        ((l08) cu4.m43221k(this.f30175d)).mo45319a();
    }
}
