package p000;

/* renamed from: ma8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class ma8 {

    /* renamed from: a */
    public final long f31620a = Math.round(30000.0d);

    /* renamed from: b */
    public final Object f31621b = new Object();

    /* renamed from: c */
    public long f31622c = Long.MIN_VALUE;

    public ma8(double d) {
    }

    /* renamed from: a */
    public final boolean mo45730a() {
        synchronized (this.f31621b) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f31622c + this.f31620a > currentTimeMillis) {
                return false;
            }
            this.f31622c = currentTimeMillis;
            return true;
        }
    }
}
