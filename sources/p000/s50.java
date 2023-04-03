package p000;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: s50 */
/* compiled from: BundleCompat */
public final class s50 {

    /* renamed from: s50$a */
    /* compiled from: BundleCompat */
    public static class C3243a {
        /* renamed from: a */
        public static IBinder m26645a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        public static void m26646b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* renamed from: a */
    public static IBinder m26643a(Bundle bundle, String str) {
        return C3243a.m26645a(bundle, str);
    }

    /* renamed from: b */
    public static void m26644b(Bundle bundle, String str, IBinder iBinder) {
        C3243a.m26646b(bundle, str, iBinder);
    }
}
