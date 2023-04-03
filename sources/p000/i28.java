package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: i28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class i28 {

    /* renamed from: a */
    public final int f29788a;

    public i28(int i) {
        this.f29788a = i;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m45448e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo29427a(Status status);

    /* renamed from: b */
    public abstract void mo29428b(Exception exc);

    /* renamed from: c */
    public abstract void mo29429c(uz7 uz7) throws DeadObjectException;

    /* renamed from: d */
    public abstract void mo29435d(cy7 cy7, boolean z);
}
