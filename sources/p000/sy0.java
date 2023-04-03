package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* renamed from: sy0 */
/* compiled from: CustomTabsSession */
public final class sy0 {

    /* renamed from: a */
    public final Object f17830a = new Object();

    /* renamed from: b */
    public final tn2 f17831b;

    /* renamed from: c */
    public final sn2 f17832c;

    /* renamed from: d */
    public final ComponentName f17833d;

    /* renamed from: e */
    public final PendingIntent f17834e;

    public sy0(tn2 tn2, sn2 sn2, ComponentName componentName, PendingIntent pendingIntent) {
        this.f17831b = tn2;
        this.f17832c = sn2;
        this.f17833d = componentName;
        this.f17834e = pendingIntent;
    }

    /* renamed from: a */
    public final void mo25992a(Bundle bundle) {
        PendingIntent pendingIntent = this.f17834e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* renamed from: b */
    public final Bundle mo25993b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        mo25992a(bundle2);
        return bundle2;
    }

    /* renamed from: c */
    public IBinder mo25994c() {
        return this.f17832c.asBinder();
    }

    /* renamed from: d */
    public ComponentName mo25995d() {
        return this.f17833d;
    }

    /* renamed from: e */
    public PendingIntent mo25996e() {
        return this.f17834e;
    }

    /* renamed from: f */
    public boolean mo25997f(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f17831b.mo2791W0(this.f17832c, uri, mo25993b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
