package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import p000.C6462ry;

/* renamed from: e29 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class e29 implements ServiceConnection, C6462ry.C6463a, C6462ry.C6464b {

    /* renamed from: a */
    public volatile boolean f28372a;

    /* renamed from: d */
    public volatile pm8 f28373d;

    /* renamed from: e */
    public final /* synthetic */ g29 f28374e;

    public e29(g29 g29) {
        this.f28374e = g29;
    }

    /* renamed from: a */
    public final void mo42121a(Intent intent) {
        this.f28374e.mo29006e();
        Context q = this.f28374e.f34342a.mo45271q();
        rp0 b = rp0.m51209b();
        synchronized (this) {
            if (this.f28372a) {
                this.f28374e.f34342a.mo45237A().mo29678v().mo48769a("Connection attempt already in progress");
                return;
            }
            this.f28374e.f34342a.mo45237A().mo29678v().mo48769a("Using local app measurement service");
            this.f28372a = true;
            b.mo47466a(q, intent, this.f28374e.f29059c, 129);
        }
    }

    /* renamed from: b */
    public final void mo42122b() {
        if (this.f28373d != null && (this.f28373d.mo47545b() || this.f28373d.mo47549e())) {
            this.f28373d.mo47544a();
        }
        this.f28373d = null;
    }

    /* renamed from: c */
    public final void mo42123c() {
        this.f28374e.mo29006e();
        Context q = this.f28374e.f34342a.mo45271q();
        synchronized (this) {
            if (this.f28372a) {
                this.f28374e.f34342a.mo45237A().mo29678v().mo48769a("Connection attempt already in progress");
            } else if (this.f28373d == null || (!this.f28373d.mo47549e() && !this.f28373d.mo47545b())) {
                this.f28373d = new pm8(q, Looper.getMainLooper(), this, this);
                this.f28374e.f34342a.mo45237A().mo29678v().mo48769a("Connecting to remote service");
                this.f28372a = true;
                cu4.m43221k(this.f28373d);
                this.f28373d.mo47561v();
            } else {
                this.f28374e.f34342a.mo45237A().mo29678v().mo48769a("Already awaiting connection attempt");
            }
        }
    }

    public final void onConnected(Bundle bundle) {
        cu4.m43216f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                cu4.m43221k(this.f28373d);
                this.f28374e.f34342a.mo45272s().mo41640o(new x19(this, (am8) this.f28373d.mo47531I()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f28373d = null;
                this.f28372a = false;
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        cu4.m43216f("MeasurementServiceConnection.onConnectionFailed");
        bn8 B = this.f28374e.f34342a.mo45238B();
        if (B != null) {
            B.mo29673o().mo48770b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f28372a = false;
            this.f28373d = null;
        }
        this.f28374e.f34342a.mo45272s().mo41640o(new c29(this));
    }

    public final void onConnectionSuspended(int i) {
        cu4.m43216f("MeasurementServiceConnection.onConnectionSuspended");
        this.f28374e.f34342a.mo45237A().mo29677u().mo48769a("Service connection suspended");
        this.f28374e.f34342a.mo45272s().mo41640o(new a29(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f28374e.f34342a.mo45237A().mo29670l().mo48769a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            p000.cu4.m43216f(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.f28372a = r4     // Catch:{ all -> 0x0063 }
            g29 r4 = r3.f28374e     // Catch:{ all -> 0x0063 }
            kr8 r4 = r4.f34342a     // Catch:{ all -> 0x0063 }
            bn8 r4 = r4.mo45237A()     // Catch:{ all -> 0x0063 }
            vm8 r4 = r4.mo29670l()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo48769a(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof p000.am8     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            am8 r1 = (p000.am8) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            ul8 r1 = new ul8     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            g29 r5 = r3.f28374e     // Catch:{ RemoteException -> 0x0065 }
            kr8 r5 = r5.f34342a     // Catch:{ RemoteException -> 0x0065 }
            bn8 r5 = r5.mo45237A()     // Catch:{ RemoteException -> 0x0065 }
            vm8 r5 = r5.mo29678v()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo48769a(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            g29 r5 = r3.f28374e     // Catch:{ RemoteException -> 0x0065 }
            kr8 r5 = r5.f34342a     // Catch:{ RemoteException -> 0x0065 }
            bn8 r5 = r5.mo45237A()     // Catch:{ RemoteException -> 0x0065 }
            vm8 r5 = r5.mo29670l()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo48770b(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            g29 r5 = r3.f28374e     // Catch:{ all -> 0x0063 }
            kr8 r5 = r5.f34342a     // Catch:{ all -> 0x0063 }
            bn8 r5 = r5.mo45237A()     // Catch:{ all -> 0x0063 }
            vm8 r5 = r5.mo29670l()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo48769a(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.f28372a = r4     // Catch:{ all -> 0x0063 }
            rp0 r4 = p000.rp0.m51209b()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            g29 r5 = r3.f28374e     // Catch:{ IllegalArgumentException -> 0x00a0 }
            kr8 r5 = r5.f34342a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.mo45271q()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            g29 r0 = r3.f28374e     // Catch:{ IllegalArgumentException -> 0x00a0 }
            e29 r0 = r0.f29059c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.mo47467c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            g29 r4 = r3.f28374e     // Catch:{ all -> 0x0063 }
            kr8 r4 = r4.f34342a     // Catch:{ all -> 0x0063 }
            cr8 r4 = r4.mo45272s()     // Catch:{ all -> 0x0063 }
            r19 r5 = new r19     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.mo41640o(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e29.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        cu4.m43216f("MeasurementServiceConnection.onServiceDisconnected");
        this.f28374e.f34342a.mo45237A().mo29677u().mo48769a("Service disconnected");
        this.f28374e.f34342a.mo45272s().mo41640o(new u19(this, componentName));
    }
}
