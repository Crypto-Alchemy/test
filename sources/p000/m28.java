package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: m28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class m28 implements Handler.Callback {
    @NotOnlyInitialized

    /* renamed from: a */
    public final j28 f31487a;

    /* renamed from: d */
    public final ArrayList f31488d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f31489e = new ArrayList();

    /* renamed from: g */
    public final ArrayList f31490g = new ArrayList();

    /* renamed from: k */
    public volatile boolean f31491k = false;

    /* renamed from: r */
    public final AtomicInteger f31492r = new AtomicInteger(0);

    /* renamed from: s */
    public boolean f31493s = false;

    /* renamed from: x */
    public final Handler f31494x;

    /* renamed from: y */
    public final Object f31495y = new Object();

    public m28(Looper looper, j28 j28) {
        this.f31487a = j28;
        this.f31494x = new s38(looper, this);
    }

    /* renamed from: a */
    public final void mo45606a() {
        this.f31491k = false;
        this.f31492r.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo45607b() {
        this.f31491k = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45608c(com.google.android.gms.common.ConnectionResult r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.f31494x
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            p000.cu4.m43215e(r0, r1)
            android.os.Handler r0 = r5.f31494x
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.f31495y
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            java.util.ArrayList r2 = r5.f31490g     // Catch:{ all -> 0x004a }
            r1.<init>(r2)     // Catch:{ all -> 0x004a }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.f31492r     // Catch:{ all -> 0x004a }
            int r2 = r2.get()     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004a }
            com.google.android.gms.common.api.GoogleApiClient$c r3 = (com.google.android.gms.common.api.GoogleApiClient.C4012c) r3     // Catch:{ all -> 0x004a }
            boolean r4 = r5.f31491k     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicInteger r4 = r5.f31492r     // Catch:{ all -> 0x004a }
            int r4 = r4.get()     // Catch:{ all -> 0x004a }
            if (r4 == r2) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            java.util.ArrayList r4 = r5.f31490g     // Catch:{ all -> 0x004a }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0021
            r3.onConnectionFailed(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0021
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m28.mo45608c(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: d */
    public final void mo45609d(Bundle bundle) {
        cu4.m43215e(this.f31494x, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f31495y) {
            cu4.m43225o(!this.f31493s);
            this.f31494x.removeMessages(1);
            this.f31493s = true;
            cu4.m43225o(this.f31489e.isEmpty());
            ArrayList arrayList = new ArrayList(this.f31488d);
            int i = this.f31492r.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoogleApiClient.C4011b bVar = (GoogleApiClient.C4011b) it.next();
                if (!this.f31491k || !this.f31487a.mo44009b()) {
                    break;
                } else if (this.f31492r.get() != i) {
                    break;
                } else if (!this.f31489e.contains(bVar)) {
                    bVar.onConnected(bundle);
                }
            }
            this.f31489e.clear();
            this.f31493s = false;
        }
    }

    /* renamed from: e */
    public final void mo45610e(int i) {
        cu4.m43215e(this.f31494x, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f31494x.removeMessages(1);
        synchronized (this.f31495y) {
            this.f31493s = true;
            ArrayList arrayList = new ArrayList(this.f31488d);
            int i2 = this.f31492r.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoogleApiClient.C4011b bVar = (GoogleApiClient.C4011b) it.next();
                if (!this.f31491k) {
                    break;
                } else if (this.f31492r.get() != i2) {
                    break;
                } else if (this.f31488d.contains(bVar)) {
                    bVar.onConnectionSuspended(i);
                }
            }
            this.f31489e.clear();
            this.f31493s = false;
        }
    }

    /* renamed from: f */
    public final void mo45611f(GoogleApiClient.C4011b bVar) {
        cu4.m43221k(bVar);
        synchronized (this.f31495y) {
            if (this.f31488d.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
            } else {
                this.f31488d.add(bVar);
            }
        }
        if (this.f31487a.mo44009b()) {
            Handler handler = this.f31494x;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: g */
    public final void mo45612g(GoogleApiClient.C4012c cVar) {
        cu4.m43221k(cVar);
        synchronized (this.f31495y) {
            if (this.f31490g.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder();
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
            } else {
                this.f31490g.add(cVar);
            }
        }
    }

    /* renamed from: h */
    public final void mo45613h(GoogleApiClient.C4012c cVar) {
        cu4.m43221k(cVar);
        synchronized (this.f31495y) {
            if (!this.f31490g.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder();
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            GoogleApiClient.C4011b bVar = (GoogleApiClient.C4011b) message.obj;
            synchronized (this.f31495y) {
                if (this.f31491k && this.f31487a.mo44009b() && this.f31488d.contains(bVar)) {
                    bVar.onConnected((Bundle) null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i, new Exception());
        return false;
    }
}
