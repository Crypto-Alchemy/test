package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* renamed from: c78 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class c78 {

    /* renamed from: a */
    public static final Object f21615a = new Object();

    /* renamed from: b */
    public static boolean f21616b;

    /* renamed from: c */
    public static String f21617c;

    /* renamed from: d */
    public static int f21618d;

    /* renamed from: a */
    public static int m32863a(Context context) {
        m32864b(context);
        return f21618d;
    }

    /* renamed from: b */
    public static void m32864b(Context context) {
        synchronized (f21615a) {
            if (!f21616b) {
                f21616b = true;
                try {
                    Bundle bundle = tn7.m52384a(context).mo45809c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f21617c = bundle.getString("com.google.app.id");
                        f21618d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
