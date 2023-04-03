package p000;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4028a;

/* renamed from: n18 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class n18 extends i28 {

    /* renamed from: b */
    public final C4028a f31953b;

    public n18(int i, C4028a aVar) {
        super(i);
        this.f31953b = (C4028a) cu4.m43222l(aVar, "Null methods are not runnable.");
    }

    /* renamed from: a */
    public final void mo29427a(Status status) {
        try {
            this.f31953b.mo30603u(status);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: b */
    public final void mo29428b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f31953b.mo30603u(new Status(10, simpleName + ": " + localizedMessage));
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: c */
    public final void mo29429c(uz7 uz7) throws DeadObjectException {
        try {
            this.f31953b.mo30601s(uz7.mo48619s());
        } catch (RuntimeException e) {
            mo29428b(e);
        }
    }

    /* renamed from: d */
    public final void mo29435d(cy7 cy7, boolean z) {
        cy7.mo41774c(this.f31953b, z);
    }
}
