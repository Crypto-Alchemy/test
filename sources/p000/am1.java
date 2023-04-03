package p000;

/* renamed from: am1 */
public class am1 {
    /* renamed from: a */
    public static hm1 m55586a(String str) {
        co7 d = bm1.m56066d(str);
        if (d == null) {
            try {
                d = bm1.m56067e(new C9156p4(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (d == null) {
            return null;
        }
        return new hm1(str, d.mo50929r(), d.mo50930s(), d.mo50932w(), d.mo50931t(), d.mo50928A());
    }
}
