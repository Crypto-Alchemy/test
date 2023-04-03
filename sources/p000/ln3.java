package p000;

import android.os.Build;
import java.util.Locale;

/* renamed from: ln3 */
/* compiled from: ManufacturerUtils */
public class ln3 {
    /* renamed from: a */
    public static boolean m47861a() {
        if (m47862b() || m47864d()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m47862b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("lge");
    }

    /* renamed from: c */
    public static boolean m47863c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }

    /* renamed from: d */
    public static boolean m47864d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("samsung");
    }
}
