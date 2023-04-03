package p000;

/* renamed from: q69 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class q69 implements n79 {

    /* renamed from: a */
    public final n79[] f32956a;

    public q69(n79... n79Arr) {
        this.f32956a = n79Arr;
    }

    /* renamed from: a */
    public final l79 mo46027a(Class<?> cls) {
        String str;
        n79[] n79Arr = this.f32956a;
        for (int i = 0; i < 2; i++) {
            n79 n79 = n79Arr[i];
            if (n79.mo46028b(cls)) {
                return n79.mo46027a(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: b */
    public final boolean mo46028b(Class<?> cls) {
        n79[] n79Arr = this.f32956a;
        for (int i = 0; i < 2; i++) {
            if (n79Arr[i].mo46028b(cls)) {
                return true;
            }
        }
        return false;
    }
}
