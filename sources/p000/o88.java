package p000;

/* renamed from: o88 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class o88 {

    /* renamed from: a */
    public final Object f32298a;

    /* renamed from: b */
    public final Object f32299b;

    /* renamed from: c */
    public final Object f32300c;

    public o88(Object obj, Object obj2, Object obj3) {
        this.f32298a = obj;
        this.f32299b = obj2;
        this.f32300c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException mo46343a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f32298a + "=" + this.f32299b + " and " + this.f32298a + "=" + this.f32300c);
    }
}
