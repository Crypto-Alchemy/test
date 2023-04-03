package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p000.eg5;
import p000.fn4;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class BasePendingResult<R extends eg5> extends fn4<R> {

    /* renamed from: o */
    public static final ThreadLocal f22217o = new k38();

    /* renamed from: a */
    public final Object f22218a;

    /* renamed from: b */
    public final C4027a f22219b;

    /* renamed from: c */
    public final WeakReference f22220c;

    /* renamed from: d */
    public final CountDownLatch f22221d;

    /* renamed from: e */
    public final ArrayList f22222e;

    /* renamed from: f */
    public fg5 f22223f;

    /* renamed from: g */
    public final AtomicReference f22224g;

    /* renamed from: h */
    public eg5 f22225h;

    /* renamed from: i */
    public Status f22226i;

    /* renamed from: j */
    public volatile boolean f22227j;

    /* renamed from: k */
    public boolean f22228k;

    /* renamed from: l */
    public boolean f22229l;

    /* renamed from: m */
    public qn2 f22230m;
    @KeepName
    private o38 mResultGuardian;

    /* renamed from: n */
    public boolean f22231n;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class C4027a<R extends eg5> extends s38 {
        public C4027a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo30586a(fg5 fg5, eg5 eg5) {
            ThreadLocal threadLocal = BasePendingResult.f22217o;
            sendMessage(obtainMessage(1, new Pair((fg5) cu4.m43221k(fg5), eg5)));
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                fg5 fg5 = (fg5) pair.first;
                eg5 eg5 = (eg5) pair.second;
                try {
                    fg5.mo42594a(eg5);
                } catch (RuntimeException e) {
                    BasePendingResult.m33649l(eg5);
                    throw e;
                }
            } else if (i != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i, new Exception());
            } else {
                ((BasePendingResult) message.obj).mo30577d(Status.f22186A);
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f22218a = new Object();
        this.f22221d = new CountDownLatch(1);
        this.f22222e = new ArrayList();
        this.f22224g = new AtomicReference();
        this.f22231n = false;
        this.f22219b = new C4027a(Looper.getMainLooper());
        this.f22220c = new WeakReference((Object) null);
    }

    /* renamed from: l */
    public static void m33649l(eg5 eg5) {
        if (eg5 instanceof jc5) {
            try {
                ((jc5) eg5).mo44381a();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(eg5));
            }
        }
    }

    /* renamed from: a */
    public final void mo30574a(fn4.C5843a aVar) {
        boolean z;
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        cu4.m43212b(z, "Callback cannot be null.");
        synchronized (this.f22218a) {
            if (mo30579f()) {
                aVar.mo42613a(this.f22226i);
            } else {
                this.f22222e.add(aVar);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30575b() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f22218a
            monitor-enter(r0)
            boolean r1 = r2.f22228k     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r2.f22227j     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            qn2 r1 = r2.f22230m     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            r1.cancel()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0013:
            eg5 r1 = r2.f22225h     // Catch:{ all -> 0x0028 }
            m33649l(r1)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2.f22228k = r1     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f22187B     // Catch:{ all -> 0x0028 }
            eg5 r1 = r2.mo30576c(r1)     // Catch:{ all -> 0x0028 }
            r2.mo30582i(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo30575b():void");
    }

    /* renamed from: c */
    public abstract R mo30576c(Status status);

    @Deprecated
    /* renamed from: d */
    public final void mo30577d(Status status) {
        synchronized (this.f22218a) {
            if (!mo30579f()) {
                mo30580g(mo30576c(status));
                this.f22229l = true;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo30578e() {
        boolean z;
        synchronized (this.f22218a) {
            z = this.f22228k;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo30579f() {
        if (this.f22221d.getCount() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo30580g(R r) {
        synchronized (this.f22218a) {
            if (this.f22229l || this.f22228k) {
                m33649l(r);
                return;
            }
            mo30579f();
            cu4.m43226p(!mo30579f(), "Results have already been set");
            cu4.m43226p(!this.f22227j, "Result has already been consumed");
            mo30582i(r);
        }
    }

    /* renamed from: h */
    public final eg5 mo30581h() {
        eg5 eg5;
        synchronized (this.f22218a) {
            cu4.m43226p(!this.f22227j, "Result has already been consumed.");
            cu4.m43226p(mo30579f(), "Result is not ready.");
            eg5 = this.f22225h;
            this.f22225h = null;
            this.f22223f = null;
            this.f22227j = true;
        }
        k18 k18 = (k18) this.f22224g.getAndSet((Object) null);
        if (k18 != null) {
            k18.f30692a.f31154a.remove(this);
        }
        return (eg5) cu4.m43221k(eg5);
    }

    /* renamed from: i */
    public final void mo30582i(eg5 eg5) {
        this.f22225h = eg5;
        this.f22226i = eg5.mo30519e();
        this.f22230m = null;
        this.f22221d.countDown();
        if (this.f22228k) {
            this.f22223f = null;
        } else {
            fg5 fg5 = this.f22223f;
            if (fg5 != null) {
                this.f22219b.removeMessages(2);
                this.f22219b.mo30586a(fg5, mo30581h());
            } else if (this.f22225h instanceof jc5) {
                this.mResultGuardian = new o38(this, (m38) null);
            }
        }
        ArrayList arrayList = this.f22222e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fn4.C5843a) arrayList.get(i)).mo42613a(this.f22226i);
        }
        this.f22222e.clear();
    }

    /* renamed from: k */
    public final void mo30583k() {
        boolean z = true;
        if (!this.f22231n && !((Boolean) f22217o.get()).booleanValue()) {
            z = false;
        }
        this.f22231n = z;
    }

    /* renamed from: m */
    public final boolean mo30584m() {
        boolean e;
        synchronized (this.f22218a) {
            if (((GoogleApiClient) this.f22220c.get()) == null || !this.f22231n) {
                mo30575b();
            }
            e = mo30578e();
        }
        return e;
    }

    /* renamed from: n */
    public final void mo30585n(k18 k18) {
        this.f22224g.set(k18);
    }

    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.f22218a = new Object();
        this.f22221d = new CountDownLatch(1);
        this.f22222e = new ArrayList();
        this.f22224g = new AtomicReference();
        this.f22231n = false;
        this.f22219b = new C4027a(googleApiClient != null ? googleApiClient.mo30501f() : Looper.getMainLooper());
        this.f22220c = new WeakReference(googleApiClient);
    }
}
