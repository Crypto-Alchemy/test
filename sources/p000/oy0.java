package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import p000.sn2;

/* renamed from: oy0 */
/* compiled from: CustomTabsClient */
public class oy0 {

    /* renamed from: a */
    public final tn2 f16229a;

    /* renamed from: b */
    public final ComponentName f16230b;

    /* renamed from: c */
    public final Context f16231c;

    /* renamed from: oy0$a */
    /* compiled from: CustomTabsClient */
    public class C3010a extends sn2.C3291a {

        /* renamed from: a */
        public Handler f16232a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        public final /* synthetic */ ny0 f16233b;

        /* renamed from: oy0$a$a */
        /* compiled from: CustomTabsClient */
        public class C3011a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f16235a;

            /* renamed from: d */
            public final /* synthetic */ Bundle f16236d;

            public C3011a(int i, Bundle bundle) {
                this.f16235a = i;
                this.f16236d = bundle;
            }

            public void run() {
                C3010a.this.f16233b.mo23829d(this.f16235a, this.f16236d);
            }
        }

        /* renamed from: oy0$a$b */
        /* compiled from: CustomTabsClient */
        public class C3012b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f16238a;

            /* renamed from: d */
            public final /* synthetic */ Bundle f16239d;

            public C3012b(String str, Bundle bundle) {
                this.f16238a = str;
                this.f16239d = bundle;
            }

            public void run() {
                C3010a.this.f16233b.mo23826a(this.f16238a, this.f16239d);
            }
        }

        /* renamed from: oy0$a$c */
        /* compiled from: CustomTabsClient */
        public class C3013c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f16241a;

            public C3013c(Bundle bundle) {
                this.f16241a = bundle;
            }

            public void run() {
                C3010a.this.f16233b.mo23828c(this.f16241a);
            }
        }

        /* renamed from: oy0$a$d */
        /* compiled from: CustomTabsClient */
        public class C3014d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f16243a;

            /* renamed from: d */
            public final /* synthetic */ Bundle f16244d;

            public C3014d(String str, Bundle bundle) {
                this.f16243a = str;
                this.f16244d = bundle;
            }

            public void run() {
                C3010a.this.f16233b.mo23830e(this.f16243a, this.f16244d);
            }
        }

        /* renamed from: oy0$a$e */
        /* compiled from: CustomTabsClient */
        public class C3015e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f16246a;

            /* renamed from: d */
            public final /* synthetic */ Uri f16247d;

            /* renamed from: e */
            public final /* synthetic */ boolean f16248e;

            /* renamed from: g */
            public final /* synthetic */ Bundle f16249g;

            public C3015e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f16246a = i;
                this.f16247d = uri;
                this.f16248e = z;
                this.f16249g = bundle;
            }

            public void run() {
                C3010a.this.f16233b.mo23831f(this.f16246a, this.f16247d, this.f16248e, this.f16249g);
            }
        }

        public C3010a(ny0 ny0) {
            this.f16233b = ny0;
        }

        /* renamed from: O */
        public void mo24287O(String str, Bundle bundle) throws RemoteException {
            if (this.f16233b != null) {
                this.f16232a.post(new C3012b(str, bundle));
            }
        }

        /* renamed from: c1 */
        public void mo24288c1(int i, Bundle bundle) {
            if (this.f16233b != null) {
                this.f16232a.post(new C3011a(i, bundle));
            }
        }

        /* renamed from: i1 */
        public void mo24289i1(String str, Bundle bundle) throws RemoteException {
            if (this.f16233b != null) {
                this.f16232a.post(new C3014d(str, bundle));
            }
        }

        /* renamed from: j1 */
        public void mo24290j1(Bundle bundle) throws RemoteException {
            if (this.f16233b != null) {
                this.f16232a.post(new C3013c(bundle));
            }
        }

        /* renamed from: m1 */
        public void mo24291m1(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (this.f16233b != null) {
                this.f16232a.post(new C3015e(i, uri, z, bundle));
            }
        }

        /* renamed from: q */
        public Bundle mo24292q(String str, Bundle bundle) throws RemoteException {
            ny0 ny0 = this.f16233b;
            if (ny0 == null) {
                return null;
            }
            return ny0.mo23827b(str, bundle);
        }
    }

    public oy0(tn2 tn2, ComponentName componentName, Context context) {
        this.f16229a = tn2;
        this.f16230b = componentName;
        this.f16231c = context;
    }

    /* renamed from: a */
    public static boolean m24403a(Context context, String str, ry0 ry0) {
        ry0.mo25560b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, ry0, 33);
    }

    /* renamed from: b */
    public final sn2.C3291a mo24283b(ny0 ny0) {
        return new C3010a(ny0);
    }

    /* renamed from: c */
    public sy0 mo24284c(ny0 ny0) {
        return mo24285d(ny0, (PendingIntent) null);
    }

    /* renamed from: d */
    public final sy0 mo24285d(ny0 ny0, PendingIntent pendingIntent) {
        boolean z;
        sn2.C3291a b = mo24283b(ny0);
        if (pendingIntent != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                z = this.f16229a.mo2787C(b, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        } else {
            z = this.f16229a.mo2795r(b);
        }
        if (!z) {
            return null;
        }
        return new sy0(this.f16229a, b, this.f16230b, pendingIntent);
    }

    /* renamed from: e */
    public boolean mo24286e(long j) {
        try {
            return this.f16229a.mo2786B0(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
