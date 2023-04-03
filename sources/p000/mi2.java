package p000;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mi2 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class mi2 {
    @Deprecated

    /* renamed from: a */
    public static final int f31711a = 12451000;

    /* renamed from: b */
    public static final AtomicBoolean f31712b = new AtomicBoolean();

    /* renamed from: c */
    public static boolean f31713c = false;

    /* renamed from: d */
    public static boolean f31714d = false;

    /* renamed from: e */
    public static final AtomicBoolean f31715e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static void m48306a(Context context) {
        if (!f31712b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static int m48307b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static String m48308c(int i) {
        return ConnectionResult.m33570w1(i);
    }

    /* renamed from: d */
    public static Context m48309d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Resources m48310e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m48311f(Context context) {
        if (!f31714d) {
            try {
                PackageInfo e = tn7.m52384a(context).mo45811e("com.google.android.gms", 64);
                ni2.m48801a(context);
                if (e == null || ni2.m48803e(e, false) || !ni2.m48803e(e, true)) {
                    f31713c = false;
                } else {
                    f31713c = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                f31714d = true;
            }
        }
        if (f31713c || !le1.m47790b()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    @java.lang.Deprecated
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m48312g(android.content.Context r9, int r10) {
        /*
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ all -> 0x0009 }
            int r1 = p000.x45.common_google_play_services_unknown_issue     // Catch:{ all -> 0x0009 }
            r0.getString(r1)     // Catch:{ all -> 0x0009 }
        L_0x0009:
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0035
            java.util.concurrent.atomic.AtomicBoolean r0 = f31715e
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            int r0 = p000.c78.m32863a(r9)
            if (r0 == 0) goto L_0x002f
            int r2 = f31711a
            if (r0 != r2) goto L_0x0029
            goto L_0x0035
        L_0x0029:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r9.<init>()
            throw r9
        L_0x0035:
            boolean r0 = p000.le1.m47792d(r9)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0045
            boolean r0 = p000.le1.m47794f(r9)
            if (r0 != 0) goto L_0x0045
            r0 = r2
            goto L_0x0046
        L_0x0045:
            r0 = r3
        L_0x0046:
            if (r10 < 0) goto L_0x004a
            r4 = r2
            goto L_0x004b
        L_0x004a:
            r4 = r3
        L_0x004b:
            p000.cu4.m43211a(r4)
            java.lang.String r4 = r9.getPackageName()
            android.content.pm.PackageManager r5 = r9.getPackageManager()
            r6 = 9
            if (r0 == 0) goto L_0x006f
            java.lang.String r7 = "com.android.vending"
            r8 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r7 = r5.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x0063 }
            goto L_0x0070
        L_0x0063:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires the Google Play Store, but it is missing."
            r9.concat(r10)
        L_0x006c:
            r2 = r6
            goto L_0x0111
        L_0x006f:
            r7 = 0
        L_0x0070:
            r8 = 64
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r1, r8)     // Catch:{ NameNotFoundException -> 0x0108 }
            p000.ni2.m48801a(r9)
            boolean r9 = p000.ni2.m48803e(r8, r2)
            if (r9 != 0) goto L_0x0089
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but their signature is invalid."
            r9.concat(r10)
            goto L_0x006c
        L_0x0089:
            if (r0 == 0) goto L_0x009e
            p000.cu4.m43221k(r7)
            boolean r9 = p000.ni2.m48803e(r7, r2)
            if (r9 != 0) goto L_0x009e
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play Store, but its signature is invalid."
            r9.concat(r10)
            goto L_0x006c
        L_0x009e:
            if (r0 == 0) goto L_0x00ba
            if (r7 == 0) goto L_0x00ba
            android.content.pm.Signature[] r9 = r7.signatures
            r9 = r9[r3]
            android.content.pm.Signature[] r0 = r8.signatures
            r0 = r0[r3]
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00ba
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            r9.concat(r10)
            goto L_0x006c
        L_0x00ba:
            int r9 = r8.versionCode
            int r9 = p000.c58.m32856a(r9)
            int r0 = p000.c58.m32856a(r10)
            if (r9 >= r0) goto L_0x00e7
            int r9 = r8.versionCode
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Google Play services out of date for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ".  Requires "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = " but found "
            r0.append(r10)
            r0.append(r9)
            r2 = 2
            goto L_0x0111
        L_0x00e7:
            android.content.pm.ApplicationInfo r9 = r8.applicationInfo
            if (r9 != 0) goto L_0x0101
            android.content.pm.ApplicationInfo r9 = r5.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x00f0 }
            goto L_0x0101
        L_0x00f0:
            r9 = move-exception
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r10 = r10.concat(r0)
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.util.Log.wtf(r0, r10, r9)
            goto L_0x0111
        L_0x0101:
            boolean r9 = r9.enabled
            if (r9 != 0) goto L_0x0107
            r2 = 3
            goto L_0x0111
        L_0x0107:
            return r3
        L_0x0108:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but they are missing."
            r9.concat(r10)
        L_0x0111:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mi2.m48312g(android.content.Context, int):int");
    }

    @Deprecated
    /* renamed from: h */
    public static boolean m48313h(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m48317l(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: i */
    public static boolean m48314i(Context context) {
        if (!xp4.m54478c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        cu4.m43221k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        if (applicationRestrictions == null || !"true".equals(applicationRestrictions.getString("restricted_profile"))) {
            return false;
        }
        return true;
    }

    @Deprecated
    /* renamed from: j */
    public static boolean m48315j(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: k */
    public static boolean m48316k(Context context, int i, String str) {
        return l37.m47617b(context, i, str);
    }

    @TargetApi(21)
    /* renamed from: l */
    public static boolean m48317l(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (xp4.m54481f()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (!applicationInfo.enabled || m48314i(context)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
