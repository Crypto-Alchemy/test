package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.browser.trusted.C0326a;
import java.util.Locale;
import p000.dp2;

public abstract class TrustedWebActivityService extends Service {

    /* renamed from: a */
    public NotificationManager f1397a;

    /* renamed from: d */
    public int f1398d = -1;

    /* renamed from: e */
    public final dp2.C2189a f1399e = new C0325a();

    /* renamed from: androidx.browser.trusted.TrustedWebActivityService$a */
    public class C0325a extends dp2.C2189a {
        public C0325a() {
        }

        /* renamed from: E0 */
        public final void mo2814E0() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.f1398d == -1) {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                TrustedWebActivityService.this.mo2803c().mo25263a();
                TrustedWebActivityService.this.getPackageManager();
            }
            if (TrustedWebActivityService.this.f1398d != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }

        /* renamed from: J */
        public Bundle mo2815J() {
            mo2814E0();
            return TrustedWebActivityService.this.mo2808h();
        }

        /* renamed from: M0 */
        public int mo2816M0() {
            mo2814E0();
            return TrustedWebActivityService.this.mo2809i();
        }

        /* renamed from: P0 */
        public Bundle mo2817P0(Bundle bundle) {
            mo2814E0();
            return new C0326a.C0331e(TrustedWebActivityService.this.mo2804d(C0326a.C0329c.m1828a(bundle).f1404a)).mo2823a();
        }

        /* renamed from: R */
        public Bundle mo2818R(Bundle bundle) {
            mo2814E0();
            C0326a.C0330d a = C0326a.C0330d.m1829a(bundle);
            return new C0326a.C0331e(TrustedWebActivityService.this.mo2810j(a.f1405a, a.f1406b, a.f1407c, a.f1408d)).mo2823a();
        }

        /* renamed from: Y0 */
        public void mo2819Y0(Bundle bundle) {
            mo2814E0();
            C0326a.C0328b a = C0326a.C0328b.m1827a(bundle);
            TrustedWebActivityService.this.mo2805e(a.f1402a, a.f1403b);
        }

        /* renamed from: p0 */
        public Bundle mo2820p0() {
            mo2814E0();
            return new C0326a.C0327a(TrustedWebActivityService.this.mo2807g()).mo2822a();
        }

        /* renamed from: z */
        public Bundle mo2821z(String str, Bundle bundle, IBinder iBinder) {
            mo2814E0();
            return TrustedWebActivityService.this.mo2806f(str, bundle, dy6.m15528a(iBinder));
        }
    }

    /* renamed from: a */
    public static String m1807a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    /* renamed from: b */
    public final void mo2802b() {
        if (this.f1397a == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    /* renamed from: c */
    public abstract qr6 mo2803c();

    /* renamed from: d */
    public boolean mo2804d(String str) {
        mo2802b();
        if (!qb4.m25577d(this).mo25049a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return a94.m139b(this.f1397a, m1807a(str));
    }

    /* renamed from: e */
    public void mo2805e(String str, int i) {
        mo2802b();
        this.f1397a.cancel(str, i);
    }

    /* renamed from: f */
    public Bundle mo2806f(String str, Bundle bundle, dy6 dy6) {
        return null;
    }

    /* renamed from: g */
    public Parcelable[] mo2807g() {
        mo2802b();
        return v84.m28698a(this.f1397a);
    }

    /* renamed from: h */
    public Bundle mo2808h() {
        int i = mo2809i();
        Bundle bundle = new Bundle();
        if (i == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), i));
        return bundle;
    }

    /* renamed from: i */
    public int mo2809i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: j */
    public boolean mo2810j(String str, int i, Notification notification, String str2) {
        mo2802b();
        if (!qb4.m25577d(this).mo25049a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String a = m1807a(str2);
            notification = a94.m138a(this, this.f1397a, notification, a, str2);
            if (!a94.m139b(this.f1397a, a)) {
                return false;
            }
        }
        this.f1397a.notify(str, i, notification);
        return true;
    }

    public final IBinder onBind(Intent intent) {
        return this.f1399e;
    }

    public void onCreate() {
        super.onCreate();
        this.f1397a = (NotificationManager) getSystemService("notification");
    }

    public final boolean onUnbind(Intent intent) {
        this.f1398d = -1;
        return super.onUnbind(intent);
    }
}
