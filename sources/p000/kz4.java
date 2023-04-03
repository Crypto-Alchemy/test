package p000;

/* renamed from: kz4 */
public class kz4 {
    /* renamed from: a */
    public static String m63638a(int i) {
        if (i == 5) {
            return "qTESLA-p-I";
        }
        if (i == 6) {
            return "qTESLA-p-III";
        }
        throw new IllegalArgumentException("unknown security category: " + i);
    }

    /* renamed from: b */
    public static int m63639b(int i) {
        if (i == 5) {
            return 5224;
        }
        if (i == 6) {
            return 12392;
        }
        throw new IllegalArgumentException("unknown security category: " + i);
    }

    /* renamed from: c */
    public static int m63640c(int i) {
        if (i == 5) {
            return 14880;
        }
        if (i == 6) {
            return 38432;
        }
        throw new IllegalArgumentException("unknown security category: " + i);
    }
}
