package androidx.browser.trusted;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: androidx.browser.trusted.a */
/* compiled from: TrustedWebActivityServiceConnection */
public final class C0326a {

    /* renamed from: androidx.browser.trusted.a$a */
    /* compiled from: TrustedWebActivityServiceConnection */
    public static class C0327a {

        /* renamed from: a */
        public final Parcelable[] f1401a;

        public C0327a(Parcelable[] parcelableArr) {
            this.f1401a = parcelableArr;
        }

        /* renamed from: a */
        public Bundle mo2822a() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f1401a);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.a$b */
    /* compiled from: TrustedWebActivityServiceConnection */
    public static class C0328b {

        /* renamed from: a */
        public final String f1402a;

        /* renamed from: b */
        public final int f1403b;

        public C0328b(String str, int i) {
            this.f1402a = str;
            this.f1403b = i;
        }

        /* renamed from: a */
        public static C0328b m1827a(Bundle bundle) {
            C0326a.m1825a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            C0326a.m1825a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new C0328b(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    /* renamed from: androidx.browser.trusted.a$c */
    /* compiled from: TrustedWebActivityServiceConnection */
    public static class C0329c {

        /* renamed from: a */
        public final String f1404a;

        public C0329c(String str) {
            this.f1404a = str;
        }

        /* renamed from: a */
        public static C0329c m1828a(Bundle bundle) {
            C0326a.m1825a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new C0329c(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* renamed from: androidx.browser.trusted.a$d */
    /* compiled from: TrustedWebActivityServiceConnection */
    public static class C0330d {

        /* renamed from: a */
        public final String f1405a;

        /* renamed from: b */
        public final int f1406b;

        /* renamed from: c */
        public final Notification f1407c;

        /* renamed from: d */
        public final String f1408d;

        public C0330d(String str, int i, Notification notification, String str2) {
            this.f1405a = str;
            this.f1406b = i;
            this.f1407c = notification;
            this.f1408d = str2;
        }

        /* renamed from: a */
        public static C0330d m1829a(Bundle bundle) {
            C0326a.m1825a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            C0326a.m1825a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            C0326a.m1825a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            C0326a.m1825a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new C0330d(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* renamed from: androidx.browser.trusted.a$e */
    /* compiled from: TrustedWebActivityServiceConnection */
    public static class C0331e {

        /* renamed from: a */
        public final boolean f1409a;

        public C0331e(boolean z) {
            this.f1409a = z;
        }

        /* renamed from: a */
        public Bundle mo2823a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f1409a);
            return bundle;
        }
    }

    /* renamed from: a */
    public static void m1825a(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("Bundle must contain " + str);
        }
    }
}
