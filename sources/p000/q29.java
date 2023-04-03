package p000;

/* renamed from: q29 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class q29 {

    /* renamed from: a */
    public final Object f32909a;

    /* renamed from: b */
    public final int f32910b;

    public q29(Object obj, int i) {
        this.f32909a = obj;
        this.f32910b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q29)) {
            return false;
        }
        q29 q29 = (q29) obj;
        if (this.f32909a == q29.f32909a && this.f32910b == q29.f32910b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f32909a) * 65535) + this.f32910b;
    }
}
