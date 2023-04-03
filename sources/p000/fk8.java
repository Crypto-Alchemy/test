package p000;

import android.os.RemoteException;

/* renamed from: fk8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public abstract class fk8 implements Runnable {

    /* renamed from: a */
    public final long f28894a;

    /* renamed from: d */
    public final long f28895d;

    /* renamed from: e */
    public final boolean f28896e;

    /* renamed from: g */
    public final /* synthetic */ cm8 f28897g;

    public fk8(cm8 cm8, boolean z) {
        this.f28897g = cm8;
        this.f28894a = cm8.f21809b.mo29580a();
        this.f28895d = cm8.f21809b.mo29581b();
        this.f28896e = z;
    }

    /* renamed from: a */
    public abstract void mo28979a() throws RemoteException;

    /* renamed from: b */
    public void mo42597b() {
    }

    public final void run() {
        if (this.f28897g.f21814g) {
            mo42597b();
            return;
        }
        try {
            mo28979a();
        } catch (Exception e) {
            this.f28897g.mo30048o(e, false, this.f28896e);
            mo42597b();
        }
    }
}
