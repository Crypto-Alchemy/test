package p000;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: uz8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class uz8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f34802a;

    /* renamed from: d */
    public final /* synthetic */ zzp f34803d;

    /* renamed from: e */
    public final /* synthetic */ g29 f34804e;

    public uz8(g29 g29, AtomicReference atomicReference, zzp zzp) {
        this.f34804e = g29;
        this.f34802a = atomicReference;
        this.f34803d = zzp;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f34802a) {
            try {
                if (!this.f34804e.f34342a.mo45275z().mo45483r().mo48331h()) {
                    this.f34804e.f34342a.mo45237A().mo29675r().mo48769a("Analytics storage consent denied; will not get app instance id");
                    this.f34804e.f34342a.mo45242F().mo47926o((String) null);
                    this.f34804e.f34342a.mo45275z().f31358g.mo43885b((String) null);
                    this.f34802a.set((Object) null);
                    this.f34802a.notify();
                    return;
                }
                am8 z = this.f34804e.f29060d;
                if (z == null) {
                    this.f34804e.f34342a.mo45237A().mo29670l().mo48769a("Failed to get app instance id");
                    this.f34802a.notify();
                    return;
                }
                cu4.m43221k(this.f34803d);
                this.f34802a.set(z.mo29021i(this.f34803d));
                String str = (String) this.f34802a.get();
                if (str != null) {
                    this.f34804e.f34342a.mo45242F().mo47926o(str);
                    this.f34804e.f34342a.mo45275z().f31358g.mo43885b(str);
                }
                this.f34804e.mo42710D();
                atomicReference = this.f34802a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f34804e.f34342a.mo45237A().mo29670l().mo48770b("Failed to get app instance id", e);
                    atomicReference = this.f34802a;
                } catch (Throwable th) {
                    this.f34802a.notify();
                    throw th;
                }
            }
        }
    }
}
