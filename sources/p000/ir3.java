package p000;

import java.util.HashSet;

/* renamed from: ir3 */
/* compiled from: MediaLibraryInfo */
public final class ir3 {

    /* renamed from: a */
    public static final HashSet<String> f13374a = new HashSet<>();

    /* renamed from: b */
    public static String f13375b = "media3.common";

    /* renamed from: a */
    public static synchronized void m19787a(String str) {
        synchronized (ir3.class) {
            if (f13374a.add(str)) {
                f13375b += ", " + str;
            }
        }
    }

    /* renamed from: b */
    public static synchronized String m19788b() {
        String str;
        synchronized (ir3.class) {
            str = f13375b;
        }
        return str;
    }
}
