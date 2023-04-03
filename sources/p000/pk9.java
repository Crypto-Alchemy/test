package p000;

import java.util.Collections;
import java.util.TreeMap;

/* renamed from: pk9 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class pk9 {

    /* renamed from: a */
    public final TreeMap<Integer, l88> f32725a = new TreeMap<>();

    /* renamed from: b */
    public final TreeMap<Integer, l88> f32726b = new TreeMap<>();

    /* renamed from: c */
    public static final int m49981c(ps8 ps8, l88 l88, r88 r88) {
        r88 a = l88.mo29623a(ps8, Collections.singletonList(r88));
        if (a instanceof e78) {
            return gv8.m44952g(a.mo29499b().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo46769a(String str, int i, l88 l88, String str2) {
        TreeMap<Integer, l88> treeMap;
        String str3;
        if ("create".equals(str2)) {
            treeMap = this.f32726b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f32725a;
        } else {
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                str3 = "Unknown callback type: ".concat(valueOf);
            } else {
                str3 = new String("Unknown callback type: ");
            }
            throw new IllegalStateException(str3);
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), l88);
    }

    /* renamed from: b */
    public final void mo46770b(ps8 ps8, n58 n58) {
        w69 w69 = new w69(n58);
        for (Integer num : this.f32725a.keySet()) {
            h58 g = n58.mo45972c().clone();
            int c = m49981c(ps8, this.f32725a.get(num), w69);
            if (c == 2 || c == -1) {
                n58.mo45974d(g);
            }
        }
        for (Integer num2 : this.f32726b.keySet()) {
            m49981c(ps8, this.f32726b.get(num2), w69);
        }
    }
}
