package p000;

/* renamed from: df9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class df9 {

    /* renamed from: a */
    public static bf9 f28183a;

    /* renamed from: a */
    public static synchronized ce9 m43477a(od9 od9) {
        ce9 ce9;
        synchronized (df9.class) {
            if (f28183a == null) {
                f28183a = new bf9((se9) null);
            }
            ce9 = (ce9) f28183a.mo46069b(od9);
        }
        return ce9;
    }

    /* renamed from: b */
    public static synchronized ce9 m43478b(String str) {
        ce9 a;
        synchronized (df9.class) {
            a = m43477a(od9.m49272d(str).mo42547c());
        }
        return a;
    }
}
