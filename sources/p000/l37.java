package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: l37 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class l37 {
    /* renamed from: a */
    public static boolean m47616a(Context context, int i) {
        if (!m47617b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return ni2.m48801a(context).mo46096b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m47617b(Context context, int i, String str) {
        return tn7.m52384a(context).mo45813g(i, str);
    }
}
