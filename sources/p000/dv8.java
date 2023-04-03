package p000;

import android.os.RemoteException;
import com.google.android.gms.clearcut.C4003a;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4028a;

/* renamed from: dv8 */
public final class dv8 extends C4028a<Status, a19> {

    /* renamed from: r */
    public final zze f28325r;

    public dv8(zze zze, GoogleApiClient googleApiClient) {
        super(C4003a.f22089p, googleApiClient);
        this.f28325r = zze;
    }

    /* renamed from: c */
    public final /* synthetic */ eg5 mo30576c(Status status) {
        return status;
    }

    /* renamed from: o */
    public final /* synthetic */ void mo30597o(C4013a.C4015b bVar) throws RemoteException {
        a19 a19 = (a19) bVar;
        hy8 hy8 = new hy8(this);
        try {
            zze zze = this.f28325r;
            C4003a.C4006c cVar = zze.f22124A;
            if (cVar != null) {
                mv8 mv8 = zze.f22134y;
                if (mv8.f31842I.length == 0) {
                    mv8.f31842I = cVar.zza();
                }
            }
            C4003a.C4006c cVar2 = zze.f22125B;
            if (cVar2 != null) {
                mv8 mv82 = zze.f22134y;
                if (mv82.f31849Y.length == 0) {
                    mv82.f31849Y = cVar2.zza();
                }
            }
            mv8 mv83 = zze.f22134y;
            int d = mv83.mo29049d();
            byte[] bArr = new byte[d];
            as8.m31920b(mv83, bArr, 0, d);
            zze.f22127d = bArr;
            ((kb9) a19.mo47531I()).mo44741p1(hy8, this.f28325r);
        } catch (RuntimeException unused) {
            mo30603u(new Status(10, "MessageProducer"));
        }
    }
}
