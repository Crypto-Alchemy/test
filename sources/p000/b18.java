package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: b18 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class b18 extends d08 {

    /* renamed from: b */
    public final xl6 f21115b;

    public b18(int i, xl6 xl6) {
        super(i);
        this.f21115b = xl6;
    }

    /* renamed from: a */
    public final void mo29427a(Status status) {
        this.f21115b.mo49506d(new ApiException(status));
    }

    /* renamed from: b */
    public final void mo29428b(Exception exc) {
        this.f21115b.mo49506d(exc);
    }

    /* renamed from: c */
    public final void mo29429c(uz7 uz7) throws DeadObjectException {
        try {
            mo29430h(uz7);
        } catch (DeadObjectException e) {
            mo29427a(i28.m45448e(e));
            throw e;
        } catch (RemoteException e2) {
            mo29427a(i28.m45448e(e2));
        } catch (RuntimeException e3) {
            this.f21115b.mo49506d(e3);
        }
    }

    /* renamed from: h */
    public abstract void mo29430h(uz7 uz7) throws RemoteException;
}
