package p000;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: ty0 */
/* compiled from: CustomTabsSessionToken */
public class ty0 {

    /* renamed from: a */
    public final sn2 f18308a;

    /* renamed from: b */
    public final PendingIntent f18309b;

    /* renamed from: c */
    public final ny0 f18310c;

    /* renamed from: ty0$a */
    /* compiled from: CustomTabsSessionToken */
    public class C3389a extends ny0 {
        public C3389a() {
        }

        /* renamed from: a */
        public void mo23826a(String str, Bundle bundle) {
            try {
                ty0.this.f18308a.mo24287O(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: b */
        public Bundle mo23827b(String str, Bundle bundle) {
            try {
                return ty0.this.f18308a.mo24292q(str, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public void mo23828c(Bundle bundle) {
            try {
                ty0.this.f18308a.mo24290j1(bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: d */
        public void mo23829d(int i, Bundle bundle) {
            try {
                ty0.this.f18308a.mo24288c1(i, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: e */
        public void mo23830e(String str, Bundle bundle) {
            try {
                ty0.this.f18308a.mo24289i1(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: f */
        public void mo23831f(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                ty0.this.f18308a.mo24291m1(i, uri, z, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public ty0(sn2 sn2, PendingIntent pendingIntent) {
        C3389a aVar;
        if (sn2 == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f18308a = sn2;
        this.f18309b = pendingIntent;
        if (sn2 == null) {
            aVar = null;
        } else {
            aVar = new C3389a();
        }
        this.f18310c = aVar;
    }

    /* renamed from: a */
    public IBinder mo26591a() {
        sn2 sn2 = this.f18308a;
        if (sn2 == null) {
            return null;
        }
        return sn2.asBinder();
    }

    /* renamed from: b */
    public final IBinder mo26592b() {
        sn2 sn2 = this.f18308a;
        if (sn2 != null) {
            return sn2.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    /* renamed from: c */
    public PendingIntent mo26593c() {
        return this.f18309b;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof ty0)) {
            return false;
        }
        ty0 ty0 = (ty0) obj;
        PendingIntent c = ty0.mo26593c();
        PendingIntent pendingIntent = this.f18309b;
        boolean z2 = true;
        if (pendingIntent == null) {
            z = true;
        } else {
            z = false;
        }
        if (c != null) {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (pendingIntent != null) {
            return pendingIntent.equals(c);
        }
        return mo26592b().equals(ty0.mo26592b());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f18309b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return mo26592b().hashCode();
    }
}
