package p000;

/* renamed from: tb9 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class tb9 {

    /* renamed from: a */
    public static rb9 f34229a;

    /* renamed from: a */
    public static synchronized pa9 m52216a(da9 da9) {
        pa9 pa9;
        synchronized (tb9.class) {
            if (f34229a == null) {
                f34229a = new rb9((cb9) null);
            }
            pa9 = (pa9) f34229a.mo46069b(da9);
        }
        return pa9;
    }

    /* renamed from: b */
    public static synchronized pa9 m52217b(String str) {
        pa9 a;
        synchronized (tb9.class) {
            a = m52216a(da9.m43421d("common").mo28904c());
        }
        return a;
    }
}
