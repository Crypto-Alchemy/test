package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* renamed from: b28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class b28 extends d08 {

    /* renamed from: b */
    public final wl6 f21116b;

    /* renamed from: c */
    public final xl6 f21117c;

    /* renamed from: d */
    public final q96 f21118d;

    public b28(int i, wl6 wl6, xl6 xl6, q96 q96) {
        super(i);
        this.f21117c = xl6;
        this.f21116b = wl6;
        this.f21118d = q96;
        if (i == 2 && wl6.mo49231c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo29427a(Status status) {
        this.f21117c.mo49506d(this.f21118d.mo45447a(status));
    }

    /* renamed from: b */
    public final void mo29428b(Exception exc) {
        this.f21117c.mo49506d(exc);
    }

    /* renamed from: c */
    public final void mo29429c(uz7 uz7) throws DeadObjectException {
        try {
            this.f21116b.mo49230b(uz7.mo48619s(), this.f21117c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo29427a(i28.m45448e(e2));
        } catch (RuntimeException e3) {
            this.f21117c.mo49506d(e3);
        }
    }

    /* renamed from: d */
    public final void mo29435d(cy7 cy7, boolean z) {
        cy7.mo41775d(this.f21117c, z);
    }

    /* renamed from: f */
    public final boolean mo29436f(uz7 uz7) {
        return this.f21116b.mo49231c();
    }

    /* renamed from: g */
    public final Feature[] mo29437g(uz7 uz7) {
        return this.f21116b.mo49233e();
    }
}
