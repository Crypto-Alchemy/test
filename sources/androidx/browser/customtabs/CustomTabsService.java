package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import java.util.NoSuchElementException;
import p000.tn2;

public abstract class CustomTabsService extends Service {

    /* renamed from: a */
    public final y16<IBinder, IBinder.DeathRecipient> f1392a = new y16<>();

    /* renamed from: d */
    public tn2.C3377a f1393d = new C0323a();

    /* renamed from: androidx.browser.customtabs.CustomTabsService$a */
    public class C0323a extends tn2.C3377a {
        public C0323a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: t1 */
        public /* synthetic */ void m1791t1(ty0 ty0) {
            CustomTabsService.this.mo2775a(ty0);
        }

        /* renamed from: B0 */
        public boolean mo2786B0(long j) {
            return CustomTabsService.this.mo2784j(j);
        }

        /* renamed from: C */
        public boolean mo2787C(sn2 sn2, Bundle bundle) {
            return mo2798u1(sn2, mo2797s1(bundle));
        }

        /* renamed from: K0 */
        public boolean mo2788K0(sn2 sn2, Uri uri, int i, Bundle bundle) {
            return CustomTabsService.this.mo2780f(new ty0(sn2, mo2797s1(bundle)), uri, i, bundle);
        }

        /* renamed from: T0 */
        public boolean mo2789T0(sn2 sn2, Uri uri) {
            return CustomTabsService.this.mo2781g(new ty0(sn2, (PendingIntent) null), uri);
        }

        /* renamed from: W */
        public boolean mo2790W(sn2 sn2, int i, Uri uri, Bundle bundle) {
            return CustomTabsService.this.mo2783i(new ty0(sn2, mo2797s1(bundle)), i, uri, bundle);
        }

        /* renamed from: W0 */
        public boolean mo2791W0(sn2 sn2, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.mo2777c(new ty0(sn2, mo2797s1(bundle)), uri, bundle, list);
        }

        /* renamed from: e0 */
        public boolean mo2792e0(sn2 sn2, Bundle bundle) {
            return CustomTabsService.this.mo2782h(new ty0(sn2, mo2797s1(bundle)), bundle);
        }

        /* renamed from: j0 */
        public boolean mo2793j0(sn2 sn2, Uri uri, Bundle bundle) {
            return CustomTabsService.this.mo2781g(new ty0(sn2, mo2797s1(bundle)), uri);
        }

        /* renamed from: n0 */
        public int mo2794n0(sn2 sn2, String str, Bundle bundle) {
            return CustomTabsService.this.mo2779e(new ty0(sn2, mo2797s1(bundle)), str, bundle);
        }

        /* renamed from: r */
        public boolean mo2795r(sn2 sn2) {
            return mo2798u1(sn2, (PendingIntent) null);
        }

        /* renamed from: s */
        public Bundle mo2796s(String str, Bundle bundle) {
            return CustomTabsService.this.mo2776b(str, bundle);
        }

        /* renamed from: s1 */
        public final PendingIntent mo2797s1(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        /* renamed from: u1 */
        public final boolean mo2798u1(sn2 sn2, PendingIntent pendingIntent) {
            ty0 ty0 = new ty0(sn2, pendingIntent);
            try {
                qy0 qy0 = new qy0(this, ty0);
                synchronized (CustomTabsService.this.f1392a) {
                    sn2.asBinder().linkToDeath(qy0, 0);
                    CustomTabsService.this.f1392a.put(sn2.asBinder(), qy0);
                }
                return CustomTabsService.this.mo2778d(ty0);
            } catch (RemoteException unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    public boolean mo2775a(ty0 ty0) {
        try {
            synchronized (this.f1392a) {
                IBinder a = ty0.mo26591a();
                if (a == null) {
                    return false;
                }
                a.unlinkToDeath(this.f1392a.get(a), 0);
                this.f1392a.remove(a);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public abstract Bundle mo2776b(String str, Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo2777c(ty0 ty0, Uri uri, Bundle bundle, List<Bundle> list);

    /* renamed from: d */
    public abstract boolean mo2778d(ty0 ty0);

    /* renamed from: e */
    public abstract int mo2779e(ty0 ty0, String str, Bundle bundle);

    /* renamed from: f */
    public abstract boolean mo2780f(ty0 ty0, Uri uri, int i, Bundle bundle);

    /* renamed from: g */
    public abstract boolean mo2781g(ty0 ty0, Uri uri);

    /* renamed from: h */
    public abstract boolean mo2782h(ty0 ty0, Bundle bundle);

    /* renamed from: i */
    public abstract boolean mo2783i(ty0 ty0, int i, Uri uri, Bundle bundle);

    /* renamed from: j */
    public abstract boolean mo2784j(long j);

    public IBinder onBind(Intent intent) {
        return this.f1393d;
    }
}
