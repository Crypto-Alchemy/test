package p000;

/* renamed from: z10 */
/* compiled from: BitmapCounterProvider */
public class z10 {

    /* renamed from: a */
    public static final int f20426a = m30906b();

    /* renamed from: b */
    public static int f20427b = 384;

    /* renamed from: c */
    public static volatile y10 f20428c;

    /* renamed from: a */
    public static y10 m30905a() {
        if (f20428c == null) {
            synchronized (z10.class) {
                if (f20428c == null) {
                    f20428c = new y10(f20427b, f20426a);
                }
            }
        }
        return f20428c;
    }

    /* renamed from: b */
    public static int m30906b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (((long) min) > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
