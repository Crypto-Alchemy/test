package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: zo8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zo8 extends z48 {

    /* renamed from: g */
    public final IBinder f36202g;

    /* renamed from: h */
    public final /* synthetic */ C6462ry f36203h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zo8(C6462ry ryVar, int i, IBinder iBinder, Bundle bundle) {
        super(ryVar, i, bundle);
        this.f36203h = ryVar;
        this.f36202g = iBinder;
    }

    /* renamed from: f */
    public final void mo44572f(ConnectionResult connectionResult) {
        if (this.f36203h.f33646Z != null) {
            this.f36203h.f33646Z.onConnectionFailed(connectionResult);
        }
        this.f36203h.mo47536Q(connectionResult);
    }

    /* renamed from: g */
    public final boolean mo44573g() {
        try {
            IBinder iBinder = this.f36202g;
            cu4.m43221k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f36203h.mo28792J().equals(interfaceDescriptor)) {
                String J = this.f36203h.mo28792J();
                StringBuilder sb = new StringBuilder();
                sb.append("service descriptor mismatch: ");
                sb.append(J);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                return false;
            }
            IInterface x = this.f36203h.mo28795x(this.f36202g);
            if (x == null) {
                return false;
            }
            if (!C6462ry.m51380l0(this.f36203h, 2, 4, x) && !C6462ry.m51380l0(this.f36203h, 3, 4, x)) {
                return false;
            }
            this.f36203h.f33648b1 = null;
            Bundle C = this.f36203h.mo47527C();
            C6462ry ryVar = this.f36203h;
            if (ryVar.f33645Y != null) {
                ryVar.f33645Y.onConnected(C);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
