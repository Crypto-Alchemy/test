package p000;

import java.util.List;

/* renamed from: bc8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class bc8 extends l98 {
    /* renamed from: a */
    public final r88 mo28916a(String str, ps8 ps8, List<r88> list) {
        if (str == null || str.isEmpty() || !ps8.mo46868d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        r88 h = ps8.mo46872h(str);
        if (h instanceof j78) {
            return ((j78) h).mo29623a(ps8, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
