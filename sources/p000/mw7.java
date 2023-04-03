package p000;

import android.content.Context;

/* renamed from: mw7 */
public final class mw7 {

    /* renamed from: c */
    public static final pq7 f31869c = new pq7("SplitInstallInfoProvider");

    /* renamed from: a */
    public final Context f31870a;

    /* renamed from: b */
    public final String f31871b;

    public mw7(Context context) {
        this.f31870a = context;
        this.f31871b = context.getPackageName();
    }

    /* renamed from: a */
    public static boolean m48521a(String str) {
        return str.startsWith("config.");
    }

    /* renamed from: b */
    public static boolean m48522b(String str) {
        return m48521a(str) || str.contains(".config.");
    }
}
