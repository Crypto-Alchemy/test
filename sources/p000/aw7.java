package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: aw7 */
public final class aw7 {

    /* renamed from: a */
    public final Context f21060a;

    public aw7(Context context) {
        this.f21060a = context;
    }

    /* renamed from: b */
    public static String m32274b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Context mo29375a() {
        return this.f21060a;
    }
}
