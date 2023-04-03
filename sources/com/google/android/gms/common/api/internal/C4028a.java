package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.C4013a.C4015b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import p000.eg5;

/* renamed from: com.google.android.gms.common.api.internal.a */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class C4028a<R extends eg5, A extends C4013a.C4015b> extends BasePendingResult<R> {

    /* renamed from: p */
    public final C4013a.C4016c<A> f22233p;

    /* renamed from: q */
    public final C4013a<?> f22234q;

    public C4028a(C4013a<?> aVar, GoogleApiClient googleApiClient) {
        super((GoogleApiClient) cu4.m43222l(googleApiClient, "GoogleApiClient must not be null"));
        cu4.m43222l(aVar, "Api must not be null");
        this.f22233p = aVar.mo30534b();
        this.f22234q = aVar;
    }

    /* renamed from: o */
    public abstract void mo30597o(A a) throws RemoteException;

    /* renamed from: p */
    public final C4013a<?> mo30598p() {
        return this.f22234q;
    }

    /* renamed from: q */
    public final C4013a.C4016c<A> mo30599q() {
        return this.f22233p;
    }

    /* renamed from: r */
    public void mo30600r(R r) {
    }

    /* renamed from: s */
    public final void mo30601s(A a) throws DeadObjectException {
        try {
            mo30597o(a);
        } catch (DeadObjectException e) {
            mo30602t(e);
            throw e;
        } catch (RemoteException e2) {
            mo30602t(e2);
        }
    }

    /* renamed from: t */
    public final void mo30602t(RemoteException remoteException) {
        mo30603u(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* renamed from: u */
    public final void mo30603u(Status status) {
        cu4.m43212b(!status.mo30528w1(), "Failed result must not be success");
        eg5 c = mo30576c(status);
        mo30580g(c);
        mo30600r(c);
    }
}
